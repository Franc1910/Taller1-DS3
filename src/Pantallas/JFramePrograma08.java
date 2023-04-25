package Pantallas;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;

public class JFramePrograma08 extends javax.swing.JFrame {

    public JFramePrograma08() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        XCerrar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jtfTitulo = new javax.swing.JTextField();
        jtfAutor = new javax.swing.JTextField();
        jtfNumPag = new javax.swing.JTextField();
        btnCapturar = new javax.swing.JButton();
        rTitulo = new javax.swing.JTextField();
        rAutor = new javax.swing.JTextField();
        rNumPag = new javax.swing.JTextField();
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
        jtfTitulo.setFont(new java.awt.Font("Lucida Sans", 0, 32)); // NOI18N
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
        getContentPane().add(jtfTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 182, 440, 38));

        jtfAutor.setBackground(new java.awt.Color(255, 255, 255));
        jtfAutor.setFont(new java.awt.Font("Lucida Sans", 0, 32)); // NOI18N
        jtfAutor.setForeground(new java.awt.Color(0, 0, 0));
        jtfAutor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfAutor.setToolTipText("");
        jtfAutor.setBorder(null);
        jtfAutor.setCaretColor(new java.awt.Color(217, 37, 52));
        jtfAutor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtfAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAutorActionPerformed(evt);
            }
        });
        jtfAutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfAutorKeyTyped(evt);
            }
        });
        getContentPane().add(jtfAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 237, 440, 38));

        jtfNumPag.setBackground(new java.awt.Color(255, 255, 255));
        jtfNumPag.setFont(new java.awt.Font("Lucida Sans", 0, 32)); // NOI18N
        jtfNumPag.setForeground(new java.awt.Color(0, 0, 0));
        jtfNumPag.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfNumPag.setToolTipText("");
        jtfNumPag.setBorder(null);
        jtfNumPag.setCaretColor(new java.awt.Color(217, 37, 52));
        jtfNumPag.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtfNumPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNumPagActionPerformed(evt);
            }
        });
        jtfNumPag.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNumPagKeyTyped(evt);
            }
        });
        getContentPane().add(jtfNumPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 293, 316, 38));

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
        rTitulo.setFont(new java.awt.Font("Lucida Sans", 0, 30)); // NOI18N
        rTitulo.setForeground(new java.awt.Color(0, 0, 0));
        rTitulo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rTitulo.setAutoscrolls(false);
        rTitulo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rTitulo.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(rTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 462, 450, 38));

        rAutor.setEditable(false);
        rAutor.setBackground(new java.awt.Color(255, 255, 255));
        rAutor.setFont(new java.awt.Font("Lucida Sans", 0, 30)); // NOI18N
        rAutor.setForeground(new java.awt.Color(0, 0, 0));
        rAutor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rAutor.setAutoscrolls(false);
        rAutor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rAutor.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(rAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 516, 450, 38));

        rNumPag.setEditable(false);
        rNumPag.setBackground(new java.awt.Color(255, 255, 255));
        rNumPag.setFont(new java.awt.Font("Lucida Sans", 0, 30)); // NOI18N
        rNumPag.setForeground(new java.awt.Color(0, 0, 0));
        rNumPag.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rNumPag.setAutoscrolls(false);
        rNumPag.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rNumPag.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(rNumPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 575, 250, 38));

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
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 560, 74, 75));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP079810/PantPrograma08.png"))); // NOI18N
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
        jtfAutor.requestFocus();
    }//GEN-LAST:event_jtfTituloActionPerformed

    private void jtfTituloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfTituloKeyTyped
        Utilidades.ValidarLongitud(evt, jtfTitulo, 20);
    }//GEN-LAST:event_jtfTituloKeyTyped

    private void btnCapturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapturarActionPerformed
        Taller1.Programa08 programa08 = new Taller1.Programa08();
        
        try {
            if (!Utilidades.camposCompletos(jtfTitulo, jtfAutor, jtfNumPag)) {
                getToolkit().beep();
                Utilidades.mostrarMensaje("Debe ingresar todos los datos solicitados", "Datos Faltantes");
                jtfTitulo.requestFocus();
            } else {
                programa08.PedirDatos(jtfTitulo.getText(), jtfAutor.getText(), jtfNumPag.getText());     
                
                String titulo = programa08.getTitulo();                
                String autor = programa08.getAutor();
                int numpag = programa08.getNumPaginas();
                
                rTitulo.setText(titulo);               
                rAutor.setText(autor);
                rNumPag.setText(String.valueOf(numpag));
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
        Utilidades.limpiarCampos(jtfTitulo, jtfAutor, jtfNumPag);
        Utilidades.limpiarResultados(rTitulo, rAutor, rNumPag);
        jtfTitulo.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jtfAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAutorActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfNumPag.requestFocus();
    }//GEN-LAST:event_jtfAutorActionPerformed

    private void jtfAutorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfAutorKeyTyped
        Utilidades.ValidarLongitud(evt, jtfAutor, 20);
    }//GEN-LAST:event_jtfAutorKeyTyped

    private void jtfNumPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNumPagActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfTitulo.requestFocus();
    }//GEN-LAST:event_jtfNumPagActionPerformed

    private void jtfNumPagKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNumPagKeyTyped
        Utilidades.ValidarNumero(evt);
        Utilidades.ValidarLongitud(evt, jtfNumPag, 4);
    }//GEN-LAST:event_jtfNumPagKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton XCerrar;
    private javax.swing.JButton btnCapturar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JTextField jtfAutor;
    public static javax.swing.JTextField jtfNumPag;
    public static javax.swing.JTextField jtfTitulo;
    public static javax.swing.JTextField rAutor;
    public static javax.swing.JTextField rNumPag;
    public static javax.swing.JTextField rTitulo;
    // End of variables declaration//GEN-END:variables
}
