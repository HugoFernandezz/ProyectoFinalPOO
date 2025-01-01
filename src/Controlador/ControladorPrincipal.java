/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.MainWindow;

/**
 * Clase que centraliza la creación de la ventana principal {@link MainWindow}
 * y la inicialización de todos los demás controladores de la aplicación.
 * <p>
 * Su principal labor es instanciar la ventana principal y cada uno de los
 * controladores requeridos (imprimir, home, gestión, partidos, gastos, 
 * creación y modificación de personas), para luego mostrar la interfaz
 * al usuario.
 * </p>
 * 
 * <p><b>Autor:</b> HugoFDZ</p>
 */
public class ControladorPrincipal {

    private final MainWindow mainWindow;
    private final ControladorImprimir controladorImprimir;
    private final ControladorHome controladorHome;
    private final ControladorGestion controladorGestion;
    private final ControladorJugarPartido controladorPartidos;
    private final ControladorGastos controladorGastos;
    private final ControladorCrearPersona controladorCrearPersona;
    private final ControladorModificarPersona controladorModificarPersona;

    /**
     * Constructor por defecto. Se encarga de:
     * <ul>
     *   <li>Instanciar la {@link MainWindow}.</li>
     *   <li>Crear todos los controladores asociados a la aplicación.</li>
     *   <li>Configurar la ventana principal y mostrarla en pantalla.</li>
     * </ul>
     */
    public ControladorPrincipal() {
        // Instancia única de la ventana principal
        mainWindow = new MainWindow();

        // Inicializar controladores
        controladorImprimir = new ControladorImprimir(mainWindow);
        controladorHome = new ControladorHome(mainWindow);
        controladorGestion = new ControladorGestion(mainWindow);
        controladorPartidos = new ControladorJugarPartido(mainWindow);
        controladorGastos = new ControladorGastos(mainWindow);
        controladorCrearPersona = new ControladorCrearPersona(mainWindow);
        controladorModificarPersona = new ControladorModificarPersona(mainWindow);

        // Mostrar la ventana principal
        mainWindow.setVisible(true);
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setResizable(false);
                
    }

}
