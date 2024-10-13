/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q;

/**
 *
 * @author HugoFDZ
 */
public class Nomina {
    
    private Meses mes;
    private int ano;
    private Concepto concepto;
    private Persona persona;
    
    public Nomina(Meses mes, int ano, Concepto concepto, Persona persona) {
        this(mes, ano, concepto);
        this.persona = persona;
        Gestor.getInstancia().agregarNomina(this);
    }

    public Nomina(Meses mes, int ano, Concepto concepto) {
        this.mes = mes;
        this.ano = ano;
        this.concepto = concepto;
    }
    
    public Nomina(Nomina otra) {
        this.mes = otra.mes;
        this.ano = otra.ano;
        this.concepto = otra.concepto;
        this.persona = otra.persona;
    }

    
    /**
     * @return the mes
     */
    public Meses getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(Meses mes) {
        this.mes = mes;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the concepto
     */
    public Concepto getConcepto() {
        return concepto;
    }

    /**
     * @param concepto the concepto to set
     */
    public void setConcepto(Concepto concepto) {
        this.concepto = concepto;
    }

    /**
     * @return the persona
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * @param persona the persona to set
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
}
