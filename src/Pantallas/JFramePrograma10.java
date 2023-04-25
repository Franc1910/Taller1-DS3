package Pantallas;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;

public class JFramePrograma10 extends javax.swing.JFrame {

    public JFramePrograma10() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        XCerrar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jtfEspecie = new javax.swing.JTextField();
        jtfEdad = new javax.swing.JTextField();
        jtfColor = new javax.swing.JTextField();
        btnCapturar = new javax.swing.JButton();
        rEspecie = new javax.swing.JTextField();
        rEdad = new javax.swing.JTextField();
        rColor = new javax.swing.JTextField();
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

        jtfEspecie.setBackground(new java.awt.Color(255, 255, 255));
        jtfEspecie.setFont(new java.awt.Font("Lucida Sans", 0, 32)); // NOI18N
        jtfEspecie.setForeground(new java.awt.Color(0, 0, 0));
        jtfEspecie.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfEspecie.setToolTipText("");
        jtfEspecie.setBorder(null);
        jtfEspecie.setCaretColor(new java.awt.Color(217, 37, 52));
        jtfEspecie.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtfEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEspecieActionPerformed(evt);
            }
        });
        jtfEspecie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfEspecieKeyTyped(evt);
            }
        });
        getContentPane().add(jtfEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 182, 410, 38));

        jtfEdad.setBackground(new java.awt.Color(255, 255, 255));
        jtfEdad.setFont(new java.awt.Font("Lucida Sans", 0, 32)); // NOI18N
        jtfEdad.setForeground(new java.awt.Color(0, 0, 0));
        jtfEdad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfEdad.setToolTipText("");
        jtfEdad.setBorder(null);
        jtfEdad.setCaretColor(new java.awt.Color(217, 37, 52));
        jtfEdad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtfEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEdadActionPerformed(evt);
            }
        });
        jtfEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfEdadKeyTyped(evt);
            }
        });
        getContentPane().add(jtfEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 239, 110, 38));

        jtfColor.setBackground(new java.awt.Color(255, 255, 255));
        jtfColor.setFont(new java.awt.Font("Lucida Sans", 0, 32)); // NOI18N
        jtfColor.setForeground(new java.awt.Color(0, 0, 0));
        jtfColor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfColor.setToolTipText("");
        jtfColor.setBorder(null);
        jtfColor.setCaretColor(new java.awt.Color(217, 37, 52));
        jtfColor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtfColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfColorActionPerformed(evt);
            }
        });
        jtfColor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfColorKeyTyped(evt);
            }
        });
        getContentPane().add(jtfColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 296, 410, 38));

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

        rEspecie.setEditable(false);
        rEspecie.setBackground(new java.awt.Color(255, 255, 255));
        rEspecie.setFont(new java.awt.Font("Lucida Sans", 0, 34)); // NOI18N
        rEspecie.setForeground(new java.awt.Color(0, 0, 0));
        rEspecie.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rEspecie.setAutoscrolls(false);
        rEspecie.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rEspecie.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(rEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 462, 420, 44));

        rEdad.setEditable(false);
        rEdad.setBackground(new java.awt.Color(255, 255, 255));
        rEdad.setFont(new java.awt.Font("Lucida Sans", 0, 34)); // NOI18N
        rEdad.setForeground(new java.awt.Color(0, 0, 0));
        rEdad.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rEdad.setAutoscrolls(false);
        rEdad.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rEdad.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(rEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 516, 210, 44));

        rColor.setEditable(false);
        rColor.setBackground(new java.awt.Color(255, 255, 255));
        rColor.setFont(new java.awt.Font("Lucida Sans", 0, 34)); // NOI18N
        rColor.setForeground(new java.awt.Color(0, 0, 0));
        rColor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rColor.setAutoscrolls(false);
        rColor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rColor.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(rColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 574, 380, 44));

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
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(557, 562, 74, 75));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP079810/PantPrograma10.png"))); // NOI18N
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

    private void jtfEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEspecieActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfEdad.requestFocus();
    }//GEN-LAST:event_jtfEspecieActionPerformed

    private void jtfEspecieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfEspecieKeyTyped
        Utilidades.ValidarLongitud(evt, jtfEspecie, 20);
    }//GEN-LAST:event_jtfEspecieKeyTyped

    private void jtfColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfColorActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfEspecie.requestFocus();
    }//GEN-LAST:event_jtfColorActionPerformed

    private void jtfColorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfColorKeyTyped
        Utilidades.ValidarLongitud(evt, jtfColor, 20);
    }//GEN-LAST:event_jtfColorKeyTyped

    private void jtfEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEdadActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfColor.requestFocus();
    }//GEN-LAST:event_jtfEdadActionPerformed

    private void jtfEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfEdadKeyTyped
        Utilidades.ValidarNumero(evt);
        Utilidades.ValidarLongitud(evt, jtfEdad, 2);
    }//GEN-LAST:event_jtfEdadKeyTyped

    private void btnCapturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapturarActionPerformed
        Taller1.Programa10 programa10 = new Taller1.Programa10();

        try {
            if (!Utilidades.camposCompletos(jtfEspecie, jtfEdad, jtfColor)) {
                getToolkit().beep();
                Utilidades.mostrarMensaje("Debe ingresar todos los datos solicitados", "Datos Faltantes");
                jtfEspecie.requestFocus();
            } else {
                programa10.PedirDatos(jtfEspecie.getText(), jtfEdad.getText(), jtfColor.getText());

                String especie = programa10.getEspecie();
                int edad = programa10.getEdad();
                String color = programa10.getColor();

                rEspecie.setText(especie);
                rEdad.setText(String.valueOf(edad) + " años");
                rColor.setText(color);
            }
        } catch (HeadlessException e) {
            Utilidades.mostrarMensaje("Ha ocurrido un error con el dato [" + e + "], por favor verificar los datos ingresados", "¡Error!");
            jtfEspecie.requestFocus();
        }
    }//GEN-LAST:event_btnCapturarActionPerformed

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        Utilidades.establecerTooltip(btnLimpiar, "Borrar los datos");
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Utilidades.limpiarCampos(jtfEspecie, jtfEdad, jtfColor);
        Utilidades.limpiarResultados(rEspecie, rEdad, rColor);
        jtfEspecie.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton XCerrar;
    private javax.swing.JButton btnCapturar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JTextField jtfColor;
    public static javax.swing.JTextField jtfEdad;
    public static javax.swing.JTextField jtfEspecie;
    public static javax.swing.JTextField rColor;
    public static javax.swing.JTextField rEdad;
    public static javax.swing.JTextField rEspecie;
    // End of variables declaration//GEN-END:variables
}
