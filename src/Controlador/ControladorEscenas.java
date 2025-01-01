/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Persona;
import Vista.MainWindow;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JTextField;

/**
 * Controlador base para el cambio de escenas (vistas) dentro de la aplicación.
 * Ofrece métodos genéricos para cambiar entre las diferentes ventanas (cards)
 * y para comprobar la validez de campos de texto.
 * <p>
 * Este controlador es heredado por todos los controladores.
 * </p>
 * 
 * @author HugoFDZ
 */
public class ControladorEscenas {

    /**
     * Referencia a la ventana principal de la aplicación.
     */
    protected MainWindow mainWindow;

    protected int filaSeleccionada;
    protected Persona personaSeleccionada;

    /**
     * Constantes que representan los diferentes paneles (cards) de la aplicación
     * a los que se puede cambiar.
     */
    protected final String CARD_HOME = "homeWindow";
    protected final String CARD_GESTION = "gestionWindow";
    protected final String CARD_DARDEALTA = "darDeAltaWindow";
    protected final String CARD_MODIFICAR = "modificarPersonaWindow";
    protected final String CARD_JUGAR_PARTIDO = "jugarPartidoWindow";
    protected final String CARD_GASTOS = "gastosWindow";
    protected final String CARD_CREARNOMINA = "crearNominaWindow";
    protected final String CARD_FACTURA = "facturaWindow";
    protected final String CARD_MODIFICAR_CONCEPTO = "modificarConceptoWindow";
    protected final String CARD_MODIFICAR_NOMINA = "modificarNominaWindow";
    protected final String CARD_IMPRIMIR = "imprimirWindow";

    
    /**
     * Constructor que recibe una referencia a la ventana principal.
     * Si la ventana es nula, lanza una excepción para evitar 
     * comportamientos inesperados.
     *
     * @param mainWindow Instancia de {@link MainWindow}, no debe ser null.
     * @throws IllegalArgumentException Si mainWindow es null.
     */
    public ControladorEscenas(MainWindow mainWindow) {
        if (mainWindow == null) {
            throw new IllegalArgumentException("MainWindow no puede ser null.");
        }
        this.mainWindow = mainWindow;
    }

     /**
     * Cambia la vista (card) actual de la aplicación al panel indicado por 
     * el parámetro <code>destino</code>. Se basa en el uso de un {@link CardLayout}
     * para mostrar u ocultar los distintos paneles.
     *
     * @param destino Cadena que identifica la escena (card) a mostrar.
     */
    protected void cambiarEscena(String destino) {
        CardLayout cardLayout = (CardLayout) mainWindow.getPanelRaiz().getLayout();
        cardLayout.show(mainWindow.getPanelRaiz(), destino);

    }

    /**
     * Verifica si alguno de los campos de texto de la lista contiene su
     * placeholder inicial (por defecto, se ha usado "Inserte ...").
     * En caso de que al menos uno contenga el placeholder, indica que
     * no se ha rellenado.
     *
     * @param campos Lista de campos de texto a verificar.
     * @return <code>true</code> si se encuentra algún campo con el placeholder
     *         inicial, <code>false</code> en caso contrario.
     */
    protected boolean comprobarCamposVacios(List<JTextField> campos) {
        boolean campoVacio = false;
        for (JTextField campo : campos) {
            if (campo.getText().contains("Inserte ")) {
                campoVacio = true;
                return campoVacio;
            }
        }

        return campoVacio;

    }

}
