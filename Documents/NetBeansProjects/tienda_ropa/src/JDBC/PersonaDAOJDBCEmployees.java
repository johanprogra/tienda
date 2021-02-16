
package JDBC;

import PersonaDTO.PersonaDTOemployees;
import java.sql.*;
import java.util.*;

public class PersonaDAOJDBCEmployees implements PersonaDaoEmployees{
    
    private Connection usercon;
    
    private static String parametro;
    
    private final String SQL_SELECT="SELECT `ID_nit`,`tipo_documento`,`documento`,`nombres`,`apellidos`,`direccion`,`telefono` FROM empleado WHERE tipo_documento LIKE '%"+parametro+"%' OR documento LIKE '%"+parametro+"%' OR `nombres` LIKE '%"+parametro+"%' OR `apellidos` LIKE '%"+parametro+"%' OR `direccion` LIKE '%"+parametro+"%' OR `telefono` LIKE '%"+parametro+"%'";
    private final String SQL_SELECT_ID="SELECT `ID_nit`,`documento`,`nombres`,`apellidos` FROM empleado WHERE `ID_nit` LIKE '%"+parametro+"%'";
   
    public PersonaDAOJDBCEmployees() {}
    
    public PersonaDAOJDBCEmployees(Connection usercon) {this.usercon = usercon;}
    
    public PersonaDAOJDBCEmployees(String parametro) {this.parametro = parametro;}

    
    @Override
    public List<PersonaDTOemployees> select() throws SQLException {
    Connection con=null;
        PreparedStatement smt=null;
        ResultSet rs=null;
        PersonaDTOemployees PersonaDTO=null;
        List<PersonaDTOemployees> personas = new ArrayList<>();
        try{
            con=(this.usercon !=null)?this.usercon:Conexion.getconnection();
            smt=con.prepareStatement(SQL_SELECT);
            rs=smt.executeQuery();
            while(rs.next()){
                int getID_nit=rs.getInt(1);
                String getTipo_documento=rs.getString(2);
                int getDocumento=rs.getInt(3);
                String getNombres=rs.getString(4);
                String getApellidos=rs.getString(5);
                String getDireccion=rs.getString(6);
                int getTelefono=rs.getInt(7);
                
                PersonaDTO =new PersonaDTOemployees();
                
                PersonaDTO.setID_nit(getID_nit);
                PersonaDTO.setTipo_documento(getTipo_documento);
                PersonaDTO.setDocumento(getDocumento);
                PersonaDTO.setNombres(getNombres);
                PersonaDTO.setApellidos(getApellidos);
                PersonaDTO.setDireccion(getDireccion);
                PersonaDTO.setTelefono(getTelefono);
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

    @Override
    public List<PersonaDTOemployees> select_id() throws SQLException {
        Connection con=null;
        PreparedStatement smt=null;
        ResultSet rs=null;
        PersonaDTOemployees PersonaDTO=null;
        List<PersonaDTOemployees> personas = new ArrayList<>();
        try{
            con=(this.usercon !=null)?this.usercon:Conexion.getconnection();
            smt=con.prepareStatement(SQL_SELECT_ID);
            rs=smt.executeQuery();
            while(rs.next()){
                int getID_nit=rs.getInt(1);
                int getDocumento=rs.getInt(2);
                String getNombres=rs.getString(3);
                String getApellidos=rs.getString(4);
                
                PersonaDTO =new PersonaDTOemployees();
                
                PersonaDTO.setID_nit(getID_nit);
                PersonaDTO.setDocumento(getDocumento);
                PersonaDTO.setNombres(getNombres);
                PersonaDTO.setApellidos(getApellidos);
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
