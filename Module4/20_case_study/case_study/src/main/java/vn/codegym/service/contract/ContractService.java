package vn.codegym.service.contract;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.model.Contract;

import java.util.List;

@Service
public interface ContractService {
    List<Contract> findAll();
    Page<Contract> findAll(Pageable pageable);
    Contract findById(int id);
    Contract save (Contract contract);
    void delete (int id);
    Page<Contract> search(String search, Pageable pageable);
    boolean existById(int id);
}
