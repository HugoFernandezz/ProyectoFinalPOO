/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q;

import java.util.ArrayList;
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

}
