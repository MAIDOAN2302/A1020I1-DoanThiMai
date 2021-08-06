package vn.codegym.service.furamaService;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.model.Customer;
import vn.codegym.model.ServiceType;

import java.util.List;

@Service
public interface ServiceService {
    List<vn.codegym.model.Service> findAll();
    Page<vn.codegym.model.Service> findAll(Pageable pageable);
    Page<vn.codegym.model.Service> findAllByServiceType(ServiceType serviceType, Pageable pageable);
    vn.codegym.model.Service save (vn.codegym.model.Service service);
    void delete(String id);
    Page<vn.codegym.model.Service> findAllByIdContainsOrNameContains(String id, String name, Pageable pageable);
    boolean existById(String id);
}
