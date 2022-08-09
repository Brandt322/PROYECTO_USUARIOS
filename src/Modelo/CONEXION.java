
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;


public class CONEXION {
    Connection Con;
    public Connection Conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/sistema","root","brandtVeloz123");
            System.out.println("Conectado");
        } catch (Exception e) {
            System.out.println("Error de conexion"+e);
        }
        return Con;
    } 
}
    

