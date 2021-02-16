
package Formularios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DConexion {
    
    static Connection con = null;
    public static Connection getConnection(){
        
        if(con == null){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DBGraficas","root","");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return con;
    }
    
}
