
package ganador;

import javax.swing.JOptionPane;

public class prueba {
    public static int sum;

    public static void main(String[] args) {
        
        for(int i=0;i<9;i++){
        int suma,n1;
        String lon;
        
        n1=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite de nuevo el numero"));
        suma=n1+sum;
        sum=suma;
        lon=String.valueOf(suma);
            String substring = lon.substring(1);
            JOptionPane.showMessageDialog(null,"El resultado es: "+substring);
        
        
        
    }}
    
}
