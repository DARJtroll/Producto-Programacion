
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

    public int getNumeroC() {
        return numeroC;
    }

    public double getMonto() {
        return monto;
    }
    
    public void SetMontoIncial(double montoI){
        this.monto = montoI;
    }
    public void Depositar(double deposito){
        this.monto = this.monto + deposito;
        JOptionPane.showMessageDialog(null,"El monto actual en la cuenta es: "+this.monto);
    }
    
    public void Retirar(double retiro){
        if(retiro > this.monto){
            JOptionPane.showMessageDialog(null,"El monto de retiro excede al monto actual en la cuenta");
        }else if (retiro == 0){
            JOptionPane.showMessageDialog(null,"El monto de retiro no puede ser 0");
        }else{
            this.monto = this.monto - retiro;
        }
    }
}
