package com.codegym.service;

import com.codegym.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CustomerService {
    List<Customer> findALL();

    Customer findById(Long id);

    void save (Customer customer);

    void remove (Long id);
}
