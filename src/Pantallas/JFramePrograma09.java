package Pantallas;

import Taller1.Programa09;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;

public class JFramePrograma09 extends javax.swing.JFrame {

    private Programa09 coche;
    private AcelerarThread acelerarThread;
  
    public JFramePrograma09() {
        initComponents();
        this.coche = new Programa09();
        rMarca.setOpaque(false);
        rModelo.setOpaque(false);
        rVelocidad.setOpaque(false);
    }
    
    public class AcelerarThread extends Thread {
        // Variables miembro de la clase
        private Programa09 coche; // Objeto de la clase Programa09 que representa el coche
        private volatile boolean keepRunning; // Variable para mantener el estado del hilo (corriendo o detenido)
        private int incremento; // La cantidad en la que se incrementa la velocidad cada vez que se llama a acelerar
        private int velocidadInicial; // La velocidad inicial del coche

        /**
         * Constructor de la clase AcelerarThread
         * @param coche Objeto de la clase Programa09 que representa el coche
         * @param incremento La cantidad en la que se incrementa la velocidad cada vez que se llama a acelerar
         * @param velocidadInicial La velocidad inicial del coche
         */
        public AcelerarThread(Programa09 coche, int incremento, int velocidadInicial) {
            this.coche = coche;
            this.incremento = incremento;
            this.velocidadInicial = velocidadInicial;
            this.keepRunning = true; // El hilo comienza en estado "corriendo"
        }

        //Método principal del hilo que se ejecuta al llamar al método start()
        public void run() {
            int velocidadActual = velocidadInicial;
            while (keepRunning) {
                velocidadActual += incremento;
                coche.acelerar(incremento);
                rVelocidad.setText(Integer.toString(velocidadActual));
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        //Método para detener el hilo
        public void detener() {
            keepRunning = false; // Establece la variable keepRunning a false para detener el hilo
            coche.frenar(coche.getVelocidad()); // Llama al método frenar del coche para detenerlo
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        XCerrar1 = new javax.swing.JButton();
        btnMenu1 = new javax.swing.JButton();
        rMarca = new javax.swing.JTextField();
        rModelo = new javax.swing.JTextField();
        rVelocidad = new javax.swing.JTextField();
        btnAcelerar = new javax.swing.JButton();
        btnFrenar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        XCerrar = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        jtfMarca = new javax.swing.JTextField();
        jtfModelo = new javax.swing.JTextField();
        btnCapturar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jFrame1.setUndecorated(true);
        jFrame1.setSize(new java.awt.Dimension(968, 580));
        jFrame1.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        XCerrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantPrincipal/BotonX.png"))); // NOI18N
        XCerrar1.setBorder(null);
        XCerrar1.setBorderPainted(false);
        XCerrar1.setContentAreaFilled(false);
        XCerrar1.setDefaultCapable(false);
        XCerrar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        XCerrar1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantPrincipal/PresionarBtnX.png"))); // NOI18N
        XCerrar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantPrincipal/PasarBtnX.png"))); // NOI18N
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
        jFrame1.getContentPane().add(XCerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(919, 0, -1, 46));

        btnMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP01/btnMenu.png"))); // NOI18N
        btnMenu1.setBorder(null);
        btnMenu1.setBorderPainted(false);
        btnMenu1.setContentAreaFilled(false);
        btnMenu1.setDefaultCapable(false);
        btnMenu1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMenu1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP01/TocarMenu.png"))); // NOI18N
        btnMenu1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP01/PasarMenu.png"))); // NOI18N
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
        jFrame1.getContentPane().add(btnMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 55, 46));

        rMarca.setEditable(false);
        rMarca.setBackground(new java.awt.Color(0, 0, 0));
        rMarca.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        rMarca.setForeground(new java.awt.Color(255, 255, 255));
        rMarca.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rMarca.setAutoscrolls(false);
        rMarca.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rMarca.setCaretColor(new java.awt.Color(255, 255, 0));
        jFrame1.getContentPane().add(rMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 68, 275, 30));

        rModelo.setEditable(false);
        rModelo.setBackground(new java.awt.Color(0, 0, 0));
        rModelo.setFont(new java.awt.Font("Lucida Sans", 0, 24)); // NOI18N
        rModelo.setForeground(new java.awt.Color(255, 255, 255));
        rModelo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rModelo.setAutoscrolls(false);
        rModelo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rModelo.setCaretColor(new java.awt.Color(255, 255, 0));
        jFrame1.getContentPane().add(rModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 101, 260, 30));

        rVelocidad.setEditable(false);
        rVelocidad.setBackground(new java.awt.Color(0, 0, 0));
        rVelocidad.setFont(new java.awt.Font("Lucida Sans", 0, 28)); // NOI18N
        rVelocidad.setForeground(new java.awt.Color(255, 255, 255));
        rVelocidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rVelocidad.setAutoscrolls(false);
        rVelocidad.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        rVelocidad.setCaretColor(new java.awt.Color(255, 255, 0));
        jFrame1.getContentPane().add(rVelocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 338, 100, 30));

        btnAcelerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP079810/AcelerarNormal.png"))); // NOI18N
        btnAcelerar.setBorder(null);
        btnAcelerar.setBorderPainted(false);
        btnAcelerar.setContentAreaFilled(false);
        btnAcelerar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAcelerar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP079810/AcelerarTocar.png"))); // NOI18N
        btnAcelerar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP079810/AcelerarPasar.png"))); // NOI18N
        btnAcelerar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAcelerarMousePressed(evt);
            }
        });
        jFrame1.getContentPane().add(btnAcelerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(792, 314, 120, 235));

        btnFrenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP079810/FrenarNormal.png"))); // NOI18N
        btnFrenar.setBorder(null);
        btnFrenar.setBorderPainted(false);
        btnFrenar.setContentAreaFilled(false);
        btnFrenar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnFrenar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP079810/FrenarTocar.png"))); // NOI18N
        btnFrenar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP079810/FrenarPasar.png"))); // NOI18N
        btnFrenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFrenarActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(btnFrenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 439, 217, 114));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP079810/PantPrograma09_POV.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(671, 967));
        jFrame1.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 968, 587));

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

        jtfMarca.setBackground(new java.awt.Color(255, 255, 255));
        jtfMarca.setFont(new java.awt.Font("Lucida Sans", 0, 32)); // NOI18N
        jtfMarca.setForeground(new java.awt.Color(0, 0, 0));
        jtfMarca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfMarca.setToolTipText("");
        jtfMarca.setBorder(null);
        jtfMarca.setCaretColor(new java.awt.Color(217, 37, 52));
        jtfMarca.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtfMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfMarcaActionPerformed(evt);
            }
        });
        jtfMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfMarcaKeyTyped(evt);
            }
        });
        getContentPane().add(jtfMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 182, 410, 38));

        jtfModelo.setBackground(new java.awt.Color(255, 255, 255));
        jtfModelo.setFont(new java.awt.Font("Lucida Sans", 0, 32)); // NOI18N
        jtfModelo.setForeground(new java.awt.Color(0, 0, 0));
        jtfModelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfModelo.setToolTipText("");
        jtfModelo.setBorder(null);
        jtfModelo.setCaretColor(new java.awt.Color(217, 37, 52));
        jtfModelo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtfModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfModeloActionPerformed(evt);
            }
        });
        jtfModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfModeloKeyTyped(evt);
            }
        });
        getContentPane().add(jtfModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 237, 410, 38));

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
        getContentPane().add(btnCapturar, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 300, 318, 75));

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
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 300, 74, 75));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP079810/PantPrograma09.png"))); // NOI18N
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

    private void jtfMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfMarcaActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfModelo.requestFocus();
    }//GEN-LAST:event_jtfMarcaActionPerformed

    private void jtfMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfMarcaKeyTyped
        Utilidades.ValidarLongitud(evt, jtfMarca, 20);
    }//GEN-LAST:event_jtfMarcaKeyTyped

    private void jtfModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfModeloActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfMarca.requestFocus();
    }//GEN-LAST:event_jtfModeloActionPerformed

    private void jtfModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfModeloKeyTyped
        Utilidades.ValidarLongitud(evt, jtfModelo, 20);
    }//GEN-LAST:event_jtfModeloKeyTyped

    private void btnCapturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapturarActionPerformed
        Taller1.Programa09 programa09 = new Taller1.Programa09();
        
        try {
            if (!Utilidades.camposCompletos(jtfMarca, jtfModelo)) {
                getToolkit().beep();
                Utilidades.mostrarMensaje("Debe ingresar todos los datos solicitados", "Datos Faltantes");
                jtfMarca.requestFocus();
            } else {
                programa09.PedirDatos(jtfMarca.getText(), jtfModelo.getText());
                Utilidades.cambiarVentana(this, jFrame1, null);
                jFrame1.setLocationRelativeTo(null); 

                String marca = programa09.getMarca();
                String modelo = programa09.getModelo();
                int velocidad = programa09.getVelocidad();

                rMarca.setText(marca);
                rModelo.setText(modelo);
                rVelocidad.setText(String.valueOf(velocidad));
            }
        } catch (HeadlessException e) {
            Utilidades.mostrarMensaje("Ha ocurrido un error con el dato [" + e + "], por favor verificar los datos ingresados", "¡Error!");
            jtfMarca.requestFocus();
        }
    }//GEN-LAST:event_btnCapturarActionPerformed

    private void XCerrar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XCerrar1MouseEntered
        Utilidades.establecerTooltip(XCerrar, "Cerrar");
    }//GEN-LAST:event_XCerrar1MouseEntered

    private void XCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XCerrar1ActionPerformed
        if (Utilidades.mostrarDialogoConfirmacion("¿Está seguro de que desea salir de la aplicación?"))
            System.exit(0);
    }//GEN-LAST:event_XCerrar1ActionPerformed

    private void btnMenu1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenu1MouseEntered
        Utilidades.establecerTooltip(btnMenu, "Página Principal");
    }//GEN-LAST:event_btnMenu1MouseEntered

    private void btnMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenu1ActionPerformed
        JFramePantPrincipal PantPrincipal = new JFramePantPrincipal();
        Utilidades.cambiarVentana(jFrame1, PantPrincipal, null);
        if (acelerarThread != null) {
            acelerarThread.detener();
            acelerarThread = null;
        }
    }//GEN-LAST:event_btnMenu1ActionPerformed

    private void btnFrenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFrenarActionPerformed
        if (acelerarThread != null) {
            acelerarThread.detener();
            acelerarThread = null;
        }
        rVelocidad.setText("0");  // Actualiza el valor de la velocidad en la GUI a cero
    }//GEN-LAST:event_btnFrenarActionPerformed

    private void btnAcelerarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAcelerarMousePressed
        int incremento = 1;
        int velocidadInicial = coche.getVelocidad();
        if (acelerarThread == null || !acelerarThread.isAlive()) {
            acelerarThread = new AcelerarThread(coche, incremento, velocidadInicial);
            acelerarThread.start();
        }
    }//GEN-LAST:event_btnAcelerarMousePressed

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        Utilidades.establecerTooltip(btnLimpiar, "Borrar los datos");
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        Utilidades.limpiarCampos(jtfMarca, jtfModelo);
        Utilidades.limpiarResultados(rMarca, rModelo, rVelocidad);
        jtfMarca.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton XCerrar;
    private javax.swing.JButton XCerrar1;
    private javax.swing.JButton btnAcelerar;
    private javax.swing.JButton btnCapturar;
    private javax.swing.JButton btnFrenar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnMenu1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JTextField jtfMarca;
    public static javax.swing.JTextField jtfModelo;
    public static javax.swing.JTextField rMarca;
    public static javax.swing.JTextField rModelo;
    public static javax.swing.JTextField rVelocidad;
    // End of variables declaration//GEN-END:variables
}
