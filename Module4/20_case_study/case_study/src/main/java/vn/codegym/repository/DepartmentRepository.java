package vn.codegym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
