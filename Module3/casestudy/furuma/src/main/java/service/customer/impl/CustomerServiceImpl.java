package service.customer.impl;

import model.customer.Customer;
import repository.customer.CustomerRepository;
import repository.customer.impl.CustomerRepositoryImpl;
import service.customer.CustomerService;

import java.sql.SQLException;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    CustomerRepository customerRepository = new CustomerRepositoryImpl();
    @Override
    public List<Customer> findAll() throws SQLException {
        return this.customerRepository.selectAll();
    }

    @Override
    public Customer getById(int id) throws SQLException {
        return this.customerRepository.selectCustomerById(id);
    }

    @Override
    public void save(Customer customer) throws SQLException {
        if (customer.getCustomer_name().matches("[A-Za-z ]+")){
            this.customerRepository.insertCustomer(customer);
        }

    }

    @Override
    public boolean remove(int id) throws SQLException {
        return this.customerRepository.deleteCustomer(id);
    }

    @Override
    public boolean update(Customer customer) throws SQLException {
        return this.customerRepository.updateCustomer(customer);
    }

    @Override
    public List<Customer> searchByName(String name) throws SQLException {
        return this.customerRepository.selectCustomerByName(name);
    }

}
