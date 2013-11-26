
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
        btnDiario = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnPuesto = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

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
        btnCatalogo.setBounds(120, 120, 190, 100);
        jDesktopPane1.add(btnCatalogo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setBackground(new java.awt.Color(0, 51, 51));
        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 204, 255));
        jLabel1.setText("ADMINISTRACIÓN");
        jLabel1.setMaximumSize(new java.awt.Dimension(190, 26));
        jLabel1.setBounds(90, 70, 180, 22);
        jDesktopPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btnDiario.setFont(new java.awt.Font("Bookman Old Style", 1, 14)); // NOI18N
        btnDiario.setForeground(new java.awt.Color(204, 204, 0));
        btnDiario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/librodiario48.png"))); // NOI18N
        btnDiario.setText("Partida Libro Diario");
        btnDiario.setBorder(null);
        btnDiario.setBorderPainted(false);
        btnDiario.setContentAreaFilled(false);
        btnDiario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDiario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDiario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/librodiario48.png"))); // NOI18N
        btnDiario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/librodiario64.png"))); // NOI18N
        btnDiario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDiario.setBounds(360, 120, 170, 100);
        jDesktopPane1.add(btnDiario, javax.swing.JLayeredPane.DEFAULT_LAYER);

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
        btnClientes.setBounds(550, 120, 170, 100);
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
        btnProveedores.setBounds(730, 120, 170, 100);
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
        btnPuesto.setBounds(920, 120, 170, 100);
        jDesktopPane1.add(btnPuesto, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/config32.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/config32.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenespp/config48.png"))); // NOI18N
        jButton1.setBounds(1250, 620, 100, 60);
        jDesktopPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1362, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClientesActionPerformed

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
    private javax.swing.JButton btnDiario;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnPuesto;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
