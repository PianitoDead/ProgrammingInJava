/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulario;

//import javax.swing.ImageIcon;
/**
 *
 * @author Sistemas
 */
public class Form_Menu extends javax.swing.JFrame {

    /**
     * Creates new form Form_Menu
     */
    public Form_Menu() {
        initComponents();
        
        this.setExtendedState(MAXIMIZED_BOTH);
        
        /*ImageIcon icomnuSalir = new ImageIcon(getClass().getResource("/Imagenes/iconfinder_exit-to-app_326635"));
        mnuSalir.setIcon(icomnuSalir);*/
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        mnuSalir = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuEmpleado = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 153));
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 204));

        jMenu2.setBackground(new java.awt.Color(0, 0, 204));
        jMenu2.setText("Archivo");
        jMenu2.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N

        mnuSalir.setBackground(new java.awt.Color(204, 0, 0));
        mnuSalir.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        mnuSalir.setForeground(new java.awt.Color(51, 51, 255));
        mnuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconfinder_6_-_Cross_1815573.png"))); // NOI18N
        mnuSalir.setText("Salir");
        mnuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirActionPerformed(evt);
            }
        });
        jMenu2.add(mnuSalir);

        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(0, 0, 204));
        jMenu3.setText("Registo");
        jMenu3.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N

        mnuEmpleado.setBackground(new java.awt.Color(0, 0, 204));
        mnuEmpleado.setForeground(new java.awt.Color(204, 204, 0));
        mnuEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconfinder_provider_45019.png"))); // NOI18N
        mnuEmpleado.setText("Empleados");
        mnuEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEmpleadoActionPerformed(evt);
            }
        });
        jMenu3.add(mnuEmpleado);

        jMenuBar1.add(jMenu3);

        jMenu4.setBackground(new java.awt.Color(0, 0, 204));
        jMenu4.setText("Reportes");
        jMenu4.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu4);

        jMenu5.setBackground(new java.awt.Color(0, 0, 204));
        jMenu5.setText("Mantenimiento");
        jMenu5.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
    }//GEN-LAST:event_mnuSalirActionPerformed

    private void mnuEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEmpleadoActionPerformed
        // TODO add your handling code here:
        
        Form_Empleado Form1 = new Form_Empleado();
        
        Form1.setVisible(true);
        
        
    }//GEN-LAST:event_mnuEmpleadoActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem mnuEmpleado;
    private javax.swing.JMenuItem mnuSalir;
    // End of variables declaration//GEN-END:variables
}