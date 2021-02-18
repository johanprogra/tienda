
package JDBC;

import PersonaDTO.personaDTOProducts;
import java.sql.*;
import java.util.*;

public class PesonaDaoJDBCProducts implements PersonaDaoProducts{
   
    private Connection usercon;
    
    private static String parametro;
    
    private final String SQL_SELECT="SELECT `cod_nit`, `cod_produtos`, `nombre_producto`, `precio`, `talla`, `color`, `existencias`, `fecha de ingreso` FROM `productos` WHERE `cod_produtos` LIKE '%"+parametro+"%' OR nombre_producto LIKE '%"+parametro+"%' OR `precio` LIKE '%"+parametro+"%' OR `talla` LIKE '%"+parametro+"%' OR `color` LIKE '%"+parametro+"%' OR `existencias` LIKE '%"+parametro+"%' OR `fecha de ingreso` LIKE '%"+parametro+"%'";
    
    public PesonaDaoJDBCProducts() {}
    
    public PesonaDaoJDBCProducts(Connection usercon) {this.usercon = usercon;}
    
    public PesonaDaoJDBCProducts(String parametro) {this.parametro = parametro;}

    @Override
    public List<personaDTOProducts> select() throws SQLException {
      Connection con=null;
        PreparedStatement smt=null;
        ResultSet rs=null;
        personaDTOProducts PersonaDTO=null;
        List<personaDTOProducts> personas = new ArrayList<>();
        try{
            con=(this.usercon !=null)?this.usercon:Conexion.getconnection();
            smt=con.prepareStatement(SQL_SELECT);
            rs=smt.executeQuery();
            while(rs.next()){
                int getID_nit=rs.getInt(1);
                int getCodigo_producto=rs.getInt(2);
                String getNombre_producto=rs.getString(3);
                int getPrecio=rs.getInt(4);
                String getTalla=rs.getString(5);
                String getColor=rs.getString(6);
                int getExistencias=rs.getInt(7);
                String getFecha_de_ingreso=rs.getString(8);
                
                PersonaDTO =new personaDTOProducts();
                
                PersonaDTO.setCod_Id(getID_nit);
                PersonaDTO.setCod_producto(getCodigo_producto);
                PersonaDTO.setNombre_producto(getNombre_producto);
                PersonaDTO.setPrecio(getPrecio);
                PersonaDTO.setTalla(getTalla);
                PersonaDTO.setColor(getColor);
                PersonaDTO.setExistencias(getExistencias);
                PersonaDTO.setFecha_de_ingreso(getFecha_de_ingreso);
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
    
    
    
