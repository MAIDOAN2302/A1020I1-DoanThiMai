package com.codegym.repository;

import com.codegym.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Page<Customer> findByNameContainingAndGender(String name, int gender, Pageable pageable);
    Page<Customer> findByNameContainingAndIdGreaterThanEqual(String name, int id, Pageable pageable);

    @Query("select c from Customer c where c.name =:input and c.id >=2")
    Page<Customer> findByName2(@Param("input") String name, Pageable pageable);
}
