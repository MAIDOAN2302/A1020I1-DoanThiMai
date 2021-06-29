package com.example.demo.Service;

import com.example.demo.Repository.ECommerceRepository;
import com.example.demo.model.ECommerce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ECommerceServiceImpl implements ECommerceService {
    @Autowired
    ECommerceRepository eCommerceRepository;

    @Override
    public List<ECommerce> findAll() {
        return eCommerceRepository.findAll();
    }
}
