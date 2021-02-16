
package personasjdbc;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    
    private static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
    private static final String JDBC_URL="jdbc:mysql://localhost/colegio";
    private static final String JDBC_USER="root";
    private static final String JDBC_PASSWORD="";
    public static Connection con;
    
    public static synchronized Connection getconnection() throws SQLException{
        try{
           Class.forName(JDBC_DRIVER);
            con=DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD); 
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,"no se ha podido establecer una conexion con la base");
        }
        return con;
   }
    public static void close(ResultSet rs){
        try{
            if(rs != null) {
                rs.close();
            }
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }
    }
     public static void close(PreparedStatement stmt){
        try{
            if(stmt != null) {
                stmt.close();
            }
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }
    }
     public static void close(Connection con){
        try{
            if(con != null) {
                con.close();
            }
        }catch(SQLException sqle){
            sqle.printStackTrace();
        }
    }
}
