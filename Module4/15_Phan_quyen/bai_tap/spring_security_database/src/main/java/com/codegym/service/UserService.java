package com.codegym.service;

import com.codegym.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User> findAll();
    void save(User user);
    void update(User user);
    User findById(int id);
}
