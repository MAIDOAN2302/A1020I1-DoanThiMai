package repository.service;

import model.service.SerVices;

import java.sql.SQLException;
import java.util.List;

public interface ServiceRepository {
    List<SerVices> selectAll() throws SQLException;
    SerVices selectServicesById(int id) throws SQLException;
    void  insertServices(SerVices serVices) throws SQLException;
    boolean deleteServices (int id) throws SQLException;
    boolean updateSerVices (SerVices serVices) throws SQLException;
    List<SerVices> selectServicesByName(String name) throws SQLException;
}
