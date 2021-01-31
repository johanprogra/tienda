
package functions;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JLabel;

public class time {
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
       
}


