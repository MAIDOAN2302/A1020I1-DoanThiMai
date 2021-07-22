package com.codegym.service;

import com.codegym.model.Smartphone;
import com.codegym.repository.SmartphoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SmartphoneServiceImpl implements SmartphoneService{
    @Autowired
    SmartphoneRepository smartphoneRepository;

    @Override
    public List<Smartphone> findAll() {
        return smartphoneRepository.findAll();
    }

    @Override
    public Smartphone findById(int id) {
        return smartphoneRepository.findById(id).orElse(null);
    }

    @Override
    public Smartphone save(Smartphone smartphone) {
        return smartphoneRepository.save(smartphone);
    }

    @Override
    public Smartphone remove(int id) {
        Smartphone smartphone = smartphoneRepository.findById(id).orElse(null);
        smartphoneRepository.deleteById(id);
        return smartphone;
    }
}
