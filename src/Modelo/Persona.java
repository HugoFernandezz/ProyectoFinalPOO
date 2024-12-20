package Modelo;

import java.util.Date;

/**
 * Clase abstracta que representa una persona, base para otros tipos de personas
 * como jugadores o empleados. La clase incluye información personal como el
 * nombre, apellido, DNI, teléfono, y estado dentro del club, así como detalles
 * sobre la nómina y el día de despido si corresponde.
 *
 * @author HugoFDZ
 */
public abstract class Persona {

    // Mis variables
    protected final String dni;
    /**
     * El DNI de la persona, único e inmutable
     */
    protected String nombre;
    /**
     * El nombre de la persona
     */
    private String apellido;
    /**
     * El apellido de la persona
     */
    protected int telefono;
    /**
     * El número de teléfono de la persona
     */
    private boolean isOnClub = true;
    /**
     * Indica si la persona sigue perteneciendo al club (true = sí)
     */
    private Date diaDespido;
    /**
     * La fecha en la que la persona fue despedida, si aplica
     */
    private Nomina nomina;

    /**
     * La nómina asociada a la persona
     */


    /**
     * Constructor de la clase Persona. Inicializa los datos básicos de la
     * persona, como el DNI, nombre, apellido, teléfono, y la agrega al gestor
     * de personas.
     *
     * @param dni El DNI de la persona
     * @param apellido El apellido de la persona
     * @param nombre El nombre de la persona
     * @param telefono El número de teléfono de la persona
     */
    public Persona(String dni, String apellido, String nombre, int telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        Gestor.getInstancia().agregarPersona(this);
    }

    // Mis métodos
    /**
     * Obtiene el DNI de la persona.
     *
     * @return El DNI de la persona
     */
    public String getDni() {
        return dni;
    }

    /**
     * Obtiene el nombre de la persona.
     *
     * @return El nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     *
     * @param nombre El nombre a asignar
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
        System.out.println("Nombre actualizado a " + this.nombre);
    }

    /**
     * Obtiene el número de teléfono de la persona.
     *
     * @return El número de teléfono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono de la persona.
     *
     * @param telefono El número de teléfono a asignar
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
        System.out.println("Teléfono actualizado a " + this.telefono);
    }

    /**
     * Obtiene el estado de la persona en el club.
     *
     * @return true si la persona sigue en el club, false si ha sido despedida
     */
    public boolean isIsOnClub() {
        return isOnClub;
    }

    /**
     * Establece si la persona sigue perteneciendo al club o ha sido despedida.
     *
     * @param isOnClub true si la persona está en el club, false si ha sido
     * despedida
     */
    public void setIsOnClub(boolean isOnClub) {
        this.isOnClub = isOnClub;
    }

    /**
     * Obtiene la fecha en la que la persona fue despedida, si aplica.
     *
     * @return La fecha de despido de la persona
     */
    public Date getDiaDespido() {
        return diaDespido;
    }

    /**
     * Establece la fecha de despido de la persona.
     *
     * @param diaDespido La fecha en la que la persona fue despedida
     */
    public void setDiaDespido(Date diaDespido) {
        this.diaDespido = diaDespido;
    }

    /**
     * Obtiene la nómina asociada a la persona.
     *
     * @return La nómina de la persona
     */
    public Nomina getNomina() {
        return nomina;
    }

    /**
     * Establece la nómina asociada a la persona.
     *
     * @param nomina La nómina a asignar
     */
    public void setNomina(Nomina nomina) {
        this.nomina = nomina;
    }

    /**
     * Obtiene el apellido de la persona.
     *
     * @return El apellido de la persona
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido de la persona.
     *
     * @param apellido El apellido a asignar
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + ". Rol: " + this.getClass().getSimpleName();
    }
    
    
}
