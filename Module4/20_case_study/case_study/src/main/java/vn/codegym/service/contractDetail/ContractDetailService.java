package vn.codegym.service.contractDetail;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.codegym.model.Contract;
import vn.codegym.model.ContractDetail;

import java.util.List;

@Service
public interface ContractDetailService {
    Page<ContractDetail> findAll(Pageable pageable);
    List<ContractDetail> findAll();
    List<ContractDetail> findAllByContractId(int id);
    ContractDetail findById(int id);
    ContractDetail save (ContractDetail contractDetail);
    void delete(int id);
    void deleteByContractId(int id);
    boolean existById(int id);
}
