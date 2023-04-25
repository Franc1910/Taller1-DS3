package Pantallas;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;

public class JFramePrograma20 extends javax.swing.JFrame {

    public JFramePrograma20() {
        initComponents();
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        XCerrar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jtfNombre = new javax.swing.JTextField();
        jtfHorasTrabajadas = new javax.swing.JTextField();
        jtfPagoHora = new javax.swing.JTextField();
        btnCapturar = new javax.swing.JButton();
        rNombre = new javax.swing.JTextField();
        rHorasExcendentes = new javax.swing.JTextField();
        rPagoDoble = new javax.swing.JTextField();
        rPagoTotal = new javax.swing.JTextField();
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
        getContentPane().add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 182, 405, 38));

        jtfHorasTrabajadas.setBackground(new java.awt.Color(255, 255, 255));
        jtfHorasTrabajadas.setFont(new java.awt.Font("Lucida Sans", 0, 30)); // NOI18N
        jtfHorasTrabajadas.setForeground(new java.awt.Color(0, 0, 0));
        jtfHorasTrabajadas.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfHorasTrabajadas.setToolTipText("");
        jtfHorasTrabajadas.setBorder(null);
        jtfHorasTrabajadas.setCaretColor(new java.awt.Color(217, 37, 52));
        jtfHorasTrabajadas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtfHorasTrabajadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfHorasTrabajadasActionPerformed(evt);
            }
        });
        jtfHorasTrabajadas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfHorasTrabajadasKeyTyped(evt);
            }
        });
        getContentPane().add(jtfHorasTrabajadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 246, 160, 38));

        jtfPagoHora.setBackground(new java.awt.Color(255, 255, 255));
        jtfPagoHora.setFont(new java.awt.Font("Lucida Sans", 0, 30)); // NOI18N
        jtfPagoHora.setForeground(new java.awt.Color(0, 0, 0));
        jtfPagoHora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfPagoHora.setToolTipText("");
        jtfPagoHora.setBorder(null);
        jtfPagoHora.setCaretColor(new java.awt.Color(217, 37, 52));
        jtfPagoHora.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtfPagoHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPagoHoraActionPerformed(evt);
            }
        });
        jtfPagoHora.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfPagoHoraKeyTyped(evt);
            }
        });
        getContentPane().add(jtfPagoHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 314, 160, 36));

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
        getContentPane().add(btnCapturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 368, 318, 75));

        rNombre.setEditable(false);
        rNombre.setBackground(new java.awt.Color(255, 255, 255));
        rNombre.setFont(new java.awt.Font("Lucida Sans", 0, 20)); // NOI18N
        rNombre.setForeground(new java.awt.Color(0, 0, 0));
        rNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rNombre.setAutoscrolls(false);
        rNombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rNombre.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(rNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 463, 410, 30));

        rHorasExcendentes.setEditable(false);
        rHorasExcendentes.setBackground(new java.awt.Color(255, 255, 255));
        rHorasExcendentes.setFont(new java.awt.Font("Lucida Sans", 0, 20)); // NOI18N
        rHorasExcendentes.setForeground(new java.awt.Color(0, 0, 0));
        rHorasExcendentes.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rHorasExcendentes.setAutoscrolls(false);
        rHorasExcendentes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rHorasExcendentes.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(rHorasExcendentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 495, 330, 30));

        rPagoDoble.setEditable(false);
        rPagoDoble.setBackground(new java.awt.Color(255, 255, 255));
        rPagoDoble.setFont(new java.awt.Font("Lucida Sans", 0, 20)); // NOI18N
        rPagoDoble.setForeground(new java.awt.Color(0, 0, 0));
        rPagoDoble.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rPagoDoble.setAutoscrolls(false);
        rPagoDoble.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rPagoDoble.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(rPagoDoble, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 528, 380, 30));

        rPagoTotal.setEditable(false);
        rPagoTotal.setBackground(new java.awt.Color(255, 255, 255));
        rPagoTotal.setFont(new java.awt.Font("Lucida Sans", 0, 20)); // NOI18N
        rPagoTotal.setForeground(new java.awt.Color(0, 0, 0));
        rPagoTotal.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rPagoTotal.setAutoscrolls(false);
        rPagoTotal.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rPagoTotal.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(rPagoTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 560, 390, 30));

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
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 524, 74, 75));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP13151617/PantPrograma20.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(671, 967));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 637));

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
        jtfHorasTrabajadas.requestFocus();
    }//GEN-LAST:event_jtfNombreActionPerformed

    private void jtfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreKeyTyped
        Utilidades.ValidarLongitud(evt, jtfNombre, 20);
    }//GEN-LAST:event_jtfNombreKeyTyped

    private void jtfHorasTrabajadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfHorasTrabajadasActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfPagoHora.requestFocus();
    }//GEN-LAST:event_jtfHorasTrabajadasActionPerformed

    private void jtfHorasTrabajadasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfHorasTrabajadasKeyTyped
        Utilidades.ValidarNumero(evt);
        Utilidades.ValidarLongitud(evt, jtfHorasTrabajadas, 3);
    }//GEN-LAST:event_jtfHorasTrabajadasKeyTyped

    private void jtfPagoHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPagoHoraActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfNombre.requestFocus();
    }//GEN-LAST:event_jtfPagoHoraActionPerformed

    private void jtfPagoHoraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPagoHoraKeyTyped
        Utilidades.validarNumDecimal(evt, jtfPagoHora, 2);
        Utilidades.ValidarLongitud(evt, jtfPagoHora, 7);
    }//GEN-LAST:event_jtfPagoHoraKeyTyped

    private void btnCapturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapturarActionPerformed
        Taller1.Programa20 programa20 = new Taller1.Programa20();

        try {
            if (!Utilidades.camposCompletos(jtfNombre, jtfHorasTrabajadas, jtfPagoHora)) {
                getToolkit().beep();
                Utilidades.mostrarMensaje("Debe ingresar todos los datos solicitados", "Datos Faltantes");
                jtfNombre.requestFocus();
            } else {
                programa20.PedirDatos(jtfNombre.getText(), jtfHorasTrabajadas.getText(), jtfPagoHora.getText());

                String nombre = programa20.getNombre();
                int horasExcedidas = programa20.getHorasTrabajadas() > 40 ? programa20.getHorasTrabajadas() - 40 : 0;
                double pagoExtra = programa20.getPagoExtra();
                double sueldobase = programa20.getSueldoBase();
                

                rNombre.setText(nombre);
                rHorasExcendentes.setText(String.valueOf(horasExcedidas) + " horas");
                rPagoDoble.setText(Utilidades.DecimalDinero(pagoExtra));
                rPagoTotal.setText(Utilidades.DecimalDinero(pagoExtra + sueldobase));
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
        Utilidades.limpiarCampos(jtfNombre, jtfHorasTrabajadas, jtfPagoHora);
        Utilidades.limpiarResultados(rNombre, rHorasExcendentes, rPagoDoble, rPagoTotal);
        jtfNombre.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton XCerrar;
    private javax.swing.JButton btnCapturar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JTextField jtfHorasTrabajadas;
    public static javax.swing.JTextField jtfNombre;
    public static javax.swing.JTextField jtfPagoHora;
    public static javax.swing.JTextField rHorasExcendentes;
    public static javax.swing.JTextField rNombre;
    public static javax.swing.JTextField rPagoDoble;
    public static javax.swing.JTextField rPagoTotal;
    // End of variables declaration//GEN-END:variables
}
