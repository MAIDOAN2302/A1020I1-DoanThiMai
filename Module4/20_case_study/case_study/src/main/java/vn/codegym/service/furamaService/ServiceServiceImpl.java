package vn.codegym.service.furamaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.model.ServiceType;
import vn.codegym.repository.ServiceRepository;

import java.util.List;

@Service
public class ServiceServiceImpl implements ServiceService {
    @Autowired
    ServiceRepository serviceRepository;

    @Override
    public List<vn.codegym.model.Service> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public Page<vn.codegym.model.Service> findAll(Pageable pageable) {
        return serviceRepository.findAll(pageable);
    }

    @Override
    public Page<vn.codegym.model.Service> findAllByServiceType(ServiceType serviceType, Pageable pageable) {
        return serviceRepository.findAllByServiceType(serviceType,pageable);
    }

    @Override
    public vn.codegym.model.Service save(vn.codegym.model.Service service) {
        return serviceRepository.save(service);
    }

    @Override
    public void delete(String id) {
        serviceRepository.deleteById(id);
    }

    @Override
    public Page<vn.codegym.model.Service> findAllByIdContainsOrNameContains(String id, String name, Pageable pageable) {
        return serviceRepository.findAllByIdContainsOrNameContains(id, name, pageable);
    }

    @Override
    public boolean existById(String id) {
        return serviceRepository.existsById(id);
    }
}
