package Modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Clase que representa un partido de fútbol entre el equipo local y un equipo
 * rival. La clase incluye el resultado del partido, la fecha en la que se jugó,
 * si el equipo es local o visitante, y los jugadores que participaron en el
 * partido.
 * 
 * Además de los métodos para obtener y modificar la información del partido,
 * esta clase maneja los detalles del resultado, como los goles de ambos
 * equipos.
 *
 * @author HugoFDZ
 */
public class Partido {

    private Resultado resultado;
    /**
     * El resultado del partido (goles locales y visitantes)
     */
    private final String equipoRival;
    /**
     * El equipo rival al que se enfrentó el equipo local
     */
    private Date fechaPartido;
    /**
     * La fecha en la que se jugó el partido
     */
    private boolean isLocal;
    /**
     * Indica si el equipo es local (true) o visitante (false)
     */
    private List<Jugador> jugadores = new ArrayList<Jugador>();

    /**
     * Lista de los jugadores que participaron en el partido
     */


    /**
     * Constructor de la clase Partido. Crea un partido con el equipo rival, si
     * el equipo es local, y los goles de ambos equipos. Además, se asigna la
     * fecha del partido y se agrega el partido a la lista de partidos del
     * gestor.
     *
     * @param equipoRival El nombre del equipo rival
     * @param isLocal Indica si el equipo es local (true) o visitante (false)
     * @param golesLocales El número de goles marcados por el equipo local
     * @param golesVisitante El número de goles marcados por el equipo visitante
     */
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
     * Obtiene el resultado del partido como una cadena de texto.
     *
     * @return El resultado del partido en formato "golesLocales -
     * golesVisitante"
     */
    public String getResultado() {
        String resultado = Integer.toString(this.resultado.getGolesLocal()) + " - " + Integer.toString(this.resultado.getGolesVisitante());
        return resultado;
    }

    /**
     * Establece el resultado del partido.
     *
     * @param resultado El resultado del partido (goles del equipo local y
     * visitante)
     */
    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }

    /**
     * Obtiene el nombre del equipo rival.
     *
     * @return El nombre del equipo rival
     */
    public String getEquipoRival() {
        return equipoRival;
    }

    /**
     * Obtiene la fecha en la que se jugó el partido.
     *
     * @return La fecha del partido
     */
    public Date getFechaPartido() {
        return fechaPartido;
    }

    /**
     * Establece la fecha en la que se jugó el partido.
     *
     * @param fechaPartido La fecha del partido
     */
    public void setFechaPartido(Date fechaPartido) {
        this.fechaPartido = fechaPartido;
    }

    /**
     * Obtiene si el equipo es local en el partido.
     *
     * @return true si el equipo es local, false si es visitante
     */
    public boolean GetIsLocal() {
        return isLocal;
    }

    /**
     * Establece si el equipo es local en el partido.
     *
     * @param isLocal true si el equipo es local, false si es visitante
     */
    public void setIsLocal(boolean isLocal) {
        this.isLocal = isLocal;
    }

    /**
     * Obtiene la lista de jugadores que participaron en el partido.
     *
     * @return La lista de jugadores
     */
    public List<Jugador> getJugadores() {
        return jugadores;
    }

    /**
     * Establece la lista de jugadores que participaron en el partido.
     *
     * @param jugadores La lista de jugadores que participaron en el partido
     */
    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
}
