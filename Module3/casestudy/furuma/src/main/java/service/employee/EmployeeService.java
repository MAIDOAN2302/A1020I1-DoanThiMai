package service.employee;
import model.employee.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeService {
    List<Employee> findAll() throws SQLException;
    Employee getById(int id) throws SQLException;
    void save(Employee employee) throws SQLException;
    boolean remove(int id) throws SQLException;
    boolean update(Employee employee) throws SQLException;
    List<Employee> searchByName(String name) throws SQLException;
}
