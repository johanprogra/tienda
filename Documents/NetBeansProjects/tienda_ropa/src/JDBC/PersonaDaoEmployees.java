
package JDBC;

import PersonaDTO.PersonaDTOemployees;
import java.sql.SQLException;
import java.util.List;

public interface PersonaDaoEmployees {
    public List<PersonaDTOemployees> select() throws SQLException;
    public List<PersonaDTOemployees> select_id() throws SQLException;
    
}
