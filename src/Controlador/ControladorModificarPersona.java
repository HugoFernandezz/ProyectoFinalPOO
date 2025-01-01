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
 * Controlador encargado de gestionar la modificación de datos de un jugador,
 * técnico o directivo. Extiende de {@link ControladorGestorPersonas} para 
 * aprovechar la capacidad de cambiar entre escenas y la manipulación de 
 * la tabla de personas.
 * 
 * <p><b>Autor:</b> HugoFDZ</p>
 */
public class ControladorModificarPersona extends ControladorGestorPersonas {

    /**
     * Constructor que recibe la ventana principal y llama al constructor
     * de la superclase {@link ControladorGestorPersonas}. Posteriormente,
     * inicializa variables y eventos necesarios para la modificación de personas.
     *
     * @param mainWindow Instancia de la ventana principal de la aplicación.
     */
    public ControladorModificarPersona(MainWindow mainWindow) {

        super(mainWindow);
        
        inicializarVariables();

        inicializarEventos();
    }
    
    /**
     * Inicializa y configura etiquetas (names) para ciertos paneles y 
     * campos de la interfaz, de modo que sean reconocibles a la hora
     * de identificar el tipo de persona (Jugador, Técnico, Directivo).
     */
    private void inicializarVariables(){
    
        //"Tags"
        mainWindow.getPanelModificarDirectivo().setName("ModificarDirectivo");
        mainWindow.getPanelModificarJugador().setName("ModificarJugador");
        mainWindow.getPanelModificarTecnico().setName("ModificarTecnico");
        mainWindow.getInputModificarJugadorDNI().setName("DNI");
        mainWindow.getInputModificarTecnicoDNI().setName("DNI");
        mainWindow.getInputModificarDirectivoDNI().setName("DNI");
    
    }

    /**
     * Configura los eventos para:
     * <ul>
     *   <li>Modificar datos de jugador, técnico o directivo.</li>
     *   <li>Asignar los modelos de los {@link JComboBox} para puestos, 
     *       especialidades y demarcaciones.</li>
     *   <li>Regresar a la escena de gestión y limpiar datos si se cancela 
     *       la operación.</li>
     *   <li>Llamar al proceso de modificación según la persona seleccionada 
     *       en la tabla ({@link #cambiarEscenaModificacion(JTable)}).</li>
     * </ul>
     */
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

    /**
     * habilita todos los campos y botones de la interfaz relacionados
     * con la modificación de personas, preparándolos para un nuevo uso.
     */
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

    /**
     * Lógica para modificar los datos de un {@link Jugador}. Recupera el DNI 
     * para encontrar al jugador en el {@link Gestor}, y actualiza sus 
     * propiedades (apellido, nombre, teléfono, valor de mercado, demarcación).
     * Luego, refresca la tabla y notifica al usuario.
     */
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

    /**
     * Lógica para modificar los datos de un {@link Tecnico}. Recupera el DNI 
     * para encontrar al técnico en el {@link Gestor}, y actualiza sus 
     * propiedades (apellido, nombre, teléfono, especialidad, puesto).
     * Luego, refresca la tabla y notifica al usuario.
     */
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

    /**
     * Lógica para modificar los datos de un {@link Directivo}. Recupera el DNI 
     * para encontrar al directivo en el {@link Gestor}, y actualiza sus 
     * propiedades (apellido, nombre, teléfono, cargo).
     * Luego, refresca la tabla y notifica al usuario.
     */
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

    /**
     * Cambia a la escena de modificación según la persona seleccionada en la tabla.
     * Si no hay ninguna persona seleccionada, muestra un mensaje de advertencia.
     * De lo contrario, determina el tipo de persona y cambia al panel 
     * correspondiente, limitando y rellenando los campos (ver 
     * {@link #LimitarDatosModificacion(Persona)} y {@link #rellenarDatos(Persona)}).
     *
     * @param tabla La {@link JTable} donde se selecciona la persona.
     */
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
    
    /**
     * Verifica si se ha seleccionado alguna fila en la tabla. 
     * En caso de no existir una selección, muestra un mensaje y retorna false.
     *
     * @param tabla La {@link JTable} a verificar.
     * @return <code>true</code> si se seleccionó una fila, <code>false</code> de lo contrario.
     */
    private boolean isPersonaSeleccionada(JTable tabla) {
        if (tabla.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "¡Debes seleccionar a la persona que quieres modificar!");
            return false;
        }
        return true;
    }
    
    /**
     * Inhabilita (desactiva) todos aquellos campos y botones que no estén
     * relacionados con la clase concreta de la persona seleccionada
     * (Jugador, Técnico o Directivo). Los campos inhabilitados muestran
     * el texto "No debe rellenar este campo".
     *
     * @param persona La persona seleccionada, para determinar qué campos 
     *                y botones se deben deshabilitar.
     */
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

    /**
     * Determina el índice del {@code JTabbedPane} y, por tanto, la vista de 
     * modificación que debe mostrarse, en función del tipo de la persona seleccionada 
     * (Jugador, Técnico o Directivo). Retorna la escena de modificación (CARD_MODIFICAR).
     *
     * @param persona La persona que se desea modificar.
     * @return La cadena que representa la escena de modificación.
     */
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

    /**
     * Dependiendo del tipo específico de persona, llama a métodos de relleno
     * distintos:
     * <ul>
     *   <li>Jugador -> {@link #rellenarDatoJugador(Jugador)}</li>
     *   <li>Técnico -> {@link #rellenarDatoTecnico(Tecnico)}</li>
     *   <li>Directivo -> {@link #rellenarDatoDirectivo(Directivo)}</li>
     * </ul>
     *
     * @param persona Instancia de {@link Persona} que se desea editar.
     */
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

    /**
     * Rellena los campos del panel de modificación de jugador con la 
     * información específica de la instancia {@link Jugador} recibida.
     * Desactiva la edición del DNI para evitar inconsistencias.
     *
     * @param jugador Instancia de Jugador con los datos actuales.
     */
    private void rellenarDatoJugador(Jugador jugador) {
        mainWindow.getInputModificarJugadorApellido().setText(jugador.getApellido());
        mainWindow.getInputModificarJugadorApellido().setForeground(Color.black);
        mainWindow.getInputModificarJugadorDNI().setText(jugador.getDni());
        mainWindow.getInputModificarJugadorDNI().setEnabled(false);
        mainWindow.getInputModificarJugadorDNI().setForeground(Color.black);
        mainWindow.getInputModificarJugadorEdad().setText(String.valueOf(jugador.getEdad()));
        mainWindow.getInputModificarJugadorEdad().setForeground(Color.black);
        mainWindow.getInputModificarJugadorNombre().setText(jugador.getNombre());
        mainWindow.getInputModificarJugadorNombre().setForeground(Color.black);
        mainWindow.getInputModificarJugadorTelefono().setText(String.valueOf(jugador.getTelefono()));
        mainWindow.getInputModificarJugadorTelefono().setForeground(Color.black);
        mainWindow.getInputModificarJugadorValor().setText(String.valueOf(jugador.getValorMercado()));
        mainWindow.getInputModificarJugadorValor().setForeground(Color.black);
        mainWindow.getComBoxModificarDemarcacion().setSelectedItem(jugador.getDemarcacion());
    }

    /**
     * Rellena los campos del panel de modificación de técnico con la 
     * información específica de la instancia {@link Tecnico} recibida.
     * Desactiva la edición del DNI para evitar inconsistencias.
     *
     * @param tecnico Instancia de Tecnico con los datos actuales.
     */
    private void rellenarDatoTecnico(Tecnico tecnico) {
        mainWindow.getInputModificarTecnicoApellido().setText(tecnico.getApellido());
        mainWindow.getInputModificarTecnicoApellido().setForeground(Color.black);
        mainWindow.getInputModificarTecnicoDNI().setText(tecnico.getDni());
        mainWindow.getInputModificarTecnicoDNI().setEnabled(false);
        mainWindow.getInputModificarTecnicoDNI().setForeground(Color.black);
        mainWindow.getInputModificarTecnicoNombre().setText(tecnico.getNombre());
        mainWindow.getInputModificarTecnicoNombre().setForeground(Color.black);
        mainWindow.getInputModificarTecnicoTelefono().setText(String.valueOf(tecnico.getTelefono()));
        mainWindow.getInputModificarTecnicoTelefono().setForeground(Color.black);
        mainWindow.getComboBoxModificarTecnicoPuesto().setSelectedItem(tecnico.getPuesto());
        mainWindow.getComboBoxModificarTecnicoEspecialidad().setSelectedItem(tecnico.getEspecialidad());

    }
    
    /**
     * Rellena los campos del panel de modificación de directivo con la 
     * información específica de la instancia {@link Directivo} recibida.
     * Desactiva la edición del DNI para evitar inconsistencias.
     *
     * @param directivo Instancia de Directivo con los datos actuales.
     */
    private void rellenarDatoDirectivo(Directivo directivo) {
        mainWindow.getInputModificarDirectivoApellido().setText(directivo.getApellido());
        mainWindow.getInputModificarDirectivoApellido().setForeground(Color.black);
        mainWindow.getInputModificarDirectivoCargo().setText(directivo.getCargo());
        mainWindow.getInputModificarDirectivoCargo().setForeground(Color.black);
        mainWindow.getInputModificarDirectivoDNI().setText(directivo.getDni());
        mainWindow.getInputModificarDirectivoDNI().setEnabled(false);
        mainWindow.getInputModificarDirectivoDNI().setForeground(Color.black);
        mainWindow.getInputModificarDirectivoNombre().setText(directivo.getNombre());
        mainWindow.getInputModificarDirectivoNombre().setForeground(Color.black);
        mainWindow.getInputModificarDirectivoTelefono().setText(String.valueOf(directivo.getTelefono()));
        mainWindow.getInputModificarDirectivoTelefono().setForeground(Color.black);

    }
    
    /**
     * Recupera la persona seleccionada en la {@link JTable} especificada,
     * consultando al {@link Gestor} con el índice de la fila seleccionada.
     *
     * @param tabla Tabla que muestra la lista de personas.
     * @return Instancia de {@link Persona} correspondiente a la fila seleccionada.
     */
    private Persona recuperarPersonaDeTabla(JTable tabla) {
        filaSeleccionada = tabla.getSelectedRow();
        System.out.println("Se devolvio a " + Gestor.getInstancia().recuperarPersona(filaSeleccionada + 1).getNombre());
        return Gestor.getInstancia().recuperarPersona(filaSeleccionada + 1);
        
    }

}
