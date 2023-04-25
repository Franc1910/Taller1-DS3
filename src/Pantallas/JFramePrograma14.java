package Pantallas;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;

public class JFramePrograma14 extends javax.swing.JFrame {

    public JFramePrograma14() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        XCerrar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jtfTitulo = new javax.swing.JTextField();
        jtfDirector = new javax.swing.JTextField();
        jtfDuracion = new javax.swing.JTextField();
        btnCapturar = new javax.swing.JButton();
        rTitulo = new javax.swing.JTextField();
        rDirector = new javax.swing.JTextField();
        rDuracion = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
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

        jtfTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jtfTitulo.setFont(new java.awt.Font("Lucida Sans", 0, 30)); // NOI18N
        jtfTitulo.setForeground(new java.awt.Color(0, 0, 0));
        jtfTitulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfTitulo.setToolTipText("");
        jtfTitulo.setBorder(null);
        jtfTitulo.setCaretColor(new java.awt.Color(217, 37, 52));
        jtfTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtfTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfTituloActionPerformed(evt);
            }
        });
        jtfTitulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfTituloKeyTyped(evt);
            }
        });
        getContentPane().add(jtfTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 182, 405, 38));

        jtfDirector.setBackground(new java.awt.Color(255, 255, 255));
        jtfDirector.setFont(new java.awt.Font("Lucida Sans", 0, 30)); // NOI18N
        jtfDirector.setForeground(new java.awt.Color(0, 0, 0));
        jtfDirector.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfDirector.setToolTipText("");
        jtfDirector.setBorder(null);
        jtfDirector.setCaretColor(new java.awt.Color(217, 37, 52));
        jtfDirector.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtfDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDirectorActionPerformed(evt);
            }
        });
        jtfDirector.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfDirectorKeyTyped(evt);
            }
        });
        getContentPane().add(jtfDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 239, 405, 38));

        jtfDuracion.setBackground(new java.awt.Color(255, 255, 255));
        jtfDuracion.setFont(new java.awt.Font("Lucida Sans", 0, 30)); // NOI18N
        jtfDuracion.setForeground(new java.awt.Color(0, 0, 0));
        jtfDuracion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfDuracion.setToolTipText("");
        jtfDuracion.setBorder(null);
        jtfDuracion.setCaretColor(new java.awt.Color(217, 37, 52));
        jtfDuracion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtfDuracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDuracionActionPerformed(evt);
            }
        });
        jtfDuracion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfDuracionKeyTyped(evt);
            }
        });
        getContentPane().add(jtfDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 298, 118, 36));

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
        getContentPane().add(btnCapturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 352, 318, 75));

        rTitulo.setEditable(false);
        rTitulo.setBackground(new java.awt.Color(255, 255, 255));
        rTitulo.setFont(new java.awt.Font("Lucida Sans", 0, 34)); // NOI18N
        rTitulo.setForeground(new java.awt.Color(0, 0, 0));
        rTitulo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rTitulo.setAutoscrolls(false);
        rTitulo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rTitulo.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(rTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 463, 440, 44));

        rDirector.setEditable(false);
        rDirector.setBackground(new java.awt.Color(255, 255, 255));
        rDirector.setFont(new java.awt.Font("Lucida Sans", 0, 34)); // NOI18N
        rDirector.setForeground(new java.awt.Color(0, 0, 0));
        rDirector.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rDirector.setAutoscrolls(false);
        rDirector.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rDirector.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(rDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 516, 400, 44));

        rDuracion.setEditable(false);
        rDuracion.setBackground(new java.awt.Color(255, 255, 255));
        rDuracion.setFont(new java.awt.Font("Lucida Sans", 0, 34)); // NOI18N
        rDuracion.setForeground(new java.awt.Color(0, 0, 0));
        rDuracion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rDuracion.setAutoscrolls(false);
        rDuracion.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rDuracion.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(rDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 573, 320, 44));

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
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 563, 74, 75));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP079810/PantPrograma14.png"))); // NOI18N
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

    private void jtfTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfTituloActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfDirector.requestFocus();
    }//GEN-LAST:event_jtfTituloActionPerformed

    private void jtfTituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfTituloKeyTyped
        Utilidades.ValidarLongitud(evt, jtfTitulo, 20);
    }//GEN-LAST:event_jtfTituloKeyTyped

    private void jtfDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDirectorActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfDuracion.requestFocus();
    }//GEN-LAST:event_jtfDirectorActionPerformed

    private void jtfDirectorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDirectorKeyTyped
        Utilidades.ValidarLongitud(evt, jtfDirector, 20);
    }//GEN-LAST:event_jtfDirectorKeyTyped

    private void jtfDuracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDuracionActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfTitulo.requestFocus();
    }//GEN-LAST:event_jtfDuracionActionPerformed

    private void jtfDuracionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDuracionKeyTyped
        Utilidades.ValidarNumero(evt);
        Utilidades.ValidarLongitud(evt, jtfDuracion, 3);
    }//GEN-LAST:event_jtfDuracionKeyTyped

    private void btnCapturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapturarActionPerformed
        Taller1.Programa14 programa14 = new Taller1.Programa14();

        try {
            if (!Utilidades.camposCompletos(jtfTitulo, jtfDirector, jtfDuracion)) {
                getToolkit().beep();
                Utilidades.mostrarMensaje("Debe ingresar todos los datos solicitados", "Datos Faltantes");
                jtfTitulo.requestFocus();
            } else {
                programa14.PedirDatos(jtfTitulo.getText(), jtfDirector.getText(), jtfDuracion.getText());

                String titulo = programa14.getTitulo();
                String director = programa14.getDirector();
                int duracion = programa14.getDuracion();

                rTitulo.setText(titulo);
                rDirector.setText(director);
                rDuracion.setText(String.valueOf(duracion) + " min");
            }
        } catch (HeadlessException e) {
            Utilidades.mostrarMensaje("Ha ocurrido un error con el dato [" + e + "], por favor verificar los datos ingresados", "¡Error!");
            jtfTitulo.requestFocus();
        }
    }//GEN-LAST:event_btnCapturarActionPerformed

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        Utilidades.establecerTooltip(btnLimpiar, "Borrar los datos");
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Utilidades.limpiarCampos(jtfTitulo, jtfDirector, jtfDuracion);
        Utilidades.limpiarResultados(rTitulo, rDirector, rDuracion);
        jtfTitulo.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton XCerrar;
    private javax.swing.JButton btnCapturar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JTextField jtfDirector;
    public static javax.swing.JTextField jtfDuracion;
    public static javax.swing.JTextField jtfTitulo;
    public static javax.swing.JTextField rDirector;
    public static javax.swing.JTextField rDuracion;
    public static javax.swing.JTextField rTitulo;
    // End of variables declaration//GEN-END:variables
}
