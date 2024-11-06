/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q;

/**
 * Clase que representa a un directivo, que hereda de la clase Persona y tiene un cargo adicional.
 * 
 */
public class Directivo extends Persona {

    private String cargo;

    /**
     * Obtiene el cargo del directivo.
     * 
     * @return el cargo del directivo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Establece el cargo del directivo.
     * 
     * @param cargo el cargo a establecer
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Constructor de la clase Directivo.
     * 
     * @param nombre Nombre del directivo
     * @param apellido Apellido del directivo
     * @param dni Documento Nacional de Identidad del directivo
     * @param telefono Número de teléfono del directivo
     * @param cargo Cargo del directivo en la organización
     */
    public Directivo(String nombre, String apellido, String dni, int telefono, String cargo) {
        super(dni, apellido, nombre, telefono);
        this.cargo = cargo;
    }

}
