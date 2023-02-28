/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Paneles.cliente;
import Clases.*;
import javax.swing.border.LineBorder;
/**
 *
 * @author Arian
 */
public class panel_DepositarRetirar extends javax.swing.JFrame {
    static int Accion = 0;
    static CuentaCorriente Cuenta = null;
    static panel_MenuPrincipalCliente Menu = null;
    /**
     * Creates new form panel_DepositarRetirar
     */
    public panel_DepositarRetirar() {
        initComponents();
        this.setLocationRelativeTo(null);// Ventana en el centro de la pantalla
    }
    public void setMenu(panel_MenuPrincipalCliente menu){
        this.Menu = menu;
    }
    public void RecibirDatos(int accion,CuentaCorriente cuenta){
        this.Accion = accion;
        this.Cuenta = cuenta;
        
        switch (this.Accion) {
            case 0 ->{
                LB_Titulo.setText("Deposito");
                BT_Accion.setText("Depositar");
            }
            case 1 ->{
                LB_Titulo.setText("Retirar");
                BT_Accion.setText("Retirar");
            }     
        }
    }
    
    public void mostrarPanel(){
        TXT_monto.setText("00.00");
        LB_numeroCuenta.setText(""+Cuenta.getNumeroC());
        this.setVisible(true);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lb_ = new javax.swing.JLabel();
        LB_Titulo = new javax.swing.JLabel();
        TXT_monto = new javax.swing.JTextField();
        LB_numeroCuenta = new javax.swing.JLabel();
        Lb_Titulo3 = new javax.swing.JLabel();
        BT_Accion = new javax.swing.JButton();
        BT_Accion1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        Lb_.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        Lb_.setText("Monto :");

        LB_Titulo.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        LB_Titulo.setText("Deposito");
        LB_Titulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        TXT_monto.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        TXT_monto.setText("00.00");

        LB_numeroCuenta.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        LB_numeroCuenta.setText("numero");

        Lb_Titulo3.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        Lb_Titulo3.setText("Numero de Cuenta :");

        BT_Accion.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        BT_Accion.setText("Depositar");
        BT_Accion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_AccionActionPerformed(evt);
            }
        });

        BT_Accion1.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        BT_Accion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Salir.png"))); // NOI18N
        BT_Accion1.setText("Salir");
        BT_Accion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_Accion1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Lb_)
                            .addComponent(Lb_Titulo3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TXT_monto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LB_numeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(120, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BT_Accion1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BT_Accion)
                        .addGap(55, 55, 55))))
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(LB_Titulo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(LB_Titulo)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lb_)
                    .addComponent(TXT_monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LB_numeroCuenta)
                    .addComponent(Lb_Titulo3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_Accion, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_Accion1))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BT_AccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_AccionActionPerformed
        double monto = Double.parseDouble(TXT_monto.getText());
        switch (this.Accion) {
            case 0 ->{
                Cuenta.Depositar(monto);
            }
            case 1->{
                Cuenta.Retirar(monto);
            }
        }
    }//GEN-LAST:event_BT_AccionActionPerformed

    private void BT_Accion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_Accion1ActionPerformed
        this.setVisible(false);
        
    }//GEN-LAST:event_BT_Accion1ActionPerformed

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
            java.util.logging.Logger.getLogger(panel_DepositarRetirar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panel_DepositarRetirar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panel_DepositarRetirar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panel_DepositarRetirar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new panel_DepositarRetirar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_Accion;
    private javax.swing.JButton BT_Accion1;
    private javax.swing.JLabel LB_Titulo;
    private javax.swing.JLabel LB_numeroCuenta;
    private javax.swing.JLabel Lb_;
    private javax.swing.JLabel Lb_Titulo3;
    private javax.swing.JTextField TXT_monto;
    // End of variables declaration//GEN-END:variables
}
