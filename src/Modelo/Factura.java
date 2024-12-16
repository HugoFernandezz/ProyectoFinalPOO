/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license/default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una factura con un código único, cantidad, fecha de pago y cliente asociado.
 * Contiene una lista de facturas.
 * 
 */
public class Factura {

    private String codigoUnico;
    private float cantidad;
    private String fechaPago;
    private Cliente cliente;

    /**
     * Constructor que inicializa una factura con los datos proporcionados.
     * 
     * @param codigoUnico Código único de la factura
     * @param cantidad Monto de la factura
     * @param fechaPago Fecha de pago de la factura
     * @param cliente Cliente al que pertenece la factura
     */
    public Factura(String codigoUnico, float cantidad, String fechaPago, Cliente cliente) {
        this.codigoUnico = codigoUnico;
        this.cantidad = cantidad;
        this.fechaPago = fechaPago;
        this.cliente = cliente;
    }

    /**
     * Obtiene el código único de la factura.
     * 
     * @return el código único de la factura
     */
    public String getCodigoUnico() {
        return codigoUnico;
    }

    /**
     * Establece el código único de la factura.
     * 
     * @param codigoUnico el código único de la factura a establecer
     */
    public void setCodigoUnico(String codigoUnico) {
        this.codigoUnico = codigoUnico;
    }

    /**
     * Obtiene la cantidad de la factura.
     * 
     * @return la cantidad de la factura
     */
    public float getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad de la factura.
     * 
     * @param cantidad la cantidad de la factura a establecer
     */
    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Obtiene la fecha de pago de la factura.
     * 
     * @return la fecha de pago de la factura
     */
    public String getFechaPago() {
        return fechaPago;
    }

    /**
     * Establece la fecha de pago de la factura.
     * 
     * @param fechaPago la fecha de pago de la factura a establecer
     */
    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    /**
     * Obtiene el cliente asociado a la factura.
     * 
     * @return el cliente asociado a la factura
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Establece el cliente asociado a la factura.
     * 
     * @param cliente el cliente a asociar a la factura
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


}
