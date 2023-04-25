package Pantallas;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;

public class JFramePrograma03 extends javax.swing.JFrame {

    public JFramePrograma03() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        XCerrar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jtfColor = new javax.swing.JTextField();
        jtfRadio = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        ResultadoColor = new javax.swing.JTextField();
        ResultadoRadio = new javax.swing.JTextField();
        ResultadoArea = new javax.swing.JTextField();
        ResultadoPerimetro = new javax.swing.JTextField();
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

        jtfColor.setBackground(new java.awt.Color(255, 255, 255));
        jtfColor.setFont(new java.awt.Font("Lucida Sans", 0, 34)); // NOI18N
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
        getContentPane().add(jtfColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 182, 403, 44));

        jtfRadio.setBackground(new java.awt.Color(255, 255, 255));
        jtfRadio.setFont(new java.awt.Font("Lucida Sans", 0, 32)); // NOI18N
        jtfRadio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfRadio.setToolTipText("");
        jtfRadio.setBorder(null);
        jtfRadio.setCaretColor(new java.awt.Color(217, 37, 52));
        jtfRadio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtfRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfRadioActionPerformed(evt);
            }
        });
        jtfRadio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfRadioKeyTyped(evt);
            }
        });
        getContentPane().add(jtfRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 314, 160, 43));

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
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 390, 298, 92));

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
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(301, 804, 72, 74));

        ResultadoColor.setEditable(false);
        ResultadoColor.setBackground(new java.awt.Color(247, 246, 249));
        ResultadoColor.setFont(new java.awt.Font("Lucida Sans", 0, 34)); // NOI18N
        ResultadoColor.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ResultadoColor.setAutoscrolls(false);
        ResultadoColor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ResultadoColor.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(ResultadoColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 499, 290, 44));

        ResultadoRadio.setEditable(false);
        ResultadoRadio.setBackground(new java.awt.Color(247, 246, 249));
        ResultadoRadio.setFont(new java.awt.Font("Lucida Sans", 0, 34)); // NOI18N
        ResultadoRadio.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ResultadoRadio.setAutoscrolls(false);
        ResultadoRadio.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ResultadoRadio.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(ResultadoRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 542, 250, 44));

        ResultadoArea.setEditable(false);
        ResultadoArea.setBackground(new java.awt.Color(255, 255, 255));
        ResultadoArea.setFont(new java.awt.Font("Lucida Sans", 0, 26)); // NOI18N
        ResultadoArea.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ResultadoArea.setAutoscrolls(false);
        ResultadoArea.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ResultadoArea.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(ResultadoArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 883, 240, 40));

        ResultadoPerimetro.setEditable(false);
        ResultadoPerimetro.setBackground(new java.awt.Color(255, 255, 255));
        ResultadoPerimetro.setFont(new java.awt.Font("Lucida Sans", 0, 26)); // NOI18N
        ResultadoPerimetro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ResultadoPerimetro.setAutoscrolls(false);
        ResultadoPerimetro.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ResultadoPerimetro.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(ResultadoPerimetro, new org.netbeans.lib.awtextra.AbsoluteConstraints(384, 883, 240, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP0345/PantPrograma03.png"))); // NOI18N
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

    private void jtfRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfRadioActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfColor.requestFocus();
    }//GEN-LAST:event_jtfRadioActionPerformed

    private void jtfRadioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfRadioKeyTyped
        Utilidades.validarNumDecimal(evt, jtfRadio, 3);
        Utilidades.ValidarLongitud(evt, jtfRadio, 7);
    }//GEN-LAST:event_jtfRadioKeyTyped

    private void jtfColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfColorActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfRadio.requestFocus();
    }//GEN-LAST:event_jtfColorActionPerformed

    private void jtfColorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfColorKeyTyped
        Utilidades.ValidarLongitud(evt, jtfColor, 22);
    }//GEN-LAST:event_jtfColorKeyTyped

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        Taller1.Programa03 programa03 = new Taller1.Programa03();
        
        try { 
            // Verificar si los campos de entrada están completos
            if (!Utilidades.camposCompletos(jtfColor, jtfRadio)) {
            getToolkit().beep();
            Utilidades.mostrarMensaje("Debe ingresar todos los datos solicitados", "Datos Faltantes");
            jtfColor.requestFocus();
            } else {
                // Si los campos están completos, pedir y validar los datos ingresados
                boolean datosValidos = programa03.PedirDatos(jtfColor.getText(), jtfRadio.getText());
                
                if(datosValidos) {
                    // Si los datos son válidos, calcular el área y el perímetro del círculo y mostrar los resultados
                    String color = programa03.getColor();
                    double radio = programa03.getRadio();        
                    double area = programa03.calcularArea();
                    double perimetro = programa03.calcularPerimetro();

                    ResultadoColor.setText(color);
                    ResultadoRadio.setText(Utilidades.DecimalFormato(radio, 3));
                    ResultadoArea.setText(Utilidades.DecimalFormato(area, 3) + "u²");
                    ResultadoPerimetro.setText(Utilidades.DecimalFormato(perimetro, 3));
                } else {
                    // Si los datos son válidos, calcular el área y el perímetro del círculo y mostrar los resultados
                    Utilidades.mostrarMensaje("El número ingresado es mayor a 9999 o inferior a 0", "Aviso");
                }                
            }
        } catch (HeadlessException e) {
            Utilidades.mostrarMensaje("Ha ocurrido un error con el dato [" + e + "], por favor verificar los datos ingresados", "¡Error!");
            jtfColor.requestFocus();
        } 
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        Utilidades.establecerTooltip(btnLimpiar, "Borrar los datos");
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Utilidades.limpiarCampos(jtfColor, jtfRadio);
        Utilidades.limpiarResultados(ResultadoColor, ResultadoRadio, ResultadoArea, ResultadoPerimetro);
        jtfColor.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField ResultadoArea;
    public static javax.swing.JTextField ResultadoColor;
    public static javax.swing.JTextField ResultadoPerimetro;
    public static javax.swing.JTextField ResultadoRadio;
    private javax.swing.JButton XCerrar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JTextField jtfColor;
    public static javax.swing.JTextField jtfRadio;
    // End of variables declaration//GEN-END:variables
}
