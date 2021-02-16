
package pruebas;

import baseDatos.conexionMYSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class suma_fechas {
    
    
    public static void main(String[] args) {
        conexionMYSQL mysql=new conexionMYSQL();
        Connection cn=mysql.Conectar();
	PreparedStatement ps=null;
	ResultSet rs=null;
        ResultSet rs1=null;
        String query="",usu="",obser="",id="";
        int cantFilas = 0,i=0;
        int [] numero=new int[cantFilas];
        
        try{
        query=("SELECT * FROM `observacion_empleado");
        ps=cn.prepareStatement(query);
	rs=ps.executeQuery();
        if(rs.last()){
            
          cantFilas = rs.getRow();
         }
        
        for(i=0;i<cantFilas;i++){
            i++;
            numero[i]=i;
            try{
        query=("SELECT * FROM `observacion_empleado` WHERE `id_obsevacion`="+numero[i]+"");
        ps=cn.prepareStatement(query);
	rs1=ps.executeQuery();
        while(rs1.next())
              {
                  usu= rs1.getString("usuario");
                  obser = rs1.getString("observacion");
                 
              }}catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
        }
            
            
            
            System.out.println(usu+" "+obser);
        }}catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        
        
        
        
        
        
        

}

    }


