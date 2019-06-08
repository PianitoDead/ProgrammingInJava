/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulario;

import Clases.Autores;
import Clases.Libro;
import javax.swing.JOptionPane;

/**
 *
 * @author Sistemas
 */
public class Form_Autor extends javax.swing.JFrame {

    /**
     * Creates new form Autor
     */
    public Form_Autor() {
        initComponents();
    }
    
    public void Habilitar (){
        txtNombreAutor.setEnabled(true);
        txtNacionalidad.setEnabled(true);
        txtFecha.setEnabled(true);
    }
    
    public void Inhabilitar (){
        txtNombreAutor.setEnabled(false);
        txtNacionalidad.setEnabled(false);
        txtFecha.setEnabled(false);
        
        txtNombreAutor.setText("");
        txtNacionalidad.setText("");
        txtFecha.setText("");
        
    }
    
    public void Desicion (){
        
        
        if(txtNombreAutor.getText().length()==0){
           // JOptionPane.showConfirmDialog(rootPane, "Debe ingresar el Nombre del Autor.");
            
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar el Nombre del Autor.", "ERROR" , JOptionPane.WARNING_MESSAGE);
            txtNombreAutor.requestFocus();
            return;
        }

       if(txtNacionalidad.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar la Nacionalidad.", "ERROR" , JOptionPane.WARNING_MESSAGE);
            txtNacionalidad.requestFocus();
            return;
        }

        if(txtFecha.getText().length()==0){
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar la Fecha de Nacimiento.", "ERROR" , JOptionPane.WARNING_MESSAGE);
            txtFecha.requestFocus();
            
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreAutor = new javax.swing.JTextField();
        txtNacionalidad = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        Btn_Nuevo = new javax.swing.JButton();
        Btn_Guardar = new javax.swing.JButton();
        Btn_Cancelar = new javax.swing.JButton();
        Btn_Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 204));

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Autor.");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nacionalidad:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha de Nacimiento:");

        txtNombreAutor.setBackground(new java.awt.Color(153, 0, 0));
        txtNombreAutor.setForeground(new java.awt.Color(255, 255, 255));

        txtNacionalidad.setBackground(new java.awt.Color(153, 0, 0));
        txtNacionalidad.setForeground(new java.awt.Color(255, 255, 255));
        txtNacionalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNacionalidadActionPerformed(evt);
            }
        });

        txtFecha.setBackground(new java.awt.Color(153, 0, 0));
        txtFecha.setForeground(new java.awt.Color(255, 255, 255));

        Btn_Nuevo.setBackground(new java.awt.Color(102, 255, 102));
        Btn_Nuevo.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconfinder_folder-new_118756.png"))); // NOI18N
        Btn_Nuevo.setText("Nuevo");
        Btn_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_NuevoActionPerformed(evt);
            }
        });

        Btn_Guardar.setBackground(new java.awt.Color(102, 255, 102));
        Btn_Guardar.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconfinder_Download_1031520.png"))); // NOI18N
        Btn_Guardar.setText("Guardar");
        Btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_GuardarActionPerformed(evt);
            }
        });

        Btn_Cancelar.setBackground(new java.awt.Color(0, 0, 0));
        Btn_Cancelar.setForeground(new java.awt.Color(255, 0, 0));
        Btn_Cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconfinder_6_-_Cross_1815573.png"))); // NOI18N
        Btn_Cancelar.setText("Cancelar");
        Btn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CancelarActionPerformed(evt);
            }
        });

        Btn_Salir.setBackground(new java.awt.Color(0, 0, 0));
        Btn_Salir.setForeground(new java.awt.Color(255, 0, 0));
        Btn_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/iconfinder_exit-to-app_326635.png"))); // NOI18N
        Btn_Salir.setText("Salir");
        Btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Btn_Nuevo)
                        .addGap(26, 26, 26)
                        .addComponent(Btn_Guardar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombreAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNacionalidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Btn_Cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(Btn_Salir)
                        .addGap(16, 16, 16))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNombreAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Nuevo)
                    .addComponent(Btn_Guardar)
                    .addComponent(Btn_Cancelar)
                    .addComponent(Btn_Salir))
                .addContainerGap(96, Short.MAX_VALUE))
        );

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

    private void txtNacionalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNacionalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNacionalidadActionPerformed

    private void Btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_NuevoActionPerformed
        // TODO add your handling code here:
        
        Habilitar();
        txtNombreAutor.requestFocus();
    }//GEN-LAST:event_Btn_NuevoActionPerformed

    private void Btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_GuardarActionPerformed
        // TODO add your handling code here:
        
        Desicion();
        
        Autores Au1 = new Autores ();
        Au1.setNombre(txtNombreAutor.getText());
        Au1.setNacionalidad(txtNacionalidad.getText());
        Au1.setFecha_Nac(txtFecha.getText());
        
        JOptionPane.showMessageDialog(rootPane, "Registro Exitoso.");
        
        String Cadena= "\nNombre del Autor: " + Au1.getNombre() + "\nNacionalidad: " + Au1.getNacionalidad() + "\nFecha de Nacimiento: " + Au1.getFecha_Nac(); 
        
        JOptionPane.showMessageDialog(rootPane, "Datos Guardados Correctamente" + Cadena);

        Inhabilitar();     
    }//GEN-LAST:event_Btn_GuardarActionPerformed

    private void Btn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CancelarActionPerformed
        // TODO add your handling code here:
        
        Inhabilitar();
    }//GEN-LAST:event_Btn_CancelarActionPerformed

    private void Btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalirActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
    }//GEN-LAST:event_Btn_SalirActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Autor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Autor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Autor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Autor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Autor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Cancelar;
    private javax.swing.JButton Btn_Guardar;
    private javax.swing.JButton Btn_Nuevo;
    private javax.swing.JButton Btn_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombreAutor;
    // End of variables declaration//GEN-END:variables
}
