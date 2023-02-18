
package Clases;

public class Empleado extends Persona{
    private String usuarioEmpleado;
    private String passEmpleado;
    private int idEmpleado;

    public Empleado(String usuarioEmpleado, String passEmpleado, int idEmpleado, String Nombres, String Apellidos, int Edad, int DNI, int Celular, String correo) {
        super(Nombres, Apellidos, Edad, DNI, Celular, correo);
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
