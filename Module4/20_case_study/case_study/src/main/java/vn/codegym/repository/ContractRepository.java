package vn.codegym.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vn.codegym.model.Contract;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Integer> {
    Page<Contract> findAll(Pageable pageable);
    @Query("select cus.name, ct.id,cd.id, asv.name\n" +
            "from Customer cus\n" +
            "inner join Contract ct on ct.customer.id = cus.id\n" +
            "inner join ContractDetail cd on cd.contract.id = ct.id\n" +
            "inner join AttachService asv on asv.id = cd.attachService.id\n" +
            "group by cus.id")
    Page<Contract> search(Pageable pageable, String keyword);
}
