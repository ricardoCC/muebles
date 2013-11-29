
package sic;


public class PantallaPrincipal extends javax.swing.JFrame {

    public PantallaPrincipal() {
        initComponents();
        Fecha hilo = new Fecha(LabelFecha);
        hilo.start();
        
    }
    
        
    @SuppressWarnings("unchecked")
  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        LabelFecha = new javax.swing.JLabel();
        btnCatalogo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnReporteDiario = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnPuesto = new javax.swing.JButton();
        btnConfiguracion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnempleados = new javax.swing.JButton();
        btnReporteMayorizacion = new javax.swing.JButton();
        btnDiario1 = new javax.swing.JButton();
        btnReporteClientes = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        LabelFecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LabelFecha.setForeground(new java.awt.Color(204, 204, 255));
        LabelFecha.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        LabelFecha.setText("fecha");
        LabelFecha.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        LabelFecha.setBounds(1020, 20, 330, 30);
        jDesktopPane1.add(LabelFecha, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnCatalogo.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnCatalogo.setForeground(new java.awt.Color(204, 204, 0));
        btnCatalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/catalogo48.png"))); // NOI18N
        btnCatalogo.setText("Catalogo de Cuentas");
        btnCatalogo.setBorderPainted(false);
        btnCatalogo.setContentAreaFilled(false);
        btnCatalogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCatalogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCatalogo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/catalogo48.png"))); // NOI18N
        btnCatalogo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/catalogo64.png"))); // NOI18N
        btnCatalogo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCatalogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCatalogoMouseClicked(evt);
            }
        });
        btnCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatalogoActionPerformed(evt);
            }
        });
        btnCatalogo.setBounds(110, 150, 190, 100);
        jDesktopPane1.add(btnCatalogo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 204, 255));
        jLabel1.setText("ADMINISTRACIÓN");
        jLabel1.setMaximumSize(new java.awt.Dimension(190, 26));
        jLabel1.setBounds(70, 100, 180, 22);
        jDesktopPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnReporteDiario.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnReporteDiario.setForeground(new java.awt.Color(204, 204, 0));
        btnReporteDiario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/librodiario48.png"))); // NOI18N
        btnReporteDiario.setText("Libro Diario");
        btnReporteDiario.setBorder(null);
        btnReporteDiario.setBorderPainted(false);
        btnReporteDiario.setContentAreaFilled(false);
        btnReporteDiario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReporteDiario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReporteDiario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/librodiario48.png"))); // NOI18N
        btnReporteDiario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/librodiario64.png"))); // NOI18N
        btnReporteDiario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReporteDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteDiarioActionPerformed(evt);
            }
        });
        btnReporteDiario.setBounds(100, 360, 170, 100);
        jDesktopPane1.add(btnReporteDiario, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnClientes.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(204, 204, 0));
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/client48.png"))); // NOI18N
        btnClientes.setText("Clientes");
        btnClientes.setBorderPainted(false);
        btnClientes.setContentAreaFilled(false);
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnClientes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/client48.png"))); // NOI18N
        btnClientes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/cliente64.png"))); // NOI18N
        btnClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        btnClientes.setBounds(540, 150, 170, 100);
        jDesktopPane1.add(btnClientes, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnProveedores.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnProveedores.setForeground(new java.awt.Color(204, 204, 0));
        btnProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/proveedores48.png"))); // NOI18N
        btnProveedores.setText("Proveedores");
        btnProveedores.setBorderPainted(false);
        btnProveedores.setContentAreaFilled(false);
        btnProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProveedores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnProveedores.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/proveedores48.png"))); // NOI18N
        btnProveedores.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/proveedores64.png"))); // NOI18N
        btnProveedores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });
        btnProveedores.setBounds(720, 150, 170, 100);
        jDesktopPane1.add(btnProveedores, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnPuesto.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnPuesto.setForeground(new java.awt.Color(204, 204, 0));
        btnPuesto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/puestos48.png"))); // NOI18N
        btnPuesto.setText("Puestos");
        btnPuesto.setBorderPainted(false);
        btnPuesto.setContentAreaFilled(false);
        btnPuesto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPuesto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPuesto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/puestos48.png"))); // NOI18N
        btnPuesto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/puestos64.png"))); // NOI18N
        btnPuesto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuestoActionPerformed(evt);
            }
        });
        btnPuesto.setBounds(900, 150, 170, 100);
        jDesktopPane1.add(btnPuesto, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/config32.png"))); // NOI18N
        btnConfiguracion.setBorderPainted(false);
        btnConfiguracion.setContentAreaFilled(false);
        btnConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfiguracion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/config32.png"))); // NOI18N
        btnConfiguracion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/config48.png"))); // NOI18N
        btnConfiguracion.setBounds(1250, 620, 100, 60);
        jDesktopPane1.add(btnConfiguracion, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setBackground(new java.awt.Color(0, 51, 51));
        jLabel2.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 204, 255));
        jLabel2.setText("REPORTES");
        jLabel2.setBounds(80, 310, 130, 22);
        jDesktopPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnempleados.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnempleados.setForeground(new java.awt.Color(204, 204, 0));
        btnempleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/empleado48.png"))); // NOI18N
        btnempleados.setText("Empleados");
        btnempleados.setBorderPainted(false);
        btnempleados.setContentAreaFilled(false);
        btnempleados.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnempleados.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnempleados.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/empleado48.png"))); // NOI18N
        btnempleados.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/empleado64.png"))); // NOI18N
        btnempleados.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnempleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnempleadosActionPerformed(evt);
            }
        });
        btnempleados.setBounds(1060, 150, 170, 100);
        jDesktopPane1.add(btnempleados, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnReporteMayorizacion.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnReporteMayorizacion.setForeground(new java.awt.Color(204, 204, 0));
        btnReporteMayorizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/libromayor48.png"))); // NOI18N
        btnReporteMayorizacion.setText("Mayorización");
        btnReporteMayorizacion.setBorderPainted(false);
        btnReporteMayorizacion.setContentAreaFilled(false);
        btnReporteMayorizacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReporteMayorizacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReporteMayorizacion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/libromayor48.png"))); // NOI18N
        btnReporteMayorizacion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/libromayor64.png"))); // NOI18N
        btnReporteMayorizacion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReporteMayorizacion.setBounds(330, 360, 170, 100);
        jDesktopPane1.add(btnReporteMayorizacion, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnDiario1.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnDiario1.setForeground(new java.awt.Color(204, 204, 0));
        btnDiario1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/librodiario48.png"))); // NOI18N
        btnDiario1.setText("Partida Libro Diario");
        btnDiario1.setBorder(null);
        btnDiario1.setBorderPainted(false);
        btnDiario1.setContentAreaFilled(false);
        btnDiario1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDiario1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDiario1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/librodiario48.png"))); // NOI18N
        btnDiario1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/librodiario64.png"))); // NOI18N
        btnDiario1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDiario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiario1ActionPerformed(evt);
            }
        });
        btnDiario1.setBounds(350, 150, 170, 100);
        jDesktopPane1.add(btnDiario1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnReporteClientes.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnReporteClientes.setForeground(new java.awt.Color(204, 204, 0));
        btnReporteClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/reportecliente48.png"))); // NOI18N
        btnReporteClientes.setText("Clientes");
        btnReporteClientes.setBorderPainted(false);
        btnReporteClientes.setContentAreaFilled(false);
        btnReporteClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReporteClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReporteClientes.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/reportecliente48.png"))); // NOI18N
        btnReporteClientes.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/reportecliente64.png"))); // NOI18N
        btnReporteClientes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnReporteClientes.setBounds(540, 360, 170, 100);
        jDesktopPane1.add(btnReporteClientes, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/rproveedores48.png"))); // NOI18N
        jButton1.setText("Proveedores");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/rproveedores48.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/reporteproveedores64.png"))); // NOI18N
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.setBounds(730, 360, 170, 100);
        jDesktopPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 204, 0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/planilla48.png"))); // NOI18N
        jButton2.setText("Planilla de Pagos");
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/planilla48.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/planilla64.png"))); // NOI18N
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.setBounds(970, 360, 170, 100);
        jDesktopPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1361, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
         Clientes cli = new Clientes();
         cli.setVisible(true);
         
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnReporteDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteDiarioActionPerformed
        
    }//GEN-LAST:event_btnReporteDiarioActionPerformed

    private void btnCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatalogoActionPerformed
        Cuenta cta = new Cuenta();
        cta.setVisible(true);
    }//GEN-LAST:event_btnCatalogoActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        Proveedores prov = new Proveedores();
        prov.setVisible(true);
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btnPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuestoActionPerformed
       Puestos puestos = new Puestos();
       puestos.setVisible(true);
    }//GEN-LAST:event_btnPuestoActionPerformed

    private void btnempleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnempleadosActionPerformed
        Empleado emp = new Empleado();
        emp.setVisible(true);
    }//GEN-LAST:event_btnempleadosActionPerformed

    private void btnCatalogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCatalogoMouseClicked
         //Clientes clientes = new Clientes();
    }//GEN-LAST:event_btnCatalogoMouseClicked

    private void btnDiario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiario1ActionPerformed
       Diario d = new Diario();
        d.setVisible(true);
    }//GEN-LAST:event_btnDiario1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelFecha;
    private javax.swing.JButton btnCatalogo;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnDiario1;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnPuesto;
    private javax.swing.JButton btnReporteClientes;
    private javax.swing.JButton btnReporteDiario;
    private javax.swing.JButton btnReporteMayorizacion;
    private javax.swing.JButton btnempleados;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
