package Pantallas;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;

public class JFramePrograma01 extends javax.swing.JFrame {

    public JFramePrograma01() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMenu = new javax.swing.JButton();
        XCerrar = new javax.swing.JButton();
        jtfNombre = new javax.swing.JTextField();
        jtfEdad = new javax.swing.JTextField();
        jtfDNI = new javax.swing.JTextField();
        btnProcesar = new javax.swing.JButton();
        ResultadoNombre = new javax.swing.JTextField();
        ResultadoEdad = new javax.swing.JTextField();
        ResultadoDNI = new javax.swing.JTextField();
        ResultadoMayor = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jtfNombre.setBackground(new java.awt.Color(255, 255, 255));
        jtfNombre.setFont(new java.awt.Font("Lucida Sans", 0, 34)); // NOI18N
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
        getContentPane().add(jtfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 180, 403, 45));

        jtfEdad.setBackground(new java.awt.Color(255, 255, 255));
        jtfEdad.setFont(new java.awt.Font("Lucida Sans", 0, 38)); // NOI18N
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
        getContentPane().add(jtfEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 246, 118, 45));

        jtfDNI.setBackground(new java.awt.Color(255, 255, 255));
        jtfDNI.setFont(new java.awt.Font("Lucida Sans", 0, 38)); // NOI18N
        jtfDNI.setForeground(new java.awt.Color(0, 0, 0));
        jtfDNI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfDNI.setToolTipText("");
        jtfDNI.setBorder(null);
        jtfDNI.setCaretColor(new java.awt.Color(217, 37, 52));
        jtfDNI.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtfDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDNIActionPerformed(evt);
            }
        });
        jtfDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfDNIKeyTyped(evt);
            }
        });
        getContentPane().add(jtfDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(222, 312, 327, 45));

        btnProcesar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP01/btnProcesar.png"))); // NOI18N
        btnProcesar.setBorder(null);
        btnProcesar.setBorderPainted(false);
        btnProcesar.setContentAreaFilled(false);
        btnProcesar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProcesar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP01/TocarProcesar.png"))); // NOI18N
        btnProcesar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP01/PasarProcesar.png"))); // NOI18N
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });
        getContentPane().add(btnProcesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 401, 298, 92));

        ResultadoNombre.setEditable(false);
        ResultadoNombre.setBackground(new java.awt.Color(255, 255, 255));
        ResultadoNombre.setFont(new java.awt.Font("Lucida Sans", 0, 34)); // NOI18N
        ResultadoNombre.setForeground(new java.awt.Color(0, 0, 0));
        ResultadoNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ResultadoNombre.setAutoscrolls(false);
        ResultadoNombre.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ResultadoNombre.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(ResultadoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 536, 430, 45));

        ResultadoEdad.setEditable(false);
        ResultadoEdad.setBackground(new java.awt.Color(255, 255, 255));
        ResultadoEdad.setFont(new java.awt.Font("Lucida Sans", 0, 34)); // NOI18N
        ResultadoEdad.setForeground(new java.awt.Color(0, 0, 0));
        ResultadoEdad.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ResultadoEdad.setAutoscrolls(false);
        ResultadoEdad.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ResultadoEdad.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(ResultadoEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 575, 170, 42));

        ResultadoDNI.setEditable(false);
        ResultadoDNI.setBackground(new java.awt.Color(255, 255, 255));
        ResultadoDNI.setFont(new java.awt.Font("Lucida Sans", 0, 34)); // NOI18N
        ResultadoDNI.setForeground(new java.awt.Color(0, 0, 0));
        ResultadoDNI.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ResultadoDNI.setAutoscrolls(false);
        ResultadoDNI.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ResultadoDNI.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(ResultadoDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 610, 340, 45));

        ResultadoMayor.setEditable(false);
        ResultadoMayor.setBackground(new java.awt.Color(255, 255, 255));
        ResultadoMayor.setFont(new java.awt.Font("Lucida Sans", 0, 36)); // NOI18N
        ResultadoMayor.setForeground(new java.awt.Color(0, 0, 0));
        ResultadoMayor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ResultadoMayor.setAutoscrolls(false);
        ResultadoMayor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ResultadoMayor.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(ResultadoMayor, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 648, 220, 45));

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP01/btnLimpiar.png"))); // NOI18N
        btnLimpiar.setBorder(null);
        btnLimpiar.setBorderPainted(false);
        btnLimpiar.setContentAreaFilled(false);
        btnLimpiar.setDefaultCapable(false);
        btnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP01/TocarLimpiar.png"))); // NOI18N
        btnLimpiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP01/PasarLimpiar.png"))); // NOI18N
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
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 638, 72, 74));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP01/PantPrograma01.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(671, 967));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseEntered
        Utilidades.establecerTooltip(btnMenu, "Página Principal");
    }//GEN-LAST:event_btnMenuMouseEntered

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        JFramePantPrincipal PantPrincipal = new JFramePantPrincipal();
        Utilidades.cambiarVentana(this, PantPrincipal, null);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void XCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XCerrarMouseEntered
        Utilidades.establecerTooltip(XCerrar, "Cerrar");
    }//GEN-LAST:event_XCerrarMouseEntered

    private void XCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XCerrarActionPerformed
        if (Utilidades.mostrarDialogoConfirmacion("¿Está seguro de que desea salir de la aplicación?"))
            System.exit(0);
    }//GEN-LAST:event_XCerrarActionPerformed

    private void jtfEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEdadActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfDNI.requestFocus();
    }//GEN-LAST:event_jtfEdadActionPerformed

    private void jtfEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfEdadKeyTyped
        Utilidades.ValidarNumero(evt);
        Utilidades.ValidarLongitud(evt, jtfEdad, 2);
    }//GEN-LAST:event_jtfEdadKeyTyped

    private void jtfNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreKeyTyped
        Utilidades.ValidarLongitud(evt, jtfNombre, 22);
    }//GEN-LAST:event_jtfNombreKeyTyped

    private void jtfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfEdad.requestFocus();
    }//GEN-LAST:event_jtfNombreActionPerformed

    private void jtfDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDNIActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfNombre.requestFocus();
    }//GEN-LAST:event_jtfDNIActionPerformed

    private void jtfDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDNIKeyTyped
        Utilidades.ValidarLongitud(evt, jtfDNI, 12);
    }//GEN-LAST:event_jtfDNIKeyTyped

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        /**
        Procesa los datos ingresados por el usuario en los campos de texto y los muestra en los campos de resultados correspondientes.
        Si los campos requeridos están incompletos, muestra un mensaje de error y resalta el primer campo incompleto.
        Si ocurre un error al procesar los datos, muestra un mensaje de error y resalta el primer campo de texto.
        */
        Taller1.Programa01 programa01 = new Taller1.Programa01();
        
        try {
            if (!Utilidades.camposCompletos(jtfNombre, jtfEdad, jtfDNI)) {
                getToolkit().beep();
                Utilidades.mostrarMensaje("Debe ingresar todos los datos solicitados", "Datos Faltantes");
                jtfNombre.requestFocus();
            } else {
                programa01.PedirDatos(jtfNombre.getText(), jtfEdad.getText(), jtfDNI.getText());     
                
                String nombre = programa01.getNombre();
                int edad = programa01.getEdad();
                String dni = programa01.getDNI();
                
                ResultadoNombre.setText(nombre);
                ResultadoEdad.setText(String.valueOf(edad) + " años");
                ResultadoDNI.setText(dni);
                
                ResultadoMayor.setText(String.valueOf(programa01.esMayorDeEdad()));
                ResultadoMayor.setForeground(programa01.esMayorDeEdad() ? Color.GREEN : Color.RED);
            }
        } catch (HeadlessException e) {
            Utilidades.mostrarMensaje("Ha ocurrido un error con el dato [" + e + "], por favor verificar los datos ingresados", "¡Error!");
            jtfNombre.requestFocus();
        }
    }//GEN-LAST:event_btnProcesarActionPerformed

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        Utilidades.establecerTooltip(btnLimpiar, "Borrar los datos");
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Utilidades.limpiarCampos(jtfNombre, jtfEdad, jtfDNI);
        Utilidades.limpiarResultados(ResultadoNombre, ResultadoEdad, ResultadoDNI, ResultadoMayor);
        jtfNombre.requestFocus();        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField ResultadoDNI;
    public static javax.swing.JTextField ResultadoEdad;
    public static javax.swing.JTextField ResultadoMayor;
    public static javax.swing.JTextField ResultadoNombre;
    private javax.swing.JButton XCerrar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JTextField jtfDNI;
    public static javax.swing.JTextField jtfEdad;
    public static javax.swing.JTextField jtfNombre;
    // End of variables declaration//GEN-END:variables
}