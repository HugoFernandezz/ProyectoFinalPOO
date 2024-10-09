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

    public Nomina(Meses mes, int ano, Concepto concepto) {
        this.mes = mes;
        this.ano = ano;
        this.concepto = concepto;
    }

}
