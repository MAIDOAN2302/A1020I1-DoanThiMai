package vn.codegym.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.model.Contract;

@Service
public interface ContractService {
    Page<Contract> findAll(Pageable pageable);
    Contract findById(int id);
    Contract save (Contract contract);
    void delete (int id);
    Page<Contract> findByCustomerName(String search, Pageable pageable);
    boolean existById(int id);
}
