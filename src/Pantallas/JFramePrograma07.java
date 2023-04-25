package Pantallas;

import Taller1.Programa07;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;

public class JFramePrograma07 extends javax.swing.JFrame {

    public JFramePrograma07() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        XCerrar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jtfDia = new javax.swing.JTextField();
        jtfMes = new javax.swing.JTextField();
        jtfAnio = new javax.swing.JTextField();
        btnFecha = new javax.swing.JButton();
        rFechaCorta = new javax.swing.JTextField();
        rFechaMedia = new javax.swing.JTextField();
        rFechaLarga = new javax.swing.JTextField();
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
        getContentPane().add(jtfDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 279, 68, 38));

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
        getContentPane().add(jtfMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 279, 68, 38));

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
        getContentPane().add(jtfAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 279, 120, 38));

        btnFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP079810/FechaNormal.png"))); // NOI18N
        btnFecha.setBorder(null);
        btnFecha.setBorderPainted(false);
        btnFecha.setContentAreaFilled(false);
        btnFecha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFecha.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP079810/FechaTocar.png"))); // NOI18N
        btnFecha.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP079810/FechaPasar.png"))); // NOI18N
        btnFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFechaActionPerformed(evt);
            }
        });
        getContentPane().add(btnFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 519, 220, 75));

        rFechaCorta.setEditable(false);
        rFechaCorta.setBackground(new java.awt.Color(255, 255, 255));
        rFechaCorta.setFont(new java.awt.Font("Lucida Sans", 0, 28)); // NOI18N
        rFechaCorta.setForeground(new java.awt.Color(0, 0, 0));
        rFechaCorta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rFechaCorta.setAutoscrolls(false);
        rFechaCorta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rFechaCorta.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(rFechaCorta, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 345, 350, 38));

        rFechaMedia.setEditable(false);
        rFechaMedia.setBackground(new java.awt.Color(255, 255, 255));
        rFechaMedia.setFont(new java.awt.Font("Lucida Sans", 0, 28)); // NOI18N
        rFechaMedia.setForeground(new java.awt.Color(0, 0, 0));
        rFechaMedia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rFechaMedia.setAutoscrolls(false);
        rFechaMedia.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rFechaMedia.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(rFechaMedia, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 398, 350, 38));

        rFechaLarga.setEditable(false);
        rFechaLarga.setBackground(new java.awt.Color(255, 255, 255));
        rFechaLarga.setFont(new java.awt.Font("Lucida Sans", 0, 26)); // NOI18N
        rFechaLarga.setForeground(new java.awt.Color(0, 0, 0));
        rFechaLarga.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rFechaLarga.setAutoscrolls(false);
        rFechaLarga.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rFechaLarga.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(rFechaLarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 450, 350, 38));

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
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 253, 74, 75));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP079810/PantPrograma07.png"))); // NOI18N
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

    private void jtfDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDiaActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfMes.requestFocus();
    }//GEN-LAST:event_jtfDiaActionPerformed

    private void jtfDiaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDiaKeyTyped
        Utilidades.ValidarNumero(evt);
        Utilidades.ValidarLongitud(evt, jtfDia, 2);
    }//GEN-LAST:event_jtfDiaKeyTyped

    private void btnFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFechaActionPerformed
        try {
            if (!Utilidades.camposCompletos(jtfDia, jtfMes, jtfAnio)) {
                getToolkit().beep();
                Utilidades.mostrarMensaje("Debe ingresar todos los datos solicitados", "Datos Faltantes");
                jtfDia.requestFocus();
            } else { 
                boolean datosValidos = Programa07.pedirDatos(jtfDia.getText(), jtfMes.getText(), jtfAnio.getText());              
                if(datosValidos) {   
                    int dia = Integer.parseInt(jtfDia.getText());
                    int mes = Integer.parseInt(jtfMes.getText());
                    int anio = Integer.parseInt(jtfAnio.getText());               
                    Programa07 programa07 = new Programa07(dia, mes, anio);
                    
                    String fechaCorta = programa07.obtenerFechaCorta();
                    String fechaMediana = programa07.obtenerFechaMediana();
                    String fechaLarga = programa07.obtenerFechaLarga();                  
                    
                    rFechaCorta.setText(fechaCorta);
                    rFechaMedia.setText(fechaMediana);
                    rFechaLarga.setText(fechaLarga);                   
                }
            }
        } catch (HeadlessException e) {
            Utilidades.mostrarMensaje("Ha ocurrido un error con el dato [" + e + "], por favor verificar los datos ingresados", "¡Error!");
            jtfDia.requestFocus();
        }
    }//GEN-LAST:event_btnFechaActionPerformed

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        Utilidades.establecerTooltip(btnLimpiar, "Borrar los datos");
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Utilidades.limpiarCampos(jtfDia, jtfMes, jtfAnio);
        Utilidades.limpiarResultados(rFechaCorta, rFechaMedia, rFechaLarga);
        jtfDia.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

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
        jtfDia.requestFocus();
    }//GEN-LAST:event_jtfAnioActionPerformed

    private void jtfAnioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfAnioKeyTyped
        Utilidades.ValidarNumero(evt);
        Utilidades.ValidarLongitud(evt, jtfAnio, 4);
    }//GEN-LAST:event_jtfAnioKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton XCerrar;
    private javax.swing.JButton btnFecha;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JTextField jtfAnio;
    public static javax.swing.JTextField jtfDia;
    public static javax.swing.JTextField jtfMes;
    public static javax.swing.JTextField rFechaCorta;
    public static javax.swing.JTextField rFechaLarga;
    public static javax.swing.JTextField rFechaMedia;
    // End of variables declaration//GEN-END:variables
}
