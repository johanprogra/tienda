
package JDBC;

import PersonaDTO.PersonaDTOSales;
import java.util.List;
import java.sql.SQLException;

public interface PersonaDaoSales {
    public int insert(PersonaDTOSales persona) throws SQLException;
    
    public int update(PersonaDTOSales persona) throws SQLException;
    
    public int delete(PersonaDTOSales persona) throws SQLException;
    
    public List<PersonaDTOSales> select() throws SQLException;
}
