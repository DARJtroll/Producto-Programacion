
package Clases;

public class Persona {
    protected String Nombres;
    protected String Apellidos;
    protected int Edad;
    protected int DNI;
    protected int Celular;
    protected int idPersona;
    protected String Correo;

    public Persona(int idpersona,String Nombres, String Apellidos, int Edad, int DNI, int Celular,String correo) {
        this.idPersona = idpersona;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Edad = Edad;
        this.DNI = DNI;
        this.Celular = Celular;
        this.Correo = correo;
    }

    public String getNombres() {
        return Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public int getDNI() {
        return DNI;
    }

    public int getCelular() {
        return Celular;
    }

    public String getCorreo() {
        return Correo;
    }
    
}
