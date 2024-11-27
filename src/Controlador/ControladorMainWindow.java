/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cliente;
import Modelo.Concepto;
import Modelo.Demarcacion;
import Modelo.Directivo;
import Modelo.Especialidad;
import Modelo.Factura;
import Modelo.Gestor;
import Modelo.Jugador;
import Modelo.Meses;
import Modelo.Nomina;
import Modelo.Persona;
import Modelo.Puesto;
import Modelo.Tecnico;
import Vista.MainWindow;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Event;
import java.awt.event.FocusEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
    private final String CARD_MODIFICAR = "modificarPersonaWindow";
    private final String CARD_JUGAR_PARTIDO = "jugarPartidoWindow";
    private final String CARD_GASTOS = "gastosWindow";
    private final String CARD_CREARNOMINA = "crearNominaWindow";
    private final String CARD_FACTURA = "facturaWindow";
    private final String CARD_MODIFICAR_CONCEPTO = "modificarConceptoWindow";
    private final String CARD_MODIFICAR_NOMINA = "modificarNominaWindow";
    private final String CARD_IMPRIMIR = "imprimirWindow";

    private Persona personaSeleccionada;
    private Concepto conceptoActual;

    private int filaSeleccionada;
    int[] filasSeleccionadasGastos;
    List<Persona> personasSeleccionadasGastos = new ArrayList<>();

    JTable tablaGestion;

    //Tabla para ver los conceptos de las nominas
    String[] columnasConceptos = {"Descripcion", "Importe", "Codigo"};
    DefaultTableModel modeloConceptos;

    public ControladorMainWindow(MainWindow homeWindow) {
        this.mainWindow = homeWindow;
        tablaGestion = mainWindow.getTablaGestionPersonas();

        inicializarEventos();

    }

    private void inicializarEventos() {

        mainWindow.getPanelModificarDirectivo().setName("ModificarDirectivo");
        mainWindow.getPanelModificarJugador().setName("ModificarJugador");
        mainWindow.getPanelModificarTecnico().setName("ModificarTecnico");
        mainWindow.getInputModificarJugadorDNI().setName("DNI");
        mainWindow.getInputModificarTecnicoDNI().setName("DNI");
        mainWindow.getInputModificarDirectivoDNI().setName("DNI");

        //Cambiadores de escena
        mainWindow.getBtnGestionarPlantilla().addActionListener(e -> cambiarEscena(CARD_GESTION));
        mainWindow.getBtnHome().addActionListener(e -> cambiarEscena(CARD_HOME));
        mainWindow.getBtnDarDeAltaPersona().addActionListener(e -> cambiarEscena(CARD_DARDEALTA));
        mainWindow.getBtnDarDeAltaAtras().addActionListener(e -> cambiarEscena(CARD_GESTION));
        mainWindow.getBtnEliminarPersona().addActionListener(e -> eliminarPersona(personaSeleccionada));
        mainWindow.getBtnModificarDatos().addActionListener(e -> cambiarEscenaModificacion(tablaGestion));
        mainWindow.getBtnDarDeAltaAtrasModificar().addActionListener(e -> {
            cambiarEscena(CARD_GESTION);  // Cambia a la escena de gestión
            limpiarDatosPersona();        // Limpia los datos de la persona
        });
        mainWindow.getBtnJugarPartido().addActionListener(e -> cambiarEscena(CARD_JUGAR_PARTIDO));
        mainWindow.getBtnHomePartido().addActionListener(e -> cambiarEscena(CARD_HOME));
        mainWindow.getBtnGastos().addActionListener(e -> cambiarEscena(CARD_GASTOS));
        mainWindow.getBtnHomeGastos().addActionListener(e -> cambiarEscena(CARD_HOME));
        mainWindow.getBtnCrearNomina().addActionListener(e -> cambiarEscenaNomina());
        mainWindow.getBtnCrearFactura().addActionListener(e -> cambiarEscena(CARD_FACTURA));
        mainWindow.getBtnModificarConceptoNomina().addActionListener(e -> cambiarEscenaModificarConcepto());
        mainWindow.getBtnHomeModificarConceptos().addActionListener(e -> cambiarEscena(CARD_GASTOS));
        mainWindow.getBtnHomeCrearFactura().addActionListener(e -> cambiarEscena(CARD_GASTOS));
        mainWindow.getBtnHomeCrearNomina().addActionListener(e -> cambiarEscena(CARD_GASTOS));
        mainWindow.getBtnHomeModificarNomina().addActionListener(e -> cambiarEscena(CARD_GASTOS));
        mainWindow.getBtnImprimir().addActionListener(e -> cambiarEscena(CARD_IMPRIMIR));
        mainWindow.getBtnHomeImprimir().addActionListener(e -> cambiarEscena(CARD_HOME));

        //Inicializando correctamente los combobox
        mainWindow.getComboBoxTecnicoPuesto().setModel(new DefaultComboBoxModel<>(Puesto.values()));
        mainWindow.getComboBoxTecnicoEspecialidad().setModel(new DefaultComboBoxModel<>(Especialidad.values()));
        mainWindow.getComBoxDemarcacion().setModel(new DefaultComboBoxModel<>(Demarcacion.values()));
        mainWindow.getComboBoxModificarTecnicoPuesto().setModel(new DefaultComboBoxModel<>(Puesto.values()));
        mainWindow.getComboBoxModificarTecnicoEspecialidad().setModel(new DefaultComboBoxModel<>(Especialidad.values()));
        mainWindow.getComBoxModificarDemarcacion().setModel(new DefaultComboBoxModel<>(Demarcacion.values()));
        mainWindow.getComBoxMesNomina().setModel(new DefaultComboBoxModel<>(Meses.values()));

        //Botones de crear Personas
        mainWindow.getBtnCrearJugador().addActionListener(e -> intentarCrearJugador());
        mainWindow.getBtnCrearTecnico().addActionListener(e -> intentarCrearTecnico());
        mainWindow.getBtnCrearDirectivo().addActionListener(e -> intentarCrearDirectivo());

        //Botones de modificar Personas
        mainWindow.getBtnModificarJugador().addActionListener(e -> modificarJugador());
        mainWindow.getBtnModificarTécnico().addActionListener(e -> modificarTecnico());
        mainWindow.getBtnModificarDirectivo().addActionListener(e -> modificarDirectivo());

        //Boton de jugar partidos
        mainWindow.getBtnTerminarPartido().addActionListener(e -> intentarJugarPartido());

        //Botones de Gastos
        mainWindow.getBtnCrearNominaFinal().addActionListener(e -> intentarCrearNomina());
        mainWindow.getCrearFacturaFinal().addActionListener(e -> intentarCrearFactura());

        //Botones de Conceptos
        mainWindow.getBtnModificarConcepto().addActionListener(e -> recuperarConcepto(mainWindow.getTablaConceptosNomina()));
        mainWindow.getBtnEliminarConcepto().addActionListener(e -> eliminarConcepto());

        //Botones de modificar Nomina
        mainWindow.getBtnModificarNominaFinal().addActionListener(e -> intentarModificarConcepto(conceptoActual));

        //Listener de la tabla de personas de la ventana de gestion
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

        //Listener de la tabla de personas de la ventana de gastos
        mainWindow.getTablaGastosPersonas().getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> {
            if (!e.getValueIsAdjusting()) {
                filasSeleccionadasGastos = mainWindow.getTablaGastosPersonas().getSelectedRows();

                if (filaSeleccionada != -1) {
                    personasSeleccionadasGastos = recuperarPersonas(mainWindow.getTablaGastosPersonas());

                }
            }
        });

        // Agregar el MouseListener solo al botón necesario
        mainWindow.getBtnGastos().addMouseListener(this);
        mainWindow.getBtnGestionarPlantilla().addMouseListener(this);
        mainWindow.getBtnImprimir().addMouseListener(this);
        mainWindow.getBtnJugarPartido().addMouseListener(this);
        mainWindow.getToggleEstadoFisico().addMouseListener(this);

        modeloConceptos = new DefaultTableModel(columnasConceptos, 0) {
            //Le sobreescribo el metodo para que el usuario no pueda editar las celdas de las tablas
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Desactiva la edición de celdas
            }
        };

    }

    // Método que ejecuta la lógica de cambiar entre escenas
    private void cambiarEscena(String destino) {
        CardLayout cardLayout = (CardLayout) mainWindow.getPanelRaiz().getLayout();
        cardLayout.show(mainWindow.getPanelRaiz(), destino);

    }

    //Método para cambiar a la escena de modificar jugador (Requiere seleccionar un jugador)
    private void cambiarEscenaModificacion(JTable tabla) {
        if (isPersonaSeleccionada(tabla)) {

            Persona personaAModificar = recuperarPersona(tabla);
            cambiarEscena(obtenerPanelModificacionDestino(personaAModificar));

            System.out.println(personaAModificar.getClass().getSimpleName());
            LimitarDatosModificacion(personaAModificar);
            rellenarDatos(personaAModificar);

        } else {
            System.out.println("no hay ninguna persona seleccionada");
        }
    }

    //Método para cambiar a la escena de modificar jugador (Requiere seleccionar un jugador)
    private void cambiarEscenaNomina() {
        if (personasSeleccionadasGastos.size() > 0) {

            cambiarEscena(CARD_CREARNOMINA);

        } else {
            JOptionPane.showMessageDialog(null, "Deberas seleccionar a una o varias personas a las que quieras crear una nómina");
        }
    }

    private void cambiarEscenaModificarConcepto() {

        if (personasSeleccionadasGastos.size() == 1) {

            if (personasSeleccionadasGastos.get(0).getNomina() == null) {
                JOptionPane.showMessageDialog(null, "Parece que " + personasSeleccionadasGastos.get(0).getNombre() + " todavía no tiene ninguna nómina creada. ¿Por qué no pruebas a creale una?");
            } else {

                String nombre = personasSeleccionadasGastos.get(0).getNombre();
                cambiarEscena(CARD_MODIFICAR_CONCEPTO);
                mainWindow.getTituloModificarConceptos().setText("Nomina de " + nombre);
                rellenarModeloTablaConceptos();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Deberas seleccionar a una sola persona a la que quieras modificar conceptos de su nomina");
        }
    }

    private String obtenerPanelModificacionDestino(Persona persona) {

        if (persona.getClass().getSimpleName().contains("Jugador")) {
            mainWindow.getTabbedModificar().setSelectedIndex(0);
        } else if (persona.getClass().getSimpleName().contains("Tecnico")) {
            mainWindow.getTabbedModificar().setSelectedIndex(1);
        } else if (persona.getClass().getSimpleName().contains("Directivo")) {
            mainWindow.getTabbedModificar().setSelectedIndex(2);
        }

        return CARD_MODIFICAR;
    }

    private boolean isPersonaSeleccionada(JTable tabla) {
        if (tabla.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "¡Debes seleccionar a la persona que quieres modificar!");
            return false;
        }
        return true;
    }

    private Persona recuperarPersona(JTable tabla) {
        filaSeleccionada = tabla.getSelectedRow();
        System.out.println("Se devolvio a " + Gestor.getInstancia().recuperarPersona(filaSeleccionada + 1).getNombre());
        return Gestor.getInstancia().recuperarPersona(filaSeleccionada + 1);

    }

    private List<Persona> recuperarPersonas(JTable tabla) {
        filasSeleccionadasGastos = tabla.getSelectedRows();
        List<Persona> personasSeleccionadasGastos = new ArrayList<>();
        for (int i = 0; i < filasSeleccionadasGastos.length; i++) {
            personasSeleccionadasGastos.add(Gestor.getInstancia().recuperarPersona(filasSeleccionadasGastos[i] + 1));
            System.out.println("Se devolvio a " + Gestor.getInstancia().recuperarPersona(filasSeleccionadasGastos[i] + 1).getNombre());
        }

        return personasSeleccionadasGastos;

    }

    private void limpiarDatosPersona() {
        //Habilita todos los campos
        for (JTextField campo : mainWindow.getCamposModificarInputs()) {

            if (!campo.getText().contains("DNI")) {
                campo.setEnabled(true);
            }

        }

        for (JButton boton : mainWindow.getBotonesModificar()) {
            boton.setEnabled(true);
        }

        for (JComboBox<? extends Enum<?>> jComboBox : mainWindow.getListaComboBoxModificar()) {
            jComboBox.setEnabled(true);
        }
    }

    private void LimitarDatosModificacion(Persona persona) {
        //Inhabilita todos los campos que no sean del tipo de persona seleccionado
        for (JTextField campo : mainWindow.getCamposModificarInputs()) {
            if (!campo.getParent().getName().contains(persona.getClass().getSimpleName())) {
                campo.setText("No debe rellenar este campo");
                campo.setEnabled(false);

            }

        }

        for (JButton boton : mainWindow.getBotonesModificar()) {
            if (!boton.getParent().getName().contains(persona.getClass().getSimpleName())) {
                boton.setEnabled(false);
            }

        }

        for (JComboBox<? extends Enum<?>> jComboBox : mainWindow.getListaComboBoxModificar()) {
            if (!jComboBox.getParent().getName().contains(persona.getClass().getSimpleName())) {
                jComboBox.setEnabled(false);
            }

        }

    }

    private void rellenarDatos(Persona persona) {

        if (persona instanceof Jugador) {
            Jugador j = (Jugador) persona;
            rellenarDatoJugador(j);
        }

        if (persona instanceof Tecnico) {
            Tecnico t = (Tecnico) persona;
            rellenarDatoTecnico(t);
        }

        if (persona instanceof Directivo) {
            Directivo d = (Directivo) persona;
            rellenarDatoDirectivo(d);
        }

    }

    private void rellenarDatoJugador(Jugador jugador) {
        mainWindow.getInputModificarJugadorApellido().setText(jugador.getApellido());
        mainWindow.getInputModificarJugadorApellido().setForeground(Color.WHITE);
        mainWindow.getInputModificarJugadorDNI().setText(jugador.getDni());
        mainWindow.getInputModificarJugadorDNI().setForeground(Color.WHITE);
        mainWindow.getInputModificarJugadorEdad().setText(String.valueOf(jugador.getEdad()));
        mainWindow.getInputModificarJugadorEdad().setForeground(Color.WHITE);
        mainWindow.getInputModificarJugadorNombre().setText(jugador.getNombre());
        mainWindow.getInputModificarJugadorNombre().setForeground(Color.WHITE);
        mainWindow.getInputModificarJugadorTelefono().setText(String.valueOf(jugador.getTelefono()));
        mainWindow.getInputModificarJugadorTelefono().setForeground(Color.WHITE);
        mainWindow.getInputModificarJugadorValor().setText(String.valueOf(jugador.getValorMercado()));
        mainWindow.getInputModificarJugadorValor().setForeground(Color.WHITE);
        mainWindow.getComBoxModificarDemarcacion().setSelectedItem(jugador.getDemarcacion());
    }

    private void rellenarDatoTecnico(Tecnico tecnico) {
        mainWindow.getInputModificarTecnicoApellido().setText(tecnico.getApellido());
        mainWindow.getInputModificarTecnicoApellido().setForeground(Color.WHITE);
        mainWindow.getInputModificarTecnicoDNI().setText(tecnico.getDni());
        mainWindow.getInputModificarTecnicoDNI().setForeground(Color.WHITE);
        mainWindow.getInputModificarTecnicoNombre().setText(tecnico.getNombre());
        mainWindow.getInputModificarTecnicoNombre().setForeground(Color.WHITE);
        mainWindow.getInputModificarTecnicoTelefono().setText(String.valueOf(tecnico.getTelefono()));
        mainWindow.getInputModificarTecnicoTelefono().setForeground(Color.WHITE);
        mainWindow.getComboBoxModificarTecnicoPuesto().setSelectedItem(tecnico.getPuesto());
        mainWindow.getComboBoxModificarTecnicoEspecialidad().setSelectedItem(tecnico.getEspecialidad());

    }

    private void rellenarDatoDirectivo(Directivo directivo) {
        mainWindow.getInputModificarDirectivoApellido().setText(directivo.getApellido());
        mainWindow.getInputModificarDirectivoApellido().setForeground(Color.WHITE);
        mainWindow.getInputModificarDirectivoCargo().setText(directivo.getCargo());
        mainWindow.getInputModificarDirectivoCargo().setForeground(Color.WHITE);
        mainWindow.getInputModificarDirectivoDNI().setText(directivo.getDni());
        mainWindow.getInputModificarDirectivoDNI().setForeground(Color.WHITE);
        mainWindow.getInputModificarDirectivoNombre().setText(directivo.getNombre());
        mainWindow.getInputModificarDirectivoNombre().setForeground(Color.WHITE);
        mainWindow.getInputModificarDirectivoTelefono().setText(String.valueOf(directivo.getTelefono()));
        mainWindow.getInputModificarDirectivoTelefono().setForeground(Color.WHITE);

    }

    private void modificarJugador() {

        String dni = mainWindow.getInputModificarJugadorDNI().getText();
        //Recupero que persona es con el DNI
        Jugador jugador = (Jugador) Gestor.getInstancia().recuperarPersonaDNI(dni);

        String apellido = mainWindow.getInputModificarJugadorApellido().getText();

        String nombre = mainWindow.getInputModificarJugadorNombre().getText();

        int tlf = Integer.parseInt(mainWindow.getInputModificarJugadorTelefono().getText());

        int valor = Integer.parseInt(mainWindow.getInputModificarJugadorValor().getText());

        Demarcacion demarcacion = (Demarcacion) mainWindow.getComBoxModificarDemarcacion().getSelectedItem();

        jugador.setApellido(apellido);
        jugador.setNombre(nombre);
        jugador.setTelefono(tlf);
        jugador.setValorMercado(valor);
        jugador.setDemarcacion(demarcacion);

        actualizarModeloTablaPersonas(mainWindow.getModeloPersonas());
        JOptionPane.showMessageDialog(null, "¡Los datos se han actualizado correctamente!");
        limpiarDatosPersona();
        cambiarEscena(CARD_GESTION);

    }

    private void modificarTecnico() {

        String dni = mainWindow.getInputModificarTecnicoDNI().getText();
        //Recupero que persona es con el DNI
        Tecnico tecnico = (Tecnico) Gestor.getInstancia().recuperarPersonaDNI(dni);

        String apellido = mainWindow.getInputModificarTecnicoApellido().getText();

        String nombre = mainWindow.getInputModificarTecnicoNombre().getText();

        int tlf = Integer.parseInt(mainWindow.getInputModificarTecnicoTelefono().getText());

        Especialidad especialidad = (Especialidad) mainWindow.getComboBoxModificarTecnicoEspecialidad().getSelectedItem();

        Puesto demarcacion = (Puesto) mainWindow.getComboBoxModificarTecnicoPuesto().getSelectedItem();

        tecnico.setApellido(apellido);
        tecnico.setNombre(nombre);
        tecnico.setTelefono(tlf);
        tecnico.setEspecialidad(especialidad);
        tecnico.setEspecialidad(especialidad);

        actualizarModeloTablaPersonas(mainWindow.getModeloPersonas());
        JOptionPane.showMessageDialog(null, "¡Los datos se han actualizado correctamente!");
        limpiarDatosPersona();
        cambiarEscena(CARD_GESTION);

    }

    private void modificarDirectivo() {

        String dni = mainWindow.getInputModificarDirectivoDNI().getText();
        //Recupero que persona es con el DNI
        Directivo directivo = (Directivo) Gestor.getInstancia().recuperarPersonaDNI(dni);

        String apellido = mainWindow.getInputModificarDirectivoApellido().getText();

        String nombre = mainWindow.getInputModificarDirectivoNombre().getText();

        int tlf = Integer.parseInt(mainWindow.getInputModificarDirectivoTelefono().getText());

        String cargo = mainWindow.getInputModificarDirectivoCargo().getText();

        directivo.setApellido(apellido);
        directivo.setNombre(nombre);
        directivo.setTelefono(tlf);
        directivo.setCargo(cargo);

        actualizarModeloTablaPersonas(mainWindow.getModeloPersonas());
        JOptionPane.showMessageDialog(null, "¡Los datos se han actualizado correctamente!");
        limpiarDatosPersona();
        cambiarEscena(CARD_GESTION);

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

    private void actualizarModeloTablaPersonas(DefaultTableModel modelo) {

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

    private void crearTecnico() {
        String nombre = mainWindow.getInputAltaTecnicoNombre().getText();
        String apellido = mainWindow.getInputAltaTecnicoApellido().getText();
        int telefono = Integer.parseInt(mainWindow.getInputAltaTecnicoTelefono().getText());
        String dni = mainWindow.getInputAltaTecnicoDNI().getText();
        Puesto puesto = (Puesto) mainWindow.getComboBoxTecnicoPuesto().getSelectedItem();
        Especialidad especialidad = (Especialidad) mainWindow.getComboBoxTecnicoEspecialidad().getSelectedItem();

        Tecnico tecnico = new Tecnico(nombre, apellido, telefono, puesto, especialidad, dni);

        actualizarModeloTablaPersonas(mainWindow.getModeloPersonas());

        JOptionPane.showMessageDialog(null, "¡El técnico " + nombre + " se ha unido al club!");
    }

    private void intentarCrearTecnico() {

        //Creo la lista de campos que tiene que rellenar
        List<JTextField> listaCampos = new ArrayList<>();
        listaCampos.add(mainWindow.getInputAltaTecnicoNombre());
        listaCampos.add(mainWindow.getInputAltaTecnicoApellido());
        listaCampos.add(mainWindow.getInputAltaTecnicoTelefono());
        listaCampos.add(mainWindow.getInputAltaTecnicoDNI());

        if (!comprobarCamposVacios(listaCampos)) {
            crearTecnico();
        } else {
            JOptionPane.showMessageDialog(null, "Error, parece que hubo algun problema al crear un técnico. \nAsegurese de que todos los campos estan rellenos.");
        }

    }

    private void crearDirectivo() {
        String nombre = mainWindow.getInputAltaDirectivoNombre().getText();
        String apellido = mainWindow.getInputAltaDirectivoApellido().getText();
        int telefono = Integer.parseInt(mainWindow.getInputAltaDirectivoTelefono().getText());
        String dni = mainWindow.getInputAltaDirectivoDNI().getText();
        String cargo = mainWindow.getInputAltaDirectivoCargo().getText();

        Directivo directivo = new Directivo(nombre, apellido, dni, telefono, cargo);

        actualizarModeloTablaPersonas(mainWindow.getModeloPersonas());

        JOptionPane.showMessageDialog(null, "¡El directivo " + nombre + " se ha unido al club!");
    }

    private void intentarCrearDirectivo() {

        //Creo la lista de campos que tiene que rellenar
        List<JTextField> listaCampos = new ArrayList<>();
        listaCampos.add(mainWindow.getInputAltaDirectivoNombre());
        listaCampos.add(mainWindow.getInputAltaDirectivoApellido());
        listaCampos.add(mainWindow.getInputAltaDirectivoTelefono());
        listaCampos.add(mainWindow.getInputAltaDirectivoDNI());

        if (!comprobarCamposVacios(listaCampos)) {
            crearDirectivo();
        } else {
            JOptionPane.showMessageDialog(null, "Error, parece que hubo algun problema al crear un directivo. \nAsegurese de que todos los campos estan rellenos.");
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

        actualizarModeloTablaPersonas(mainWindow.getModeloPersonas());

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

    private void intentarCrearNomina() {

        //Creo la lista de campos que tiene que rellenar
        List<JTextField> listaCampos = new ArrayList<>();
        listaCampos.add(mainWindow.getInputCrearNominaImporte());
        listaCampos.add(mainWindow.getInputCrearNominaDescripcion());
        listaCampos.add(mainWindow.getInputCrearNominaID());
        listaCampos.add(mainWindow.getInputCrearNominaAno());

        if (!comprobarCamposVacios(listaCampos)) {
            crearNomina(personasSeleccionadasGastos);
        } else {
            JOptionPane.showMessageDialog(null, "Error, parece que hubo algun problema al crear una nómina. \nAsegurese de que todos los campos estan rellenos.");
        }

    }

    private void crearNomina(List<Persona> personasSeleccionadasGastos) {

        int importe = Integer.parseInt(mainWindow.getInputCrearNominaImporte().getText());
        String descripcion = mainWindow.getInputCrearNominaDescripcion().getText();
        String id = mainWindow.getInputCrearNominaID().getText();
        int ano = Integer.parseInt(mainWindow.getInputCrearNominaAno().getText());
        Meses mes = (Meses) mainWindow.getComBoxMesNomina().getSelectedItem();

        //Para mostrar los nombres al final en el JOptionPane (Pop-up)
        StringBuilder nombres = new StringBuilder();

        for (Persona p : personasSeleccionadasGastos) {

            Concepto concepto = new Concepto(id, descripcion, importe);

            if (p.getNomina() == null) {

                new Nomina(mes, ano, concepto, p);

            } else {

                p.getNomina().setConcepto(concepto);

            }

            System.out.println("Nomina creada a: " + p.getNombre());
            nombres.append("- ").append(p.getNombre()).append("\n");
        }

        JOptionPane.showMessageDialog(null, "Nomina creada con éxito.\n"
                + "Nóminas actualizadas:\n"
                + nombres);

        cambiarEscena(CARD_GASTOS);

        limpiarCampos(mainWindow.getcamposCrearNomina());

    }

    private void intentarCrearFactura() {

        //Creo la lista de campos que tiene que rellenar
        List<JTextField> listaCampos = new ArrayList<>();
        listaCampos.add(mainWindow.getInputCrearFacturaCIF());
        listaCampos.add(mainWindow.getInputCrearFacturaCantidad());
        listaCampos.add(mainWindow.getInputCrearFacturaID());
        listaCampos.add(mainWindow.getInputCrearFacturaNombre());

        if (!comprobarCamposVacios(listaCampos)) {
            crearFactura();
        } else {
            JOptionPane.showMessageDialog(null, "Error, parece que hubo algun problema al crear una factura. \nAsegurese de que todos los campos estan rellenos.");
        }

    }

    private void crearFactura() {

        String CIF = mainWindow.getInputCrearFacturaCIF().getText();
        String ID = mainWindow.getInputCrearFacturaID().getText();
        String nombre = mainWindow.getInputCrearFacturaNombre().getText();
        float cantidad = Float.valueOf(mainWindow.getInputCrearFacturaCantidad().getText());
        String fecha = mainWindow.getInputCrearFacturaFecha().getText();

        Cliente cliente = new Cliente(CIF, nombre);
        Factura factura = new Factura(ID, cantidad, fecha, cliente);

        JOptionPane.showMessageDialog(null, "¡Factura creada con éxito!");

        cambiarEscena(CARD_GASTOS);

    }

    private void rellenarModeloTablaConceptos() {
        //Vacio el modelo
        modeloConceptos.setRowCount(0);

        Persona p = personasSeleccionadasGastos.get(0);

        //Y lo vuelvo a llenar
        List<Concepto> listaConceptos = new ArrayList<>();
        listaConceptos.addAll(p.getNomina().getConceptos());

        //Relleno el modeloConceptos con las los conceptos de la nomina de la persona que se le pasa por parametro
        for (Concepto concepto : listaConceptos) {
            modeloConceptos.addRow(new String[]{concepto.getDescripcion(), String.valueOf(concepto.getImporte()), concepto.getCodigo()});
        }

        mainWindow.getTablaConceptosNomina().setModel(modeloConceptos);

    }

    private void recuperarConcepto(JTable tabla) {
        filaSeleccionada = tabla.getSelectedRow();
        System.out.println("Se devolvio el concepto con id: " + Gestor.getInstancia().recuperarConceptoPorIndice(filaSeleccionada, personasSeleccionadasGastos.get(0)).getCodigo());
        conceptoActual = Gestor.getInstancia().recuperarConceptoPorIndice(filaSeleccionada, personasSeleccionadasGastos.get(0));
        cambiarEscenaDatosRellenosConcepto(conceptoActual);

    }

    private void cambiarEscenaDatosRellenosConcepto(Concepto concepto) {

        cambiarEscena(CARD_MODIFICAR_NOMINA);

        mainWindow.getInputModificarNominaID().setText(concepto.getCodigo());
        mainWindow.getInputModificarNominaID().setForeground(Color.WHITE);
        mainWindow.getInputModificarNominaDescripcion().setText(concepto.getDescripcion());
        mainWindow.getInputModificarNominaDescripcion().setForeground(Color.WHITE);
        mainWindow.getInputModificarNominaImporte().setText(String.valueOf(concepto.getImporte()));
        mainWindow.getInputModificarNominaImporte().setForeground(Color.WHITE);

        mainWindow.getInputCrearNominaAno().setEnabled(false);
        mainWindow.getComBoxMesNomina().setEnabled(false);

    }

    private void eliminarConcepto() {
        filaSeleccionada = mainWindow.getTablaConceptosNomina().getSelectedRow();
        String ID = mainWindow.getTablaConceptosNomina().getModel().getValueAt(filaSeleccionada, 2).toString();
        System.out.println(ID);
        Gestor.getInstancia().removeConceptoPorID(ID, personasSeleccionadasGastos.get(0));
        JOptionPane.showMessageDialog(null, "¡Concepto con id: " + ID + " eliminada con éxito!");
        rellenarModeloTablaConceptos();
    }

    private void limpiarCampos(List<JTextField> campos) {

        for (JTextField campo : campos) {

            campo.setText("");

        }

    }

    private void intentarModificarConcepto(Concepto concepto) {

        //Creo la lista de campos que tiene que rellenar
        List<JTextField> listaCampos = new ArrayList<>();
        listaCampos.add(mainWindow.getInputModificarNominaDescripcion());
        listaCampos.add(mainWindow.getInputModificarNominaID());
        listaCampos.add(mainWindow.getInputModificarNominaImporte());

        if (!comprobarCamposVacios(listaCampos)) {
            modificarConcepto(concepto);
        } else {
            JOptionPane.showMessageDialog(null, "Error, parece que hubo algun problema al crear modificar el concepto. \nAsegurese de que todos los campos estan rellenos.");
        }

    }

    private void modificarConcepto(Concepto concepto) {

        concepto.setCodigo(mainWindow.getInputModificarNominaID().getText());
        concepto.setDescripcion(mainWindow.getInputModificarNominaDescripcion().getText());
        concepto.setImporte(Integer.parseInt(mainWindow.getInputModificarNominaImporte().getText()));

        JOptionPane.showMessageDialog(null, "¡Concepto con id: " + concepto.getCodigo() + " modificada con éxito!");

        rellenarModeloTablaConceptos();
        
        cambiarEscena(CARD_MODIFICAR_CONCEPTO);

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
