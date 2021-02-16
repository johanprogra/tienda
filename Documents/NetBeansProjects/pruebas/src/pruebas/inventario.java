
package pruebas;

import baseDatos.conexionMYSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class inventario {
        public int cod1,cod2,cont;
        public String [] colum=new String [7];
        conexionMYSQL mysql=new conexionMYSQL();
        Connection cn=mysql.Conectar();
	PreparedStatement ps=null;
	ResultSet rs=null;
    public static void main(String[] args) {
       
        
    }
    public void rango(){
        String query;
        try{
        query=("SELECT * FROM `productos`");
        ps=cn.prepareStatement(query);
	rs=ps.executeQuery();
        if(rs.first()){
            cod1= Integer.parseInt(rs.getString("cod_nit"));
         }
        if(rs.last()){
            cod2= Integer.parseInt(rs.getString("cod_nit"));
         }
        
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"No se encontro ningun resultado");
        }
    }
    
    public void inventarios(){
        int result;
        for(int i=0;i<cod1;i++){
            result=cont;
            cont=result+1;
            
        String query,cod="",nombre="",precio="",talla="",color="",exitencias="",ingreso="";
        try{
        query=("SELECT * FROM `productos` WHERE `cod_nit` = "+cont+"");
        ps=cn.prepareStatement(query);
	rs=ps.executeQuery();
        if(rs.next()){
            cod= rs.getString("cod_produtos");
            nombre= rs.getString("nombre_producto");
            precio= rs.getString("precio");
            talla= rs.getString("talla");
            color= rs.getString("color");
            exitencias= rs.getString("existencias");
            ingreso= rs.getString("fecha de ingreso");
         }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"No se encontro ningun resultado");
        }
        colum[i]=cod;
        }
        
    }
    
    
    
}
