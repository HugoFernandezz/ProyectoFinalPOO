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
public class ControladorHome extends ControladorEscenas {

    public ControladorHome(MainWindow mainWindow) {
        
        super(mainWindow);

        inicializarEventos();
    }

    
    
    
    private void inicializarEventos(){
        //Cambiadores de escena
        mainWindow.getBtnGestionarPlantilla().addActionListener(e -> cambiarEscena(CARD_GESTION));
        mainWindow.getBtnJugarPartido().addActionListener(e -> cambiarEscena(CARD_JUGAR_PARTIDO));
        mainWindow.getBtnGastos().addActionListener(e -> cambiarEscena(CARD_GASTOS));
        mainWindow.getBtnImprimir().addActionListener(e -> cambiarEscena(CARD_IMPRIMIR));
    }

}
