/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.MainWindow;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author HugoFDZ
 */
public class ControladorMainWindow implements MouseListener {

    private MainWindow homeWindow;

    public ControladorMainWindow(MainWindow homeWindow) {
        this.homeWindow = homeWindow;
        inicializarEventos();

    }

    private void inicializarEventos() {
        ActionListener listenerComun = e -> manejarBoton(); // Acción compartida
        homeWindow.getBtnGastos().addActionListener(listenerComun);
        homeWindow.getBtnGestionarPlantilla().addActionListener(listenerComun);
        homeWindow.getBtnImprimir().addActionListener(listenerComun);
        homeWindow.getBtnJugarPartido().addActionListener(listenerComun);

        // Agregar el MouseListener solo al botón necesario
        homeWindow.getBtnGastos().addMouseListener(this);
        homeWindow.getBtnGestionarPlantilla().addMouseListener(this);
        homeWindow.getBtnImprimir().addMouseListener(this);
        homeWindow.getBtnJugarPartido().addMouseListener(this);

    }

    // Método que ejecuta la lógica compartida
    private void manejarBoton() {

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
