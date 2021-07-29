package vn.codegym.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.codegym.model.UserRole;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole,Integer> {
    void deleteUserRolesByAppUser_Username(String username);
}
