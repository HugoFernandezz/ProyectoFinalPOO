/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.MainWindow;

/**
 *
 * @author HugoFDZ
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
    }

}
