
package Paneles;

import Clases.Conexion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Arian
 */
public class panel_CrearCuentaCliente extends javax.swing.JFrame {
    static Connection CN = null;
    static panel_MenuPrincipalEmpleado Menu = null;
    static String ID_cliente;
    /**
     * Creates new form panel_CrearCuentaCliente
     * @param con
     */
    public panel_CrearCuentaCliente(Connection con) {
        initComponents();
        this.setLocationRelativeTo(null);
        CN = con;
        NumeroCuentaActualizar();
    }

    private panel_CrearCuentaCliente() {
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        LB_Cliente = new javax.swing.JLabel();
        CB_TipoCuenta = new javax.swing.JComboBox<>();
        TXT_Ncuenta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TXT_Monto = new javax.swing.JTextField();
        BT_CrearCuenta = new javax.swing.JButton();
        BT_Salir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        TXT_Tiempo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TXT_Plazo = new javax.swing.JTextField();

        jButton2.setBackground(new java.awt.Color(0, 255, 102));
        jButton2.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 102));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Añaadir.png"))); // NOI18N
        jButton2.setText(" Crear Cuenta");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setName(""); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear Cuenta Cliente");
        setBackground(new java.awt.Color(153, 255, 204));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Usuario del Cliente: ");

        LB_Cliente.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        LB_Cliente.setForeground(new java.awt.Color(0, 0, 153));
        LB_Cliente.setText("cliente");

        CB_TipoCuenta.setBackground(new java.awt.Color(102, 255, 204));
        CB_TipoCuenta.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        CB_TipoCuenta.setForeground(new java.awt.Color(0, 0, 153));
        CB_TipoCuenta.setMaximumRowCount(5);
        CB_TipoCuenta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuenta Corriente", "Cuenta Credito", "Cuenta Ahorros" }));
        CB_TipoCuenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CB_TipoCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_TipoCuentaActionPerformed(evt);
            }
        });

        TXT_Ncuenta.setBackground(new java.awt.Color(0, 255, 255));
        TXT_Ncuenta.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        TXT_Ncuenta.setText("numero");
        TXT_Ncuenta.setToolTipText("");
        TXT_Ncuenta.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TXT_Ncuenta.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Numero de Cuenta :");

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Monto:");

        TXT_Monto.setBackground(new java.awt.Color(153, 255, 255));
        TXT_Monto.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        TXT_Monto.setForeground(new java.awt.Color(0, 0, 204));
        TXT_Monto.setText("0");
        TXT_Monto.setToolTipText("");
        TXT_Monto.setDisabledTextColor(new java.awt.Color(0, 0, 204));
        TXT_Monto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_MontoActionPerformed(evt);
            }
        });

        BT_CrearCuenta.setBackground(new java.awt.Color(0, 255, 102));
        BT_CrearCuenta.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        BT_CrearCuenta.setForeground(new java.awt.Color(0, 0, 102));
        BT_CrearCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Añaadir.png"))); // NOI18N
        BT_CrearCuenta.setText(" Crear Cuenta ");
        BT_CrearCuenta.setActionCommand("Crear Cuenta ");
        BT_CrearCuenta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        BT_CrearCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_CrearCuenta.setName(""); // NOI18N
        BT_CrearCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_CrearCuentaMouseClicked(evt);
            }
        });
        BT_CrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_CrearCuentaActionPerformed(evt);
            }
        });

        BT_Salir.setBackground(new java.awt.Color(0, 255, 102));
        BT_Salir.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        BT_Salir.setForeground(new java.awt.Color(0, 0, 102));
        BT_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Icono Salir.png"))); // NOI18N
        BT_Salir.setText("Salir ");
        BT_Salir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        BT_Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BT_Salir.setName(""); // NOI18N
        BT_Salir.setVerifyInputWhenFocusTarget(false);
        BT_Salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BT_SalirMouseClicked(evt);
            }
        });
        BT_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_SalirActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Tiempo a plazo:");

        TXT_Tiempo.setBackground(new java.awt.Color(153, 255, 255));
        TXT_Tiempo.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        TXT_Tiempo.setForeground(new java.awt.Color(0, 0, 204));
        TXT_Tiempo.setText("0");
        TXT_Tiempo.setToolTipText("");
        TXT_Tiempo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TXT_Tiempo.setEnabled(false);
        TXT_Tiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_TiempoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Nirmala UI", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Deposito a plazo:");

        TXT_Plazo.setBackground(new java.awt.Color(153, 255, 255));
        TXT_Plazo.setFont(new java.awt.Font("Nirmala UI", 0, 20)); // NOI18N
        TXT_Plazo.setForeground(new java.awt.Color(0, 0, 204));
        TXT_Plazo.setText("0");
        TXT_Plazo.setToolTipText("");
        TXT_Plazo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        TXT_Plazo.setEnabled(false);
        TXT_Plazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_PlazoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(23, 23, 23)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LB_Cliente)
                                .addGap(167, 167, 167))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TXT_Ncuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXT_Monto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXT_Plazo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TXT_Tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CB_TipoCuenta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BT_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(182, 182, 182)
                                .addComponent(BT_CrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 49, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(LB_Cliente))
                .addGap(62, 62, 62)
                .addComponent(CB_TipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_Ncuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TXT_Monto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TXT_Plazo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TXT_Tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_CrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void RecibirConeccion(panel_MenuPrincipalEmpleado menu){
        this.Menu = menu;
         //Aqui recibe la coneccion del panel principal XD
    }
    
    public void RecibirCliente(String ID){
        this.ID_cliente = ID;
        try {
            String SQL = "SELECT * FROM clientes WHERE idCliente = "+ID+"";
            Statement St = CN.createStatement();
            ResultSet Rs = St.executeQuery(SQL);
            String Tx = "";
            while(Rs.next()){
                Tx = Rs.getString(2);
            }
            LB_Cliente.setText(Tx);
        } catch (SQLException ex) {
            Logger.getLogger(panel_CrearCuentaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void NumeroCuentaActualizar(){
        int NCuentaRandom = (int)(Math.random()*100000000);
        TXT_Ncuenta.setText(""+NCuentaRandom);
        VerificarNumeroCuenta();
    }
    public void VerificarNumeroCuenta(){
        try {
            int tipoCuenta = CB_TipoCuenta.getSelectedIndex();
            //System.out.println(tipoCuenta);
            boolean Actu = false;
            switch (tipoCuenta) {
                case 0 ->{
                    String SQL = "SELECT numeroCuenta FROM cuentasCorrientes ";
                    Statement St = CN.createStatement();
                    ResultSet Rs = St.executeQuery(SQL);
                    String Tx = "";
                    while(Rs.next()){
                        Tx = Rs.getString(1);
                        if(TXT_Ncuenta.getText().equals(Tx)){
                            Actu = true;
                        }
                    }
                    break;
                }
                case 1 ->{
                    String SQL = "SELECT numeroCuenta FROM cuentasCredito ";
                    Statement St = CN.createStatement();
                    ResultSet Rs = St.executeQuery(SQL);
                    String Tx = "";
                    while(Rs.next()){
                        Tx = Rs.getString(1);
                        if(TXT_Ncuenta.getText().equals(Tx)){
                            Actu = true;
                        }
                    }
                    break;
                }
                
                case 2 ->{
                    String SQL = "SELECT numeroCuenta FROM cuentasAhorro ";
                    Statement St = CN.createStatement();
                    ResultSet Rs = St.executeQuery(SQL);
                    String Tx = "";
                    while(Rs.next()){
                        Tx = Rs.getString(1);
                        if(TXT_Ncuenta.getText().equals(Tx)){
                            Actu = true;
                        }
                    }
                    break;
                } 
            }
            
            if(Actu == true){
                NumeroCuentaActualizar();
            }
        } catch (SQLException ex) {
            Logger.getLogger(panel_CrearCuentaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void ConfirmarEleccion(int a){
        
    }
    private void CB_TipoCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_TipoCuentaActionPerformed
        int tipoCuenta = CB_TipoCuenta.getSelectedIndex();
        switch (tipoCuenta) {
            case 0  ->{
                TXT_Tiempo.setText("");
                TXT_Monto.setEnabled(true);
                TXT_Monto.setBackground(new java.awt.Color(153,255,255));
                TXT_Tiempo.setEnabled(false);
                TXT_Tiempo.setBackground(new java.awt.Color(0,204,204));
                TXT_Plazo.setEnabled(false);
                TXT_Plazo.setBackground(new java.awt.Color(0,204,204));
            }
            case 1 ->{
                TXT_Monto.setText(""+500);
            }
            case 2->{
                TXT_Monto.setText(""+1000);
                TXT_Tiempo.setText(""+6);
                TXT_Monto.setBackground(new java.awt.Color(0,204,204));
                TXT_Monto.setEnabled(false);
                TXT_Tiempo.setBackground(new java.awt.Color(153,255,255));
                TXT_Tiempo.setEnabled(true);
                
                TXT_Plazo.setBackground(new java.awt.Color(153,255,255));
                TXT_Plazo.setEnabled(true);
            }
        }
        
        int NCuentaRandom = (int)(Math.random()*100000000);
        TXT_Ncuenta.setText(""+NCuentaRandom);
        VerificarNumeroCuenta();
    }//GEN-LAST:event_CB_TipoCuentaActionPerformed

    private void TXT_MontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_MontoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_MontoActionPerformed

    private void BT_CrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_CrearCuentaActionPerformed
        String NCuenta = TXT_Ncuenta.getText();
        if ("".equals(TXT_Monto.getText())){
            TXT_Monto.setText("0");
        }
        int tipoCuenta = CB_TipoCuenta.getSelectedIndex();
        try {
            switch (tipoCuenta) {
                case 0->{
                    String Monto = TXT_Monto.getText();
                    String SQL = "INSERT INTO cuentasCorrientes (numeroCuenta, monto, conexCliente) VALUES ("+NCuenta+","+Monto+","+ID_cliente+")";
                    PreparedStatement Pps = CN.prepareStatement(SQL);
                    Pps.executeUpdate();
                    JOptionPane.showMessageDialog(this,"La cuenta del cliente ha sido creada con exito");
                    BT_SalirActionPerformed(evt);
                }
                
                case 1->{
                    String Monto = TXT_Monto.getText();
                    int monto = Integer.parseInt(Monto);
                    if(monto<500){
                        JOptionPane.showMessageDialog(this,"No se puede crear una cuenta credito con \n"+
                                                           "con un credito menor a 500 soles");
                    }else{
                        String SQL = "INSERT INTO cuentasCredito (numeroCuenta, credito , conexCliente) VALUES ("+NCuenta+","+Monto+","+ID_cliente+")";
                        PreparedStatement Pps = CN.prepareStatement(SQL);
                        Pps.executeUpdate();
                        JOptionPane.showMessageDialog(this,"La cuenta del credito del cliente ha sido creada con exito");
                        BT_SalirActionPerformed(evt);
                    }
                }
                
                case 2 ->{
                    double Plazo = Integer.parseInt(TXT_Plazo.getText());
                    int Tiempo = Integer.parseInt(TXT_Tiempo.getText());
                    
                    if(Plazo < 1000){
                        JOptionPane.showMessageDialog(this,"No se puede crear la cuenta ahorros por:  \n"+
                                                           "tener un deposito menor a 1000 soles");
                    }else{ 
                        if(Tiempo < 6){
                            JOptionPane.showMessageDialog(this,"No se puede crear la cuenta ahorros por:  \n"+
                                                               "tener un deposito con un plazo menor a 6 meses ");
                        }else{
                            String tex= "El porcentaje de ganancia mensual es de 0.1%";
                            if(Plazo >= 5000 && Plazo <10000){
                                tex = "El porcentaje de ganancia mensual es de 0.2%"; 
                            }else if(Plazo >= 10000 && Plazo <50000){
                                tex = "El porcentaje de ganancia mensual es de 0.4%";
                            }else if(Plazo >= 50000 && Plazo <100000){
                                tex = "El porcentaje de ganancia mensual es de 0.8%";
                            }
                            int v = JOptionPane.showConfirmDialog(this,tex+"\n Desea crear la cuenta?","Porcentaje mensual",JOptionPane.YES_NO_OPTION);
                            if(v == 0){
                                String SQL = "INSERT INTO cuentasAhorro (numeroCuenta,monto,nmesesTotal,conexCliente,montoInicial) VALUES ("+NCuenta+","+Plazo+","+Tiempo+","+ID_cliente+","+Plazo+")";
                                PreparedStatement Pps = CN.prepareStatement(SQL);
                                Pps.executeUpdate();
                                JOptionPane.showMessageDialog(this,"La cuenta de Ahorros del cliente con un deposito de "+Plazo+" y un plazo de "+Tiempo+" meses, ha sido creada con exito");
                                BT_SalirActionPerformed(evt);
                            }
                            
                        }
                    } 
                }
            }
        }catch (SQLException ex) {
            Logger.getLogger(panel_CrearCuentaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }//GEN-LAST:event_BT_CrearCuentaActionPerformed
    
    
    
    private void BT_CrearCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_CrearCuentaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_CrearCuentaMouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void BT_SalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BT_SalirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BT_SalirMouseClicked

    private void BT_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_SalirActionPerformed
        this.setVisible(false);
        Menu.ActivarBotones();
        Menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BT_SalirActionPerformed

    private void TXT_TiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_TiempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_TiempoActionPerformed

    private void TXT_PlazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_PlazoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXT_PlazoActionPerformed

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
            java.util.logging.Logger.getLogger(panel_CrearCuentaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(panel_CrearCuentaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(panel_CrearCuentaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(panel_CrearCuentaCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new panel_CrearCuentaCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_CrearCuenta;
    private javax.swing.JButton BT_Salir;
    private javax.swing.JComboBox<String> CB_TipoCuenta;
    private javax.swing.JLabel LB_Cliente;
    private javax.swing.JTextField TXT_Monto;
    private javax.swing.JTextField TXT_Ncuenta;
    private javax.swing.JTextField TXT_Plazo;
    private javax.swing.JTextField TXT_Tiempo;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}