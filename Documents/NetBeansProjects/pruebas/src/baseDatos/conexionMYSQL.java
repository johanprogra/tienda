
package baseDatos;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexionMYSQL {
    private String driver="com.mysql.jdbc.Driver";
    private String cadenaConeccion="jdbc:mysql://localhost/tejido";
    private String usuario="root";
    private String contraseña="";
    public Connection con;

    public Connection Conectar(){
        
        try{
           Class.forName(driver);
            con=DriverManager.getConnection(cadenaConeccion,usuario,contraseña); 
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"no se ha podido establecer una conexion con la base");
        }
        return con;
    }}
    