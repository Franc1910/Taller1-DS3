package Pantallas;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;

public class JFramePrograma12 extends javax.swing.JFrame {

    public JFramePrograma12() {
        initComponents();
        jFrame1.setBackground(new Color(0,0,0,0));
    }
    
    Taller1.Programa12 programa12 = new Taller1.Programa12();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        rMarca = new javax.swing.JTextField();
        rModelo = new javax.swing.JTextField();
        rTamPant = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnMenu1 = new javax.swing.JButton();
        btnMensaje = new javax.swing.JButton();
        btnTelefono = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        XCerrar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jtfMarca = new javax.swing.JTextField();
        jtfModelo = new javax.swing.JTextField();
        jtfTamPant = new javax.swing.JTextField();
        btnCapturar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jFrame1.setBackground(new java.awt.Color(0, 0, 0));
        jFrame1.setUndecorated(true);
        jFrame1.setSize(new java.awt.Dimension(395, 721));
        jFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rMarca.setEditable(false);
        rMarca.setBackground(new java.awt.Color(255, 255, 255));
        rMarca.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        rMarca.setForeground(new java.awt.Color(0, 0, 0));
        rMarca.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rMarca.setAutoscrolls(false);
        rMarca.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rMarca.setCaretColor(new java.awt.Color(255, 255, 0));
        jFrame1.getContentPane().add(rMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 90, 350, 30));

        rModelo.setEditable(false);
        rModelo.setBackground(new java.awt.Color(255, 255, 255));
        rModelo.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        rModelo.setForeground(new java.awt.Color(0, 0, 0));
        rModelo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rModelo.setAutoscrolls(false);
        rModelo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rModelo.setCaretColor(new java.awt.Color(255, 255, 0));
        jFrame1.getContentPane().add(rModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 115, 350, 30));

        rTamPant.setEditable(false);
        rTamPant.setBackground(new java.awt.Color(255, 255, 255));
        rTamPant.setFont(new java.awt.Font("Lucida Sans", 0, 18)); // NOI18N
        rTamPant.setForeground(new java.awt.Color(0, 0, 0));
        rTamPant.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rTamPant.setAutoscrolls(false);
        rTamPant.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rTamPant.setCaretColor(new java.awt.Color(255, 255, 0));
        jFrame1.getContentPane().add(rTamPant, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 140, 350, 30));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP12/SalirNormal.png"))); // NOI18N
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP12/SalirTocar.png"))); // NOI18N
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP12/SalirPasar.png"))); // NOI18N
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 642, 63, 63));

        btnMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP12/MenuNormal.png"))); // NOI18N
        btnMenu1.setBorder(null);
        btnMenu1.setBorderPainted(false);
        btnMenu1.setContentAreaFilled(false);
        btnMenu1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMenu1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP12/MenuTocar.png"))); // NOI18N
        btnMenu1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP12/MenuPasar.png"))); // NOI18N
        btnMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenu1MouseEntered(evt);
            }
        });
        btnMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenu1ActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(btnMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 561, 65, 65));

        btnMensaje.setBackground(new java.awt.Color(0, 0, 0));
        btnMensaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP12/MensajeNormal.png"))); // NOI18N
        btnMensaje.setBorder(null);
        btnMensaje.setBorderPainted(false);
        btnMensaje.setContentAreaFilled(false);
        btnMensaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMensaje.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP12/MensajeTocar.png"))); // NOI18N
        btnMensaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP12/MensajePasar.png"))); // NOI18N
        btnMensaje.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMensajeMouseEntered(evt);
            }
        });
        btnMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMensajeActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(btnMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 299, 125, 125));

        btnTelefono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP12/TelefonoNormal.png"))); // NOI18N
        btnTelefono.setBorder(null);
        btnTelefono.setBorderPainted(false);
        btnTelefono.setContentAreaFilled(false);
        btnTelefono.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTelefono.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP12/TelefonoTocar.png"))); // NOI18N
        btnTelefono.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP12/TelefonoPasar.png"))); // NOI18N
        btnTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTelefonoMouseEntered(evt);
            }
        });
        btnTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTelefonoActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(btnTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 297, 126, 127));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP12/PantPrograma12_CELL.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(671, 967));
        jFrame1.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 395, 721));

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

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP01/btnMenu.png"))); // NOI18N
        btnMenu.setBorder(null);
        btnMenu.setBorderPainted(false);
        btnMenu.setContentAreaFilled(false);
        btnMenu.setDefaultCapable(false);
        btnMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMenu.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP01/TocarMenu.png"))); // NOI18N
        btnMenu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP01/PasarMenu.png"))); // NOI18N
        btnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenuMouseEntered(evt);
            }
        });
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 55, 46));

        jtfMarca.setBackground(new java.awt.Color(255, 255, 255));
        jtfMarca.setFont(new java.awt.Font("Lucida Sans", 0, 30)); // NOI18N
        jtfMarca.setForeground(new java.awt.Color(0, 0, 0));
        jtfMarca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfMarca.setToolTipText("");
        jtfMarca.setBorder(null);
        jtfMarca.setCaretColor(new java.awt.Color(217, 37, 52));
        jtfMarca.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtfMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMarcaActionPerformed(evt);
            }
        });
        jtfMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfMarcaKeyTyped(evt);
            }
        });
        getContentPane().add(jtfMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 182, 405, 38));

        jtfModelo.setBackground(new java.awt.Color(255, 255, 255));
        jtfModelo.setFont(new java.awt.Font("Lucida Sans", 0, 30)); // NOI18N
        jtfModelo.setForeground(new java.awt.Color(0, 0, 0));
        jtfModelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfModelo.setToolTipText("");
        jtfModelo.setBorder(null);
        jtfModelo.setCaretColor(new java.awt.Color(217, 37, 52));
        jtfModelo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtfModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfModeloActionPerformed(evt);
            }
        });
        jtfModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfModeloKeyTyped(evt);
            }
        });
        getContentPane().add(jtfModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 238, 405, 38));

        jtfTamPant.setBackground(new java.awt.Color(255, 255, 255));
        jtfTamPant.setFont(new java.awt.Font("Lucida Sans", 0, 34)); // NOI18N
        jtfTamPant.setForeground(new java.awt.Color(0, 0, 0));
        jtfTamPant.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfTamPant.setToolTipText("");
        jtfTamPant.setBorder(null);
        jtfTamPant.setCaretColor(new java.awt.Color(217, 37, 52));
        jtfTamPant.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtfTamPant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTamPantActionPerformed(evt);
            }
        });
        jtfTamPant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfTamPantKeyTyped(evt);
            }
        });
        getContentPane().add(jtfTamPant, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 295, 210, 36));

        btnCapturar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP079810/CapturarNormal.png"))); // NOI18N
        btnCapturar.setBorder(null);
        btnCapturar.setBorderPainted(false);
        btnCapturar.setContentAreaFilled(false);
        btnCapturar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCapturar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP079810/CapturarTocar.png"))); // NOI18N
        btnCapturar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP079810/CapturarPasar.png"))); // NOI18N
        btnCapturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapturarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCapturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 353, 318, 75));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP079810/LimpiarNormal.png"))); // NOI18N
        btnLimpiar.setBorder(null);
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setDefaultCapable(false);
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP079810/LimpiarTocar.png"))); // NOI18N
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP079810/LimpiarPasar.png"))); // NOI18N
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseEntered(evt);
            }
        });
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 353, 74, 75));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP12/PantPrograma12.png"))); // NOI18N
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

    private void btnMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseEntered
        Utilidades.establecerTooltip(btnMenu, "Página Principal");
    }//GEN-LAST:event_btnMenuMouseEntered

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        JFramePantPrincipal PantPrincipal = new JFramePantPrincipal();
        Utilidades.cambiarVentana(this, PantPrincipal, null);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void jtfMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMarcaActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfModelo.requestFocus();
    }//GEN-LAST:event_jtfMarcaActionPerformed

    private void jtfMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfMarcaKeyTyped
        Utilidades.ValidarLongitud(evt, jtfMarca, 20);
    }//GEN-LAST:event_jtfMarcaKeyTyped

    private void jtfModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfModeloActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfTamPant.requestFocus();
    }//GEN-LAST:event_jtfModeloActionPerformed

    private void jtfModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfModeloKeyTyped
        Utilidades.ValidarLongitud(evt, jtfModelo, 20);
    }//GEN-LAST:event_jtfModeloKeyTyped

    private void jtfTamPantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTamPantActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfMarca.requestFocus();
    }//GEN-LAST:event_jtfTamPantActionPerformed

    private void jtfTamPantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfTamPantKeyTyped
        Utilidades.validarNumDecimal(evt, jtfTamPant, 1);
        Utilidades.ValidarLongitud(evt, jtfTamPant, 3);
    }//GEN-LAST:event_jtfTamPantKeyTyped

    private void btnCapturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapturarActionPerformed
        try {
            if (!Utilidades.camposCompletos(jtfMarca, jtfModelo, jtfTamPant)) {
                getToolkit().beep();
                Utilidades.mostrarMensaje("Debe ingresar todos los datos solicitados", "Datos Faltantes");
                jtfMarca.requestFocus();
            } else {
                programa12.PedirDatos(jtfMarca.getText(), jtfModelo.getText(), jtfTamPant.getText());
                Utilidades.cambiarVentana(this, jFrame1, null);
                jFrame1.setLocationRelativeTo(null); 


                String marca = programa12.getMarca();
                String modelo = programa12.getModelo();
                double tampant = programa12.getTamanoPantalla();

                rMarca.setText(marca);
                rModelo.setText(modelo);
                rTamPant.setText(Utilidades.DecimalFormato(tampant, 1) + " pulg");
            }
        } catch (HeadlessException e) {
            Utilidades.mostrarMensaje("Ha ocurrido un error con el dato [" + e + "], por favor verificar los datos ingresados", "¡Error!");
            jtfMarca.requestFocus();
        }
    }//GEN-LAST:event_btnCapturarActionPerformed

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        Utilidades.establecerTooltip(btnLimpiar, "Borrar los datos");
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Utilidades.limpiarCampos(jtfMarca, jtfModelo, jtfTamPant);
        Utilidades.limpiarResultados(rMarca, rModelo, rTamPant);
        jtfMarca.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        if (Utilidades.mostrarDialogoConfirmacion("¿Está seguro de que desea salir de la aplicación?"))
            System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenu1ActionPerformed
        JFramePantPrincipal PantPrincipal = new JFramePantPrincipal();
        Utilidades.cambiarVentana(jFrame1, PantPrincipal, null);
    }//GEN-LAST:event_btnMenu1ActionPerformed

    private void btnMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMensajeActionPerformed
        programa12.enviarMensaje();
    }//GEN-LAST:event_btnMensajeActionPerformed

    private void btnTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTelefonoActionPerformed
        programa12.llamar();
    }//GEN-LAST:event_btnTelefonoActionPerformed

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        Utilidades.establecerTooltip(XCerrar, "Cerrar");
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnMenu1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenu1MouseEntered
        Utilidades.establecerTooltip(btnMenu, "Página Principal");
    }//GEN-LAST:event_btnMenu1MouseEntered

    private void btnMensajeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMensajeMouseEntered
        Utilidades.establecerTooltip(btnMenu, "Mensajes");
    }//GEN-LAST:event_btnMensajeMouseEntered

    private void btnTelefonoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTelefonoMouseEntered
        Utilidades.establecerTooltip(btnMenu, "Llamar");
    }//GEN-LAST:event_btnTelefonoMouseEntered

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton XCerrar;
    private javax.swing.JButton btnCapturar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMensaje;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnMenu1;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnTelefono;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JTextField jtfMarca;
    public static javax.swing.JTextField jtfModelo;
    public static javax.swing.JTextField jtfTamPant;
    public static javax.swing.JTextField rMarca;
    public static javax.swing.JTextField rModelo;
    public static javax.swing.JTextField rTamPant;
    // End of variables declaration//GEN-END:variables
}
