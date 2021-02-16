
package pruebas;

import javax.swing.JOptionPane;


public class encapsulamiento {
private int edad;
    public static void main(String[] args) {
        encapsulamiento encap=new encapsulamiento();
        encap.setedad(20);
        JOptionPane.showMessageDialog(null,"la edad es: "+encap.getedad());
    }
    
    public void setedad(int edad){
        this.edad=edad;
    }
    public int getedad(){
        return edad;
    }
}
