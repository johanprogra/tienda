
package pruebas;

import baseDatos.conexionMYSQL;
import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;


public class arreglos {
    public static String fechai="",fechaf="";
    conexionMYSQL mysql=new conexionMYSQL();
        Connection cn=mysql.Conectar();
	PreparedStatement ps=null;
	ResultSet rs=null;
    public static void main(String[] args) {
       
        for(int i=0;i<7;i++){
        
            String[] dias= {"lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
            System.out.println(dias[i]);
       
    }}
    
    public void fecha(JCheckBox dia1,JTextField mes1,JTextField año1){
       int dia=0,di=0,mes=0,año=0,dias=1;
        dia=Integer.parseInt(dia1.getText());
        mes=Integer.parseInt(mes1.getText());
        año=Integer.parseInt(año1.getText());
        
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                di=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                di=30;
                break;
            case 2:
                if((año%4==0 && año%100!=0) || año%400==0){
                    di = 29;
                }
                else{
                    di = 28;
                }
                break;
            default:
                break;
        }
           fechai=String.valueOf(año)+"-"+String.valueOf(mes)+"-"+String.valueOf(dias);
           fechaf=String.valueOf(año)+"-"+String.valueOf(mes)+"-"+String.valueOf(di); 
}   
        
    
     public void mostrar_dias(){
         String neto="";
          try{
              
              String query="SELECT `neto` FROM `ventas` WHERE `fecha` between '"+fechai+"' AND '"+fechaf+"'";
	      ps=cn.prepareStatement(query);
	      rs=ps.executeQuery();
              while(rs.next())
              {
              neto = rs.getString("neto");
                 
              }
        }catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    public void sumas(JTable result,JLabel totalizar){
        int pre,pos;
        for(int i=0;i<result.getRowCount();i++){
            i++;
      String prest=String.valueOf(result.getValueAt(i, 0));
      String c[] = prest.split(" ", 2);
      String ac = c[1];
      String valor2 = ac.replace(".","").replace(",", ".");
      pre=Integer.parseInt(valor2);
      pos=total+pre;
      total=pos;
      totalizar.setText(String.valueOf(pos));
      }
}}
