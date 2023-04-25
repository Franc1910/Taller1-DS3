package Pantallas;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;

public class JFramePrograma19 extends javax.swing.JFrame {

    public JFramePrograma19() {
        initComponents();
        Utilidades.limitarCaracteres(jtaDescripcion, 100);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        XCerrar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jtfNombre = new javax.swing.JTextField();
        jtaDescripcion = new javax.swing.JTextArea();
        jtfPrecio = new javax.swing.JTextField();
        btnCapturar = new javax.swing.JButton();
        rNombre = new javax.swing.JTextField();
        rDescripcion = new javax.swing.JTextArea();
        rPrecioNeto = new javax.swing.JTextField();
        rDescuento = new javax.swing.JTextField();
        rPrecioFinal = new javax.swing.JTextField();
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

        jtfNombre.setBackground(new java.awt.Color(255, 255, 255));
        jtfNombre.setFont(new java.awt.Font("Lucida Sans", 0, 20)); // NOI18N
        jtfNombre.setForeground(new java.awt.Color(0, 0, 0));
        jtfNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfNombre.setToolTipText("");
        jtfNombre.setBorder(null);
        jtfNombre.setCaretColor(new java.awt.Color(217, 37, 52));
        jtfNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreActionPerformed(evt);
            }
        });
        jtfNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNombreKeyTyped(evt);
            }
        });
        getContentPane().add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 188, 360, 30));

        jtaDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        jtaDescripcion.setColumns(20);
        jtaDescripcion.setFont(new java.awt.Font("Lucida Sans", 0, 20)); // NOI18N
        jtaDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        jtaDescripcion.setLineWrap(true);
        jtaDescripcion.setRows(5);
        jtaDescripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jtaDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 270, 570, 120));

        jtfPrecio.setBackground(new java.awt.Color(255, 255, 255));
        jtfPrecio.setFont(new java.awt.Font("Lucida Sans", 0, 20)); // NOI18N
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
        getContentPane().add(jtfPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 418, 149, 30));

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
        getContentPane().add(btnCapturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 465, 318, 75));

        rNombre.setEditable(false);
        rNombre.setBackground(new java.awt.Color(255, 255, 255));
        rNombre.setFont(new java.awt.Font("Lucida Sans", 0, 20)); // NOI18N
        rNombre.setForeground(new java.awt.Color(0, 0, 0));
        rNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rNombre.setAutoscrolls(false);
        rNombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rNombre.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(rNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 559, 360, 28));

        rDescripcion.setEditable(false);
        rDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        rDescripcion.setColumns(20);
        rDescripcion.setFont(new java.awt.Font("Lucida Sans", 0, 20)); // NOI18N
        rDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        rDescripcion.setLineWrap(true);
        rDescripcion.setRows(5);
        rDescripcion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(rDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 612, 550, 100));

        rPrecioNeto.setEditable(false);
        rPrecioNeto.setBackground(new java.awt.Color(255, 255, 255));
        rPrecioNeto.setFont(new java.awt.Font("Lucida Sans", 0, 20)); // NOI18N
        rPrecioNeto.setForeground(new java.awt.Color(0, 0, 0));
        rPrecioNeto.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rPrecioNeto.setAutoscrolls(false);
        rPrecioNeto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rPrecioNeto.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(rPrecioNeto, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 715, 370, 28));

        rDescuento.setEditable(false);
        rDescuento.setBackground(new java.awt.Color(255, 255, 255));
        rDescuento.setFont(new java.awt.Font("Lucida Sans", 0, 20)); // NOI18N
        rDescuento.setForeground(new java.awt.Color(0, 0, 0));
        rDescuento.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rDescuento.setAutoscrolls(false);
        rDescuento.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rDescuento.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(rDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 745, 370, 28));

        rPrecioFinal.setEditable(false);
        rPrecioFinal.setBackground(new java.awt.Color(255, 255, 255));
        rPrecioFinal.setFont(new java.awt.Font("Lucida Sans", 0, 20)); // NOI18N
        rPrecioFinal.setForeground(new java.awt.Color(0, 0, 0));
        rPrecioFinal.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rPrecioFinal.setAutoscrolls(false);
        rPrecioFinal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rPrecioFinal.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(rPrecioFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 777, 370, 28));

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
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 730, 74, 75));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP13151617/PantPrograma19.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(671, 967));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 842));

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

    private void jtfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
    }//GEN-LAST:event_jtfNombreActionPerformed

    private void jtfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreKeyTyped
        Utilidades.ValidarLongitud(evt, jtfNombre, 20);
    }//GEN-LAST:event_jtfNombreKeyTyped

    private void jtfPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPrecioActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfNombre.requestFocus();
    }//GEN-LAST:event_jtfPrecioActionPerformed

    private void jtfPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPrecioKeyTyped
        Utilidades.validarNumDecimal(evt, jtfPrecio, 2);
        Utilidades.ValidarLongitud(evt, jtfPrecio, 6);
    }//GEN-LAST:event_jtfPrecioKeyTyped

    private void btnCapturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapturarActionPerformed
        Taller1.Programa13 programa13 = new Taller1.Programa13();
        Taller1.Programa19 programa19 = new Taller1.Programa19();

        try {
            if (!Utilidades.camposCompletos(jtfNombre, jtfPrecio) || !Utilidades.AreasCompletos(jtaDescripcion)) {
                getToolkit().beep();
                Utilidades.mostrarMensaje("Debe ingresar todos los datos solicitados", "Datos Faltantes");
                jtfNombre.requestFocus();
            } else {
                programa13.PedirDatos(jtfNombre.getText(), jtaDescripcion.getText(), jtfPrecio.getText());
                programa19.PedirDatos(jtfPrecio.getText());

                String nombre = programa13.getNombre();
                String descripcion = programa13.getDescripcion();
                double precioneto = programa19.getPrecio();
                double descuento = programa19.getValorDelDescuento();

                rNombre.setText(nombre);
                rDescripcion.setText(descripcion);
                rPrecioNeto.setText(Utilidades.DecimalDinero(precioneto));
                rDescuento.setText(Utilidades.DecimalDinero(descuento));
                rPrecioFinal.setText(Utilidades.DecimalDinero(precioneto - descuento));
                
            }
        } catch (HeadlessException e) {
            Utilidades.mostrarMensaje("Ha ocurrido un error con el dato [" + e + "], por favor verificar los datos ingresados", "¡Error!");
            jtfNombre.requestFocus();
        }
    }//GEN-LAST:event_btnCapturarActionPerformed

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        Utilidades.establecerTooltip(btnLimpiar, "Borrar los datos");
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Utilidades.limpiarCampos(jtfNombre, jtfPrecio);
        Utilidades.limpiarResultados( rNombre, rPrecioNeto, rDescuento, rPrecioFinal);
        Utilidades.limpiarAreas(jtaDescripcion, rDescripcion);
        jtfNombre.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton XCerrar;
    private javax.swing.JButton btnCapturar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    private static javax.swing.JTextArea jtaDescripcion;
    public static javax.swing.JTextField jtfNombre;
    public static javax.swing.JTextField jtfPrecio;
    private static javax.swing.JTextArea rDescripcion;
    public static javax.swing.JTextField rDescuento;
    public static javax.swing.JTextField rNombre;
    public static javax.swing.JTextField rPrecioFinal;
    public static javax.swing.JTextField rPrecioNeto;
    // End of variables declaration//GEN-END:variables
}
