/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Paneles.cliente;
import Clases.*;
import Paneles.panel_InicioSesion;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Arian
 */
public class panel_MenuPrincipalCliente extends javax.swing.JFrame {
    private static Connection CN = null;
    private static Clientes cliente = null;
    private static panel_DepositarRetirar panelDeRe= null;
    private static ArrayList<CuentaCorriente> ListaC = new ArrayList<>();
    private static int select = -1;
    /**
     * Creates new form panel_MenuPrincipalCliente
     */
    public panel_MenuPrincipalCliente() {
        initComponents();

        this.setLocationRelativeTo(null);

        this.setLocationRelativeTo(null); // Ventana en el centro de la pantalla

    }
    public void recibirDatos(Connection CN, Clientes client){
        this.CN = CN;
        this.cliente = client;
        ActualizarTabla();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        LB_Nombre = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TB_Cuentas = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setText("Bienvenido a su cuenta:  ");

        jButton1.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        jButton1.setText("Depositar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        jButton2.setText("Retirar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        LB_Nombre.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        LB_Nombre.setText("Nombre");

        jButton3.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        jButton3.setText("Cerrar ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        TB_Cuentas.setBackground(new java.awt.Color(204, 255, 255));
        TB_Cuentas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TB_Cuentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TB_Cuentas.setGridColor(new java.awt.Color(243, 243, 243));
        TB_Cuentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TB_CuentasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TB_Cuentas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(LB_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(LB_Nombre))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TB_CuentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TB_CuentasMouseClicked
        select = TB_Cuentas.rowAtPoint(evt.getPoint()); //Agarra el indice del objeto que seleccionamos en la tabla
        System.out.println(select);
    }//GEN-LAST:event_TB_CuentasMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(select != -1){
            if (panelDeRe == null){
                panel_DepositarRetirar Deposito = new panel_DepositarRetirar();
                panelDeRe = Deposito;
                panelDeRe.setMenu(this);
                panelDeRe.RecibirDatos(0,ListaC.get(select));
                panelDeRe.mostrarPanel();
            }else{
                panelDeRe.RecibirDatos(0,ListaC.get(select));
                panelDeRe.mostrarPanel();
            }
        }else{
            JOptionPane.showMessageDialog(this,"No escogio una Cuenta Corriente","Error No Escogio",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(select != -1){
            if (panelDeRe == null){
                panel_DepositarRetirar Retiro = new panel_DepositarRetirar();
                panelDeRe = Retiro;
                panelDeRe.setMenu(this);
                panelDeRe.RecibirDatos(1,ListaC.get(select));
                panelDeRe.mostrarPanel();
            }else{
                panelDeRe.RecibirDatos(1,ListaC.get(select));
                panelDeRe.mostrarPanel();
            }
        }else{
            JOptionPane.showMessageDialog(this,"No escogio una Cuenta Corriente","Error No Escogio",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(evt.getSource() == jButton3){
            this.setVisible(false);
            new panel_InicioSesion().setVisible(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    public void ActualizarTabla(){
        LB_Nombre.setText(cliente.getNombres()+" "+ cliente.getApellidos());
        DefaultTableModel modelo = new DefaultTableModel(){
                @Override
                public boolean isCellEditable(int row,int column){
                    return false;   
                }
                
        };
        modelo.addColumn("Numero de Cuenta");
        modelo.addColumn("Monto");
        TB_Cuentas.setModel(modelo);
        
        try {
            String[] fila = new String[2];
            String sql = "SELECT * FROM cuentasCorrientes WHERE conexCliente = "+this.cliente.getIdCliente()+"";
            Statement ST = CN.createStatement();
            ResultSet RS = ST.executeQuery(sql);
            while(RS.next()){
                int nCuenta = Integer.parseInt(RS.getString(2));
                double monto = Double.parseDouble(RS.getString(3));
                fila[0] = RS.getString(2); fila[1] = RS.getString(3);
                CuentaCorriente Cuen = new CuentaCorriente(this.cliente,nCuenta,monto);
                ListaC.add(Cuen);
                modelo.addRow(fila);
            }
        } catch (SQLException ex) {
            Logger.getLogger(panel_InicioSesion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
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
            java.util.logging.Logger.getLogger(panel_MenuPrincipalCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panel_MenuPrincipalCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panel_MenuPrincipalCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panel_MenuPrincipalCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new panel_MenuPrincipalCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LB_Nombre;
    private javax.swing.JTable TB_Cuentas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
