package vn.codegym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import vn.codegym.model.Customer;

import java.util.List;
@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    @Query(value = "select  c from Customer c where c.firstName = :name")
    List<Customer> findCustomerByFirstNameCustomer(@Param("name") String name);
}
