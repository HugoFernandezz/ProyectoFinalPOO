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
public class Factura {

    private String codigoUnico;
    private float cantidad;
    private String fechaPago;
    private Cliente cliente;
    private List<Factura> facturas = new ArrayList<Factura>();

    
    /**
     * 
     * @param codigoUnico
     * @param cantidad
     * @param fechaPago
     * @param cliente 
     */
    public Factura(String codigoUnico, float cantidad, String fechaPago, Cliente cliente) {
        this.codigoUnico = codigoUnico;
        this.cantidad = cantidad;
        this.fechaPago = fechaPago;
        this.cliente = cliente;
        facturas.add(this);
    }
    

    /**
     * @return the codigoUnico
     */
    public String getCodigoUnico() {
        return codigoUnico;
    }

    /**
     * @param codigoUnico the codigoUnico to set
     */
    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    /**
     * @return the cantidad
     */
    public float getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the fechaPago
     */
    public String getFechaPago() {
        return fechaPago;
    }

    /**
     * @param fechaPago the fechaPago to set
     */
    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the facturas
     */
    public List<Factura> getFacturas() {
        return facturas;
    }

    /**
     * @param facturas the facturas to set
     */
    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }
    
    /**
     * @param facturas the factura to set
     */
    public void setFacturas(Factura factura) {
        facturas.add(factura);
    }
    

    
}
