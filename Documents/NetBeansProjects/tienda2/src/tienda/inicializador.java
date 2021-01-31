
package tienda;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class inicializador {
     public static void main(String args[]) {
      int resta,i=1,ss,ss1;
      inicio ini=new inicio();
      ini.setVisible(true);
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
      }while(resta<5);{
        
         ini.dispose();
         login lo=new login();
         lo.setVisible(true);
      }
      
      
      }}
