/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Especialidad;
import Modelo.Gestor;
import Modelo.Nomina;
import Modelo.Persona;
import Modelo.Puesto;
import Vista.MainWindow;
import java.awt.CardLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HugoFDZ
 */
public class ControladorMainWindow implements MouseListener {

    private MainWindow mainWindow;

    private final String CARD_HOME = "homeWindow";
    private final String CARD_GESTION = "gestionWindow";
    private final String CARD_DARDEALTA = "darDeAltaWindow";

    private List<Nomina> listaPersonasSeleccionadas;
    private Persona personaSeleccionada;

    private int filaSeleccionada;
    JTable tablaGestion;

    public ControladorMainWindow(MainWindow homeWindow) {
        this.mainWindow = homeWindow;
        tablaGestion = mainWindow.getTablaGestionPersonas();

        //Inicializando correctamente los combobox del creador de personas
        mainWindow.getComboBoxTecnicoPuesto().setModel(new DefaultComboBoxModel<>(Puesto.values()));
        mainWindow.getComboBoxTecnicoPuesto().setSelectedIndex(-1);
        mainWindow.getComboBoxTecnicoEspecialidad().setModel(new DefaultComboBoxModel<>(Especialidad.values()));
        mainWindow.getComboBoxTecnicoEspecialidad().setSelectedIndex(-1);

        inicializarEventos();

    }

    private void inicializarEventos() {

        mainWindow.getBtnGestionarPlantilla().addActionListener(e -> cambiarEscena(CARD_GESTION));
        mainWindow.getBtnHome().addActionListener(e -> cambiarEscena(CARD_HOME));
        mainWindow.getBtnDarDeAltaPersona().addActionListener(e -> cambiarEscena(CARD_DARDEALTA));
        mainWindow.getBtnEliminarPersona().addActionListener(e -> eliminarPersona(personaSeleccionada));

        tablaGestion.getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> {
            if (!e.getValueIsAdjusting()) {
                filaSeleccionada = tablaGestion.getSelectedRow();

                if (filaSeleccionada != -1) {
                    System.out.println(filaSeleccionada + 1);

                    personaSeleccionada = Gestor.getInstancia().recuperarPersona(filaSeleccionada + 1);
                    System.out.println("Se ha recuperado a " + personaSeleccionada.getNombre());

                }
            }
        });

        // Agregar el MouseListener solo al botón necesario
        mainWindow.getBtnGastos().addMouseListener(this);
        mainWindow.getBtnGestionarPlantilla().addMouseListener(this);
        mainWindow.getBtnImprimir().addMouseListener(this);
        mainWindow.getBtnJugarPartido().addMouseListener(this);

    }

    // Método que ejecuta la lógica de cambiar entre escenas
    private void cambiarEscena(String destino) {
        CardLayout cardLayout = (CardLayout) mainWindow.getPanelRaiz().getLayout();
        cardLayout.show(mainWindow.getPanelRaiz(), destino);
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
