
package pruebas;

import javax.swing.JOptionPane;

public class arreglos2 {
    public static void main(String[] args) {
        int co=10;
        int cont=-1; 
        String [] letras=new String[co];
        for(int i=0;i<co;i++){
            cont++;
            String le=JOptionPane.showInputDialog(null,"inserte letras");
            letras[i]=le;
            System.out.println("la i es: "+i+" la letra es: "+letras[cont]);
        }
        
    }
}
