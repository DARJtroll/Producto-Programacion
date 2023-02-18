/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Paneles;
import Clases.*;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author Arian
 */
public class panel_InicioSesion extends javax.swing.JFrame {
    
    /**
     * Creates new form panle_InicioSesion
     */
    Conexion CX = new Conexion();
    Connection CN = CX.Conector();
    int Opcion=0;
    public panel_InicioSesion() {
        initComponents();
        this.setLocationRelativeTo(null); // Ventana en el centro de la pantalla
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG_TipoIngreso = new javax.swing.ButtonGroup();
        BT_IniciarSesion = new javax.swing.JButton();
        TXT_user = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        LB_Password = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        RB_Empleado = new javax.swing.JRadioButton();
        RB_Cliente = new javax.swing.JRadioButton();
        RB_Administrador = new javax.swing.JRadioButton();
        PF_contra = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar Sesion");
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        BT_IniciarSesion.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        BT_IniciarSesion.setText("Iniciar Sesion");
        BT_IniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_IniciarSesionActionPerformed(evt);
            }
        });

        TXT_user.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Usuario");

        LB_Password.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        LB_Password.setText("Contraseña");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        BG_TipoIngreso.add(RB_Empleado);
        RB_Empleado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RB_Empleado.setText("Empleado");
        RB_Empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB_EmpleadoActionPerformed(evt);
            }
        });

        BG_TipoIngreso.add(RB_Cliente);
        RB_Cliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RB_Cliente.setText("Cliente");
        RB_Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB_ClienteActionPerformed(evt);
            }
        });

        BG_TipoIngreso.add(RB_Administrador);
        RB_Administrador.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        RB_Administrador.setText("Administrador");
        RB_Administrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RB_AdministradorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RB_Cliente)
                            .addComponent(RB_Empleado)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(RB_Administrador)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(RB_Empleado)
                .addGap(18, 18, 18)
                .addComponent(RB_Cliente)
                .addGap(18, 18, 18)
                .addComponent(RB_Administrador)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(BT_IniciarSesion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(LB_Password))
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TXT_user, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(PF_contra))
                .addGap(193, 193, 193))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(187, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TXT_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LB_Password)
                            .addComponent(PF_contra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addComponent(BT_IniciarSesion)
                .addGap(150, 150, 150))
        );

        jLabel1.getAccessibleContext().setAccessibleName("LB_User");
        LB_Password.getAccessibleContext().setAccessibleName("Pass");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void BT_IniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_IniciarSesionActionPerformed
        try {
                String Usuario = TXT_user.getText();
                String Pass = PF_contra.getText();
            switch(Opcion){
                case 0->{
                    String query = "SELECT * FROM empleados WHERE usuarioEmpleado='"+Usuario+"' AND passEmpleado ='"+Pass+"'";
                    Statement st = CN.createStatement();
                    ResultSet rs = st.executeQuery(query);

                    if(rs.next()){
                        //JOptionPane.showMessageDialog(this,"Usuario Encontrado");
                        String IdPersona = rs.getString(4);
                        System.out.println(IdPersona);
                        panel_MenuPrincipalEmpleado InicioE = new panel_MenuPrincipalEmpleado();
                        InicioE.AccesoEmpleado(IdPersona);
                        InicioE.setVisible(true);
                        this.setVisible(false);
                    }else{
                        JOptionPane.showMessageDialog(this,"Datos Incorrectos, por favor intentelo nuevamente");
                    }
                }
                case 1->{
                    String query = "SELECT * FROM clientes WHERE nombreCliente='"+Usuario+"' AND passCliente ='"+Pass+"'";
                    Statement st = CN.createStatement();
                    ResultSet rs = st.executeQuery(query);
                    String NombreCliente,ApellidosCliente,Correo,UsuarioCliente,PassCliente;
                    int EdadCliente,dniCliente,celular;
                    
                        
                    Clientes cliente= null;
                    if(rs.next()){
                        UsuarioCliente = Usuario;
                        PassCliente = Pass;
                        String idCliente = rs.getString(7);
                        query = "SELECT * FROM usuarios WHERE id = "+idCliente+"";
                        //st = CN.createStatement();
                        ResultSet RS = st.executeQuery(query);
                        while(RS.next()){
                            NombreCliente = rs.getString(2);
                            ApellidosCliente = rs.getString(3);
                            EdadCliente = Integer.parseInt(rs.getString(4));
                            dniCliente = Integer.parseInt(rs.getString(5));
                            celular = Integer.parseInt(rs.getString(6));
                            Correo = rs.getString(7);
                            cliente = new Clientes(0,0,UsuarioCliente,PassCliente,Integer.parseInt(idCliente),NombreCliente,ApellidosCliente,EdadCliente,dniCliente,celular,Correo);
                        }
                    }
                }
            }
           
            
                
        } catch (SQLException ex) {
            Logger.getLogger(panel_InicioSesion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BT_IniciarSesionActionPerformed

    private void RB_EmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB_EmpleadoActionPerformed
        this.Opcion = 0;
    }//GEN-LAST:event_RB_EmpleadoActionPerformed

    private void RB_ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB_ClienteActionPerformed
        this.Opcion = 1;
    }//GEN-LAST:event_RB_ClienteActionPerformed

    private void RB_AdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RB_AdministradorActionPerformed
        this.Opcion = 2;
    }//GEN-LAST:event_RB_AdministradorActionPerformed

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
            java.util.logging.Logger.getLogger(panel_InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panel_InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panel_InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panel_InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new panel_InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BG_TipoIngreso;
    private javax.swing.JButton BT_IniciarSesion;
    private javax.swing.JLabel LB_Password;
    private javax.swing.JPasswordField PF_contra;
    private javax.swing.JRadioButton RB_Administrador;
    private javax.swing.JRadioButton RB_Cliente;
    private javax.swing.JRadioButton RB_Empleado;
    private javax.swing.JTextField TXT_user;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
    
}
