package Modelo;

/**
 * Clase que representa a un jugador, extendiendo de la clase {@link Persona}.
 * Incluye atributos relacionados con la demarcación, edad, valor de mercado y estado físico del jugador.
 * 
 * @author HugoFDZ
 */
public class Jugador extends Persona {

    // Mis variables
    private Demarcacion demarcacion;
    private int edad;
    private int valorMercado;
    private boolean estadoFisico;

    /**
     * Constructor que inicializa los atributos de un jugador.
     * 
     * @param nombre el nombre del jugador
     * @param apellido el apellido del jugador
     * @param telefono el número de teléfono del jugador
     * @param demarcacion la demarcación del jugador (ej. delantero, defensa)
     * @param edad la edad del jugador
     * @param valorMercado el valor de mercado del jugador en unidades monetarias
     * @param estadoFisico el estado físico del jugador (activo/inactivo)
     * @param dni el DNI del jugador
     */
    public Jugador(String nombre, String apellido, int telefono, Demarcacion demarcacion, int edad, int valorMercado, boolean estadoFisico, String dni) {
        super(dni, apellido, nombre, telefono);
        this.demarcacion = demarcacion;
        this.edad = edad;
        this.valorMercado = valorMercado;
        this.estadoFisico = estadoFisico;
    }

    /**
     * Obtiene la demarcación del jugador.
     * 
     * @return la demarcación del jugador
     */
    public Demarcacion getDemarcacion() {
        return demarcacion;
    }

    /**
     * Establece la demarcación del jugador.
     * 
     * @param demarcacion la demarcación a establecer
     */
    public void setDemarcacion(Demarcacion demarcacion) {
        this.demarcacion = demarcacion;
    }

    /**
     * Obtiene la edad del jugador.
     * 
     * @return la edad del jugador
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad del jugador.
     * 
     * @param edad la edad a establecer
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Obtiene el valor de mercado del jugador.
     * 
     * @return el valor de mercado del jugador
     */
    public int getValorMercado() {
        return valorMercado;
    }

    /**
     * Establece el valor de mercado del jugador.
     * 
     * @param valorMercado el valor de mercado a establecer
     */
    public void setValorMercado(int valorMercado) {
        this.valorMercado = valorMercado;
    }

    /**
     * Obtiene el estado físico del jugador.
     * 
     * @return true si el jugador está en buen estado físico, false si no
     */
    public boolean isEstadoFisico() {
        return estadoFisico;
    }

    /**
     * Establece el estado físico del jugador.
     * 
     * @param estadoFisico el estado físico a establecer (true si está en buen estado, false si no)
     */
    public void setEstadoFisico(boolean estadoFisico) {
        this.estadoFisico = estadoFisico;
    }

}
