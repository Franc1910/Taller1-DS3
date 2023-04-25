package Pantallas;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;

public class JFramePrograma05 extends javax.swing.JFrame {

    public JFramePrograma05() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        XCerrar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jtfAltura = new javax.swing.JTextField();
        jtfBase = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        ResultadoAltura = new javax.swing.JTextField();
        ResultadoBase = new javax.swing.JTextField();
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

        jtfAltura.setBackground(new java.awt.Color(255, 255, 255));
        jtfAltura.setFont(new java.awt.Font("Lucida Sans", 0, 32)); // NOI18N
        jtfAltura.setForeground(new java.awt.Color(0, 0, 0));
        jtfAltura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfAltura.setToolTipText("");
        jtfAltura.setBorder(null);
        jtfAltura.setCaretColor(new java.awt.Color(217, 37, 52));
        jtfAltura.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtfAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfAlturaActionPerformed(evt);
            }
        });
        jtfAltura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfAlturaKeyTyped(evt);
            }
        });
        getContentPane().add(jtfAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 223, 145, 43));

        jtfBase.setBackground(new java.awt.Color(255, 255, 255));
        jtfBase.setFont(new java.awt.Font("Lucida Sans", 0, 32)); // NOI18N
        jtfBase.setForeground(new java.awt.Color(0, 0, 0));
        jtfBase.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfBase.setToolTipText("");
        jtfBase.setBorder(null);
        jtfBase.setCaretColor(new java.awt.Color(217, 37, 52));
        jtfBase.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtfBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfBaseActionPerformed(evt);
            }
        });
        jtfBase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfBaseKeyTyped(evt);
            }
        });
        getContentPane().add(jtfBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(432, 440, 145, 43));

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

        ResultadoAltura.setEditable(false);
        ResultadoAltura.setBackground(new java.awt.Color(247, 246, 249));
        ResultadoAltura.setFont(new java.awt.Font("Lucida Sans", 0, 34)); // NOI18N
        ResultadoAltura.setForeground(new java.awt.Color(0, 0, 0));
        ResultadoAltura.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ResultadoAltura.setAutoscrolls(false);
        ResultadoAltura.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ResultadoAltura.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(ResultadoAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 478, 250, 44));

        ResultadoBase.setEditable(false);
        ResultadoBase.setBackground(new java.awt.Color(247, 246, 249));
        ResultadoBase.setFont(new java.awt.Font("Lucida Sans", 0, 34)); // NOI18N
        ResultadoBase.setForeground(new java.awt.Color(0, 0, 0));
        ResultadoBase.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ResultadoBase.setAutoscrolls(false);
        ResultadoBase.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ResultadoBase.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(ResultadoBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 520, 250, 44));

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP0345/PantPrograma05.png"))); // NOI18N
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

    private void jtfAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfAlturaActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfBase.requestFocus();
    }//GEN-LAST:event_jtfAlturaActionPerformed

    private void jtfAlturaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfAlturaKeyTyped
        Utilidades.validarNumDecimal(evt, jtfAltura, 3);
        Utilidades.ValidarLongitud(evt, jtfAltura, 7);
    }//GEN-LAST:event_jtfAlturaKeyTyped

    private void jtfBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBaseActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfAltura.requestFocus();
    }//GEN-LAST:event_jtfBaseActionPerformed

    private void jtfBaseKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfBaseKeyTyped
        Utilidades.validarNumDecimal(evt, jtfBase, 3);
        Utilidades.ValidarLongitud(evt, jtfBase, 7);
    }//GEN-LAST:event_jtfBaseKeyTyped

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        Taller1.Programa05 programa05 = new Taller1.Programa05();
        
        try { 
            // Verificar si los campos de entrada están completos
            if (!Utilidades.camposCompletos(jtfAltura, jtfBase)) {
                getToolkit().beep();
                Utilidades.mostrarMensaje("Debe ingresar todos los datos solicitados", "Datos Faltantes");
                jtfAltura.requestFocus();
            } else {
                // Si los campos están completos, pedir y validar los datos ingresados
                boolean datosValidos = programa05.PedirDatos(jtfAltura.getText(), jtfBase.getText());
                
                if(datosValidos) {
                    // Si los datos son válidos, calcular el área y el perímetro del rectángulo y mostrar los resultados
                    double altura = programa05.getAltura();
                    double base = programa05.getBase();        
                    double area = programa05.calcularArea();
                    double perimetro = programa05.calcularPerimetro();

                    ResultadoAltura.setText(Utilidades.DecimalFormato(altura, 3));
                    ResultadoBase.setText(Utilidades.DecimalFormato(base, 3));
                    ResultadoArea.setText(Utilidades.DecimalFormato(area, 3) + "u²");
                    ResultadoPerimetro.setText(Utilidades.DecimalFormato(perimetro, 3));
                } else {
                    // Si los datos son válidos, calcular el área y el perímetro del rectángulo y mostrar los resultados
                    Utilidades.mostrarMensaje("El número ingresado es mayor a 9999 o inferior a 0", "Aviso");
                }                
            }
        } catch (HeadlessException e) {
            Utilidades.mostrarMensaje("Ha ocurrido un error con el dato [" + e + "], por favor verificar los datos ingresados", "¡Error!");
            jtfAltura.requestFocus();
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        Utilidades.establecerTooltip(btnLimpiar, "Borrar los datos");
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Utilidades.limpiarCampos(jtfAltura, jtfBase);
        Utilidades.limpiarResultados(ResultadoAltura, ResultadoBase, ResultadoArea, ResultadoPerimetro);
        jtfAltura.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField ResultadoAltura;
    public static javax.swing.JTextField ResultadoArea;
    public static javax.swing.JTextField ResultadoBase;
    public static javax.swing.JTextField ResultadoPerimetro;
    private javax.swing.JButton XCerrar;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JTextField jtfAltura;
    public static javax.swing.JTextField jtfBase;
    // End of variables declaration//GEN-END:variables
}
