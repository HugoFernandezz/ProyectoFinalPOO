/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cliente;
import Modelo.Concepto;
import Modelo.Factura;
import Modelo.Gestor;
import Modelo.Meses;
import Modelo.Nomina;
import Modelo.Persona;
import Vista.MainWindow;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;

/**
 * Controlador encargado de gestionar las funcionalidades de los gastos,
 * incluyendo la creación de nóminas, facturas y la modificación de conceptos.
 * Extiende de ControladorEscenas para el cambio de vistas.
 * 
 * <p>Este controlador permite:</p>
 * <ul>
 *   <li>Crear y asignar nóminas a personas seleccionadas.</li>
 *   <li>Gestionar la creación de facturas.</li>
 *   <li>Modificar y eliminar conceptos asociados a nóminas.</li>
 * </ul>
 * 
 * @author HugoFDZ
 */
public class ControladorGastos extends ControladorEscenas {

    private int[] filasSeleccionadasGastos;
    private List<Persona> personasSeleccionadasGastos = new ArrayList<>();
    private Concepto conceptoActual;
    //Tabla para ver los conceptos de las nominas
    String[] columnasConceptos = {"Descripcion", "Importe", "Codigo"};
    DefaultTableModel modeloConceptos;

    
    /**
     * Constructor que recibe la ventana principal, inicializa variables y
     * establece los eventos relacionados con el control de gastos.
     *
     * @param mainWindow Instancia de la ventana principal de la aplicación.
     */
    public ControladorGastos(MainWindow mainWindow) {

        super(mainWindow);

        inicializarVariables();

        inicializarEventos();

    }

    
    /**
     * Inicializa y configura diversos componentes del panel de gastos:
     * <ul>
     *   <li>Combobox de meses para la creación y modificación de nóminas.</li>
     *   <li>Asigna acciones a botones de creación de nóminas, facturas y
     *       modificación de conceptos.</li>
     *   <li>Configura el modelo de la tabla de conceptos.</li>
     * </ul>
     */
    private void inicializarVariables() {
        
        mainWindow.getComBoxMesNominaModificar().setModel(new DefaultComboBoxModel<>(Meses.values()));

        //Inicializo el comboBox de los meses
        mainWindow.getComBoxMesNomina().setModel(new DefaultComboBoxModel<>(Meses.values()));
        //Botones de Gastos
        mainWindow.getBtnCrearNominaFinal().addActionListener(e -> intentarCrearNomina());
        mainWindow.getCrearFacturaFinal().addActionListener(e -> intentarCrearFactura());

        //Botones de Conceptos
        mainWindow.getBtnModificarConcepto().addActionListener(e -> recuperarConcepto(mainWindow.getTablaConceptosNomina()));
        mainWindow.getBtnEliminarConcepto().addActionListener(e -> eliminarConcepto());

        //Botones de modificar Nomina
        mainWindow.getBtnModificarNominaFinal().addActionListener(e -> intentarModificarConcepto(conceptoActual));
        mainWindow.getBtnHomeModificarConceptos().addActionListener(e -> cambiarEscena(CARD_GASTOS));
        mainWindow.getBtnHomeCrearFactura().addActionListener(e -> cambiarEscena(CARD_GASTOS));
        mainWindow.getBtnHomeCrearNomina().addActionListener(e -> cambiarEscena(CARD_GASTOS));
        mainWindow.getBtnHomeModificarNomina().addActionListener(e -> cambiarEscena(CARD_GASTOS));

        modeloConceptos = new DefaultTableModel(columnasConceptos, 0) {
            //Le sobreescribo el metodo para que el usuario no pueda editar las celdas de las tablas
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Desactiva la edición de celdas
            }
        };

    }

    
    /**
     * Asigna los eventos de los botones relacionados con el menú de gastos
     * y gestiona la selección de filas en la tabla de personas para identificar
     * las personas involucradas en la creación de nóminas o facturas.
     */
    private void inicializarEventos() {

        mainWindow.getBtnHomeGastos().addActionListener(e -> cambiarEscena(CARD_HOME));
        mainWindow.getBtnCrearNomina().addActionListener(e -> cambiarEscenaNomina());
        mainWindow.getBtnCrearFactura().addActionListener(e -> cambiarEscena(CARD_FACTURA));
        mainWindow.getBtnModificarConceptoNomina().addActionListener(e -> cambiarEscenaModificarConcepto());
        mainWindow.getTablaGastosPersonas().getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> {
            if (!e.getValueIsAdjusting()) {
                filasSeleccionadasGastos = mainWindow.getTablaGastosPersonas().getSelectedRows();

                if (filaSeleccionada != -1) {
                    personasSeleccionadasGastos = recuperarPersonas(mainWindow.getTablaGastosPersonas());

                }
            }
        });

    }

    /**
     * Verifica si hay al menos una persona seleccionada para asignarle una nómina.
     * En caso afirmativo, cambia a la escena de creación de nómina.
     * Si no hay ninguna persona seleccionada, muestra un mensaje informativo.
     */
    private void cambiarEscenaNomina() {
        if (personasSeleccionadasGastos.size() > 0) {

            cambiarEscena(CARD_CREARNOMINA);

        } else {
            JOptionPane.showMessageDialog(null, "Deberas seleccionar a una o varias personas a las que quieras crear una nómina");
        }
    }

    
    /**
     * Verifica si solo hay una persona seleccionada para modificar los conceptos
     * de su nómina. Si no tiene ninguna nómina, se muestra un mensaje. De lo contrario,
     * cambia a la escena de modificación de conceptos y rellena la tabla correspondiente.
     */
    private void cambiarEscenaModificarConcepto() {

        if (personasSeleccionadasGastos.size() == 1) {

            if (Gestor.getInstancia().tieneNomina(personasSeleccionadasGastos.get(0)) == false) {
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

    
    /**
     * Limpia el modelo de la tabla de conceptos y lo rellena con los conceptos
     * de la nómina de la persona que se encuentre seleccionada (en este caso,
     * siempre se asume que solo hay una persona en la lista).
     */
    private void rellenarModeloTablaConceptos() {
        //Vacio el modelo
        modeloConceptos.setRowCount(0);

        Persona p = personasSeleccionadasGastos.get(0);

        //Y lo vuelvo a llenar
        List<Concepto> listaConceptos = new ArrayList<>();
        listaConceptos.addAll(p.getTodosConceptos());

        //Relleno el modeloConceptos con las los conceptos de la nomina de la persona que se le pasa por parametro
        for (Concepto concepto : listaConceptos) {
            modeloConceptos.addRow(new String[]{concepto.getDescripcion(), String.valueOf(concepto.getImporte()), concepto.getCodigo()});
        }

        mainWindow.getTablaConceptosNomina().setModel(modeloConceptos);

    }

    
    /**
     * Recupera las personas seleccionadas en una tabla y las devuelve en una lista.
     *
     * @param tabla Tabla de la cual se obtienen las filas seleccionadas.
     * @return Lista de {@link Persona} seleccionadas.
     */
    private List<Persona> recuperarPersonas(JTable tabla) {
        filasSeleccionadasGastos = tabla.getSelectedRows();
        List<Persona> personasSeleccionadasGastos = new ArrayList<>();
        for (int i = 0; i < filasSeleccionadasGastos.length; i++) {
            personasSeleccionadasGastos.add(Gestor.getInstancia().recuperarPersona(filasSeleccionadasGastos[i] + 1));
            System.out.println("Se devolvio a " + Gestor.getInstancia().recuperarPersona(filasSeleccionadasGastos[i] + 1).getNombre());
        }

        return personasSeleccionadasGastos;

    }

    
    /**
     * Verifica si los campos necesarios para crear una nómina están llenos.
     * En caso afirmativo, llama a {@link #crearNomina(List)}.
     * De lo contrario, muestra un mensaje de error.
     */
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

    
    /**
     * Crea o actualiza una nómina para cada persona seleccionada, asignándole
     * un nuevo concepto o creando la nómina desde cero si no existía.
     *
     * @param personasSeleccionadasGastos Lista de personas a las que se asignará la nómina.
     */
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

            if (p.nominaMes(mes) == null) {

                //Si no tenia nómina en ese mes se la creo
                p.setNomina(new Nomina(mes, ano, concepto, p));

            } else {
                //Si la nomina ya la tenia creada, se lo meto como concepto de su nómina
                p.nominaMes(mes).setConcepto(concepto);

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

    
    /**
     * Recupera el concepto seleccionado en la tabla de conceptos para ser
     * posteriormente modificado. Si no se ha seleccionado una fila,
     * muestra un mensaje de advertencia.
     *
     * @param tabla Tabla de conceptos de nómina.
     */
    private void recuperarConcepto(JTable tabla) {
        filaSeleccionada = tabla.getSelectedRow();
        if (filaSeleccionada < 0) {
            JOptionPane.showMessageDialog(null, "Debe selecciona la nomina que quiera modificar.");
        } else {
            System.out.println("Se devolvio el concepto con id: " + Gestor.getInstancia().recuperarConceptoPorIndice(filaSeleccionada, personasSeleccionadasGastos.get(0)).getCodigo());
            conceptoActual = Gestor.getInstancia().recuperarConceptoPorIndice(filaSeleccionada, personasSeleccionadasGastos.get(0));
            cambiarEscenaDatosRellenosConcepto(conceptoActual);
        }

    }

    
    /**
     * Verifica si los campos necesarios para crear una factura están llenos.
     * En caso afirmativo, llama a {@link #crearFactura()}.
     * De lo contrario, muestra un mensaje de error.
     */
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
    
    /**
     * Crea una factura con la información ingresada en la interfaz
     * y muestra un mensaje de confirmación. Luego, regresa a la escena de gastos.
     */
    private void crearFactura() {

        String CIF = mainWindow.getInputCrearFacturaCIF().getText();
        String ID = mainWindow.getInputCrearFacturaID().getText();
        String nombre = mainWindow.getInputCrearFacturaNombre().getText();
        float cantidad = Float.valueOf(mainWindow.getInputCrearFacturaCantidad().getText());
        String fecha = mainWindow.getInputCrearFacturaFecha().getText();

        Cliente cliente = new Cliente(CIF, nombre);
        new Factura(ID, cantidad, fecha, cliente);

        JOptionPane.showMessageDialog(null, "¡Factura creada con éxito!");

        cambiarEscena(CARD_GASTOS);
    }

    
    /**
     * Elimina el concepto seleccionado en la tabla de conceptos, 
     * buscando su ID en la persona seleccionada, y muestra un mensaje
     * de confirmación. Posteriormente, actualiza la tabla de conceptos.
     */
    private void eliminarConcepto() {
        filaSeleccionada = mainWindow.getTablaConceptosNomina().getSelectedRow();
        if (filaSeleccionada < 0) {
            JOptionPane.showMessageDialog(null, "Debes seleccionar el concepto que quieras eliminar");
        } else {
            //Recupero el ID del concepto
            String ID = mainWindow.getTablaConceptosNomina().getModel().getValueAt(filaSeleccionada, 2).toString();
            System.out.println(ID);
            Gestor.getInstancia().removeConceptoPorID(ID, personasSeleccionadasGastos.get(0));
            JOptionPane.showMessageDialog(null, "¡Concepto con id: " + ID + " eliminada con éxito!");
            rellenarModeloTablaConceptos();
            cambiarEscena(CARD_GASTOS);
        }

    }

    
    /**
     * Cambia a la escena de modificación de nómina, rellenando los campos 
     * con la información del concepto que se desea editar.
     *
     * @param concepto Concepto que se mostrará y se editará en la nueva escena.
     */
    private void cambiarEscenaDatosRellenosConcepto(Concepto concepto) {

        cambiarEscena(CARD_MODIFICAR_NOMINA);

        mainWindow.getInputModificarNominaID().setText(concepto.getCodigo());
        mainWindow.getInputModificarNominaID().setForeground(Color.WHITE);
        mainWindow.getInputModificarNominaDescripcion().setText(concepto.getDescripcion());
        mainWindow.getInputModificarNominaDescripcion().setForeground(Color.WHITE);
        mainWindow.getInputModificarNominaImporte().setText(String.valueOf(concepto.getImporte()));
        mainWindow.getInputModificarNominaImporte().setForeground(Color.WHITE);
        mainWindow.getComBoxMesNominaModificar().setSelectedItem(Gestor.getInstancia().buscarNominaPorConceptoID(concepto.getCodigo()).getMes());

        mainWindow.getInputCrearNominaAno().setEnabled(false);

    }

    
    /**
     * Limpia el texto de cada uno de los campos de la lista proporcionada.
     *
     * @param campos Lista de campos de texto a limpiar.
     */
    private void limpiarCampos(List<JTextField> campos) {

        for (JTextField campo : campos) {

            campo.setText("");

        }

    }

    
   /**
     * Verifica si los campos necesarios para modificar un concepto no están vacíos.
     * En caso afirmativo, llama a {@link #modificarConcepto(Concepto)}.
     * De lo contrario, muestra un mensaje de error.
     *
     * @param concepto Concepto que se desea modificar.
     */
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

    
    /**
     * Modifica el concepto recibido actualizando su código, descripción e importe.
     * Muestra un mensaje de confirmación y recarga la tabla de conceptos para reflejar los cambios.
     *
     * @param concepto Concepto que se actualizará con la nueva información.
     */
    private void modificarConcepto(Concepto concepto) {

        concepto.setCodigo(mainWindow.getInputModificarNominaID().getText());
        concepto.setDescripcion(mainWindow.getInputModificarNominaDescripcion().getText());
        concepto.setImporte(Float.parseFloat(mainWindow.getInputModificarNominaImporte().getText()));

        JOptionPane.showMessageDialog(null, "¡Concepto con id: " + concepto.getCodigo() + " modificada con éxito!");

        rellenarModeloTablaConceptos();

        cambiarEscena(CARD_MODIFICAR_CONCEPTO);

    }

}
