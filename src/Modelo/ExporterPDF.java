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
 * Clase encargada de exportar información a documentos PDF, como listas de
 * empleados, partidos jugados y nóminas del club. Implementa el patrón
 * Singleton para garantizar una única instancia de ExporterPDF.
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
        Document documento = null;
        PdfWriter writer = null;
        try {
            // Creamos el documento
            documento = new Document();
            writer = PdfWriter.getInstance(documento, new FileOutputStream(nombreDocumento));
            documento.open();

            // Si la lista está vacía, agregamos un texto mínimo
            if (listaPersonas.isEmpty()) {
                documento.add(new Paragraph("Todavía no hay personas."));
                System.out.println("[*]La lista que está intentando utilizar está vacía.");
            } else {
                int indice = 0;
                for (Persona persona : listaPersonas) {
                    Paragraph paragraph = new Paragraph();
                    indice++;
                    documento.add(new Paragraph(indice + "- " + persona.getNombre() + " " + persona.getApellido() + " con el DNI: " + persona.getDni()));
                    documento.add(paragraph);
                }
            }

        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        } finally {
            // Asegurarse de que el documento y el writer se cierren correctamente
            if (documento != null) {
                documento.close(); // Cierro el documento
            }
            if (writer != null) {
                writer.close(); // Cierro el escritor
            }
            System.out.println("[+]PDF creado");
        }
    }

    /**
     * Crea un documento PDF con una lista de partidos jugados.
     */
    public void crearPDFPartidos() {
        Document documento = null;
        PdfWriter writer = null;
        try {
            // Creamos el documento
            documento = new Document();
            writer = PdfWriter.getInstance(documento, new FileOutputStream(NAMEPARTIDOSJUGADOS));
            documento.open();

            // Si la lista está vacía, agregamos un texto mínimo
            if (Gestor.getInstancia().getListaPartidos().isEmpty()) {
                documento.add(new Paragraph("No se han jugado partidos."));
                System.out.println("[*]La lista que está intentando utilizar está vacía.");
            } else {
                int indice = 0;
                for (Partido partido : Gestor.getInstancia().getListaPartidos()) {
                    indice++;
                    documento.add(new Paragraph(indice + " - " + "Partido jugado contra " + partido.getEquipoRival() + " finalizó con un resultado de: " + partido.getResultado()));
                }
            }

        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        } finally {
            // Asegurarse de que el documento y el writer se cierren correctamente ya que si no da error al abrir el pdf
            if (documento != null) {
                documento.close(); // Cierro el documento
            }
            if (writer != null) {
                writer.close(); // Cierro el escritor
            }
            System.out.println("[+]PDF creado");
        }
    }

    /**
     * Crea un documento PDF con una lista de nóminas.
     */
    public void crearPDFNominas() {
        Document documento = null;
        PdfWriter writer = null;
        try {
            // Creo el documento
            documento = new Document();
            writer = PdfWriter.getInstance(documento, new FileOutputStream(NAMENOMINAS));
            documento.open();

            // Si la lista de nóminas está vacía, le pongo un texto de que no hay nominas aun
            if (Gestor.getInstancia().getListaNominas().isEmpty()) {
                documento.add(new Paragraph("El club todavía no tiene ninguna nomina."));
                System.out.println("[*]La lista que está intentando utilizar está vacía.");
            } else {
                int indice = 0;

                for (Persona p : Gestor.getInstancia().ListaPersonasDentroDelClub()) {
                    if (Gestor.getInstancia().tieneNomina(p) == true) {
                        for (Nomina n : p.getListaNominas()) {

                            Paragraph paragraph = new Paragraph();

                            documento.add(new Paragraph("----------------------------------------------------------------------------"));
                            documento.add(paragraph);
                            documento.add(new Paragraph("Nómina número: " + (indice+1)));
                            documento.add(paragraph);
                            documento.add(new Paragraph("Mes de la nómina: " + n.getMes()));
                            documento.add(paragraph);
                            documento.add(new Paragraph("Nombre y apellidos: " + p.getNombre() + " " + p.getApellido()));
                            documento.add(paragraph);
                            documento.add(new Paragraph("DNI: " + p.getDni()));
                            documento.add(paragraph);

                            for (Concepto concepto : p.getNominaIndex(indice).getConceptos()) {
                                documento.add(new Paragraph("+++++++++++++++++++++++++++++++++++++++++++++++++++++"));
                                documento.add(paragraph);
                                documento.add(new Paragraph("Descripción del concepto: " + concepto.getDescripcion()));
                                documento.add(paragraph);
                                documento.add(new Paragraph("Importe: " + concepto.getImporte() + " euros"));
                                documento.add(paragraph);
                                documento.add(new Paragraph("Código único del concepto: " + concepto.getCodigo()));
                                documento.add(paragraph);
                            }

                            indice++;

                        }
                    }

                }

            }

        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        } finally {
            // Asegurarse de que el documento y el writer se cierren correctamente
            if (documento != null) {
                documento.close(); // Cierro el documento
            }
            if (writer != null) {
                writer.close(); // Cierro el escritor
            }
            System.out.println("[+]PDF creado");
        }
    }

}
