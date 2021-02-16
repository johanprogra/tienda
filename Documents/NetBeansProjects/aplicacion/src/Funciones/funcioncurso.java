
package Funciones;


import aplicacion.estudiantes;
import javax.swing.JOptionPane;
import static aplicacion.cursos.cur1;
public class funcioncurso {
        
    public void cursos(String c){
        if(c.equals("N01")){
        cur1=c;
        estudiantes e2=new estudiantes();
        e2.setVisible(true);
            
        }
        else if(c.equals("N02")){
        cur1=c;
        estudiantes e2=new estudiantes();
        e2.setVisible(true);
        }
        else if(c.equals("N03")){
        cur1=c;
        estudiantes e2=new estudiantes();
        e2.setVisible(true);
        
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Por favor seleccione un curso");
        }
    }
    
}
