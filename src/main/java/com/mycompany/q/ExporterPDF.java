/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q;

import java.util.ArrayList;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author HugoFDZ
 */
public class ExporterPDF {

    private static ExporterPDF exporter;

    private final String nameFileEmpleados = "ListaEmpleados.pdf";
    private final String nameFileEmpleadosEliminados = "ListaEmpleadosEliminados.pdf";
    private final String namePartidosJugados = "PartidosJugados.pdf";
    private final String nameNominas = "NominasDelClub.pdf";

    public String getNameFileEmpleados() {
        return nameFileEmpleados;
    }

    public String getNameFileEmpleadosEliminados() {
        return nameFileEmpleadosEliminados;
    }

    // Constructor privado para evitar la creación de instancias externas
    private ExporterPDF() {
    }

    // Método público estático para obtener la instancia única (Singleton pattern)
    public static ExporterPDF getInstancia() {
        if (exporter == null) {
            exporter = new ExporterPDF();
        }
        return exporter;
    }

    public void crearPDFPersonas(String nombreDocumento, List<Persona> listaPersonas) {
        try {
            // Crear una instancia del documento PDF
            Document documento = new Document();

            // Inicializar PdfWriter
            PdfWriter.getInstance(documento, new FileOutputStream(nombreDocumento));

            // Abrir el documento
            documento.open();

            if (listaPersonas.isEmpty()) {
                System.out.println("La lista que esta intentando utilizar esta vacia.");
            } else {

                // Imprimir texto en el PDF
                int indice = 0;

                for (Persona persona : listaPersonas) {

                    Paragraph paragraph = new Paragraph();
                    indice++;
                    documento.add(new Paragraph(indice + "- " + persona.getNombre() + " " + persona.getApellido() + " con el DNI: " + persona.getDni()));
                    documento.add(paragraph);

                }
                documento.close();
                System.out.println("PDF creado");
            }
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        }

    }

    public void crearPDFPartidos() {
        try {
            // Crear una instancia del documento PDF
            Document documento = new Document();

            // Inicializar PdfWriter
            PdfWriter.getInstance(documento, new FileOutputStream(namePartidosJugados));

            // Abrir el documento
            documento.open();

            if (Gestor.getInstancia().getListaPartidos().isEmpty()) {
                System.out.println("La lista que esta intentando utilizar esta vacia.");
            } else {
                // Imprimir texto en el PDF
                int indice = 0;

                for (Partido partido : Gestor.getInstancia().getListaPartidos()) {

                    Paragraph paragraph = new Paragraph();
                    indice++;
                    documento.add(new Paragraph(indice + " - " + "Partido jugado contra " + partido.getEquipoRival() + " finalizo con un resultado de: " + partido.getResultado()));
                    documento.add(paragraph);

                }
                documento.close();
                System.out.println("PDF creado");
            }
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        }

    }

    public void crearPDFNominas() {
        try {
            // Crear una instancia del documento PDF
            Document documento = new Document();

            // Inicializar PdfWriter
            PdfWriter.getInstance(documento, new FileOutputStream(nameNominas));

            // Abrir el documento
            documento.open();

            if (Gestor.getInstancia().getListaPartidos().isEmpty()) {
                System.out.println("La lista que esta intentando utilizar esta vacia.");
            } else {
                // Imprimir texto en el PDF
                int indice = 0;

                for (Nomina nomina : Gestor.getInstancia().getListaNominas()) {

                    Paragraph paragraph = new Paragraph();
                    indice++;
                    documento.add(new Paragraph("----------------------------------------------------------------------------"));
                    documento.add(paragraph);
                    documento.add(new Paragraph("Nomina numero: " + indice));
                    documento.add(paragraph);
                    documento.add(new Paragraph("Nombre y apellidos: " + nomina.getPersona().getNombre() + " " + nomina.getPersona().getApellido()));
                    documento.add(paragraph);
                    documento.add(new Paragraph("DNI: " + nomina.getPersona().getDni()));
                    documento.add(paragraph);

                    for (Concepto concepto : nomina.getConceptos()) {
                        documento.add(new Paragraph("+++++++++++++++++++++++++++++++++++++++++++++++++++++"));
                        documento.add(paragraph);
                        documento.add(new Paragraph("Descripcion del concepto: " + concepto.getDescripcion()));
                        documento.add(paragraph);
                        documento.add(new Paragraph("Importe: " + concepto.getImporte() + " euros"));
                        documento.add(paragraph);
                        documento.add(new Paragraph("Codigo unico del concepto: " + concepto.getCodigo()));
                        documento.add(paragraph);
                    }

                }
                documento.close();
                System.out.println("PDF creado");
            }
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        }

    }
}
