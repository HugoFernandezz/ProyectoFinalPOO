package Modelo;

/**
 * Clase que representa a un cliente con un CIF y un nombre.
 * 
 */
public class Cliente {

    private String cif;
    private String nombre;

    /***
     * Constructor de la clase Cliente.
     * 
     * @param cif Código de Identificación Fiscal (CIF) del cliente
     * @param nombre Nombre del cliente
     */
    public Cliente(String cif, String nombre) {
        this.cif = cif;
        this.nombre = nombre;
    }
    
   
    /**
     * Obtiene el CIF del cliente.
     * 
     * @return el CIF del cliente
     */
    public String getCif() {
        return cif;
    }

    /**
     * Establece el CIF del cliente.
     * 
     * @param cif el CIF a establecer
     */
    public void setCif(String cif) {
        this.cif = cif;
    }

    /**
     * Obtiene el nombre del cliente.
     * 
     * @return el nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente.
     * 
     * @param nombre el nombre a establecer
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
