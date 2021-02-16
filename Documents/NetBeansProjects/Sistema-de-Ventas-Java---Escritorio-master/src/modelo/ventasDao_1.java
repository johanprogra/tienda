
package modelo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class ventasDao {
        conexion conectar=new conexion();
        Connection con;
        PreparedStatement ps;
        ResultSet rs;
        public List listar(){
        List<venta>datos=new ArrayList<>(); 
        String sql="select * from ventas";
          try{
                con=conectar.getConnection();
		ps=con.prepareStatement(sql);
                rs=ps.executeQuery();
                
                while(rs.next()){
                    venta p=new venta();
                    p.setCod_cod(rs.getInt(1));
                    p.setCod_empleado(rs.getInt(2));
                    p.setVendedor(rs.getString(3));
                    p.setCliente(rs.getString(4));
                    p.setCod_producto(rs.getString(5));
                    p.setNombre_producto(rs.getString(6));
                    p.setPrecio(rs.getInt(7));
                    p.setBodega(rs.getString(8));
                    p.setN_prendas(rs.getInt(9));
                    p.setDescuento(rs.getInt(10));
                    datos.add(p);
                }
          }catch (Exception e){
              
          }  
            
        return datos;
            
        }
    
}
