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
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HugoFDZ
 */
public class ControladorGestion extends ControladorGestorPersonas {
    
    
    
    
    public ControladorGestion(MainWindow mainWindow) {
        
        super(mainWindow);
        
        inicializarVariables();
        
        inicializarEventos();
        
    }
    
    private void inicializarVariables() {
        
        tablaGestion = mainWindow.getTablaGestionPersonas();


        //Le pongo los modelos de enumerados a los combobox
        mainWindow.getComboBoxTecnicoPuesto().setModel(new DefaultComboBoxModel<>(Puesto.values()));
        mainWindow.getComboBoxTecnicoEspecialidad().setModel(new DefaultComboBoxModel<>(Especialidad.values()));
        mainWindow.getComBoxDemarcacion().setModel(new DefaultComboBoxModel<>(Demarcacion.values()));

        //Boton de volver al Home
        mainWindow.getBtnHome().addActionListener(e -> cambiarEscena(CARD_HOME));
        
        
        
    }
    
    private void inicializarEventos() {
        
        mainWindow.getBtnDarDeAltaPersona().addActionListener(e -> cambiarEscena(CARD_DARDEALTA));
        
        mainWindow.getBtnEliminarPersona().addActionListener(e -> eliminarPersona(personaSeleccionada));

        
    }
    
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
