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
public class ControladorImprimir extends ControladorEscenas {

    String nombrePDFEmpleados;
    String nombrePDFEliminados;
    List<Persona> listaPersonasSortedDNI;
    List<Persona> listaPersonasEliminadas;

    public ControladorImprimir(MainWindow mainWindow) {

        super(mainWindow);

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
        mainWindow.getBtnImprimirPDFSortedDNI().addActionListener(e -> crearPDFPersonasOrdenadasPorDNI());
        mainWindow.getBtnImprimirPDFSortedNombre().addActionListener(e -> crearPDFPersonasFueraDelClub());
        mainWindow.getBtnImprimirPDFResultadosEquipo().addActionListener(e -> ExporterPDF.getInstancia().crearPDFPartidos());
        mainWindow.getBtnImprimirPDFNominas().addActionListener(e -> ExporterPDF.getInstancia().crearPDFNominas());

        //Boton de cambiar escena
        mainWindow.getBtnHomeImprimir().addActionListener(e -> cambiarEscena(CARD_HOME));

    }

    private void inicializarVariables() {

        nombrePDFEmpleados = ExporterPDF.getInstancia().getNameFileEmpleados();

        nombrePDFEliminados = ExporterPDF.getInstancia().getNameFileEmpleadosEliminados();
        //Creo el PDF con mi clase ExportedPDF

    }

    private void crearPDFPersonasOrdenadasPorDNI() {
        //Recojo los datos de la lista que quiero crear en el pdf de empleados ordenador por DNI
        listaPersonasSortedDNI = Gestor.getInstancia().listaPersonasSortedDNI(Gestor.getInstancia().getListaPersonas());
        ExporterPDF.getInstancia().crearPDFPersonas(nombrePDFEmpleados, listaPersonasSortedDNI);
    }

    private void crearPDFPersonasFueraDelClub() {
        //Recojo los datos de la lista que quiero crear en el pdf de empleados despedidos ordenador por nombre
        listaPersonasEliminadas = Gestor.getInstancia().listaPersonasFueraClub(Gestor.getInstancia().getListaPersonas());
        ExporterPDF.getInstancia().crearPDFPersonas(nombrePDFEliminados, listaPersonasEliminadas);
    }

}
