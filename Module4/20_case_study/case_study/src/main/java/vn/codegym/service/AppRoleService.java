package vn.codegym.service;

import org.springframework.stereotype.Service;
import vn.codegym.model.AppRole;

import java.util.List;

@Service
public interface AppRoleService {
    List<AppRole> findAll();
    AppRole findById(int id);
}
