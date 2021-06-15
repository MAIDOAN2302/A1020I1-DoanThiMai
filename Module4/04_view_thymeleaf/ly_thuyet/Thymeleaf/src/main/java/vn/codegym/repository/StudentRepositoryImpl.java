package vn.codegym.repository;

import org.springframework.stereotype.Repository;
import vn.codegym.model.Student;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepositoryImpl implements StudentRepository {
    private static List<Student> studentList;

    static {
        studentList = new ArrayList<>();
        studentList.add(new Student(1, "Nguyen Van A", 1, new String[]{"PHP", "JAVA"}));
        studentList.add(new Student(2, "Nguyen Van B", 0, new String[]{"C#", "JAVA"}));
        studentList.add(new Student(3, "Nguyen Van C", 2, new String[]{"C#", "PHP", "JAVA"}));
    }

    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    public Student finById(int id) {
        return studentList.get(id);
    }

    @Override
    public void save(Student student) {
        studentList.add(student);
    }
}
