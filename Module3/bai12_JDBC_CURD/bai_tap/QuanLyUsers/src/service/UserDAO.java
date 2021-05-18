package service;

import model.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class UserDAO implements IUserDAO {

    private Connection connection;
    private String jdbcURL = "jdbc:mysql://localhost:3306/quanlyusers";
    private String jdbcUsername = "root";
    private String jdbcPassword = "12345678";

    private static final String INSERT_USERS = "insert into quanlyuser(`name`,email,country)\n" + "values(?,?,?)";
    private static final String SELECT_USER_BY_ID = "select*from quanlyuser where id = ?";
    private static final String SELECT_ALL_USERS = "SELECT * FROM quanlyusers.quanlyuser";
    private static final String DELETE_USERS_SQL = "delete from quanlyuser where id = ?;";
    private static final String UPDATE_USERS_SQL = "update quanlyuser set `name` = ?, email = ?,country = ? where id = ?;";
    private static final String SEARCH_USERS_SQL = "select * from quanlyuser where country = ?;";

    public UserDAO() {
    }
    

    @Override
    public void insertUser(User user) throws SQLException {

    }

    @Override
    public User selectUser(int id) {
        return null;
    }

    @Override
    public List<User> selectAllUser() {
        return null;
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        return false;
    }

    @Override
    public void save(User user) {

    }

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public User findByUserName(String name) {
        return null;
    }

    @Override
    public void update(int id, User user) {

    }

    @Override
    public void search(String name) {

    }
}
