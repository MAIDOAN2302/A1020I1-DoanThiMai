package service.customer;

import model.customer.Customer;

import java.sql.SQLException;
import java.util.List;

public interface CustomerService {
    List<Customer> findAll() throws SQLException;
    Customer getById(int id) throws SQLException;
    void save(Customer customer) throws SQLException;
    boolean remove(int id) throws SQLException;
    boolean update(Customer customer) throws SQLException;
    List<Customer> searchByName(String name) throws SQLException;
}
