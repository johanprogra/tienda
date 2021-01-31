
package funciones;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JLabel;
import tienda.inicio;
import tienda.login;

public class hora {
        public static String diaactual="",horaactual="",fechaactual="";
        
        public void tiempo(JLabel mostrara){
 
      Date sistFecha=new Date();
      SimpleDateFormat format=new SimpleDateFormat("dd MMMMM YYYY");
      fechaactual=format.format(sistFecha);
      
      Date sistema=new Date();
      String pmAm="hh:mm:ss a";
      SimpleDateFormat formato=new SimpleDateFormat(pmAm);
      Calendar hoy=Calendar.getInstance();
      horaactual=String.format(formato.format(sistema),hoy);
      
      Date dia=new Date();
      String dias=("EEEE  ");
      SimpleDateFormat fromat1=new SimpleDateFormat(dias);
      diaactual=fromat1.format(dia);
      
      
      mostrara.setText(diaactual+fechaactual+"     "+horaactual);
        
        }
       public void cerrar1(){ 

          int resta,i=1,ss,ss1;
          Date sistema1=new Date();
          String pmAm1="ss";
          SimpleDateFormat formato1=new SimpleDateFormat(pmAm1);
          Calendar hoy1=Calendar.getInstance();
          String segundos1=String.format(formato1.format(sistema1),hoy1);
          ss1=Integer.parseInt(segundos1);
      do{
          Date sistema=new Date();
          String pmAm="ss";
          SimpleDateFormat formato=new SimpleDateFormat(pmAm);
          Calendar hoy=Calendar.getInstance();
          String segundos=String.format(formato.format(sistema),hoy);
          ss=Integer.parseInt(segundos);
          resta=ss-ss1;
          i++;
      }while(resta<15);{
         inicio ini=new inicio();
         ini.dispose();
         login lo=new login();
         lo.setVisible(true);
      }
      
    }}


