package repository.employee;

import model.employee.Location;

import java.sql.SQLException;
import java.util.List;

public interface LocationRepository {
    List<Location> selectALL() throws SQLException;
    Location selectLocationById (int id) throws SQLException;
}
