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

    public ControladorGastos(MainWindow mainWindow) {

        super(mainWindow);
        
        inicializarVariables();

        inicializarEventos();

    }

    private void inicializarVariables() {

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

    //Método para cambiar a la escena de crearle nomina a persona/s (Requiere tener 1 o varias personas de la tabla seleccionados)
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

    private List<Persona> recuperarPersonas(JTable tabla) {
        filasSeleccionadasGastos = tabla.getSelectedRows();
        List<Persona> personasSeleccionadasGastos = new ArrayList<>();
        for (int i = 0; i < filasSeleccionadasGastos.length; i++) {
            personasSeleccionadasGastos.add(Gestor.getInstancia().recuperarPersona(filasSeleccionadasGastos[i] + 1));
            System.out.println("Se devolvio a " + Gestor.getInstancia().recuperarPersona(filasSeleccionadasGastos[i] + 1).getNombre());
        }

        return personasSeleccionadasGastos;

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

    private void recuperarConcepto(JTable tabla) {
        filaSeleccionada = tabla.getSelectedRow();
        System.out.println("Se devolvio el concepto con id: " + Gestor.getInstancia().recuperarConceptoPorIndice(filaSeleccionada, personasSeleccionadasGastos.get(0)).getCodigo());
        conceptoActual = Gestor.getInstancia().recuperarConceptoPorIndice(filaSeleccionada, personasSeleccionadasGastos.get(0));
        cambiarEscenaDatosRellenosConcepto(conceptoActual);

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

    private void eliminarConcepto() {
        filaSeleccionada = mainWindow.getTablaConceptosNomina().getSelectedRow();
        String ID = mainWindow.getTablaConceptosNomina().getModel().getValueAt(filaSeleccionada, 2).toString();
        System.out.println(ID);
        Gestor.getInstancia().removeConceptoPorID(ID, personasSeleccionadasGastos.get(0));
        JOptionPane.showMessageDialog(null, "¡Concepto con id: " + ID + " eliminada con éxito!");
        rellenarModeloTablaConceptos();
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

}
