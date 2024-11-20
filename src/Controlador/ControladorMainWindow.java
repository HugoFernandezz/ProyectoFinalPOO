/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Demarcacion;
import Modelo.Especialidad;
import Modelo.Gestor;
import Modelo.Jugador;
import Modelo.Nomina;
import Modelo.Persona;
import Modelo.Puesto;
import Vista.MainWindow;
import java.awt.CardLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
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
        mainWindow.getComboBoxTecnicoEspecialidad().setModel(new DefaultComboBoxModel<>(Especialidad.values()));
        mainWindow.getComBoxDemarcacion().setModel(new DefaultComboBoxModel<>(Demarcacion.values()));

        inicializarEventos();

    }

    private void inicializarEventos() {

        //Cambiadores de escena
        mainWindow.getBtnGestionarPlantilla().addActionListener(e -> cambiarEscena(CARD_GESTION));
        mainWindow.getBtnHome().addActionListener(e -> cambiarEscena(CARD_HOME));
        mainWindow.getBtnDarDeAltaPersona().addActionListener(e -> cambiarEscena(CARD_DARDEALTA));
        mainWindow.getBtnDarDeAltaAtras().addActionListener(e -> cambiarEscena(CARD_GESTION));
        mainWindow.getBtnEliminarPersona().addActionListener(e -> eliminarPersona(personaSeleccionada));

        //Botones de crear Personas
        mainWindow.getBtnCrearJugador().addActionListener(e -> intentarCrearJugador());
        mainWindow.getBtnCrearTecnico().addActionListener(e -> crearTecnico());
        mainWindow.getBtnCrearDirectivo().addActionListener(e -> crearDirectivo());

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
        mainWindow.getToggleEstadoFisico().addMouseListener(this);

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

    private void intentarCrearJugador() {

        //Creo la lista de campos que tiene que rellenar
        List<JTextField> listaCampos = new ArrayList<>();
        listaCampos.add(mainWindow.getInputAltaJugadorNombre());
        listaCampos.add(mainWindow.getInputAltaJugadorApellido());
        listaCampos.add(mainWindow.getInputAltaJugadorTelefono());
        listaCampos.add(mainWindow.getInputAltaJugadorEdad());
        listaCampos.add(mainWindow.getInputAltaJugadorValor());
        listaCampos.add(mainWindow.getInputAltaJugadorDNI());

        if (!comprobarCamposVacios(listaCampos)) {
            crearJugador();
        } else {
            JOptionPane.showMessageDialog(null, "Error, parece que hubo algun problema al crear un jugador. \nAsegurese de que todos los campos estan rellenos.");
        }

    }

    private void crearTecnico() {

    }

    private void crearDirectivo() {

    }

    private void crearJugador() {

        String nombre = mainWindow.getInputAltaJugadorNombre().getText();
        String apellido = mainWindow.getInputAltaJugadorApellido().getText();
        int telefono = Integer.parseInt(mainWindow.getInputAltaJugadorTelefono().getText());
        int edad = Integer.parseInt(mainWindow.getInputAltaJugadorEdad().getText());
        int valorMercado = Integer.parseInt(mainWindow.getInputAltaJugadorValor().getText());
        String dni = mainWindow.getInputAltaJugadorDNI().getText();
        Demarcacion demarcacion = (Demarcacion) mainWindow.getComBoxDemarcacion().getSelectedItem();
        boolean estadoFisico = mainWindow.getToggleEstadoFisico().isSelected();

        Jugador jugador = new Jugador(nombre, apellido, telefono, demarcacion, edad, valorMercado, estadoFisico, dni);
        
        JOptionPane.showMessageDialog(null, "¡El jugador " + nombre + " se ha unido al club!");

        System.out.println("Se ha creado el jugador: " + nombre + " Apellido: " + apellido + " edad: " + edad + " tlf: " + telefono + " valorMercado: " + valorMercado + " dni: " + dni + " demarcacion: " + demarcacion.toString() + " ESta lesionado?: " + estadoFisico);
    }

    //Devuelve true si hay algun campo vacio
    private boolean comprobarCamposVacios(List<JTextField> campos) {
        boolean campoVacio = false;
        for (JTextField campo : campos) {
            if (campo.getText().contains("Inserte ")) {
                campoVacio = true;
                return campoVacio;
            }
        }

        return campoVacio;

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
