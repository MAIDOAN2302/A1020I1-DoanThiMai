package vn.codegym.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.EducationDegree;
import vn.codegym.repository.EducationDegreeRepository;
import vn.codegym.service.EducationDegreeService;

import java.util.List;

@Service
public class EducationDegreeServiceImpl implements EducationDegreeService {
    @Autowired
    EducationDegreeRepository educationDegreeRepository;

    @Override
    public List<EducationDegree> findAll() {
        return educationDegreeRepository.findAll();
    }

    @Override
    public EducationDegree findById(int id) {
        return educationDegreeRepository.findById(id).orElse(null);
    }
}
