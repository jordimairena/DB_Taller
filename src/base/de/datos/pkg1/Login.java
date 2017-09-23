package base.de.datos.pkg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Login extends javax.swing.JFrame {

    Connection myConn = null;
    Statement myStmt = null;

    public Login() {

        try {
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB_Taller?useSSL=true", "root", "jordi123");
            myStmt = myConn.createStatement();
            System.out.println("conecta");
        } catch (SQLException e) {
            e.printStackTrace();
        }//Fin del try catch

        initComponents();
        this.setTitle("Login");
        this.setLocationRelativeTo(null);
        System.out.println("");

    }//Fin del constructor general

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_administador = new javax.swing.JDialog();
        btn_Asesores = new javax.swing.JButton();
        btn_Mecanicos = new javax.swing.JButton();
        lbl_fondo = new javax.swing.JLabel();
        jd_admin_asesores = new javax.swing.JDialog();
        lbl_asess = new javax.swing.JLabel();
        lbl_pnomAes = new javax.swing.JLabel();
        lbl_snomAse = new javax.swing.JLabel();
        lbl_papAse = new javax.swing.JLabel();
        lbl_sapAses = new javax.swing.JLabel();
        txt_asesores_pnombre = new javax.swing.JTextField();
        txt_asesores_papellido = new javax.swing.JTextField();
        txt_asesores_snombre = new javax.swing.JTextField();
        txt_asesores_sapellido = new javax.swing.JTextField();
        lbl_numTelAse = new javax.swing.JLabel();
        txt_asesores_numtel = new javax.swing.JTextField();
        btn_asesores_agregar = new javax.swing.JButton();
        btn_asesor_modif = new javax.swing.JButton();
        btn_asesor_eliminar = new javax.swing.JButton();
        lbl_modAses = new javax.swing.JLabel();
        lbl_agrgAse = new javax.swing.JLabel();
        cb_asesor_modif = new javax.swing.JComboBox<>();
        lbl_EliAse = new javax.swing.JLabel();
        cb_asesor_eliminar = new javax.swing.JComboBox<>();
        lbl_idenAse = new javax.swing.JLabel();
        txt_idAsesor = new javax.swing.JTextField();
        lbl_fondoAse = new javax.swing.JLabel();
        jd_admin_mecanicos = new javax.swing.JDialog();
        btn_mecanico_agregar = new javax.swing.JButton();
        lbl_mecanico = new javax.swing.JLabel();
        lbl_papMec = new javax.swing.JLabel();
        btn_mecanico_modif = new javax.swing.JButton();
        btn_asesor_eliminar1 = new javax.swing.JButton();
        lbl_SNomMec = new javax.swing.JLabel();
        lbl_PapMec = new javax.swing.JLabel();
        lbl_ModMec = new javax.swing.JLabel();
        lbl_SApMec = new javax.swing.JLabel();
        lbl_agMec = new javax.swing.JLabel();
        txt_mecanico_pnombre = new javax.swing.JTextField();
        txt_mecanico_papellido = new javax.swing.JTextField();
        cb_asesor_modif1 = new javax.swing.JComboBox<>();
        txt_mecanico_snombre = new javax.swing.JTextField();
        lbl_elmMec = new javax.swing.JLabel();
        txt_mecanico_sapellido = new javax.swing.JTextField();
        lbl_NumTelMec = new javax.swing.JLabel();
        cb_mecanico_eliminar = new javax.swing.JComboBox<>();
        txt_mecanico_numtel = new javax.swing.JTextField();
        lbl_idmec = new javax.swing.JLabel();
        txt_idMecanico = new javax.swing.JTextField();
        lbl_fondoMec = new javax.swing.JLabel();
        jd_principal_asesor = new javax.swing.JDialog();
        jLabel23 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jd_citas = new javax.swing.JDialog();
        lbl_agreCit = new javax.swing.JLabel();
        lbl_nomClie = new javax.swing.JLabel();
        lbl_pNom = new javax.swing.JLabel();
        lbl_Recorrido = new javax.swing.JLabel();
        lbl_tipoRep = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbl_SnomCi = new javax.swing.JLabel();
        lbl_papCi = new javax.swing.JLabel();
        lbl_sapci = new javax.swing.JLabel();
        txt_PNomCita = new javax.swing.JTextField();
        txt_SNomCita = new javax.swing.JTextField();
        txt_PApCita = new javax.swing.JTextField();
        txt_SApCita = new javax.swing.JTextField();
        txt_RecorridoCita = new javax.swing.JTextField();
        txt_PlacaCarro = new javax.swing.JTextField();
        txt_TipoReparacion = new javax.swing.JTextField();
        txt_TelefonoCita = new javax.swing.JTextField();
        lbl_Estado = new javax.swing.JLabel();
        cb_EstadoAgregarCita = new javax.swing.JComboBox<>();
        lbl_FechaEntrada = new javax.swing.JLabel();
        jdc_FechaEntradaCita = new com.toedter.calendar.JDateChooser();
        lbl_FechaEntrega = new javax.swing.JLabel();
        jdc_FechaEntregaCita = new com.toedter.calendar.JDateChooser();
        btn_AgregarCita = new javax.swing.JButton();
        btn_ModificarEstadoCita = new javax.swing.JButton();
        lbl_fondoCitas = new javax.swing.JLabel();
        jd_ModificarEstado = new javax.swing.JDialog();
        lbl_modEst = new javax.swing.JLabel();
        lbl_nomClienteCitaMod = new javax.swing.JLabel();
        lbl_PlacaCarroCitaMod = new javax.swing.JLabel();
        lbl_EstadoActual = new javax.swing.JLabel();
        cb_NombreClienteModEstado = new javax.swing.JComboBox<>();
        cb_PlacaModEstado = new javax.swing.JComboBox<>();
        txt_EstadoActualCita = new javax.swing.JTextField();
        lbl_NuevoEstado = new javax.swing.JLabel();
        cb_EstadoCitaMod = new javax.swing.JComboBox<>();
        btn_ModificarEstado = new javax.swing.JButton();
        lbl_fondoModEstado = new javax.swing.JLabel();
        lbl_login = new javax.swing.JLabel();
        lbl_user = new javax.swing.JLabel();
        lbl_Password = new javax.swing.JLabel();
        txt_login_password = new javax.swing.JTextField();
        btn_login_ingresar = new javax.swing.JButton();
        txt_login_user = new javax.swing.JTextField();
        lbl_Fondo = new javax.swing.JLabel();

        jd_administador.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_Asesores.setText("ASESORES");
        btn_Asesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AsesoresActionPerformed(evt);
            }
        });
        jd_administador.getContentPane().add(btn_Asesores, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 99, -1));

        btn_Mecanicos.setText("MECANICOS");
        btn_Mecanicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MecanicosActionPerformed(evt);
            }
        });
        jd_administador.getContentPane().add(btn_Mecanicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 152, -1, -1));

        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/NaranjaOscuro.jpg"))); // NOI18N
        jd_administador.getContentPane().add(lbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 260));

        jd_admin_asesores.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_asess.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_asess.setForeground(new java.awt.Color(255, 255, 255));
        lbl_asess.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_asess.setText("Asesores");
        jd_admin_asesores.getContentPane().add(lbl_asess, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, -1, -1));

        lbl_pnomAes.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_pnomAes.setForeground(new java.awt.Color(255, 255, 255));
        lbl_pnomAes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_pnomAes.setText("Primer Nombre");
        jd_admin_asesores.getContentPane().add(lbl_pnomAes, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 75, 129, -1));

        lbl_snomAse.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_snomAse.setForeground(new java.awt.Color(255, 255, 255));
        lbl_snomAse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_snomAse.setText("Segundo Nombre");
        jd_admin_asesores.getContentPane().add(lbl_snomAse, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 117, 129, -1));

        lbl_papAse.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_papAse.setForeground(new java.awt.Color(255, 255, 255));
        lbl_papAse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_papAse.setText("Primer Apellido");
        jd_admin_asesores.getContentPane().add(lbl_papAse, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 173, 120, -1));

        lbl_sapAses.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_sapAses.setForeground(new java.awt.Color(255, 255, 255));
        lbl_sapAses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_sapAses.setText("Segundo Apellido");
        jd_admin_asesores.getContentPane().add(lbl_sapAses, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 216, 120, -1));
        jd_admin_asesores.getContentPane().add(txt_asesores_pnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 73, 150, -1));
        jd_admin_asesores.getContentPane().add(txt_asesores_papellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 171, 150, -1));
        jd_admin_asesores.getContentPane().add(txt_asesores_snombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 115, 150, -1));
        jd_admin_asesores.getContentPane().add(txt_asesores_sapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 214, 150, -1));

        lbl_numTelAse.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_numTelAse.setForeground(new java.awt.Color(255, 255, 255));
        lbl_numTelAse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_numTelAse.setText("Numero de Telefono");
        jd_admin_asesores.getContentPane().add(lbl_numTelAse, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 265, -1, -1));
        jd_admin_asesores.getContentPane().add(txt_asesores_numtel, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 263, 150, -1));

        btn_asesores_agregar.setText("Agregar");
        jd_admin_asesores.getContentPane().add(btn_asesores_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, -1, -1));

        btn_asesor_modif.setText("Modificar");
        jd_admin_asesores.getContentPane().add(btn_asesor_modif, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, -1, -1));

        btn_asesor_eliminar.setText("Eliminar");
        jd_admin_asesores.getContentPane().add(btn_asesor_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, -1, -1));

        lbl_modAses.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_modAses.setForeground(new java.awt.Color(255, 255, 255));
        lbl_modAses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_modAses.setText("Modificar Asesor");
        jd_admin_asesores.getContentPane().add(lbl_modAses, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, -1));

        lbl_agrgAse.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_agrgAse.setForeground(new java.awt.Color(255, 255, 255));
        lbl_agrgAse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_agrgAse.setText("Agregar Asesor");
        jd_admin_asesores.getContentPane().add(lbl_agrgAse, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 22, -1, -1));

        jd_admin_asesores.getContentPane().add(cb_asesor_modif, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 214, -1));

        lbl_EliAse.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_EliAse.setForeground(new java.awt.Color(255, 255, 255));
        lbl_EliAse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_EliAse.setText("Eliminar Asesor");
        jd_admin_asesores.getContentPane().add(lbl_EliAse, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, -1, -1));

        jd_admin_asesores.getContentPane().add(cb_asesor_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 214, -1));

        lbl_idenAse.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_idenAse.setForeground(new java.awt.Color(255, 255, 255));
        lbl_idenAse.setText("Identificador");
        jd_admin_asesores.getContentPane().add(lbl_idenAse, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));
        jd_admin_asesores.getContentPane().add(txt_idAsesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 150, -1));

        lbl_fondoAse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/NaranjaOscuro.jpg"))); // NOI18N
        lbl_fondoAse.setText("jLabel1");
        jd_admin_asesores.getContentPane().add(lbl_fondoAse, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 440));

        jd_admin_mecanicos.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_mecanico_agregar.setText("Agregar");
        jd_admin_mecanicos.getContentPane().add(btn_mecanico_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, -1, -1));

        lbl_mecanico.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_mecanico.setForeground(new java.awt.Color(255, 255, 255));
        lbl_mecanico.setText("Mecánicos");
        jd_admin_mecanicos.getContentPane().add(lbl_mecanico, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        lbl_papMec.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_papMec.setForeground(new java.awt.Color(255, 255, 255));
        lbl_papMec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_papMec.setText("Primer Nombre");
        jd_admin_mecanicos.getContentPane().add(lbl_papMec, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 120, -1));

        btn_mecanico_modif.setText("Modificar");
        jd_admin_mecanicos.getContentPane().add(btn_mecanico_modif, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        btn_asesor_eliminar1.setText("Eliminar");
        jd_admin_mecanicos.getContentPane().add(btn_asesor_eliminar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 310, -1, -1));

        lbl_SNomMec.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_SNomMec.setForeground(new java.awt.Color(255, 255, 255));
        lbl_SNomMec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_SNomMec.setText("Segundo Nombre");
        jd_admin_mecanicos.getContentPane().add(lbl_SNomMec, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 120, -1));

        lbl_PapMec.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_PapMec.setForeground(new java.awt.Color(255, 255, 255));
        lbl_PapMec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_PapMec.setText("Primer Apellido");
        jd_admin_mecanicos.getContentPane().add(lbl_PapMec, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 130, -1));

        lbl_ModMec.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_ModMec.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ModMec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ModMec.setText("Modificar Mecánico");
        jd_admin_mecanicos.getContentPane().add(lbl_ModMec, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, -1, -1));

        lbl_SApMec.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_SApMec.setForeground(new java.awt.Color(255, 255, 255));
        lbl_SApMec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_SApMec.setText("Segundo Apellido");
        jd_admin_mecanicos.getContentPane().add(lbl_SApMec, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 130, -1));

        lbl_agMec.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_agMec.setForeground(new java.awt.Color(255, 255, 255));
        lbl_agMec.setText("Agregar Mecánico");
        jd_admin_mecanicos.getContentPane().add(lbl_agMec, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));
        jd_admin_mecanicos.getContentPane().add(txt_mecanico_pnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 150, 20));
        jd_admin_mecanicos.getContentPane().add(txt_mecanico_papellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 150, 20));

        jd_admin_mecanicos.getContentPane().add(cb_asesor_modif1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 199, -1));
        jd_admin_mecanicos.getContentPane().add(txt_mecanico_snombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 150, 20));

        lbl_elmMec.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_elmMec.setForeground(new java.awt.Color(255, 255, 255));
        lbl_elmMec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_elmMec.setText("Eliminar Mecánico");
        jd_admin_mecanicos.getContentPane().add(lbl_elmMec, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 230, -1, -1));
        jd_admin_mecanicos.getContentPane().add(txt_mecanico_sapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 150, 20));

        lbl_NumTelMec.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_NumTelMec.setForeground(new java.awt.Color(255, 255, 255));
        lbl_NumTelMec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_NumTelMec.setText("Numero de Telefono");
        jd_admin_mecanicos.getContentPane().add(lbl_NumTelMec, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jd_admin_mecanicos.getContentPane().add(cb_mecanico_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 199, -1));
        jd_admin_mecanicos.getContentPane().add(txt_mecanico_numtel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 150, 20));

        lbl_idmec.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_idmec.setForeground(new java.awt.Color(255, 255, 255));
        lbl_idmec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_idmec.setText("Identificador");
        jd_admin_mecanicos.getContentPane().add(lbl_idmec, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));
        jd_admin_mecanicos.getContentPane().add(txt_idMecanico, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 150, -1));

        lbl_fondoMec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/NaranjaOscuro.jpg"))); // NOI18N
        jd_admin_mecanicos.getContentPane().add(lbl_fondoMec, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 420));

        javax.swing.GroupLayout jd_principal_asesorLayout = new javax.swing.GroupLayout(jd_principal_asesor.getContentPane());
        jd_principal_asesor.getContentPane().setLayout(jd_principal_asesorLayout);
        jd_principal_asesorLayout.setHorizontalGroup(
            jd_principal_asesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jd_principal_asesorLayout.setVerticalGroup(
            jd_principal_asesorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLabel23.setText("jLabel23");

        jRadioButton1.setText("jRadioButton1");

        jd_citas.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_agreCit.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_agreCit.setForeground(new java.awt.Color(255, 255, 255));
        lbl_agreCit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_agreCit.setText("Citas");
        jd_citas.getContentPane().add(lbl_agreCit, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 150, 40));

        lbl_nomClie.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_nomClie.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nomClie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_nomClie.setText("Placa del Carro");
        jd_citas.getContentPane().add(lbl_nomClie, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));

        lbl_pNom.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_pNom.setForeground(new java.awt.Color(255, 255, 255));
        lbl_pNom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_pNom.setText("Primer Nombre");
        jd_citas.getContentPane().add(lbl_pNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        lbl_Recorrido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_Recorrido.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Recorrido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Recorrido.setText("Recorrido");
        jd_citas.getContentPane().add(lbl_Recorrido, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        lbl_tipoRep.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_tipoRep.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tipoRep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_tipoRep.setText("Tipo Reparación");
        jd_citas.getContentPane().add(lbl_tipoRep, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Teléfono");
        jd_citas.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        lbl_SnomCi.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_SnomCi.setForeground(new java.awt.Color(255, 255, 255));
        lbl_SnomCi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_SnomCi.setText("Segundo Nombre");
        jd_citas.getContentPane().add(lbl_SnomCi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        lbl_papCi.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_papCi.setForeground(new java.awt.Color(255, 255, 255));
        lbl_papCi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_papCi.setText("Primer Apellido");
        jd_citas.getContentPane().add(lbl_papCi, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 120, 20));

        lbl_sapci.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_sapci.setForeground(new java.awt.Color(255, 255, 255));
        lbl_sapci.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_sapci.setText("Segundo Apellido");
        jd_citas.getContentPane().add(lbl_sapci, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));
        jd_citas.getContentPane().add(txt_PNomCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 140, -1));
        jd_citas.getContentPane().add(txt_SNomCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 140, -1));
        jd_citas.getContentPane().add(txt_PApCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 140, -1));
        jd_citas.getContentPane().add(txt_SApCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 140, -1));
        jd_citas.getContentPane().add(txt_RecorridoCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 140, -1));
        jd_citas.getContentPane().add(txt_PlacaCarro, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 140, -1));
        jd_citas.getContentPane().add(txt_TipoReparacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 140, 30));
        jd_citas.getContentPane().add(txt_TelefonoCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 140, -1));

        lbl_Estado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_Estado.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Estado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Estado.setText("Estado");
        jd_citas.getContentPane().add(lbl_Estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, -1, -1));

        cb_EstadoAgregarCita.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cb_EstadoAgregarCita.setForeground(new java.awt.Color(255, 255, 255));
        cb_EstadoAgregarCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO INGRESADO", "INGRESADO", "EN REPARACIÓN", "PENDIENTE DE REPUESTOS", "LISTO", "AUTO RETIRADO", "CANCELADA" }));
        jd_citas.getContentPane().add(cb_EstadoAgregarCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 140, -1));

        lbl_FechaEntrada.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_FechaEntrada.setForeground(new java.awt.Color(255, 255, 255));
        lbl_FechaEntrada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_FechaEntrada.setText("Fecha de Entrada");
        jd_citas.getContentPane().add(lbl_FechaEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, -1));
        jd_citas.getContentPane().add(jdc_FechaEntradaCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 90, 200, -1));

        lbl_FechaEntrega.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_FechaEntrega.setForeground(new java.awt.Color(255, 255, 255));
        lbl_FechaEntrega.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_FechaEntrega.setText("Fecha de Entrega");
        jd_citas.getContentPane().add(lbl_FechaEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, -1, -1));
        jd_citas.getContentPane().add(jdc_FechaEntregaCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 190, -1));

        btn_AgregarCita.setText("Agregar Cita");
        jd_citas.getContentPane().add(btn_AgregarCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 310, 120, -1));

        btn_ModificarEstadoCita.setText("Modificar Estado");
        btn_ModificarEstadoCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarEstadoCitaActionPerformed(evt);
            }
        });
        jd_citas.getContentPane().add(btn_ModificarEstadoCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, -1, -1));

        lbl_fondoCitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/NaranjaOscuro.jpg"))); // NOI18N
        jd_citas.getContentPane().add(lbl_fondoCitas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 850, 480));

        jd_ModificarEstado.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_modEst.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_modEst.setForeground(new java.awt.Color(255, 255, 255));
        lbl_modEst.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_modEst.setText("Modificar Estado de Cita");
        jd_ModificarEstado.getContentPane().add(lbl_modEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        lbl_nomClienteCitaMod.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_nomClienteCitaMod.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nomClienteCitaMod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_nomClienteCitaMod.setText("Nombre del Cliente");
        jd_ModificarEstado.getContentPane().add(lbl_nomClienteCitaMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        lbl_PlacaCarroCitaMod.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_PlacaCarroCitaMod.setForeground(new java.awt.Color(255, 255, 255));
        lbl_PlacaCarroCitaMod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_PlacaCarroCitaMod.setText("Placa del Carro");
        jd_ModificarEstado.getContentPane().add(lbl_PlacaCarroCitaMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 120, -1));

        lbl_EstadoActual.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_EstadoActual.setForeground(new java.awt.Color(255, 255, 255));
        lbl_EstadoActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_EstadoActual.setText("Estado Actual");
        jd_ModificarEstado.getContentPane().add(lbl_EstadoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 120, -1));

        jd_ModificarEstado.getContentPane().add(cb_NombreClienteModEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 170, -1));

        jd_ModificarEstado.getContentPane().add(cb_PlacaModEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 170, -1));

        txt_EstadoActualCita.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_EstadoActualCita.setEnabled(false);
        jd_ModificarEstado.getContentPane().add(txt_EstadoActualCita, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 170, -1));

        lbl_NuevoEstado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_NuevoEstado.setForeground(new java.awt.Color(255, 255, 255));
        lbl_NuevoEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_NuevoEstado.setText("Nuevo Estado");
        jd_ModificarEstado.getContentPane().add(lbl_NuevoEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, -1, -1));

        jd_ModificarEstado.getContentPane().add(cb_EstadoCitaMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 180, -1));

        btn_ModificarEstado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_ModificarEstado.setForeground(new java.awt.Color(0, 0, 0));
        btn_ModificarEstado.setText("Modificar");
        jd_ModificarEstado.getContentPane().add(btn_ModificarEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        lbl_fondoModEstado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/ColorAzul.jpg"))); // NOI18N
        jd_ModificarEstado.getContentPane().add(lbl_fondoModEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 300));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_login.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lbl_login.setForeground(new java.awt.Color(255, 255, 255));
        lbl_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_login.setText("LOGIN");
        getContentPane().add(lbl_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 100, 50));

        lbl_user.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_user.setForeground(new java.awt.Color(255, 255, 255));
        lbl_user.setText("USER");
        getContentPane().add(lbl_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        lbl_Password.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_Password.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Password.setText("PASSWORD");
        getContentPane().add(lbl_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));
        getContentPane().add(txt_login_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, 120, -1));

        btn_login_ingresar.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btn_login_ingresar.setText("INGRESAR");
        btn_login_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_login_ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login_ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 120, 30));
        getContentPane().add(txt_login_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 120, -1));

        lbl_Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/ColorAzul.jpg"))); // NOI18N
        getContentPane().add(lbl_Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_login_ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_login_ingresarActionPerformed
        String user = txt_login_user.getText();
        String password = txt_login_password.getText();
        if (user.contentEquals("admin") && password.contentEquals("1234")) {
            jd_administador.setModal(true);
            jd_administador.pack();
            jd_administador.setVisible(true);
        }//Fin del if
    }//GEN-LAST:event_btn_login_ingresarActionPerformed

    private void btn_AsesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AsesoresActionPerformed
        jd_admin_asesores.setModal(true);
        jd_admin_asesores.pack();
        jd_admin_asesores.setVisible(true);
    }//GEN-LAST:event_btn_AsesoresActionPerformed

    private void btn_MecanicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MecanicosActionPerformed
        jd_admin_mecanicos.setModal(true);
        jd_admin_mecanicos.pack();
        jd_admin_mecanicos.setVisible(true);
    }//GEN-LAST:event_btn_MecanicosActionPerformed

    private void btn_ModificarEstadoCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarEstadoCitaActionPerformed
        this.jd_ModificarEstado.setTitle("Modificar Estado");
        this.jd_ModificarEstado.pack();
        this.jd_ModificarEstado.setModal(true);
        this.jd_ModificarEstado.setLocationRelativeTo(null);
        this.jd_ModificarEstado.setVisible(true);
    }//GEN-LAST:event_btn_ModificarEstadoCitaActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_AgregarCita;
    private javax.swing.JButton btn_Asesores;
    private javax.swing.JButton btn_Mecanicos;
    private javax.swing.JButton btn_ModificarEstado;
    private javax.swing.JButton btn_ModificarEstadoCita;
    private javax.swing.JButton btn_asesor_eliminar;
    private javax.swing.JButton btn_asesor_eliminar1;
    private javax.swing.JButton btn_asesor_modif;
    private javax.swing.JButton btn_asesores_agregar;
    private javax.swing.JButton btn_login_ingresar;
    private javax.swing.JButton btn_mecanico_agregar;
    private javax.swing.JButton btn_mecanico_modif;
    private javax.swing.JComboBox<String> cb_EstadoAgregarCita;
    private javax.swing.JComboBox<String> cb_EstadoCitaMod;
    private javax.swing.JComboBox<String> cb_NombreClienteModEstado;
    private javax.swing.JComboBox<String> cb_PlacaModEstado;
    private javax.swing.JComboBox<String> cb_asesor_eliminar;
    private javax.swing.JComboBox<String> cb_asesor_modif;
    private javax.swing.JComboBox<String> cb_asesor_modif1;
    private javax.swing.JComboBox<String> cb_mecanico_eliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JDialog jd_ModificarEstado;
    private javax.swing.JDialog jd_admin_asesores;
    private javax.swing.JDialog jd_admin_mecanicos;
    private javax.swing.JDialog jd_administador;
    private javax.swing.JDialog jd_citas;
    private javax.swing.JDialog jd_principal_asesor;
    private com.toedter.calendar.JDateChooser jdc_FechaEntradaCita;
    private com.toedter.calendar.JDateChooser jdc_FechaEntregaCita;
    private javax.swing.JLabel lbl_EliAse;
    private javax.swing.JLabel lbl_Estado;
    private javax.swing.JLabel lbl_EstadoActual;
    private javax.swing.JLabel lbl_FechaEntrada;
    private javax.swing.JLabel lbl_FechaEntrega;
    private javax.swing.JLabel lbl_Fondo;
    private javax.swing.JLabel lbl_ModMec;
    private javax.swing.JLabel lbl_NuevoEstado;
    private javax.swing.JLabel lbl_NumTelMec;
    private javax.swing.JLabel lbl_PapMec;
    private javax.swing.JLabel lbl_Password;
    private javax.swing.JLabel lbl_PlacaCarroCitaMod;
    private javax.swing.JLabel lbl_Recorrido;
    private javax.swing.JLabel lbl_SApMec;
    private javax.swing.JLabel lbl_SNomMec;
    private javax.swing.JLabel lbl_SnomCi;
    private javax.swing.JLabel lbl_agMec;
    private javax.swing.JLabel lbl_agreCit;
    private javax.swing.JLabel lbl_agrgAse;
    private javax.swing.JLabel lbl_asess;
    private javax.swing.JLabel lbl_elmMec;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JLabel lbl_fondoAse;
    private javax.swing.JLabel lbl_fondoCitas;
    private javax.swing.JLabel lbl_fondoMec;
    private javax.swing.JLabel lbl_fondoModEstado;
    private javax.swing.JLabel lbl_idenAse;
    private javax.swing.JLabel lbl_idmec;
    private javax.swing.JLabel lbl_login;
    private javax.swing.JLabel lbl_mecanico;
    private javax.swing.JLabel lbl_modAses;
    private javax.swing.JLabel lbl_modEst;
    private javax.swing.JLabel lbl_nomClie;
    private javax.swing.JLabel lbl_nomClienteCitaMod;
    private javax.swing.JLabel lbl_numTelAse;
    private javax.swing.JLabel lbl_pNom;
    private javax.swing.JLabel lbl_papAse;
    private javax.swing.JLabel lbl_papCi;
    private javax.swing.JLabel lbl_papMec;
    private javax.swing.JLabel lbl_pnomAes;
    private javax.swing.JLabel lbl_sapAses;
    private javax.swing.JLabel lbl_sapci;
    private javax.swing.JLabel lbl_snomAse;
    private javax.swing.JLabel lbl_tipoRep;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JTextField txt_EstadoActualCita;
    private javax.swing.JTextField txt_PApCita;
    private javax.swing.JTextField txt_PNomCita;
    private javax.swing.JTextField txt_PlacaCarro;
    private javax.swing.JTextField txt_RecorridoCita;
    private javax.swing.JTextField txt_SApCita;
    private javax.swing.JTextField txt_SNomCita;
    private javax.swing.JTextField txt_TelefonoCita;
    private javax.swing.JTextField txt_TipoReparacion;
    private javax.swing.JTextField txt_asesores_numtel;
    private javax.swing.JTextField txt_asesores_papellido;
    private javax.swing.JTextField txt_asesores_pnombre;
    private javax.swing.JTextField txt_asesores_sapellido;
    private javax.swing.JTextField txt_asesores_snombre;
    private javax.swing.JTextField txt_idAsesor;
    private javax.swing.JTextField txt_idMecanico;
    private javax.swing.JTextField txt_login_password;
    private javax.swing.JTextField txt_login_user;
    private javax.swing.JTextField txt_mecanico_numtel;
    private javax.swing.JTextField txt_mecanico_papellido;
    private javax.swing.JTextField txt_mecanico_pnombre;
    private javax.swing.JTextField txt_mecanico_sapellido;
    private javax.swing.JTextField txt_mecanico_snombre;
    // End of variables declaration//GEN-END:variables
}//FIn de la clase