package vn.codegym.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.model.ClassRoom;
import vn.codegym.model.Student;
import vn.codegym.repository.ClassRoomRepository;
import vn.codegym.repository.StudentRepository;
import vn.codegym.service.ClassRoomService;

import java.util.List;

@Service
public class ClassRoomServiceImpl implements ClassRoomService {

    @Autowired
    ClassRoomRepository repository;

    @Override
    public List<ClassRoom> findAll() {
        return repository.findAll();
    }
}
