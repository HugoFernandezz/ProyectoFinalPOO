/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q;

/**
 *
 * @author HugoFDZ
 */
public class Resultado {

    private int golesLocal;
    private int golesVisitante;

    public Resultado(int golesLocal, int golesVisitante) {
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }
    

    /**
     * @return the golesLocal
     */
    public int getGolesLocal() {
        return golesLocal;
    }

    /**
     * @param golesLocal the golesLocal to set
     */
    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    /**
     * @return the golesVisitante
     */
    public int getGolesVisitante() {
        return golesVisitante;
    }

    /**
     * @param golesVisitante the golesVisitante to set
     */
    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

}
