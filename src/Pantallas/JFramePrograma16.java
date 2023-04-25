package Pantallas;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;

public class JFramePrograma16 extends javax.swing.JFrame {

    public JFramePrograma16() {
        initComponents();
        Utilidades.limitarCaracteres(jtaDireccion, 100);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        XCerrar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jtfNombre = new javax.swing.JTextField();
        jtaDireccion = new javax.swing.JTextArea();
        jtfNumHabitaciones = new javax.swing.JTextField();
        btnCapturar = new javax.swing.JButton();
        rNombre = new javax.swing.JTextField();
        rDireccion = new javax.swing.JTextArea();
        rNumHabitaciones = new javax.swing.JTextField();
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
        jtfNombre.setFont(new java.awt.Font("Lucida Sans", 0, 30)); // NOI18N
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
        getContentPane().add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 182, 410, 38));

        jtaDireccion.setBackground(new java.awt.Color(255, 255, 255));
        jtaDireccion.setColumns(20);
        jtaDireccion.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        jtaDireccion.setForeground(new java.awt.Color(0, 0, 0));
        jtaDireccion.setLineWrap(true);
        jtaDireccion.setRows(5);
        jtaDireccion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jtaDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 278, 570, 160));

        jtfNumHabitaciones.setBackground(new java.awt.Color(255, 255, 255));
        jtfNumHabitaciones.setFont(new java.awt.Font("Lucida Sans", 0, 30)); // NOI18N
        jtfNumHabitaciones.setForeground(new java.awt.Color(0, 0, 0));
        jtfNumHabitaciones.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfNumHabitaciones.setToolTipText("");
        jtfNumHabitaciones.setBorder(null);
        jtfNumHabitaciones.setCaretColor(new java.awt.Color(217, 37, 52));
        jtfNumHabitaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtfNumHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNumHabitacionesActionPerformed(evt);
            }
        });
        jtfNumHabitaciones.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNumHabitacionesKeyTyped(evt);
            }
        });
        getContentPane().add(jtfNumHabitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 469, 140, 36));

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
        getContentPane().add(btnCapturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 527, 318, 75));

        rNombre.setEditable(false);
        rNombre.setBackground(new java.awt.Color(255, 255, 255));
        rNombre.setFont(new java.awt.Font("Lucida Sans", 0, 20)); // NOI18N
        rNombre.setForeground(new java.awt.Color(0, 0, 0));
        rNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rNombre.setAutoscrolls(false);
        rNombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rNombre.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(rNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 628, 460, 28));

        rDireccion.setEditable(false);
        rDireccion.setBackground(new java.awt.Color(255, 255, 255));
        rDireccion.setColumns(20);
        rDireccion.setFont(new java.awt.Font("Lucida Sans", 0, 20)); // NOI18N
        rDireccion.setForeground(new java.awt.Color(0, 0, 0));
        rDireccion.setLineWrap(true);
        rDireccion.setRows(5);
        rDireccion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(rDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 676, 480, 80));

        rNumHabitaciones.setEditable(false);
        rNumHabitaciones.setBackground(new java.awt.Color(255, 255, 255));
        rNumHabitaciones.setFont(new java.awt.Font("Lucida Sans", 0, 20)); // NOI18N
        rNumHabitaciones.setForeground(new java.awt.Color(0, 0, 0));
        rNumHabitaciones.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rNumHabitaciones.setAutoscrolls(false);
        rNumHabitaciones.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rNumHabitaciones.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(rNumHabitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 757, 250, 28));

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
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 715, 74, 75));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP13151617/PantPrograma16.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(671, 967));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 827));

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

    private void btnCapturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapturarActionPerformed
        Taller1.Programa16 programa16 = new Taller1.Programa16();

        try {
            if (!Utilidades.camposCompletos(jtfNombre, jtfNumHabitaciones) || !Utilidades.AreasCompletos(jtaDireccion)) {
                getToolkit().beep();
                Utilidades.mostrarMensaje("Debe ingresar todos los datos solicitados", "Datos Faltantes");
                jtfNombre.requestFocus();
            } else {
                programa16.PedirDatos(jtfNombre.getText(), jtaDireccion.getText(), jtfNumHabitaciones.getText());

                String nombre = programa16.getNombre();
                String descripcion = programa16.getDireccion();
                int precio = programa16.getNumHabitaciones();

                rNombre.setText(nombre);
                rDireccion.setText(descripcion);
                rNumHabitaciones.setText(String.valueOf(precio) + " Habitaciones");
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
        Utilidades.limpiarCampos(jtfNombre, jtfNumHabitaciones);
        Utilidades.limpiarResultados(rNumHabitaciones, rNombre);
        Utilidades.limpiarAreas(jtaDireccion, rDireccion);
        jtfNombre.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jtfNumHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNumHabitacionesActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfNombre.requestFocus();
    }//GEN-LAST:event_jtfNumHabitacionesActionPerformed

    private void jtfNumHabitacionesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNumHabitacionesKeyTyped
        Utilidades.ValidarNumero(evt);
        Utilidades.ValidarLongitud(evt, jtfNumHabitaciones, 5);
    }//GEN-LAST:event_jtfNumHabitacionesKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton XCerrar;
    private javax.swing.JButton btnCapturar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    private static javax.swing.JTextArea jtaDireccion;
    public static javax.swing.JTextField jtfNombre;
    public static javax.swing.JTextField jtfNumHabitaciones;
    private static javax.swing.JTextArea rDireccion;
    public static javax.swing.JTextField rNombre;
    public static javax.swing.JTextField rNumHabitaciones;
    // End of variables declaration//GEN-END:variables
}
