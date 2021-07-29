package vn.codegym.service;

import org.springframework.stereotype.Service;
import vn.codegym.model.AppUser;

import java.util.List;

@Service
public interface AppUserService {
    List<AppUser> findAll();
    AppUser findByUsername(String username);
    AppUser save (AppUser appUser);
    void delete(String username);
}
