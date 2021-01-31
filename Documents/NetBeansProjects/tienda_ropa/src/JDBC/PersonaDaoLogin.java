
package JDBC;

import PersonaDTO.PersonaDTOLogin;
import java.sql.SQLException;
import java.util.List;

public interface PersonaDaoLogin {
    public List<PersonaDTOLogin> select() throws SQLException;
}
