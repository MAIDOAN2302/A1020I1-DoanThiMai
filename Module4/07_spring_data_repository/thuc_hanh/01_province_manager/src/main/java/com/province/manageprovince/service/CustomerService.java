package com.province.manageprovince.service;

import com.province.manageprovince.model.Customer;

import java.util.Iterator;
import java.util.List;

public interface CustomerService {
        Iterable<Customer> findAll();

        Customer findById(Long id);

        void save(Customer customer);

        void remove(Long id);
}
