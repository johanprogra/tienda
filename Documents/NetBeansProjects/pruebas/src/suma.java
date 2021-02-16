
import javax.swing.JOptionPane;


public class suma {
    public static void main (String args[]){
        
        int a,b,c;
        
        a=Integer.parseInt(JOptionPane.showInputDialog(null,"digite el primer numero"));
        
        b=Integer.parseInt(JOptionPane.showInputDialog(null,"digite el segundo numero"));
        
        c=a+b;
        
        JOptionPane.showMessageDialog(null,"El resultado es: "+c);
    }
}
