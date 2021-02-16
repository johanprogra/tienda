
package pruebas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import baseDatos.conexionMYSQL;
import javax.swing.JLabel;

public class date {
        DefaultTableModel modelo= new DefaultTableModel();
        conexionMYSQL mysql=new conexionMYSQL();
        Connection cn=mysql.Conectar();
	PreparedStatement ps=null;
	ResultSet rs=null;
    
    public void fecha(JLabel fe){
        int ns1=44;
        String ns2="";
        try {
		String query="SELECT `ID_cod`, `cod_empleado`, `doc_empleado`, `ciudad`, `vendedor`, `cliente`, `n_documento_cliente`, `direccion_cliente`, `telefono_cliente`, `cod_producto`, `nombre_producto`, `precio`, `bodega`, `n_prendas`, `descuento`, `pago`, `iva`, `subtotal`, `neto`, `fecha` FROM `ventas` WHERE `ID_cod`="+ns1+"";
		ps=cn.prepareStatement(query);
		rs=ps.executeQuery();
              while(rs.next())
              {
                 ns2 = rs.getString("fecha");
              }
             
             fe.setText(ns2);
	}  
        catch (SQLException e) 
        {
         JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
