package Funciones;


import baseDatos.conexionMYSQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static tienda.login.texto;
import static tienda.login.cer;

public class usuario {
        conexionMYSQL mysql=new conexionMYSQL();
        Connection con=mysql.Conectar();
        
    public void Logguearse_vendedor(JTextField usuario1, JTextField contraseña){
        String nom=usuario1.getText();
        String pass=contraseña.getText();
     
        try
        {
        Statement b =  con.createStatement();
        ResultSet busqusua = b.executeQuery("SELECT * FROM registro_vendedor WHERE ID_registro and usuario='"+nom+"' and contraseña='"+pass+"'");
        boolean found = false;
        int user_id = 0;
        while(busqusua.next()){found=true; user_id = busqusua.getInt("ID_registro");}
        if(found)
        {
            JOptionPane.showMessageDialog(null, "Bienvenido (a) "+" "+nom+" al menu vendedor","Ingresando",JOptionPane.INFORMATION_MESSAGE);
            texto=nom;
            cer="abrir";
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Usuario  o contaseña incorrecta...","Incorrecto",JOptionPane.ERROR_MESSAGE);
        }
        }
        catch(SQLException ex)
        {
        JOptionPane.showMessageDialog(null,ex, "Error!!", JOptionPane.ERROR_MESSAGE);
        }
}   
    public void Logguearse_admin(JTextField usuario1, JTextField contraseña){
        String nom=usuario1.getText();
        String pass=contraseña.getText();
     
        try
        {
        Statement b =  con.createStatement();
        ResultSet busqusua = b.executeQuery("SELECT * FROM registro_admin WHERE ID_registro and usuario='"+nom+"' and contraseña='"+pass+"'");
        boolean found = false;
        int user_id = 0;
        while(busqusua.next()){found=true; user_id = busqusua.getInt("ID_registro");}
        if(found)
        {
            JOptionPane.showMessageDialog(null, "Bienvenido (a) "+" "+nom+" al menu de administrador","Ingresando",JOptionPane.INFORMATION_MESSAGE);
            texto=nom;
            cer="abrir";
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Usuario  o contaseña incorrecta...","Incorrecto",JOptionPane.ERROR_MESSAGE);
        }
        }
        catch(SQLException ex)
        {
        JOptionPane.showMessageDialog(null,ex, "Error!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
        
