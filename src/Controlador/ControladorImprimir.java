/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ExporterPDF;
import Modelo.Gestor;
import Modelo.Persona;
import Vista.MainWindow;
import java.util.List;

/**
 *
 * @author HugoFDZ
 */
public class ControladorImprimir {

    private MainWindow mainWindow;

    String nombrePDFEmpleados;
    String nombrePDFEliminados;
    List<Persona> listaPersonasSortedDNI;
    List<Persona> listaPersonasEliminadas;

    public ControladorImprimir(MainWindow homeWindow) {
        this.mainWindow = homeWindow;

        inicializarVariables();

        inicializarEventos();

    }

    private void inicializarEventos() {

        //Botones de los txt
        mainWindow.getBtnImprimirTXTSortedDNI().addActionListener(e -> Gestor.getInstancia().generadoresDeEmpleados());
        mainWindow.getBtnImprimirTXTSortedNombre().addActionListener(e -> Gestor.getInstancia().generarEmpleadosEliminados());
        mainWindow.getBtnImprimirTXTResultadosEquipo().addActionListener(e -> Gestor.getInstancia().generarListaPartidos());
        mainWindow.getBtnImprimirTXTNominas().addActionListener(e -> Gestor.getInstancia().generarListaNominas());

        //Botones de los PDF
        mainWindow.getBtnImprimirPDFSortedDNI().addActionListener(e -> ExporterPDF.getInstancia().crearPDFPersonas(nombrePDFEmpleados, listaPersonasSortedDNI));
        mainWindow.getBtnImprimirPDFSortedNombre().addActionListener(e -> ExporterPDF.getInstancia().crearPDFPersonas(nombrePDFEliminados, listaPersonasEliminadas));
        mainWindow.getBtnImprimirPDFResultadosEquipo().addActionListener(e -> ExporterPDF.getInstancia().crearPDFPartidos());
        mainWindow.getBtnImprimirPDFNominas().addActionListener(e -> ExporterPDF.getInstancia().crearPDFNominas());

    }

    private void inicializarVariables() {

        //Recojo los datos de la lista que quiero crear en el pdf de empleados ordenador por DNI
        listaPersonasSortedDNI = Gestor.getInstancia().listaPersonasSortedDNI(Gestor.getInstancia().getListaPersonas());
        nombrePDFEmpleados = ExporterPDF.getInstancia().getNameFileEmpleados();

        //Recojo los datos de la lista que quiero crear en el pdf de empleados despedidos ordenador por nombre
        listaPersonasEliminadas = Gestor.getInstancia().listaPersonasFueraClub(Gestor.getInstancia().getListaPersonas());
        nombrePDFEliminados = ExporterPDF.getInstancia().getNameFileEmpleadosEliminados();
        //Creo el PDF con mi clase ExportedPDF

    }

}
