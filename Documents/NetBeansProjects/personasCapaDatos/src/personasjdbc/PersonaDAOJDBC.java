
package personasjdbc;

import java.sql.*;
import java.util.*;
import personasDTO.personaDTO;
public class PersonaDAOJDBC implements PersonaDao{
   
    private final String SQL_INSERT="INSERT INTO `estudiantes`(`nombres`, `apellidos`, `materias`, `id_profesores1`) VALUES (?,?,?,?)";
    private final String SQL_UPDATE="UPDATE `estudiantes` SET `nombres`=?,`apellidos`=?,`materias`=?,`id_profesores1`=? WHERE `id_estudiantes`=?";
    private final String SQL_DELETE="DELETE FROM `estudiantes` WHERE `id_estudiantes`=?";
    private final String SQL_SELECT="SELECT * FROM `estudiantes` WHERE `id_estudiantes`";
    private Connection usercon;
    
    public PersonaDAOJDBC() {}
    
    public PersonaDAOJDBC(Connection con) {this.usercon = con;}
    
@Override
    public int insert(personaDTO persona) throws SQLException {
        Connection con=null;
        PreparedStatement smt=null;
        int rows=0;
        try{
            con=(this.usercon !=null)?this.usercon:Conexion.getconnection();
            smt=con.prepareStatement(SQL_INSERT);
            int index=1;
            smt.setString(index++, persona.getNombres());
            smt.setString(index++, persona.getApellidos());
            smt.setString(index++, persona.getMaterias());
            smt.setInt(index, persona.getId_profesores1());
            rows=smt.executeUpdate();
        }finally{
            Conexion.close(smt);
            if (this.usercon==null) {
                Conexion.close(con);
            }
        }
        return rows;
    }

    @Override
    public int update(personaDTO persona) throws SQLException {
        Connection con=null;
        PreparedStatement smt=null;
        int rows=0;
        try{
            con=(this.usercon !=null)?this.usercon:Conexion.getconnection();
            smt=con.prepareStatement(SQL_UPDATE);
            int index=1;
            smt.setString(index++, persona.getNombres());
            smt.setString(index++, persona.getApellidos());
            smt.setString(index++, persona.getMaterias());
            smt.setInt(index++, persona.getId_profesores1());
            smt.setInt(index, persona.getId_estudiantes());
            rows=smt.executeUpdate();
        }finally{
            Conexion.close(smt);
            if (this.usercon==null) {
                Conexion.close(con);
            }
        }
        return rows;
    }

    @Override
    public int delete(personaDTO persona) throws SQLException {
        Connection con=null;
        PreparedStatement smt=null;
        int rows=0;
        try{
            con=(this.usercon !=null)?this.usercon:Conexion.getconnection();
            smt=con.prepareStatement(SQL_DELETE);
            int index=1;
            smt.setInt(index, persona.getId_estudiantes());
            rows=smt.executeUpdate();
        }finally{
            Conexion.close(smt);
            if (this.usercon==null) {
                Conexion.close(con);
            }
        }
        return rows;
    }

    @Override
    public List<personaDTO> select() throws SQLException {
        Connection con=null;
        PreparedStatement smt=null;
        ResultSet rs=null;
        personaDTO PersonaDTO=null;
        List<personaDTO> personas = new ArrayList<>();
        try{
            con=(this.usercon !=null)?this.usercon:Conexion.getconnection();
            smt=con.prepareStatement(SQL_SELECT);
            rs=smt.executeQuery();
            while(rs.next()){
                int getId_estudiantesTemp=rs.getInt(1);
                String getNombresTemp=rs.getString(2);
                String getApellidosTemp=rs.getString(3);
                String getMateriasTemp=rs.getString(4);
                int getId_profesores1Temp=rs.getInt(5);
                
                PersonaDTO =new personaDTO();
                
                PersonaDTO.setId_estudiantes(getId_estudiantesTemp);
                PersonaDTO.setNombres(getNombresTemp);
                PersonaDTO.setApellidos(getApellidosTemp);
                PersonaDTO.setMaterias(getMateriasTemp);
                PersonaDTO.setId_profesores1(getId_profesores1Temp);
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
