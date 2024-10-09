/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q;

import java.util.Date;

/**
 *
 * @author HugoFDZ
 */
public abstract class Persona {

    //Mis variables
    protected final String dni;
    protected String nombre;
    protected int telefono;
    private boolean isOnClub = true;
    private Date diaDespido;
    private Nomina nomina;

    public Persona(String dni, String nombre, int telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        Gestor.getInstancia().agregarPersona(this);
    }

    //Mis metodos
    
    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
        System.out.println("Nombre actualizado a " + this.nombre);
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
        System.out.println("Telefono actualizado a " + this.telefono);
    }

    /**
     * @return the isOnClub
     */
    public boolean isIsOnClub() {
        return isOnClub;
    }

    /**
     * @param isOnClub the isOnClub to set
     */
    public void setIsOnClub(boolean isOnClub) {
        this.isOnClub = isOnClub;
    }

    /**
     * @return the diaDespido
     */
    public Date getDiaDespido() {
        return diaDespido;
    }

    /**
     * @param diaDespido the diaDespido to set
     */
    public void setDiaDespido(Date diaDespido) {
        this.diaDespido = diaDespido;
    }

    /**
     * @return the nomina
     */
    public Nomina getNomina() {
        return nomina;
    }

    /**
     * @param nomina the nomina to set
     */
    public void setNomina(Nomina nomina) {
        this.nomina = nomina;
    }
    
    
}
