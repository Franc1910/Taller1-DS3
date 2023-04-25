package Pantallas;

import Taller1.Programa07;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;

public class JFramePrograma17 extends javax.swing.JFrame {

    public JFramePrograma17() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        XCerrar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jtfDestino = new javax.swing.JTextField();
        jtfDia = new javax.swing.JTextField();
        jtfMes = new javax.swing.JTextField();
        jtfAnio = new javax.swing.JTextField();
        jtfPrecio = new javax.swing.JTextField();
        btnCapturar = new javax.swing.JButton();
        rDestino = new javax.swing.JTextField();
        rFechaSalida = new javax.swing.JTextField();
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

        jtfDestino.setBackground(new java.awt.Color(255, 255, 255));
        jtfDestino.setFont(new java.awt.Font("Lucida Sans", 0, 30)); // NOI18N
        jtfDestino.setForeground(new java.awt.Color(0, 0, 0));
        jtfDestino.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfDestino.setToolTipText("");
        jtfDestino.setBorder(null);
        jtfDestino.setCaretColor(new java.awt.Color(217, 37, 52));
        jtfDestino.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtfDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDestinoActionPerformed(evt);
            }
        });
        jtfDestino.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfDestinoKeyTyped(evt);
            }
        });
        getContentPane().add(jtfDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 182, 420, 38));

        jtfDia.setBackground(new java.awt.Color(255, 255, 255));
        jtfDia.setFont(new java.awt.Font("Lucida Sans", 0, 32)); // NOI18N
        jtfDia.setForeground(new java.awt.Color(0, 0, 0));
        jtfDia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfDia.setToolTipText("");
        jtfDia.setBorder(null);
        jtfDia.setCaretColor(new java.awt.Color(217, 37, 52));
        jtfDia.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtfDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDiaActionPerformed(evt);
            }
        });
        jtfDia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfDiaKeyTyped(evt);
            }
        });
        getContentPane().add(jtfDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 373, 68, 38));

        jtfMes.setBackground(new java.awt.Color(255, 255, 255));
        jtfMes.setFont(new java.awt.Font("Lucida Sans", 0, 32)); // NOI18N
        jtfMes.setForeground(new java.awt.Color(0, 0, 0));
        jtfMes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfMes.setToolTipText("");
        jtfMes.setBorder(null);
        jtfMes.setCaretColor(new java.awt.Color(217, 37, 52));
        jtfMes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtfMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMesActionPerformed(evt);
            }
        });
        jtfMes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfMesKeyTyped(evt);
            }
        });
        getContentPane().add(jtfMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 373, 68, 38));

        jtfAnio.setBackground(new java.awt.Color(255, 255, 255));
        jtfAnio.setFont(new java.awt.Font("Lucida Sans", 0, 32)); // NOI18N
        jtfAnio.setForeground(new java.awt.Color(0, 0, 0));
        jtfAnio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfAnio.setToolTipText("");
        jtfAnio.setBorder(null);
        jtfAnio.setCaretColor(new java.awt.Color(217, 37, 52));
        jtfAnio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtfAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAnioActionPerformed(evt);
            }
        });
        jtfAnio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfAnioKeyTyped(evt);
            }
        });
        getContentPane().add(jtfAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 373, 120, 38));

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
        getContentPane().add(jtfPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 436, 164, 36));

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
        getContentPane().add(btnCapturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 512, 318, 75));

        rDestino.setEditable(false);
        rDestino.setBackground(new java.awt.Color(255, 255, 255));
        rDestino.setFont(new java.awt.Font("Lucida Sans", 0, 34)); // NOI18N
        rDestino.setForeground(new java.awt.Color(0, 0, 0));
        rDestino.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rDestino.setAutoscrolls(false);
        rDestino.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rDestino.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(rDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 626, 430, 44));

        rFechaSalida.setEditable(false);
        rFechaSalida.setBackground(new java.awt.Color(255, 255, 255));
        rFechaSalida.setFont(new java.awt.Font("Lucida Sans", 0, 34)); // NOI18N
        rFechaSalida.setForeground(new java.awt.Color(0, 0, 0));
        rFechaSalida.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rFechaSalida.setAutoscrolls(false);
        rFechaSalida.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rFechaSalida.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(rFechaSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 680, 240, 44));

        rPrecio.setEditable(false);
        rPrecio.setBackground(new java.awt.Color(255, 255, 255));
        rPrecio.setFont(new java.awt.Font("Lucida Sans", 0, 34)); // NOI18N
        rPrecio.setForeground(new java.awt.Color(0, 0, 0));
        rPrecio.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rPrecio.setAutoscrolls(false);
        rPrecio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rPrecio.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(rPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 737, 370, 44));

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
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 707, 74, 75));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP13151617/PantPrograma17.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(671, 967));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 813));

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

    private void jtfDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDestinoActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfDia.requestFocus();
    }//GEN-LAST:event_jtfDestinoActionPerformed

    private void jtfDestinoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDestinoKeyTyped
        Utilidades.ValidarLongitud(evt, jtfDestino, 20);
    }//GEN-LAST:event_jtfDestinoKeyTyped

    private void jtfPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPrecioActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfDestino.requestFocus();
    }//GEN-LAST:event_jtfPrecioActionPerformed

    private void jtfPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPrecioKeyTyped
        Utilidades.validarNumDecimal(evt, jtfPrecio, 2);
        Utilidades.ValidarLongitud(evt, jtfPrecio, 7);
    }//GEN-LAST:event_jtfPrecioKeyTyped

    private void btnCapturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapturarActionPerformed
        Taller1.Programa17 programa17 = new Taller1.Programa17();

        try {
            if (!Utilidades.camposCompletos(jtfDestino, jtfDia, jtfMes, jtfAnio, jtfPrecio)) {
                getToolkit().beep();
                Utilidades.mostrarMensaje("Debe ingresar todos los datos solicitados", "Datos Faltantes");
                jtfDestino.requestFocus();
            } else {
                boolean datosValidos = Programa07.pedirDatos(jtfDia.getText(), jtfMes.getText(), jtfAnio.getText());  
                if(datosValidos) {   
                    programa17.PedirDatos(jtfDestino.getText(), jtfPrecio.getText());
                    
                    int dia = Integer.parseInt(jtfDia.getText());
                    int mes = Integer.parseInt(jtfMes.getText());
                    int anio = Integer.parseInt(jtfAnio.getText());   
                    //uso la misma clase del programa07 para la fecha
                    Programa07 programa07 = new Programa07(dia, mes, anio);
                    
                    String fechaMediana = programa07.obtenerFechaMediana();                
                    String destino = programa17.getDestino();
                    double precio = programa17.getPrecio();
                    
                    rDestino.setText(destino);
                    rFechaSalida.setText(fechaMediana);
                    rPrecio.setText(Utilidades.DecimalDinero(precio));                 
                }   
            }
        } catch (HeadlessException e) {
            Utilidades.mostrarMensaje("Ha ocurrido un error con el dato [" + e + "], por favor verificar los datos ingresados", "¡Error!");
            jtfDestino.requestFocus();
        }
    }//GEN-LAST:event_btnCapturarActionPerformed

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        Utilidades.establecerTooltip(btnLimpiar, "Borrar los datos");
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Utilidades.limpiarCampos(jtfDestino, jtfDia, jtfMes, jtfAnio, jtfPrecio);
        Utilidades.limpiarResultados(rDestino, rFechaSalida, rPrecio);
        jtfDestino.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jtfDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDiaActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfMes.requestFocus();
    }//GEN-LAST:event_jtfDiaActionPerformed

    private void jtfDiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDiaKeyTyped
        Utilidades.ValidarNumero(evt);
        Utilidades.ValidarLongitud(evt, jtfDia, 2);
    }//GEN-LAST:event_jtfDiaKeyTyped

    private void jtfMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMesActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfAnio.requestFocus();
    }//GEN-LAST:event_jtfMesActionPerformed

    private void jtfMesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfMesKeyTyped
        Utilidades.ValidarNumero(evt);
        Utilidades.ValidarLongitud(evt, jtfMes, 2);
    }//GEN-LAST:event_jtfMesKeyTyped

    private void jtfAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAnioActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfPrecio.requestFocus();
    }//GEN-LAST:event_jtfAnioActionPerformed

    private void jtfAnioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfAnioKeyTyped
        Utilidades.ValidarNumero(evt);
        Utilidades.ValidarLongitud(evt, jtfAnio, 4);
    }//GEN-LAST:event_jtfAnioKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton XCerrar;
    private javax.swing.JButton btnCapturar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JTextField jtfAnio;
    public static javax.swing.JTextField jtfDestino;
    public static javax.swing.JTextField jtfDia;
    public static javax.swing.JTextField jtfMes;
    public static javax.swing.JTextField jtfPrecio;
    public static javax.swing.JTextField rDestino;
    public static javax.swing.JTextField rFechaSalida;
    public static javax.swing.JTextField rPrecio;
    // End of variables declaration//GEN-END:variables
}
