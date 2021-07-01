package vn.codegym.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.model.Student;
import vn.codegym.repository.StudentRepository;
import vn.codegym.service.StudentService;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Page<Student> findAll(Pageable pageable) {
        return studentRepository.findAll(pageable);
    }

    @Override
    public Student finById(int id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void update(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void remove(Student student) {
        studentRepository.delete(student);
    }

    @Override
    public List<Student> searchByName(String kq) {
        return studentRepository.searchByName(kq);
    }

    @Override
    public Page<Student> searchByName(String kq, Pageable pageable) {
        return studentRepository.findByNameContainingAndIdGreaterThan(kq, 11, pageable);
    }

    @Override
    public Page<Student> searchByNameOrGender(String kq, int gender, Pageable pageable) {
        return studentRepository.findByNameOrGender(kq, gender, pageable);
    }


}
