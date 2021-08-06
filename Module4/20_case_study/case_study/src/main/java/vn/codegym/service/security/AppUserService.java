package vn.codegym.service.security;

import vn.codegym.model.AppUser;

import java.util.List;

public interface AppUserService {
    List<AppUser> findAll();
    void save(AppUser user);
    void update(AppUser user);
    AppUser findById(int id);

}

