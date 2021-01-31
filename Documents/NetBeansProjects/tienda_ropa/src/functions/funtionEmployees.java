
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
    private static int ID_nitTemp;
    private static int documentoTemp;
    private static String nombresTemp="";
    private static String apellidosTemp="";
    
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
                  
              ID_nitTemp=Integer.valueOf(u.getID_nit());
              
              documentoTemp=Integer.valueOf(u.getDocumento());
              
              nombresTemp=String.valueOf(u.getNombres());
              
              apellidosTemp=String.valueOf(u.getApellidos());
              
              modelo.addRow(new Object[]{u.getID_nit(),u.getTipo_documento(),u.getDocumento(),u.getNombres(),u.getApellidos()
              
              ,u.getDireccion(),u.getTelefono()});
              
             }
              result.setModel(modelo); 
              
        }catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Error!!!  "+ex);
          
        }
    }
    public String EmployeesId(JTextField n_empleado,JTextField vendedor,JTextField N_documento){
    if (n_empleado!=null) {
    PersonaDaoEmployees personaDao = new PersonaDAOJDBCEmployees(n_empleado.getText().trim());
    
    try{
        List<PersonaDTOemployees> personas = personaDao.selectId();
        for (PersonaDTOemployees u : personas) {
            
           documentoTemp=Integer.valueOf(u.getDocumento());
              
           nombresTemp=String.valueOf(u.getNombres());
              
           apellidosTemp=String.valueOf(u.getApellidos());
        }
           
    }catch (SQLException ex) {
     JOptionPane.showMessageDialog(null,"Error!!!  "+ex);
    }
        vendedor.setText(nombresTemp+" "+apellidosTemp);
        N_documento.setText(String.valueOf(documentoTemp));
    }
    
    return null;
    }
}
