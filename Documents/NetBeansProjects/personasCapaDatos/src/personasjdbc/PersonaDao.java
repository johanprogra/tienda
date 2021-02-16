
package personasjdbc;

import java.sql.*;
import java.util.List;
import personasDTO.personaDTO;


public interface PersonaDao {
    public int insert(personaDTO persona) throws SQLException;
    
    public int update(personaDTO persona) throws SQLException;
    
    public int delete(personaDTO persona) throws SQLException;
    
    public List<personaDTO> select() throws SQLException;
}
