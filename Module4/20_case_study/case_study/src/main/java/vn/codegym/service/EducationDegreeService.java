package vn.codegym.service;

import org.springframework.stereotype.Service;
import vn.codegym.model.EducationDegree;

import java.util.List;

@Service
public interface EducationDegreeService {
    List<EducationDegree> findAll();
    EducationDegree findById(int id);
}
