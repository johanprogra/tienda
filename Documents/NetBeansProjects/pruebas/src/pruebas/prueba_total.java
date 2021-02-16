
package pruebas;


import baseDatos.conexionMYSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class prueba_total {
    DefaultTableModel modelo= new DefaultTableModel();
        conexionMYSQL mysql=new conexionMYSQL();
        Connection cn=mysql.Conectar();
	PreparedStatement ps=null;
	ResultSet rs=null;
    
    public void consulta(JTable result){
      
              try {
		String query="SELECT `neto` FROM `ventas` WHERE `fecha` between '2020-07-15' AND '2020-07-18'";
		ps=cn.prepareStatement(query);
		rs=ps.executeQuery();
                modelo.setRowCount(0);
                modelo.setColumnIdentifiers(new Object[]{"neto"
              });
                            
              while(rs.next())
              {
                modelo.addRow(new Object[]{rs.getString("neto")}); 
              }
              
             result.setModel(modelo);   
	}  
        catch (SQLException ex) 
        {
         JOptionPane.showMessageDialog(null,"No se encontro ningun resultado");
        } }
public void devolver(JTable result,JLabel totalizar){
        int sumatoria = 0,sumatoria1 = 0;
        int totalRow= result.getRowCount();
        totalRow-=1;
        for(int i=0;i<=(totalRow);i++)
        {
      String prest=String.valueOf(result.getValueAt(i, 0));
      String c[] = prest.split(" ", 2);
      String ac = c[1];
      String valor2 = ac.replace(".","").replace(",", ".");
      sumatoria=Integer.parseInt(valor2);

           }
        sumatoria1+=sumatoria;
             
             totalizar.setText(String.valueOf(sumatoria1));
}

}
