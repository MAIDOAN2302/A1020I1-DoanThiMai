package repository.customer.impl;

import model.customer.Customer;
import repository.BaseRepository;
import repository.customer.CustomerRepository;

import java.sql.SQLException;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {
    BaseRepository baseRepository = new BaseRepository();
    private static final String SELECT_ALL = "SELECT * FROM furuma.customer;";
    private static final String SELECT_CUSTOMER_BY_ID ="SELECT * FROM furuma.customer where customer_id = ?;";
    private static final String INSERT_CUSTOMER = "insert into customer\n" +
            "values(?,?,?,?,?,?,?,?,?)";
    private static final String DELETE_CUSTOMER = "delete from furuma.customer where customer_id = ?;";
    @Override
    public List<Customer> selectAll() throws SQLException {
        return null;
    }

    @Override
    public Customer selectCustomerById(int id) throws SQLException {
        return null;
    }

    @Override
    public void insertCustomer(Customer customer) throws SQLException {

    }

    @Override
    public boolean deleteCustomer(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean updateCustomer(Customer customer) throws SQLException {
        return false;
    }

    @Override
    public List<Customer> selectCustomerByName(String name) throws SQLException {
        return null;
    }
}
