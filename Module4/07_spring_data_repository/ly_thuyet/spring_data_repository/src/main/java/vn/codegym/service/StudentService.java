package vn.codegym.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();

    Page<Student> findAll(Pageable pageable);

    Student finById(int id);

    void save(Student student);

    void update(Student student);

    void remove(Student student);

    List<Student> searchByName(String kq);

    Page<Student> searchByName(String kq, Pageable pageable);
    Page<Student> searchByNameOrGender(String kq, int gender, Pageable pageable);
}
