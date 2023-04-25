package Pantallas;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;

public class JFramePrograma11 extends javax.swing.JFrame {

    public JFramePrograma11() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        XCerrar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jtfMarca = new javax.swing.JTextField();
        jtfModelo = new javax.swing.JTextField();
        jtfPrecio = new javax.swing.JTextField();
        btnCapturar = new javax.swing.JButton();
        rMarca = new javax.swing.JTextField();
        rModelo = new javax.swing.JTextField();
        rPrecio = new javax.swing.JTextField();
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

        jtfPrecio.setBackground(new java.awt.Color(255, 255, 255));
        jtfPrecio.setFont(new java.awt.Font("Lucida Sans", 0, 30)); // NOI18N
        jtfPrecio.setForeground(new java.awt.Color(0, 0, 0));
        jtfPrecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfPrecio.setToolTipText("");
        jtfPrecio.setBorder(null);
        jtfPrecio.setCaretColor(new java.awt.Color(217, 37, 52));
        jtfPrecio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtfPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPrecioActionPerformed(evt);
            }
        });
        jtfPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfPrecioKeyTyped(evt);
            }
        });
        getContentPane().add(jtfPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 298, 120, 36));

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

        rMarca.setEditable(false);
        rMarca.setBackground(new java.awt.Color(255, 255, 255));
        rMarca.setFont(new java.awt.Font("Lucida Sans", 0, 34)); // NOI18N
        rMarca.setForeground(new java.awt.Color(0, 0, 0));
        rMarca.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rMarca.setAutoscrolls(false);
        rMarca.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rMarca.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(rMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 462, 440, 44));

        rModelo.setEditable(false);
        rModelo.setBackground(new java.awt.Color(255, 255, 255));
        rModelo.setFont(new java.awt.Font("Lucida Sans", 0, 34)); // NOI18N
        rModelo.setForeground(new java.awt.Color(0, 0, 0));
        rModelo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rModelo.setAutoscrolls(false);
        rModelo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rModelo.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(rModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 517, 417, 44));

        rPrecio.setEditable(false);
        rPrecio.setBackground(new java.awt.Color(255, 255, 255));
        rPrecio.setFont(new java.awt.Font("Lucida Sans", 0, 34)); // NOI18N
        rPrecio.setForeground(new java.awt.Color(0, 0, 0));
        rPrecio.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rPrecio.setAutoscrolls(false);
        rPrecio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rPrecio.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(rPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 573, 370, 44));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP079810/PantPrograma11.png"))); // NOI18N
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
        jtfPrecio.requestFocus();
    }//GEN-LAST:event_jtfModeloActionPerformed

    private void jtfModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfModeloKeyTyped
        Utilidades.ValidarLongitud(evt, jtfModelo, 20);
    }//GEN-LAST:event_jtfModeloKeyTyped

    private void jtfPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPrecioActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfMarca.requestFocus();
    }//GEN-LAST:event_jtfPrecioActionPerformed

    private void jtfPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPrecioKeyTyped
        Utilidades.validarNumDecimal(evt, jtfPrecio, 2);
        Utilidades.ValidarLongitud(evt, jtfPrecio, 6);
    }//GEN-LAST:event_jtfPrecioKeyTyped

    private void btnCapturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapturarActionPerformed
        Taller1.Programa11 programa11 = new Taller1.Programa11();

        try {
            if (!Utilidades.camposCompletos(jtfMarca, jtfModelo, jtfPrecio)) {
                getToolkit().beep();
                Utilidades.mostrarMensaje("Debe ingresar todos los datos solicitados", "Datos Faltantes");
                jtfMarca.requestFocus();
            } else {
                programa11.PedirDatos(jtfMarca.getText(), jtfModelo.getText(), jtfPrecio.getText());

                String marca = programa11.getMarca();
                String modelo = programa11.getModelo();
                double precio = programa11.getPrecio();

                rMarca.setText(marca);
                rModelo.setText(modelo);
                rPrecio.setText(Utilidades.DecimalDinero(precio));
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
        Utilidades.limpiarCampos(jtfMarca, jtfModelo, jtfPrecio);
        Utilidades.limpiarResultados(rMarca, rModelo, rPrecio);
        jtfMarca.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton XCerrar;
    private javax.swing.JButton btnCapturar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JTextField jtfMarca;
    public static javax.swing.JTextField jtfModelo;
    public static javax.swing.JTextField jtfPrecio;
    public static javax.swing.JTextField rMarca;
    public static javax.swing.JTextField rModelo;
    public static javax.swing.JTextField rPrecio;
    // End of variables declaration//GEN-END:variables
}
