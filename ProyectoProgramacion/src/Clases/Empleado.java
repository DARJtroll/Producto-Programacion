
package Clases;

public class Empleado extends Persona{
    private String usuarioEmpleado;
    private String passEmpleado;
    private int idEmpleado;
    public Empleado(String usuarioEmpleado, String passEmpleado, String Nombres, String Apellidos, int Edad, int DNI, int Celular,int idEmpleado) {
        super(Nombres, Apellidos, Edad, DNI, Celular);
        this.usuarioEmpleado = usuarioEmpleado;
        this.passEmpleado = passEmpleado;
        this.idEmpleado = idEmpleado;
    }

    public String getPassEmpleado() {
        return passEmpleado;
    }

    public String getUsuarioEmpleado() {
        return usuarioEmpleado;
    }
    
}
