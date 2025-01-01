/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.Gestor;
import Modelo.Persona;
import Modelo.Demarcacion;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import Modelo.Especialidad;
import Modelo.Meses;
import Modelo.Puesto;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;

/**
 * Clase principal de la ventana que gestiona el club de fútbol.
 * Contiene la inicialización de componentes, variables y eventos 
 * para interactuar con la interfaz.
 *
 * @author HugoFDZ
 */
public class MainWindow extends javax.swing.JFrame {

    Color colorTexto = new Color(0, 0, 0);
    Icon icon = new ImageIcon(getClass().getResource("/Resources/Media/IconBall.png"));

    List<JTextField> camposAltaInputsYModificar;
    List<JTextField> camposNumericos;
    List<JTextField> camposModificarInputs;
    List<JTextField> camposModificarNomina;
    List<JTextField> camposCrearNomina;
    List<JLabel> titulosLabel;
    List<JLabel> topInput;
    List<JLabel> imprimirListadosLbls;
    List<JButton> botonesHomeEstilizar;
    List<JButton> botonesModificar;
    List<JButton> botonesHome;
    List<JButton> botonesToFont;
    
    //Me permite crear una lista de ComboBoxes de enumerados de cualquier tipo
    List<JComboBox<? extends Enum<?>>> listaComboBoxModificar = new ArrayList<>();
    
    Font HomeFontLabel;
    Font Titulos;
    Font Botones;
    Font LabelTopInput;
    Font InputFont;

    DefaultTableModel modeloPersonas;

    
    /**
     * Constructor de la ventana principal.
     * Inicializa los componentes y las variables necesarias.
     */
    public MainWindow() {

        initComponents();

        inicializarVariables();

        inicializarEventos();


    }

    /**
     * Este método es llamado desde el constructor para inicializar los componentes
     * de la interfaz gráfica. <br>
     * <b>ADVERTENCIA:</b> No modificar el contenido de este método. Su contenido 
     * siempre es regenerado por el Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelRaiz = new javax.swing.JPanel();
        HomeWindow = new javax.swing.JPanel();
        BtnGestionarPlantilla = new javax.swing.JButton();
        BtnJugarPartido = new javax.swing.JButton();
        BtnGastos = new javax.swing.JButton();
        BtnImprimir = new javax.swing.JButton();
        PanelPlantilla = new javax.swing.JScrollPane();
        TablaContenidoPlantilla = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        Text_PlantillaActual = new javax.swing.JLabel();
        Text_Titulo = new javax.swing.JLabel();
        GestionWindow = new javax.swing.JPanel();
        BtnDarDeAltaPersona = new javax.swing.JButton();
        BtnEliminarPersona = new javax.swing.JButton();
        BtnModificarDatos = new javax.swing.JButton();
        PanelGestionPersonas = new javax.swing.JScrollPane();
        TablaGestionPersonas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        BtnHome = new javax.swing.JButton();
        Text_TituloPlantilla = new javax.swing.JLabel();
        JugarPartidoWindow = new javax.swing.JPanel();
        VisitanteGolesSpinner = new javax.swing.JSpinner();
        LocalGolesSpinner = new javax.swing.JSpinner();
        GolesLocalLabel = new javax.swing.JLabel();
        GolesVisitanteLabel = new javax.swing.JLabel();
        BtnTerminarPartido = new javax.swing.JButton();
        TextoNombreEquipoRival = new javax.swing.JLabel();
        InputNombreRival = new javax.swing.JTextField();
        jSeparator41 = new javax.swing.JSeparator();
        RadioBtnVisitante = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        BtnHomePartido = new javax.swing.JButton();
        PartidoLabel = new javax.swing.JLabel();
        GastosWindow = new javax.swing.JPanel();
        PanelGastosPersonas = new javax.swing.JScrollPane();
        TablaGastosPersonas = new javax.swing.JTable();
        BtnCrearNomina = new javax.swing.JButton();
        BtnCrearFactura = new javax.swing.JButton();
        BtnModificarConceptoNomina = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        GestionLabel = new javax.swing.JLabel();
        BtnHomeGastos = new javax.swing.JButton();
        ImprimirWindow = new javax.swing.JPanel();
        labelPDF = new javax.swing.JLabel();
        labelTXT = new javax.swing.JLabel();
        BtnImprimirTXTSortedNombre = new javax.swing.JButton();
        BtnImprimirTXTSortedDNI = new javax.swing.JButton();
        ImprimirListadosLbl2 = new javax.swing.JLabel();
        ImprimirListadosLbl1 = new javax.swing.JLabel();
        ImprimirListadosLbl4 = new javax.swing.JLabel();
        BtnImprimirTXTResultadosEquipo = new javax.swing.JButton();
        ImprimirListadosLbl5 = new javax.swing.JLabel();
        BtnImprimirTXTNominas = new javax.swing.JButton();
        jSeparator60 = new javax.swing.JSeparator();
        ImprimirListadosLbl3 = new javax.swing.JLabel();
        jSeparator61 = new javax.swing.JSeparator();
        jSeparator62 = new javax.swing.JSeparator();
        BtnImprimirPDFSortedDNI = new javax.swing.JButton();
        BtnImprimirPDFSortedNombre = new javax.swing.JButton();
        BtnImprimirPDFResultadosEquipo = new javax.swing.JButton();
        BtnImprimirPDFNominas = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        BtnHomeImprimir = new javax.swing.JButton();
        TituloImprimir = new javax.swing.JLabel();
        DarDeAltaWindow = new javax.swing.JPanel();
        TabbedDarDeAlta = new javax.swing.JTabbedPane();
        PanelAltaJugador = new javax.swing.JPanel();
        TextoAltaJugadorNombre = new javax.swing.JLabel();
        InputAltaJugadorNombre = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        TextoAltaJugadorApellido = new javax.swing.JLabel();
        InputAltaJugadorApellido = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        TextoAltaJugadorTelefono = new javax.swing.JLabel();
        InputAltaJugadorTelefono = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        TextoAltaJugadorEdad = new javax.swing.JLabel();
        InputAltaJugadorEdad = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        TextoAltaJugadorValor = new javax.swing.JLabel();
        InputAltaJugadorValor = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        TextoAltaJugadorDNI = new javax.swing.JLabel();
        InputAltaJugadorDNI = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        BtnCrearJugador = new javax.swing.JButton();
        TextoAltaJugadorDemarcacion = new javax.swing.JLabel();
        jSeparator19 = new javax.swing.JSeparator();
        ComBoxDemarcacion = new javax.swing.JComboBox<>();
        TextoAltaJugadorEstadoFisico = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        ToggleEstadoFisico = new javax.swing.JToggleButton();
        PanelAltaTecnico = new javax.swing.JPanel();
        TextoAltaTecnicoNombre = new javax.swing.JLabel();
        InputAltaTecnicoNombre = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        TextoAltaTecnicoApellido = new javax.swing.JLabel();
        InputAltaTecnicoApellido = new javax.swing.JTextField();
        jSeparator14 = new javax.swing.JSeparator();
        TextoAltaTecnicoTelefono = new javax.swing.JLabel();
        InputAltaTecnicoTelefono = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        TextoAltaTecnicoDNI = new javax.swing.JLabel();
        InputAltaTecnicoDNI = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        TextoAltaJugadorValor1 = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        TextoAltaJugadorDNI1 = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        BtnCrearTecnico = new javax.swing.JButton();
        ComboBoxTecnicoEspecialidad = new javax.swing.JComboBox<>();
        ComboBoxTecnicoPuesto = new javax.swing.JComboBox<>();
        PanelAltaDirectivo = new javax.swing.JPanel();
        TextoAltaDirectivoNombre = new javax.swing.JLabel();
        InputAltaDirectivoCargo = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        TextoAltaDirectivoApellido = new javax.swing.JLabel();
        InputAltaDirectivoApellido = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        TextoAltaDirectivoTelefono = new javax.swing.JLabel();
        InputAltaDirectivoTelefono = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        TextoAltaDirectivoDNI = new javax.swing.JLabel();
        InputAltaDirectivoDNI = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        BtnCrearDirectivo = new javax.swing.JButton();
        TextoAltaDirectivoCargo = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        InputAltaDirectivoNombre = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        GestionLabel1 = new javax.swing.JLabel();
        BtnDarDeAltaAtras = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        ModificarConceptoWindow = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        TituloModificarConcepto = new javax.swing.JLabel();
        BtnHomeModificarConceptos = new javax.swing.JButton();
        PanelConceptosNomina = new javax.swing.JScrollPane();
        TablaConceptosNomina = new javax.swing.JTable();
        TituloModificarConceptos = new javax.swing.JLabel();
        BtnModificarConcepto = new javax.swing.JButton();
        BtnEliminarConcepto = new javax.swing.JButton();
        FacturaWindow = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        BtnHomeCrearFactura = new javax.swing.JButton();
        TituloCrearFactura = new javax.swing.JLabel();
        TextoCrearFacturaNombre = new javax.swing.JLabel();
        InputCrearFacturaNombre = new javax.swing.JTextField();
        jSeparator48 = new javax.swing.JSeparator();
        InputCrearFacturaCIF = new javax.swing.JTextField();
        TextoCrearFacturaCIF = new javax.swing.JLabel();
        jSeparator49 = new javax.swing.JSeparator();
        TextoCrearFacturaCantidad = new javax.swing.JLabel();
        InputCrearFacturaCantidad = new javax.swing.JTextField();
        jSeparator50 = new javax.swing.JSeparator();
        TextoCrearFacturaID = new javax.swing.JLabel();
        InputCrearFacturaID = new javax.swing.JTextField();
        jSeparator51 = new javax.swing.JSeparator();
        CrearFacturaFinal = new javax.swing.JButton();
        TextoCrearFacturaFechaPago = new javax.swing.JLabel();
        InputCrearFacturaFecha = new javax.swing.JTextField();
        jSeparator52 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        CrearNominaWindow = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        TituloCrearFactura1 = new javax.swing.JLabel();
        BtnHomeCrearNomina = new javax.swing.JButton();
        TextoCrearNominaImporte = new javax.swing.JLabel();
        InputCrearNominaImporte = new javax.swing.JTextField();
        jSeparator42 = new javax.swing.JSeparator();
        TextoCrearNominaImporte1 = new javax.swing.JLabel();
        InputCrearNominaDescripcion = new javax.swing.JTextField();
        jSeparator43 = new javax.swing.JSeparator();
        jSeparator44 = new javax.swing.JSeparator();
        TextoCrearNominaFecha = new javax.swing.JLabel();
        TituloCrearNomina = new javax.swing.JLabel();
        BtnCrearNominaFinal = new javax.swing.JButton();
        InputCrearNominaAno = new javax.swing.JTextField();
        ComBoxMesNomina = new javax.swing.JComboBox<>();
        TextoCrearNominaMes = new javax.swing.JLabel();
        jSeparator46 = new javax.swing.JSeparator();
        TextoCrearNominaImporte2 = new javax.swing.JLabel();
        InputCrearNominaID = new javax.swing.JTextField();
        jSeparator47 = new javax.swing.JSeparator();
        ModificarNominaWindow = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        TituloCrearNomina1 = new javax.swing.JLabel();
        BtnHomeModificarNomina = new javax.swing.JButton();
        TextoCrearNominaImporte3 = new javax.swing.JLabel();
        InputModificarNominaImporte = new javax.swing.JTextField();
        jSeparator53 = new javax.swing.JSeparator();
        TextoCrearNominaImporte4 = new javax.swing.JLabel();
        InputModificarNominaDescripcion = new javax.swing.JTextField();
        jSeparator54 = new javax.swing.JSeparator();
        jSeparator55 = new javax.swing.JSeparator();
        TextoCrearNominaFecha1 = new javax.swing.JLabel();
        BtnModificarNominaFinal = new javax.swing.JButton();
        InputModificarNominaAno = new javax.swing.JTextField();
        ComBoxMesNominaModificar = new javax.swing.JComboBox<>();
        TextoCrearNominaMes1 = new javax.swing.JLabel();
        jSeparator57 = new javax.swing.JSeparator();
        TextoCrearNominaImporte5 = new javax.swing.JLabel();
        InputModificarNominaID = new javax.swing.JTextField();
        jSeparator58 = new javax.swing.JSeparator();
        ModificarPersonaWindow = new javax.swing.JPanel();
        BtnDarDeAltaAtrasModificar = new javax.swing.JButton();
        TabbedModificar = new javax.swing.JTabbedPane();
        PanelModificarJugador = new javax.swing.JPanel();
        TextoAltaJugadorNombre1 = new javax.swing.JLabel();
        InputModificarJugadorNombre = new javax.swing.JTextField();
        jSeparator22 = new javax.swing.JSeparator();
        TextoAltaJugadorApellido1 = new javax.swing.JLabel();
        InputModificarJugadorApellido = new javax.swing.JTextField();
        jSeparator23 = new javax.swing.JSeparator();
        TextoAltaJugadorTelefono1 = new javax.swing.JLabel();
        InputModificarJugadorTelefono = new javax.swing.JTextField();
        jSeparator24 = new javax.swing.JSeparator();
        TextoAltaJugadorEdad1 = new javax.swing.JLabel();
        InputModificarJugadorEdad = new javax.swing.JTextField();
        jSeparator25 = new javax.swing.JSeparator();
        TextoAltaJugadorValor2 = new javax.swing.JLabel();
        InputModificarJugadorValor = new javax.swing.JTextField();
        jSeparator26 = new javax.swing.JSeparator();
        TextoAltaJugadorDNI2 = new javax.swing.JLabel();
        InputModificarJugadorDNI = new javax.swing.JTextField();
        jSeparator27 = new javax.swing.JSeparator();
        BtnModificarJugador = new javax.swing.JButton();
        TextoAltaJugadorDemarcacion1 = new javax.swing.JLabel();
        jSeparator28 = new javax.swing.JSeparator();
        ComBoxModificarDemarcacion = new javax.swing.JComboBox<>();
        TextoAltaJugadorEstadoFisico1 = new javax.swing.JLabel();
        jSeparator29 = new javax.swing.JSeparator();
        ToggleModificarEstadoFisico = new javax.swing.JToggleButton();
        PanelModificarTecnico = new javax.swing.JPanel();
        TextoAltaTecnicoNombre1 = new javax.swing.JLabel();
        InputModificarTecnicoNombre = new javax.swing.JTextField();
        jSeparator30 = new javax.swing.JSeparator();
        TextoAltaTecnicoApellido1 = new javax.swing.JLabel();
        InputModificarTecnicoApellido = new javax.swing.JTextField();
        jSeparator31 = new javax.swing.JSeparator();
        TextoAltaTecnicoTelefono1 = new javax.swing.JLabel();
        InputModificarTecnicoTelefono = new javax.swing.JTextField();
        jSeparator32 = new javax.swing.JSeparator();
        TextoAltaTecnicoDNI1 = new javax.swing.JLabel();
        InputModificarTecnicoDNI = new javax.swing.JTextField();
        jSeparator33 = new javax.swing.JSeparator();
        TextoAltaJugadorValor3 = new javax.swing.JLabel();
        jSeparator34 = new javax.swing.JSeparator();
        TextoAltaJugadorDNI3 = new javax.swing.JLabel();
        jSeparator35 = new javax.swing.JSeparator();
        BtnModificarTécnico = new javax.swing.JButton();
        ComboBoxModificarTecnicoEspecialidad = new javax.swing.JComboBox<>();
        ComboBoxModificarTecnicoPuesto = new javax.swing.JComboBox<>();
        PanelModificarDirectivo = new javax.swing.JPanel();
        TextoAltaDirectivoNombre1 = new javax.swing.JLabel();
        InputModificarDirectivoCargo = new javax.swing.JTextField();
        jSeparator36 = new javax.swing.JSeparator();
        TextoAltaDirectivoApellido1 = new javax.swing.JLabel();
        InputModificarDirectivoApellido = new javax.swing.JTextField();
        jSeparator37 = new javax.swing.JSeparator();
        TextoAltaDirectivoTelefono1 = new javax.swing.JLabel();
        InputModificarDirectivoTelefono = new javax.swing.JTextField();
        jSeparator38 = new javax.swing.JSeparator();
        TextoAltaDirectivoDNI1 = new javax.swing.JLabel();
        InputModificarDirectivoDNI = new javax.swing.JTextField();
        jSeparator39 = new javax.swing.JSeparator();
        BtnModificarDirectivo = new javax.swing.JButton();
        TextoAltaDirectivoCargo1 = new javax.swing.JLabel();
        jSeparator40 = new javax.swing.JSeparator();
        InputModificarDirectivoNombre = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        TituloDarDeAlta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelRaiz.setLayout(new java.awt.CardLayout());

        HomeWindow.setBackground(new java.awt.Color(244, 244, 244));
        HomeWindow.setForeground(new java.awt.Color(227, 227, 227));
        HomeWindow.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        HomeWindow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnGestionarPlantilla.setBackground(new java.awt.Color(59, 185, 122));
        BtnGestionarPlantilla.setFont(new java.awt.Font("Poppins SemiBold", 1, 36)); // NOI18N
        BtnGestionarPlantilla.setForeground(new java.awt.Color(0, 0, 0));
        BtnGestionarPlantilla.setText("Gestionar plantilla");
        BtnGestionarPlantilla.setBorder(null);
        BtnGestionarPlantilla.setContentAreaFilled(false);
        BtnGestionarPlantilla.setFocusPainted(false);
        HomeWindow.add(BtnGestionarPlantilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, -1, -1));

        BtnJugarPartido.setBackground(new java.awt.Color(59, 185, 122));
        BtnJugarPartido.setFont(new java.awt.Font("Poppins SemiBold", 1, 36)); // NOI18N
        BtnJugarPartido.setForeground(new java.awt.Color(0, 0, 0));
        BtnJugarPartido.setText("Jugar partido");
        BtnJugarPartido.setBorder(null);
        BtnJugarPartido.setContentAreaFilled(false);
        HomeWindow.add(BtnJugarPartido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        BtnGastos.setBackground(new java.awt.Color(59, 185, 122));
        BtnGastos.setFont(new java.awt.Font("Poppins SemiBold", 1, 36)); // NOI18N
        BtnGastos.setForeground(new java.awt.Color(0, 0, 0));
        BtnGastos.setText("Gastos");
        BtnGastos.setBorder(null);
        BtnGastos.setContentAreaFilled(false);
        HomeWindow.add(BtnGastos, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        BtnImprimir.setBackground(new java.awt.Color(59, 185, 122));
        BtnImprimir.setFont(new java.awt.Font("Poppins SemiBold", 1, 36)); // NOI18N
        BtnImprimir.setForeground(new java.awt.Color(0, 0, 0));
        BtnImprimir.setText("Imprimir");
        BtnImprimir.setBorder(null);
        BtnImprimir.setContentAreaFilled(false);
        HomeWindow.add(BtnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, -1, -1));

        PanelPlantilla.setBackground(new java.awt.Color(246, 144, 84));
        PanelPlantilla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelPlantilla.setForeground(new java.awt.Color(0, 0, 0));
        PanelPlantilla.setToolTipText("");
        PanelPlantilla.setFont(new java.awt.Font("Poppins SemiBold", 1, 12)); // NOI18N

        TablaContenidoPlantilla.setBackground(new java.awt.Color(246, 144, 84));
        TablaContenidoPlantilla.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        TablaContenidoPlantilla.setForeground(new java.awt.Color(0, 0, 0));
        TablaContenidoPlantilla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaContenidoPlantilla.setGridColor(new java.awt.Color(0, 0, 0));
        TablaContenidoPlantilla.setSelectionBackground(new java.awt.Color(255, 255, 255));
        TablaContenidoPlantilla.setSelectionForeground(new java.awt.Color(255, 255, 255));
        TablaContenidoPlantilla.setShowGrid(false);
        TablaContenidoPlantilla.setShowHorizontalLines(true);
        PanelPlantilla.setViewportView(TablaContenidoPlantilla);

        HomeWindow.add(PanelPlantilla, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 150, 400, 440));

        jPanel1.setBackground(new java.awt.Color(246, 144, 84));

        Text_PlantillaActual.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        Text_PlantillaActual.setForeground(new java.awt.Color(255, 255, 255));
        Text_PlantillaActual.setText("Plantilla actual");

        Text_Titulo.setFont(new java.awt.Font("Poppins SemiBold", 1, 56)); // NOI18N
        Text_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Text_Titulo.setText("¡Gestiona tu club!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(Text_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(Text_PlantillaActual)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Text_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Text_PlantillaActual)
                        .addGap(18, 18, 18))))
        );

        HomeWindow.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 130));

        PanelRaiz.add(HomeWindow, "card2");

        GestionWindow.setBackground(new java.awt.Color(218, 240, 234));
        GestionWindow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnDarDeAltaPersona.setBackground(new java.awt.Color(29, 78, 138));
        BtnDarDeAltaPersona.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        BtnDarDeAltaPersona.setForeground(new java.awt.Color(255, 255, 255));
        BtnDarDeAltaPersona.setText("Dar de alta");
        GestionWindow.add(BtnDarDeAltaPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 180, 110));

        BtnEliminarPersona.setBackground(new java.awt.Color(15, 42, 75));
        BtnEliminarPersona.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        BtnEliminarPersona.setForeground(new java.awt.Color(246, 144, 84));
        BtnEliminarPersona.setText("Eliminar persona");
        BtnEliminarPersona.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GestionWindow.add(BtnEliminarPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 510, 170, 30));

        BtnModificarDatos.setBackground(new java.awt.Color(29, 78, 138));
        BtnModificarDatos.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        BtnModificarDatos.setForeground(new java.awt.Color(255, 255, 255));
        BtnModificarDatos.setText("Modificar persona");
        GestionWindow.add(BtnModificarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 180, 110));

        TablaGestionPersonas.setBackground(new java.awt.Color(246, 144, 84));
        TablaGestionPersonas.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        TablaGestionPersonas.setForeground(new java.awt.Color(0, 0, 0));
        TablaGestionPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        PanelGestionPersonas.setViewportView(TablaGestionPersonas);
        if (TablaGestionPersonas.getColumnModel().getColumnCount() > 0) {
            TablaGestionPersonas.getColumnModel().getColumn(0).setHeaderValue("Title 1");
            TablaGestionPersonas.getColumnModel().getColumn(1).setHeaderValue("Title 2");
            TablaGestionPersonas.getColumnModel().getColumn(2).setHeaderValue("Title 3");
            TablaGestionPersonas.getColumnModel().getColumn(3).setHeaderValue("Title 4");
        }

        GestionWindow.add(PanelGestionPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 630, 440));

        jPanel2.setBackground(new java.awt.Color(246, 144, 84));

        BtnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Media/home.png"))); // NOI18N
        BtnHome.setBorder(null);
        BtnHome.setBorderPainted(false);
        BtnHome.setContentAreaFilled(false);

        Text_TituloPlantilla.setFont(new java.awt.Font("Poppins SemiBold", 1, 48)); // NOI18N
        Text_TituloPlantilla.setForeground(new java.awt.Color(255, 255, 255));
        Text_TituloPlantilla.setText("Gestiona la plantilla");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(BtnHome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 377, Short.MAX_VALUE)
                .addComponent(Text_TituloPlantilla)
                .addGap(111, 111, 111))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(BtnHome)
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Text_TituloPlantilla)
                .addGap(27, 27, 27))
        );

        GestionWindow.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 130));

        PanelRaiz.add(GestionWindow, "card3");

        JugarPartidoWindow.setBackground(new java.awt.Color(218, 240, 234));
        JugarPartidoWindow.setMinimumSize(new java.awt.Dimension(1030, 590));
        JugarPartidoWindow.setPreferredSize(new java.awt.Dimension(1030, 590));
        JugarPartidoWindow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        VisitanteGolesSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        JugarPartidoWindow.add(VisitanteGolesSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, -1, 45));

        LocalGolesSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        JugarPartidoWindow.add(LocalGolesSpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, 45));

        GolesLocalLabel.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        GolesLocalLabel.setForeground(new java.awt.Color(246, 144, 84));
        GolesLocalLabel.setText("Goles rivales");
        JugarPartidoWindow.add(GolesLocalLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(606, 253, 150, -1));

        GolesVisitanteLabel.setBackground(new java.awt.Color(246, 144, 84));
        GolesVisitanteLabel.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        GolesVisitanteLabel.setForeground(new java.awt.Color(246, 144, 84));
        GolesVisitanteLabel.setText("Tus goles");
        JugarPartidoWindow.add(GolesVisitanteLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 254, 140, -1));

        BtnTerminarPartido.setBackground(new java.awt.Color(29, 78, 138));
        BtnTerminarPartido.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        BtnTerminarPartido.setForeground(new java.awt.Color(255, 255, 255));
        BtnTerminarPartido.setText("Terminar partido");
        JugarPartidoWindow.add(BtnTerminarPartido, new org.netbeans.lib.awtextra.AbsoluteConstraints(791, 479, 170, 69));

        TextoNombreEquipoRival.setBackground(new java.awt.Color(255, 255, 255));
        TextoNombreEquipoRival.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoNombreEquipoRival.setForeground(new java.awt.Color(246, 144, 84));
        TextoNombreEquipoRival.setText("Nombre del equipo rival");
        JugarPartidoWindow.add(TextoNombreEquipoRival, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 413, 240, -1));

        InputNombreRival.setBackground(new java.awt.Color(218, 240, 234));
        InputNombreRival.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputNombreRival.setForeground(new java.awt.Color(107, 107, 107));
        InputNombreRival.setText("Inserte el nombre del equipo rival...");
        InputNombreRival.setBorder(null);
        JugarPartidoWindow.add(InputNombreRival, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 441, 270, -1));

        jSeparator41.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator41.setForeground(new java.awt.Color(255, 255, 255));
        JugarPartidoWindow.add(jSeparator41, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 466, 244, 10));

        RadioBtnVisitante.setBackground(new java.awt.Color(218, 240, 234));
        RadioBtnVisitante.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        RadioBtnVisitante.setForeground(new java.awt.Color(246, 144, 84));
        RadioBtnVisitante.setText("¿Eres visitante?");
        JugarPartidoWindow.add(RadioBtnVisitante, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 240, -1));

        jPanel3.setBackground(new java.awt.Color(246, 144, 84));

        BtnHomePartido.setBackground(new java.awt.Color(246, 144, 84));
        BtnHomePartido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Media/home.png"))); // NOI18N
        BtnHomePartido.setBorder(null);

        PartidoLabel.setFont(new java.awt.Font("Poppins SemiBold", 0, 48)); // NOI18N
        PartidoLabel.setForeground(new java.awt.Color(255, 255, 255));
        PartidoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PartidoLabel.setText("Partido");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(BtnHomePartido)
                .addGap(233, 233, 233)
                .addComponent(PartidoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(363, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(BtnHomePartido))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(PartidoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        JugarPartidoWindow.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 130));

        PanelRaiz.add(JugarPartidoWindow, "card6");

        GastosWindow.setBackground(new java.awt.Color(218, 240, 234));
        GastosWindow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaGastosPersonas.setBackground(new java.awt.Color(246, 144, 84));
        TablaGastosPersonas.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        TablaGastosPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        PanelGastosPersonas.setViewportView(TablaGastosPersonas);

        GastosWindow.add(PanelGastosPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 630, 440));

        BtnCrearNomina.setBackground(new java.awt.Color(29, 78, 138));
        BtnCrearNomina.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        BtnCrearNomina.setForeground(new java.awt.Color(255, 255, 255));
        BtnCrearNomina.setText("Crear nómina/s");
        GastosWindow.add(BtnCrearNomina, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 217, 58));

        BtnCrearFactura.setBackground(new java.awt.Color(29, 78, 138));
        BtnCrearFactura.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        BtnCrearFactura.setForeground(new java.awt.Color(255, 255, 255));
        BtnCrearFactura.setText("Crear factura");
        GastosWindow.add(BtnCrearFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, 217, 62));

        BtnModificarConceptoNomina.setBackground(new java.awt.Color(29, 78, 138));
        BtnModificarConceptoNomina.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        BtnModificarConceptoNomina.setForeground(new java.awt.Color(255, 255, 255));
        BtnModificarConceptoNomina.setText("Modificar concepto de nómina");
        GastosWindow.add(BtnModificarConceptoNomina, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 280, 60));

        jPanel4.setBackground(new java.awt.Color(246, 144, 84));

        GestionLabel.setFont(new java.awt.Font("Poppins SemiBold", 0, 48)); // NOI18N
        GestionLabel.setForeground(new java.awt.Color(255, 255, 255));
        GestionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GestionLabel.setText("Gestionar gastos");

        BtnHomeGastos.setBackground(new java.awt.Color(246, 144, 84));
        BtnHomeGastos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Media/home.png"))); // NOI18N
        BtnHomeGastos.setBorder(null);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(BtnHomeGastos, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 287, Short.MAX_VALUE)
                .addComponent(GestionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(BtnHomeGastos)
                .addGap(50, 50, 50))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(GestionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GastosWindow.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 130));

        PanelRaiz.add(GastosWindow, "card7");

        ImprimirWindow.setBackground(new java.awt.Color(218, 240, 234));
        ImprimirWindow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelPDF.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        labelPDF.setForeground(new java.awt.Color(29, 78, 138));
        labelPDF.setText("Ficheros PDF");
        ImprimirWindow.add(labelPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 180, 120, 58));

        labelTXT.setFont(new java.awt.Font("Poppins SemiBold", 0, 18)); // NOI18N
        labelTXT.setForeground(new java.awt.Color(29, 78, 138));
        labelTXT.setText("Ficheros de texto (.txt)");
        ImprimirWindow.add(labelTXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 210, 58));

        BtnImprimirTXTSortedNombre.setBackground(new java.awt.Color(29, 78, 138));
        BtnImprimirTXTSortedNombre.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        BtnImprimirTXTSortedNombre.setForeground(new java.awt.Color(255, 255, 255));
        BtnImprimirTXTSortedNombre.setText("Empleados eliminados");
        ImprimirWindow.add(BtnImprimirTXTSortedNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, 220, 53));

        BtnImprimirTXTSortedDNI.setBackground(new java.awt.Color(29, 78, 138));
        BtnImprimirTXTSortedDNI.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        BtnImprimirTXTSortedDNI.setForeground(new java.awt.Color(255, 255, 255));
        BtnImprimirTXTSortedDNI.setText("Empleados activos");
        ImprimirWindow.add(BtnImprimirTXTSortedDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 220, 53));

        ImprimirListadosLbl2.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        ImprimirListadosLbl2.setForeground(new java.awt.Color(0, 0, 0));
        ImprimirListadosLbl2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ImprimirListadosLbl2.setText("Listado de empleados despedidos ordenados");
        ImprimirListadosLbl2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ImprimirWindow.add(ImprimirListadosLbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 350, 30));

        ImprimirListadosLbl1.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        ImprimirListadosLbl1.setForeground(new java.awt.Color(0, 0, 0));
        ImprimirListadosLbl1.setText("Listado de empleados activos ordenados por DNI");
        ImprimirWindow.add(ImprimirListadosLbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 380, 33));

        ImprimirListadosLbl4.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        ImprimirListadosLbl4.setForeground(new java.awt.Color(0, 0, 0));
        ImprimirListadosLbl4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ImprimirListadosLbl4.setText("Listado de resultados del equipo de una temporada");
        ImprimirListadosLbl4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ImprimirWindow.add(ImprimirListadosLbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 380, 40));

        BtnImprimirTXTResultadosEquipo.setBackground(new java.awt.Color(29, 78, 138));
        BtnImprimirTXTResultadosEquipo.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        BtnImprimirTXTResultadosEquipo.setForeground(new java.awt.Color(255, 255, 255));
        BtnImprimirTXTResultadosEquipo.setText("Resultados del equipo");
        ImprimirWindow.add(BtnImprimirTXTResultadosEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, 220, 53));

        ImprimirListadosLbl5.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        ImprimirListadosLbl5.setForeground(new java.awt.Color(0, 0, 0));
        ImprimirListadosLbl5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ImprimirListadosLbl5.setText("Listado de nominas generadas");
        ImprimirListadosLbl5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ImprimirWindow.add(ImprimirListadosLbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 310, 40));

        BtnImprimirTXTNominas.setBackground(new java.awt.Color(29, 78, 138));
        BtnImprimirTXTNominas.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        BtnImprimirTXTNominas.setForeground(new java.awt.Color(255, 255, 255));
        BtnImprimirTXTNominas.setText("Nominas generadas");
        ImprimirWindow.add(BtnImprimirTXTNominas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, 220, 53));

        jSeparator60.setForeground(new java.awt.Color(246, 144, 84));
        ImprimirWindow.add(jSeparator60, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 960, 10));

        ImprimirListadosLbl3.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        ImprimirListadosLbl3.setForeground(new java.awt.Color(0, 0, 0));
        ImprimirListadosLbl3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ImprimirListadosLbl3.setText(" por nombre y apellido");
        ImprimirWindow.add(ImprimirListadosLbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jSeparator61.setForeground(new java.awt.Color(246, 144, 84));
        ImprimirWindow.add(jSeparator61, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 960, 10));

        jSeparator62.setForeground(new java.awt.Color(246, 144, 84));
        ImprimirWindow.add(jSeparator62, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 960, 10));

        BtnImprimirPDFSortedDNI.setBackground(new java.awt.Color(29, 78, 138));
        BtnImprimirPDFSortedDNI.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        BtnImprimirPDFSortedDNI.setForeground(new java.awt.Color(255, 255, 255));
        BtnImprimirPDFSortedDNI.setText("Empleados activos");
        ImprimirWindow.add(BtnImprimirPDFSortedDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 250, 220, 53));

        BtnImprimirPDFSortedNombre.setBackground(new java.awt.Color(29, 78, 138));
        BtnImprimirPDFSortedNombre.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        BtnImprimirPDFSortedNombre.setForeground(new java.awt.Color(255, 255, 255));
        BtnImprimirPDFSortedNombre.setText("Empleados eliminados");
        ImprimirWindow.add(BtnImprimirPDFSortedNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 340, 220, 53));

        BtnImprimirPDFResultadosEquipo.setBackground(new java.awt.Color(29, 78, 138));
        BtnImprimirPDFResultadosEquipo.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        BtnImprimirPDFResultadosEquipo.setForeground(new java.awt.Color(255, 255, 255));
        BtnImprimirPDFResultadosEquipo.setText("Resultados del equipo");
        ImprimirWindow.add(BtnImprimirPDFResultadosEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 430, 220, 53));

        BtnImprimirPDFNominas.setBackground(new java.awt.Color(29, 78, 138));
        BtnImprimirPDFNominas.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        BtnImprimirPDFNominas.setForeground(new java.awt.Color(255, 255, 255));
        BtnImprimirPDFNominas.setText("Nominas generadas");
        ImprimirWindow.add(BtnImprimirPDFNominas, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 520, 220, 53));

        jPanel5.setBackground(new java.awt.Color(246, 144, 84));

        BtnHomeImprimir.setBackground(new java.awt.Color(246, 144, 84));
        BtnHomeImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Media/home.png"))); // NOI18N
        BtnHomeImprimir.setBorder(null);

        TituloImprimir.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        TituloImprimir.setForeground(new java.awt.Color(255, 255, 255));
        TituloImprimir.setText("Imprimir listados");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(BtnHomeImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(226, 226, 226)
                .addComponent(TituloImprimir)
                .addContainerGap(323, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(BtnHomeImprimir)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(TituloImprimir)
                        .addGap(19, 19, 19))))
        );

        ImprimirWindow.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 130));

        PanelRaiz.add(ImprimirWindow, "card12");

        DarDeAltaWindow.setBackground(new java.awt.Color(187, 187, 187));
        DarDeAltaWindow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TabbedDarDeAlta.setBackground(new java.awt.Color(149, 212, 195));
        TabbedDarDeAlta.setForeground(new java.awt.Color(255, 255, 255));
        TabbedDarDeAlta.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N

        PanelAltaJugador.setBackground(new java.awt.Color(218, 240, 234));
        PanelAltaJugador.setForeground(new java.awt.Color(169, 253, 172));
        PanelAltaJugador.setToolTipText("");

        TextoAltaJugadorNombre.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaJugadorNombre.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaJugadorNombre.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaJugadorNombre.setText("Nombre");

        InputAltaJugadorNombre.setBackground(new java.awt.Color(218, 240, 234));
        InputAltaJugadorNombre.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputAltaJugadorNombre.setForeground(new java.awt.Color(107, 107, 107));
        InputAltaJugadorNombre.setText("Inserte el nombre...");
        InputAltaJugadorNombre.setBorder(null);

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        TextoAltaJugadorApellido.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaJugadorApellido.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaJugadorApellido.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaJugadorApellido.setText("Apellidos");

        InputAltaJugadorApellido.setBackground(new java.awt.Color(218, 240, 234));
        InputAltaJugadorApellido.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputAltaJugadorApellido.setForeground(new java.awt.Color(107, 107, 107));
        InputAltaJugadorApellido.setText("Inserte el apellido...");
        InputAltaJugadorApellido.setBorder(null);

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        TextoAltaJugadorTelefono.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaJugadorTelefono.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaJugadorTelefono.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaJugadorTelefono.setText("Teléfono");

        InputAltaJugadorTelefono.setBackground(new java.awt.Color(218, 240, 234));
        InputAltaJugadorTelefono.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputAltaJugadorTelefono.setForeground(new java.awt.Color(107, 107, 107));
        InputAltaJugadorTelefono.setText("Inserte el teléfono...");
        InputAltaJugadorTelefono.setBorder(null);

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        TextoAltaJugadorEdad.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaJugadorEdad.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaJugadorEdad.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaJugadorEdad.setText("Edad");

        InputAltaJugadorEdad.setBackground(new java.awt.Color(218, 240, 234));
        InputAltaJugadorEdad.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputAltaJugadorEdad.setForeground(new java.awt.Color(107, 107, 107));
        InputAltaJugadorEdad.setText("Inserte la edad...");
        InputAltaJugadorEdad.setBorder(null);

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        TextoAltaJugadorValor.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaJugadorValor.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaJugadorValor.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaJugadorValor.setText("Valor de mercado");

        InputAltaJugadorValor.setBackground(new java.awt.Color(218, 240, 234));
        InputAltaJugadorValor.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputAltaJugadorValor.setForeground(new java.awt.Color(107, 107, 107));
        InputAltaJugadorValor.setText("Inserte el valor de mercado...");
        InputAltaJugadorValor.setBorder(null);

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));

        TextoAltaJugadorDNI.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaJugadorDNI.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaJugadorDNI.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaJugadorDNI.setText("DNI");

        InputAltaJugadorDNI.setBackground(new java.awt.Color(218, 240, 234));
        InputAltaJugadorDNI.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputAltaJugadorDNI.setForeground(new java.awt.Color(107, 107, 107));
        InputAltaJugadorDNI.setText("Inserte el DNI...");
        InputAltaJugadorDNI.setBorder(null);

        jSeparator7.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));

        BtnCrearJugador.setBackground(new java.awt.Color(29, 78, 138));
        BtnCrearJugador.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        BtnCrearJugador.setForeground(new java.awt.Color(255, 255, 255));
        BtnCrearJugador.setText("Crear jugador");
        BtnCrearJugador.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TextoAltaJugadorDemarcacion.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaJugadorDemarcacion.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaJugadorDemarcacion.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaJugadorDemarcacion.setText("Demarcacion");

        jSeparator19.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator19.setForeground(new java.awt.Color(255, 255, 255));

        ComBoxDemarcacion.setBackground(new java.awt.Color(255, 255, 255));
        ComBoxDemarcacion.setBorder(null);

        TextoAltaJugadorEstadoFisico.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaJugadorEstadoFisico.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaJugadorEstadoFisico.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaJugadorEstadoFisico.setText("Estado fisico");

        jSeparator20.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator20.setForeground(new java.awt.Color(255, 255, 255));

        ToggleEstadoFisico.setBackground(new java.awt.Color(59, 185, 122));
        ToggleEstadoFisico.setFont(new java.awt.Font("Poppins SemiBold", 1, 12)); // NOI18N
        ToggleEstadoFisico.setForeground(new java.awt.Color(255, 255, 255));
        ToggleEstadoFisico.setText("Saludable");
        ToggleEstadoFisico.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout PanelAltaJugadorLayout = new javax.swing.GroupLayout(PanelAltaJugador);
        PanelAltaJugador.setLayout(PanelAltaJugadorLayout);
        PanelAltaJugadorLayout.setHorizontalGroup(
            PanelAltaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAltaJugadorLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(PanelAltaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAltaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(PanelAltaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator3)
                            .addComponent(InputAltaJugadorApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoAltaJugadorApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelAltaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2)
                            .addComponent(InputAltaJugadorNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(TextoAltaJugadorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelAltaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator4)
                        .addComponent(InputAltaJugadorTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextoAltaJugadorTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAltaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator5)
                        .addComponent(InputAltaJugadorEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextoAltaJugadorEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(PanelAltaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAltaJugadorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 436, Short.MAX_VALUE)
                        .addComponent(BtnCrearJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(PanelAltaJugadorLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(PanelAltaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelAltaJugadorLayout.createSequentialGroup()
                                .addGroup(PanelAltaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TextoAltaJugadorDemarcacion)
                                    .addComponent(jSeparator6)
                                    .addComponent(jSeparator7)
                                    .addComponent(InputAltaJugadorDNI)
                                    .addComponent(ComBoxDemarcacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextoAltaJugadorDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextoAltaJugadorValor, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PanelAltaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ToggleEstadoFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextoAltaJugadorEstadoFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(93, 93, 93))
                            .addGroup(PanelAltaJugadorLayout.createSequentialGroup()
                                .addComponent(InputAltaJugadorValor, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        PanelAltaJugadorLayout.setVerticalGroup(
            PanelAltaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAltaJugadorLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(PanelAltaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(PanelAltaJugadorLayout.createSequentialGroup()
                        .addComponent(TextoAltaJugadorNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputAltaJugadorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAltaJugadorLayout.createSequentialGroup()
                        .addComponent(TextoAltaJugadorValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputAltaJugadorValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(PanelAltaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAltaJugadorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextoAltaJugadorEstadoFisico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelAltaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelAltaJugadorLayout.createSequentialGroup()
                                .addComponent(TextoAltaJugadorDNI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(InputAltaJugadorDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelAltaJugadorLayout.createSequentialGroup()
                                .addComponent(ToggleEstadoFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PanelAltaJugadorLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(TextoAltaJugadorApellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputAltaJugadorApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(PanelAltaJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAltaJugadorLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(TextoAltaJugadorTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputAltaJugadorTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextoAltaJugadorEdad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputAltaJugadorEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAltaJugadorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addComponent(BtnCrearJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(PanelAltaJugadorLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(TextoAltaJugadorDemarcacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComBoxDemarcacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        TabbedDarDeAlta.addTab("Jugador", PanelAltaJugador);

        PanelAltaTecnico.setBackground(new java.awt.Color(218, 240, 234));

        TextoAltaTecnicoNombre.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaTecnicoNombre.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaTecnicoNombre.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaTecnicoNombre.setText("Nombre");

        InputAltaTecnicoNombre.setBackground(new java.awt.Color(218, 240, 234));
        InputAltaTecnicoNombre.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputAltaTecnicoNombre.setForeground(new java.awt.Color(107, 107, 107));
        InputAltaTecnicoNombre.setText("Inserte el nombre...");
        InputAltaTecnicoNombre.setBorder(null);

        jSeparator12.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator12.setForeground(new java.awt.Color(255, 255, 255));

        TextoAltaTecnicoApellido.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaTecnicoApellido.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaTecnicoApellido.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaTecnicoApellido.setText("Apellidos");

        InputAltaTecnicoApellido.setBackground(new java.awt.Color(218, 240, 234));
        InputAltaTecnicoApellido.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputAltaTecnicoApellido.setForeground(new java.awt.Color(107, 107, 107));
        InputAltaTecnicoApellido.setText("Inserte el apellido...");
        InputAltaTecnicoApellido.setBorder(null);

        jSeparator14.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator14.setForeground(new java.awt.Color(255, 255, 255));

        TextoAltaTecnicoTelefono.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaTecnicoTelefono.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaTecnicoTelefono.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaTecnicoTelefono.setText("Teléfono");

        InputAltaTecnicoTelefono.setBackground(new java.awt.Color(218, 240, 234));
        InputAltaTecnicoTelefono.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputAltaTecnicoTelefono.setForeground(new java.awt.Color(107, 107, 107));
        InputAltaTecnicoTelefono.setText("Inserte el teléfono...");
        InputAltaTecnicoTelefono.setBorder(null);

        jSeparator15.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator15.setForeground(new java.awt.Color(255, 255, 255));

        TextoAltaTecnicoDNI.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaTecnicoDNI.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaTecnicoDNI.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaTecnicoDNI.setText("DNI");

        InputAltaTecnicoDNI.setBackground(new java.awt.Color(218, 240, 234));
        InputAltaTecnicoDNI.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputAltaTecnicoDNI.setForeground(new java.awt.Color(107, 107, 107));
        InputAltaTecnicoDNI.setText("Inserte el DNI...");
        InputAltaTecnicoDNI.setBorder(null);

        jSeparator16.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator16.setForeground(new java.awt.Color(255, 255, 255));

        TextoAltaJugadorValor1.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaJugadorValor1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaJugadorValor1.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaJugadorValor1.setText("Puesto");

        jSeparator17.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator17.setForeground(new java.awt.Color(255, 255, 255));

        TextoAltaJugadorDNI1.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaJugadorDNI1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaJugadorDNI1.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaJugadorDNI1.setText("Especialidad");

        jSeparator18.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator18.setForeground(new java.awt.Color(255, 255, 255));

        BtnCrearTecnico.setBackground(new java.awt.Color(29, 78, 138));
        BtnCrearTecnico.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        BtnCrearTecnico.setForeground(new java.awt.Color(255, 255, 255));
        BtnCrearTecnico.setText("Crear técnico");
        BtnCrearTecnico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ComboBoxTecnicoEspecialidad.setBackground(new java.awt.Color(255, 255, 255));
        ComboBoxTecnicoEspecialidad.setForeground(new java.awt.Color(107, 107, 107));

        ComboBoxTecnicoPuesto.setBackground(new java.awt.Color(255, 255, 255));
        ComboBoxTecnicoPuesto.setForeground(new java.awt.Color(107, 107, 107));

        javax.swing.GroupLayout PanelAltaTecnicoLayout = new javax.swing.GroupLayout(PanelAltaTecnico);
        PanelAltaTecnico.setLayout(PanelAltaTecnicoLayout);
        PanelAltaTecnicoLayout.setHorizontalGroup(
            PanelAltaTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAltaTecnicoLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(PanelAltaTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAltaTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator15)
                        .addComponent(InputAltaTecnicoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextoAltaTecnicoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelAltaTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(PanelAltaTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator14)
                            .addComponent(InputAltaTecnicoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoAltaTecnicoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelAltaTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator12)
                            .addComponent(InputAltaTecnicoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoAltaTecnicoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelAltaTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator16)
                        .addComponent(InputAltaTecnicoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextoAltaTecnicoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(PanelAltaTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAltaTecnicoLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(PanelAltaTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator17, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(jSeparator18)
                            .addComponent(ComboBoxTecnicoEspecialidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ComboBoxTecnicoPuesto, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextoAltaJugadorDNI1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoAltaJugadorValor1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(438, Short.MAX_VALUE))
                    .addGroup(PanelAltaTecnicoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnCrearTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))))
        );
        PanelAltaTecnicoLayout.setVerticalGroup(
            PanelAltaTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAltaTecnicoLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(PanelAltaTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAltaTecnicoLayout.createSequentialGroup()
                        .addComponent(TextoAltaTecnicoNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputAltaTecnicoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TextoAltaTecnicoApellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputAltaTecnicoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TextoAltaTecnicoTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputAltaTecnicoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextoAltaTecnicoDNI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputAltaTecnicoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelAltaTecnicoLayout.createSequentialGroup()
                        .addComponent(TextoAltaJugadorValor1)
                        .addGap(9, 9, 9)
                        .addComponent(ComboBoxTecnicoPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextoAltaJugadorDNI1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboBoxTecnicoEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(BtnCrearTecnico, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );

        TabbedDarDeAlta.addTab("Técnico", PanelAltaTecnico);

        PanelAltaDirectivo.setBackground(new java.awt.Color(218, 240, 234));

        TextoAltaDirectivoNombre.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaDirectivoNombre.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaDirectivoNombre.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaDirectivoNombre.setText("Nombre");

        InputAltaDirectivoCargo.setBackground(new java.awt.Color(218, 240, 234));
        InputAltaDirectivoCargo.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputAltaDirectivoCargo.setForeground(new java.awt.Color(107, 107, 107));
        InputAltaDirectivoCargo.setText("Inserte el cargo...");
        InputAltaDirectivoCargo.setBorder(null);

        jSeparator8.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));

        TextoAltaDirectivoApellido.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaDirectivoApellido.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaDirectivoApellido.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaDirectivoApellido.setText("Apellidos");

        InputAltaDirectivoApellido.setBackground(new java.awt.Color(218, 240, 234));
        InputAltaDirectivoApellido.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputAltaDirectivoApellido.setForeground(new java.awt.Color(107, 107, 107));
        InputAltaDirectivoApellido.setText("Inserte el apellido...");
        InputAltaDirectivoApellido.setBorder(null);

        jSeparator9.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator9.setForeground(new java.awt.Color(255, 255, 255));

        TextoAltaDirectivoTelefono.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaDirectivoTelefono.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaDirectivoTelefono.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaDirectivoTelefono.setText("Teléfono");

        InputAltaDirectivoTelefono.setBackground(new java.awt.Color(218, 240, 234));
        InputAltaDirectivoTelefono.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputAltaDirectivoTelefono.setForeground(new java.awt.Color(107, 107, 107));
        InputAltaDirectivoTelefono.setText("Inserte el teléfono...");
        InputAltaDirectivoTelefono.setBorder(null);

        jSeparator10.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator10.setForeground(new java.awt.Color(255, 255, 255));

        TextoAltaDirectivoDNI.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaDirectivoDNI.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaDirectivoDNI.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaDirectivoDNI.setText("DNI");

        InputAltaDirectivoDNI.setBackground(new java.awt.Color(218, 240, 234));
        InputAltaDirectivoDNI.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputAltaDirectivoDNI.setForeground(new java.awt.Color(107, 107, 107));
        InputAltaDirectivoDNI.setText("Inserte el DNI...");
        InputAltaDirectivoDNI.setBorder(null);

        jSeparator13.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator13.setForeground(new java.awt.Color(255, 255, 255));

        BtnCrearDirectivo.setBackground(new java.awt.Color(29, 78, 138));
        BtnCrearDirectivo.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        BtnCrearDirectivo.setForeground(new java.awt.Color(255, 255, 255));
        BtnCrearDirectivo.setText("Crear directivo");
        BtnCrearDirectivo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TextoAltaDirectivoCargo.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaDirectivoCargo.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaDirectivoCargo.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaDirectivoCargo.setText("Cargo");

        jSeparator11.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator11.setForeground(new java.awt.Color(255, 255, 255));

        InputAltaDirectivoNombre.setBackground(new java.awt.Color(218, 240, 234));
        InputAltaDirectivoNombre.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputAltaDirectivoNombre.setForeground(new java.awt.Color(107, 107, 107));
        InputAltaDirectivoNombre.setText("Inserte el nombre...");
        InputAltaDirectivoNombre.setBorder(null);

        javax.swing.GroupLayout PanelAltaDirectivoLayout = new javax.swing.GroupLayout(PanelAltaDirectivo);
        PanelAltaDirectivo.setLayout(PanelAltaDirectivoLayout);
        PanelAltaDirectivoLayout.setHorizontalGroup(
            PanelAltaDirectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAltaDirectivoLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(PanelAltaDirectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAltaDirectivoLayout.createSequentialGroup()
                        .addGroup(PanelAltaDirectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelAltaDirectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(InputAltaDirectivoNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                            .addComponent(TextoAltaDirectivoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(131, 131, 131)
                        .addGroup(PanelAltaDirectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InputAltaDirectivoCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoAltaDirectivoCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(414, Short.MAX_VALUE))
                    .addGroup(PanelAltaDirectivoLayout.createSequentialGroup()
                        .addGroup(PanelAltaDirectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(InputAltaDirectivoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InputAltaDirectivoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoAltaDirectivoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PanelAltaDirectivoLayout.createSequentialGroup()
                        .addGroup(PanelAltaDirectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelAltaDirectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator13)
                                .addComponent(InputAltaDirectivoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator10)
                                .addComponent(TextoAltaDirectivoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoAltaDirectivoTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 433, Short.MAX_VALUE)
                        .addComponent(BtnCrearDirectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))))
        );
        PanelAltaDirectivoLayout.setVerticalGroup(
            PanelAltaDirectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAltaDirectivoLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(PanelAltaDirectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAltaDirectivoLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(TextoAltaDirectivoNombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputAltaDirectivoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TextoAltaDirectivoApellido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputAltaDirectivoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TextoAltaDirectivoTelefono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputAltaDirectivoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextoAltaDirectivoDNI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputAltaDirectivoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(111, Short.MAX_VALUE))
                    .addGroup(PanelAltaDirectivoLayout.createSequentialGroup()
                        .addComponent(TextoAltaDirectivoCargo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputAltaDirectivoCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnCrearDirectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))))
        );

        TabbedDarDeAlta.addTab("Directivo", PanelAltaDirectivo);

        DarDeAltaWindow.add(TabbedDarDeAlta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1030, 480));

        jPanel6.setBackground(new java.awt.Color(246, 144, 84));

        GestionLabel1.setFont(new java.awt.Font("Poppins SemiBold", 0, 48)); // NOI18N
        GestionLabel1.setForeground(new java.awt.Color(255, 255, 255));
        GestionLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GestionLabel1.setText("Dar de alta");

        BtnDarDeAltaAtras.setBackground(new java.awt.Color(246, 144, 84));
        BtnDarDeAltaAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Media/arrow.png"))); // NOI18N
        BtnDarDeAltaAtras.setBorder(null);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(BtnDarDeAltaAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addComponent(GestionLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(258, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(GestionLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnDarDeAltaAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        DarDeAltaWindow.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 170));

        PanelRaiz.add(DarDeAltaWindow, "card4");

        ModificarConceptoWindow.setBackground(new java.awt.Color(218, 240, 234));
        ModificarConceptoWindow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(246, 144, 84));

        TituloModificarConcepto.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        TituloModificarConcepto.setForeground(new java.awt.Color(255, 255, 255));
        TituloModificarConcepto.setText("Modificar conceptos");

        BtnHomeModificarConceptos.setBackground(new java.awt.Color(246, 144, 84));
        BtnHomeModificarConceptos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Media/home.png"))); // NOI18N
        BtnHomeModificarConceptos.setBorder(null);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(BtnHomeModificarConceptos)
                .addGap(201, 201, 201)
                .addComponent(TituloModificarConcepto)
                .addContainerGap(284, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnHomeModificarConceptos)
                    .addComponent(TituloModificarConcepto))
                .addGap(28, 28, 28))
        );

        ModificarConceptoWindow.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 130));

        TablaConceptosNomina.setBackground(new java.awt.Color(246, 144, 84));
        TablaConceptosNomina.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        TablaConceptosNomina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        PanelConceptosNomina.setViewportView(TablaConceptosNomina);

        ModificarConceptoWindow.add(PanelConceptosNomina, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, -1, -1));

        TituloModificarConceptos.setFont(new java.awt.Font("Poppins SemiBold", 1, 36)); // NOI18N
        TituloModificarConceptos.setForeground(new java.awt.Color(255, 255, 255));
        ModificarConceptoWindow.add(TituloModificarConceptos, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 6, 452, 146));

        BtnModificarConcepto.setBackground(new java.awt.Color(29, 78, 138));
        BtnModificarConcepto.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        BtnModificarConcepto.setForeground(new java.awt.Color(255, 255, 255));
        BtnModificarConcepto.setText("Modificar concepto");
        ModificarConceptoWindow.add(BtnModificarConcepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 210, 58));

        BtnEliminarConcepto.setBackground(new java.awt.Color(29, 78, 138));
        BtnEliminarConcepto.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        BtnEliminarConcepto.setForeground(new java.awt.Color(246, 144, 84));
        BtnEliminarConcepto.setText("Eliminar concepto");
        ModificarConceptoWindow.add(BtnEliminarConcepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 210, 58));

        PanelRaiz.add(ModificarConceptoWindow, "card10");

        FacturaWindow.setBackground(new java.awt.Color(218, 240, 234));
        FacturaWindow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(246, 144, 84));

        BtnHomeCrearFactura.setBackground(new java.awt.Color(246, 144, 84));
        BtnHomeCrearFactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Media/home.png"))); // NOI18N
        BtnHomeCrearFactura.setBorder(null);

        TituloCrearFactura.setFont(new java.awt.Font("Segoe UI", 1, 56)); // NOI18N
        TituloCrearFactura.setForeground(new java.awt.Color(255, 255, 255));
        TituloCrearFactura.setText("Crear factura");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(BtnHomeCrearFactura)
                .addGap(236, 236, 236)
                .addComponent(TituloCrearFactura)
                .addContainerGap(367, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(BtnHomeCrearFactura)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(TituloCrearFactura)
                        .addGap(26, 26, 26))))
        );

        FacturaWindow.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 130));

        TextoCrearFacturaNombre.setBackground(new java.awt.Color(255, 255, 255));
        TextoCrearFacturaNombre.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoCrearFacturaNombre.setForeground(new java.awt.Color(246, 144, 84));
        TextoCrearFacturaNombre.setText("Nombre del cliente");
        FacturaWindow.add(TextoCrearFacturaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 190, -1));

        InputCrearFacturaNombre.setBackground(new java.awt.Color(218, 240, 234));
        InputCrearFacturaNombre.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputCrearFacturaNombre.setForeground(new java.awt.Color(107, 107, 107));
        InputCrearFacturaNombre.setText("Inserte nombre...");
        InputCrearFacturaNombre.setBorder(null);
        FacturaWindow.add(InputCrearFacturaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 202, -1));

        jSeparator48.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator48.setForeground(new java.awt.Color(255, 255, 255));
        FacturaWindow.add(jSeparator48, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 202, 10));

        InputCrearFacturaCIF.setBackground(new java.awt.Color(218, 240, 234));
        InputCrearFacturaCIF.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputCrearFacturaCIF.setForeground(new java.awt.Color(107, 107, 107));
        InputCrearFacturaCIF.setText("Inserte el CIF...");
        InputCrearFacturaCIF.setBorder(null);
        FacturaWindow.add(InputCrearFacturaCIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 350, 202, -1));

        TextoCrearFacturaCIF.setBackground(new java.awt.Color(255, 255, 255));
        TextoCrearFacturaCIF.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoCrearFacturaCIF.setForeground(new java.awt.Color(246, 144, 84));
        TextoCrearFacturaCIF.setText("CIF del cliente");
        FacturaWindow.add(TextoCrearFacturaCIF, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 170, -1));

        jSeparator49.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator49.setForeground(new java.awt.Color(255, 255, 255));
        FacturaWindow.add(jSeparator49, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 202, 10));

        TextoCrearFacturaCantidad.setBackground(new java.awt.Color(255, 255, 255));
        TextoCrearFacturaCantidad.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoCrearFacturaCantidad.setForeground(new java.awt.Color(246, 144, 84));
        TextoCrearFacturaCantidad.setText("Cantidad en euros");
        FacturaWindow.add(TextoCrearFacturaCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 180, -1));

        InputCrearFacturaCantidad.setBackground(new java.awt.Color(218, 240, 234));
        InputCrearFacturaCantidad.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputCrearFacturaCantidad.setForeground(new java.awt.Color(107, 107, 107));
        InputCrearFacturaCantidad.setText("Inserte la cantidad...");
        InputCrearFacturaCantidad.setBorder(null);
        FacturaWindow.add(InputCrearFacturaCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 202, -1));

        jSeparator50.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator50.setForeground(new java.awt.Color(255, 255, 255));
        FacturaWindow.add(jSeparator50, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 202, 10));

        TextoCrearFacturaID.setBackground(new java.awt.Color(255, 255, 255));
        TextoCrearFacturaID.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoCrearFacturaID.setForeground(new java.awt.Color(246, 144, 84));
        TextoCrearFacturaID.setText("Código único");
        FacturaWindow.add(TextoCrearFacturaID, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, 170, -1));

        InputCrearFacturaID.setBackground(new java.awt.Color(218, 240, 234));
        InputCrearFacturaID.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputCrearFacturaID.setForeground(new java.awt.Color(107, 107, 107));
        InputCrearFacturaID.setText("Inserte el código...");
        InputCrearFacturaID.setBorder(null);
        FacturaWindow.add(InputCrearFacturaID, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 260, 202, -1));

        jSeparator51.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator51.setForeground(new java.awt.Color(255, 255, 255));
        FacturaWindow.add(jSeparator51, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, 202, 10));

        CrearFacturaFinal.setBackground(new java.awt.Color(29, 78, 138));
        CrearFacturaFinal.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        CrearFacturaFinal.setForeground(new java.awt.Color(255, 255, 255));
        CrearFacturaFinal.setText("Crear factura");
        FacturaWindow.add(CrearFacturaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 450, 138, 70));

        TextoCrearFacturaFechaPago.setBackground(new java.awt.Color(255, 255, 255));
        TextoCrearFacturaFechaPago.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoCrearFacturaFechaPago.setForeground(new java.awt.Color(246, 144, 84));
        TextoCrearFacturaFechaPago.setText("Fecha de pago");
        FacturaWindow.add(TextoCrearFacturaFechaPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 180, -1));

        InputCrearFacturaFecha.setBackground(new java.awt.Color(218, 240, 234));
        InputCrearFacturaFecha.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputCrearFacturaFecha.setForeground(new java.awt.Color(107, 107, 107));
        InputCrearFacturaFecha.setText("Inserte la fecha...");
        InputCrearFacturaFecha.setBorder(null);
        FacturaWindow.add(InputCrearFacturaFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 202, -1));

        jSeparator52.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator52.setForeground(new java.awt.Color(255, 255, 255));
        FacturaWindow.add(jSeparator52, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 202, 10));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Formato: DD/MM/YYYY");
        FacturaWindow.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 170, -1));

        PanelRaiz.add(FacturaWindow, "card9");

        CrearNominaWindow.setBackground(new java.awt.Color(218, 240, 234));
        CrearNominaWindow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(246, 144, 84));

        TituloCrearFactura1.setFont(new java.awt.Font("Segoe UI", 1, 56)); // NOI18N
        TituloCrearFactura1.setForeground(new java.awt.Color(255, 255, 255));
        TituloCrearFactura1.setText("Crear nómina");

        BtnHomeCrearNomina.setBackground(new java.awt.Color(246, 144, 84));
        BtnHomeCrearNomina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Media/home.png"))); // NOI18N
        BtnHomeCrearNomina.setBorder(null);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(BtnHomeCrearNomina)
                .addGap(282, 282, 282)
                .addComponent(TituloCrearFactura1)
                .addContainerGap(309, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(TituloCrearFactura1)
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnHomeCrearNomina)
                .addGap(43, 43, 43))
        );

        CrearNominaWindow.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 130));

        TextoCrearNominaImporte.setBackground(new java.awt.Color(255, 255, 255));
        TextoCrearNominaImporte.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoCrearNominaImporte.setForeground(new java.awt.Color(246, 144, 84));
        TextoCrearNominaImporte.setText("Importe");
        CrearNominaWindow.add(TextoCrearNominaImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 234, 140, -1));

        InputCrearNominaImporte.setBackground(new java.awt.Color(218, 240, 234));
        InputCrearNominaImporte.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputCrearNominaImporte.setForeground(new java.awt.Color(107, 107, 107));
        InputCrearNominaImporte.setText("Inserte el importe...");
        InputCrearNominaImporte.setBorder(null);
        CrearNominaWindow.add(InputCrearNominaImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 262, 202, -1));

        jSeparator42.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator42.setForeground(new java.awt.Color(255, 255, 255));
        CrearNominaWindow.add(jSeparator42, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 287, 202, 10));

        TextoCrearNominaImporte1.setBackground(new java.awt.Color(255, 255, 255));
        TextoCrearNominaImporte1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoCrearNominaImporte1.setForeground(new java.awt.Color(246, 144, 84));
        TextoCrearNominaImporte1.setText("Descripción");
        CrearNominaWindow.add(TextoCrearNominaImporte1, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 312, 140, -1));

        InputCrearNominaDescripcion.setBackground(new java.awt.Color(218, 240, 234));
        InputCrearNominaDescripcion.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputCrearNominaDescripcion.setForeground(new java.awt.Color(107, 107, 107));
        InputCrearNominaDescripcion.setText("Inserte la descripcion...");
        InputCrearNominaDescripcion.setBorder(null);
        CrearNominaWindow.add(InputCrearNominaDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 340, 202, -1));

        jSeparator43.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator43.setForeground(new java.awt.Color(255, 255, 255));
        CrearNominaWindow.add(jSeparator43, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 365, 202, 10));

        jSeparator44.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator44.setForeground(new java.awt.Color(255, 255, 255));
        CrearNominaWindow.add(jSeparator44, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 447, 202, 10));

        TextoCrearNominaFecha.setBackground(new java.awt.Color(255, 255, 255));
        TextoCrearNominaFecha.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoCrearNominaFecha.setForeground(new java.awt.Color(246, 144, 84));
        TextoCrearNominaFecha.setText("Año");
        CrearNominaWindow.add(TextoCrearNominaFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 393, 100, -1));

        TituloCrearNomina.setFont(new java.awt.Font("Segoe UI", 1, 56)); // NOI18N
        TituloCrearNomina.setForeground(new java.awt.Color(255, 255, 255));
        TituloCrearNomina.setText("Crear nómina");
        CrearNominaWindow.add(TituloCrearNomina, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, -1, -1));

        BtnCrearNominaFinal.setBackground(new java.awt.Color(29, 78, 138));
        BtnCrearNominaFinal.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        BtnCrearNominaFinal.setForeground(new java.awt.Color(255, 255, 255));
        BtnCrearNominaFinal.setText("Crear nómina");
        CrearNominaWindow.add(BtnCrearNominaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 389, 194, 68));

        InputCrearNominaAno.setBackground(new java.awt.Color(218, 240, 234));
        InputCrearNominaAno.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputCrearNominaAno.setForeground(new java.awt.Color(107, 107, 107));
        InputCrearNominaAno.setText("Inserte el año...");
        InputCrearNominaAno.setBorder(null);
        CrearNominaWindow.add(InputCrearNominaAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 421, 202, -1));

        ComBoxMesNomina.setBackground(new java.awt.Color(255, 255, 255));
        ComBoxMesNomina.setForeground(new java.awt.Color(107, 107, 107));
        CrearNominaWindow.add(ComBoxMesNomina, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 331, 202, -1));

        TextoCrearNominaMes.setBackground(new java.awt.Color(255, 255, 255));
        TextoCrearNominaMes.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoCrearNominaMes.setForeground(new java.awt.Color(246, 144, 84));
        TextoCrearNominaMes.setText("Mes");
        CrearNominaWindow.add(TextoCrearNominaMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 303, 100, -1));

        jSeparator46.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator46.setForeground(new java.awt.Color(255, 255, 255));
        CrearNominaWindow.add(jSeparator46, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 365, 202, 10));

        TextoCrearNominaImporte2.setBackground(new java.awt.Color(255, 255, 255));
        TextoCrearNominaImporte2.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoCrearNominaImporte2.setForeground(new java.awt.Color(246, 144, 84));
        TextoCrearNominaImporte2.setText("Codigo único");
        CrearNominaWindow.add(TextoCrearNominaImporte2, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 234, 150, -1));

        InputCrearNominaID.setBackground(new java.awt.Color(218, 240, 234));
        InputCrearNominaID.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputCrearNominaID.setForeground(new java.awt.Color(107, 107, 107));
        InputCrearNominaID.setText("Inserte el codigo único...");
        InputCrearNominaID.setBorder(null);
        CrearNominaWindow.add(InputCrearNominaID, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 262, 202, -1));

        jSeparator47.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator47.setForeground(new java.awt.Color(255, 255, 255));
        CrearNominaWindow.add(jSeparator47, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 287, 202, 10));

        PanelRaiz.add(CrearNominaWindow, "card8");

        ModificarNominaWindow.setBackground(new java.awt.Color(218, 240, 234));
        ModificarNominaWindow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(246, 144, 84));

        TituloCrearNomina1.setFont(new java.awt.Font("Segoe UI", 1, 56)); // NOI18N
        TituloCrearNomina1.setForeground(new java.awt.Color(255, 255, 255));
        TituloCrearNomina1.setText("Modificar nómina");

        BtnHomeModificarNomina.setBackground(new java.awt.Color(246, 144, 84));
        BtnHomeModificarNomina.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Media/home.png"))); // NOI18N
        BtnHomeModificarNomina.setBorder(null);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(BtnHomeModificarNomina)
                .addGap(203, 203, 203)
                .addComponent(TituloCrearNomina1)
                .addContainerGap(273, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(BtnHomeModificarNomina)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(TituloCrearNomina1)
                        .addGap(26, 26, 26))))
        );

        ModificarNominaWindow.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 130));

        TextoCrearNominaImporte3.setBackground(new java.awt.Color(255, 255, 255));
        TextoCrearNominaImporte3.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoCrearNominaImporte3.setForeground(new java.awt.Color(246, 144, 84));
        TextoCrearNominaImporte3.setText("Importe");
        ModificarNominaWindow.add(TextoCrearNominaImporte3, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 234, 130, -1));

        InputModificarNominaImporte.setBackground(new java.awt.Color(218, 240, 234));
        InputModificarNominaImporte.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputModificarNominaImporte.setForeground(new java.awt.Color(107, 107, 107));
        InputModificarNominaImporte.setText("Inserte el importe...");
        InputModificarNominaImporte.setBorder(null);
        ModificarNominaWindow.add(InputModificarNominaImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 262, 202, -1));

        jSeparator53.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator53.setForeground(new java.awt.Color(255, 255, 255));
        ModificarNominaWindow.add(jSeparator53, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 287, 202, 10));

        TextoCrearNominaImporte4.setBackground(new java.awt.Color(255, 255, 255));
        TextoCrearNominaImporte4.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoCrearNominaImporte4.setForeground(new java.awt.Color(246, 144, 84));
        TextoCrearNominaImporte4.setText("Descripción");
        ModificarNominaWindow.add(TextoCrearNominaImporte4, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 312, 150, -1));

        InputModificarNominaDescripcion.setBackground(new java.awt.Color(218, 240, 234));
        InputModificarNominaDescripcion.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputModificarNominaDescripcion.setForeground(new java.awt.Color(107, 107, 107));
        InputModificarNominaDescripcion.setText("Inserte la descripcion...");
        InputModificarNominaDescripcion.setBorder(null);
        ModificarNominaWindow.add(InputModificarNominaDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 340, 202, -1));

        jSeparator54.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator54.setForeground(new java.awt.Color(255, 255, 255));
        ModificarNominaWindow.add(jSeparator54, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 365, 202, 10));

        jSeparator55.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator55.setForeground(new java.awt.Color(255, 255, 255));
        ModificarNominaWindow.add(jSeparator55, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 447, 202, 10));

        TextoCrearNominaFecha1.setBackground(new java.awt.Color(255, 255, 255));
        TextoCrearNominaFecha1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoCrearNominaFecha1.setForeground(new java.awt.Color(246, 144, 84));
        TextoCrearNominaFecha1.setText("Año");
        ModificarNominaWindow.add(TextoCrearNominaFecha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 393, 100, -1));

        BtnModificarNominaFinal.setBackground(new java.awt.Color(29, 78, 138));
        BtnModificarNominaFinal.setFont(new java.awt.Font("Poppins SemiBold", 0, 14)); // NOI18N
        BtnModificarNominaFinal.setForeground(new java.awt.Color(255, 255, 255));
        BtnModificarNominaFinal.setText("Modificar nómina");
        ModificarNominaWindow.add(BtnModificarNominaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 389, 194, 68));

        InputModificarNominaAno.setBackground(new java.awt.Color(218, 240, 234));
        InputModificarNominaAno.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputModificarNominaAno.setForeground(new java.awt.Color(107, 107, 107));
        InputModificarNominaAno.setText("Inserte el año...");
        InputModificarNominaAno.setBorder(null);
        InputModificarNominaAno.setEnabled(false);
        ModificarNominaWindow.add(InputModificarNominaAno, new org.netbeans.lib.awtextra.AbsoluteConstraints(116, 421, 202, -1));

        ComBoxMesNominaModificar.setBackground(new java.awt.Color(255, 255, 255));
        ComBoxMesNominaModificar.setForeground(new java.awt.Color(107, 107, 107));
        ComBoxMesNominaModificar.setEnabled(false);
        ModificarNominaWindow.add(ComBoxMesNominaModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 331, 202, -1));

        TextoCrearNominaMes1.setBackground(new java.awt.Color(255, 255, 255));
        TextoCrearNominaMes1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoCrearNominaMes1.setForeground(new java.awt.Color(246, 144, 84));
        TextoCrearNominaMes1.setText("Mes");
        ModificarNominaWindow.add(TextoCrearNominaMes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 303, 110, -1));

        jSeparator57.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator57.setForeground(new java.awt.Color(255, 255, 255));
        ModificarNominaWindow.add(jSeparator57, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 365, 202, 10));

        TextoCrearNominaImporte5.setBackground(new java.awt.Color(255, 255, 255));
        TextoCrearNominaImporte5.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoCrearNominaImporte5.setForeground(new java.awt.Color(246, 144, 84));
        TextoCrearNominaImporte5.setText("Codigo único");
        ModificarNominaWindow.add(TextoCrearNominaImporte5, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 234, 160, -1));

        InputModificarNominaID.setBackground(new java.awt.Color(218, 240, 234));
        InputModificarNominaID.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputModificarNominaID.setForeground(new java.awt.Color(107, 107, 107));
        InputModificarNominaID.setText("Inserte el codigo único...");
        InputModificarNominaID.setBorder(null);
        ModificarNominaWindow.add(InputModificarNominaID, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 262, 202, -1));

        jSeparator58.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator58.setForeground(new java.awt.Color(255, 255, 255));
        ModificarNominaWindow.add(jSeparator58, new org.netbeans.lib.awtextra.AbsoluteConstraints(418, 287, 202, 10));

        PanelRaiz.add(ModificarNominaWindow, "card8");

        ModificarPersonaWindow.setBackground(new java.awt.Color(59, 185, 122));
        ModificarPersonaWindow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnDarDeAltaAtrasModificar.setBackground(new java.awt.Color(246, 144, 84));
        BtnDarDeAltaAtrasModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/Media/arrow.png"))); // NOI18N
        BtnDarDeAltaAtrasModificar.setBorder(null);
        ModificarPersonaWindow.add(BtnDarDeAltaAtrasModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 60, 60));

        TabbedModificar.setBackground(new java.awt.Color(149, 212, 195));
        TabbedModificar.setForeground(new java.awt.Color(255, 255, 255));
        TabbedModificar.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N

        PanelModificarJugador.setBackground(new java.awt.Color(218, 240, 234));
        PanelModificarJugador.setForeground(new java.awt.Color(169, 253, 172));
        PanelModificarJugador.setToolTipText("");

        TextoAltaJugadorNombre1.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaJugadorNombre1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaJugadorNombre1.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaJugadorNombre1.setText("Nombre");

        InputModificarJugadorNombre.setBackground(new java.awt.Color(218, 240, 234));
        InputModificarJugadorNombre.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputModificarJugadorNombre.setForeground(new java.awt.Color(107, 107, 107));
        InputModificarJugadorNombre.setText("Inserte el nombre...");
        InputModificarJugadorNombre.setBorder(null);

        jSeparator22.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator22.setForeground(new java.awt.Color(255, 255, 255));

        TextoAltaJugadorApellido1.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaJugadorApellido1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaJugadorApellido1.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaJugadorApellido1.setText("Apellidos");

        InputModificarJugadorApellido.setBackground(new java.awt.Color(218, 240, 234));
        InputModificarJugadorApellido.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputModificarJugadorApellido.setForeground(new java.awt.Color(107, 107, 107));
        InputModificarJugadorApellido.setText("Inserte el apellido...");
        InputModificarJugadorApellido.setBorder(null);

        jSeparator23.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator23.setForeground(new java.awt.Color(255, 255, 255));

        TextoAltaJugadorTelefono1.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaJugadorTelefono1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaJugadorTelefono1.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaJugadorTelefono1.setText("Teléfono");

        InputModificarJugadorTelefono.setBackground(new java.awt.Color(218, 240, 234));
        InputModificarJugadorTelefono.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputModificarJugadorTelefono.setForeground(new java.awt.Color(107, 107, 107));
        InputModificarJugadorTelefono.setText("Inserte el teléfono...");
        InputModificarJugadorTelefono.setBorder(null);

        jSeparator24.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator24.setForeground(new java.awt.Color(255, 255, 255));

        TextoAltaJugadorEdad1.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaJugadorEdad1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaJugadorEdad1.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaJugadorEdad1.setText("Edad");

        InputModificarJugadorEdad.setBackground(new java.awt.Color(218, 240, 234));
        InputModificarJugadorEdad.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputModificarJugadorEdad.setForeground(new java.awt.Color(107, 107, 107));
        InputModificarJugadorEdad.setText("Inserte la edad...");
        InputModificarJugadorEdad.setBorder(null);

        jSeparator25.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator25.setForeground(new java.awt.Color(255, 255, 255));

        TextoAltaJugadorValor2.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaJugadorValor2.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaJugadorValor2.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaJugadorValor2.setText("Valor de mercado");

        InputModificarJugadorValor.setBackground(new java.awt.Color(218, 240, 234));
        InputModificarJugadorValor.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputModificarJugadorValor.setForeground(new java.awt.Color(107, 107, 107));
        InputModificarJugadorValor.setText("Inserte el valor de mercado...");
        InputModificarJugadorValor.setBorder(null);

        jSeparator26.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator26.setForeground(new java.awt.Color(255, 255, 255));

        TextoAltaJugadorDNI2.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaJugadorDNI2.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaJugadorDNI2.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaJugadorDNI2.setText("DNI");

        InputModificarJugadorDNI.setBackground(new java.awt.Color(218, 240, 234));
        InputModificarJugadorDNI.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputModificarJugadorDNI.setForeground(new java.awt.Color(107, 107, 107));
        InputModificarJugadorDNI.setText("Inserte el DNI...");
        InputModificarJugadorDNI.setBorder(null);
        InputModificarJugadorDNI.setEnabled(false);

        jSeparator27.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator27.setForeground(new java.awt.Color(255, 255, 255));

        BtnModificarJugador.setBackground(new java.awt.Color(29, 78, 138));
        BtnModificarJugador.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        BtnModificarJugador.setForeground(new java.awt.Color(255, 255, 255));
        BtnModificarJugador.setText("Modificar jugador");
        BtnModificarJugador.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TextoAltaJugadorDemarcacion1.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaJugadorDemarcacion1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaJugadorDemarcacion1.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaJugadorDemarcacion1.setText("Demarcacion");

        jSeparator28.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator28.setForeground(new java.awt.Color(255, 255, 255));

        ComBoxModificarDemarcacion.setBackground(new java.awt.Color(255, 255, 255));
        ComBoxModificarDemarcacion.setForeground(new java.awt.Color(107, 107, 107));

        TextoAltaJugadorEstadoFisico1.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaJugadorEstadoFisico1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaJugadorEstadoFisico1.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaJugadorEstadoFisico1.setText("Estado fisico");

        jSeparator29.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator29.setForeground(new java.awt.Color(255, 255, 255));

        ToggleModificarEstadoFisico.setBackground(new java.awt.Color(59, 185, 122));
        ToggleModificarEstadoFisico.setFont(new java.awt.Font("Poppins SemiBold", 1, 12)); // NOI18N
        ToggleModificarEstadoFisico.setForeground(new java.awt.Color(255, 255, 255));
        ToggleModificarEstadoFisico.setText("Saludable");
        ToggleModificarEstadoFisico.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout PanelModificarJugadorLayout = new javax.swing.GroupLayout(PanelModificarJugador);
        PanelModificarJugador.setLayout(PanelModificarJugadorLayout);
        PanelModificarJugadorLayout.setHorizontalGroup(
            PanelModificarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelModificarJugadorLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(PanelModificarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelModificarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(PanelModificarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator23)
                            .addComponent(InputModificarJugadorApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoAltaJugadorApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelModificarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator22)
                            .addComponent(InputModificarJugadorNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(TextoAltaJugadorNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelModificarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator24)
                        .addComponent(InputModificarJugadorTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextoAltaJugadorTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelModificarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator25)
                        .addComponent(InputModificarJugadorEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TextoAltaJugadorEdad1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(PanelModificarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelModificarJugadorLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 436, Short.MAX_VALUE)
                        .addComponent(BtnModificarJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(PanelModificarJugadorLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(PanelModificarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator26)
                            .addComponent(InputModificarJugadorValor)
                            .addComponent(jSeparator27)
                            .addComponent(InputModificarJugadorDNI)
                            .addComponent(ComBoxModificarDemarcacion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator28, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoAltaJugadorValor2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoAltaJugadorDNI2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoAltaJugadorDemarcacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelModificarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator29, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ToggleModificarEstadoFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoAltaJugadorEstadoFisico1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93))))
        );
        PanelModificarJugadorLayout.setVerticalGroup(
            PanelModificarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelModificarJugadorLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(PanelModificarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelModificarJugadorLayout.createSequentialGroup()
                        .addComponent(TextoAltaJugadorNombre1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputModificarJugadorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelModificarJugadorLayout.createSequentialGroup()
                        .addComponent(TextoAltaJugadorValor2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputModificarJugadorValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator26, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextoAltaJugadorEstadoFisico1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelModificarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelModificarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(PanelModificarJugadorLayout.createSequentialGroup()
                            .addComponent(TextoAltaJugadorApellido1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(InputModificarJugadorApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator23, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelModificarJugadorLayout.createSequentialGroup()
                            .addComponent(TextoAltaJugadorDNI2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(InputModificarJugadorDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator27, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelModificarJugadorLayout.createSequentialGroup()
                        .addComponent(ToggleModificarEstadoFisico, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator29, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(PanelModificarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelModificarJugadorLayout.createSequentialGroup()
                        .addComponent(TextoAltaJugadorTelefono1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputModificarJugadorTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator24, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelModificarJugadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelModificarJugadorLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextoAltaJugadorEdad1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(InputModificarJugadorEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator25, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelModificarJugadorLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnModificarJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60))))
                    .addGroup(PanelModificarJugadorLayout.createSequentialGroup()
                        .addComponent(TextoAltaJugadorDemarcacion1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComBoxModificarDemarcacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator28, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        TabbedModificar.addTab("Jugador", PanelModificarJugador);

        PanelModificarTecnico.setBackground(new java.awt.Color(218, 240, 234));

        TextoAltaTecnicoNombre1.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaTecnicoNombre1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaTecnicoNombre1.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaTecnicoNombre1.setText("Nombre");

        InputModificarTecnicoNombre.setBackground(new java.awt.Color(218, 240, 234));
        InputModificarTecnicoNombre.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputModificarTecnicoNombre.setForeground(new java.awt.Color(107, 107, 107));
        InputModificarTecnicoNombre.setText("Inserte el nombre...");
        InputModificarTecnicoNombre.setBorder(null);

        jSeparator30.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator30.setForeground(new java.awt.Color(255, 255, 255));

        TextoAltaTecnicoApellido1.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaTecnicoApellido1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaTecnicoApellido1.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaTecnicoApellido1.setText("Apellidos");

        InputModificarTecnicoApellido.setBackground(new java.awt.Color(218, 240, 234));
        InputModificarTecnicoApellido.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputModificarTecnicoApellido.setForeground(new java.awt.Color(107, 107, 107));
        InputModificarTecnicoApellido.setText("Inserte el apellido...");
        InputModificarTecnicoApellido.setBorder(null);

        jSeparator31.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator31.setForeground(new java.awt.Color(255, 255, 255));

        TextoAltaTecnicoTelefono1.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaTecnicoTelefono1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaTecnicoTelefono1.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaTecnicoTelefono1.setText("Teléfono");

        InputModificarTecnicoTelefono.setBackground(new java.awt.Color(218, 240, 234));
        InputModificarTecnicoTelefono.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputModificarTecnicoTelefono.setForeground(new java.awt.Color(107, 107, 107));
        InputModificarTecnicoTelefono.setText("Inserte el teléfono...");
        InputModificarTecnicoTelefono.setBorder(null);

        jSeparator32.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator32.setForeground(new java.awt.Color(255, 255, 255));

        TextoAltaTecnicoDNI1.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaTecnicoDNI1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaTecnicoDNI1.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaTecnicoDNI1.setText("DNI");

        InputModificarTecnicoDNI.setBackground(new java.awt.Color(218, 240, 234));
        InputModificarTecnicoDNI.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputModificarTecnicoDNI.setForeground(new java.awt.Color(107, 107, 107));
        InputModificarTecnicoDNI.setText("Inserte el DNI...");
        InputModificarTecnicoDNI.setBorder(null);
        InputModificarTecnicoDNI.setEnabled(false);

        jSeparator33.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator33.setForeground(new java.awt.Color(255, 255, 255));

        TextoAltaJugadorValor3.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaJugadorValor3.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaJugadorValor3.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaJugadorValor3.setText("Puesto");

        jSeparator34.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator34.setForeground(new java.awt.Color(255, 255, 255));

        TextoAltaJugadorDNI3.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaJugadorDNI3.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaJugadorDNI3.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaJugadorDNI3.setText("Especialidad");

        jSeparator35.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator35.setForeground(new java.awt.Color(255, 255, 255));

        BtnModificarTécnico.setBackground(new java.awt.Color(29, 78, 138));
        BtnModificarTécnico.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        BtnModificarTécnico.setForeground(new java.awt.Color(255, 255, 255));
        BtnModificarTécnico.setText("Modificar técnico");
        BtnModificarTécnico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        ComboBoxModificarTecnicoEspecialidad.setBackground(new java.awt.Color(255, 255, 255));
        ComboBoxModificarTecnicoEspecialidad.setForeground(new java.awt.Color(107, 107, 107));

        ComboBoxModificarTecnicoPuesto.setBackground(new java.awt.Color(255, 255, 255));
        ComboBoxModificarTecnicoPuesto.setForeground(new java.awt.Color(107, 107, 107));

        javax.swing.GroupLayout PanelModificarTecnicoLayout = new javax.swing.GroupLayout(PanelModificarTecnico);
        PanelModificarTecnico.setLayout(PanelModificarTecnicoLayout);
        PanelModificarTecnicoLayout.setHorizontalGroup(
            PanelModificarTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelModificarTecnicoLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(PanelModificarTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelModificarTecnicoLayout.createSequentialGroup()
                        .addGroup(PanelModificarTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelModificarTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSeparator32)
                                .addComponent(InputModificarTecnicoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TextoAltaTecnicoTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelModificarTecnicoLayout.createSequentialGroup()
                                .addGroup(PanelModificarTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PanelModificarTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator31)
                                        .addComponent(InputModificarTecnicoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(TextoAltaTecnicoApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelModificarTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator30)
                                        .addComponent(InputModificarTecnicoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                        .addComponent(TextoAltaTecnicoNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(107, 107, 107)
                                .addGroup(PanelModificarTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator34, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                    .addComponent(jSeparator35)
                                    .addComponent(ComboBoxModificarTecnicoEspecialidad, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ComboBoxModificarTecnicoPuesto, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TextoAltaJugadorValor3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextoAltaJugadorDNI3, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelModificarTecnicoLayout.createSequentialGroup()
                        .addGroup(PanelModificarTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator33)
                            .addComponent(InputModificarTecnicoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoAltaTecnicoDNI1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 431, Short.MAX_VALUE)
                        .addComponent(BtnModificarTécnico, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
        );
        PanelModificarTecnicoLayout.setVerticalGroup(
            PanelModificarTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelModificarTecnicoLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(PanelModificarTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelModificarTecnicoLayout.createSequentialGroup()
                        .addComponent(TextoAltaTecnicoNombre1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputModificarTecnicoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator30, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(PanelModificarTecnicoLayout.createSequentialGroup()
                        .addComponent(TextoAltaJugadorValor3)
                        .addGap(9, 9, 9)
                        .addComponent(ComboBoxModificarTecnicoPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator34, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelModificarTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelModificarTecnicoLayout.createSequentialGroup()
                        .addComponent(TextoAltaTecnicoApellido1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputModificarTecnicoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator31, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TextoAltaTecnicoTelefono1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputModificarTecnicoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator32, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelModificarTecnicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelModificarTecnicoLayout.createSequentialGroup()
                                .addComponent(TextoAltaTecnicoDNI1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(InputModificarTecnicoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator33, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BtnModificarTécnico, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelModificarTecnicoLayout.createSequentialGroup()
                        .addComponent(TextoAltaJugadorDNI3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ComboBoxModificarTecnicoEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(jSeparator35, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        TabbedModificar.addTab("Técnico", PanelModificarTecnico);

        PanelModificarDirectivo.setBackground(new java.awt.Color(218, 240, 234));

        TextoAltaDirectivoNombre1.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaDirectivoNombre1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaDirectivoNombre1.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaDirectivoNombre1.setText("Nombre");

        InputModificarDirectivoCargo.setBackground(new java.awt.Color(218, 240, 234));
        InputModificarDirectivoCargo.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputModificarDirectivoCargo.setForeground(new java.awt.Color(107, 107, 107));
        InputModificarDirectivoCargo.setText("Inserte el cargo...");
        InputModificarDirectivoCargo.setBorder(null);

        jSeparator36.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator36.setForeground(new java.awt.Color(255, 255, 255));

        TextoAltaDirectivoApellido1.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaDirectivoApellido1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaDirectivoApellido1.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaDirectivoApellido1.setText("Apellidos");
        TextoAltaDirectivoApellido1.setMaximumSize(new java.awt.Dimension(59, 22));
        TextoAltaDirectivoApellido1.setMinimumSize(new java.awt.Dimension(59, 22));
        TextoAltaDirectivoApellido1.setPreferredSize(new java.awt.Dimension(59, 22));

        InputModificarDirectivoApellido.setBackground(new java.awt.Color(218, 240, 234));
        InputModificarDirectivoApellido.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputModificarDirectivoApellido.setForeground(new java.awt.Color(107, 107, 107));
        InputModificarDirectivoApellido.setText("Inserte el apellido...");
        InputModificarDirectivoApellido.setBorder(null);

        jSeparator37.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator37.setForeground(new java.awt.Color(255, 255, 255));

        TextoAltaDirectivoTelefono1.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaDirectivoTelefono1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaDirectivoTelefono1.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaDirectivoTelefono1.setText("Teléfono");

        InputModificarDirectivoTelefono.setBackground(new java.awt.Color(218, 240, 234));
        InputModificarDirectivoTelefono.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputModificarDirectivoTelefono.setForeground(new java.awt.Color(107, 107, 107));
        InputModificarDirectivoTelefono.setText("Inserte el teléfono...");
        InputModificarDirectivoTelefono.setBorder(null);

        jSeparator38.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator38.setForeground(new java.awt.Color(255, 255, 255));

        TextoAltaDirectivoDNI1.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaDirectivoDNI1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaDirectivoDNI1.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaDirectivoDNI1.setText("DNI");

        InputModificarDirectivoDNI.setBackground(new java.awt.Color(218, 240, 234));
        InputModificarDirectivoDNI.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputModificarDirectivoDNI.setForeground(new java.awt.Color(107, 107, 107));
        InputModificarDirectivoDNI.setText("Inserte el DNI...");
        InputModificarDirectivoDNI.setBorder(null);
        InputModificarDirectivoDNI.setEnabled(false);

        jSeparator39.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator39.setForeground(new java.awt.Color(255, 255, 255));

        BtnModificarDirectivo.setBackground(new java.awt.Color(29, 78, 138));
        BtnModificarDirectivo.setFont(new java.awt.Font("Poppins SemiBold", 1, 24)); // NOI18N
        BtnModificarDirectivo.setForeground(new java.awt.Color(255, 255, 255));
        BtnModificarDirectivo.setText("Modificar directivo");
        BtnModificarDirectivo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        TextoAltaDirectivoCargo1.setBackground(new java.awt.Color(255, 255, 255));
        TextoAltaDirectivoCargo1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        TextoAltaDirectivoCargo1.setForeground(new java.awt.Color(246, 144, 84));
        TextoAltaDirectivoCargo1.setText("Cargo");

        jSeparator40.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator40.setForeground(new java.awt.Color(255, 255, 255));

        InputModificarDirectivoNombre.setBackground(new java.awt.Color(218, 240, 234));
        InputModificarDirectivoNombre.setFont(new java.awt.Font("Poppins SemiBold", 0, 12)); // NOI18N
        InputModificarDirectivoNombre.setForeground(new java.awt.Color(107, 107, 107));
        InputModificarDirectivoNombre.setText("Inserte el nombre...");
        InputModificarDirectivoNombre.setBorder(null);

        javax.swing.GroupLayout PanelModificarDirectivoLayout = new javax.swing.GroupLayout(PanelModificarDirectivo);
        PanelModificarDirectivo.setLayout(PanelModificarDirectivoLayout);
        PanelModificarDirectivoLayout.setHorizontalGroup(
            PanelModificarDirectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelModificarDirectivoLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(PanelModificarDirectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelModificarDirectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(PanelModificarDirectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator39)
                            .addComponent(InputModificarDirectivoDNI, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(TextoAltaDirectivoDNI1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(PanelModificarDirectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator38)
                            .addComponent(InputModificarDirectivoTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                            .addComponent(TextoAltaDirectivoTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator37)
                    .addComponent(InputModificarDirectivoApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                    .addComponent(InputModificarDirectivoNombre)
                    .addComponent(jSeparator36)
                    .addGroup(PanelModificarDirectivoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(TextoAltaDirectivoNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(TextoAltaDirectivoApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addGroup(PanelModificarDirectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator40, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputModificarDirectivoCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoAltaDirectivoCargo1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(413, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelModificarDirectivoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnModificarDirectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        PanelModificarDirectivoLayout.setVerticalGroup(
            PanelModificarDirectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelModificarDirectivoLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(PanelModificarDirectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextoAltaDirectivoNombre1)
                    .addComponent(TextoAltaDirectivoCargo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelModificarDirectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InputModificarDirectivoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InputModificarDirectivoCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelModificarDirectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator36, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator40, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(TextoAltaDirectivoApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputModificarDirectivoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator37, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextoAltaDirectivoTelefono1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InputModificarDirectivoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator38, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(PanelModificarDirectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelModificarDirectivoLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(BtnModificarDirectivo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelModificarDirectivoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextoAltaDirectivoDNI1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InputModificarDirectivoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator39, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        TabbedModificar.addTab("Directivo", PanelModificarDirectivo);

        ModificarPersonaWindow.add(TabbedModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1030, 480));

        jPanel11.setBackground(new java.awt.Color(246, 144, 84));

        TituloDarDeAlta.setFont(new java.awt.Font("Poppins SemiBold", 1, 65)); // NOI18N
        TituloDarDeAlta.setForeground(new java.awt.Color(255, 255, 255));
        TituloDarDeAlta.setText("Modificar datos");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(TituloDarDeAlta)
                .addContainerGap(264, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(TituloDarDeAlta)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        ModificarPersonaWindow.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 170));

        PanelRaiz.add(ModificarPersonaWindow, "card4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PanelRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PanelRaiz, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * Inicializa las listas, tablas y fuentes que se utilizan en la ventana,
     * así como la configuración inicial de la UI.
     */
    private void inicializarVariables() {

        //Inicializo arrays de componentes con comportamientos compartidos
        camposAltaInputsYModificar = List.of(InputAltaDirectivoApellido,
                InputAltaDirectivoCargo,
                InputAltaDirectivoDNI,
                InputAltaDirectivoNombre,
                InputAltaDirectivoTelefono,
                InputAltaTecnicoApellido,
                InputAltaTecnicoDNI,
                InputAltaTecnicoNombre,
                InputAltaTecnicoTelefono,
                InputAltaJugadorApellido,
                InputAltaJugadorDNI,
                InputAltaJugadorEdad,
                InputAltaJugadorNombre,
                InputAltaJugadorTelefono,
                InputAltaJugadorValor,
                InputModificarDirectivoApellido,
                InputModificarDirectivoCargo,
                InputModificarDirectivoDNI,
                InputModificarDirectivoNombre,
                InputModificarDirectivoTelefono,
                InputModificarTecnicoApellido,
                InputModificarTecnicoDNI,
                InputModificarTecnicoNombre,
                InputModificarTecnicoTelefono,
                InputModificarJugadorApellido,
                InputModificarJugadorDNI,
                InputModificarJugadorEdad,
                InputModificarJugadorNombre,
                InputModificarJugadorTelefono,
                InputModificarJugadorValor,
                InputNombreRival,
                InputCrearNominaImporte,
                InputCrearNominaDescripcion,
                InputCrearNominaAno,
                InputCrearNominaID,
                InputCrearFacturaCIF,
                InputCrearFacturaCantidad,
                InputCrearFacturaID,
                InputCrearFacturaNombre,
                InputCrearFacturaFecha
        );

        camposModificarInputs = List.of(
                InputModificarDirectivoApellido,
                InputModificarDirectivoCargo,
                InputModificarDirectivoDNI,
                InputModificarDirectivoNombre,
                InputModificarDirectivoTelefono,
                InputModificarTecnicoApellido,
                InputModificarTecnicoDNI,
                InputModificarTecnicoNombre,
                InputModificarTecnicoTelefono,
                InputModificarJugadorApellido,
                InputModificarJugadorDNI,
                InputModificarJugadorEdad,
                InputModificarJugadorNombre,
                InputModificarJugadorTelefono,
                InputModificarJugadorValor
        );

        listaComboBoxModificar = List.of(
                ComboBoxModificarTecnicoPuesto,
                ComboBoxModificarTecnicoEspecialidad,
                ComBoxModificarDemarcacion
        );

        camposModificarNomina = List.of(InputModificarNominaImporte,
                InputModificarNominaDescripcion,
                InputModificarNominaAno,
                InputModificarNominaID
        );

        camposCrearNomina = List.of(InputCrearNominaImporte,
                InputCrearNominaDescripcion,
                InputCrearNominaAno,
                InputCrearNominaID
        );

        botonesModificar = List.of(
                BtnModificarDirectivo,
                BtnModificarJugador,
                BtnModificarTécnico
        );

        camposNumericos = List.of(InputAltaJugadorTelefono,
                InputAltaJugadorEdad,
                InputAltaJugadorValor,
                InputAltaTecnicoTelefono,
                InputAltaDirectivoTelefono,
                InputModificarJugadorTelefono,
                InputModificarJugadorEdad,
                InputModificarJugadorValor,
                InputModificarTecnicoTelefono,
                InputModificarDirectivoTelefono,
                InputCrearNominaImporte,
                InputCrearNominaAno,
                InputCrearFacturaCantidad
        );

        botonesHomeEstilizar = List.of(
                BtnGestionarPlantilla,
                BtnGastos,
                BtnImprimir,
                BtnJugarPartido);
        
        botonesHome = List.of(
                BtnGestionarPlantilla,
                BtnJugarPartido,
                BtnGastos,
                BtnImprimir
        );
        
        botonesToFont = List.of(
                BtnCrearDirectivo,
                BtnCrearFactura,
                BtnCrearJugador,
                BtnCrearNomina,
                BtnCrearNominaFinal,
                BtnCrearTecnico,
                BtnDarDeAltaPersona,
                BtnEliminarConcepto,
                BtnEliminarPersona,
                BtnImprimirPDFNominas,
                BtnImprimirPDFResultadosEquipo,
                BtnImprimirPDFSortedDNI,
                BtnImprimirPDFSortedNombre,
                BtnImprimirTXTNominas,
                BtnImprimirTXTResultadosEquipo,
                BtnImprimirTXTSortedDNI,
                BtnModificarConceptoNomina,
                BtnModificarConcepto,
                BtnModificarDatos,
                BtnModificarDirectivo,
                BtnModificarJugador,
                BtnModificarNominaFinal,
                BtnModificarTécnico,
                BtnTerminarPartido
        );
        
        titulosLabel = List.of(
                Text_Titulo,
                Text_TituloPlantilla,
                PartidoLabel,
                GestionLabel,
                TituloImprimir,
                TituloDarDeAlta,
                TituloModificarConcepto,
                TituloCrearFactura,
                TituloCrearNomina1,
                TituloCrearNomina,
                TituloCrearFactura1,
                GestionLabel1
        );
        
        imprimirListadosLbls = List.of(
                ImprimirListadosLbl1,
                ImprimirListadosLbl2,
                ImprimirListadosLbl3,
                ImprimirListadosLbl4,
                ImprimirListadosLbl5
        );
        
        topInput = List.of(
                GolesLocalLabel,
                GolesVisitanteLabel,
                TextoNombreEquipoRival,
                TextoAltaJugadorApellido,
                TextoAltaJugadorApellido1,
                TextoAltaJugadorDNI,
                TextoAltaJugadorDNI1,
                TextoAltaJugadorDNI2,
                TextoAltaJugadorDNI3,
                TextoAltaJugadorDemarcacion,
                TextoAltaJugadorDemarcacion1,
                TextoAltaJugadorEdad,
                TextoAltaJugadorEdad1,
                TextoAltaJugadorEstadoFisico,
                TextoAltaJugadorEstadoFisico1,
                TextoAltaJugadorNombre,
                TextoAltaJugadorNombre1,
                TextoAltaJugadorTelefono,
                TextoAltaJugadorTelefono1,
                TextoAltaJugadorValor,
                TextoAltaJugadorValor1,
                TextoAltaJugadorValor2,
                TextoAltaJugadorValor3,
                TextoAltaTecnicoApellido,
                TextoAltaTecnicoApellido1,
                TextoAltaTecnicoDNI,
                TextoAltaTecnicoDNI1,
                TextoAltaTecnicoNombre,
                TextoAltaTecnicoNombre1,
                TextoAltaTecnicoTelefono,
                TextoAltaTecnicoTelefono1,
                TextoAltaDirectivoApellido,
                TextoAltaDirectivoApellido1,
                TextoAltaDirectivoCargo,
                TextoAltaDirectivoCargo1,
                TextoAltaDirectivoDNI,
                TextoAltaDirectivoDNI1,
                TextoAltaDirectivoNombre,
                TextoAltaDirectivoNombre1,
                TextoAltaDirectivoTelefono,
                TextoAltaDirectivoTelefono1,
                TextoCrearFacturaCIF,
                TextoCrearFacturaCantidad,
                TextoCrearFacturaFechaPago,
                TextoCrearFacturaID,
                TextoCrearFacturaNombre,
                TextoCrearNominaFecha,
                TextoCrearNominaFecha1,
                TextoCrearNominaImporte,
                TextoCrearNominaImporte1,
                TextoCrearNominaImporte2,
                TextoCrearNominaImporte3,
                TextoCrearNominaImporte4,
                TextoCrearNominaImporte5,
                TextoCrearNominaMes,
                TextoCrearNominaMes1
        );
        
        

        //Tabla para ver la plantilla de futbol actual
        String[] columnasPersonas = {"Nombre", "Apellido", "Rol", "DNI"};

        //Creo el modeloPersonas que luego metere en la tabla
        modeloPersonas = new DefaultTableModel(columnasPersonas, 0) {
            //Le sobreescribo el metodo para que el usuario no pueda editar las celdas de las tablas
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Desactiva la edición de celdas
            }
        };

        //Relleno el modeloPersonas con las personas que tiene la lista de personas dentro del club
        for (Persona persona : Gestor.getInstancia().ListaPersonasDentroDelClub()) {
            modeloPersonas.addRow(new String[]{persona.getNombre(), persona.getApellido(), persona.getClass().getSimpleName(), persona.getDni()});
        }

        //Asigno el modeloPersonas a las tablas
        TablaContenidoPlantilla.setModel(modeloPersonas);
        TablaGestionPersonas.setModel(modeloPersonas);
        TablaGastosPersonas.setModel(modeloPersonas);
        //Que no sea clickable ya que la tabla del home quiero que sea solo vista
        TablaContenidoPlantilla.setEnabled(false);

        //Creo el CardLayout para cambiar entre ventanas
        PanelRaiz.setLayout(new CardLayout());
        PanelRaiz.add(HomeWindow, "homeWindow");
        PanelRaiz.add(GestionWindow, "gestionWindow");
        PanelRaiz.add(DarDeAltaWindow, "darDeAltaWindow");
        PanelRaiz.add(ModificarPersonaWindow, "modificarPersonaWindow");
        PanelRaiz.add(JugarPartidoWindow, "jugarPartidoWindow");
        PanelRaiz.add(GastosWindow, "gastosWindow");
        PanelRaiz.add(CrearNominaWindow, "crearNominaWindow");
        PanelRaiz.add(FacturaWindow, "facturaWindow");
        PanelRaiz.add(ModificarConceptoWindow, "modificarConceptoWindow");
        PanelRaiz.add(ModificarNominaWindow, "modificarNominaWindow");
        PanelRaiz.add(ImprimirWindow, "imprimirWindow");
        TabbedModificar.addTab("Modificar jugador", PanelModificarJugador);
        TabbedModificar.addTab("Modificar tecnico", PanelModificarTecnico);
        TabbedModificar.addTab("Modificar directivo", PanelModificarDirectivo);
        
         // Cargar las fuentes personalizadas
        HomeFontLabel = cargarFuente("/Resources/Fuente/Poppins-SemiBold.ttf", 36f);
        HomeFontLabel.deriveFont(Font.BOLD);
        Titulos = cargarFuente("/Resources/Fuente/Poppins-SemiBold.ttf", 56f);
        Titulos.deriveFont(Font.BOLD);
        Botones = cargarFuente("/Resources/Fuente/Poppins-SemiBold.ttf", 14f);
        Botones.deriveFont(Font.PLAIN);
        LabelTopInput = cargarFuente("/Resources/Fuente/Poppins-SemiBold.ttf", 18f);
        LabelTopInput.deriveFont(Font.PLAIN);
        InputFont = cargarFuente("/Resources/Fuente/Poppins-SemiBold.ttf", 12f);
        InputFont.deriveFont(Font.PLAIN);
        
        if (HomeFontLabel != null) {
            System.out.println("Fuente cargada correctamente: " + HomeFontLabel.getName());
        } else {
            System.err.println("No se pudo cargar la fuente.");
        }
        
    }

    
     /**
     * Inicializa los eventos y comportamientos de diferentes componentes 
     * (botones, campos de texto, etc.) para la ventana principal.
     */
    private void inicializarEventos() {

        //Comportamiento compartidos de los campos numericos (No admites caracteres)
        for (JTextField field : camposNumericos) {
            field.addKeyListener(new java.awt.event.KeyAdapter() {
                @Override
                public void keyTyped(java.awt.event.KeyEvent evt) {
                    forzarSoloNumero(evt);
                }
            });
        }

        //Comportamiento compartidos de los campos normales (Enseñan un texto predefinido y si clickas se borra)
        for (JTextField field : camposAltaInputsYModificar) {
            field.setFont(InputFont);
            field.addFocusListener(new FocusAdapter() {
                String textoInicial = field.getText();

                @Override
                public void focusGained(FocusEvent evt) {
                    GainFocusStylishTextInput(field, textoInicial);
                }

                @Override
                public void focusLost(FocusEvent evt) {
                    LostFocusStylishTextInput(field, textoInicial);
                }
            });
        }

        //Comportamiento comportidos de los botones del Home (pequeño :onhover que muestra un icono de un balon)
        for (JButton boton : botonesHomeEstilizar) {
            boton.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

                @Override
                public void mousePressed(MouseEvent e) {

                }

                @Override
                public void mouseReleased(MouseEvent e) {

                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    stylishButtonEnter(boton, icon);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    stylishButtonExit(boton);
                }

            });
        }
        
        //Poniendole la fuente a los botones del Home
        for (JButton boton : botonesHome) {
            boton.setFont(HomeFontLabel);
        }
        
        //Poniendole la fuente a titulos
        for (JLabel label : titulosLabel) {
            label.setFont(Titulos);
        }
        
        //Poniendole la fuente a los botones
        for (JButton boton : botonesToFont) {
            boton.setForeground(Color.WHITE);
            boton.setFont(Botones);
        }
        
        //Poniendole la fuente a los textos que hay encima de los inputs
        for (JLabel labelsEncimaDeLosInputs : topInput) {
            labelsEncimaDeLosInputs.setForeground(new Color(246,144,84));
            labelsEncimaDeLosInputs.setFont(LabelTopInput);
        }
        
        //Poniendole la fuente a los textos del panel de imprimir (Usan la misma fuente que los botones)
        for (JLabel labels : imprimirListadosLbls) {
            labels.setForeground(Color.BLACK);
            labels.setFont(Botones);
        }
        

        InputCrearFacturaFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                forzarSoloFecha(evt, InputCrearFacturaFecha);
            }
        });

    }

     /**
     * Permite ingresar solo caracteres adecuados para una fecha en el formato DD/MM/YYYY,
     * adicionando automáticamente las barras inclinadas cuando corresponde.
     *
     * @param evt         Evento de pulsación de tecla.
     * @param campoTexto  Campo de texto sobre el que se aplica la validación de fecha.
     */
    private void forzarSoloFecha(java.awt.event.KeyEvent evt, JTextField campoTexto) {
        char c = evt.getKeyChar();
        String textoActual = campoTexto.getText();

        // Permitir borrar y mover el cursor
        if (Character.isDigit(c) || c == '/' || c == KeyEvent.VK_BACK_SPACE || c == KeyEvent.VK_DELETE) {
            // Verificar posición y formato
            if (Character.isDigit(c)) {
                if (textoActual.length() == 2 || textoActual.length() == 5) {
                    campoTexto.setText(textoActual + "/"); // Agregar "/" automáticamente
                } else if (textoActual.length() >= 10) {
                    evt.consume(); // Evitar más de 10 caracteres
                }
            } else if (c == '/') {
                // Permitir "/" solo en posiciones 3 y 6
                if (!(textoActual.length() == 2 || textoActual.length() == 5)) {
                    evt.consume();
                }
            }
        } else {
            // Bloquear cualquier otro carácter
            evt.consume();
        }
    }

    /**
     * Permite que en un campo de texto solo se puedan ingresar caracteres numéricos.
     *
     * @param evt Evento de pulsación de tecla.
     */
    private void forzarSoloNumero(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }

    /**
     * Aplica estilo al botón cuando el ratón entra sobre él, 
     * cambiando el color del texto y añadiendo un icono.
     *
     * @param boton Botón al que se desea aplicar el efecto hover.
     * @param icon  Icono a mostrar al poner el puntero encima.
     */
    private void stylishButtonEnter(JButton boton, Icon icon) {
        boton.setForeground(new Color(246,144,84));
        boton.setIcon(icon);
    }
    
    /**
     * Revierte el estilo del botón cuando el ratón sale de él,
     * regresando el color del texto a su valor por defecto y removiendo el icono.
     *
     * @param boton Botón al que se desea quitar el efecto hover.
     */
    private void stylishButtonExit(JButton boton) {
        boton.setForeground(colorTexto);
        boton.setIcon(null);
    }

    
     /**
     * Acción al ganar foco un campo de texto con placeholder.
     * Si el texto coincide con el placeholder inicial, lo limpia y cambia el color.
     *
     * @param textInput     Campo de texto al que se aplica el estilo.
     * @param textoInicial  Texto inicial (placeholder) del campo.
     */
    private void GainFocusStylishTextInput(JTextField textInput, String textoInicial) {
        //Chequea que el campo estaba vacio o es igual al placeholder (texto inicial)
        if (textInput.getText().equals(textoInicial)) {
            textInput.setText("");
            textInput.setForeground(Color.black);
        }

    }

    /**
     * Acción al perder foco un campo de texto con placeholder.
     * Si el texto está vacío, se restaura el placeholder y su color inicial.
     *
     * @param textInput       Campo de texto al que se aplica el estilo.
     * @param placeholderText Texto placeholder que se mostrará si el campo está vacío.
     */
    public void LostFocusStylishTextInput(JTextField textInput, String placeholderText) {
        if (textInput.getText().isEmpty()) {
            textInput.setText(placeholderText);
            textInput.setForeground(new Color(107,107,107));
        }

    }
    
    /**
     * Carga una fuente personalizada desde los recursos del proyecto.
     * 
     * @param fontPath Ruta dentro de los recursos del proyecto donde se ubica la fuente.
     * @param size     Tamaño de la fuente 
     * @return Objeto Font creado a partir del archivo. Retorna null si no puede cargar la fuente.
     */
    public static Font cargarFuente(String fontPath, float size) {
        try (InputStream is = MainWindow.class.getResourceAsStream(fontPath)) {
            if (is == null) {
                System.err.println("El archivo no fue encontrado en: " + fontPath);
                return null;
            }
            return Font.createFont(Font.TRUETYPE_FONT, is).deriveFont(size);
        } catch (FontFormatException | IOException e) {
            e.printStackTrace();
            return null;
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCrearDirectivo;
    private javax.swing.JButton BtnCrearFactura;
    private javax.swing.JButton BtnCrearJugador;
    private javax.swing.JButton BtnCrearNomina;
    private javax.swing.JButton BtnCrearNominaFinal;
    private javax.swing.JButton BtnCrearTecnico;
    private javax.swing.JButton BtnDarDeAltaAtras;
    private javax.swing.JButton BtnDarDeAltaAtrasModificar;
    private javax.swing.JButton BtnDarDeAltaPersona;
    private javax.swing.JButton BtnEliminarConcepto;
    private javax.swing.JButton BtnEliminarPersona;
    private javax.swing.JButton BtnGastos;
    private javax.swing.JButton BtnGestionarPlantilla;
    private javax.swing.JButton BtnHome;
    private javax.swing.JButton BtnHomeCrearFactura;
    private javax.swing.JButton BtnHomeCrearNomina;
    private javax.swing.JButton BtnHomeGastos;
    private javax.swing.JButton BtnHomeImprimir;
    private javax.swing.JButton BtnHomeModificarConceptos;
    private javax.swing.JButton BtnHomeModificarNomina;
    private javax.swing.JButton BtnHomePartido;
    private javax.swing.JButton BtnImprimir;
    private javax.swing.JButton BtnImprimirPDFNominas;
    private javax.swing.JButton BtnImprimirPDFResultadosEquipo;
    private javax.swing.JButton BtnImprimirPDFSortedDNI;
    private javax.swing.JButton BtnImprimirPDFSortedNombre;
    private javax.swing.JButton BtnImprimirTXTNominas;
    private javax.swing.JButton BtnImprimirTXTResultadosEquipo;
    private javax.swing.JButton BtnImprimirTXTSortedDNI;
    private javax.swing.JButton BtnImprimirTXTSortedNombre;
    private javax.swing.JButton BtnJugarPartido;
    private javax.swing.JButton BtnModificarConcepto;
    private javax.swing.JButton BtnModificarConceptoNomina;
    private javax.swing.JButton BtnModificarDatos;
    private javax.swing.JButton BtnModificarDirectivo;
    private javax.swing.JButton BtnModificarJugador;
    private javax.swing.JButton BtnModificarNominaFinal;
    private javax.swing.JButton BtnModificarTécnico;
    private javax.swing.JButton BtnTerminarPartido;
    private javax.swing.JComboBox<Demarcacion> ComBoxDemarcacion;
    private javax.swing.JComboBox<Meses> ComBoxMesNomina;
    private javax.swing.JComboBox<Meses> ComBoxMesNominaModificar;
    private javax.swing.JComboBox<Demarcacion> ComBoxModificarDemarcacion;
    private javax.swing.JComboBox<Especialidad> ComboBoxModificarTecnicoEspecialidad;
    private javax.swing.JComboBox<Puesto> ComboBoxModificarTecnicoPuesto;
    private javax.swing.JComboBox<Especialidad> ComboBoxTecnicoEspecialidad;
    private javax.swing.JComboBox<Puesto> ComboBoxTecnicoPuesto;
    private javax.swing.JButton CrearFacturaFinal;
    private javax.swing.JPanel CrearNominaWindow;
    private javax.swing.JPanel DarDeAltaWindow;
    private javax.swing.JPanel FacturaWindow;
    private javax.swing.JPanel GastosWindow;
    private javax.swing.JLabel GestionLabel;
    private javax.swing.JLabel GestionLabel1;
    private javax.swing.JPanel GestionWindow;
    private javax.swing.JLabel GolesLocalLabel;
    private javax.swing.JLabel GolesVisitanteLabel;
    private javax.swing.JPanel HomeWindow;
    private javax.swing.JLabel ImprimirListadosLbl1;
    private javax.swing.JLabel ImprimirListadosLbl2;
    private javax.swing.JLabel ImprimirListadosLbl3;
    private javax.swing.JLabel ImprimirListadosLbl4;
    private javax.swing.JLabel ImprimirListadosLbl5;
    private javax.swing.JPanel ImprimirWindow;
    private javax.swing.JTextField InputAltaDirectivoApellido;
    private javax.swing.JTextField InputAltaDirectivoCargo;
    private javax.swing.JTextField InputAltaDirectivoDNI;
    private javax.swing.JTextField InputAltaDirectivoNombre;
    private javax.swing.JTextField InputAltaDirectivoTelefono;
    private javax.swing.JTextField InputAltaJugadorApellido;
    private javax.swing.JTextField InputAltaJugadorDNI;
    private javax.swing.JTextField InputAltaJugadorEdad;
    private javax.swing.JTextField InputAltaJugadorNombre;
    private javax.swing.JTextField InputAltaJugadorTelefono;
    private javax.swing.JTextField InputAltaJugadorValor;
    private javax.swing.JTextField InputAltaTecnicoApellido;
    private javax.swing.JTextField InputAltaTecnicoDNI;
    private javax.swing.JTextField InputAltaTecnicoNombre;
    private javax.swing.JTextField InputAltaTecnicoTelefono;
    private javax.swing.JTextField InputCrearFacturaCIF;
    private javax.swing.JTextField InputCrearFacturaCantidad;
    private javax.swing.JTextField InputCrearFacturaFecha;
    private javax.swing.JTextField InputCrearFacturaID;
    private javax.swing.JTextField InputCrearFacturaNombre;
    private javax.swing.JTextField InputCrearNominaAno;
    private javax.swing.JTextField InputCrearNominaDescripcion;
    private javax.swing.JTextField InputCrearNominaID;
    private javax.swing.JTextField InputCrearNominaImporte;
    private javax.swing.JTextField InputModificarDirectivoApellido;
    private javax.swing.JTextField InputModificarDirectivoCargo;
    private javax.swing.JTextField InputModificarDirectivoDNI;
    private javax.swing.JTextField InputModificarDirectivoNombre;
    private javax.swing.JTextField InputModificarDirectivoTelefono;
    private javax.swing.JTextField InputModificarJugadorApellido;
    private javax.swing.JTextField InputModificarJugadorDNI;
    private javax.swing.JTextField InputModificarJugadorEdad;
    private javax.swing.JTextField InputModificarJugadorNombre;
    private javax.swing.JTextField InputModificarJugadorTelefono;
    private javax.swing.JTextField InputModificarJugadorValor;
    private javax.swing.JTextField InputModificarNominaAno;
    private javax.swing.JTextField InputModificarNominaDescripcion;
    private javax.swing.JTextField InputModificarNominaID;
    private javax.swing.JTextField InputModificarNominaImporte;
    private javax.swing.JTextField InputModificarTecnicoApellido;
    private javax.swing.JTextField InputModificarTecnicoDNI;
    private javax.swing.JTextField InputModificarTecnicoNombre;
    private javax.swing.JTextField InputModificarTecnicoTelefono;
    private javax.swing.JTextField InputNombreRival;
    private javax.swing.JPanel JugarPartidoWindow;
    private javax.swing.JSpinner LocalGolesSpinner;
    private javax.swing.JPanel ModificarConceptoWindow;
    private javax.swing.JPanel ModificarNominaWindow;
    private javax.swing.JPanel ModificarPersonaWindow;
    private javax.swing.JPanel PanelAltaDirectivo;
    private javax.swing.JPanel PanelAltaJugador;
    private javax.swing.JPanel PanelAltaTecnico;
    private javax.swing.JScrollPane PanelConceptosNomina;
    private javax.swing.JScrollPane PanelGastosPersonas;
    private javax.swing.JScrollPane PanelGestionPersonas;
    private javax.swing.JPanel PanelModificarDirectivo;
    private javax.swing.JPanel PanelModificarJugador;
    private javax.swing.JPanel PanelModificarTecnico;
    private javax.swing.JScrollPane PanelPlantilla;
    private javax.swing.JPanel PanelRaiz;
    private javax.swing.JLabel PartidoLabel;
    private javax.swing.JRadioButton RadioBtnVisitante;
    private javax.swing.JTabbedPane TabbedDarDeAlta;
    private javax.swing.JTabbedPane TabbedModificar;
    private javax.swing.JTable TablaConceptosNomina;
    private javax.swing.JTable TablaContenidoPlantilla;
    private javax.swing.JTable TablaGastosPersonas;
    private javax.swing.JTable TablaGestionPersonas;
    private javax.swing.JLabel Text_PlantillaActual;
    private javax.swing.JLabel Text_Titulo;
    private javax.swing.JLabel Text_TituloPlantilla;
    private javax.swing.JLabel TextoAltaDirectivoApellido;
    private javax.swing.JLabel TextoAltaDirectivoApellido1;
    private javax.swing.JLabel TextoAltaDirectivoCargo;
    private javax.swing.JLabel TextoAltaDirectivoCargo1;
    private javax.swing.JLabel TextoAltaDirectivoDNI;
    private javax.swing.JLabel TextoAltaDirectivoDNI1;
    private javax.swing.JLabel TextoAltaDirectivoNombre;
    private javax.swing.JLabel TextoAltaDirectivoNombre1;
    private javax.swing.JLabel TextoAltaDirectivoTelefono;
    private javax.swing.JLabel TextoAltaDirectivoTelefono1;
    private javax.swing.JLabel TextoAltaJugadorApellido;
    private javax.swing.JLabel TextoAltaJugadorApellido1;
    private javax.swing.JLabel TextoAltaJugadorDNI;
    private javax.swing.JLabel TextoAltaJugadorDNI1;
    private javax.swing.JLabel TextoAltaJugadorDNI2;
    private javax.swing.JLabel TextoAltaJugadorDNI3;
    private javax.swing.JLabel TextoAltaJugadorDemarcacion;
    private javax.swing.JLabel TextoAltaJugadorDemarcacion1;
    private javax.swing.JLabel TextoAltaJugadorEdad;
    private javax.swing.JLabel TextoAltaJugadorEdad1;
    private javax.swing.JLabel TextoAltaJugadorEstadoFisico;
    private javax.swing.JLabel TextoAltaJugadorEstadoFisico1;
    private javax.swing.JLabel TextoAltaJugadorNombre;
    private javax.swing.JLabel TextoAltaJugadorNombre1;
    private javax.swing.JLabel TextoAltaJugadorTelefono;
    private javax.swing.JLabel TextoAltaJugadorTelefono1;
    private javax.swing.JLabel TextoAltaJugadorValor;
    private javax.swing.JLabel TextoAltaJugadorValor1;
    private javax.swing.JLabel TextoAltaJugadorValor2;
    private javax.swing.JLabel TextoAltaJugadorValor3;
    private javax.swing.JLabel TextoAltaTecnicoApellido;
    private javax.swing.JLabel TextoAltaTecnicoApellido1;
    private javax.swing.JLabel TextoAltaTecnicoDNI;
    private javax.swing.JLabel TextoAltaTecnicoDNI1;
    private javax.swing.JLabel TextoAltaTecnicoNombre;
    private javax.swing.JLabel TextoAltaTecnicoNombre1;
    private javax.swing.JLabel TextoAltaTecnicoTelefono;
    private javax.swing.JLabel TextoAltaTecnicoTelefono1;
    private javax.swing.JLabel TextoCrearFacturaCIF;
    private javax.swing.JLabel TextoCrearFacturaCantidad;
    private javax.swing.JLabel TextoCrearFacturaFechaPago;
    private javax.swing.JLabel TextoCrearFacturaID;
    private javax.swing.JLabel TextoCrearFacturaNombre;
    private javax.swing.JLabel TextoCrearNominaFecha;
    private javax.swing.JLabel TextoCrearNominaFecha1;
    private javax.swing.JLabel TextoCrearNominaImporte;
    private javax.swing.JLabel TextoCrearNominaImporte1;
    private javax.swing.JLabel TextoCrearNominaImporte2;
    private javax.swing.JLabel TextoCrearNominaImporte3;
    private javax.swing.JLabel TextoCrearNominaImporte4;
    private javax.swing.JLabel TextoCrearNominaImporte5;
    private javax.swing.JLabel TextoCrearNominaMes;
    private javax.swing.JLabel TextoCrearNominaMes1;
    private javax.swing.JLabel TextoNombreEquipoRival;
    private javax.swing.JLabel TituloCrearFactura;
    private javax.swing.JLabel TituloCrearFactura1;
    private javax.swing.JLabel TituloCrearNomina;
    private javax.swing.JLabel TituloCrearNomina1;
    private javax.swing.JLabel TituloDarDeAlta;
    private javax.swing.JLabel TituloImprimir;
    private javax.swing.JLabel TituloModificarConcepto;
    private javax.swing.JLabel TituloModificarConceptos;
    private javax.swing.JToggleButton ToggleEstadoFisico;
    private javax.swing.JToggleButton ToggleModificarEstadoFisico;
    private javax.swing.JSpinner VisitanteGolesSpinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator27;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator32;
    private javax.swing.JSeparator jSeparator33;
    private javax.swing.JSeparator jSeparator34;
    private javax.swing.JSeparator jSeparator35;
    private javax.swing.JSeparator jSeparator36;
    private javax.swing.JSeparator jSeparator37;
    private javax.swing.JSeparator jSeparator38;
    private javax.swing.JSeparator jSeparator39;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator40;
    private javax.swing.JSeparator jSeparator41;
    private javax.swing.JSeparator jSeparator42;
    private javax.swing.JSeparator jSeparator43;
    private javax.swing.JSeparator jSeparator44;
    private javax.swing.JSeparator jSeparator46;
    private javax.swing.JSeparator jSeparator47;
    private javax.swing.JSeparator jSeparator48;
    private javax.swing.JSeparator jSeparator49;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator50;
    private javax.swing.JSeparator jSeparator51;
    private javax.swing.JSeparator jSeparator52;
    private javax.swing.JSeparator jSeparator53;
    private javax.swing.JSeparator jSeparator54;
    private javax.swing.JSeparator jSeparator55;
    private javax.swing.JSeparator jSeparator57;
    private javax.swing.JSeparator jSeparator58;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator60;
    private javax.swing.JSeparator jSeparator61;
    private javax.swing.JSeparator jSeparator62;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JLabel labelPDF;
    private javax.swing.JLabel labelTXT;
    // End of variables declaration//GEN-END:variables

    // <editor-fold defaultstate="collapsed" desc="Getters">
    
    public JPanel getHomeWindow() {
        return HomeWindow;
    }

    public JPanel getPanelRaiz() {
        return PanelRaiz;
    }

    public JPanel getGestionWindow() {
        return GestionWindow;
    }

    public JLabel getText_PlantillaActual() {
        return Text_PlantillaActual;
    }

    public JButton getBtnGastos() {
        return BtnGastos;
    }

    public JButton getBtnGestionarPlantilla() {
        return BtnGestionarPlantilla;
    }

    public JButton getBtnImprimir() {
        return BtnImprimir;
    }

    public JButton getBtnJugarPartido() {
        return BtnJugarPartido;
    }

    public JScrollPane getPanelPlantilla() {
        return PanelPlantilla;
    }

    public JTable getTablaContenidoPlantilla() {
        return TablaContenidoPlantilla;
    }

    public JButton getBtnHome() {
        return BtnHome;
    }

    public JTable getTablaGestionPersonas() {
        return TablaGestionPersonas;
    }

    public JButton getBtnEliminarPersona() {
        return BtnEliminarPersona;
    }

    public JButton getBtnDarDeAltaPersona() {
        return BtnDarDeAltaPersona;
    }

    public JComboBox<Especialidad> getComboBoxTecnicoEspecialidad() {
        return ComboBoxTecnicoEspecialidad;
    }

    public JComboBox<Puesto> getComboBoxTecnicoPuesto() {
        return ComboBoxTecnicoPuesto;
    }

    public JComboBox<Demarcacion> getComBoxDemarcacion() {
        return ComBoxDemarcacion;
    }

    public JToggleButton getToggleEstadoFisico() {
        return ToggleEstadoFisico;
    }

    public JButton getBtnDarDeAltaAtras() {
        return BtnDarDeAltaAtras;
    }

    public JButton getBtnCrearDirectivo() {
        return BtnCrearDirectivo;
    }

    public JButton getBtnCrearJugador() {
        return BtnCrearJugador;
    }

    public JButton getBtnCrearTecnico() {
        return BtnCrearTecnico;
    }

    public JTextField getInputAltaDirectivoApellido() {
        return InputAltaDirectivoApellido;
    }

    public JTextField getInputAltaDirectivoCargo() {
        return InputAltaDirectivoCargo;
    }

    public JTextField getInputAltaDirectivoDNI() {
        return InputAltaDirectivoDNI;
    }

    public JTextField getInputAltaDirectivoNombre() {
        return InputAltaDirectivoNombre;
    }

    public JTextField getInputAltaDirectivoTelefono() {
        return InputAltaDirectivoTelefono;
    }

    public JTextField getInputAltaJugadorApellido() {
        return InputAltaJugadorApellido;
    }

    public JTextField getInputAltaJugadorDNI() {
        return InputAltaJugadorDNI;
    }

    public JTextField getInputAltaJugadorEdad() {
        return InputAltaJugadorEdad;
    }

    public JTextField getInputAltaJugadorNombre() {
        return InputAltaJugadorNombre;
    }

    public JTextField getInputAltaJugadorTelefono() {
        return InputAltaJugadorTelefono;
    }

    public JTextField getInputAltaJugadorValor() {
        return InputAltaJugadorValor;
    }

    public JTextField getInputAltaTecnicoApellido() {
        return InputAltaTecnicoApellido;
    }

    public JTextField getInputAltaTecnicoDNI() {
        return InputAltaTecnicoDNI;
    }

    public JTextField getInputAltaTecnicoTelefono() {
        return InputAltaTecnicoTelefono;
    }

    public JTextField getInputAltaTecnicoNombre() {
        return InputAltaTecnicoNombre;
    }

    public List<JTextField> getCamposAltaInputsYModificar() {
        return camposAltaInputsYModificar;
    }

    public JPanel getDarDeAltaWindow() {
        return DarDeAltaWindow;
    }

    public DefaultTableModel getModeloPersonas() {
        return modeloPersonas;
    }

    public JButton getBtnModificarDatos() {
        return BtnModificarDatos;
    }

    public JButton getBtnDarDeAltaAtrasModificar() {
        return BtnDarDeAltaAtrasModificar;
    }

    public List<JTextField> getCamposModificarInputs() {
        return camposModificarInputs;
    }

    public JPanel getPanelModificarDirectivo() {
        return PanelModificarDirectivo;
    }

    public JPanel getPanelModificarJugador() {
        return PanelModificarJugador;
    }

    public JPanel getPanelModificarTecnico() {
        return PanelModificarTecnico;
    }

    public List<JComboBox<? extends Enum<?>>> getListaComboBoxModificar() {
        return listaComboBoxModificar;
    }

    public JComboBox<Demarcacion> getComBoxModificarDemarcacion() {
        return ComBoxModificarDemarcacion;
    }

    public JComboBox<Especialidad> getComboBoxModificarTecnicoEspecialidad() {
        return ComboBoxModificarTecnicoEspecialidad;
    }

    public JComboBox<Puesto> getComboBoxModificarTecnicoPuesto() {
        return ComboBoxModificarTecnicoPuesto;
    }

    public JTabbedPane getTabbedModificar() {
        return TabbedModificar;
    }

    public JTextField getInputModificarDirectivoApellido() {
        return InputModificarDirectivoApellido;
    }

    public JTextField getInputModificarDirectivoCargo() {
        return InputModificarDirectivoCargo;
    }

    public JTextField getInputModificarDirectivoDNI() {
        return InputModificarDirectivoDNI;
    }

    public JTextField getInputModificarDirectivoNombre() {
        return InputModificarDirectivoNombre;
    }

    public JTextField getInputModificarDirectivoTelefono() {
        return InputModificarDirectivoTelefono;
    }

    public JTextField getInputModificarJugadorApellido() {
        return InputModificarJugadorApellido;
    }

    public JTextField getInputModificarJugadorDNI() {
        return InputModificarJugadorDNI;
    }

    public JTextField getInputModificarJugadorEdad() {
        return InputModificarJugadorEdad;
    }

    public JTextField getInputModificarJugadorNombre() {
        return InputModificarJugadorNombre;
    }

    public JTextField getInputModificarJugadorTelefono() {
        return InputModificarJugadorTelefono;
    }

    public JTextField getInputModificarJugadorValor() {
        return InputModificarJugadorValor;
    }

    public JTextField getInputModificarTecnicoApellido() {
        return InputModificarTecnicoApellido;
    }

    public JTextField getInputModificarTecnicoDNI() {
        return InputModificarTecnicoDNI;
    }

    public JTextField getInputModificarTecnicoNombre() {
        return InputModificarTecnicoNombre;
    }

    public JTextField getInputModificarTecnicoTelefono() {
        return InputModificarTecnicoTelefono;
    }

    public JButton getBtnModificarDirectivo() {
        return BtnModificarDirectivo;
    }

    public JButton getBtnModificarJugador() {
        return BtnModificarJugador;
    }

    public JButton getBtnModificarTécnico() {
        return BtnModificarTécnico;
    }

    public List<JButton> getBotonesModificar() {
        return botonesModificar;
    }

    public JButton getBtnHomePartido() {
        return BtnHomePartido;
    }

    public JButton getBtnTerminarPartido() {
        return BtnTerminarPartido;
    }

    public JSpinner getLocalGolesSpinner() {
        return LocalGolesSpinner;
    }

    public JSpinner getVisitanteGolesSpinner() {
        return VisitanteGolesSpinner;
    }

    public JTextField getInputNombreRival() {
        return InputNombreRival;
    }

    public JRadioButton getRadioBtnVisitante() {
        return RadioBtnVisitante;
    }

    public JButton getBtnHomeGastos() {
        return BtnHomeGastos;
    }

    public JButton getBtnCrearFactura() {
        return BtnCrearFactura;
    }

    public JButton getBtnCrearNomina() {
        return BtnCrearNomina;
    }

    public JButton getBtnModificarConceptoNomina() {
        return BtnModificarConceptoNomina;
    }

    public JTable getTablaGastosPersonas() {
        return TablaGastosPersonas;
    }

    public JComboBox<Meses> getComBoxMesNomina() {
        return ComBoxMesNomina;
    }

    public JTextField getInputCrearNominaAno() {
        return InputCrearNominaAno;
    }

    public JTextField getInputCrearNominaDescripcion() {
        return InputCrearNominaDescripcion;
    }

    public JTextField getInputCrearNominaImporte() {
        return InputCrearNominaImporte;
    }

    public JTextField getInputCrearNominaID() {
        return InputCrearNominaID;
    }

    public JButton getBtnCrearNominaFinal() {
        return BtnCrearNominaFinal;
    }

    public JButton getCrearFacturaFinal() {
        return CrearFacturaFinal;
    }

    public JTextField getInputCrearFacturaCIF() {
        return InputCrearFacturaCIF;
    }

    public JTextField getInputCrearFacturaCantidad() {
        return InputCrearFacturaCantidad;
    }

    public JTextField getInputCrearFacturaID() {
        return InputCrearFacturaID;
    }

    public JTextField getInputCrearFacturaNombre() {
        return InputCrearFacturaNombre;
    }

    public JTextField getInputCrearFacturaFecha() {
        return InputCrearFacturaFecha;
    }

    public JLabel getTituloModificarConceptos() {
        return TituloModificarConceptos;
    }

    public JTable getTablaConceptosNomina() {
        return TablaConceptosNomina;
    }

    public JButton getBtnEliminarConcepto() {
        return BtnEliminarConcepto;
    }

    public JButton getBtnModificarConcepto() {
        return BtnModificarConcepto;
    }

    public List<JTextField> getcamposModificarNomina() {
        return camposModificarNomina;
    }

    public List<JTextField> getcamposCrearNomina() {
        return camposCrearNomina;
    }

    public JTextField getInputModificarNominaAno() {
        return InputModificarNominaAno;
    }

    public JTextField getInputModificarNominaDescripcion() {
        return InputModificarNominaDescripcion;
    }

    public JTextField getInputModificarNominaID() {
        return InputModificarNominaID;
    }

    public JTextField getInputModificarNominaImporte() {
        return InputModificarNominaImporte;
    }

    public JButton getBtnModificarNominaFinal() {
        return BtnModificarNominaFinal;
    }

    public JButton getBtnHomeModificarConceptos() {
        return BtnHomeModificarConceptos;
    }

    public JButton getBtnHomeCrearFactura() {
        return BtnHomeCrearFactura;
    }

    public JButton getBtnHomeCrearNomina() {
        return BtnHomeCrearNomina;
    }

    public JButton getBtnHomeModificarNomina() {
        return BtnHomeModificarNomina;
    }

    public JButton getBtnHomeImprimir() {
        return BtnHomeImprimir;
    }

    public JButton getBtnImprimirPDFNominas() {
        return BtnImprimirPDFNominas;
    }

    public JButton getBtnImprimirPDFResultadosEquipo() {
        return BtnImprimirPDFResultadosEquipo;
    }

    public JButton getBtnImprimirPDFSortedDNI() {
        return BtnImprimirPDFSortedDNI;
    }

    public JButton getBtnImprimirPDFSortedNombre() {
        return BtnImprimirPDFSortedNombre;
    }

    public JButton getBtnImprimirTXTNominas() {
        return BtnImprimirTXTNominas;
    }

    public JButton getBtnImprimirTXTResultadosEquipo() {
        return BtnImprimirTXTResultadosEquipo;
    }

    public JButton getBtnImprimirTXTSortedDNI() {
        return BtnImprimirTXTSortedDNI;
    }

    public JButton getBtnImprimirTXTSortedNombre() {
        return BtnImprimirTXTSortedNombre;
    }
    
    public JComboBox<Meses> getComBoxMesNominaModificar() {
        return ComBoxMesNominaModificar;
    }
    
    // </editor-fold>

    
    
    
    
    
    
    

}
