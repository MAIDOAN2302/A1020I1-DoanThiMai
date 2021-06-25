package vn.codegym.model.service;



import vn.codegym.model.bean.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(long id);

    void update(long id, Customer customer);

    void remove(long id);
}
