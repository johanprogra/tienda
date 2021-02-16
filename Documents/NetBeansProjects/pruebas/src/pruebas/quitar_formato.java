
package pruebas;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class quitar_formato {
     public static void main(String args[]) {
     int a=50000;
     DecimalFormat formato = new DecimalFormat("$ #,###.###");
     
     String ab=formato.format(a);
     JOptionPane.showMessageDialog(null,ab);
     
     String mystring = ab;
     String arr[] = mystring.split(" ", 2);
     String ac = arr[1];
     String valor2 = ac.replace(".","").replace(",", ".");
     JOptionPane.showMessageDialog(null,valor2);
     
     int ac1=Integer.parseInt(valor2);
     int valor3=ac1+50;
     JOptionPane.showMessageDialog(null,valor3);
     
     
     
     

     
     }
     
   
}
