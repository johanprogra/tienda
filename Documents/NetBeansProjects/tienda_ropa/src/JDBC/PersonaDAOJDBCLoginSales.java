
package JDBC;

import PersonaDTO.PersonaDTOLogin;
import java.sql.*;
import java.util.*;

public class PersonaDAOJDBCLoginSales implements PersonaDaoLogin{
    
    private Connection usercon;
    
    private static String user=null;
    
    private static String password=null;
    
    private final String SQL_SELECT="SELECT `usuario`, `contraseña` FROM `registro_vendedor` WHERE `usuario`='"+user+"' AND `contraseña`='"+password+"'";

    public PersonaDAOJDBCLoginSales() {}
    
    public PersonaDAOJDBCLoginSales(Connection usercon) {this.usercon = usercon;}
    
    public PersonaDAOJDBCLoginSales(String user,String Password) {this.user=user; this.password=Password;}
    

    @Override
    public List<PersonaDTOLogin> select() throws SQLException {
        Connection con=null;
        PreparedStatement smt=null;
        ResultSet rs=null;
        PersonaDTOLogin PersonaDTO=null;
        List<PersonaDTOLogin> personas = new ArrayList<>();
        try{
            con=(this.usercon !=null)?this.usercon:Conexion.getconnection();
            smt=con.prepareStatement(SQL_SELECT);
            rs=smt.executeQuery();
            while(rs.next()){
                String getUserTemp=rs.getString(1);
                String getPasswordTemp=rs.getString(2);
                
                PersonaDTO =new PersonaDTOLogin();
                
                PersonaDTO.setUser(getUserTemp);
                PersonaDTO.setPassword(getPasswordTemp);
                personas.add(PersonaDTO);
            }
        }finally{
            Conexion.close(rs);
            Conexion.close(smt);
            if (this.usercon==null) {
                Conexion.close(con);
            }
        }
            return personas;
    }
}
