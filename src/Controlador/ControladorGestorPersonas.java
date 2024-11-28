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
 *
 * @author HugoFDZ
 * 
 * Esta clase no se llega a instanciar nunca, es simplemente una clase "auxiliar" para que los controladores gestion de personas puedan heredar de 
 * controladorEscena (tengan la capacidad de cambiar entre escenas) y que tambien tengan los metodos compartidos de las tablas que contienen a los
 * jugadores y toda su informacion
 * 
 */
public class ControladorGestorPersonas extends ControladorEscenas {
    
    protected JTable tablaGestion;

    public ControladorGestorPersonas(MainWindow mainWindow) {

        super(mainWindow);
        
        inicializarEventos();

    }
    
    private void inicializarEventos(){
    
        tablaGestion = mainWindow.getTablaGestionPersonas();
        
        //Listener de la tabla de personas de la ventana de gestion, me recupera la persona que se selecciona en la tabla
        tablaGestion.getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> {
            if (!e.getValueIsAdjusting()) {
                filaSeleccionada = tablaGestion.getSelectedRow();
                
                if (filaSeleccionada != -1) {
                    
                    personaSeleccionada = Gestor.getInstancia().recuperarPersona(filaSeleccionada + 1);
                    //Debug en consola
                    System.out.println("Se ha recuperado a " + personaSeleccionada.getNombre());
                    
                }
            }
        });
    
    }

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
