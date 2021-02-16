
package funciones;

import curso.cursos;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import javax.swing.JOptionPane;

public class funcion {
        conexionMYSQL mysql=new conexionMYSQL();
        Connection cn = mysql.Conectar();
	PreparedStatement ps=null;
	ResultSet rs=null;
        String query="";
        public static String usu="";
        public static String n_cursos="";
        String cla="";
        boolean cerrar;

        
    public boolean login(String usuario,String contraseña) throws SQLException{
        try{
        query=("SELECT `usuario`,`clave` FROM `registro` WHERE `usuario` LIKE '"+usuario+"' AND '"+contraseña+"'");
        ps=cn.prepareStatement(query);
	rs=ps.executeQuery();
        while(rs.next())
              {
                 usu=rs.getString("usuario");
                 cla=rs.getString("clave");
              }
        if(!"".equals(usu) && !"".equals(cla)){
            cursos cur=new cursos();
            cur.setVisible(true);
            cerrar=true;
            
        }else{
            JOptionPane.showMessageDialog(null,"Clave o Contraseña incorrecta");
            cerrar=false;
        }
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,"Hubo problemas con la base de datos: "+e);
        }finally{
            cn.close();
        }
        return cerrar;
    }
    
    
    public List<String> lista_cursos(){
        List<String> list=new ArrayList<>(); 
        list.add("N01");
        list.add("N02");
        list.add("N03");
        
        return list;
    } 
   public String alumnos(String lista_cursos) throws SQLException{
       try{
        query=("SELECT '"+lista_cursos+"' FROM `estudiantes` WHERE `ID_nit`");
        ps=cn.prepareStatement(query);
	rs=ps.executeQuery();
        while(rs.next())
              {
                 n_cursos=rs.getString(lista_cursos);
              }
        
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null,"Hubo problemas con la base de datos: "+e);
        }finally{
            cn.close();
        }
        
            return n_cursos;
       
   }
}
