
package baseDatos;
import baseDatos.conexionMYSQL;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.List;

public class actualizar {
conexionMYSQL mysql=new conexionMYSQL();
Connection cn=mysql.Conectar();
PreparedStatement ps;
ResultSet rs;
    public int actualizar(Object[] o) {
        int r=0;
        String sql="update cliente set cedula,nombres,apellidos,direccion,telefono where ID_nit=?";
        try{
            cn=mysql.Conectar();
            ps=cn.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            r=ps.executeUpdate();
            
        }catch(Exception e){
            
        }
    return r;
    }
}
