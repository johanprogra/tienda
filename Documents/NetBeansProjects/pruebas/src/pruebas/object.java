
package pruebas;


import baseDatos.conexionMYSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class object {
    
    
    public static void main(String[] args) {
        object su=new object();
       su.sumasa();
    }
    
    public int sumasa(){
        int num1=15,num2=15,suma,total;
        suma=num1+num2;
        total=suma+suma;
        
        System.out.println(total);
        return 0;
        
    }
    
    }


