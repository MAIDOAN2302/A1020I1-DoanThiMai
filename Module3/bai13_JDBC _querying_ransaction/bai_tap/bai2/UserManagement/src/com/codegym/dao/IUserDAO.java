package com.codegym.dao;

import com.codegym.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO {

    public void insertUser(User user) throws SQLException;

    public void insertUserStore(User user) throws SQLException;

    public void addUserTransaction(User user) throws SQLException;

    public User selectUser(int id);

    public List<User> selectAllUsers();

    public List<User> selectAllUsersStore();

    public boolean deleteUser(int id) throws SQLException;

    public boolean deleteUserStore(int id) throws SQLException;

    public boolean updateUser(User user) throws SQLException;

    public boolean updateUserStore(User user) throws SQLException;

    public User getUserById(int id);

    public List<User> selectAllUsersByKeyword(String keyword);
}
