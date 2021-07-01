package vn.codegym.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.ClassRoom;
import vn.codegym.model.Course;
import vn.codegym.repository.ClassRoomRepository;
import vn.codegym.repository.CourseRepository;
import vn.codegym.service.CourseService;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseRepository repository;

    @Override
    public List<Course> findAll() {
        return repository.findAll();
    }
}
