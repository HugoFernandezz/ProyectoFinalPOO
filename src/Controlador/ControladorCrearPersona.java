/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Demarcacion;
import Modelo.Directivo;
import Modelo.Especialidad;
import Modelo.Jugador;
import Modelo.Puesto;
import Modelo.Tecnico;
import Vista.MainWindow;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * Controlador para crear distintas personas (jugador, técnico, directivo).
 * Extiende la funcionalidad de ControladorGestorPersonas y gestiona 
 * los eventos relacionados con la creación de personas en la interfaz.
 *
 * @author HugoFDZ
 */
public class ControladorCrearPersona extends ControladorGestorPersonas {

    
    /**
     * Constructor que recibe la ventana principal y llama al constructor 
     * de la clase padre. Posteriormente, inicializa los eventos asociados 
     * a la creación de personas.
     *
     * @param mainWindow Instancia de la ventana principal de la aplicación.
     */
    public ControladorCrearPersona(MainWindow mainWindow) {

        super(mainWindow);

        inicializarEventos();

    }

    
    /**
     * Inicializa los eventos para la creación de jugadores, técnicos 
     * y directivos. Asocia cada acción a un método correspondiente.
     */
    private void inicializarEventos() {

        mainWindow.getBtnCrearJugador().addActionListener(e -> intentarCrearJugador());
        mainWindow.getBtnCrearTecnico().addActionListener(e -> intentarCrearTecnico());
        mainWindow.getBtnCrearDirectivo().addActionListener(e -> intentarCrearDirectivo());
        mainWindow.getBtnDarDeAltaAtras().addActionListener(e -> cambiarEscena(CARD_GESTION));

    }

    
    /**
     * Verifica si los campos para la creación de un jugador están completos.
     * Si no están vacíos, procede a crear el jugador llamando a {@link #crearJugador()}.
     * De lo contrario, muestra un mensaje de error.
     */
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

    
     /**
     * Crea un objeto de tipo {@link Jugador} con la información 
     * ingresada en el formulario. Actualiza el modelo de la tabla de personas 
     * y muestra un mensaje de confirmación.
     */
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

        cambiarEscena(CARD_GESTION);
    }

    
    /**
     * Verifica si los campos para la creación de un técnico están completos.
     * Si no están vacíos, procede a crear el técnico llamando a {@link #crearTecnico()}.
     * De lo contrario, muestra un mensaje de error.
     */
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

    
    /**
     * Crea un objeto de tipo {@link Tecnico} con la información 
     * ingresada en el formulario. Actualiza el modelo de la tabla de personas 
     * y muestra un mensaje de confirmación.
     */
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

        cambiarEscena(CARD_GESTION);
    }

    
    /**
     * Verifica si los campos para la creación de un directivo están completos.
     * Si no están vacíos, procede a crear el directivo llamando a {@link #crearDirectivo()}.
     * De lo contrario, muestra un mensaje de error.
     */
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

    
    /**
     * Crea un objeto de tipo {@link Directivo} con la información 
     * ingresada en el formulario. Actualiza el modelo de la tabla de personas 
     * y muestra un mensaje de confirmación.
     */
    private void crearDirectivo() {
        String nombre = mainWindow.getInputAltaDirectivoNombre().getText();
        String apellido = mainWindow.getInputAltaDirectivoApellido().getText();
        int telefono = Integer.parseInt(mainWindow.getInputAltaDirectivoTelefono().getText());
        String dni = mainWindow.getInputAltaDirectivoDNI().getText();
        String cargo = mainWindow.getInputAltaDirectivoCargo().getText();

        Directivo directivo = new Directivo(nombre, apellido, dni, telefono, cargo);

        actualizarModeloTablaPersonas(mainWindow.getModeloPersonas());

        JOptionPane.showMessageDialog(null, "¡El directivo " + nombre + " se ha unido al club!");

        cambiarEscena(CARD_GESTION);
    }

}
