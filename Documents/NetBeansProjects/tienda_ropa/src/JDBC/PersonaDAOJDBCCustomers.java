
package JDBC;

import PersonaDTO.personaDTOcustomers;

import java.sql.*;

import java.util.*;

public class PersonaDAOJDBCCustomers implements personaDaoCustomers{
    
    private Connection usercon;
    
    private static String parametro;
    
    private final String SQL_INSERT="INSERT INTO `cliente`(`tipo_documento`, `cedula`, `nombres`, `apellidos`, `direccion`, `ciudad`, `telefono`, `celular`, `genero`, `observacion`) VALUES(?,?,?,?,?,?,?,?,?,?)";
    
    private final String SQL_SELECT="SELECT `ID_nit`,`tipo_documento`,`cedula`,`nombres`,`apellidos`,`direccion`,`ciudad`,`celular` FROM cliente WHERE `ID_nit` LIKE '%"+parametro+"%' OR `tipo_documento` LIKE '%"+parametro+"%' OR `cedula` LIKE '%"+parametro+"%' OR `nombres` LIKE '%"+parametro+"%' OR `apellidos` LIKE '%"+parametro+"%' OR `direccion` LIKE '%"+parametro+"%' OR `ciudad` LIKE '%"+parametro+"%' OR `celular` LIKE '%"+parametro+"%'";
    
    private final String SQL_SELECT_LAST_RECORD="SELECT * FROM cliente WHERE `tipo_documento` LIKE '%"+parametro+"%'";
    
    public PersonaDAOJDBCCustomers() {}

    public PersonaDAOJDBCCustomers(Connection usercon) {this.usercon = usercon;}
    
    public PersonaDAOJDBCCustomers(String parametro) {this.parametro = parametro;}
    
    @Override
    public int insert(personaDTOcustomers persona) throws SQLException {
        Connection con=null;
        PreparedStatement smt=null;
        int rows=0;
        try{
        con=(this.usercon !=null)?this.usercon:Conexion.getconnection();
        smt=con.prepareStatement(SQL_INSERT);
        int index=1;
        smt.setString(index++, persona.getTipo_documento());
        smt.setInt(index++, persona.getCedula());
        smt.setString(index++, persona.getNombres());
        smt.setString(index++, persona.getApellidos());
        smt.setString(index++, persona.getDireccion());
        smt.setString(index++, persona.getCiudad());
        smt.setInt(index++, persona.getTelefono());
        smt.setInt(index++, persona.getCelular());
        smt.setString(index++, persona.getGenero());
        smt.setString(index, persona.getObservacion());
        rows=smt.executeUpdate();
        }finally{
            Conexion.close(smt);
            if (usercon == null) {
                Conexion.close(con);
            }
         }
        return rows;
    }

    @Override
    public List<personaDTOcustomers> select() throws SQLException {
        Connection con=null;
        PreparedStatement smt=null;
        ResultSet rs=null;
        personaDTOcustomers PersonaDTO=null;
        List<personaDTOcustomers> personas = new ArrayList<>();
        try{
            con=(this.usercon !=null)?this.usercon:Conexion.getconnection();
            smt=con.prepareStatement(SQL_SELECT);
            rs=smt.executeQuery();
            while(rs.next()){
                int getID_nit=rs.getInt(1);
                String getTipo_documento=rs.getString(2);
                int getCedula=rs.getInt(3);
                String getNombres=rs.getString(4);
                String getApellidos=rs.getString(5);
                String getDireccion=rs.getString(6);
                String getCiudad=rs.getString(7);
                int getCelular=rs.getInt(8);
                
                PersonaDTO =new personaDTOcustomers();
                
                PersonaDTO.setID_nit(getID_nit);
                PersonaDTO.setTipo_documento(getTipo_documento);
                PersonaDTO.setCedula(getCedula);
                PersonaDTO.setNombres(getNombres);
                PersonaDTO.setApellidos(getApellidos);
                PersonaDTO.setDireccion(getDireccion);
                PersonaDTO.setCiudad(getCiudad);
                PersonaDTO.setCelular(getCelular);
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
    public List<personaDTOcustomers> select_lastRecord() throws SQLException {
        Connection con=null;
        PreparedStatement smt=null;
        ResultSet rs=null;
        personaDTOcustomers PersonaDTO=null;
        List<personaDTOcustomers> personas = new ArrayList<>();
        try{
            con=(this.usercon !=null)?this.usercon:Conexion.getconnection();
            smt=con.prepareStatement(SQL_SELECT_LAST_RECORD);
            rs=smt.executeQuery();
            while(rs.next()){
                int getID_nit=rs.getInt(1);
                String getTipo_documento=rs.getString(2);
                int getCedula=rs.getInt(3);
                String getNombres=rs.getString(4);
                String getApellidos=rs.getString(5);
                String getDireccion=rs.getString(6);
                String getCiudad=rs.getString(7);
                int getTelefono=rs.getInt(8);
                int getCelular=rs.getInt(9);
                String getGenero=rs.getString(10);
                String getObservacion=rs.getString(11);
                
                PersonaDTO =new personaDTOcustomers();
                
                PersonaDTO.setID_nit(getID_nit);
                PersonaDTO.setTipo_documento(getTipo_documento);
                PersonaDTO.setCedula(getCedula);
                PersonaDTO.setNombres(getNombres);
                PersonaDTO.setApellidos(getApellidos);
                PersonaDTO.setDireccion(getDireccion);
                PersonaDTO.setCiudad(getCiudad);
                PersonaDTO.setTelefono(getTelefono);
                PersonaDTO.setCelular(getCelular);
                PersonaDTO.setGenero(getGenero);
                PersonaDTO.setObservacion(getObservacion);
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
