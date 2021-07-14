package com.codegym.service;

import com.codegym.model.Customer;
import com.codegym.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface CustomerService {
    List<Customer> findAll();

    Page<Customer> findALL(Pageable pageable);

    List<Customer> search(String keyword);

    Page<Customer> search(Province province, Pageable pageable);

    Optional<Customer> findById(int id);

    Customer save (Customer customer);

    List<Customer> save (List<Customer> customers);

    boolean exists(int id);

    void delete(Customer customer);

    void  deleteAll();
}
