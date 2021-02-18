
package JDBC;

import PersonaDTO.personaDTOProducts;
import java.sql.SQLException;
import java.util.List;

public interface PersonaDaoProducts {
    public List<personaDTOProducts> select() throws SQLException;
}
