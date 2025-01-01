/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.MainWindow;

/**
 * Controlador para la pantalla principal (Home) de la aplicación.
 * <p>
 * Se encarga de controlar los botones que permiten navegar entre
 * las diferentes secciones o escenas de la aplicación: gestión
 * de la plantilla, partido, gastos e impresión.
 * </p>
 * 
 * <p><b>Autor:</b> HugoFDZ</p>
 */
public class ControladorHome extends ControladorEscenas {

    
    /**
     * Constructor que recibe la ventana principal y llama al constructor
     * de la superclase {@link ControladorEscenas}. Posteriormente,
     * inicializa los eventos asociados a la pantalla de inicio.
     *
     * @param mainWindow Instancia de la ventana principal de la aplicación.
     */
    public ControladorHome(MainWindow mainWindow) {
        
        super(mainWindow);

        inicializarEventos();
    }

    
    
    /**
     * Inicializa los eventos que cambian de escena al pulsar los botones
     * disponibles en la pantalla de inicio (Home).
     * <ul>
     *   <li><b>Gestionar plantilla:</b> Muestra la escena correspondiente a la gestión de personas.</li>
     *   <li><b>Jugar partido:</b> Permite acceder a la escena donde se juegan los partidos.</li>
     *   <li><b>Gastos:</b> Navega a la sección donde se gestionan los gastos y nóminas.</li>
     *   <li><b>Imprimir:</b> Dirige a la pantalla de impresión de listados.</li>
     * </ul>
     */
    private void inicializarEventos(){
        //Cambiadores de escena
        mainWindow.getBtnGestionarPlantilla().addActionListener(e -> cambiarEscena(CARD_GESTION));
        mainWindow.getBtnJugarPartido().addActionListener(e -> cambiarEscena(CARD_JUGAR_PARTIDO));
        mainWindow.getBtnGastos().addActionListener(e -> cambiarEscena(CARD_GASTOS));
        mainWindow.getBtnImprimir().addActionListener(e -> cambiarEscena(CARD_IMPRIMIR));
    }

}
