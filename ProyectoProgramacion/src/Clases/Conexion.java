
package Clases;

import java.sql.*;

public class Conexion {
    
    public Conexion() {
        
    }
    public Connection Conector(){
        Connection cx = null;
        try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
        "jdbc:mysql://aws-sa-east-1.connect.psdb.cloud/bancovenedit?sslMode=VERIFY_IDENTITY",
        "ny46zs1w33ecq4m3ug07",
        "pscale_pw_cri8plyKHbuFfw6XN61GGmmo9knqVCbiImp1k9PiZhq");
        cx = conn;
            System.out.println("Se conecto perfectamente");
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("No se conecto a BD"+ ex);
        }
        return cx;
    }
    
}
