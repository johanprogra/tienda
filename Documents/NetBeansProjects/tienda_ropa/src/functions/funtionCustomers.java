
package functions;

import JDBC.PersonaDAOJDBCCustomers;
import JDBC.personaDaoCustomers;
import PersonaDTO.personaDTOcustomers;
import java.sql.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class funtionCustomers {
    
    public void insert(){
        personaDaoCustomers personaDao = new PersonaDAOJDBCCustomers();
        
        personaDTOcustomers persona=new personaDTOcustomers();
        
        try {
            JOptionPane.showMessageDialog(null,"¡Los datos se han ingresado correctamente!");
            personaDao.insert(persona);
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error!!! No se pudo ingresar los datos: "+ex);
            }
    }
    
    public void dataUsed(JTable result){
        
        DefaultTableModel modelo= new DefaultTableModel();
        
        personaDaoCustomers personaDao = new PersonaDAOJDBCCustomers();
        
        try{
            List<personaDTOcustomers> personas = personaDao.select();
            modelo.setRowCount(0);
            modelo.setColumnIdentifiers(new Object[]{"ID_nit","tipo_documento","cedula","nombres","apellidos","direccion","ciudad","celular"        
            });
            for (personaDTOcustomers u : personas) {
                modelo.addRow(new Object[]{u.getID_nit(),u.getTipo_documento(),u.getCedula(),u.getNombres(),u.getApellidos()
              
              ,u.getDireccion(),u.getCiudad(),u.getCelular()});
              
             }
              result.setModel(modelo);
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error!!!  "+ex);
        }
    }
    public void dataUsedInsert(JTable result){
        
        DefaultTableModel modelo= new DefaultTableModel();
        
        personaDaoCustomers personaDao = new PersonaDAOJDBCCustomers();
        
        try{
            List<personaDTOcustomers> personas = personaDao.select();
            modelo.setRowCount(0);
            modelo.setColumnIdentifiers(new Object[]{"ID_nit","tipo_documento","cedula","nombres","apellidos","direccion","ciudad","telefono","celular","genero","observación"        
            });
            for (personaDTOcustomers u : personas) {
                
                modelo.addRow(new Object[]{u.getID_nit(),u.getTipo_documento(),u.getCedula(),u.getNombres(),u.getApellidos(),u.getDireccion(),
                   u.getCiudad(),u.getTelefono(),u.getCelular(),u.getGenero(),u.getObservacion()
                });
              
             }
              result.setModel(modelo);
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error!!!  "+ex);
        }
    }
}
