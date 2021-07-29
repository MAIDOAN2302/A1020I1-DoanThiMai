package vn.codegym.service;

import org.springframework.stereotype.Service;
import vn.codegym.model.ServiceType;

import java.util.List;

@Service
public interface ServiceTypeService {
    List<ServiceType> findAll();
    ServiceType findById(int id);
}