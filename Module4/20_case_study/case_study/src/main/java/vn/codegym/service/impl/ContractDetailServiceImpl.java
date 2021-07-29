package vn.codegym.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.ContractDetail;
import vn.codegym.repository.ContractDetailRepository;
import vn.codegym.service.ContractDetailService;

import java.util.List;

@Service
public class ContractDetailServiceImpl implements ContractDetailService {
    @Autowired
    ContractDetailRepository contractDetailRepository;

    @Override
    public List<ContractDetail> findAll() {
        return  contractDetailRepository.findAll();
    }

    @Override
    public List<ContractDetail> findAllByContractId(int id) {
        return contractDetailRepository.findAllByContract_Id(id);
    }

    @Override
    public ContractDetail findById(int id) {
        return contractDetailRepository.findById(id).orElse(null);
    }

    @Override
    public ContractDetail save(ContractDetail contractDetail) {
        return contractDetailRepository.save(contractDetail);
    }

    @Override
    public void delete(int id) {
        contractDetailRepository.deleteById(id);
    }

    @Override
    public void deleteByContractId(int id) {
        contractDetailRepository.deleteAllByContract_Id(id);
    }
}
