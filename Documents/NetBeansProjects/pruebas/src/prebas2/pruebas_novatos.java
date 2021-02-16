
package prebas2;

import javax.swing.JOptionPane;

public class pruebas_novatos {
    public static void main(String []args){
        double doble=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese numero"));
        JOptionPane.showMessageDialog(null,"El numero es: "+doble);
        
        char cart=JOptionPane.showInputDialog(null,"hola malditos").charAt(3);
        JOptionPane.showMessageDialog(null,"El nombre es: "+cart);    
    }
}
