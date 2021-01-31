
package baseDatos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexionMYSQL {
    private final String driver="com.mysql.cj.jdbc.Driver";
    private final String cadenaConeccion="jdbc:mysql://localhost/tejido";
    private final String usuario="root";
    private final String contraseña="";
    public Connection con;

    public Connection Conectar(){
        
        try{
           Class.forName(driver);
            con=DriverManager.getConnection(cadenaConeccion,usuario,contraseña); 
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,"no se ha podido establecer una conexion con la base");
        }
        return con;
    }}
    
