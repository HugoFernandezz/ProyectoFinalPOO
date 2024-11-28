/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Demarcacion;
import Modelo.Directivo;
import Modelo.Especialidad;
import Modelo.Gestor;
import Modelo.Jugador;
import Modelo.Persona;
import Modelo.Puesto;
import Modelo.Tecnico;
import Vista.MainWindow;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author HugoFDZ
 */
public class ControladorModificarPersona extends ControladorGestorPersonas {

    public ControladorModificarPersona(MainWindow mainWindow) {

        super(mainWindow);
        
        inicializarVariables();

        inicializarEventos();
    }
    
    private void inicializarVariables(){
    
        //"Tags"
        mainWindow.getPanelModificarDirectivo().setName("ModificarDirectivo");
        mainWindow.getPanelModificarJugador().setName("ModificarJugador");
        mainWindow.getPanelModificarTecnico().setName("ModificarTecnico");
        mainWindow.getInputModificarJugadorDNI().setName("DNI");
        mainWindow.getInputModificarTecnicoDNI().setName("DNI");
        mainWindow.getInputModificarDirectivoDNI().setName("DNI");
    
    }

    private void inicializarEventos() {

        //Botones de modificar Personas
        mainWindow.getBtnModificarJugador().addActionListener(e -> modificarJugador());
        mainWindow.getBtnModificarTécnico().addActionListener(e -> modificarTecnico());
        mainWindow.getBtnModificarDirectivo().addActionListener(e -> modificarDirectivo());

        //Relleno los comboBox
        mainWindow.getComboBoxModificarTecnicoPuesto().setModel(new DefaultComboBoxModel<>(Puesto.values()));
        mainWindow.getComboBoxModificarTecnicoEspecialidad().setModel(new DefaultComboBoxModel<>(Especialidad.values()));
        mainWindow.getComBoxModificarDemarcacion().setModel(new DefaultComboBoxModel<>(Demarcacion.values()));

        mainWindow.getBtnDarDeAltaAtrasModificar().addActionListener(e -> {
            cambiarEscena(CARD_GESTION);  // Cambia a la escena de gestión
            limpiarDatosPersona();        // Limpia (habilita) los datos de la persona
        });
        
        mainWindow.getBtnModificarDatos().addActionListener(e -> cambiarEscenaModificacion(tablaGestion));

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

        Puesto puesto = (Puesto) mainWindow.getComboBoxModificarTecnicoPuesto().getSelectedItem();

        tecnico.setApellido(apellido);
        tecnico.setNombre(nombre);
        tecnico.setTelefono(tlf);
        tecnico.setEspecialidad(especialidad);
        tecnico.setPuesto(puesto);

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

    //Método para cambiar a la escena de modificar jugador (Requiere seleccionar un jugador)
    private void cambiarEscenaModificacion(JTable tabla) {
        if (isPersonaSeleccionada(tabla)) {

            Persona personaAModificar = recuperarPersonaDeTabla(tabla);
            cambiarEscena(obtenerPanelModificacionDestino(personaAModificar));

            System.out.println(personaAModificar.getClass().getSimpleName());
            LimitarDatosModificacion(personaAModificar);
            rellenarDatos(personaAModificar);

        } else {
            System.out.println("no hay ninguna persona seleccionada");
        }
    }
    
    private boolean isPersonaSeleccionada(JTable tabla) {
        if (tabla.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "¡Debes seleccionar a la persona que quieres modificar!");
            return false;
        }
        return true;
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
        mainWindow.getInputModificarJugadorDNI().setEnabled(false);
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
        mainWindow.getInputModificarTecnicoDNI().setEnabled(false);
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
        mainWindow.getInputModificarDirectivoDNI().setEnabled(false);
        mainWindow.getInputModificarDirectivoDNI().setForeground(Color.WHITE);
        mainWindow.getInputModificarDirectivoNombre().setText(directivo.getNombre());
        mainWindow.getInputModificarDirectivoNombre().setForeground(Color.WHITE);
        mainWindow.getInputModificarDirectivoTelefono().setText(String.valueOf(directivo.getTelefono()));
        mainWindow.getInputModificarDirectivoTelefono().setForeground(Color.WHITE);

    }
    
    private Persona recuperarPersonaDeTabla(JTable tabla) {
        filaSeleccionada = tabla.getSelectedRow();
        System.out.println("Se devolvio a " + Gestor.getInstancia().recuperarPersona(filaSeleccionada + 1).getNombre());
        return Gestor.getInstancia().recuperarPersona(filaSeleccionada + 1);
        
    }

}
