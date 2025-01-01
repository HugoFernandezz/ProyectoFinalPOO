/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package Modelo;

import Controlador.ControladorPrincipal;

/**
 *
 * @author HugoFDZ
 */
public class App {

    public static void main(String[] args) {

        // <editor-fold defaultstate="collapsed" desc="Personas inicializadas">
// Porteros
        Jugador erikSantiago = new Jugador("Erik", "Santiago", 612345678, Demarcacion.portero, 28, 500000, true, "12345678A");
        Jugador manuGarcia = new Jugador("Manu", "Garcia", 612345679, Demarcacion.portero, 30, 600000, true, "23456789B");
        Jugador ikerPiedra = new Jugador("Iker", "Piedra", 612345680, Demarcacion.portero, 25, 400000, true, "34567890C");
        Jugador gianniCassaro = new Jugador("Gianni", "Cassaro", 612345681, Demarcacion.portero, 27, 550000, true, "45678901D");

// Defensas
        Jugador andresLopez = new Jugador("Andres", "Lopez", 612345682, Demarcacion.defensaCentral, 29, 700000, true, "56789012E");
        Jugador enolCoto = new Jugador("Enol", "Coto", 612345683, Demarcacion.lateral, 26, 450000, true, "67890123F");
        Jugador joseRuiz = new Jugador("Jose", "Ruiz", 612345684, Demarcacion.lateral, 24, 400000, true, "78901234G");
        Jugador marcBaro = new Jugador("Marc", "Baro", 612345685, Demarcacion.lateral, 27, 500000, true, "89012345H");
        Jugador marcosMauro = new Jugador("Marcos", "Mauro", 612345686, Demarcacion.defensaCentral, 30, 750000, true, "90123456I");
        Jugador alexZalaya = new Jugador("Alex", "Zalaya", 612345687, Demarcacion.defensaCentral, 25, 600000, true, "01234567J");
        Jugador albertoGonzalez = new Jugador("Alberto", "Gonzalez", 612345688, Demarcacion.defensaCentral, 28, 650000, true, "12345678K");
        Jugador victorRofino = new Jugador("Victor", "Rofino", 612345689, Demarcacion.defensaCentral, 29, 700000, true, "23456789L");
        Jugador sergioSantos = new Jugador("Sergio", "Santos", 612345690, Demarcacion.lateral, 26, 450000, true, "34567890M");
        Jugador juniorHernandez = new Jugador("Junior", "Hernandez", 612345691, Demarcacion.defensaCentral, 24, 400000, true, "45678901N");
        Jugador juandeGarcia = new Jugador("Juande", "Garcia", 612345692, Demarcacion.defensa, 27, 500000, true, "56789012O");

// Centrocampistas
        Jugador antonioToral = new Jugador("Antonio", "Toral", 612345693, Demarcacion.medioCentro, 28, 600000, true, "67890123P");
        Jugador sabitAbdulai = new Jugador("Sabit", "Abdulai", 612345694, Demarcacion.medioCentro, 25, 450000, true, "78901234Q");
        Jugador leandroDuarte = new Jugador("Leandro", "Duarte", 612345695, Demarcacion.centrocampista, 27, 550000, true, "89012345R");
        Jugador totti = new Jugador("Totti", "Totti", 612345696, Demarcacion.medioCentro, 29, 700000, true, "90123456S");
        Jugador ismaelFerrer = new Jugador("Ismael", "Ferrer", 612345697, Demarcacion.extremo, 26, 500000, true, "01234567T");
        Jugador isiGomez = new Jugador("Isi", "Gomez", 612345698, Demarcacion.medioCentro, 24, 400000, true, "12345678U");
        Jugador pabloLarrea = new Jugador("Pablo", "Larrea", 612345699, Demarcacion.medioCentro, 28, 650000, true, "23456789V");
        Jugador pedroLeon = new Jugador("Pedro", "Leon", 612345700, Demarcacion.mediaPunta, 30, 750000, true, "34567890W");
        Jugador angelMontoro = new Jugador("Angel", "Montoro", 612345701, Demarcacion.medioCentro, 27, 600000, true, "45678901X");
        Jugador tomasPina = new Jugador("Tomas", "Pina", 612345702, Demarcacion.medioCentro, 29, 700000, true, "56789012Y");
        Jugador arturoMolina = new Jugador("Arturo", "Molina", 612345703, Demarcacion.mediaPunta, 26, 500000, true, "67890123Z");
        Jugador imanolAlonso = new Jugador("Imanol", "Alonso", 612345704, Demarcacion.medioCentro, 25, 450000, true, "78901234A");

// Delanteros
        Jugador rodriRios = new Jugador("Rodri", "Rios", 612345705, Demarcacion.delanteroCentro, 28, 600000, true, "89012345B");
        Jugador joseAngelCarrillo = new Jugador("Jose Angel", "Carrillo", 612345706, Demarcacion.delanteroCentro, 29, 650000, true, "90123456C");
        Jugador daniVega = new Jugador("Dani", "Vega", 612345707, Demarcacion.extremo, 27, 550000, true, "01234567D");
        Jugador carlosRojas = new Jugador("Carlos", "Rojas", 612345708, Demarcacion.extremo, 24, 400000, true, "12345678E");
        Jugador alexRubio = new Jugador("Alex", "Rubio", 612345709, Demarcacion.extremo, 26, 500000, true, "23456789F");

        // Técnicos
        Tecnico Carlos = new Tecnico("Carlos", "Martinez", 612345600, Puesto.entrenador, Especialidad.principal, "34567890Z");
        Tecnico Miguel = new Tecnico("Miguel", "Sanchez", 612345601, Puesto.preparador, Especialidad.ayudante, "45678901Y");
        Tecnico Javier = new Tecnico("Javier", "Fernandez", 612345602, Puesto.analista, Especialidad.principal, "56789012X");
        Tecnico Roberto = new Tecnico("Roberto", "Garcia", 612345603, Puesto.scout, Especialidad.ayudante, "67890123W");
        Tecnico Alberto = new Tecnico("Alberto", "Gomez", 612345604, Puesto.preparador, Especialidad.porteros, "78901234V");

// Directivos
        Directivo Luis = new Directivo("Luis", "Perez", "23456789Z", 612345600, "Presidente");
        Directivo Ana = new Directivo("Ana", "Rodriguez", "34567890Y", 612345601, "Director Deportivo");
        Directivo Jorge = new Directivo("Jorge", "Martinez", "45678901X", 612345602, "Gerente General");
        Directivo Marta = new Directivo("Marta", "Fernandez", "56789012W", 612345603, "Jefe de Finanzas");
        Directivo Juan = new Directivo("Juan", "Lopez", "67890123V", 612345604, "Responsable de Marketing");

        // </editor-fold>
        /** Se crea la instancia principal que inicializa la ventana (MainWindow) 
        y todos los controladores de la aplicación, quedando lista para su uso.*/ 
        ControladorPrincipal controladorPrincipal = new ControladorPrincipal();

    }
}
