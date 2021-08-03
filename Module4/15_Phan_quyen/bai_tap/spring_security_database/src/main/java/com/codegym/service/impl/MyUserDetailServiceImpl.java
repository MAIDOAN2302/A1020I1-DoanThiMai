package com.codegym.service.impl;

import com.codegym.model.MyUserDetail;
import com.codegym.model.User;
import com.codegym.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
@Transactional
public class MyUserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {

        User user = userRepository.findByName(name);

        if(user == null){
            throw new UsernameNotFoundException("user name not found: "+name);
        }

        return new MyUserDetail(user);
    }
}
