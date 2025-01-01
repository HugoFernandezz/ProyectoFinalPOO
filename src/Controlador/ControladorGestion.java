/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Demarcacion;
import Modelo.Especialidad;
import Modelo.Gestor;
import Modelo.Persona;
import Modelo.Puesto;
import Vista.MainWindow;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Controlador encargado de la gestión principal de personas en la aplicación,
 * como la eliminación o el alta de nuevos integrantes. Extiende de 
 * {@link ControladorGestorPersonas} para heredar las funcionalidades básicas.
 * <p>
 * En esta clase se inicializan los combo boxes con los enumerados correspondientes
 * y se gestionan los eventos para dar de alta o eliminar personas.
 * </p>
 * 
 * <p><b>Autor:</b> HugoFDZ</p>
 */
public class ControladorGestion extends ControladorGestorPersonas {
    
    /**
     * Constructor que recibe la ventana principal y llama al constructor 
     * de la superclase. Luego, inicializa variables y eventos.
     *
     * @param mainWindow Instancia de la ventana principal {@link MainWindow}.
     */
    public ControladorGestion(MainWindow mainWindow) {
        
        super(mainWindow);
        
        inicializarVariables();
        
        inicializarEventos();
        
    }
    
    /**
     * Inicializa y configura los componentes de la interfaz relacionados
     * con la gestión de personas. Configura los modelos de enumerados en
     * los distintos {@code JComboBox}.
     */
    private void inicializarVariables() {
        
        tablaGestion = mainWindow.getTablaGestionPersonas();


        //Le pongo los modelos de enumerados a los combobox
        mainWindow.getComboBoxTecnicoPuesto().setModel(new DefaultComboBoxModel<>(Puesto.values()));
        mainWindow.getComboBoxTecnicoEspecialidad().setModel(new DefaultComboBoxModel<>(Especialidad.values()));
        mainWindow.getComBoxDemarcacion().setModel(new DefaultComboBoxModel<>(Demarcacion.values()));

        //Boton de volver al Home
        mainWindow.getBtnHome().addActionListener(e -> cambiarEscena(CARD_HOME));
        
        
        
    }
    
    /**
     * Establece los eventos para la ventana de gestión de personas, incluyendo
     * la acción para dar de alta y para eliminar a la persona seleccionada.
     */
    private void inicializarEventos() {
        
        mainWindow.getBtnDarDeAltaPersona().addActionListener(e -> cambiarEscena(CARD_DARDEALTA));
        
        mainWindow.getBtnEliminarPersona().addActionListener(e -> eliminarPersona(personaSeleccionada));

        
    }
    
    /**
     * Elimina la persona seleccionada de la lista general de la aplicación.
     * Muestra un cuadro de confirmación para el usuario y, en caso afirmativo,
     * remueve la fila correspondiente del modelo de la tabla.
     *
     * @param persona La persona a eliminar. Si es {@code null}, no se realiza ninguna acción.
     */
    private void eliminarPersona(Persona persona) {
        Gestor.getInstancia().eliminarPersona(persona);
        DefaultTableModel model = (DefaultTableModel) tablaGestion.getModel();
        //POPUP
        int response = JOptionPane.showConfirmDialog(null, "Estas seguro de que lo quieres eliminar a " + persona.getNombre() + "?", "Confirmar el borrado", JOptionPane.YES_NO_OPTION);
        
        if (response == JOptionPane.YES_OPTION) {
            model.removeRow(filaSeleccionada);
            System.out.println(persona.getNombre() + " eliminada con exito");
        }
        
    }

}
