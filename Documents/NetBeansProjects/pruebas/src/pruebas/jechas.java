
package pruebas;

import com.toedter.calendar.JDateChooser;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class jechas {
    public void fechas(JDateChooser desde,JDateChooser hasta){
        if(desde.getDate()!=hasta.getDate()){
            Calendar inicio=desde.getCalendar();
            Calendar termino=hasta.getCalendar();
            int dias=-1;
            while(inicio.before(termino) || inicio.equals(termino)){
                dias++;
                inicio.add(Calendar.DATE,1);
            }
            JOptionPane.showMessageDialog(null,"Los dias transcurridos son: "+dias);
        }
    }
}
