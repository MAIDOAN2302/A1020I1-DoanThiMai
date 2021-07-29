package vn.codegym.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vn.codegym.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    Page<Employee> findAll(Pageable pageable);
    Page<Employee> findAllByNameContains(String name, Pageable pageable);
    @Query("select e from Employee e where e.appUser.username= :username")
    Employee findAllByAppUser_Username(String username);
}