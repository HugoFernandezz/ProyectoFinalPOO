/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Gestor;
import Modelo.Persona;
import Vista.MainWindow;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;

/**
 * Clase auxiliar para la gestión de personas en el club, heredando la 
 * funcionalidad de cambio de escenas de {@link ControladorEscenas}. <br><br>
 *
 * Esta clase no se instancia nunca de forma directa; en su lugar, los 
 * controladores específicos (por ejemplo, de gestión de personas) heredan 
 * de ella para aprovechar los métodos compartidos, como la actualización 
 * de la tabla que contiene a los jugadores y demás información.
 * 
 * <p><b>Autor:</b> HugoFDZ</p>
 */
public class ControladorGestorPersonas extends ControladorEscenas {
    
    /**
     * Tabla de gestión que muestra la información de las personas (jugadores,
     * técnicos, directivos) en la interfaz.
     */
    protected JTable tablaGestion;

    /**
     * Constructor que recibe la ventana principal y llama al constructor de
     * {@link ControladorEscenas} para heredar su comportamiento.
     * Posteriormente, se inicializan los eventos propios de la clase.
     *
     * @param mainWindow Instancia de la ventana principal de la aplicación.
     */
    public ControladorGestorPersonas(MainWindow mainWindow) {

        super(mainWindow);
        
        inicializarEventos();

    }
    
    /**
     * Inicializa los eventos relacionados con la tabla de gestión de personas.
     * <ul>
     *   <li>Asocia un {@link ListSelectionListener} que detecta la fila
     *       seleccionada en la tabla de gestión.</li>
     *   <li>Recupera la persona seleccionada desde el {@link Gestor} para
     *       almacenar la referencia en {@link #personaSeleccionada}.</li>
     * </ul>
     */
    private void inicializarEventos(){
    
        tablaGestion = mainWindow.getTablaGestionPersonas();
        
        //Listener de la tabla de personas de la ventana de gestion, me recupera la persona que se selecciona en la tabla
        tablaGestion.getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> {
            if (!e.getValueIsAdjusting()) {
                filaSeleccionada = tablaGestion.getSelectedRow();
                
                if (filaSeleccionada != -1) {
                    
                    personaSeleccionada = Gestor.getInstancia().recuperarPersona(filaSeleccionada + 1);
                    
                }
            }
        });
    
    }

    /**
     * Actualiza el modelo de la tabla de personas, vaciándolo primero y
     * rellenándolo con la información de cada persona dentro del club.
     * 
     * @param modelo Instancia de {@link DefaultTableModel} que se desea 
     *               actualizar con los datos de las personas.
     */
    protected void actualizarModeloTablaPersonas(DefaultTableModel modelo) {

        //Vacio el modelo
        modelo.setRowCount(0);

        //Y lo vuelvo a llenar
        for (Persona persona : Gestor.getInstancia().ListaPersonasDentroDelClub()) {
            modelo.addRow(new String[]{
                persona.getNombre(),
                persona.getApellido(),
                persona.getClass().getSimpleName(),
                persona.getDni()
            });
        }
    }

}
