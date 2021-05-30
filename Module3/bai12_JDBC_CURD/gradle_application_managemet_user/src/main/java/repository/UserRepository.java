package repository;

import model.User;

import java.util.List;

public interface UserRepository {
    List<User> findAll();
    boolean save (User user);
    boolean update (User user);
    void findById();

}
