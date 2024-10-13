/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author HugoFDZ
 */
public class Partido {

    private Resultado resultado;
    private final String equipoRival;
    private Date fechaPartido;
    private boolean isLocal;    //isLocal = true es que el usuario es local
    private List<Jugador> jugadores = new ArrayList<Jugador>();

    
    public Partido(String equipoRival, boolean isLocal, int golesLocales, int golesVisitante) {
        Date diaPartido = new Date();
        setResultado(new Resultado(golesLocales, golesVisitante));
        this.resultado = resultado;
        this.equipoRival = equipoRival;
        this.isLocal = isLocal;
        setFechaPartido(diaPartido);
        Gestor.getInstancia().agregarPartido(this);
    }
    
    /**
     * @return the resultado
     */
    public String getResultado() {
       String resultado = Integer.toString(this.resultado.getGolesLocal()) + " - " + Integer.toString(this.resultado.getGolesVisitante());
       return resultado;
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }

    /**
     * @return the equipoRival
     */
    public String getEquipoRival() {
        return equipoRival;
    }


    /**
     * @return the fechaPartido
     */
    public Date getFechaPartido() {
        return fechaPartido;
    }

    /**
     * @param fechaPartido the fechaPartido to set
     */
    public void setFechaPartido(Date fechaPartido) {
        this.fechaPartido = fechaPartido;
    }

    /**
     * @return the isLocal
     */
    public boolean isIsLocal() {
        return isLocal;
    }

    /**
     * @param isLocal the isLocal to set
     */
    public void setIsLocal(boolean isLocal) {
        this.isLocal = isLocal;
    }

    /**
     * @return the jugadores
     */
    public List<Jugador> getJugadores() {
        return jugadores;
    }

    /**
     * @param jugadores the jugadores to set
     */
    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    
}
