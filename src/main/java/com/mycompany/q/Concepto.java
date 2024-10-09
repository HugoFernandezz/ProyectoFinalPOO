/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q;

/**
 *
 * @author HugoFDZ
 */
public class Concepto {

    private String codigo;
    private String descripcion;
    private int importe;

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the importe
     */
    public int getImporte() {
        return importe;
    }

    /**
     * @param importe the importe to set
     */
    public void setImporte(int importe) {
        this.importe = importe;
    }

    public Concepto(String codigo, String descripcion, int importe) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.importe = importe;
    }
    

}
