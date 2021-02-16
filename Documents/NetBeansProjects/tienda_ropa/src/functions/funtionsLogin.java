
package functions;

import JDBC.PersonaDAOJDBCLoginSales;
import JDBC.PersonaDaoLogin;
import PersonaDTO.PersonaDTOLogin;
import interfaces.menuSeller;
import java.sql.*;
import java.util.List;
import javax.swing.JOptionPane;


public class funtionsLogin {
    
    private String user=null;
    
    private String password=null;
    
    private String usertemp=null;
    
    private String passwordtemp=null;
    
    public boolean message=false;

    public funtionsLogin() {}
    
    public funtionsLogin(String user,String Password) {this.user=user; this.password=Password;}
    
    public boolean login_vendedor(){
         PersonaDaoLogin personaDao = new PersonaDAOJDBCLoginSales();
         
      try{
          List<PersonaDTOLogin> personas = personaDao.select();
          for (PersonaDTOLogin u : personas) {
              usertemp=u.getUser();
              passwordtemp=u.getPassword();
          }
          if(usertemp!=null && passwordtemp!=null){
            if(usertemp.equals(user) && passwordtemp.equals(password)){
            JOptionPane.showMessageDialog(null,"Bienvendio (a) "+user+" al menú vendedor");    
            menuSeller menu=new menuSeller();
            menu.setVisible(true);
                 return message=true;
            }}else{
            JOptionPane.showMessageDialog(null,"Contraseña o Usuario Incorrecto!");
                 return message=false;
            }
              
      }catch (SQLException ex) {}
        return message;
    }
    
    
}
