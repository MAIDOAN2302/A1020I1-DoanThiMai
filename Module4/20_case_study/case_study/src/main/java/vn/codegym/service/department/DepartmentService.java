package vn.codegym.service.department;

import org.springframework.stereotype.Service;
import vn.codegym.model.Department;

import java.util.List;

@Service
public interface DepartmentService {
    List<Department> findAll();
    Department findById(int id);
}
