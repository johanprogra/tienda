
package functions;

import JDBC.PersonaDAOJDBCEmployees;
import JDBC.PersonaDaoEmployees;
import PersonaDTO.PersonaDTOemployees;
import java.sql.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class funtionEmployees {
    
    public funtionEmployees() {}
    
    public void dataUsed(JTable result){
        
        DefaultTableModel modelo= new DefaultTableModel();
        
        PersonaDaoEmployees personaDao = new PersonaDAOJDBCEmployees();
        
        try{
            List<PersonaDTOemployees> personas = personaDao.select();
            
            modelo.setRowCount(0);
            modelo.setColumnIdentifiers(new Object[]{"ID_nit","tipo_documento","documento","nombres","apellidos","direccion","telefono"         
              });
              for (PersonaDTOemployees u : personas) {
                  
              modelo.addRow(new Object[]{u.getID_nit(),u.getTipo_documento(),u.getDocumento(),u.getNombres(),u.getApellidos()
              
              ,u.getDireccion(),u.getTelefono()});
              
             }
              result.setModel(modelo); 
              
        }catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Error!!!  "+ex);
          
        }
    }
    public void dateUsedID(JTextField vendedor,JTextField N_documento){
        PersonaDaoEmployees personaDao = new PersonaDAOJDBCEmployees();
        try{
           List<PersonaDTOemployees> personas = personaDao.select_id();
           for (PersonaDTOemployees u : personas) {
              int ID_nitEmpleadoTemp=u.getID_nit(); 
               
              N_documento.setText(String.valueOf(u.getDocumento()));
              
              vendedor.setText(u.getNombres()+" "+u.getApellidos());
           }
        }catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Error!!!  "+ex);
          
        }
    }
}
