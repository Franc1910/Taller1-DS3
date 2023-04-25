package Pantallas;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;

public class JFramePrograma04 extends javax.swing.JFrame {

    public JFramePrograma04() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        XCerrar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jtfAlto = new javax.swing.JTextField();
        jtfAncho = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        ResultadoAlto = new javax.swing.JTextField();
        ResultadoAncho = new javax.swing.JTextField();
        ResultadoArea = new javax.swing.JTextField();
        ResultadoPerimetro = new javax.swing.JTextField();
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

        jtfAlto.setBackground(new java.awt.Color(255, 255, 255));
        jtfAlto.setFont(new java.awt.Font("Lucida Sans", 0, 32)); // NOI18N
        jtfAlto.setForeground(new java.awt.Color(0, 0, 0));
        jtfAlto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfAlto.setToolTipText("");
        jtfAlto.setBorder(null);
        jtfAlto.setCaretColor(new java.awt.Color(217, 37, 52));
        jtfAlto.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtfAlto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAltoActionPerformed(evt);
            }
        });
        jtfAlto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfAltoKeyTyped(evt);
            }
        });
        getContentPane().add(jtfAlto, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 223, 145, 43));

        jtfAncho.setBackground(new java.awt.Color(255, 255, 255));
        jtfAncho.setFont(new java.awt.Font("Lucida Sans", 0, 32)); // NOI18N
        jtfAncho.setForeground(new java.awt.Color(0, 0, 0));
        jtfAncho.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfAncho.setToolTipText("");
        jtfAncho.setBorder(null);
        jtfAncho.setCaretColor(new java.awt.Color(217, 37, 52));
        jtfAncho.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtfAncho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAnchoActionPerformed(evt);
            }
        });
        jtfAncho.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfAnchoKeyTyped(evt);
            }
        });
        getContentPane().add(jtfAncho, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 420, 145, 43));

        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP0345/btnCalcular.png"))); // NOI18N
        btnCalcular.setBorder(null);
        btnCalcular.setBorderPainted(false);
        btnCalcular.setContentAreaFilled(false);
        btnCalcular.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCalcular.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP0345/TocarCalcular.png"))); // NOI18N
        btnCalcular.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP0345/PasarCalcular.png"))); // NOI18N
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 307, 298, 92));

        ResultadoAlto.setEditable(false);
        ResultadoAlto.setBackground(new java.awt.Color(247, 246, 249));
        ResultadoAlto.setFont(new java.awt.Font("Lucida Sans", 0, 34)); // NOI18N
        ResultadoAlto.setForeground(new java.awt.Color(0, 0, 0));
        ResultadoAlto.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ResultadoAlto.setAutoscrolls(false);
        ResultadoAlto.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ResultadoAlto.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(ResultadoAlto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 478, 250, 44));

        ResultadoAncho.setEditable(false);
        ResultadoAncho.setBackground(new java.awt.Color(247, 246, 249));
        ResultadoAncho.setFont(new java.awt.Font("Lucida Sans", 0, 34)); // NOI18N
        ResultadoAncho.setForeground(new java.awt.Color(0, 0, 0));
        ResultadoAncho.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ResultadoAncho.setAutoscrolls(false);
        ResultadoAncho.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ResultadoAncho.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(ResultadoAncho, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, 250, 44));

        ResultadoArea.setEditable(false);
        ResultadoArea.setBackground(new java.awt.Color(255, 255, 255));
        ResultadoArea.setFont(new java.awt.Font("Lucida Sans", 0, 26)); // NOI18N
        ResultadoArea.setForeground(new java.awt.Color(0, 0, 0));
        ResultadoArea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ResultadoArea.setAutoscrolls(false);
        ResultadoArea.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ResultadoArea.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(ResultadoArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 752, 237, 40));

        ResultadoPerimetro.setEditable(false);
        ResultadoPerimetro.setBackground(new java.awt.Color(255, 255, 255));
        ResultadoPerimetro.setFont(new java.awt.Font("Lucida Sans", 0, 26)); // NOI18N
        ResultadoPerimetro.setForeground(new java.awt.Color(0, 0, 0));
        ResultadoPerimetro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ResultadoPerimetro.setAutoscrolls(false);
        ResultadoPerimetro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ResultadoPerimetro.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(ResultadoPerimetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 752, 237, 40));

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
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 666, 72, 74));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP0345/PantPrograma04.png"))); // NOI18N
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

    private void jtfAltoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAltoActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfAncho.requestFocus();
    }//GEN-LAST:event_jtfAltoActionPerformed

    private void jtfAltoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfAltoKeyTyped
        Utilidades.validarNumDecimal(evt, jtfAlto, 3);
        Utilidades.ValidarLongitud(evt, jtfAlto, 7);
    }//GEN-LAST:event_jtfAltoKeyTyped

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        Taller1.Programa04 programa04 = new Taller1.Programa04();
        
        try { 
            // Verificar si los campos de entrada están completos
            if (!Utilidades.camposCompletos(jtfAlto, jtfAncho)) {
                getToolkit().beep();
                Utilidades.mostrarMensaje("Debe ingresar todos los datos solicitados", "Datos Faltantes");
                jtfAlto.requestFocus();
            } else {
                // Si los campos están completos, pedir y validar los datos ingresados
                boolean datosValidos = programa04.PedirDatos(jtfAlto.getText(), jtfAncho.getText());
                
                if(datosValidos) {
                    // Si los datos son válidos, calcular el área y el perímetro del rectángulo y mostrar los resultados
                    double alto = programa04.getAlto();
                    double ancho = programa04.getAncho();        
                    double area = programa04.calcularArea();
                    double perimetro = programa04.calcularPerimetro();

                    ResultadoAlto.setText(Utilidades.DecimalFormato(alto, 3));
                    ResultadoAncho.setText(Utilidades.DecimalFormato(ancho, 3));
                    ResultadoArea.setText(Utilidades.DecimalFormato(area, 3) + "u²");
                    ResultadoPerimetro.setText(Utilidades.DecimalFormato(perimetro, 3));
                } else {
                    // Si los datos son válidos, calcular el área y el perímetro del rectángulo y mostrar los resultados
                    Utilidades.mostrarMensaje("El número ingresado es mayor a 9999 o inferior a 0", "Aviso");
                }                
            }
        } catch (HeadlessException e) {
            Utilidades.mostrarMensaje("Ha ocurrido un error con el dato [" + e + "], por favor verificar los datos ingresados", "¡Error!");
            jtfAlto.requestFocus();
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        Utilidades.establecerTooltip(btnLimpiar, "Borrar los datos");
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Utilidades.limpiarCampos(jtfAlto, jtfAncho);
        Utilidades.limpiarResultados(ResultadoAlto, ResultadoAncho, ResultadoArea, ResultadoPerimetro);
        jtfAlto.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jtfAnchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAnchoActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfAlto.requestFocus();
    }//GEN-LAST:event_jtfAnchoActionPerformed

    private void jtfAnchoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfAnchoKeyTyped
        Utilidades.validarNumDecimal(evt, jtfAncho, 3);
        Utilidades.ValidarLongitud(evt, jtfAncho, 7);
    }//GEN-LAST:event_jtfAnchoKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField ResultadoAlto;
    public static javax.swing.JTextField ResultadoAncho;
    public static javax.swing.JTextField ResultadoArea;
    public static javax.swing.JTextField ResultadoPerimetro;
    private javax.swing.JButton XCerrar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JTextField jtfAlto;
    public static javax.swing.JTextField jtfAncho;
    // End of variables declaration//GEN-END:variables
}
