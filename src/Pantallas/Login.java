package Pantallas;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        jtfUsuario.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        XCerrar = new javax.swing.JButton();
        jtfUsuario = new javax.swing.JTextField();
        jpfContrasenia = new javax.swing.JPasswordField();
        btnAcceder = new javax.swing.JButton();
        btnOlvContra = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        XCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantPrincipal/BotonX.png"))); // NOI18N
        XCerrar.setBorder(null);
        XCerrar.setBorderPainted(false);
        XCerrar.setContentAreaFilled(false);
        XCerrar.setDefaultCapable(false);
        XCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        XCerrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantPrincipal/PresionarBtnX.png"))); // NOI18N
        XCerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantPrincipal/PasarBtnX.png"))); // NOI18N
        XCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                XCerrarMouseEntered(evt);
            }
        });
        XCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(XCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(621, 0, -1, 46));

        jtfUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jtfUsuario.setFont(new java.awt.Font("Lucida Sans", 0, 40)); // NOI18N
        jtfUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jtfUsuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jtfUsuario.setToolTipText("");
        jtfUsuario.setBorder(null);
        jtfUsuario.setCaretColor(new java.awt.Color(217, 37, 52));
        jtfUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUsuarioActionPerformed(evt);
            }
        });
        jtfUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfUsuarioKeyTyped(evt);
            }
        });
        getContentPane().add(jtfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 190, 568, 56));

        jpfContrasenia.setBackground(new java.awt.Color(255, 255, 255));
        jpfContrasenia.setFont(new java.awt.Font("Lucida Sans", 0, 40)); // NOI18N
        jpfContrasenia.setForeground(new java.awt.Color(0, 0, 0));
        jpfContrasenia.setBorder(null);
        jpfContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpfContraseniaActionPerformed(evt);
            }
        });
        jpfContrasenia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jpfContraseniaKeyTyped(evt);
            }
        });
        getContentPane().add(jpfContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 305, 568, 56));

        btnAcceder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantLogin/AccederNormal.png"))); // NOI18N
        btnAcceder.setBorder(null);
        btnAcceder.setBorderPainted(false);
        btnAcceder.setContentAreaFilled(false);
        btnAcceder.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAcceder.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantLogin/AccederTocar.png"))); // NOI18N
        btnAcceder.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantLogin/AccederPasar.png"))); // NOI18N
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });
        getContentPane().add(btnAcceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 410, 584, 75));

        btnOlvContra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantLogin/ContraseniaNormal.png"))); // NOI18N
        btnOlvContra.setBorder(null);
        btnOlvContra.setBorderPainted(false);
        btnOlvContra.setContentAreaFilled(false);
        btnOlvContra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOlvContra.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantLogin/ContraseniaTocar.png"))); // NOI18N
        btnOlvContra.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantLogin/ContraseniaPasar.png"))); // NOI18N
        btnOlvContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOlvContraActionPerformed(evt);
            }
        });
        getContentPane().add(btnOlvContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 510, 300, 30));

        jLabel2.setFont(new java.awt.Font("Lucida Sans", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(142, 142, 142));
        jLabel2.setText("V-1.01");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantLogin/PantallaLogin.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(671, 967));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void XCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XCerrarMouseEntered
        Utilidades.establecerTooltip(XCerrar, "Cerrar");
    }//GEN-LAST:event_XCerrarMouseEntered

    private void XCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XCerrarActionPerformed
        if (Utilidades.mostrarDialogoConfirmacion("¿Está seguro de que desea salir de la aplicación?"))
        System.exit(0);
    }//GEN-LAST:event_XCerrarActionPerformed

    private void jtfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUsuarioActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jpfContrasenia.requestFocus();
    }//GEN-LAST:event_jtfUsuarioActionPerformed

    private void jtfUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfUsuarioKeyTyped
        Utilidades.ValidarLongitud(evt, jtfUsuario, 10);
    }//GEN-LAST:event_jtfUsuarioKeyTyped

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
        try {           
            final String usuario = "profesor";
           final String contrasenia = "taller1";

            String pass = new String(jpfContrasenia.getPassword());

            if(jtfUsuario.getText().equals(usuario) && pass.equals(contrasenia)) {
                JFramePantPrincipal pantallaprincipal = new JFramePantPrincipal();
                Utilidades.cambiarVentana(this, pantallaprincipal, null);
            } else {
                Utilidades.mostrarMensaje("Contraseña o usuario incorrecto", "¡Error!");
            }            
        } catch (HeadlessException e) {
            Utilidades.mostrarMensaje("Ha ocurrido un error con el dato [" + e + "], por favor verificar los datos ingresados", "¡Error!");
            jtfUsuario.requestFocus();
        }      
    }//GEN-LAST:event_btnAccederActionPerformed

    private void btnOlvContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOlvContraActionPerformed
        Utilidades.mostrarMensaje("Usuario: profesor \nContraseña: taller1", null);
        jtfUsuario.requestFocus();
    }//GEN-LAST:event_btnOlvContraActionPerformed

    private void jpfContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpfContraseniaActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfUsuario.requestFocus();
    }//GEN-LAST:event_jpfContraseniaActionPerformed

    private void jpfContraseniaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpfContraseniaKeyTyped
        Utilidades.ValidarLongitud(evt, jpfContrasenia, 10);
    }//GEN-LAST:event_jpfContraseniaKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton XCerrar;
    private javax.swing.JButton btnAcceder;
    private javax.swing.JButton btnOlvContra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private static javax.swing.JPasswordField jpfContrasenia;
    public static javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
}
