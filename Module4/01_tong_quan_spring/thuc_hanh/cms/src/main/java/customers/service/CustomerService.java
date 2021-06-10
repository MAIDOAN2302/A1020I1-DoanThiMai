package customers.service;

import customers.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Customer findById( int id);
}
