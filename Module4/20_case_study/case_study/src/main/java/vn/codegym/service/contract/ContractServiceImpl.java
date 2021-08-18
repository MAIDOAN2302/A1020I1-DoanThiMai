package vn.codegym.service.contract;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.model.Contract;
import vn.codegym.repository.ContractRepository;

import java.util.List;

@Service
public class ContractServiceImpl implements ContractService {
    @Autowired
    ContractRepository contractRepository;

    @Override
    public List<Contract> findAll() {
        return contractRepository.findAll();
    }

    @Override
    public Page<Contract> findAll(Pageable pageable) {
        return contractRepository.findAll(pageable);
    }

    @Override
    public Contract findById(int id) {
        return contractRepository.findById(id).orElse(null);
    }

    @Override
    public Contract save(Contract contract) {
        return contractRepository.save(contract);
    }

    @Override
    public void delete(int id) {
        contractRepository.deleteById(id);
    }

    @Override
    public Page<Contract> search(String search, Pageable pageable) {
        return contractRepository.search(pageable,search);
    }

    @Override
    public boolean existById(int id) {
        return contractRepository.existsById(id);
    }
}
