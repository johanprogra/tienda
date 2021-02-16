
package JDBC;

import PersonaDTO.PersonaDTOSales;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAOJDBCSales implements PersonaDaoSales{
    private final String SQL_INSERT="INSERT INTO ventas(`cod_empleado`, `doc_empleado`, `ciudad`, `vendedor`, `cliente`, `n_documento_cliente`, `direccion_cliente`, `telefono_cliente`, `cod_producto`, `nombre_producto`, `precio`, `bodega`, `n_prendas`, `descuento`, `pago`, `iva`, `subtotal`, `neto`, `fecha`) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    
    private final String SQL_UPDATE="UPDATE `ventas` SET `cod_empleado`= ?, `doc_empleado`= ?,"
    + " `ciudad`= ?, `vendedor`= ?, `cliente`= ?, `n_documento_cliente`= ?, `direccion_cliente`= ?,"
    + " `telefono_cliente`= ?, `cod_producto`= ?, `nombre_producto`= ?, `precio`= ?, `bodega`= ?,"
    + " `n_prendas`= ?, `descuento`= ?, `pago`= ?, `iva`= ?, `subtotal`= ?, `neto`= ?,`obsevacion_de_actualizacion`= ? WHERE `ID_cod`=?";
    
    private final String SQL_DELETE="delete from ventas where ID_cod=?";
    
    private final String SQL_SELECT="SELECT * FROM `ventas` WHERE `ID_cod`";
    
    public Connection usercon;

    public PersonaDAOJDBCSales() {}
    
    public PersonaDAOJDBCSales(Connection usercon) {this.usercon = usercon;}
    
    @Override
    public int insert(PersonaDTOSales persona) throws SQLException {
        Connection con=null;
        PreparedStatement smt=null;
        int rows=0;
        try{
        con=(this.usercon !=null)?this.usercon:Conexion.getconnection();
        smt=con.prepareStatement(SQL_INSERT);
        int index=1;
        smt.setInt(index++, persona.getCod_empleados());
        smt.setInt(index++, persona.getDoc_empleado());
        smt.setString(index++, persona.getCiudad());
        smt.setString(index++, persona.getVendedor());
        smt.setString(index++, persona.getCliente());
        smt.setInt(index++, persona.getN_doc_cliente());
        smt.setString(index++, persona.getDireccion_cliente());
        smt.setInt(index++, persona.getTelefono_cliente());
        smt.setInt(index++, persona.getCod_producto());
        smt.setInt(index++, persona.getNombre_producto());
        smt.setInt(index++, persona.getPrecio());
        smt.setString(index++, persona.getBodega());
        smt.setInt(index++, persona.getN_productos());
        smt.setInt(index++, persona.getDescuento());
        smt.setInt(index++, persona.getPago());
        smt.setInt(index++, persona.getIva());
        smt.setInt(index++, persona.getSubtotal());
        smt.setInt(index++, persona.getNeto());
        smt.setString(index, persona.getFecha());
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
    public int update(PersonaDTOSales persona) throws SQLException {
        Connection con=null;
        PreparedStatement smt=null;
        int rows=0;
        try{
        con=(this.usercon !=null)?this.usercon:Conexion.getconnection();
        smt=con.prepareStatement(SQL_UPDATE);
        int index=1;
        smt.setInt(index++, persona.getCod_empleados());
        smt.setInt(index++, persona.getDoc_empleado());
        smt.setString(index++, persona.getCiudad());
        smt.setString(index++, persona.getVendedor());
        smt.setString(index++, persona.getCliente());
        smt.setInt(index++, persona.getN_doc_cliente());
        smt.setString(index++, persona.getDireccion_cliente());
        smt.setInt(index++, persona.getTelefono_cliente());
        smt.setInt(index++, persona.getCod_producto());
        smt.setInt(index++, persona.getNombre_producto());
        smt.setInt(index++, persona.getPrecio());
        smt.setString(index++, persona.getBodega());
        smt.setInt(index++, persona.getN_productos());
        smt.setInt(index++, persona.getDescuento());
        smt.setInt(index++, persona.getPago());
        smt.setInt(index++, persona.getIva());
        smt.setInt(index++, persona.getSubtotal());
        smt.setInt(index++, persona.getNeto());
        smt.setString(index, persona.getFecha());
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
    public int delete(PersonaDTOSales persona) throws SQLException {
        Connection con=null;
        PreparedStatement smt=null;
        int rows=0;
        try{
        con=(this.usercon !=null)?this.usercon:Conexion.getconnection();
        smt=con.prepareStatement(SQL_DELETE);
        int index=1;
        smt.setInt(index, persona.getID_Cod_ventas());
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
    public List<PersonaDTOSales> select() throws SQLException {
        Connection con=null;
        PreparedStatement smt=null;
        ResultSet rs=null;
        PersonaDTOSales PersonaDTO=null;
        List<PersonaDTOSales> personas = new ArrayList<>();
        try{
            con=(this.usercon !=null)?this.usercon:Conexion.getconnection();
            smt=con.prepareStatement(SQL_SELECT);
            rs=smt.executeQuery();
            while(rs.next()){
                int getID_Cod_ventasTemp=rs.getInt(1);
                int getCod_empleadosTemp=rs.getInt(2);
                int getDoc_empleadoTemp=rs.getInt(3);
                String getciudadTemp=rs.getString(4);
                String getvendedorTemp=rs.getString(5);
                String getclienteTemp=rs.getString(6);
                int getN_doc_clienteTemp=rs.getInt(7);
                String getDireccion_clienteTemp=rs.getString(8);
                int getTelefono_clienteTemp=rs.getInt(9);
                int getcod_productoTemp=rs.getInt(10);
                int getnombre_productoTemp=rs.getInt(11);
                int getprecioTemp=rs.getInt(12);
                String getbodegaTemp=rs.getString(13);
                int getN_productosTemp=rs.getInt(14);
                int getdescuentoTemp=rs.getInt(15);
                int getpagoTemp=rs.getInt(16);
                int getivaTemp=rs.getInt(17);
                int getsubtotalTemp=rs.getInt(18);
                int getnetoTemp=rs.getInt(19);
                String getfechaTemp=rs.getString(20);
                
                PersonaDTO =new PersonaDTOSales();
                
                PersonaDTO.setID_Cod_ventas(getID_Cod_ventasTemp);
                PersonaDTO.setCod_empleados(getCod_empleadosTemp);
                PersonaDTO.setDoc_empleado(getDoc_empleadoTemp);
                PersonaDTO.setCiudad(getciudadTemp);
                PersonaDTO.setVendedor(getvendedorTemp);
                PersonaDTO.setCliente(getclienteTemp);
                PersonaDTO.setN_doc_cliente(getN_doc_clienteTemp);
                PersonaDTO.setDireccion_cliente(getDireccion_clienteTemp);
                PersonaDTO.setTelefono_cliente(getTelefono_clienteTemp);
                PersonaDTO.setCod_producto(getcod_productoTemp);
                PersonaDTO.setNombre_producto(getnombre_productoTemp);
                PersonaDTO.setPrecio(getprecioTemp);
                PersonaDTO.setBodega(getbodegaTemp);
                PersonaDTO.setN_productos(getN_productosTemp);
                PersonaDTO.setDescuento(getdescuentoTemp);
                PersonaDTO.setPago(getpagoTemp);
                PersonaDTO.setIva(getivaTemp);
                PersonaDTO.setSubtotal(getsubtotalTemp);
                PersonaDTO.setNeto(getnetoTemp);
                PersonaDTO.setFecha(getfechaTemp);
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
