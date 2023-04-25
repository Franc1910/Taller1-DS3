package Pantallas;

import Taller1.Programa02;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;

public class JFramePrograma02 extends javax.swing.JFrame {

    public JFramePrograma02() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMenu = new javax.swing.JButton();
        XCerrar = new javax.swing.JButton();
        jtfNumFecha = new javax.swing.JTextField();
        btnActivarDia = new javax.swing.JButton();
        ResultadoDia = new javax.swing.JTextField();
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

        jtfNumFecha.setBackground(new java.awt.Color(255, 255, 255));
        jtfNumFecha.setFont(new java.awt.Font("Lucida Sans", 0, 50)); // NOI18N
        jtfNumFecha.setForeground(new java.awt.Color(0, 0, 0));
        jtfNumFecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfNumFecha.setToolTipText("");
        jtfNumFecha.setBorder(null);
        jtfNumFecha.setCaretColor(new java.awt.Color(217, 37, 52));
        jtfNumFecha.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtfNumFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNumFechaActionPerformed(evt);
            }
        });
        jtfNumFecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtfNumFechaKeyTyped(evt);
            }
        });
        getContentPane().add(jtfNumFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 250, 52, 53));

        btnActivarDia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP02/btnCalendario.png"))); // NOI18N
        btnActivarDia.setBorder(null);
        btnActivarDia.setBorderPainted(false);
        btnActivarDia.setContentAreaFilled(false);
        btnActivarDia.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnActivarDia.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP02/TocarCalendario.png"))); // NOI18N
        btnActivarDia.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP02/PasarCalendario.png"))); // NOI18N
        btnActivarDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivarDiaActionPerformed(evt);
            }
        });
        getContentPane().add(btnActivarDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(352, 244, 60, 60));

        ResultadoDia.setEditable(false);
        ResultadoDia.setBackground(new java.awt.Color(255, 255, 255));
        ResultadoDia.setFont(new java.awt.Font("Lucida Sans", 0, 28)); // NOI18N
        ResultadoDia.setForeground(new java.awt.Color(0, 0, 0));
        ResultadoDia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ResultadoDia.setAutoscrolls(false);
        ResultadoDia.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        ResultadoDia.setCaretColor(new java.awt.Color(255, 255, 0));
        getContentPane().add(ResultadoDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 334, 568, 44));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenPantP02/PantPrograma02.png"))); // NOI18N
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

    private void jtfNumFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNumFechaActionPerformed
        evt.setSource((char) KeyEvent.VK_CLEAR);
        jtfNumFecha.requestFocus();
        btnActivarDia.doClick();
    }//GEN-LAST:event_jtfNumFechaActionPerformed

    private void jtfNumFechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNumFechaKeyTyped
        char validar = evt.getKeyChar();
        if(!Character.isDigit(validar) || validar < '1' || validar > '7') {
            evt.consume();
        }
        
        Utilidades.ValidarLongitud(evt, jtfNumFecha, 1);
    }//GEN-LAST:event_jtfNumFechaKeyTyped

    private void btnActivarDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarDiaActionPerformed
        /*
        Esta función verifica si el campo de entrada jtfNumFecha está completo y, de ser así,
        convierte el valor de texto a número entero. Luego, utiliza la clase Programa02 para obtener
        el nombre del día correspondiente al número ingresado y muestra el resultado en el campo
        de salida ResultadoDia. Si el campo está vacío o se produce una excepción del tipo
        HeadlessException, muestra un mensaje de error.
        */
        Taller1.Programa02 programa02 = new Taller1.Programa02();
        
        try {
            if (!Utilidades.camposCompletos(jtfNumFecha)) {
                getToolkit().beep();
                Utilidades.mostrarMensaje("Debe ingresar el dato solicitado", "Dato Faltante");
                jtfNumFecha.requestFocus();
            } else {
                int numero = Integer.parseInt(jtfNumFecha.getText());
                
                programa02.PedirDatos(numero);                                 
                String dia = Programa02.obtenerDia(numero);
                
                Utilidades.limpiarCampos(jtfNumFecha);
                jtfNumFecha.requestFocus();

                ResultadoDia.setText("El número " + numero + " corresponde al día " + dia);
            }
        } catch (HeadlessException e) {
            Utilidades.mostrarMensaje("Ha ocurrido un error con el dato [" + e + "], por favor verificar los datos ingresados", "¡Error!");
            jtfNumFecha.requestFocus();
        }       
    }//GEN-LAST:event_btnActivarDiaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField ResultadoDia;
    private javax.swing.JButton XCerrar;
    private javax.swing.JButton btnActivarDia;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JTextField jtfNumFecha;
    // End of variables declaration//GEN-END:variables
}
