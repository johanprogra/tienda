
package ganador;

import javax.swing.JTextField;


public class estructura {
    public static int cont;
    public static String result1,result2,result3;

public void estructura_ganadora(JTextField n1,JTextField n2,JTextField n3,JTextField n4,JTextField n5,JTextField n6,JTextField n7,
JTextField a1,JTextField a2,JTextField a3,JTextField a4,JTextField a5,JTextField a6,JTextField a7,
JTextField r1,JTextField r2,JTextField r3,JTextField r4,JTextField r5,JTextField r6,JTextField r7
){
    String numero1;
    int v1,v2,v3,v4,v5,v6,v7;
    
    v1=Integer.parseInt(n1.getText());
    v2=Integer.parseInt(n2.getText());
    v3=Integer.parseInt(n3.getText());
    v4=Integer.parseInt(n4.getText());
    v5=Integer.parseInt(n5.getText());
    v6=Integer.parseInt(n6.getText());
    v7=Integer.parseInt(n7.getText());
    
    for(int i=0;i<9;i++){
        result1=v1+""+v2+""+v3+""+v4+""+v5+""+v6+""+v7;
    }
}   
    
}
