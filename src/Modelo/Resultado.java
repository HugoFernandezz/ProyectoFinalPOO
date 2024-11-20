package Modelo;

/**
 * Clase que representa el resultado de un partido de fútbol, con los goles anotados por el equipo local y el visitante.
 * La clase contiene métodos para obtener y modificar los goles de ambos equipos.
 * 
 * @author HugoFDZ
 */
public class Resultado {

    private int golesLocal;
    private int golesVisitante;

    /**
     * Constructor que inicializa el resultado del partido con los goles de ambos equipos.
     * 
     * @param golesLocal Los goles anotados por el equipo local.
     * @param golesVisitante Los goles anotados por el equipo visitante.
     */
    public Resultado(int golesLocal, int golesVisitante) {
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }

    /**
     * Obtiene el número de goles anotados por el equipo local.
     * 
     * @return El número de goles del equipo local.
     */
    public int getGolesLocal() {
        return golesLocal;
    }

    /**
     * Establece el número de goles anotados por el equipo local.
     * 
     * @param golesLocal El número de goles del equipo local.
     */
    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    /**
     * Obtiene el número de goles anotados por el equipo visitante.
     * 
     * @return El número de goles del equipo visitante.
     */
    public int getGolesVisitante() {
        return golesVisitante;
    }

    /**
     * Establece el número de goles anotados por el equipo visitante.
     * 
     * @param golesVisitante El número de goles del equipo visitante.
     */
    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }
}
