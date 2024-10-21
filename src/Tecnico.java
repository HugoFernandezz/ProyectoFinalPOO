/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q;

/**
 *
 * @author HugoFDZ
 */
public class Tecnico extends Persona {

    private Puesto puesto;
    private Especialidad especialidad;

    public Tecnico(String nombre, String apellido, int telefono, Puesto puesto, Especialidad especialidad, String dni) {
        super(dni, apellido, nombre, telefono);
        this.puesto = puesto;
        this.especialidad = especialidad;
    }

    /**
     * @return the puesto
     */
    public Puesto getPuesto() {
        return puesto;
    }

    /**
     * @param puesto the puesto to set
     */
    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    /**
     * @return the especialidad
     */
    public Especialidad getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

}
