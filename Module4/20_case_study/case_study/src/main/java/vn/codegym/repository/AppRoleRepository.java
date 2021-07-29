package vn.codegym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.model.AppRole;

@Repository
public interface AppRoleRepository extends JpaRepository<AppRole,Integer> {
}
