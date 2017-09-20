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
        this.setLocationRelativeTo(null);
        this.setTitle("Login");
        
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
        lbl_fondoMec = new javax.swing.JLabel();
        jd_principal_asesor = new javax.swing.JDialog();
        jLabel23 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
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
        jd_admin_asesores.getContentPane().add(btn_asesores_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 315, -1, -1));

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

        lbl_fondoAse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/NaranjaOscuro.jpg"))); // NOI18N
        lbl_fondoAse.setText("jLabel1");
        jd_admin_asesores.getContentPane().add(lbl_fondoAse, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 370));

        jd_admin_mecanicos.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_mecanico_agregar.setText("Agregar");
        jd_admin_mecanicos.getContentPane().add(btn_mecanico_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, -1, -1));

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

        lbl_fondoMec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/NaranjaOscuro.jpg"))); // NOI18N
        jd_admin_mecanicos.getContentPane().add(lbl_fondoMec, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 390));

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
    private javax.swing.JButton btn_Asesores;
    private javax.swing.JButton btn_Mecanicos;
    private javax.swing.JButton btn_asesor_eliminar;
    private javax.swing.JButton btn_asesor_eliminar1;
    private javax.swing.JButton btn_asesor_modif;
    private javax.swing.JButton btn_asesores_agregar;
    private javax.swing.JButton btn_login_ingresar;
    private javax.swing.JButton btn_mecanico_agregar;
    private javax.swing.JButton btn_mecanico_modif;
    private javax.swing.JComboBox<String> cb_asesor_eliminar;
    private javax.swing.JComboBox<String> cb_asesor_modif;
    private javax.swing.JComboBox<String> cb_asesor_modif1;
    private javax.swing.JComboBox<String> cb_mecanico_eliminar;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JDialog jd_admin_asesores;
    private javax.swing.JDialog jd_admin_mecanicos;
    private javax.swing.JDialog jd_administador;
    private javax.swing.JDialog jd_principal_asesor;
    private javax.swing.JLabel lbl_EliAse;
    private javax.swing.JLabel lbl_Fondo;
    private javax.swing.JLabel lbl_ModMec;
    private javax.swing.JLabel lbl_NumTelMec;
    private javax.swing.JLabel lbl_PapMec;
    private javax.swing.JLabel lbl_Password;
    private javax.swing.JLabel lbl_SApMec;
    private javax.swing.JLabel lbl_SNomMec;
    private javax.swing.JLabel lbl_agMec;
    private javax.swing.JLabel lbl_agrgAse;
    private javax.swing.JLabel lbl_asess;
    private javax.swing.JLabel lbl_elmMec;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JLabel lbl_fondoAse;
    private javax.swing.JLabel lbl_fondoMec;
    private javax.swing.JLabel lbl_login;
    private javax.swing.JLabel lbl_mecanico;
    private javax.swing.JLabel lbl_modAses;
    private javax.swing.JLabel lbl_numTelAse;
    private javax.swing.JLabel lbl_papAse;
    private javax.swing.JLabel lbl_papMec;
    private javax.swing.JLabel lbl_pnomAes;
    private javax.swing.JLabel lbl_sapAses;
    private javax.swing.JLabel lbl_snomAse;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JTextField txt_asesores_numtel;
    private javax.swing.JTextField txt_asesores_papellido;
    private javax.swing.JTextField txt_asesores_pnombre;
    private javax.swing.JTextField txt_asesores_sapellido;
    private javax.swing.JTextField txt_asesores_snombre;
    private javax.swing.JTextField txt_login_password;
    private javax.swing.JTextField txt_login_user;
    private javax.swing.JTextField txt_mecanico_numtel;
    private javax.swing.JTextField txt_mecanico_papellido;
    private javax.swing.JTextField txt_mecanico_pnombre;
    private javax.swing.JTextField txt_mecanico_sapellido;
    private javax.swing.JTextField txt_mecanico_snombre;
    // End of variables declaration//GEN-END:variables
}
