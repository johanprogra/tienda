
package functions;

import JDBC.PersonaDaoProducts;
import JDBC.PesonaDaoJDBCProducts;
import PersonaDTO.personaDTOProducts;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class funtionProducts {
    
    public void dataUsed(JTable result){
        
        DefaultTableModel modelo= new DefaultTableModel();
        
        PersonaDaoProducts personaDao = new PesonaDaoJDBCProducts();
        
        try{
            List<personaDTOProducts> personas = personaDao.select();
            
            modelo.setRowCount(0);
            modelo.setColumnIdentifiers(new Object[]{"cod_nit","cod_produtos","nombre_producto","precio","talla","color","existencias","fecha de ingreso"         
              });
              for (personaDTOProducts u : personas) {
                  
              modelo.addRow(new Object[]{u.getCod_Id(),u.getCod_producto(),u.getNombre_producto(),u.getPrecio(),u.getTalla()
              
              ,u.getColor(),u.getExistencias(),u.getFecha_de_ingreso()});
              
             }
              result.setModel(modelo); 
              
        }catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Error!!!  "+ex);
          
        }
    }
}
