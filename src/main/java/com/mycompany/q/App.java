/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.q;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author HugoFDZ
 */
public class App {

    static Scanner inputReader = new Scanner(System.in); // Reading from System.in

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
        Tecnico Carlos = new Tecnico("Carlos Martinez", 612345600, Puesto.entrenador, Especialidad.principal, "34567890Z");
        Tecnico Miguel = new Tecnico("Miguel Sanchez", 612345601, Puesto.preparador, Especialidad.ayudante, "45678901Y");
        Tecnico Javier = new Tecnico("Javier Fernandez", 612345602, Puesto.analista, Especialidad.principal, "56789012X");
        Tecnico Roberto = new Tecnico("Roberto Garcia", 612345603, Puesto.scout, Especialidad.ayudante, "67890123W");
        Tecnico Alberto = new Tecnico("Alberto Gomez", 612345604, Puesto.preparador, Especialidad.porteros, "78901234V");

// Directivos
        Directivo Luis = new Directivo("Luis Perez", "23456789Z", 612345600, "Presidente");
        Directivo Ana = new Directivo("Ana Rodriguez", "34567890Y", 612345601, "Director Deportivo");
        Directivo Jorge = new Directivo("Jorge Martinez", "45678901X", 612345602, "Gerente General");
        Directivo Marta = new Directivo("Marta Fernandez", "56789012W", 612345603, "Jefe de Finanzas");
        Directivo Juan = new Directivo("Juan Lopez", "67890123V", 612345604, "Responsable de Marketing");

        // </editor-fold>
        
        while (true) {

            try {

                mostrarMenuPrincipal();

                int indice = inputReader.nextInt();
                inputReader.nextLine();  // Consumir el salto de línea
                int subIndice;

                switch (indice) {

                    case 1:
                        // <editor-fold defaultstate="collapsed" desc="Opcion 1 - Dar de alta persona">

                        System.out.println("A quien desea dar de alta?"
                                + "\n 1 - Jugador"
                                + "\n 2 - Tecnico"
                                + "\n 3 - Directivo");

                        subIndice = inputReader.nextInt();
                        inputReader.nextLine();  // Consumir el salto de línea

                        switch (subIndice) {
                            case 1:
                                crearJugador();
                                break;
                            case 2:
                                crearTecnico();
                                break;
                            case 3:
                                crearDirectivo();
                                break;
                            default:
                                System.err.println("Parece que la opcion que ha seleccionado no esta disponible, porfavor intentelo de nuevo.");
                                break;
                        }

                        // </editor-fold>
                        
                    case 2:
                        // <editor-fold defaultstate="collapsed" desc="Opcion 2 - Eliminar a una persona">

                        Gestor.getInstancia().mostrarListaPersonas();
                        System.out.println("Elija el numero de la persona que quiera eliminar.");

                        subIndice = inputReader.nextInt();
                        inputReader.nextLine();  // Consumir el salto de línea
                        Gestor.getInstancia().eliminarPersona(subIndice);
                        // </editor-fold>
                         break;
                    case 3:
                        // <editor-fold defaultstate="collapsed" desc="Opcion 3 - Modificar una persona">

                        Gestor.getInstancia().mostrarListaPersonas();
                        System.out.println("Elija el numero de la persona que quiera modificar.");

                        subIndice = inputReader.nextInt();
                        inputReader.nextLine();  // Consumir el salto de línea
                        Persona personaModificada = Gestor.getInstancia().recuperarPersona(subIndice);
                        System.out.println("Que atributos desea modificar?.");
                        modificarPersona(personaModificada);
                    // </editor-fold>
                        break;
                    case 4:
                        crearPartido();
                        break;
                    case 5:
                        // <editor-fold defaultstate="collapsed" desc="Opcion 5 - Crear una nomina">

                        Gestor.getInstancia().mostrarListaPersonas();
                        System.out.println("Escriba el DNI de la persona a la que le quiere generar una nomina");

                        String dni = inputReader.next();
                        inputReader.nextLine();  // Consumir el salto de línea
                        Persona personaNomina = Gestor.getInstancia().recuperarPersonaDNI(dni);
                        generarNomina(personaNomina);
                        // </editor-fold>
                        break;
                    case 6:
                        System.out.println("Saliendo...");
                        return;
                    default:
                        System.err.println("Parece que la opcion que ha seleccionado no esta disponible, porfavor intentelo de nuevo.");
                        break;

                }

            } catch (InputMismatchException e) {
                System.err.println("Entrada no valida, por favor ingrese un numero.");
                inputReader.nextLine(); // Limpiar el buffer
            }

        }

    }


    /*<T extends Enum<T>> Esto indica que el método acepta cualquier tipo que sea una enumeración.
    Class<T> enumType: Pasamos la clase del enum como argumento*/
    public static <T extends Enum<T>> T elegirEnum(Class<T> enumType) {
        int eleccion;
        int i = 0;

        System.out.println("Elija una de las siguientes opciones:");

        // Hago un array con el tamaño del enum que le paso por argumento
        T[] enumValues = enumType.getEnumConstants();

        //En un bucle voy enseñando por consola los valores que tiene dicho enum
        for (T enumValue : enumValues) {
            i++;
            System.out.println(i + " - " + enumValue.name());
        }

        eleccion = inputReader.nextInt();
        inputReader.nextLine();  // Consumir el salto de línea

        // Devolvemos el valor del enum elegido
        return enumValues[eleccion - 1];
    }

    public static boolean elegirEstadoFisico() {
        while (true) {
            System.out.println("Su jugador esta lesionado?\n S/N");
            String miEleccion = inputReader.next();
            inputReader.nextLine();  // Consumir el salto de línea
            switch (miEleccion) {
                case "S":
                    return true;
                case "N":
                    return false;
                default:
                    System.out.println("Solo debe responder S o N");
                    throw new AssertionError();
            }
        }
    }

    public static void crearJugador() {
        System.out.println("Indique el nombre del jugador");
        String nombre = inputReader.next();
        inputReader.nextLine();  // Consumir el salto de línea

        System.out.println("Indique el apellido del jugador");
        String apellido = inputReader.next();
        inputReader.nextLine();  // Consumir el salto de línea

        System.out.println("Indique el telefono del jugador");
        int telefono = inputReader.nextInt();
        inputReader.nextLine();  // Consumir el salto de línea

        Demarcacion demarcacion = elegirEnum(Demarcacion.class);
        System.out.println("Indique la edad del jugador");
        int edad = inputReader.nextInt();
        inputReader.nextLine();  // Consumir el salto de línea

        System.out.println("Indique el valor de mercado del jugador");
        int valorMercado = inputReader.nextInt();
        inputReader.nextLine();  // Consumir el salto de línea

        boolean estadoFisico = elegirEstadoFisico();
        System.out.println("Indique el DNI del jugador");
        String dni = inputReader.next();
        inputReader.nextLine();  // Consumir el salto de línea

        Jugador jugador = new Jugador(nombre, apellido, telefono, demarcacion, edad, valorMercado, estadoFisico, dni);
        System.out.println("-----------------------------------------\nJugador " + nombre + " dado de alta correctamente. \n-----------------------------------------\n\n");
    }

    public static void crearTecnico() {

        System.out.println("Indique el nombre del tecnico");
        String nombre = inputReader.next();
        inputReader.nextLine();  // Consumir el salto de línea
        System.out.println("Indique el telefono del tecnico");
        int telefono = inputReader.nextInt();
        inputReader.nextLine();  // Consumir el salto de línea
        System.out.println("Indique el puesto del tecnico");
        Puesto puesto = elegirEnum(Puesto.class);
        System.out.println("Indique la especialidad del tecnico");
        Especialidad especialidad = elegirEnum(Especialidad.class);
        System.out.println("Indique el DNI del tecnico");
        String dni = inputReader.next();
        inputReader.nextLine();  // Consumir el salto de línea

        Tecnico tecnico = new Tecnico(nombre, telefono, puesto, especialidad, dni);
        System.out.println("-----------------------------------------\nTecnico " + nombre + " dado de alta correctamente. \n-----------------------------------------\n\n");
    }

    public static void crearDirectivo() {

        System.out.println("Indique el nombre del directivo");
        String nombre = inputReader.next();
        inputReader.nextLine();  // Consumir el salto de línea
        System.out.println("Indique el telefono del directivo");
        int telefono = inputReader.nextInt();
        inputReader.nextLine();  // Consumir el salto de línea
        System.out.println("Indique el cargo del directivo");
        String cargo = inputReader.next();
        inputReader.nextLine();  // Consumir el salto de línea
        System.out.println("Indique el DNI del directivo");
        String dni = inputReader.next();
        inputReader.nextLine();  // Consumir el salto de línea

        Directivo directivo = new Directivo(nombre, dni, telefono, cargo);
        System.out.println("-----------------------------------------\nDirectivo " + nombre + " dado de alta correctamente. \n-----------------------------------------\n\n");
    }

    public static void mostrarMenuPrincipal() {
        System.out.println("Seleccione una de las opciones:\n"
                + "1 - Dar de alta una persona.\n"
                + "2 - Eliminar a una persona. \n"
                + "3 - Modificar los datos de una persona. \n"
                + "4 - Jugar un partido. \n"
                + "5 - Crear nomina. \n"
                + "6 - Salir");
    }

    public static void modificarPersona(Persona persona) {

        if (persona instanceof Jugador) {
            Jugador jugador = (Jugador) persona; // Cast a Jugador
            System.out.println("Que atributo de " + jugador.getNombre() + " desea cambiar?\n"
                    + "1 - Nombre\n"
                    + "2 - Apellidos\n"
                    + "3 - Telefono\n"
                    + "4 - Demarcacion\n"
                    + "5 - Estado fisico\n"
                    + "6 - Edad\n"
                    + "7 - Valor de mercado"
            );
            int indice = inputReader.nextInt();
            inputReader.nextLine();  // Consumir el salto de línea

            switch (indice) {
                case 1:
                    System.out.println("Indique el nuevo nombre del jugador");
                    jugador.setNombre(inputReader.next());
                    inputReader.nextLine();  // Consumir el salto de línea
                    break;
                case 2:
                    System.out.println("Indique los nuevos apellidos del jugador");
                    jugador.setApellidos(inputReader.next());
                    inputReader.nextLine();  // Consumir el salto de línea
                    break;
                case 3:
                    System.out.println("Indique el nuevo telefono del jugador");
                    persona.setTelefono(inputReader.nextInt());
                    inputReader.nextLine();  // Consumir el salto de línea
                    break;
                case 4:
                    System.out.println("Indique la nueva demarcacion del jugador");
                    jugador.setDemarcacion(elegirEnum(Demarcacion.class));
                    break;
                case 5:
                    System.out.println("Indique si el jugador esta lesionado");
                    jugador.setEstadoFisico(elegirEstadoFisico());
                    break;
                case 6:
                    System.out.println("Indique la nueva edad del jugador");
                    jugador.setEdad(inputReader.nextInt());
                    inputReader.nextLine();  // Consumir el salto de línea
                    break;
                case 7:
                    System.out.println("Indique el nuevo valor del mercado del jugador");
                    jugador.setValorMercado(inputReader.nextInt());
                    inputReader.nextLine();  // Consumir el salto de línea
                    break;
                default:
                    System.err.println("Error, parece que no escribio una opcion valida");
                    return;
            }
        }
        
        if (persona instanceof Directivo) {
            Directivo directivo = (Directivo) persona; // Cast a Directivo
            System.out.println("Que atributo de " + directivo.getNombre() + " desea cambiar?\n"
                    + "1 - Nombre\n"
                    + "2 - Telefono\n"
                    + "3 - Cargo"
            );
            int indice = inputReader.nextInt();
            inputReader.nextLine();  // Consumir el salto de línea

            switch (indice) {
                case 1:
                    System.out.println("Indique el nuevo nombre del directivo");
                    directivo.setNombre(inputReader.next());
                    inputReader.nextLine();  // Consumir el salto de línea
                    break;
                case 2:
                    System.out.println("Indique el nuevo telefono del directivo");
                    directivo.setTelefono(inputReader.nextInt());
                    inputReader.nextLine();  // Consumir el salto de línea
                    break;
                case 3:
                    System.out.println("Indique el nuevo cargo del directivo");
                    directivo.setCargo(inputReader.next());
                    inputReader.nextLine();  // Consumir el salto de línea
                    break;
                default:
                    System.err.println("Error, parece que no escribio una opcion valida");
                    return;
            }
        }
        
        if (persona instanceof Tecnico) {

            Tecnico tecnico = (Tecnico) persona; // Cast a Tecnico
            System.out.println("Que atributo de " + tecnico.getNombre() + " desea cambiar?\n"
                    + "1 - Nombre\n"
                    + "2 - Telefono\n"
                    + "3 - Puesto\n"
                    + "4 - Especialidad"
            );
            int indice = inputReader.nextInt();
            inputReader.nextLine();  // Consumir el salto de línea

            switch (indice) {
                case 1:
                    System.out.println("Indique el nuevo nombre del tecnico");
                    tecnico.setNombre(inputReader.next());
                    inputReader.nextLine();  // Consumir el salto de línea
                    break;
                case 2:
                    System.out.println("Indique el nuevo telefono del tecnico");
                    tecnico.setTelefono(inputReader.nextInt());
                    inputReader.nextLine();  // Consumir el salto de línea
                    break;
                case 3:
                    System.out.println("Indique el nuevo puesto del tecnico");
                    tecnico.setPuesto(elegirEnum(Puesto.class));
                    break;
                case 4:
                    System.out.println("Indique la nueva especialidad del tecnico");
                    tecnico.setEspecialidad(elegirEnum(Especialidad.class));
                    break;
                default:
                    System.err.println("Error, parece que no escribio una opcion valida");
                    return;
            }
        }

    }

    public static void crearPartido() {

        System.out.println("Indique el nombre del equipo rival");
        String nombreRival = inputReader.next();
        inputReader.nextLine();  // Consumir el salto de línea
        System.out.println("Indique si usted juega de local");
        boolean isLocal = elegirLocal();
        System.out.println("Indique el numero de goles locales");
        int golesLocal = inputReader.nextInt();
        inputReader.nextLine();  // Consumir el salto de línea
        System.out.println("Indique el numero de goles visitante");
        int golesVisitante = inputReader.nextInt();
        inputReader.nextLine();  // Consumir el salto de línea

        Partido partido = new Partido(nombreRival, isLocal, golesLocal, golesVisitante);
        System.out.println("-----------------------------------------\nPartido contra " + nombreRival + " jugado con exito. \n-----------------------------------------\n\n");
    }

    public static boolean elegirLocal() {
        while (true) {
            System.out.println("Usted juega de local?\n S/N");
            String miEleccion = inputReader.next();
            inputReader.nextLine();  // Consumir el salto de línea
            switch (miEleccion) {
                case "S":
                    return true;
                case "N":
                    return false;
                default:
                    System.out.println("Solo debe responder S o N");
                    throw new AssertionError();
            }
        }
    }

    public static void generarNomina(Persona persona) {
        System.err.println("Vas a crearle una nomina a " + persona.getNombre());
        System.out.println("Cuanto es el importe de su nomina?");
        int importe = inputReader.nextInt();
        inputReader.nextLine();  // Consumir el salto de línea

        System.out.println("Cual es la descripcion de su nomina?");
        String descripcion = inputReader.next();
        inputReader.nextLine();  // Consumir el salto de línea

        System.out.println("Cual es el codigo unico de su nomina?");
        String codigoUnico = inputReader.next();
        inputReader.nextLine();  // Consumir el salto de línea

        Concepto concepto = new Concepto(codigoUnico, descripcion, importe);

        System.out.println("Indique el mes de su nomina");
        Meses mes = elegirEnum(Meses.class);

        System.out.println("Indique el ano de su nomina?");
        int ano = inputReader.nextInt();
        inputReader.nextLine();  // Consumir el salto de línea

        Nomina nomina = new Nomina(mes, ano, concepto);
        persona.setNomina(nomina);
        System.out.println("-----------------------------------------\nNomina con el codigo " + codigoUnico + " generada con exito. \n-----------------------------------------\n\n");
    }
}
