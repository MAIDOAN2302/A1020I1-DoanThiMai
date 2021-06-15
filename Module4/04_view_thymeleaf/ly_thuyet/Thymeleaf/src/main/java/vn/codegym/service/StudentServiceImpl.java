package vn.codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import vn.codegym.model.Student;
import vn.codegym.repository.StudentRepository;
import vn.codegym.repository.StudentRepositoryImpl;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student finById(int id) {
        return studentRepository.finById(id);
    }

    @Override
    public void save(Student student) {
        studentRepository.save(student);
    }
}
