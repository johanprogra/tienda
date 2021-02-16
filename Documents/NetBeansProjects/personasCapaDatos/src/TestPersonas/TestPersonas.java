
package TestPersonas;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import personasDTO.personaDTO;
import personasjdbc.PersonaDAOJDBC;
import personasjdbc.PersonaDao;
public class TestPersonas {
    public static void main(String []args){
    PersonaDao personaDao = new PersonaDAOJDBC();
    personaDTO persona=new personaDTO();
    persona.setId_estudiantes(19);
    persona.setNombres("mario");
    persona.setApellidos("torres");
    persona.setMaterias("fisica");
    persona.setId_profesores1(3);
        
        
            //insertar
            try {
            personaDao.insert(persona);
            JOptionPane.showMessageDialog(null,"Los datos se han ingresado correctamente");
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error!!! No se pudo ingresar datos: "+ex);
            }
            //actualizar
            /*try {
            personaDao.update(persona);
            JOptionPane.showMessageDialog(null,"Los datos se han actualizado correctamente");
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error!!! No se pudo actualizar los datos: "+ex);
            }*/
            //borrar
            /*try {
            personaDao.delete(new personaDTO(15));
            JOptionPane.showMessageDialog(null,"Los datos se han borrado correctamente");
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error!!! No se pudo borrar los datos: "+ex);
            }*/
            
            //forma 1 listar
        try {    
            List<personaDTO> personas = personaDao.select();
            for (personaDTO u : personas) {
                System.out.println("id: "+u.getId_estudiantes());
                System.out.println("nombres: "+u.getNombres());
                System.out.println("apellidos: "+u.getApellidos());
                System.out.println("materias: "+u.getMaterias());
                System.out.println("id_profesores: "+u.getId_profesores1());
                System.out.println();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error!!! "+ex);
        }
        //forma 2 listar
        /*try {    
            List<personaDTO> personas = personaDao.select();
            personas.stream().map((u) -> {
                System.out.println("id: "+u.getId_estudiantes());
            return u;
        }).map((u) -> {
            System.out.println("nombres: "+u.getNombres());
            return u;
        }).map((u) -> {
            System.out.println("apellidos: "+u.getApellidos());
            return u;
        }).map((u) -> {
            System.out.println("materias: "+u.getMaterias());
            return u;
        }).map((u) -> {
            System.out.println("id_profesores: "+u.getId_profesores1());
            return u;
        }).forEachOrdered((personaDTO _item) -> {
            System.out.println();
            });
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error!!! "+ex);
        }*/
    }
 }
