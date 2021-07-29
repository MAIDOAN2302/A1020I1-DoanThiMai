package vn.codegym.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.UserRole;
import vn.codegym.repository.UserRoleRepository;
import vn.codegym.service.UserRoleService;

import java.util.List;

@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    UserRoleRepository userRoleRepository;

    @Override
    public List<UserRole> findAll() {
        return userRoleRepository.findAll();
    }

    @Override
    public UserRole findById(int id) {
        return userRoleRepository.findById(id).orElse(null);
    }

    @Override
    public UserRole save(UserRole userRole) {
        return userRoleRepository.save(userRole);
    }

    @Override
    public void deleteAllByUsername(String username) {
        userRoleRepository.deleteUserRolesByAppUser_Username(username);
    }
}
