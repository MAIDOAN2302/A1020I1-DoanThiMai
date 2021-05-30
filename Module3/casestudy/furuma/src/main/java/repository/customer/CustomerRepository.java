package repository.customer;

import model.customer.Customer;

import java.sql.SQLException;
import java.util.List;

public interface CustomerRepository {
    List<Customer> selectAll() throws SQLException;
    Customer selectCustomerById(int id) throws SQLException;
    void insertCustomer (Customer customer) throws SQLException;
    boolean deleteCustomer(int id) throws SQLException;
    boolean updateCustomer(Customer customer) throws SQLException;
    List<Customer> selectCustomerByName(String name) throws SQLException;
}
