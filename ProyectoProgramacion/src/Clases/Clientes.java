
package Clases;

public class Clientes extends Persona{
    private String nombreCliente;
    private String passCliente;
    private int IdCliente;

    public Clientes(String nombreCliente, String passCliente, int Id, int idpersona, String Nombres, String Apellidos, int Edad, int DNI, int Celular, String correo) {
        super(idpersona, Nombres, Apellidos, Edad, DNI, Celular, correo);
        this.nombreCliente = nombreCliente;
        this.passCliente = passCliente;
        this.IdCliente = Id;
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

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int Id) {
        this.IdCliente = Id;
    }

}
