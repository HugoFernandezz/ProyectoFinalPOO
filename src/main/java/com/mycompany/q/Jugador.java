/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q;

/**
 *
 * @author HugoFDZ
 */
public class Jugador extends Persona {

    //Mis variables
    private String apellidos;
    private Demarcacion demarcacion;
    private int edad;
    private int valorMercado;
    private boolean estadoFisico;

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the demarcacion
     */
    public Demarcacion getDemarcacion() {
        return demarcacion;
    }

    /**
     * @param demarcacion the demarcacion to set
     */
    public void setDemarcacion(Demarcacion demarcacion) {
        this.demarcacion = demarcacion;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the valorMercado
     */
    public int getValorMercado() {
        return valorMercado;
    }

    /**
     * @param valorMercado the valorMercado to set
     */
    public void setValorMercado(int valorMercado) {
        this.valorMercado = valorMercado;
    }

    /**
     * @return the estadoFisico
     */
    public boolean isEstadoFisico() {
        return estadoFisico;
    }

    /**
     * @param estadoFisico the estadoFisico to set
     */
    public void setEstadoFisico(boolean estadoFisico) {
        this.estadoFisico = estadoFisico;
    }

    public Jugador(String nombre, String apellidos, int telefono, Demarcacion demarcacion, int edad, int valorMercado, boolean estadoFisico, String dni) {
        super(dni, nombre, telefono);
        this.apellidos = apellidos;
        this.demarcacion = demarcacion;
        this.edad = edad;
        this.valorMercado = valorMercado;
        this.estadoFisico = estadoFisico;
        
        
    }

}
