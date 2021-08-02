package vn.codegym.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.model.Customer;

import java.util.List;
@Service
public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);
    List<Customer> findAll();
    Customer findById(String id);
    Customer save(Customer customer);
    void delete(String id);
    boolean existById(String id);
    Page<Customer> findAllByNameContaining( String key, Pageable pageable);
}
