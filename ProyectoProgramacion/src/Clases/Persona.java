
package Clases;

public class Persona {
    protected String Nombres;
    protected String Apellidos;
    protected int Edad;
    protected int DNI;
    protected int Celular;
    protected String Correo;

    public Persona(String Nombres, String Apellidos, int Edad, int DNI, int Celular,String correo) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Edad = Edad;
        this.DNI = DNI;
        this.Celular = Celular;
        this.Correo = correo;
    }
    
}
