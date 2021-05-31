package service.employee.impl;

import model.customer.Customer;
import model.employee.Employee;
import repository.employee.EmployeeRepository;
import repository.employee.impl.EmployeeRepositoryImpl;
import service.employee.EmployeeService;

import java.sql.SQLException;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    EmployeeRepository employeeRepository = new EmployeeRepositoryImpl();
    @Override
    public List<Employee> findAll() throws SQLException {
        return this.employeeRepository.selectAll();
    }

    @Override
    public Employee getById(int id) throws SQLException {
        return this.employeeRepository.selectEmployeeById(id);
    }

    @Override
    public void save(Employee employee) throws SQLException {
        if (employee.getEmployee_name().matches("[A-Za-z ]+")){
            this.employeeRepository.insertEmployee(employee);
        }

    }

    @Override
    public boolean remove(int id) throws SQLException {
        return this.employeeRepository.deleteEmployee(id);
    }

    @Override
    public boolean update(Employee employee) throws SQLException {
        return this.employeeRepository.updateEmploy(employee);
    }

    @Override
    public List<Employee> searchByName(String name) throws SQLException {
        return this.employeeRepository.selectEmployeeByName(name);
    }

}
