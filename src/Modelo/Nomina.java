package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una nómina de un empleado, la cual incluye el mes y el año,
 * los conceptos relacionados con la nómina y la persona a la que corresponde.
 * Una nómina puede tener múltiples conceptos, cada uno con su respectiva descripción
 * y valor. La clase proporciona métodos para modificar, agregar y eliminar conceptos
 * de la nómina.
 * 
 * @author HugoFDZ
 */
public class Nomina {

    private Meses mes;              /** El mes al que corresponde la nómina */
    private int ano;                /** El año al que corresponde la nómina */
    private List<Concepto> conceptos = new ArrayList<>(); /** Lista de los conceptos asociados a la nómina */
    private Persona persona;        /** La persona a la que corresponde la nómina */

    /**
     * Constructor de la clase Nomina. Crea una nueva nómina con un mes, año y concepto
     * inicial, y asigna la persona asociada a la nómina.
     * 
     * @param mes El mes al que corresponde la nómina
     * @param ano El año al que corresponde la nómina
     * @param concepto El concepto que se añadirá a la nómina
     * @param persona La persona asociada a la nómina
     */
    public Nomina(Meses mes, int ano, Concepto concepto, Persona persona) {
        this(mes, ano, concepto); // Delegación al constructor más básico
        this.persona = persona;
    }

    /**
     * Constructor básico de la clase Nomina. Crea una nómina con un mes, año y concepto.
     * 
     * @param mes El mes al que corresponde la nómina
     * @param ano El año al que corresponde la nómina
     * @param concepto El concepto que se añadirá a la nómina
     */
    public Nomina(Meses mes, int ano, Concepto concepto) {
        this.mes = mes;
        this.ano = ano;
        conceptos.add(concepto);
        Gestor.getInstancia().agregarNomina(this); 
    }

    /**
     * Constructor de copia de la clase Nomina. Crea una nueva nómina a partir de otra existente.
     * 
     * @param otra La otra nómina de la que se copiarán los datos
     */
    public Nomina(Nomina otra) {
        this.mes = otra.mes;
        this.ano = otra.ano;
        conceptos.addAll(otra.getConceptos());
        this.persona = otra.persona;
    }

    /**
     * Obtiene el mes al que corresponde la nómina.
     * 
     * @return El mes de la nómina
     */
    public Meses getMes() {
        return mes;
    }

    /**
     * Establece el mes de la nómina.
     * 
     * @param mes El mes de la nómina
     */
    public void setMes(Meses mes) {
        this.mes = mes;
    }

    /**
     * Obtiene el año al que corresponde la nómina.
     * 
     * @return El año de la nómina
     */
    public int getAno() {
        return ano;
    }

    /**
     * Establece el año de la nómina.
     * 
     * @param ano El año de la nómina
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * Obtiene la persona asociada a la nómina.
     * 
     * @return La persona asociada a la nómina
     */
    public Persona getPersona() {
        return persona;
    }

    /**
     * Establece la persona asociada a la nómina.
     * 
     * @param persona La persona a asignar a la nómina
     */
    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    /**
     * Obtiene la lista de conceptos de la nómina.
     * 
     * @return La lista de conceptos de la nómina
     */
    public List<Concepto> getConceptos() {
        return conceptos;
    }

    /**
     * Establece la lista de conceptos de la nómina.
     * 
     * @param conceptos La lista de conceptos a asignar
     */
    public void setConceptos(List<Concepto> conceptos) {
        this.conceptos = conceptos;
    }

    /**
     * Agrega un concepto a la lista de conceptos de la nómina.
     * 
     * @param concepto El concepto a añadir a la nómina
     */
    public void setConcepto(Concepto concepto) {
        conceptos.add(concepto);
    }

    /**
     * Obtiene un concepto de la nómina por su índice.
     * 
     * @param indice El índice del concepto en la lista
     * @return El concepto en el índice especificado
     */
    public Concepto getConceptos(int indice) {
        return conceptos.get(indice - 1);
    }

    /**
     * Modifica un concepto de la nómina en un índice específico.
     * 
     * @param concepto El nuevo concepto para reemplazar al anterior
     * @param indice El índice del concepto a modificar
     */
    public void modificarConceptoIndex(Concepto concepto, int indice) {
        conceptos.remove(indice - 1);
        conceptos.add(indice - 1, concepto);
        System.out.println("Concepto modificado con exito!");
    }

    /**
     * Elimina un concepto de la nómina en el índice especificado.
     * 
     * @param indice El índice del concepto a eliminar
     * @return El concepto eliminado de la lista
     */
    public Concepto deleteConcepto(int indice) {
        System.out.println("Concepto eliminado con exito");
        return conceptos.remove(indice - 1);
    }
}
