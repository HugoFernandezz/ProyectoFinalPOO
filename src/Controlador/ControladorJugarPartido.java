/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Gestor;
import Vista.MainWindow;
import javax.swing.JOptionPane;

/**
 * Controlador encargado de gestionar la lógica relacionada con jugar un partido.
 * Permite configurar los goles, identificar si el usuario juega en casa o
 * fuera de ella y, finalmente, registrar y mostrar el resultado del partido.
 * <p>
 * Hereda de {@link ControladorEscenas} para facilitar la navegación
 * entre ventanas (escenas).
 * </p>
 * 
 * <p><b>Autor:</b> HugoFDZ</p>
 */
public class ControladorJugarPartido extends ControladorEscenas {

    /**
     * Constructor que recibe la ventana principal ({@link MainWindow})
     * y llama al constructor de la superclase. Posteriormente, inicializa
     * los eventos necesarios para la configuración del partido.
     *
     * @param mainWindow Instancia de la ventana principal de la aplicación.
     */
    public ControladorJugarPartido(MainWindow mainWindow) {

        super(mainWindow);

        inicializarEventos();

    }
    
    /**
     * Inicializa los eventos asociados a la pantalla de jugar partido. 
     * <ul>
     *   <li>Botón para regresar a la escena principal (Home).</li>
     *   <li>Botón para confirmar y finalizar el partido, llamando a 
     *       {@link #intentarJugarPartido()}.</li>
     * </ul>
     */
    private void inicializarEventos() {

        mainWindow.getBtnHomePartido().addActionListener(e -> cambiarEscena(CARD_HOME));
         //Boton de jugar partidos
        mainWindow.getBtnTerminarPartido().addActionListener(e -> intentarJugarPartido());

    }

    /**
     * Verifica que se haya introducido el nombre del equipo rival antes 
     * de crear y terminar el partido. En caso de que no se haya especificado
     * (placeholder presente), muestra un mensaje de error.
     */
    private void intentarJugarPartido() {

        if (mainWindow.getInputNombreRival().getText().contains("Inserte el nombre del equipo rival...")) {
            JOptionPane.showMessageDialog(null, "Debe ponerle un nombre al equipo rival");
        } else {
            jugarPartido();
        }

    }

    /**
     * Registra un nuevo partido en el {@link Gestor}, tomando la información
     * introducida por el usuario: goles de local y visitante, nombre del rival
     * y si el usuario juega como local o visitante. Posteriormente,
     * muestra el resultado final.
     */
    private void jugarPartido() {
        int local = (Integer) mainWindow.getLocalGolesSpinner().getValue();
        int visitante = (Integer) mainWindow.getVisitanteGolesSpinner().getValue();
        String rival = mainWindow.getInputNombreRival().getText();
        boolean islocal = true;
        if (mainWindow.getRadioBtnVisitante().isSelected()) {
            islocal = false;
        }

        Gestor.getInstancia().crearPartido(rival, islocal, local, visitante);
        if (islocal) {
            JOptionPane.showMessageDialog(null, "Partido contra " + rival + " ha terminado con un resultado de:"
                    + "\n Local: " + local + "\n Visitante: " + visitante);
        } else {
            JOptionPane.showMessageDialog(null, "Partido contra " + rival + " ha terminado con un resultado de:"
                    + "\n Local: " + visitante + "\n Visitante: " + local);
        }

    }

}
