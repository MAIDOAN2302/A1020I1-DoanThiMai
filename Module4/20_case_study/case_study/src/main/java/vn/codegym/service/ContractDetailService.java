package vn.codegym.service;

import org.springframework.stereotype.Service;
import vn.codegym.model.ContractDetail;

import java.util.List;

@Service
public interface ContractDetailService {
    List<ContractDetail> findAll();
    List<ContractDetail> findAllByContractId(int id);
    ContractDetail findById(int id);
    ContractDetail save (ContractDetail contractDetail);
    void delete(int id);
    void deleteByContractId(int id);
}
