package vn.codegym.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import vn.codegym.model.Student;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    Page<Student> findByNameContaining(String name, Pageable pageable);
    Page<Student> findByNameContainingAndIdGreaterThan(String name, int id,  Pageable pageable);


    Page<Student> findByNameOrGender(String name, int gender, Pageable pageable);

    @Query("select s from Student s where s.name =:input")
    List<Student> searchByName(@Param("input") String kq);
}
