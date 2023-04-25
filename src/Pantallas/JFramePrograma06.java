package Pantallas;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;

public class JFramePrograma06 extends javax.swing.JFrame {

    public JFramePrograma06() {
        initComponents();
    }
    
    Taller1.Programa06 programa06 = new Taller1.Programa06();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame2 = new javax.swing.JFrame();
        btnMenu1 = new javax.swing.JButton();
        XCerrar1 = new javax.swing.JButton();
        btnRetirar = new javax.swing.JButton();
        btnDepositar = new javax.swing.JButton();
        ResultadoNombreTitular = new javax.swing.JTextField();
        ResultadoNumeroCuenta = new javax.swing.JTextField();
        ResultadoSaldo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        XCerrar = new javax.swing.JButton();
        jtfNombreTitular = new javax.swing.JTextField();
        jtfNumeroCuenta = new javax.swing.JTextField();
        jtfSaldo = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jFrame2.setLocation(new java.awt.Point(0, 0));
        jFrame2.setUndecorated(true);
        jFrame2.setPreferredSize(new java.awt.Dimension(1000, 1000));
        jFrame2.setSize(new java.awt.Dimension(1065, 596));
        jFrame2.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP06/MenuNormal.png"))); // NOI18N
        btnMenu1.setBorder(null);
        btnMenu1.setBorderPainted(false);
        btnMenu1.setContentAreaFilled(false);
        btnMenu1.setDefaultCapable(false);
        btnMenu1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMenu1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP06/MenuTocar.png"))); // NOI18N
        btnMenu1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP06/MenuPasar.png"))); // NOI18N
        btnMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenu1MouseEntered(evt);
            }
        });
        btnMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenu1ActionPerformed(evt);
            }
        });
        jFrame2.getContentPane().add(btnMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 202, 111));

        XCerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP06/SalirNormal.png"))); // NOI18N
        XCerrar1.setBorder(null);
        XCerrar1.setBorderPainted(false);
        XCerrar1.setContentAreaFilled(false);
        XCerrar1.setDefaultCapable(false);
        XCerrar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        XCerrar1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP06/SalirTocar.png"))); // NOI18N
        XCerrar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP06/SalirPasar.png"))); // NOI18N
        XCerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                XCerrar1MouseEntered(evt);
            }
        });
        XCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XCerrar1ActionPerformed(evt);
            }
        });
        jFrame2.getContentPane().add(XCerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 202, 111));

        btnRetirar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP06/RetirarNormal.png"))); // NOI18N
        btnRetirar.setBorder(null);
        btnRetirar.setBorderPainted(false);
        btnRetirar.setContentAreaFilled(false);
        btnRetirar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRetirar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP06/RetirarTocar.png"))); // NOI18N
        btnRetirar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP06/RetirarPasar.png"))); // NOI18N
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });
        jFrame2.getContentPane().add(btnRetirar, new org.netbeans.lib.awtextra.AbsoluteConstraints(712, 445, 301, 96));

        btnDepositar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP06/DepositarNormal.png"))); // NOI18N
        btnDepositar.setBorder(null);
        btnDepositar.setBorderPainted(false);
        btnDepositar.setContentAreaFilled(false);
        btnDepositar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDepositar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP06/DepositarTocar.png"))); // NOI18N
        btnDepositar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP06/DepositarPasar.png"))); // NOI18N
        btnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarActionPerformed(evt);
            }
        });
        jFrame2.getContentPane().add(btnDepositar, new org.netbeans.lib.awtextra.AbsoluteConstraints(712, 300, 301, 96));

        ResultadoNombreTitular.setEditable(false);
        ResultadoNombreTitular.setBackground(new java.awt.Color(247, 246, 249));
        ResultadoNombreTitular.setFont(new java.awt.Font("Lucida Sans", 1, 26)); // NOI18N
        ResultadoNombreTitular.setForeground(new java.awt.Color(0, 0, 0));
        ResultadoNombreTitular.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ResultadoNombreTitular.setAutoscrolls(false);
        ResultadoNombreTitular.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ResultadoNombreTitular.setCaretColor(new java.awt.Color(255, 255, 0));
        jFrame2.getContentPane().add(ResultadoNombreTitular, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 430, 40));

        ResultadoNumeroCuenta.setEditable(false);
        ResultadoNumeroCuenta.setBackground(new java.awt.Color(247, 246, 249));
        ResultadoNumeroCuenta.setFont(new java.awt.Font("Lucida Sans", 1, 26)); // NOI18N
        ResultadoNumeroCuenta.setForeground(new java.awt.Color(0, 0, 0));
        ResultadoNumeroCuenta.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ResultadoNumeroCuenta.setAutoscrolls(false);
        ResultadoNumeroCuenta.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ResultadoNumeroCuenta.setCaretColor(new java.awt.Color(255, 255, 0));
        jFrame2.getContentPane().add(ResultadoNumeroCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 430, 40));

        ResultadoSaldo.setEditable(false);
        ResultadoSaldo.setBackground(new java.awt.Color(247, 246, 249));
        ResultadoSaldo.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
        ResultadoSaldo.setForeground(new java.awt.Color(0, 0, 0));
        ResultadoSaldo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ResultadoSaldo.setAutoscrolls(false);
        ResultadoSaldo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ResultadoSaldo.setCaretColor(new java.awt.Color(255, 255, 0));
        jFrame2.getContentPane().add(ResultadoSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 340, 40));

        jLabel2.setBackground(new java.awt.Color(153, 0, 153));
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP06/PantallaProblema06_2.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(671, 967));
        jFrame2.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1065, 596));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP06/MenuNormal.png"))); // NOI18N
        btnMenu.setBorder(null);
        btnMenu.setBorderPainted(false);
        btnMenu.setContentAreaFilled(false);
        btnMenu.setDefaultCapable(false);
        btnMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMenu.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP06/MenuTocar.png"))); // NOI18N
        btnMenu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP06/MenuPasar.png"))); // NOI18N
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
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 202, 111));

        XCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP06/SalirNormal.png"))); // NOI18N
        XCerrar.setBorder(null);
        XCerrar.setBorderPainted(false);
        XCerrar.setContentAreaFilled(false);
        XCerrar.setDefaultCapable(false);
        XCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        XCerrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP06/SalirTocar.png"))); // NOI18N
        XCerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP06/SalirPasar.png"))); // NOI18N
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
        getContentPane().add(XCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 488, 202, 111));

        jtfNombreTitular.setBackground(new java.awt.Color(255, 255, 255));
        jtfNombreTitular.setFont(new java.awt.Font("Lucida Sans", 0, 38)); // NOI18N
        jtfNombreTitular.setForeground(new java.awt.Color(0, 0, 0));
        jtfNombreTitular.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfNombreTitular.setToolTipText("");
        jtfNombreTitular.setBorder(null);
        jtfNombreTitular.setCaretColor(new java.awt.Color(217, 37, 52));
        jtfNombreTitular.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtfNombreTitular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreTitularActionPerformed(evt);
            }
        });
        jtfNombreTitular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNombreTitularKeyTyped(evt);
            }
        });
        getContentPane().add(jtfNombreTitular, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 220, 754, 46));

        jtfNumeroCuenta.setBackground(new java.awt.Color(255, 255, 255));
        jtfNumeroCuenta.setFont(new java.awt.Font("Lucida Sans", 0, 38)); // NOI18N
        jtfNumeroCuenta.setForeground(new java.awt.Color(0, 0, 0));
        jtfNumeroCuenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfNumeroCuenta.setToolTipText("");
        jtfNumeroCuenta.setBorder(null);
        jtfNumeroCuenta.setCaretColor(new java.awt.Color(217, 37, 52));
        jtfNumeroCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtfNumeroCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNumeroCuentaActionPerformed(evt);
            }
        });
        jtfNumeroCuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNumeroCuentaKeyTyped(evt);
            }
        });
        getContentPane().add(jtfNumeroCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 358, 754, 46));

        jtfSaldo.setBackground(new java.awt.Color(255, 255, 255));
        jtfSaldo.setFont(new java.awt.Font("Lucida Sans", 0, 38)); // NOI18N
        jtfSaldo.setForeground(new java.awt.Color(0, 0, 0));
        jtfSaldo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfSaldo.setToolTipText("");
        jtfSaldo.setBorder(null);
        jtfSaldo.setCaretColor(new java.awt.Color(217, 37, 52));
        jtfSaldo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtfSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSaldoActionPerformed(evt);
            }
        });
        jtfSaldo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfSaldoKeyTyped(evt);
            }
        });
        getContentPane().add(jtfSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 497, 310, 46));

        btnCalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP06/AccederNormal.png"))); // NOI18N
        btnCalcular.setBorder(null);
        btnCalcular.setBorderPainted(false);
        btnCalcular.setContentAreaFilled(false);
        btnCalcular.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCalcular.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP06/AccederTocar.png"))); // NOI18N
        btnCalcular.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP06/AccederPasar.png"))); // NOI18N
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(712, 547, 298, 92));

        jLabel1.setBackground(new java.awt.Color(153, 0, 153));
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP06/PantallaProblema06_1.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(671, 967));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1064, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNombreTitularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreTitularActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfNumeroCuenta.requestFocus();
    }//GEN-LAST:event_jtfNombreTitularActionPerformed

    private void jtfNombreTitularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNombreTitularKeyTyped
        Utilidades.ValidarLongitud(evt, jtfNombreTitular, 30);
    }//GEN-LAST:event_jtfNombreTitularKeyTyped

    private void jtfNumeroCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNumeroCuentaActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfSaldo.requestFocus();
    }//GEN-LAST:event_jtfNumeroCuentaActionPerformed

    private void jtfNumeroCuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNumeroCuentaKeyTyped
        Utilidades.ValidarNumero(evt);
        Utilidades.ValidarLongitud(evt, jtfNumeroCuenta, 20);
    }//GEN-LAST:event_jtfNumeroCuentaKeyTyped

    private void jtfSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSaldoActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfNombreTitular.requestFocus();
    }//GEN-LAST:event_jtfSaldoActionPerformed

    private void jtfSaldoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfSaldoKeyTyped
        Utilidades.validarNumDecimal(evt, jtfSaldo, 2);
        Utilidades.ValidarLongitud(evt, jtfSaldo, 7);
    }//GEN-LAST:event_jtfSaldoKeyTyped

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        try {
            if (!Utilidades.camposCompletos(jtfNombreTitular, jtfNumeroCuenta, jtfSaldo)) {
                getToolkit().beep();
                Utilidades.mostrarMensaje("Debe ingresar todos los datos solicitados", "Datos Faltantes");
                jtfNombreTitular.requestFocus();
            } else {
                boolean datosValidos = programa06.PedirDatos(jtfNombreTitular.getText(), jtfNumeroCuenta.getText(), jtfSaldo.getText());

                    // Si los datos son válidos (es decir, si el saldo es mayor a 0 y menor o igual a 1000), se asignan los valores de la cuenta a las variables correspondientes.
                    if(datosValidos) {
                        String nombretitular = programa06.getNombreTitular();
                        String numerocuenta = programa06.getNumeroCuenta();
                        double saldo = programa06.getSaldo();

                        // Se cambia a la ventana secundaria y se actualizan las etiquetas de texto con los valores de la cuenta.
                        Utilidades.cambiarVentana(this, jFrame2, null);
                        jFrame2.setLocationRelativeTo(null);
                        ResultadoNombreTitular.setText(nombretitular);
                        ResultadoNumeroCuenta.setText(numerocuenta);
                        ResultadoSaldo.setText(Utilidades.DecimalDinero(saldo));                                      
                    } else {
                        // Si los datos no son válidos (es decir, si el saldo es menor o igual a 0 o mayor a 1000), se muestra un mensaje de error en la ventana principal.
                        Utilidades.mostrarMensaje("El número ingresado es menor/igual a 0 o mayor a 1000", "Aviso");
                    }
                }

        } catch (HeadlessException e) {
            Utilidades.mostrarMensaje("Ha ocurrido un error con el dato [" + e + "], por favor verificar los datos ingresados", "¡Error!");
            jtfNombreTitular.requestFocus();
        }
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed
        programa06.depositar();
        ResultadoSaldo.setText(Utilidades.DecimalDinero(programa06.getSaldo()));
    }//GEN-LAST:event_btnDepositarActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        programa06.retirar();
        ResultadoSaldo.setText(Utilidades.DecimalDinero(programa06.getSaldo()));
    }//GEN-LAST:event_btnRetirarActionPerformed

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

    private void btnMenu1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenu1MouseEntered
        Utilidades.establecerTooltip(btnMenu, "Página Principal");
    }//GEN-LAST:event_btnMenu1MouseEntered

    private void btnMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenu1ActionPerformed
        JFramePantPrincipal PantPrincipal = new JFramePantPrincipal();
        Utilidades.cambiarVentana(jFrame2, PantPrincipal, null);
    }//GEN-LAST:event_btnMenu1ActionPerformed

    private void XCerrar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XCerrar1MouseEntered
        Utilidades.establecerTooltip(XCerrar, "Cerrar");
    }//GEN-LAST:event_XCerrar1MouseEntered

    private void XCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XCerrar1ActionPerformed
        if (Utilidades.mostrarDialogoConfirmacion("¿Está seguro de que desea salir de la aplicación?"))
        System.exit(0);
    }//GEN-LAST:event_XCerrar1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField ResultadoNombreTitular;
    public static javax.swing.JTextField ResultadoNumeroCuenta;
    public static javax.swing.JTextField ResultadoSaldo;
    private javax.swing.JButton XCerrar;
    private javax.swing.JButton XCerrar1;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnMenu1;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JTextField jtfNombreTitular;
    public static javax.swing.JTextField jtfNumeroCuenta;
    public static javax.swing.JTextField jtfSaldo;
    // End of variables declaration//GEN-END:variables
}
