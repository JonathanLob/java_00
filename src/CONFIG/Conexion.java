package CONFIG;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection con;
    public Conexion(){
         try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3307/EJEMPLO_1","root","");
        } catch (Exception e) {
        }
    }
    //metodo para retornar el valor de la conexion
    public Connection getConnection(){
        return con;
    }
}
