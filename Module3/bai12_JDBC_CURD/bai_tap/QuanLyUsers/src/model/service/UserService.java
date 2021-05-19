package model.service;

import model.bean.User;

import java.util.List;

public interface UserService {
    List<User> findALL();
    User findId(int id);
    boolean save (String name, String email, String country);
    boolean update (int id, String name, String email, String country);
    boolean remove (int id);
    List<User> findByCountry(String country);
    List<User> sortByName();

}
