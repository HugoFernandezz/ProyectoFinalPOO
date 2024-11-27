/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Gestor;
import Vista.MainWindow;
import javax.swing.JOptionPane;

/**
 *
 * @author HugoFDZ
 */
public class ControladorJugarPartido extends ControladorEscenas {

    public ControladorJugarPartido(MainWindow mainWindow) {

        super(mainWindow);

        inicializarEventos();

    }

    private void inicializarEventos() {

        mainWindow.getBtnHomePartido().addActionListener(e -> cambiarEscena(CARD_HOME));
         //Boton de jugar partidos
        mainWindow.getBtnTerminarPartido().addActionListener(e -> intentarJugarPartido());

    }

    private void intentarJugarPartido() {

        if (mainWindow.getInputNombreRival().getText().contains("Inserte el nombre del equipo rival...")) {
            JOptionPane.showMessageDialog(null, "Debe ponerle un nombre al equipo rival");
        } else {
            jugarPartido();
        }

    }

    private void jugarPartido() {
        int local = (Integer) mainWindow.getLocalGolesSpinner().getValue();
        int visitante = (Integer) mainWindow.getVisitanteGolesSpinner().getValue();
        String rival = mainWindow.getInputNombreRival().getText();
        boolean islocal = true;
        if (mainWindow.getRadioBtnVisitante().isSelected()) {
            islocal = false;
        }

        Gestor.getInstancia().crearPartido(rival, islocal, local, visitante);
        if (islocal) {
            JOptionPane.showMessageDialog(null, "Partido contra " + rival + " ha terminado con un resultado de:"
                    + "\n Local: " + local + "\n Visitante: " + visitante);
        } else {
            JOptionPane.showMessageDialog(null, "Partido contra " + rival + " ha terminado con un resultado de:"
                    + "\n Local: " + visitante + "\n Visitante: " + local);
        }

    }

}
