/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * Clase encargada de exportar información a documentos PDF, como listas de empleados, 
 * partidos jugados y nóminas del club.
 * Implementa el patrón Singleton para garantizar una única instancia de ExporterPDF.
 * 
 */
public class ExporterPDF {

    private static ExporterPDF exporter;

    private final String NAMEFILEEMPLEADOS = "ListaEmpleados.pdf";
    private final String NAMEFILEEMPLEADOSELIMINADOS = "ListaEmpleadosEliminados.pdf";
    private final String NAMEPARTIDOSJUGADOS = "PartidosJugados.pdf";
    private final String NAMENOMINAS = "NominasDelClub.pdf";

    /**
     * Obtiene el nombre del archivo de la lista de empleados.
     * 
     * @return el nombre del archivo de empleados
     */
    public String getNameFileEmpleados() {
        return NAMEFILEEMPLEADOS;
    }

    /**
     * Obtiene el nombre del archivo de la lista de empleados eliminados.
     * 
     * @return el nombre del archivo de empleados eliminados
     */
    public String getNameFileEmpleadosEliminados() {
        return NAMEFILEEMPLEADOSELIMINADOS;
    }

    // Constructor privado para evitar la creación de instancias externas
    private ExporterPDF() {
    }

    /**
     * Obtiene la instancia única de la clase ExporterPDF.
     * 
     * @return la instancia única de ExporterPDF
     */
    public static ExporterPDF getInstancia() {
        if (exporter == null) {
            exporter = new ExporterPDF();
        }
        return exporter;
    }

    /**
     * Crea un documento PDF con una lista de personas.
     * 
     * @param nombreDocumento Nombre del archivo PDF a generar
     * @param listaPersonas Lista de personas a incluir en el documento
     */
    public void crearPDFPersonas(String nombreDocumento, List<Persona> listaPersonas) {
        try {
            Document documento = new Document();
            PdfWriter.getInstance(documento, new FileOutputStream(nombreDocumento));
            documento.open();

            if (listaPersonas.isEmpty()) {
                System.out.println("[*]La lista que está intentando utilizar está vacía.");
            } else {
                int indice = 0;
                for (Persona persona : listaPersonas) {
                    Paragraph paragraph = new Paragraph();
                    indice++;
                    documento.add(new Paragraph(indice + "- " + persona.getNombre() + " " + persona.getApellido() + " con el DNI: " + persona.getDni()));
                    documento.add(paragraph);
                }
                documento.close();
                System.out.println("[+]PDF creado");
            }
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Crea un documento PDF con una lista de partidos jugados.
     */
    public void crearPDFPartidos() {
        try {
            Document documento = new Document();
            PdfWriter.getInstance(documento, new FileOutputStream(NAMEPARTIDOSJUGADOS));
            documento.open();

            if (Gestor.getInstancia().getListaPartidos().isEmpty()) {
                System.out.println("[*]La lista que está intentando utilizar está vacía.");
            } else {
                int indice = 0;
                for (Partido partido : Gestor.getInstancia().getListaPartidos()) {
                    Paragraph paragraph = new Paragraph();
                    indice++;
                    documento.add(new Paragraph(indice + " - " + "Partido jugado contra " + partido.getEquipoRival() + " finalizó con un resultado de: " + partido.getResultado()));
                    documento.add(paragraph);
                }
                documento.close();
                System.out.println("[+]PDF creado");
            }
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Crea un documento PDF con una lista de nóminas.
     */
    public void crearPDFNominas() {
        try {
            Document documento = new Document();
            PdfWriter.getInstance(documento, new FileOutputStream(NAMENOMINAS));
            documento.open();

            if (Gestor.getInstancia().getListaNominas().isEmpty()) {
                System.out.println("[*]La lista que está intentando utilizar está vacía.");
            } else {
                int indice = 0;
                for (Nomina nomina : Gestor.getInstancia().getListaNominas()) {
                    Paragraph paragraph = new Paragraph();
                    indice++;
                    documento.add(new Paragraph("----------------------------------------------------------------------------"));
                    documento.add(paragraph);
                    documento.add(new Paragraph("Nómina número: " + indice));
                    documento.add(paragraph);
                    documento.add(new Paragraph("Nombre y apellidos: " + nomina.getPersona().getNombre() + " " + nomina.getPersona().getApellido()));
                    documento.add(paragraph);
                    documento.add(new Paragraph("DNI: " + nomina.getPersona().getDni()));
                    documento.add(paragraph);

                    for (Concepto concepto : nomina.getConceptos()) {
                        documento.add(new Paragraph("+++++++++++++++++++++++++++++++++++++++++++++++++++++"));
                        documento.add(paragraph);
                        documento.add(new Paragraph("Descripción del concepto: " + concepto.getDescripcion()));
                        documento.add(paragraph);
                        documento.add(new Paragraph("Importe: " + concepto.getImporte() + " euros"));
                        documento.add(paragraph);
                        documento.add(new Paragraph("Código único del concepto: " + concepto.getCodigo()));
                        documento.add(paragraph);
                    }
                }
                documento.close();
                System.out.println("[+]PDF creado");
            }
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        }
    }
}
