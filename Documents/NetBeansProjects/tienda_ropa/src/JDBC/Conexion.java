
package JDBC;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    
    private static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
    private static final String JDBC_URL="jdbc:mysql://localhost/tejido";
    private static final String JDBC_USER="root";
    private static final String JDBC_PASSWORD="";
    public static Connection con;
    
    public static synchronized Connection getconnection() throws SQLException{
        try{
            Class.forName(JDBC_DRIVER);
            con=DriverManager.getConnection(JDBC_URL,JDBC_USER,JDBC_PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null,"Error!! no se pudo establecer conexion "+e);
        }
        return con;
     }
    public static void close(Connection con){
        if (con!=null) {
            try {
                con.close();
            } catch (SQLException sqle) {}
        }
    }
    public static void close(PreparedStatement smt){
        if (smt!=null) {
            try {
                smt.close();
            } catch (SQLException sqle) {}
        }
    }
    public static void close(ResultSet rs){
        if (rs!=null) {
            try {
                rs.close();
            } catch (SQLException sqle) {}
        }
    }
   
}
