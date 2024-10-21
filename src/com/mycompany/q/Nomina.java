/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HugoFDZ
 */
public class Nomina {

    private Meses mes;
    private int ano;
    private List<Concepto> conceptos = new ArrayList<>();
    private Persona persona;

    public Nomina(Meses mes, int ano, Concepto concepto, Persona persona) {
        this(mes, ano, concepto); // Delegación al constructor más básico
        this.persona = persona;
    }

    // Constructor básico
    public Nomina(Meses mes, int ano, Concepto concepto) {
        this.mes = mes;
        this.ano = ano;
        conceptos.add(concepto);
        Gestor.getInstancia().agregarNomina(this); 
    }

    public Nomina(Nomina otra) {
        this.mes = otra.mes;
        this.ano = otra.ano;
        conceptos.addAll(otra.getConceptos());
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

    /**
     * @return the conceptos
     */
    public List<Concepto> getConceptos() {
        return conceptos;
    }

    /**
     * @param conceptos the conceptos to set
     */
    public void setConceptos(List<Concepto> conceptos) {
        this.conceptos = conceptos;
    }

    public void setConcepto(Concepto concepto) {
        conceptos.add(concepto);
    }

    public Concepto getConceptos(int indice) {
        return conceptos.get(indice - 1);
    }

    public void modificarConceptoIndex(Concepto concepto, int indice) {
        conceptos.remove(indice - 1);
        conceptos.add(indice - 1, concepto);
        System.out.println("Concepto modificado con exito!");
    }

    public Concepto deleteConcepto(int indice) {
        System.out.println("Concepto eliminado con exito");
        return conceptos.remove(indice - 1);
    }

}
