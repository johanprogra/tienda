
package pruebas;

import javax.swing.JOptionPane;


public class retorno {

 
    public static void main(String[] args) {
        retorno nu=new retorno();
        int suma=nu.numeros(0);
        String saludo=nu.saludos(null);
        JOptionPane.showMessageDialog(null,"El numero de la suma es: "+suma+" "+saludo);
        
        
    }
    public int numeros(int suma){
        int a=5,b=4;
        suma=a+b;
        return suma;
        
    }
    public String saludos(String dia){
        dia="hola que tal";
        return dia;
        
    }
}
