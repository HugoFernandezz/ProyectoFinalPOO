/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 * Clase Gestor que implementa el patrón Singleton para manejar listas de
 * personas, partidos y nóminas en un club deportivo. Proporciona métodos para
 * gestionar el registro y salida de personas, generación de archivos de texto
 * con información del club, y gestión de nóminas.
 *
 */
public class Gestor {

    /**
     * Atributo privado estático para la única instancia de la clase.
     */
    private static Gestor gestor;

    /**
     * Lista de personas registradas en el club.
     */
    private List<Persona> listaPersonas;
    /**
     * Lista de partidos jugados por el club.
     */
    private List<Partido> listaPartidos;
    /**
     * Lista de nóminas generadas para las personas del club.
     */
    private List<Nomina> listaNominas;

    /**
     * Constructor privado que inicializa las listas, evitando la creación de
     * instancias externas de la clase.
     */
    private Gestor() {
        this.listaPersonas = new ArrayList<>();
        this.listaPartidos = new ArrayList<>();
        this.listaNominas = new ArrayList<>();
    }

    /**
     * Método público estático que devuelve la instancia única de Gestor.
     * Implementa el patrón Singleton.
     *
     * @return la instancia única de Gestor
     */
    public static Gestor getInstancia() {
        if (gestor == null) {
            gestor = new Gestor();
        }
        return gestor;
    }

    /**
     * Agrega una persona a la lista de personas.
     *
     * @param persona la persona a agregar a listaPersonas
     */
    public void agregarPersona(Persona persona) {
        listaPersonas.add(persona);
    }

    /**
     * Elimina una persona de la lista de personas.
     *
     * @param persona la persona a eliminar de listaPersonas
     */
    public void eliminarPersona(Persona persona) {
        Date diaDespido = new Date();
        persona.setIsOnClub(false);
        persona.setDiaDespido(diaDespido);
    }

    /**
     * Elimina una persona de la lista de personas por su índice.
     *
     * @param indice el índice de la persona en listaPersonas a eliminar
     */
    public void eliminarPersona(int indice) {
        Date diaDespido = new Date();

        if (indice > listaPersonas.size() || indice <= 0) {
            System.err.print("Error, el indice seleccionado no existe\n");
        } else {
            String nombrePersonaBorrada = listaPersonas.get(indice - 1).getNombre();
            listaPersonas.get(indice - 1).setIsOnClub(false);
            listaPersonas.get(indice - 1).setDiaDespido(diaDespido);
            System.out.println("-----------------------------------------\n" + nombrePersonaBorrada + " ha sido borrado con exito!. \n-----------------------------------------\n\n");
        }

    }

    /**
     * Devuelve la lista completa de personas en el club.
     *
     * @return lista de personas en el club
     */
    public List<Persona> getListaPersonas() {
        return listaPersonas;
    }

    /**
     * Muestra en consola la lista de personas activas en el club.
     */
    public void mostrarListaPersonas() {
        int indice = 0;
        System.out.println("Las personas dadas de alta ahora mismo son: ");
        for (Persona persona : listaPersonas) {
            if (persona.isIsOnClub()) {
                indice++;
                System.out.println(indice + " - " + "Rol: " + persona.getClass().getSimpleName() + ". Nombre: " + persona.getNombre() + ", con el dni: " + persona.getDni());
            }

        }
        System.out.println("");
    }

    /**
     * Devuelve una lista de personas que están activas en el club.
     *
     * @return lista de personas activas en el club
     */
    public List<Persona> ListaPersonasDentroDelClub() {
        List<Persona> listaPersonasDentroClub = new ArrayList<>();;
        for (Persona persona : getListaPersonas()) {
            if (persona.isIsOnClub()) {
                listaPersonasDentroClub.add(persona);
            }

        }
        return listaPersonasDentroClub;
    }
    
    public List<Jugador> ListaJugadoresActivos() {
        List<Jugador> ListaJugadoresActivos = new ArrayList<>();;
        for (Persona persona : getListaPersonas()) {
            if (persona.isIsOnClub() && persona instanceof Jugador) {
                Jugador j = (Jugador)persona;
               ListaJugadoresActivos.add(j);
            }

        }
        return ListaJugadoresActivos;
    }

    /**
     * Recupera una persona de la lista por índice.
     *
     * @param indice el índice de la persona en listaPersonas a recuperar
     * @return la persona en la posición indicada o null si no existe
     */
    public Persona recuperarPersona(int indice) {
        if (indice < 1 || indice > listaPersonas.size()) {
            System.err.println("Error, el indice seleccionado no existe.");
            return null;
        }
        return listaPersonas.get(indice - 1);
    }

    public Concepto recuperarConceptoPorID(String id) {

        for (Persona p : getListaPersonas()) {

            for (Concepto concepto : p.getNomina().getConceptos()) {
                if (concepto != null) {
                    if (concepto.getCodigo() == id) {
                        return concepto;
                    }
                }
            }

        }

        return null;

    }
    
    public void removeConceptoPorID(String id, Persona p){
 
        p.getNomina().deleteConcepto(id);
        
    }

    public Concepto recuperarConceptoPorIndice(int index, Persona p) {

        if (p.getNomina() == null) {
            return null;
        }

        return p.getNomina().getConcepto(index);

    }

    public void borrarConceptoPorIndice(int index, Persona p) {

        p.getNomina().deleteConcepto(index);

    }

    /**
     * Devuelve la lista de partidos del club.
     *
     * @return lista de partidos jugados por el club
     */
    public List<Partido> getListaPartidos() {
        return listaPartidos;
    }

    /**
     * Establece la lista de partidos del club.
     *
     * @param listaPartidos la lista de partidos a asignar
     */
    public void setListaPartidos(List<Partido> listaPartidos) {
        this.listaPartidos = listaPartidos;
    }

    /**
     * Agrega un partido a la lista de partidos del club.
     *
     * @param partido el partido a agregar a listaPartidos
     */
    public void agregarPartido(Partido partido) {
        listaPartidos.add(partido);
    }

    /**
     * Devuelve la lista de nóminas del club.
     *
     * @return lista de nóminas generadas para el club
     */
    public List<Nomina> getListaNominas() {
        return listaNominas;
    }

    /**
     * Recupera una nómina de la lista de nóminas por índice.
     *
     * @param indice el índice de la nómina en listaNominas
     * @return la nómina en la posición indicada
     */
    public Nomina getNominaByIndex(int indice) {
        return listaNominas.get(indice - 1);
    }

    /**
     * Agrega una nómina a la lista de nóminas del club.
     *
     * @param nomina la nómina a agregar a listaNominas
     */
    public void agregarNomina(Nomina nomina) {
        getListaNominas().add(nomina);
    }

    /**
     * Recupera una persona de la lista según su DNI.
     *
     * @param dni
     * @return la persona con el DNI introducido o null si no se encuentra
     */
    public Persona recuperarPersonaDNI(String dni) {
        for (Persona persona : listaPersonas) {
            if (persona.getDni().equals(dni)) {
                return persona;
            }
        }
        System.out.println("No se encontró a ninguna persona con el DNI: " + dni);
        return null; // Devolvemos null si no se encuentra
    }

    /**
     * Devuelve una lista de personas activas ordenadas por DNI.
     *
     * @param lista lista de personas a ordenar
     * @return lista de personas activas ordenadas por DNI
     */
    public List<Persona> listaPersonasSortedDNI(List<Persona> lista) {

        List<Persona> myNewListPersona = new ArrayList();
        //Chequeo que las personas estan activas en el club y las guardo en mi lista pivote
        for (Persona persona : lista) {
            if (persona.isIsOnClub()) {
                myNewListPersona.add(persona);
            }
        }
        //La expresion "Persona::getDni" es una referencia a metodos, esta llama al metodo getDni de la clase Persona
        myNewListPersona.sort(Comparator.comparing(Persona::getDni));

        return myNewListPersona;
    }

    /**
     * Devuelve una lista de personas fuera del club ordenadas por nombre y
     * apellido.
     *
     * @param lista lista de personas a filtrar
     * @return lista de personas fuera del club ordenadas
     */
    public List<Persona> listaPersonasFueraClub(List<Persona> lista) {

        List<Persona> myNewListPersona = new ArrayList();
        for (Persona persona : lista) {
            if (!persona.isIsOnClub()) {
                myNewListPersona.add(persona);
            }
        }

        myNewListPersona.sort(
                Comparator.comparing(Persona::getNombre)
                        .thenComparing(Persona::getApellido)
        );

        return myNewListPersona;
    }

    /**
     * Permite crear un nuevo partido y registrar su resultado.
     *
     * Este método solicita al usuario los detalles necesarios para crear un
     * partido, incluyendo el nombre del equipo rival, si el partido se juega de
     * local, y los goles marcados por ambos equipos. Luego, crea una instancia
     * del objeto {@link Partido} con la información proporcionada y la
     * registra.
     *
     * <p>
     * El partido se registra con el nombre del rival, el estado de localía, y
     * los goles de ambos equipos.</p>
     *
     * @see Partido
     */
    public void crearPartido(String nombreRival, boolean isLocal, int golesLocal, int golesVisitante) {

        Partido partido = new Partido(nombreRival, isLocal, golesLocal, golesVisitante);
        System.out.println("-----------------------------------------\nPartido contra " + nombreRival + " jugado con exito. \n-----------------------------------------\n\n");
    }

    /**
     * Establece la lista de nóminas del club.
     *
     * @param listaNominas la lista de nóminas a asignar
     */
    public void setListaNominas(List<Nomina> listaNominas) {
        this.listaNominas = listaNominas;
    }

    // <editor-fold defaultstate="collapsed" desc="Metodos generadores de archivos texto">
    /**
     * Crea un archivo si no existe.
     *
     * @param file el archivo a validar o crear
     */
    public void validarFichero(File file) {
        try {
            file.createNewFile();
            System.out.println("El archivo " + file.toString() + ".txt ha sido creado.");
        } catch (IOException e) {
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }

    }

    /**
     * Genera un archivo de texto con la lista de empleados activos en el club.
     */
    public void generadoresDeEmpleados() {

        File empleadosFichero = new File("empleadosFichero.txt");
        validarFichero(empleadosFichero);

        /*BufferedWriter es un buffer que optimiza la escritura en archivos, acumulando
        texto en un buffer antes de escribirlo al disco, lo que mejora el rendimiento.
        El parametro false en el constructor del FileWriter indica que quiero que se sobreescriba la informacion y no se añada.*/
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(empleadosFichero, false))) {
            int indice = 0;

            for (Persona persona : listaPersonasSortedDNI(listaPersonas)) {
                indice++;
                writer.write(indice + "- " + persona.getNombre() + " " + persona.getApellido() + " con el DNI: " + persona.getDni());
                writer.newLine(); // Para hacer un salto de línea
            }

            if (getListaPersonas().isEmpty()) {
                writer.write("No hay personas en el club");
            } else {
                System.out.println("Informacion del empleado escrita en el archivo.");
            }
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }

    }

    /**
     * Genera un archivo de texto con la lista de empleados que han sido
     * eliminados del club.
     */
    public void generarEmpleadosEliminados() {
        File empleadosEliminadosFichero = new File("empleadosEliminados.txt");
        validarFichero(empleadosEliminadosFichero);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(empleadosEliminadosFichero, false))) {
            int indice = 0;

            for (Persona persona : listaPersonasFueraClub(listaPersonas)) {
                indice++;
                writer.write(indice + "- " + persona.getNombre() + " " + persona.getApellido() + " con el DNI: " + persona.getDni());
                writer.newLine(); // Para hacer un salto de línea
            }

            if (listaPersonasFueraClub(listaPersonas).isEmpty()) {
                writer.write("No hay ninguna persona fuera del club");
            }

            System.out.println("Informacion de los empleados eliminados escrita en el archivo.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    /**
     * Genera un archivo de texto con la lista de partidos jugados por el club.
     */
    public void generarListaPartidos() {
        File listadoPartidosFichero = new File("listadoPartidosFichero.txt");
        validarFichero(listadoPartidosFichero);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(listadoPartidosFichero, false))) {
            int indice = 0;

            for (Partido partido : getListaPartidos()) {
                indice++;
                writer.write(indice + " - " + "Partido jugado contra " + partido.getEquipoRival() + " finalizo con un resultado de: " + partido.getResultado());
                writer.newLine(); // Para hacer un salto de línea
            }

            if (getListaPartidos().isEmpty()) {
                writer.write("El club todavia no ha jugado ningun partido");
            }

            System.out.println("Informacion de los partidos escrita en el archivo.");

        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }

    }

    /**
     * Genera un archivo de texto con la lista de nóminas generadas para las
     * personas del club.
     */
    public void generarListaNominas() {
        File listadoNominas = new File("listadoNominas.txt");
        validarFichero(listadoNominas);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(listadoNominas, false))) {
            int indice = 0;

            for (Nomina nomina : getListaNominas()) {
                indice++;
                writer.write("----------------------------------------------------------------------------");
                writer.newLine(); // Para hacer un salto de línea
                writer.write("Nomina numero: " + indice);
                writer.newLine(); // Para hacer un salto de línea
                writer.write("Nombre y apellidos: " + nomina.getPersona().getNombre() + " " + nomina.getPersona().getApellido());
                writer.newLine(); // Para hacer un salto de línea
                writer.write("DNI: " + nomina.getPersona().getDni());
                writer.newLine(); // Para hacer un salto de línea

                for (Concepto concepto : nomina.getConceptos()) {
                    writer.write("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
                    writer.newLine(); // Para hacer un salto de línea
                    writer.write("Descripcion del concepto: " + concepto.getDescripcion());
                    writer.newLine(); // Para hacer un salto de línea
                    writer.write("Importe: " + concepto.getImporte() + " euros");
                    writer.newLine(); // Para hacer un salto de línea
                    writer.write("Codigo unico del concepto: " + concepto.getCodigo());
                    writer.newLine(); // Para hacer un salto de línea
                }

            }

            if (getListaNominas().isEmpty()) {
                writer.write("El club todavia no generado ninguna nomina");
            } else {

                System.out.println("Informacion de las nominas escrita en el archivo.");
            }
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }

    }
    // </editor-fold>

}
