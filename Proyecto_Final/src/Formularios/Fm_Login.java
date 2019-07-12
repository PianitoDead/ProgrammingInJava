/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;
//import AppPackage.AnimationClass;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
/**
 *
 * @author Brando Taipe
 */
public class Fm_Login extends javax.swing.JFrame implements Runnable{
    
    String Hora,Minutos,Segundos;
    Thread Hilo;

    /**
     * Creates new form Fm_Login
     */
    public Fm_Login() {
        initComponents();
        setSize(1050, 575);
        this.setLocationRelativeTo(null);     
        txt_Fecha.setText(FechaActual());
        Hilo = new Thread(this);
        Hilo.start();
        setVisible(true);
    }
    
    public void Hora (){
        Calendar Calendario = new GregorianCalendar();
        Date Hora_Actual =  new Date();
        Calendario.setTime(Hora_Actual);
        Hora = Calendario.get(Calendar.HOUR_OF_DAY)>9?"" + Calendario.get(Calendar.HOUR_OF_DAY):"0" + Calendario.get(Calendar.HOUR_OF_DAY);
        Minutos = Calendario.get(Calendar.MINUTE)>9?"" + Calendario.get(Calendar.MINUTE):"0" + Calendario.get(Calendar.MINUTE);
        Segundos = Calendario.get(Calendar.SECOND)>9?"" + Calendario.get(Calendar.SECOND):"0" + Calendario.get(Calendar.SECOND);
        
    }
    
    public void run(){
        
        Thread current = Thread.currentThread();
        
        while (current == Hilo){
            Hora();
            txt_Hora.setText(Hora + ":" + Minutos + ":" + Segundos);                    
        }
    
    }
    public void close(){
        
        WindowEvent Cerrar = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(Cerrar);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
     public static String FechaActual(){
    
    Date Fecha=new Date();
    SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/YYYY");
    
    return formatoFecha.format(Fecha);
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel_Ingreso = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_User = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        txt_Password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Btn_Menu = new javax.swing.JLabel();
        Btn_Enter = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Btn_Seguridad = new javax.swing.JButton();
        Btn_Mantenimiento = new javax.swing.JButton();
        Btn_Tramite = new javax.swing.JButton();
        Btn_Reportes = new javax.swing.JButton();
        txt_Fecha = new javax.swing.JLabel();
        txt_Hora = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_Ingreso.setBackground(new java.awt.Color(0, 0, 0));
        jPanel_Ingreso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel_Ingreso.setForeground(new java.awt.Color(255, 255, 255));
        jPanel_Ingreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(238, 112, 82));
        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 112, 82));
        jLabel2.setText("PASSWORD : ");
        jPanel_Ingreso.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_User_96px_2.png"))); // NOI18N
        jPanel_Ingreso.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 90, 80));

        txt_User.setBackground(new java.awt.Color(0, 0, 0));
        txt_User.setFont(new java.awt.Font("Gadugi", 0, 11)); // NOI18N
        txt_User.setForeground(new java.awt.Color(153, 153, 0));
        txt_User.setBorder(null);
        txt_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UserActionPerformed(evt);
            }
        });
        jPanel_Ingreso.add(txt_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 200, 20));
        jPanel_Ingreso.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 318, 230, 10));
        jPanel_Ingreso.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 230, 10));

        txt_Password.setBackground(new java.awt.Color(0, 0, 0));
        txt_Password.setForeground(new java.awt.Color(204, 204, 0));
        txt_Password.setBorder(null);
        txt_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PasswordActionPerformed(evt);
            }
        });
        jPanel_Ingreso.add(txt_Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 190, 20));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_customer_32px_1.png"))); // NOI18N
        jPanel_Ingreso.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Key_32px.png"))); // NOI18N
        jPanel_Ingreso.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, 30));

        Btn_Menu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Menu_32px.png"))); // NOI18N
        Btn_Menu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_MenuMouseClicked(evt);
            }
        });
        jPanel_Ingreso.add(Btn_Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        Btn_Enter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Enter_OFF.png"))); // NOI18N
        Btn_Enter.setBorder(null);
        Btn_Enter.setBorderPainted(false);
        Btn_Enter.setContentAreaFilled(false);
        Btn_Enter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Enter.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Enter_ON.png"))); // NOI18N
        Btn_Enter.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Enter_ON.png"))); // NOI18N
        Btn_Enter.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Enter_ON.png"))); // NOI18N
        Btn_Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EnterActionPerformed(evt);
            }
        });
        jPanel_Ingreso.add(Btn_Enter, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 100, 40));

        jLabel10.setBackground(new java.awt.Color(238, 112, 82));
        jLabel10.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(238, 112, 82));
        jLabel10.setText("USER :");
        jPanel_Ingreso.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        getContentPane().add(jPanel_Ingreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 580));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        Btn_Seguridad.setBackground(new java.awt.Color(238, 112, 82));
        Btn_Seguridad.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        Btn_Seguridad.setForeground(new java.awt.Color(238, 112, 82));
        Btn_Seguridad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Today_96px.png"))); // NOI18N
        Btn_Seguridad.setText("Seguridad");
        Btn_Seguridad.setBorder(null);
        Btn_Seguridad.setContentAreaFilled(false);
        Btn_Seguridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SeguridadActionPerformed(evt);
            }
        });

        Btn_Mantenimiento.setBackground(new java.awt.Color(238, 112, 82));
        Btn_Mantenimiento.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        Btn_Mantenimiento.setForeground(new java.awt.Color(238, 112, 82));
        Btn_Mantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Maintenance_96px.png"))); // NOI18N
        Btn_Mantenimiento.setText("Mantenimiento");
        Btn_Mantenimiento.setBorder(null);
        Btn_Mantenimiento.setContentAreaFilled(false);
        Btn_Mantenimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_MantenimientoActionPerformed(evt);
            }
        });

        Btn_Tramite.setBackground(new java.awt.Color(238, 112, 82));
        Btn_Tramite.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        Btn_Tramite.setForeground(new java.awt.Color(238, 112, 82));
        Btn_Tramite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Clock_96px.png"))); // NOI18N
        Btn_Tramite.setText("Tramite");
        Btn_Tramite.setBorder(null);
        Btn_Tramite.setContentAreaFilled(false);
        Btn_Tramite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_TramiteActionPerformed(evt);
            }
        });

        Btn_Reportes.setBackground(new java.awt.Color(238, 112, 82));
        Btn_Reportes.setFont(new java.awt.Font("Gadugi", 0, 18)); // NOI18N
        Btn_Reportes.setForeground(new java.awt.Color(238, 112, 82));
        Btn_Reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Handshake_96px.png"))); // NOI18N
        Btn_Reportes.setText("Reportes");
        Btn_Reportes.setBorder(null);
        Btn_Reportes.setContentAreaFilled(false);
        Btn_Reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ReportesActionPerformed(evt);
            }
        });

        txt_Fecha.setBackground(new java.awt.Color(238, 112, 82));
        txt_Fecha.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        txt_Fecha.setForeground(new java.awt.Color(0, 255, 51));
        txt_Fecha.setText("DD/MM/YYYY");

        txt_Hora.setBackground(new java.awt.Color(238, 112, 82));
        txt_Hora.setFont(new java.awt.Font("Gadugi", 0, 24)); // NOI18N
        txt_Hora.setForeground(new java.awt.Color(0, 255, 51));
        txt_Hora.setText("00:00:00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Btn_Tramite)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_Reportes)
                        .addGap(110, 110, 110))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Fecha, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Btn_Seguridad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(228, 228, 228)
                                .addComponent(Btn_Mantenimiento)
                                .addContainerGap(61, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_Hora)
                                .addGap(125, 125, 125))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Hora)
                    .addComponent(txt_Fecha))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Seguridad)
                    .addComponent(Btn_Mantenimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_Tramite, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Reportes))
                .addContainerGap(147, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 760, 530));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_Multiply_32px.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 760, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_MenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_MenuMouseClicked
        //AnimationClass 
    }//GEN-LAST:event_Btn_MenuMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        this.setState(Fm_Login.ICONIFIED);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int result = JOptionPane.showConfirmDialog(null, "Desea salir de la aplicación", "Exit" ,dialog);
        if (result == 0) {
            System.exit(0);
        }
        
    }//GEN-LAST:event_jLabel8MouseClicked

    private void txt_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_UserActionPerformed

    private void txt_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PasswordActionPerformed

    private void Btn_EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EnterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_EnterActionPerformed

    private void Btn_SeguridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SeguridadActionPerformed
        // TODO add your handling code here:
        
        Fm_Seguridad Fm_Seguridad = new Fm_Seguridad();
        Fm_Seguridad.setVisible(true);
        close();
    }//GEN-LAST:event_Btn_SeguridadActionPerformed

    private void Btn_MantenimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_MantenimientoActionPerformed
        // TODO add your handling code here:
        
        Fm_Mantenimiento Fm_Mantenimiento = new Fm_Mantenimiento();
        Fm_Mantenimiento.setVisible(true);
        close();
    }//GEN-LAST:event_Btn_MantenimientoActionPerformed

    private void Btn_TramiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_TramiteActionPerformed
        // TODO add your handling code here:
        
        Fm_Tramite Fm_Tramite = new Fm_Tramite();
        Fm_Tramite.setVisible(true);
        close();
    }//GEN-LAST:event_Btn_TramiteActionPerformed

    private void Btn_ReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ReportesActionPerformed
        // TODO add your handling code here:
        
        Fm_Reportes Fm_Reportes = new Fm_Reportes();
        Fm_Reportes.setVisible(true);
        close();
    }//GEN-LAST:event_Btn_ReportesActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Fm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fm_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fm_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Enter;
    private javax.swing.JButton Btn_Mantenimiento;
    private javax.swing.JLabel Btn_Menu;
    private javax.swing.JButton Btn_Reportes;
    private javax.swing.JButton Btn_Seguridad;
    private javax.swing.JButton Btn_Tramite;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_Ingreso;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel txt_Fecha;
    private javax.swing.JLabel txt_Hora;
    private javax.swing.JPasswordField txt_Password;
    private javax.swing.JTextField txt_User;
    // End of variables declaration//GEN-END:variables
}
