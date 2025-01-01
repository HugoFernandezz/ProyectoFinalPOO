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
 * Controlador encargado de gestionar la creación e impresión de diferentes
 * listados y archivos, tanto en formato TXT como PDF. Hereda de 
 * {@link ControladorEscenas} para el cambio de vistas.
 * <p>
 * Permite imprimir o exportar:
 * <ul>
 *   <li>Listados de empleados activos y despedidos (TXT o PDF).</li>
 *   <li>Resultados de partidos.</li>
 *   <li>Nóminas generadas.</li>
 * </ul>
 * </p>
 * 
 * <p><b>Autor:</b> HugoFDZ</p>
 */
public class ControladorImprimir extends ControladorEscenas {

    String nombrePDFEmpleados;
    String nombrePDFEliminados;
    List<Persona> listaPersonasSortedDNI;
    List<Persona> listaPersonasEliminadas;
    
    /**
     * Constructor que recibe la ventana principal y llama al constructor
     * de la superclase. Posteriormente, inicializa las variables y eventos
     * necesarios para imprimir o exportar los distintos listados.
     *
     * @param mainWindow Instancia de la ventana principal de la aplicación.
     */
    public ControladorImprimir(MainWindow mainWindow) {

        super(mainWindow);

        inicializarVariables();

        inicializarEventos();

    }

    
    /**
     * Inicializa los eventos relacionados con la impresión en TXT y PDF. 
     * Asigna acciones a los botones de la interfaz para invocar distintos métodos 
     * de generación o exportación de listados.
     */
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

    /**
     * Inicializa las variables utilizadas para la generación de PDF
     * obteniendo los nombres de archivo desde la clase {@link ExporterPDF}.
     */
    private void inicializarVariables() {

        nombrePDFEmpleados = ExporterPDF.getInstancia().getNameFileEmpleados();

        nombrePDFEliminados = ExporterPDF.getInstancia().getNameFileEmpleadosEliminados();
        //Creo el PDF con mi clase ExportedPDF

    }

    /**
     * Crea un archivo PDF con la lista de personas activas, ordenadas
     * por DNI. Para ello, recupera la lista desde el {@link Gestor} y 
     * posteriormente usa el {@link ExporterPDF} para generar el archivo.
     */
    private void crearPDFPersonasOrdenadasPorDNI() {
        //Recojo los datos de la lista que quiero crear en el pdf de empleados ordenador por DNI
        listaPersonasSortedDNI = Gestor.getInstancia().listaPersonasSortedDNI(Gestor.getInstancia().getListaPersonas());
        ExporterPDF.getInstancia().crearPDFPersonas(nombrePDFEmpleados, listaPersonasSortedDNI);
    }

    /**
     * Crea un archivo PDF con la lista de personas que han salido del club,
     * ordenadas por nombre. Para ello, recupera la lista de eliminados desde 
     * el {@link Gestor} y posteriormente usa el {@link ExporterPDF} para 
     * generar el archivo.
     */
    private void crearPDFPersonasFueraDelClub() {
        //Recojo los datos de la lista que quiero crear en el pdf de empleados despedidos ordenador por nombre
        listaPersonasEliminadas = Gestor.getInstancia().listaPersonasFueraClub(Gestor.getInstancia().getListaPersonas());
        ExporterPDF.getInstancia().crearPDFPersonas(nombrePDFEliminados, listaPersonasEliminadas);
    }

}
