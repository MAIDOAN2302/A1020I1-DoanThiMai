package com.codegym.service;

import com.codegym.model.Smartphone;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface SmartphoneService {
    List<Smartphone> findAll();

    Smartphone findById(int id);

    Smartphone save(Smartphone smartphone);

    Smartphone remove(int id);
}
