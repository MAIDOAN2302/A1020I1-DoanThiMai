package vn.codegym.service.rentType;

import org.springframework.stereotype.Service;
import vn.codegym.model.RentType;

import java.util.List;

@Service
public interface RentTypeService {
    List<RentType> findAll();
    RentType findById(int id);
}
