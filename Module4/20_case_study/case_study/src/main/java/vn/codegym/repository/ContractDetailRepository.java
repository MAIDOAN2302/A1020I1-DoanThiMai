package vn.codegym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.model.ContractDetail;

import java.util.List;

@Repository
public interface ContractDetailRepository extends JpaRepository<ContractDetail, Integer> {
    List<ContractDetail> findAllByContract_Id(int contract_id);
    void deleteAllByContract_Id(int contract_id);
}
