/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HugoFDZ
 */
public class Gestor {

    // Atributo privado estático para la única instancia de la clase
    private static Gestor gestor;

    private List<Persona> listaPersonas = new ArrayList();
    private List<Partido> listaPartidos = new ArrayList();
    private List<Nomina> listaNominas = new ArrayList();

    // Constructor privado para evitar la creación de instancias externas
    private Gestor() {
        this.listaPersonas = new ArrayList<>();
    }

    // Método público estático para obtener la instancia única (Singleton pattern)
    public static Gestor getInstancia() {
        if (gestor == null) {
            gestor = new Gestor();
        }
        return gestor;
    }

    /**
     * @param persona add person to listaPersonas
     */
    public void agregarPersona(Persona persona) {
        listaPersonas.add(persona);
    }

    /**
     * @param persona the Persona in listaPersonas to delete
     */
    public void eliminarPersona(Persona persona) {
        listaPersonas.remove(persona);
    }

    /**
     * @param indice the listaPersonas to delete by index
     */
    public void eliminarPersona(int indice) {
        Date diaDespido = new Date();
        if (indice >= listaPersonas.size() || indice <= 0) {
            System.err.print("Error, el indice seleccionado no existe\n");
        } else {
            String nombrePersonaBorrada = listaPersonas.get(indice - 1).getNombre();
            listaPersonas.get(indice - 1).setIsOnClub(false);
            listaPersonas.get(indice - 1).setDiaDespido(diaDespido);
            System.out.println("-----------------------------------------\n" + nombrePersonaBorrada + " ha sido borrado con exito!. \n-----------------------------------------\n\n");
        }

    }

    public void mostrarListaPersonas() {
        int indice = 0;
        System.out.println("Las personas dadas de alta ahora mismo son: ");
        for (Persona persona : listaPersonas) {
            if (persona.isIsOnClub()) {
                indice++;
                System.out.println(indice + " - " + "Rol: " + persona.getClass().getSimpleName() + ". Nombre: " + persona.getNombre() + ", con el dni: " + persona.getDni());
            }

        }
        System.out.println("");
    }

    /**
     * @param indice returns Persona in listaPersona by index
     * @return Persona
     */
    public Persona recuperarPersona(int indice) {
        if (indice < 1 || indice > listaPersonas.size()) {
            System.err.println("Error, el indice seleccionado no existe.");
            return null;
        }
        return listaPersonas.get(indice - 1);
    }

    /**
     * @return the listaPartidos
     */
    public List<Partido> getListaPartidos() {
        return listaPartidos;
    }

    /**
     * @param listaPartidos the listaPartidos to set
     */
    public void setListaPartidos(List<Partido> listaPartidos) {
        this.listaPartidos = listaPartidos;
    }

    public void agregarPartido(Partido partido) {
        listaPartidos.add(partido);
    }

    /**
     * @return the listaNominas
     */
    public List<Nomina> getListaNominas() {
        return listaNominas;
    }

    public void agregarNomina(Nomina nomina) {
        listaNominas.add(nomina);
    }

    /**
     * @return Persona deploying menu to search by DNI
     */
    public Persona recuperarPersonaDNI() {
        while (true) {
            Scanner inputReader = new Scanner(System.in); // Reading from System.in
            String dni = inputReader.next();
            inputReader.nextLine();  // Consumir el salto de línea
            for (Persona persona : listaPersonas) {
                if (persona.getDni().equals(dni)) {
                    return persona;
                }
            }
            System.out.println("No se encontro a ninguna persona con el DNI: " + dni + " \nIntroduzca el DNI de nuevo.");
        }
    }

    public List<Persona> listaPersonasSortedDNI(List<Persona> lista) {

        List<Persona> myNewListPersona = new ArrayList(listaPersonas);
        //Chequeo que las personas estan activas en el club y las guardo en mi lista pivote
        for (Persona persona : lista) {
            if (persona.isIsOnClub()) {
                myNewListPersona.add(persona);
            }
        }
        //La expresion "Persona::getDni" es una referencia a metodos, esta llama al metodo getDni de la clase Persona
        myNewListPersona.sort(Comparator.comparing(Persona::getDni));

        return myNewListPersona;
    }

    public List<Persona> listaPersonasFueraClub(List<Persona> lista) {

        List<Persona> myNewListPersona = new ArrayList();
        for (Persona persona : lista) {
            if (!persona.isIsOnClub()) {
                myNewListPersona.add(persona);
            }
        }

        myNewListPersona.sort(
                Comparator.comparing(Persona::getNombre)
                        .thenComparing(Persona::getApellido)
        );

        return myNewListPersona;
    }

    // <editor-fold defaultstate="collapsed" desc="Metodos generadores de archivos texto">
    public void validarFichero(File file) {
        // Si el archivo no existe, lo creamos
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("El archivo " + file.toString() + ".txt ha sido creado.");
            } catch (IOException e) {
                System.out.println("Error al crear el archivo: " + e.getMessage());
            }
        } else {
            System.out.println("El archivo de texto con la informacion sobre todos los empleados ya se genero anteriormente.");
        }
    }

    public void generadoresDeEmpleados() {

        File empleadosFichero = new File("empleadosFichero.txt");
        validarFichero(empleadosFichero);

        /*BufferedWriter es un buffer que optimiza la escritura en archivos, acumulando
        texto en un buffer antes de escribirlo al disco, lo que mejora el rendimiento.*/
 /*El parametro false en el constructor del FileWriter indica que quiero que se sobreescriba la informacion y no se añada.*/
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(empleadosFichero, false))) {
            int indice = 0;

            for (Persona persona : listaPersonasSortedDNI(listaPersonas)) {
                indice++;
                writer.write(indice + "- " + persona.getNombre() + " " + persona.getApellido() + " con el DNI: " + persona.getDni());
                writer.newLine(); // Para hacer un salto de línea
            }

            System.out.println("Informacion del empleado escrita en el archivo.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }

    }

    public void generarEmpleadosEliminados() {
        File empleadosEliminadosFichero = new File("empleadosEliminados.txt");
        validarFichero(empleadosEliminadosFichero);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(empleadosEliminadosFichero, false))) {
            int indice = 0;

            for (Persona persona : listaPersonasFueraClub(listaPersonas)) {
                indice++;
                writer.write(indice + "- " + persona.getNombre() + " " + persona.getApellido() + " con el DNI: " + persona.getDni());
                writer.newLine(); // Para hacer un salto de línea
            }

            if (listaPersonasFueraClub(listaPersonas).size() == 0) {
                writer.write("No hay ninguna persona fuera del club");
            }

            System.out.println("Informacion de los empleados eliminados escrita en el archivo.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    public void generarListaPartidos() {
        File listadoPartidosFichero = new File("listadoPartidosFichero.txt");
        validarFichero(listadoPartidosFichero);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(listadoPartidosFichero, false))) {
            int indice = 0;

            for (Partido partido : getListaPartidos()) {
                indice++;
                writer.write(indice + " - " + "Partido jugado contra " + partido.getEquipoRival() + " finalizo con un resultado de: " + partido.getResultado());
                writer.newLine(); // Para hacer un salto de línea
            }

            System.out.println("Informacion de los partidos escrita en el archivo.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }

    }

    public void generarListaNominas() {
        File listadoNominas = new File("listadoNominas.txt");
        validarFichero(listadoNominas);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(listadoNominas, false))) {
            int indice = 0;

            for (Nomina nomina : getListaNominas()) {
                indice++;
                writer.write("----------------------------------------------------------------------------");
                writer.newLine(); // Para hacer un salto de línea
                writer.write("Nomina numero: " + indice);
                writer.newLine(); // Para hacer un salto de línea
                writer.write("Nombre y apellidos: " + nomina.getPersona().getNombre() + " " + nomina.getPersona().getApellido());
                writer.newLine(); // Para hacer un salto de línea
                writer.write("DNI: " + nomina.getPersona().getDni());
                writer.newLine(); // Para hacer un salto de línea
                writer.write("Importe: " + nomina.getConcepto().getImporte() + " euros");
                writer.newLine(); // Para hacer un salto de línea
                writer.write("Identificador: " + nomina.getConcepto().getCodigo());
                writer.newLine(); // Para hacer un salto de línea
            }

            System.out.println("Informacion de las nominas escrita en el archivo.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }

    }
    // </editor-fold>
}
