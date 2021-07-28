package vn.codegym.service;

import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;
import vn.codegym.model.Customer;

import java.util.List;
@Service
public interface CustomerService {
    List<Customer> getCustomers();

    void saveCustomer(Customer theCustomer);

    Customer getCustomerById(int id) ;

    void deleteCustomerById(int id) ;

    List<Customer> findCustomersByFirstName (String name);
}
