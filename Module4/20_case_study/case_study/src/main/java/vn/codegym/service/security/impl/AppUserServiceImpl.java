package vn.codegym.service.security.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegym.model.AppUser;
import vn.codegym.repository.AppUserRepository;
import vn.codegym.service.security.AppUserService;

import java.util.List;

@Service
public class AppUserServiceImpl implements AppUserService {

    @Override
    public List<AppUser> findAll() {
        return null;
    }

    @Override
    public void save(AppUser user) {

    }

    @Override
    public void update(AppUser user) {

    }

    @Override
    public AppUser findById(int id) {
        return null;
    }
}
