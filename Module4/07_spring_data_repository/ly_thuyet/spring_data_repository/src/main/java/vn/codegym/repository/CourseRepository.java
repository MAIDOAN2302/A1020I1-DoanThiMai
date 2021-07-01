package vn.codegym.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import vn.codegym.model.Course;
import vn.codegym.model.Student;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
