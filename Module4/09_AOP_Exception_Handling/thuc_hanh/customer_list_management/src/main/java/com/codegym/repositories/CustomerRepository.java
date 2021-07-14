package com.codegym.repositories;

import com.codegym.model.Customer;
import com.codegym.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.stream.Stream;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Iterable<Customer>findAllByNameContainsOrEmailContainsOrAddressContains(String name, String email,String address);
    Page<Customer> findCustomerByProvince(Province province, Pageable pageable);
}
