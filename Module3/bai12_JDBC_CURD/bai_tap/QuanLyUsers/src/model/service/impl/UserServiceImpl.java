package model.service.impl;

import model.bean.User;
import model.repository.UserRepository;
import model.repository.impl.UserRepositoryImpl;
import model.service.UserService;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    private final String regexName = "^[A-Z]" +"[a-z]*";
    private final  String regexEmail = "^[\\w+.]*[\\w+@][\\w+]+[.][\\w]+$";

    private UserRepository repository = new UserRepositoryImpl();

    @Override
    public List<User> findALL() {
        return repository.findAll();
    }

    @Override
    public User findId(int id) {
        return repository.finId(id);
    }

    @Override
    public boolean save(String name, String email, String country) {
        if (!name.matches(this.regexName)){
            System.out.println("name");
            return false;
        }
        if (!email.matches(this.regexEmail)){
            return false;
        }
        return repository.save(new User(name,email,country));
    }

    @Override
    public boolean update(int id, String name, String email, String country) {
        if (!name.matches(regexName)){
            return false;
        }
        if (!email.matches(regexEmail)){
            return false;
        }
        return repository.update(id, new User(name,email,country));
    }

    @Override
    public boolean remove(int id) {
        return repository.remove(id);
    }

    @Override
    public List<User> findByCountry(String country) {
        return repository.findByCountry(country);
    }

    @Override
    public List<User> sortByName() {
        List<User> userList = new ArrayList<>();
        return null;
    }
}
