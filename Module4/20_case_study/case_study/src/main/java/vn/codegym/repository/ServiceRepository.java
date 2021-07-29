package vn.codegym.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.model.Service;
import vn.codegym.model.ServiceType;

@Repository
public interface ServiceRepository extends JpaRepository<Service,String> {
    Page<Service> findAll(Pageable pageable);
    Page<Service> findAllByIdContainsOrNameContains(String id, String name, Pageable pageable);
    Page<Service> findAllByServiceType(ServiceType serviceType, Pageable pageable);
}
