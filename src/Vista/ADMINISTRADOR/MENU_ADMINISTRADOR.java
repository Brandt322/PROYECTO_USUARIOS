
package Vista.ADMINISTRADOR;

public class MENU_ADMINISTRADOR extends javax.swing.JFrame {

    public MENU_ADMINISTRADOR() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        ComboMenuSalir = new javax.swing.JCheckBoxMenuItem();
        jMenu2 = new javax.swing.JMenu();
        ComboMenuRegistro = new javax.swing.JCheckBoxMenuItem();
        ComboMenuConfiguracion = new javax.swing.JCheckBoxMenuItem();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Archivo");

        ComboMenuSalir.setSelected(true);
        ComboMenuSalir.setText("SALIR");
        ComboMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboMenuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(ComboMenuSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Configuracion");

        ComboMenuRegistro.setSelected(true);
        ComboMenuRegistro.setText("Registrar usuarios");
        ComboMenuRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboMenuRegistroActionPerformed(evt);
            }
        });
        jMenu2.add(ComboMenuRegistro);

        ComboMenuConfiguracion.setSelected(true);
        ComboMenuConfiguracion.setText("Modificar datos de usuario");
        ComboMenuConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboMenuConfiguracionActionPerformed(evt);
            }
        });
        jMenu2.add(ComboMenuConfiguracion);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 326, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 203, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboMenuRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboMenuRegistroActionPerformed
        REGISTRAR fr=new REGISTRAR();
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
    }//GEN-LAST:event_ComboMenuRegistroActionPerformed

    private void ComboMenuConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboMenuConfiguracionActionPerformed
        MODIFICAR_ADMIN fr=new MODIFICAR_ADMIN();
        fr.setLocationRelativeTo(null);
        fr.setVisible(true);
    }//GEN-LAST:event_ComboMenuConfiguracionActionPerformed

    private void ComboMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboMenuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ComboMenuSalirActionPerformed

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
            java.util.logging.Logger.getLogger(MENU_ADMINISTRADOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENU_ADMINISTRADOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENU_ADMINISTRADOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENU_ADMINISTRADOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENU_ADMINISTRADOR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem ComboMenuConfiguracion;
    private javax.swing.JCheckBoxMenuItem ComboMenuRegistro;
    private javax.swing.JCheckBoxMenuItem ComboMenuSalir;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
