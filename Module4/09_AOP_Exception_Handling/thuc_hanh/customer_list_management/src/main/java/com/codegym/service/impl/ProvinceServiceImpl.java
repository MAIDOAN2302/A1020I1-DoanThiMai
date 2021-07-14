package com.codegym.service.impl;

import com.codegym.model.Province;
import com.codegym.repositories.ProvinceRepository;
import com.codegym.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    ProvinceRepository provinceRepository;
    @Override
    public List<Province> findALL() {
        return provinceRepository.findAll();
    }

    @Override
    public Optional<Province> findById(int id) {
        return provinceRepository.findById(id);
    }

    @Override
    public Province save(Province province) {
        return provinceRepository.save(province);
    }

    @Override
    public boolean exists(int id) {
        return provinceRepository.existsById(id);
    }

    @Override
    public void delete(int id) {
        provinceRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        provinceRepository.deleteAll();
    }
}
