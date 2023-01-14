
package Clases;

import java.sql.*;
public class Conexion {
    Connection cx;
    
    public Conexion() {
        
    }
    
    
    public Connection Conector(){
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        cx = DriverManager.getConnection(
        "jdbc:mysql://aws-sa-east-1.connect.psdb.cloud/bancovenedit?sslMode=VERIFY_IDENTITY",
        "rkv70ara63y8jd11z52q",
        "pscale_pw_EBjn6gjGLSjjVIN3N4BPPKIRdKgCekUVeOxdRoTtQJA");
            System.out.println("Se conecto perfectamente");
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("No se conecto a BD"+ ex);
        }
        return cx;
    }
    
}
