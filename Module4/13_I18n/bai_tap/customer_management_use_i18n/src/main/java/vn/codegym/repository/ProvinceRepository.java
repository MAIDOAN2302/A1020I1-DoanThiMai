package vn.codegym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.model.Province;
@Repository
public interface ProvinceRepository extends JpaRepository<Province, Integer> {
}
