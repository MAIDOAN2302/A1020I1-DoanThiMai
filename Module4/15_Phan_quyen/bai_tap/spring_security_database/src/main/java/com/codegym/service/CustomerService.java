package com.codegym.service;

import com.codegym.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CustomerService {
    List<Customer> findAll();
    Page<Customer> findAll(Pageable pageable);

    void save(Customer student);
    void update(Customer student);
    Customer findById(int id);

    Page<Customer> findByInputText(String inputSearch, Pageable pageable);
}
