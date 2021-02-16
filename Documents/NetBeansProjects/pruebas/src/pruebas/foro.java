
package pruebas;
import baseDatos.conexionMYSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class foro {
    
    public static void main(String[] args) {
        conexionMYSQL mysql=new conexionMYSQL();
        Connection cn=mysql.Conectar();
	PreparedStatement ps=null;
	ResultSet rs=null;
        
        String query="",id="",usu="",obser="";
        int cantFilas=0;
        
        try{
        query=("SELECT * FROM `observacion_empleado`");
        ps=cn.prepareStatement(query);
	rs=ps.executeQuery();
        if(rs.last()){
            
          cantFilas = rs.getRow();
         }}catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
        }
        int [] numero=new int[cantFilas];
        
        for(int i=0;i<=cantFilas;i++){
           
            numero[i]=cantFilas;
        try{
        query=("SELECT * FROM `observacion_empleado` WHERE `id_obsevacion`="+numero[i]+"");
        ps=cn.prepareStatement(query);
	rs=ps.executeQuery();
        while(rs.next()){
            id= rs.getString("id_obsevacion");
            usu = rs.getString("usuario");
            obser = rs.getString("observacion");
            JOptionPane.showMessageDialog(null,id+" "+usu+" "+obser);
         }
             }catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
        }
        }
        
        
        
    }
}
