
package Clases;
// HOLA
//HOLAAAAAA coment 2
//A VER SI TE GENERA ALGUN PROBLEMA

public class Clientes extends Persona{
    private int nCuentasCorriente;
    private int nCuentasCredito;
    private String nombreCliente;
    private String passCliente;
    private int Id;

    public Clientes(int nCuentasCorriente, int nCuentasCredito, String nombreCliente, String passCliente, int Id, String Nombres, String Apellidos, int Edad, int DNI, int Celular, String correo) {
        super(Nombres, Apellidos, Edad, DNI, Celular, correo);
        this.nCuentasCorriente = nCuentasCorriente;
        this.nCuentasCredito = nCuentasCredito;
        this.nombreCliente = nombreCliente;
        this.passCliente = passCliente;
        this.Id = Id;
    }

    public int getnCuentasCorriente() {
        return nCuentasCorriente;
    }

    public void setnCuentasCorriente(int nCuentasCorriente) {
        this.nCuentasCorriente = nCuentasCorriente;
    }

    public int getnCuentasCredito() {
        return nCuentasCredito;
    }

    public void setnCuentasCredito(int nCuentasCredito) {
        this.nCuentasCredito = nCuentasCredito;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getPassCliente() {
        return passCliente;
    }

    public void setPassCliente(String passCliente) {
        this.passCliente = passCliente;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getCelular() {
        return Celular;
    }

    public void setCelular(int Celular) {
        this.Celular = Celular;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
    

    

    
    
}
