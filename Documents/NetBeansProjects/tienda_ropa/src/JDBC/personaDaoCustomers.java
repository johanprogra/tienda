
package JDBC;

import PersonaDTO.personaDTOcustomers;
import java.sql.SQLException;
import java.util.List;


public interface personaDaoCustomers {
    public int insert(personaDTOcustomers persona) throws SQLException;
    
    public List<personaDTOcustomers> select() throws SQLException;
    
    public List<personaDTOcustomers> select_lastRecord() throws SQLException;
}
