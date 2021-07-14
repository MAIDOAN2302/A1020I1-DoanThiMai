package com.codegym.service.impl;

import com.codegym.model.Customer;
import com.codegym.model.Province;
import com.codegym.repositories.CustomerRepository;
import com.codegym.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Page<Customer> findALL(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public List<Customer> search(String keyword) {
        return (List<Customer>) customerRepository.
                findAllByNameContainsOrEmailContainsOrAddressContains(keyword,keyword,keyword);
    }

    @Override
    public Page<Customer> search(Province province, Pageable pageable) {
        return customerRepository.findCustomerByProvince(province,pageable);
    }

    @Override
    public Optional<Customer> findById(int id){
        return customerRepository.findById(id);
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> save(List<Customer> customers) {
        return customerRepository.saveAll(customers);
    }

    @Override
    public boolean exists(int id) {
        return customerRepository.existsById(id);
    }

    @Override
    public void delete(Customer customer) {
        customerRepository.delete(customer);
    }

    @Override
    public void deleteAll() {
        customerRepository.deleteAll();
    }
}
