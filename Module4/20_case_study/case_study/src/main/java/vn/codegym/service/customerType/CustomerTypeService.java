package vn.codegym.service.customerType;

import org.springframework.stereotype.Service;
import vn.codegym.model.CustomerType;

import java.util.List;

@Service
public interface CustomerTypeService {
    List<CustomerType> findAll();
}
