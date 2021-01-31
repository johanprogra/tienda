
package funciones;

import java.text.DecimalFormat;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import static funciones.autocompletar.precio1;
import static tienda.ventas.asg;

public class total {
    
    public void total(JTextField p,JSpinner n1,JComboBox descuento,JTextField iva,JTextField Subtotal,JTextField neto){
     
      DecimalFormat df = new DecimalFormat("$ #,###.###");
      if(asg.equals("total")){
      String a=p.getText();
      String c[] = a.split(" ", 2);
      String ac = c[1];
      String valor2 = ac.replace(".","").replace(",", ".");
      int pre=Integer.parseInt(valor2);
      
      if(pre>0){
        int n_prendas,descuento1,sub,iv;
        double desc,net;
        n_prendas = (int) n1.getValue();
        descuento1= Integer.parseInt(descuento.getSelectedItem().toString());
        
        if(descuento1>0 && n_prendas>0){
         
         sub=pre*n_prendas;
         Subtotal.setText(df.format(sub));
         iv=(int) (sub*0.19);
         desc=descuento1*0.01;
         
         net=(sub+iv)-(pre*desc);
         
         iva.setText(df.format(iv));
         neto.setText(df.format(net));
        
        }
        else if(descuento1==0 && n_prendas>0){
         sub=pre*n_prendas;
         Subtotal.setText(df.format(sub));
         iv=(int) (sub*0.19);
         net=sub+iv;
         iva.setText(df.format(iv));
         neto.setText(df.format(net));
      }}else{
          JOptionPane.showMessageDialog(null,"Ingrese numero de prendas");
      } 
      
      }else{
       int comp;
        comp = Integer.parseInt(p.getText());
        if(comp>0){
        int n_prendas,descuento1,sub,iv;
        double desc,net;
        n_prendas = (int) n1.getValue();
        descuento1= Integer.parseInt(descuento.getSelectedItem().toString());
        
        if(descuento1>0 && n_prendas>0){
         sub=comp*n_prendas;
         Subtotal.setText(df.format(sub));
         iv=(int) (sub*0.19);
         desc=descuento1*0.01;
         net=(sub+iv)-(comp*desc);
         
         iva.setText(df.format(iv));
         neto.setText(df.format(net));
        
        }
        else if(descuento1==0 && n_prendas>0){
         sub=comp*n_prendas;
         Subtotal.setText(df.format(sub));
         iv=(int) (sub*0.19);
         net=sub+iv;
         iva.setText(df.format(iv));
         neto.setText(df.format(net));
      }else{
          JOptionPane.showMessageDialog(null,"Ingrese numero de prendas");
      }   
      }  
      
      }}
    public void cambiar_peso(JTextField p,JSpinner n1,JComboBox descuento,JTextField iva,JTextField Subtotal,JTextField neto){
      DecimalFormat df = new DecimalFormat("$ #,###.###");
      String a=p.getText();
      String c[] = a.split(" ", 2);
      String ac = c[1];
      String valor2 = ac.replace(".","").replace(",", ".");
      int pre=Integer.parseInt(valor2);
      
      
        int n_prendas,descuento1,sub,iv;
        double desc,net;
        n_prendas = (int) n1.getValue();
        descuento1= Integer.parseInt(descuento.getSelectedItem().toString());
        
        if(descuento1>0 && n_prendas>0){
         
         sub=pre*n_prendas;
         Subtotal.setText(df.format(sub));
         iv=(int) (sub*0.19);
         desc=descuento1*0.01;
         
         net=(sub+iv)-(pre*desc);
         
         iva.setText(df.format(iv));
         neto.setText(df.format(net));
        
        }
        else if(descuento1==0 && n_prendas>0){
         sub=pre*n_prendas;
         Subtotal.setText(df.format(sub));
         iv=(int) (sub*0.19);
         net=sub+iv;
         iva.setText(df.format(iv));
         neto.setText(df.format(net));
      }}
    
    public void enviartotal(JTextField p,JSpinner n1,JComboBox descuento,JTextField iva,
        JTextField Subtotal,JTextField neto){
        int pre,und=1,desc=0,sub,iv,net;
        String pre1,sub1,iv1,net1;
        pre=Integer.parseInt(precio1);
        DecimalFormat formato = new DecimalFormat("$ #,###.###");
        pre1=formato.format(pre);
        p.setText(pre1);
        
        n1.setValue(und);
        descuento.setSelectedItem(0);
        
        sub=pre*und;
        sub1=formato.format(sub);
        Subtotal.setText(sub1);
        
        iv=(int) (sub*0.19);
        iv1=formato.format(iv);
        iva.setText(iv1);
        
        net=(sub+iv)-(pre*desc);
        net1=formato.format(net);
        neto.setText(net1);
         
      }    
    
    
}


      
        
    

