
package Clases;

import javax.swing.JOptionPane;

public class CuentaCorriente {
    private Clientes Dueño;
    private int numeroC;
    private double monto;

    public CuentaCorriente(Clientes Dueño, int numeroC, double monto) {
        this.Dueño = Dueño;
        this.numeroC = numeroC;
        this.monto = monto;
    }
    public void SetMontoIncial(double montoI){
        this.monto = montoI;
    }
    public void Depositar(int deposito){
        this.monto = this.monto + deposito;
        
    }
    
    public void Retirar(int retiro){
        if(retiro > this.monto){
            JOptionPane.showMessageDialog(null,"El monto de retiro excede al monto actual en la cuenta");
        }
    }
}
