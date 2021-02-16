
package baseDatos;
import baseDatos.conexionMYSQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import static aplicacion.estudiantes.est1;
import static aplicacion.estudiantes.est10;
import static aplicacion.estudiantes.est2;
import static aplicacion.estudiantes.est3;
import static aplicacion.estudiantes.est4;
import static aplicacion.estudiantes.est5;
import static aplicacion.estudiantes.est6;
import static aplicacion.estudiantes.est7;
import static aplicacion.estudiantes.est8;
import static aplicacion.estudiantes.est9;
import aplicacion.no_asistieron;


public class funcionestudiantes {
    
     public void enviar(int e12,String cp,String cp2,String cp3,String cp4,String cp5,String cp6,String cp7,String cp8,String cp9,String cp10){
         if(e12==1){
        }
        else{
            String a1 = cp;
            est1 = a1;
        }
        if(e12==2){
        }
        else{
            String a2 = cp3;
            est2 = a2;
        }
        if(e12==3){
        }
        else{
            String a3 = cp3;
            est3 = a3;
        }
        if(e12==4){
        }
        else{
            String a4 = cp4;
            est4 = a4;
        }
        if(e12==5){
        }
        else{
            String a5 = cp5;
            est5 = a5;
        }
        if(e12==6){
        }
        else{
            String a6 = cp6;
            est6 = a6;
        }
        if(e12==7){
        }
        else{
            String a7 = cp7;
            est7 = a7;
        }
        if(e12==8){
        }
        else{
            String a8 = cp8;
            est8 = a8;
        }
        if(e12==9){
        }
        else{
            String a9 = cp9;
            est9 = a9;
        }
        if(e12==10){
        }
        else{
            String a10 = cp10;
            est10 = a10;
        }
        no_asistieron e2=new no_asistieron();
        e2.setVisible(true);
         
     }
}
