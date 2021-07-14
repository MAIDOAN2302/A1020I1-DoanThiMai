package com.codegym.service;

import com.codegym.model.Province;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface ProvinceService {
    List<Province> findALL();

    Optional<Province> findById(int id);

    Province save (Province province);

    boolean exists(int id);

    void delete(int id);

    void deleteAll();
}
