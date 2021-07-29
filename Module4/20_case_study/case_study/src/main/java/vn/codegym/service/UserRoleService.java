package vn.codegym.service;

import org.springframework.stereotype.Service;
import vn.codegym.model.UserRole;

import java.util.List;

@Service
public interface UserRoleService {
    List<UserRole> findAll();
    UserRole findById(int id);
    UserRole save(UserRole userRole);
    void deleteAllByUsername (String username);
}
