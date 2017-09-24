package base.de.datos.pkg1;

import javax.mail.PasswordAuthentication;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    String To="";
    String Mensaje="";
    Connection myConn = null;
    Statement myStmt = null;
    
    public Login() {
        System.out.println("borrar esto");
        System.out.println("hola");
        try {
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/DB_Taller?useSSL=true", "root", "jordi123");
            myStmt = myConn.createStatement();
            System.out.println("conecta");
        } catch (SQLException e) {
            e.printStackTrace();
        }//Fin del try catch
        System.out.println("");
        initComponents();
        this.setTitle("Login");
        this.setLocationRelativeTo(null);
        System.out.println("");

    }//Fin del constructor general

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_administador = new javax.swing.JDialog();
        panelAdministrador = new com.bolivia.panel.JCPanel();
        btn_Asesores = new javax.swing.JButton();
        btn_Mecanicos = new javax.swing.JButton();
        jd_admin_asesores = new javax.swing.JDialog();
        jCPanel1 = new com.bolivia.panel.JCPanel();
        lbl_asess = new javax.swing.JLabel();
        txt_asesores_pnombre = new javax.swing.JTextField();
        txt_asesores_snombre = new javax.swing.JTextField();
        txt_asesores_papellido = new javax.swing.JTextField();
        txt_asesores_sapellido = new javax.swing.JTextField();
        txt_asesores_numtel = new javax.swing.JTextField();
        txt_idAsesor = new javax.swing.JTextField();
        lbl_agrgAse = new javax.swing.JLabel();
        lbl_modAses = new javax.swing.JLabel();
        lbl_idenAse = new javax.swing.JLabel();
        lbl_snomAse = new javax.swing.JLabel();
        lbl_papAse = new javax.swing.JLabel();
        btn_asesor_eliminar = new javax.swing.JButton();
        lbl_sapAses = new javax.swing.JLabel();
        lbl_pnomAes = new javax.swing.JLabel();
        lbl_numTelAse = new javax.swing.JLabel();
        btn_asesores_agregar = new javax.swing.JButton();
        cb_asesor_modif = new javax.swing.JComboBox<>();
        btn_asesor_modif = new javax.swing.JButton();
        cb_asesor_eliminar = new javax.swing.JComboBox<>();
        lbl_EliAse = new javax.swing.JLabel();
        jd_admin_mecanicos = new javax.swing.JDialog();
        jCPanel2 = new com.bolivia.panel.JCPanel();
        cb_mecanico_eliminar = new javax.swing.JComboBox<>();
        lbl_SNomMec = new javax.swing.JLabel();
        lbl_agMec = new javax.swing.JLabel();
        cb_asesor_modif1 = new javax.swing.JComboBox<>();
        txt_mecanico_sapellido = new javax.swing.JTextField();
        lbl_SApMec = new javax.swing.JLabel();
        lbl_NumTelMec = new javax.swing.JLabel();
        txt_mecanico_numtel = new javax.swing.JTextField();
        lbl_idmec = new javax.swing.JLabel();
        txt_idMecanico = new javax.swing.JTextField();
        lbl_elmMec = new javax.swing.JLabel();
        btn_asesor_eliminar1 = new javax.swing.JButton();
        btn_mecanico_agregar = new javax.swing.JButton();
        lbl_ModMec = new javax.swing.JLabel();
        btn_mecanico_modif = new javax.swing.JButton();
        lbl_mecanico = new javax.swing.JLabel();
        lbl_PapMec = new javax.swing.JLabel();
        txt_mecanico_papellido = new javax.swing.JTextField();
        txt_mecanico_snombre = new javax.swing.JTextField();
        txt_mecanico_pnombre = new javax.swing.JTextField();
        lbl_papMec = new javax.swing.JLabel();
        jd_principal_asesor = new javax.swing.JDialog();
        jd_citas = new javax.swing.JDialog();
        jCPanel3 = new com.bolivia.panel.JCPanel();
        lbl_FechaEntrega = new javax.swing.JLabel();
        lbl_FechaEntrada = new javax.swing.JLabel();
        btn_AgregarCita = new javax.swing.JButton();
        txt_RecorridoCita = new javax.swing.JTextField();
        lbl_Recorrido = new javax.swing.JLabel();
        lbl_SnomCi = new javax.swing.JLabel();
        lbl_papCi = new javax.swing.JLabel();
        txt_SNomCita = new javax.swing.JTextField();
        txt_PApCita = new javax.swing.JTextField();
        lbl_agreCit = new javax.swing.JLabel();
        lbl_nomClie = new javax.swing.JLabel();
        btn_ModificarEstadoCita = new javax.swing.JButton();
        lbl_tipoRep = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_PlacaCarro = new javax.swing.JTextField();
        txt_TipoReparacion = new javax.swing.JTextField();
        txt_TelefonoCita = new javax.swing.JTextField();
        lbl_Estado = new javax.swing.JLabel();
        cb_EstadoAgregarCita = new javax.swing.JComboBox<>();
        lbl_pNom = new javax.swing.JLabel();
        lbl_sapci = new javax.swing.JLabel();
        txt_PNomCita = new javax.swing.JTextField();
        txt_SApCita = new javax.swing.JTextField();
        jxd_FechaEntradaCita = new org.jdesktop.swingx.JXDatePicker();
        jxd_FechaEntregaCita = new org.jdesktop.swingx.JXDatePicker();
        lbl_FechaEntrada = new javax.swing.JLabel();
        lbl_FechaEntrega = new javax.swing.JLabel();
        btn_AgregarCita = new javax.swing.JButton();
        btn_ModificarEstadoCita = new javax.swing.JButton();
        lbl_fondoCitas = new javax.swing.JLabel();
        jd_ModificarEstado = new javax.swing.JDialog();
        jCPanel4 = new com.bolivia.panel.JCPanel();
        cb_EstadoCitaMod = new javax.swing.JComboBox<>();
        cb_PlacaModEstado = new javax.swing.JComboBox<>();
        lbl_PlacaCarroCitaMod = new javax.swing.JLabel();
        lbl_NuevoEstado = new javax.swing.JLabel();
        btn_ModificarEstado = new javax.swing.JButton();
        txt_EstadoActualCita = new javax.swing.JTextField();
        cb_NombreClienteModEstado = new javax.swing.JComboBox<>();
        lbl_modEst = new javax.swing.JLabel();
        lbl_nomClienteCitaMod = new javax.swing.JLabel();
        lbl_EstadoActual = new javax.swing.JLabel();
        panelLogin = new com.bolivia.panel.JCPanel();
        lbl_login = new javax.swing.JLabel();
        lbl_user = new javax.swing.JLabel();
        lbl_Password = new javax.swing.JLabel();
        txt_login_user = new javax.swing.JTextField();
        txt_login_password = new javax.swing.JTextField();
        btn_login_ingresar = new javax.swing.JButton();

        panelAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/NaranjaOscuro.jpg"))); // NOI18N
        panelAdministrador.setVisibleLogo(false);

        btn_Asesores.setText("ASESORES");
        btn_Asesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AsesoresActionPerformed(evt);
            }
        });

        btn_Mecanicos.setText("MECANICOS");
        btn_Mecanicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MecanicosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAdministradorLayout = new javax.swing.GroupLayout(panelAdministrador);
        panelAdministrador.setLayout(panelAdministradorLayout);
        panelAdministradorLayout.setHorizontalGroup(
            panelAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdministradorLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(panelAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_Mecanicos)
                    .addComponent(btn_Asesores, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        panelAdministradorLayout.setVerticalGroup(
            panelAdministradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAdministradorLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(btn_Asesores)
                .addGap(46, 46, 46)
                .addComponent(btn_Mecanicos)
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout jd_administadorLayout = new javax.swing.GroupLayout(jd_administador.getContentPane());
        jd_administador.getContentPane().setLayout(jd_administadorLayout);
        jd_administadorLayout.setHorizontalGroup(
            jd_administadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
        );
        jd_administadorLayout.setVerticalGroup(
            jd_administadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAdministrador, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );

        jCPanel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/NaranjaOscuro.jpg"))); // NOI18N
        jCPanel1.setVisibleLogo(false);

        lbl_asess.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_asess.setForeground(new java.awt.Color(255, 255, 255));
        lbl_asess.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_asess.setText("Asesores");

        lbl_agrgAse.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_agrgAse.setForeground(new java.awt.Color(255, 255, 255));
        lbl_agrgAse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_agrgAse.setText("Agregar Asesor");

        lbl_modAses.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_modAses.setForeground(new java.awt.Color(255, 255, 255));
        lbl_modAses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_modAses.setText("Modificar Asesor");

        lbl_idenAse.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_idenAse.setForeground(new java.awt.Color(255, 255, 255));
        lbl_idenAse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_idenAse.setText("Identificador");

        lbl_snomAse.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_snomAse.setForeground(new java.awt.Color(255, 255, 255));
        lbl_snomAse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_snomAse.setText("Segundo Nombre");

        lbl_papAse.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_papAse.setForeground(new java.awt.Color(255, 255, 255));
        lbl_papAse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_papAse.setText("Primer Apellido");

        btn_asesor_eliminar.setText("Eliminar");

        lbl_sapAses.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_sapAses.setForeground(new java.awt.Color(255, 255, 255));
        lbl_sapAses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_sapAses.setText("Segundo Apellido");

        lbl_pnomAes.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_pnomAes.setForeground(new java.awt.Color(255, 255, 255));
        lbl_pnomAes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_pnomAes.setText("Primer Nombre");

        lbl_numTelAse.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_numTelAse.setForeground(new java.awt.Color(255, 255, 255));
        lbl_numTelAse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_numTelAse.setText("Numero de Telefono");

        btn_asesores_agregar.setText("Agregar");

        btn_asesor_modif.setText("Modificar");

        lbl_EliAse.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_EliAse.setForeground(new java.awt.Color(255, 255, 255));
        lbl_EliAse.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_EliAse.setText("Eliminar Asesor");

        javax.swing.GroupLayout jCPanel1Layout = new javax.swing.GroupLayout(jCPanel1);
        jCPanel1.setLayout(jCPanel1Layout);
        jCPanel1Layout.setHorizontalGroup(
            jCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jCPanel1Layout.createSequentialGroup()
                        .addGroup(jCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_papAse, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_asesores_papellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jCPanel1Layout.createSequentialGroup()
                                .addGroup(jCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jCPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_numTelAse)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_asesores_numtel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jCPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_snomAse, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_asesores_snombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jCPanel1Layout.createSequentialGroup()
                                        .addComponent(lbl_idenAse, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txt_idAsesor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jCPanel1Layout.createSequentialGroup()
                                .addGap(253, 253, 253)
                                .addComponent(btn_asesor_eliminar))
                            .addGroup(jCPanel1Layout.createSequentialGroup()
                                .addGap(242, 242, 242)
                                .addComponent(lbl_modAses))
                            .addGroup(jCPanel1Layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(btn_asesor_modif)))
                        .addGap(303, 303, 303))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jCPanel1Layout.createSequentialGroup()
                        .addGroup(jCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jCPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_pnomAes, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_asesores_pnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jCPanel1Layout.createSequentialGroup()
                                .addComponent(lbl_sapAses, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_asesores_sapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(185, 185, 185)
                        .addGroup(jCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_asesor_modif, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_asesor_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jCPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(lbl_agrgAse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_EliAse)
                        .addGap(310, 310, 310))))
            .addGroup(jCPanel1Layout.createSequentialGroup()
                .addGroup(jCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jCPanel1Layout.createSequentialGroup()
                        .addGap(447, 447, 447)
                        .addComponent(lbl_asess))
                    .addGroup(jCPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(btn_asesores_agregar)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jCPanel1Layout.setVerticalGroup(
            jCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_asess)
                .addGroup(jCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jCPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_pnomAes)
                            .addComponent(txt_asesores_pnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jCPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_agrgAse)
                            .addComponent(lbl_EliAse))
                        .addGap(18, 18, 18)
                        .addComponent(cb_asesor_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jCPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_snomAse)
                            .addComponent(txt_asesores_snombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_papAse)
                            .addComponent(txt_asesores_papellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_sapAses)
                            .addComponent(txt_asesores_sapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                        .addGroup(jCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_idenAse)
                            .addComponent(txt_idAsesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jCPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_numTelAse)
                            .addComponent(txt_asesores_numtel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_asesores_agregar)
                        .addContainerGap(35, Short.MAX_VALUE))
                    .addGroup(jCPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btn_asesor_eliminar)
                        .addGap(18, 18, 18)
                        .addComponent(lbl_modAses)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_asesor_modif, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_asesor_modif)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jd_admin_asesoresLayout = new javax.swing.GroupLayout(jd_admin_asesores.getContentPane());
        jd_admin_asesores.getContentPane().setLayout(jd_admin_asesoresLayout);
        jd_admin_asesoresLayout.setHorizontalGroup(
            jd_admin_asesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 958, Short.MAX_VALUE)
        );
        jd_admin_asesoresLayout.setVerticalGroup(
            jd_admin_asesoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jCPanel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/NaranjaOscuro.jpg"))); // NOI18N
        jCPanel2.setVisibleLogo(false);

        lbl_SNomMec.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_SNomMec.setForeground(new java.awt.Color(255, 255, 255));
        lbl_SNomMec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_SNomMec.setText("Segundo Nombre");

        lbl_agMec.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_agMec.setForeground(new java.awt.Color(255, 255, 255));
        lbl_agMec.setText("Agregar Mecánico");

        lbl_SApMec.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_SApMec.setForeground(new java.awt.Color(255, 255, 255));
        lbl_SApMec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_SApMec.setText("Segundo Apellido");

        lbl_NumTelMec.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_NumTelMec.setForeground(new java.awt.Color(255, 255, 255));
        lbl_NumTelMec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_NumTelMec.setText("Numero de Telefono");

        lbl_idmec.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_idmec.setForeground(new java.awt.Color(255, 255, 255));
        lbl_idmec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_idmec.setText("Identificador");

        lbl_elmMec.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_elmMec.setForeground(new java.awt.Color(255, 255, 255));
        lbl_elmMec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_elmMec.setText("Eliminar Mecánico");

        btn_asesor_eliminar1.setText("Eliminar");

        btn_mecanico_agregar.setText("Agregar");

        lbl_ModMec.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_ModMec.setForeground(new java.awt.Color(255, 255, 255));
        lbl_ModMec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_ModMec.setText("Modificar Mecánico");

        btn_mecanico_modif.setText("Modificar");

        lbl_mecanico.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_mecanico.setForeground(new java.awt.Color(255, 255, 255));
        lbl_mecanico.setText("Mecánicos");

        lbl_PapMec.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_PapMec.setForeground(new java.awt.Color(255, 255, 255));
        lbl_PapMec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_PapMec.setText("Primer Apellido");

        lbl_papMec.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_papMec.setForeground(new java.awt.Color(255, 255, 255));
        lbl_papMec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_papMec.setText("Primer Nombre");

        javax.swing.GroupLayout jCPanel2Layout = new javax.swing.GroupLayout(jCPanel2);
        jCPanel2.setLayout(jCPanel2Layout);
        jCPanel2Layout.setHorizontalGroup(
            jCPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jCPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jCPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jCPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_mecanico_modif)
                            .addComponent(lbl_elmMec))
                        .addGap(44, 44, 44))
                    .addGroup(jCPanel2Layout.createSequentialGroup()
                        .addGroup(jCPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jCPanel2Layout.createSequentialGroup()
                                .addGap(494, 494, 494)
                                .addComponent(cb_mecanico_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jCPanel2Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(btn_mecanico_agregar)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCPanel2Layout.createSequentialGroup()
                        .addGroup(jCPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jCPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jCPanel2Layout.createSequentialGroup()
                                    .addComponent(lbl_SNomMec, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_mecanico_snombre, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jCPanel2Layout.createSequentialGroup()
                                    .addComponent(lbl_papMec, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txt_mecanico_pnombre)))
                            .addGroup(jCPanel2Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(lbl_agMec)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_ModMec)
                        .addGap(42, 42, 42))
                    .addGroup(jCPanel2Layout.createSequentialGroup()
                        .addGroup(jCPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jCPanel2Layout.createSequentialGroup()
                                .addGroup(jCPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_NumTelMec)
                                    .addGroup(jCPanel2Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(lbl_idmec)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jCPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_mecanico_numtel, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                    .addComponent(txt_idMecanico)))
                            .addGroup(jCPanel2Layout.createSequentialGroup()
                                .addComponent(lbl_PapMec, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_mecanico_papellido, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCPanel2Layout.createSequentialGroup()
                                .addComponent(lbl_SApMec, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_mecanico_sapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jCPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_asesor_modif1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCPanel2Layout.createSequentialGroup()
                                .addComponent(btn_asesor_eliminar1)
                                .addGap(62, 62, 62))))))
            .addGroup(jCPanel2Layout.createSequentialGroup()
                .addGap(425, 425, 425)
                .addComponent(lbl_mecanico)
                .addContainerGap(367, Short.MAX_VALUE))
        );
        jCPanel2Layout.setVerticalGroup(
            jCPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCPanel2Layout.createSequentialGroup()
                .addGroup(jCPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jCPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lbl_mecanico)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_agMec)
                        .addGap(6, 6, 6)))
                .addGroup(jCPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jCPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jCPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_papMec)
                            .addComponent(txt_mecanico_pnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_ModMec)
                        .addGap(18, 18, 18)
                        .addComponent(cb_asesor_modif1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jCPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jCPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_SNomMec)
                        .addComponent(txt_mecanico_snombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jCPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btn_mecanico_modif)))
                .addGap(14, 14, 14)
                .addGroup(jCPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_PapMec)
                    .addComponent(txt_mecanico_papellido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jCPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jCPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(jCPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_SApMec)
                            .addComponent(txt_mecanico_sapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jCPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_NumTelMec)
                            .addComponent(txt_mecanico_numtel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jCPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_idmec)
                            .addComponent(txt_idMecanico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_asesor_eliminar1))
                        .addGap(24, 24, 24)
                        .addComponent(btn_mecanico_agregar)
                        .addContainerGap())
                    .addGroup(jCPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lbl_elmMec)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_mecanico_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jd_admin_mecanicosLayout = new javax.swing.GroupLayout(jd_admin_mecanicos.getContentPane());
        jd_admin_mecanicos.getContentPane().setLayout(jd_admin_mecanicosLayout);
        jd_admin_mecanicosLayout.setHorizontalGroup(
            jd_admin_mecanicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_admin_mecanicosLayout.createSequentialGroup()
                .addComponent(jCPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 878, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        jd_admin_mecanicosLayout.setVerticalGroup(
            jd_admin_mecanicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
        );

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

        jCPanel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/NaranjaOscuro.jpg"))); // NOI18N
        jCPanel3.setVisibleLogo(false);

        lbl_FechaEntrega.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_FechaEntrega.setForeground(new java.awt.Color(255, 255, 255));
        lbl_FechaEntrega.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_FechaEntrega.setText("Fecha de Entrega");

        lbl_FechaEntrada.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_FechaEntrada.setForeground(new java.awt.Color(255, 255, 255));
        lbl_FechaEntrada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_FechaEntrada.setText("Fecha de Entrada");

        btn_AgregarCita.setText("Agregar Cita");

        lbl_Recorrido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_Recorrido.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Recorrido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Recorrido.setText("Recorrido");

        lbl_SnomCi.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_SnomCi.setForeground(new java.awt.Color(255, 255, 255));
        lbl_SnomCi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_SnomCi.setText("Segundo Nombre");

        lbl_papCi.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_papCi.setForeground(new java.awt.Color(255, 255, 255));
        lbl_papCi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_papCi.setText("Primer Apellido");
        jd_citas.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_agreCit.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_agreCit.setForeground(new java.awt.Color(255, 255, 255));
        lbl_agreCit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_agreCit.setText("Citas");

        lbl_nomClie.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_nomClie.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nomClie.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_nomClie.setText("Placa del Carro");

        btn_ModificarEstadoCita.setText("Modificar Estado");
        btn_ModificarEstadoCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarEstadoCitaActionPerformed(evt);
            }
        });

        lbl_tipoRep.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_tipoRep.setForeground(new java.awt.Color(255, 255, 255));
        lbl_tipoRep.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_tipoRep.setText("Tipo Reparación");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Teléfono");

        lbl_Estado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_Estado.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Estado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Estado.setText("Estado");

        cb_EstadoAgregarCita.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cb_EstadoAgregarCita.setForeground(new java.awt.Color(255, 255, 255));
        cb_EstadoAgregarCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NO INGRESADO", "INGRESADO", "EN REPARACIÓN", "PENDIENTE DE REPUESTOS", "LISTO", "AUTO RETIRADO", "CANCELADA" }));

        lbl_pNom.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_pNom.setForeground(new java.awt.Color(255, 255, 255));
        lbl_pNom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_pNom.setText("Primer Nombre");

        lbl_sapci.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_sapci.setForeground(new java.awt.Color(255, 255, 255));
        lbl_sapci.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_sapci.setText("Segundo Apellido");

        lbl_FechaEntrada.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_FechaEntrada.setForeground(new java.awt.Color(255, 255, 255));
        lbl_FechaEntrada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_FechaEntrada.setText("Fecha de Entrada");
        jd_citas.getContentPane().add(lbl_FechaEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, -1));

        lbl_FechaEntrega.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_FechaEntrega.setForeground(new java.awt.Color(255, 255, 255));
        lbl_FechaEntrega.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_FechaEntrega.setText("Fecha de Entrega");
        jd_citas.getContentPane().add(lbl_FechaEntrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, -1, -1));


        javax.swing.GroupLayout jCPanel3Layout = new javax.swing.GroupLayout(jCPanel3);
        jCPanel3.setLayout(jCPanel3Layout);
        jCPanel3Layout.setHorizontalGroup(
            jCPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jCPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jCPanel3Layout.createSequentialGroup()
                        .addGroup(jCPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbl_papCi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_sapci, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_agreCit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(333, 333, 333))
                    .addGroup(jCPanel3Layout.createSequentialGroup()
                        .addGroup(jCPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_SnomCi, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jCPanel3Layout.createSequentialGroup()
                                .addGroup(jCPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jCPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lbl_Recorrido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbl_pNom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbl_Estado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jCPanel3Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(lbl_tipoRep, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(22, 22, 22)
                                .addGroup(jCPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jCPanel3Layout.createSequentialGroup()
                                        .addComponent(txt_PNomCita, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addComponent(lbl_nomClie)
                                        .addGap(26, 26, 26)
                                        .addComponent(txt_PlacaCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jCPanel3Layout.createSequentialGroup()
                                        .addComponent(txt_SNomCita, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(127, 127, 127)
                                        .addComponent(lbl_FechaEntrada))
                                    .addGroup(jCPanel3Layout.createSequentialGroup()
                                        .addComponent(txt_SApCita, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(136, 136, 136)
                                        .addComponent(lbl_FechaEntrega))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCPanel3Layout.createSequentialGroup()
                                        .addGroup(jCPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jCPanel3Layout.createSequentialGroup()
                                                .addComponent(txt_RecorridoCita, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(jCPanel3Layout.createSequentialGroup()
                                                .addComponent(txt_PApCita, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jxd_FechaEntradaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jCPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jCPanel3Layout.createSequentialGroup()
                                                    .addGroup(jCPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(cb_EstadoAgregarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txt_TelefonoCita, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txt_TipoReparacion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(127, 127, 127)
                                                    .addGroup(jCPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btn_AgregarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jxd_FechaEntregaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(jCPanel3Layout.createSequentialGroup()
                                                    .addComponent(btn_ModificarEstadoCita)
                                                    .addGap(58, 58, 58))))
                                        .addGap(56, 56, 56)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jCPanel3Layout.setVerticalGroup(
            jCPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCPanel3Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(lbl_agreCit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jCPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jCPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jCPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jCPanel3Layout.createSequentialGroup()
                                .addGroup(jCPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_pNom)
                                    .addComponent(txt_PNomCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_nomClie)
                                    .addComponent(txt_PlacaCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(jCPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbl_SnomCi)
                                    .addComponent(txt_SNomCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_FechaEntrada))
                                .addGap(54, 54, 54))
                            .addGroup(jCPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbl_papCi, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_PApCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jxd_FechaEntradaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(jCPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_sapci)
                            .addComponent(txt_SApCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_FechaEntrega))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                        .addGroup(jCPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_tipoRep)
                            .addComponent(txt_TipoReparacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jxd_FechaEntregaCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jCPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jCPanel3Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(btn_AgregarCita)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCPanel3Layout.createSequentialGroup()
                                .addGroup(jCPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_TelefonoCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(33, 33, 33)))
                        .addComponent(lbl_Estado))
                    .addGroup(jCPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cb_EstadoAgregarCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jCPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Recorrido)
                    .addComponent(txt_RecorridoCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ModificarEstadoCita))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout jd_citasLayout = new javax.swing.GroupLayout(jd_citas.getContentPane());
        jd_citas.getContentPane().setLayout(jd_citasLayout);
        jd_citasLayout.setHorizontalGroup(
            jd_citasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jd_citasLayout.setVerticalGroup(
            jd_citasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jCPanel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/ColorAzul.jpg"))); // NOI18N
        jCPanel4.setVisibleLogo(false);

        lbl_PlacaCarroCitaMod.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_PlacaCarroCitaMod.setForeground(new java.awt.Color(255, 255, 255));
        lbl_PlacaCarroCitaMod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_PlacaCarroCitaMod.setText("Placa del Carro");

        lbl_NuevoEstado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_NuevoEstado.setForeground(new java.awt.Color(255, 255, 255));
        lbl_NuevoEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_NuevoEstado.setText("Nuevo Estado");

        btn_ModificarEstado.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        btn_ModificarEstado.setForeground(new java.awt.Color(0, 0, 0));
        btn_ModificarEstado.setText("Modificar");

        txt_EstadoActualCita.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_EstadoActualCita.setEnabled(false);

        lbl_modEst.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_modEst.setForeground(new java.awt.Color(0, 0, 0));
        lbl_modEst.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_modEst.setText("Modificar Estado de Cita");

        lbl_nomClienteCitaMod.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_nomClienteCitaMod.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nomClienteCitaMod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_nomClienteCitaMod.setText("Nombre del Cliente");

        lbl_EstadoActual.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        lbl_EstadoActual.setForeground(new java.awt.Color(255, 255, 255));
        lbl_EstadoActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_EstadoActual.setText("Estado Actual");

        javax.swing.GroupLayout jCPanel4Layout = new javax.swing.GroupLayout(jCPanel4);
        jCPanel4.setLayout(jCPanel4Layout);
        jCPanel4Layout.setHorizontalGroup(
            jCPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jCPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jCPanel4Layout.createSequentialGroup()
                        .addComponent(lbl_nomClienteCitaMod)
                        .addGap(18, 18, 18)
                        .addComponent(cb_NombreClienteModEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jCPanel4Layout.createSequentialGroup()
                        .addComponent(lbl_PlacaCarroCitaMod, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cb_PlacaModEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jCPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jCPanel4Layout.createSequentialGroup()
                            .addComponent(lbl_NuevoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(cb_EstadoCitaMod, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCPanel4Layout.createSequentialGroup()
                            .addComponent(lbl_EstadoActual, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txt_EstadoActualCita))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btn_ModificarEstado)
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jCPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_modEst)
                .addGap(168, 168, 168))
        );
        jCPanel4Layout.setVerticalGroup(
            jCPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jCPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbl_modEst)
                .addGap(34, 34, 34)
                .addGroup(jCPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_PlacaCarroCitaMod)
                    .addComponent(cb_PlacaModEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jCPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jCPanel4Layout.createSequentialGroup()
                        .addGroup(jCPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_NuevoEstado)
                            .addComponent(cb_EstadoCitaMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jCPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_EstadoActualCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_EstadoActual))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addGroup(jCPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_nomClienteCitaMod)
                            .addComponent(cb_NombreClienteModEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))
                    .addGroup(jCPanel4Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btn_ModificarEstado)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

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
        btn_ModificarEstado.setText("Modificar");
        jd_ModificarEstado.getContentPane().add(btn_ModificarEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, -1, -1));

        javax.swing.GroupLayout jd_ModificarEstadoLayout = new javax.swing.GroupLayout(jd_ModificarEstado.getContentPane());
        jd_ModificarEstado.getContentPane().setLayout(jd_ModificarEstadoLayout);
        jd_ModificarEstadoLayout.setHorizontalGroup(
            jd_ModificarEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jd_ModificarEstadoLayout.setVerticalGroup(
            jd_ModificarEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jCPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/ColorAzul.jpg"))); // NOI18N
        panelLogin.setVisibleLogo(false);

        lbl_login.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lbl_login.setForeground(new java.awt.Color(255, 255, 255));
        lbl_login.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_login.setText("LOGIN");

        lbl_user.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_user.setForeground(new java.awt.Color(255, 255, 255));
        lbl_user.setText("USER");

        lbl_Password.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lbl_Password.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Password.setText("PASSWORD");

        btn_login_ingresar.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btn_login_ingresar.setText("INGRESAR");
        btn_login_ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_login_ingresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_login, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(245, 245, 245))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(lbl_Password)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_login_password, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(lbl_user)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_login_user, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(179, 179, 179))
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(btn_login_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbl_login, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_user)
                    .addComponent(txt_login_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_Password)
                    .addComponent(txt_login_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(btn_login_ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
        );

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
    public void SendMail() {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {                    
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication("jordi.mairena@gmail.com","iexterminator159");
                    }
                });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("jordi.mairena@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,InternetAddress.parse(To));
            message.setSubject("Informe Sobre la cita");
            message.setText(Mensaje);

            Transport.send(message);
            JOptionPane.showMessageDialog(this, "Su mensaje ha sido enviado");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
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
    private com.bolivia.panel.JCPanel jCPanel1;
    private com.bolivia.panel.JCPanel jCPanel2;
    private com.bolivia.panel.JCPanel jCPanel3;
    private com.bolivia.panel.JCPanel jCPanel4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JDialog jd_ModificarEstado;
    private javax.swing.JDialog jd_admin_asesores;
    private javax.swing.JDialog jd_admin_mecanicos;
    private javax.swing.JDialog jd_administador;
    private javax.swing.JDialog jd_citas;
    private javax.swing.JDialog jd_principal_asesor;
    private org.jdesktop.swingx.JXDatePicker jxd_FechaEntradaCita;
    private org.jdesktop.swingx.JXDatePicker jxd_FechaEntregaCita;
    private javax.swing.JLabel lbl_EliAse;
    private javax.swing.JLabel lbl_Estado;
    private javax.swing.JLabel lbl_EstadoActual;
    private javax.swing.JLabel lbl_FechaEntrada;
    private javax.swing.JLabel lbl_FechaEntrega;
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
    private com.bolivia.panel.JCPanel panelAdministrador;
    private com.bolivia.panel.JCPanel panelLogin;
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