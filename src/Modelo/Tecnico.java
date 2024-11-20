package Modelo;

/**
 * Clase que representa a un técnico en el ámbito deportivo, que es una extensión de la clase Persona.
 * Un técnico tiene un puesto dentro del equipo (entrenador, preparador, analista, scout) y una especialidad
 * relacionada con su área de experiencia o formación.
 * 
 * @author HugoFDZ
 */
public class Tecnico extends Persona {

    private Puesto puesto;
    private Especialidad especialidad;

    /**
     * Constructor para crear un objeto de la clase Tecnico.
     * 
     * @param nombre El nombre del técnico.
     * @param apellido El apellido del técnico.
     * @param telefono El número de teléfono del técnico.
     * @param puesto El puesto que ocupa el técnico en el equipo (por ejemplo, entrenador, preparador, analista, scout).
     * @param especialidad La especialidad del técnico (por ejemplo, defensa, ataque, etc.).
     * @param dni El DNI del técnico.
     */
    public Tecnico(String nombre, String apellido, int telefono, Puesto puesto, Especialidad especialidad, String dni) {
        super(dni, apellido, nombre, telefono);
        this.puesto = puesto;
        this.especialidad = especialidad;
    }

    /**
     * Obtiene el puesto del técnico.
     * 
     * @return El puesto del técnico (entrenador, preparador, analista, scout).
     */
    public Puesto getPuesto() {
        return puesto;
    }

    /**
     * Establece el puesto del técnico.
     * 
     * @param puesto El puesto a asignar al técnico.
     */
    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    /**
     * Obtiene la especialidad del técnico.
     * 
     * @return La especialidad del técnico.
     */
    public Especialidad getEspecialidad() {
        return especialidad;
    }

    /**
     * Establece la especialidad del técnico.
     * 
     * @param especialidad La especialidad a asignar al técnico.
     */
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
}
