package vn.codegym.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.codegym.model.ClassRoom;
import vn.codegym.model.Student;

import java.util.List;

public interface ClassRoomService {
    List<ClassRoom> findAll();
}
