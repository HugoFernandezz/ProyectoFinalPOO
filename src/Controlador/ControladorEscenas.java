/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Gestor;
import Modelo.Persona;
import Vista.MainWindow;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HugoFDZ
 */
public class ControladorEscenas {

    protected MainWindow mainWindow;

    public ControladorEscenas(MainWindow mainWindow) {
        if (mainWindow == null) {
            throw new IllegalArgumentException("MainWindow no puede ser null.");
        }
        this.mainWindow = mainWindow;
    }

    protected final String CARD_HOME = "homeWindow";
    protected final String CARD_GESTION = "gestionWindow";
    protected final String CARD_DARDEALTA = "darDeAltaWindow";
    protected final String CARD_MODIFICAR = "modificarPersonaWindow";
    protected final String CARD_JUGAR_PARTIDO = "jugarPartidoWindow";
    protected final String CARD_GASTOS = "gastosWindow";
    protected final String CARD_CREARNOMINA = "crearNominaWindow";
    protected final String CARD_FACTURA = "facturaWindow";
    protected final String CARD_MODIFICAR_CONCEPTO = "modificarConceptoWindow";
    protected final String CARD_MODIFICAR_NOMINA = "modificarNominaWindow";
    protected final String CARD_IMPRIMIR = "imprimirWindow";

    // Método que ejecuta la lógica de cambiar entre escenas
    protected void cambiarEscena(String destino) {
        CardLayout cardLayout = (CardLayout) mainWindow.getPanelRaiz().getLayout();
        cardLayout.show(mainWindow.getPanelRaiz(), destino);

    }

    //Devuelve true si hay algun campo vacio
    protected boolean comprobarCamposVacios(List<JTextField> campos) {
        boolean campoVacio = false;
        for (JTextField campo : campos) {
            if (campo.getText().contains("Inserte ")) {
                campoVacio = true;
                return campoVacio;
            }
        }

        return campoVacio;

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
