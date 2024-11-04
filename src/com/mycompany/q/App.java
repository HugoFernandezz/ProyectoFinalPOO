/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.q;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
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
        while (true) {

            try {

                mostrarMenuPrincipal();

                int indice = InputInt(1, 10);
                inputReader.nextLine();  // Consumir el salto de línea
                int subIndice;

                switch (indice) {

                    case 1:
                        // <editor-fold defaultstate="collapsed" desc="Opcion 1 - Dar de alta persona">

                        System.out.println("A quien desea dar de alta?"
                                + "\n 1 - Jugador"
                                + "\n 2 - Tecnico"
                                + "\n 3 - Directivo");

                        subIndice = InputInt(1, 3);
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
                        break;
                    case 2:
                        // <editor-fold defaultstate="collapsed" desc="Opcion 2 - Eliminar a una persona">

                        Gestor.getInstancia().mostrarListaPersonas();
                        System.out.println("Elija el numero de la persona que quiera eliminar.");

                        subIndice = InputInt(1, Gestor.getInstancia().ListaPersonasDentroDelClub().size());
                        inputReader.nextLine();  // Consumir el salto de línea
                        Gestor.getInstancia().eliminarPersona(subIndice);
                        // </editor-fold>
                        break;
                    case 3:
                        // <editor-fold defaultstate="collapsed" desc="Opcion 3 - Modificar una persona">

                        Gestor.getInstancia().mostrarListaPersonas();
                        System.out.println("Elija el numero de la persona que quiera modificar.");

                        subIndice = InputInt(1, Gestor.getInstancia().ListaPersonasDentroDelClub().size());
                        inputReader.nextLine();  // Consumir el salto de línea
                        Persona personaModificada = Gestor.getInstancia().recuperarPersona(subIndice);
                        System.out.println("Que atributos desea modificar?.");
                        modificarPersona(personaModificada);
                        // </editor-fold>
                        break;
                    case 4:
                        // <editor-fold defaultstate="collapsed" desc="Opcion 4 - Crear partido">
                        crearPartido();
                        // </editor-fold>
                        break;
                    case 5:
                        // <editor-fold defaultstate="collapsed" desc="Opcion 5 - Crear una nomina">

                        Gestor.getInstancia().mostrarListaPersonas();
                        System.out.println("Escriba el DNI de la persona a la que le quiere generar una nomina");
                        Persona personaNomina = Gestor.getInstancia().recuperarPersonaDNI();
                        generarNominaUnipersonal(personaNomina);
                        // </editor-fold>
                        break;
                    case 6:
                        // <editor-fold defaultstate="collapsed" desc="Opcion 6 - Crear una nomina masiva">
                        generarNominasMasivas();
                        // </editor-fold>
                        break;
                    case 7:
                        // <editor-fold defaultstate="collapsed" desc="Opcion 7 - Crear una factura">
                        crearFactura();
                        // </editor-fold>
                        break;
                    case 8:
                        // <editor-fold defaultstate="collapsed" desc="Opcion 8 - Modificar concepto de nomina">
                        int indiceSeleccionNomina = 0;
                        mostrarNominasInformacion();
                        System.out.println("Seleccione el indice de la nomina que quiera modificar:");
                        try {
                            indiceSeleccionNomina = InputInt(1, Gestor.getInstancia().getListaNominas().size());
                            inputReader.nextLine();  // Consumir el salto de línea
                        } catch (Exception e) {
                            break;
                        }

                        Nomina nominaAModificar = Gestor.getInstancia().getNominaByIndex(indiceSeleccionNomina);
                        manipularConceptoNomina(nominaAModificar);

                        // </editor-fold>
                        break;
                    case 9:
                        // <editor-fold defaultstate="collapsed" desc="Opcion 9 - Generar listados">
                        System.out.println("Que tipo de lista quiere generar?"
                                + "\n 1 - Listado de empleados activos ordenador por DNI (Fichero.txt)."
                                + "\n 2 - Listado de empleados eliminados ordenados por apellido y nombre (Fichero.txt)."
                                + "\n 3 - Listado de resultados del equipo de una temporada (Fichero.txt)."
                                + "\n 4 - Listado de nominas generadas (Fichero.txt)."
                                + "\n 5 - Listado de empleados activos ordenador por DNI (Fichero PDF)."
                                + "\n 6 - Listado de empleados eliminados ordenados por apellido y nombre (Fichero PDF)."
                                + "\n 7 - Listado de resultados del equipo de una temporada (Fichero PDF)."
                                + "\n 8 - Listado de nominas generadas (Fichero PDF)."
                                + "\n 9 - Salir.");

                        subIndice = inputReader.nextInt();
                        inputReader.nextLine();  // Consumir el salto de línea

                        switch (subIndice) {
                            case 1:
                                Gestor.getInstancia().generadoresDeEmpleados();
                                break;
                            case 2:
                                Gestor.getInstancia().generarEmpleadosEliminados();
                                break;
                            case 3:
                                Gestor.getInstancia().generarListaPartidos();
                                break;
                            case 4:
                                Gestor.getInstancia().generarListaNominas();
                                break;
                            case 5:
                                //Recojo los datos de la lista que quiero crear en el pdf
                                List<Persona> listaPersonasSortedDNI = Gestor.getInstancia().listaPersonasSortedDNI(Gestor.getInstancia().getListaPersonas());
                                String nombrePDFEmpleados = ExporterPDF.getInstancia().getNameFileEmpleados();
                                //Creo el PDF con mi clase ExportedPDF
                                ExporterPDF.getInstancia().crearPDFPersonas(nombrePDFEmpleados, listaPersonasSortedDNI);
                                break;
                            case 6:
                                //Recojo los datos de la lista que quiero crear en el pdf
                                List<Persona> listaPersonasEliminadas = Gestor.getInstancia().listaPersonasFueraClub(Gestor.getInstancia().getListaPersonas());
                                String nombrePDFEliminados = ExporterPDF.getInstancia().getNameFileEmpleadosEliminados();
                                //Creo el PDF con mi clase ExportedPDF
                                ExporterPDF.getInstancia().crearPDFPersonas(nombrePDFEliminados, listaPersonasEliminadas);
                                break;
                            case 7:
                                ExporterPDF.getInstancia().crearPDFPartidos();
                                break;
                            case 8:
                                ExporterPDF.getInstancia().crearPDFNominas();
                                break;
                            case 9:
                                return;
                            default:
                                System.err.println("[*]Parece que la opcion que ha seleccionado no esta disponible, porfavor intentelo de nuevo.");

                                break;
                        }
                        // </editor-fold>
                        break;
                    case 10:
                        System.out.println("Saliendo...");
                        return;
                    default:
                        System.err.println("[*]Parece que la opcion que ha seleccionado no esta disponible, porfavor intentelo de nuevo.");

                        break;

                }

            } catch (InputMismatchException e) {
                System.err.println("[*]Entrada no valida, por favor ingrese un numero.");
                inputReader.nextLine(); // Limpiar el buffer
            }

        }

    }

    public static void mostrarMenuPrincipal() {
        System.out.println("Seleccione una de las opciones:\n"
                + "1 - Dar de alta una persona.\n"
                + "2 - Eliminar a una persona. \n"
                + "3 - Modificar los datos de una persona. \n"
                + "4 - Jugar un partido. \n"
                + "5 - Crear nomina. \n"
                + "6 - Crear nomina masiva. \n"
                + "7 - Crear factura. \n"
                + "8 - Modificar concepto de nomina. \n"
                + "9 - Imprimir listados. \n"
                + "10 - Salir");
    }

    /*<T extends Enum<T>> Esto indica que el método permite devolver cualquier valor de cualquier enum.
    Class<T> enumType: Nos permite pasar cualquier tipo de Enum como argumento*/
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
        eleccion = InputInt(1, enumValues.length);

        // Devolvemos el valor del enum elegido
        return enumValues[eleccion - 1];
    }

    public static boolean elegirEstadoFisico() {
        while (true) {
            System.out.println("Su jugador esta lesionado?\n S/N");
            String miEleccion = inputReader.next();
            inputReader.nextLine();  // Consumir el salto de línea
            switch (miEleccion.toUpperCase()) {
                case "S":
                    return true;
                case "N":
                    return false;
                default:
                    System.out.println("Solo debe responder S o N");
            }
        }
    }

    public static void crearJugador() {
        System.out.println("Indique el nombre del jugador");
        String nombre = inputReader.next();
        inputReader.nextLine();  // Consumir el salto de línea

        System.out.println("Indique el apellido del jugador");
        String apellido = inputReader.nextLine();

        System.out.println("Indique el telefono del jugador");
        int telefono = InputInt();
        inputReader.nextLine();  // Consumir el salto de línea

        Demarcacion demarcacion = elegirEnum(Demarcacion.class);
        System.out.println("Indique la edad del jugador");
        int edad = InputInt();
        inputReader.nextLine();  // Consumir el salto de línea

        System.out.println("Indique el valor de mercado del jugador");
        int valorMercado = InputInt();
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

        System.out.println("Indique el apellido del tecnico");
        String apellido = inputReader.nextLine();

        System.out.println("Indique el telefono del tecnico");
        int telefono = InputInt();
        inputReader.nextLine();  // Consumir el salto de línea

        System.out.println("Indique el puesto del tecnico");
        Puesto puesto = elegirEnum(Puesto.class);

        System.out.println("Indique la especialidad del tecnico");
        Especialidad especialidad = elegirEnum(Especialidad.class);

        System.out.println("Indique el DNI del tecnico");
        String dni = inputReader.next();
        inputReader.nextLine();  // Consumir el salto de línea

        Tecnico tecnico = new Tecnico(nombre, apellido, telefono, puesto, especialidad, dni);
        System.out.println("-----------------------------------------\nTecnico " + nombre + " dado de alta correctamente. \n-----------------------------------------\n\n");
    }

    public static void crearDirectivo() {

        System.out.println("Indique el nombre del directivo");
        String nombre = inputReader.next();
        inputReader.nextLine();  // Consumir el salto de línea

        System.out.println("Indique el apellido del directivo");
        String apellido = inputReader.nextLine();

        System.out.println("Indique el telefono del directivo");
        int telefono = InputInt();
        inputReader.nextLine();  // Consumir el salto de línea

        System.out.println("Indique el cargo del directivo");
        String cargo = inputReader.nextLine();
        inputReader.nextLine();  // Consumir el salto de línea

        System.out.println("Indique el DNI del directivo");
        String dni = inputReader.next();
        inputReader.nextLine();  // Consumir el salto de línea

        Directivo directivo = new Directivo(nombre, apellido, dni, telefono, cargo);
        System.out.println("-----------------------------------------\nDirectivo " + nombre + " dado de alta correctamente. \n-----------------------------------------\n\n");
    }

    public static void crearFactura() {
        String nombre;
        String cif;
        float cantidad;
        String fechaPago;
        String codigoUnico;

        System.out.println("Indique el nombre de su cliente: ");
        nombre = inputReader.next();
        inputReader.nextLine();  // Consumir el salto de línea

        System.out.println("Indique el CIF de su cliente");
        cif = inputReader.next();
        inputReader.nextLine();  // Consumir el salto de línea

        Cliente cliente = new Cliente(cif, nombre);

        System.out.println("Indique la cantidad en euros de la factura: ");
        cantidad = InputInt();
        inputReader.nextLine();  // Consumir el salto de línea

        fechaPago = InputDate();

        System.out.println("Indique el codigo unico de su factura");
        codigoUnico = inputReader.next();
        inputReader.nextLine();  // Consumir el salto de línea

        Factura factura = new Factura(codigoUnico, cantidad, fechaPago, cliente);

        System.out.println("-----------------------------------------\nFactura con el codigo " + codigoUnico + " creada con exito. \n-----------------------------------------\n\n");
    }

    public static void modificarPersona(Persona persona) {

        if (persona instanceof Jugador) {
            modificarJugador(persona);
        }

        if (persona instanceof Directivo) {
            modificarDirectivo(persona);
        }

        if (persona instanceof Tecnico) {
            modificarTecnico(persona);
        }

    }

    public static void modificarJugador(Persona persona) {
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
        int indice = InputInt(1, 7);
        inputReader.nextLine();  // Consumir el salto de línea

        switch (indice) {
            case 1:
                System.out.println("Indique el nuevo nombre del jugador");
                jugador.setNombre(inputReader.next());
                inputReader.nextLine();  // Consumir el salto de línea
                break;
            case 2:
                System.out.println("Indique los nuevos apellidos del jugador");
                jugador.setApellido(inputReader.nextLine());
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

    public static void modificarDirectivo(Persona persona) {

        Directivo directivo = (Directivo) persona; // Cast a Directivo
        System.out.println("Que atributo de " + directivo.getNombre() + " desea cambiar?\n"
                + "1 - Nombre\n"
                + "2 - Apellido\n"
                + "3 - Telefono\n"
                + "4 - Cargo"
        );
        int indice = InputInt(1, 4);
        inputReader.nextLine();  // Consumir el salto de línea

        switch (indice) {
            case 1:
                System.out.println("Indique el nuevo nombre del directivo");
                directivo.setNombre(inputReader.next());
                inputReader.nextLine();  // Consumir el salto de línea
                break;
            case 2:
                System.out.println("Indique el nuevo apellido del directivo");
                directivo.setApellido(inputReader.nextLine());
                break;
            case 3:
                System.out.println("Indique el nuevo telefono del directivo");
                directivo.setTelefono(inputReader.nextInt());
                inputReader.nextLine();  // Consumir el salto de línea
                break;
            case 4:
                System.out.println("Indique el nuevo cargo del directivo");
                directivo.setCargo(inputReader.next());
                inputReader.nextLine();  // Consumir el salto de línea
                break;
            default:
                System.err.println("Error, parece que no escribio una opcion valida");
                return;
        }
    }

    public static void modificarTecnico(Persona persona) {
        Tecnico tecnico = (Tecnico) persona; // Cast a Tecnico
        System.out.println("Que atributo de " + tecnico.getNombre() + " desea cambiar?\n"
                + "1 - Nombre\n"
                + "2 - Apellido\n"
                + "3 - Telefono\n"
                + "4 - Puesto\n"
                + "5 - Especialidad"
        );
        int indice = InputInt(1, 5);
        inputReader.nextLine();  // Consumir el salto de línea

        switch (indice) {
            case 1:
                System.out.println("Indique el nuevo nombre del tecnico");
                tecnico.setNombre(inputReader.next());
                inputReader.nextLine();  // Consumir el salto de línea
                break;
            case 2:
                System.out.println("Indique el nuevo apellido del tecnico");
                tecnico.setApellido(inputReader.nextLine());
                break;
            case 3:
                System.out.println("Indique el nuevo telefono del tecnico");
                tecnico.setTelefono(inputReader.nextInt());
                inputReader.nextLine();  // Consumir el salto de línea
                break;
            case 4:
                System.out.println("Indique el nuevo puesto del tecnico");
                tecnico.setPuesto(elegirEnum(Puesto.class));
                break;
            case 5:
                System.out.println("Indique la nueva especialidad del tecnico");
                tecnico.setEspecialidad(elegirEnum(Especialidad.class));
                break;
            default:
                System.err.println("Error, parece que no escribio una opcion valida");
                return;
        }
    }

    public static void crearPartido() {

        System.out.println("Indique el nombre del equipo rival");
        String nombreRival = inputReader.next();
        inputReader.nextLine();  // Consumir el salto de línea
        System.out.println("Indique si usted juega de local");
        boolean isLocal = elegirLocal();
        System.out.println("Indique el numero de goles locales");
        int golesLocal = InputInt();
        inputReader.nextLine();  // Consumir el salto de línea
        System.out.println("Indique el numero de goles visitante");
        int golesVisitante = InputInt();
        inputReader.nextLine();  // Consumir el salto de línea

        Partido partido = new Partido(nombreRival, isLocal, golesLocal, golesVisitante);
        System.out.println("-----------------------------------------\nPartido contra " + nombreRival + " jugado con exito. \n-----------------------------------------\n\n");
    }

    public static boolean elegirLocal() {
        while (true) {
            System.out.println("Usted juega de local?\n S/N");
            String miEleccion = inputReader.next().toUpperCase();
            inputReader.nextLine();  // Consumir el salto de línea
            switch (miEleccion) {
                case "S":
                    return true;
                case "N":
                    return false;
                default:
                    System.out.println("Solo debe responder S o N");
            }
        }
    }

    public static void generarNominaUnipersonal(Persona persona) {
        System.err.println("Vas a crearle una nomina a " + persona.getNombre());
        Nomina nomina = generarNomina();
        nomina.setPersona(persona);
        persona.setNomina(nomina);
        System.out.println("-----------------------------------------\nNomina de " + nomina.getPersona().getNombre() + " generada con exito. \n-----------------------------------------\n\n");
    }

    public static Nomina generarNomina() {
        System.out.println("Cuanto es el importe de su nomina?");
        int importe = InputInt();
        inputReader.nextLine();  // Consumir el salto de línea

        System.out.println("Cual es la descripcion de su nomina?");
        String descripcion = inputReader.nextLine();

        System.out.println("Cual es el codigo unico de su nomina?");
        String codigoUnico = inputReader.next();
        inputReader.nextLine();  // Consumir el salto de línea

        Concepto concepto = new Concepto(codigoUnico, descripcion, importe);

        System.out.println("Indique el mes de su nomina");
        Meses mes = elegirEnum(Meses.class);

        System.out.println("Indique el ano de su nomina?");
        int ano = InputInt();
        inputReader.nextLine();  // Consumir el salto de línea

        Nomina nomina = new Nomina(mes, ano, concepto);
        return nomina;
    }

    public static void generarNominasMasivas() {
        Gestor.getInstancia().mostrarListaPersonas();

        System.out.println("Elija el numero de la persona a la que quiera anadir a la lista.");
        System.out.println("Las personas que anada a la lista seran quienes reciban la nomina que generaremos.");

        List<Persona> listaPersonas = new ArrayList();
        int subIndice;

        while (true) {
            subIndice = InputInt(0, Gestor.getInstancia().ListaPersonasDentroDelClub().size());
            inputReader.nextLine();  // Consumir el salto de línea
            if (subIndice == 0) {
                break;
            }
            Persona persona = Gestor.getInstancia().recuperarPersona(subIndice);
            listaPersonas.add(persona);
            System.out.println(persona.getNombre() + " se anadio a la lista.");
            System.out.println("Elija otra persona para anadirla a la lista.");
            System.out.println("Cuando quiera dejar de anadir gente a la lista escriba '0'.");
        }

        Nomina nomina = generarNomina();

        for (Persona persona : listaPersonas) {
            nomina.setPersona(persona);
            persona.setNomina(nomina);
            Gestor.getInstancia().agregarNomina(new Nomina(nomina));
        }

        System.out.println("Nomina masiva generada con exito");

    }

    public static void manipularConceptoNomina(Nomina nomina) {
        System.out.println("Que desea hacer con el concepto de la nomina de " + nomina.getPersona().getNombre() + "\n"
                + "1 - Crearla\n"
                + "2 - Modificarla\n"
                + "3 - Eliminarla\n"
        );
        int indice = InputInt(1, 3);
        inputReader.nextLine();  // Consumir el salto de línea

        switch (indice) {
            case 1:
                Concepto concepto = crearNuevoConcepto();
                nomina.setConcepto(concepto);

                break;
            case 2:
                mostrarConceptoInformacion(nomina);
                System.out.println("Elija el indice del concepto que quiera modificar");
                int subIndice = InputInt(1, nomina.getConceptos().size());
                inputReader.nextLine();  // Consumir el salto de línea

                Concepto conceptoModificar = nomina.getConceptos(subIndice);

                conceptoModificar = crearNuevoConcepto();
                nomina.modificarConceptoIndex(conceptoModificar, subIndice);

                break;
            case 3:
                mostrarConceptoInformacion(nomina);
                System.out.println("Elija el indice del concepto que quiera eliminar");
                int subIndiceEliminar = InputInt(1, nomina.getConceptos().size());
                inputReader.nextLine();  // Consumir el salto de línea

                nomina.deleteConcepto(subIndiceEliminar);
                break;
            default:
                System.err.println("Numero introducido no valido.");
                throw new AssertionError();
        }
    }

    public static void mostrarConceptoInformacion(Nomina nomina) {
        int indice = 0;
        for (Concepto concepto : nomina.getConceptos()) {
            indice++;
            System.out.println("");
            System.out.println("Concepto numero " + indice);
            System.out.println("----------------------------------------");
            System.out.println("concepto con el codigo: " + concepto.getCodigo());
            System.out.println("concepto con la descripcion: " + concepto.getDescripcion());
            System.out.println("concepto con el importe: " + concepto.getImporte());
            System.out.println("----------------------------------------");
        }
    }

    public static Concepto crearNuevoConcepto() {
        System.out.println("Cuanto es la descripcion de su concepto?");
        String descripcion = inputReader.nextLine();

        System.out.println("Cuanto es el importe de su concepto?");
        int importe = InputInt();
        inputReader.nextLine();  // Consumir el salto de línea

        System.out.println("Cuanto es codigo unico de su concepto?");
        String codigo = inputReader.next();
        inputReader.nextLine();  // Consumir el salto de línea

        Concepto concepto = new Concepto(codigo, descripcion, importe);
        System.out.println("Concepto con el codigo: " + codigo + " creada con exito!");
        return concepto;
    }

    public static void mostrarNominasInformacion() {
        int indice = 0;
        if (Gestor.getInstancia().getListaNominas().size() == 0) {
            System.out.println("Actualmente no hay ningun nomina creada.");
        }
        for (Nomina nomina : Gestor.getInstancia().getListaNominas()) {
            indice++;
            System.out.println("");
            System.out.println("Nomina numero " + indice);
            System.out.println("----------------------------------------");
            System.out.println("Nomina de: " + nomina.getPersona().getNombre());
            System.out.println("Nomina con : " + nomina.getConceptos().size() + " conceptos.");
            System.out.println("----------------------------------------");
        }
    }

    public static String InputDate() {
        while (true) {
            System.out.println("Indique la fecha de pago con el formato 'DD/MM/YYYY': ");
            String value = inputReader.next();

            /*
             * \\d{2} para valdiar que hay dos digitos, / para validar que está el separador
             */
            if (value.matches("\\d{2}/\\d{2}/\\d{4}")) {
                return value;
            } 
        }
    }

    public static int InputInt() {

        while (true) {
            try {
                int value = inputReader.nextInt();
                return value;

            } catch (Exception e) {
                System.err.println("[*]Debe introducir un numero valido.");

                inputReader.nextLine(); // Esto limpia el buffer de entrada
            }
        }
    }

    public static int InputInt(int rangoMin, int rangoMax) {

        if (rangoMax == 0) {
            throw new IllegalArgumentException("[*]La lista esta vacia");
        }

        while (true) {
            try {

                int value = inputReader.nextInt();

                // Comprobar si está dentro del rango permitido
                if (value >= rangoMin && value <= rangoMax) {
                    return value;
                } else {
                    System.err.println("[*]El valor debe estar entre " + rangoMin + " y " + rangoMax);
                }

            } catch (Exception e) {
                System.err.println("[*]Debe introducir un numero valido.");

                inputReader.nextLine(); // Esto limpia el buffer de entrada
            }
        }
    }

}
