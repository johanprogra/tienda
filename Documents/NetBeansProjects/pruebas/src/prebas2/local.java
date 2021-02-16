
package prebas2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
public class local {

   
    public static void main(String[] args) {
        LocalDate fecha= LocalDate.of(2020,Month.DECEMBER, 15);
        LocalTime hora= LocalTime.of(11,30);
        LocalDateTime fechahora = LocalDateTime.of(fecha,hora);
        //para restar hora
        fechahora = fechahora.minusHours(1);
        System.out.println(fechahora);
        
        
    }
    
}
