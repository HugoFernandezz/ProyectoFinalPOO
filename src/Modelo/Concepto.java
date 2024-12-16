package Modelo;

/**
 * Clase que representa un concepto con un código, una descripción y un importe.
 * 
 */
public class Concepto {

    private String codigo;
    private String descripcion;
    private float importe;

    /**
     * Constructor de la clase Concepto.
     * 
     * @param codigo Código del concepto
     * @param descripcion Descripción del concepto
     * @param importe Importe asociado al concepto
     */
    public Concepto(String codigo, String descripcion, float importe) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.importe = importe;
    }

    /**
     * Obtiene el código del concepto.
     * 
     * @return el código del concepto
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Establece el código del concepto.
     * 
     * @param codigo el código a establecer
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Obtiene la descripción del concepto.
     * 
     * @return la descripción del concepto
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Establece la descripción del concepto.
     * 
     * @param descripcion la descripción a establecer
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Obtiene el importe del concepto.
     * 
     * @return el importe del concepto
     */
    public float getImporte() {
        return importe;
    }

    /**
     * Establece el importe del concepto.
     * 
     * @param importe el importe a establecer
     */
    public void setImporte(int importe) {
        this.importe = importe;
    }

}
