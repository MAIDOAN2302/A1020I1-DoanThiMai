package service;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO {

    void insertUser(User user) throws SQLException;

    User selectUser(int id);

    List<User> selectAllUser();

    boolean deleteUser(int id) throws SQLException;

    void save (User user);

    User findById(int id);

    User findByUserName(String name);

    void update(int id, User user);

    void search(String name);
}
