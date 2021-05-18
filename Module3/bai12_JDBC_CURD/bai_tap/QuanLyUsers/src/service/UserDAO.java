package service;

import model.User;
import repository.BaseRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class UserDAO implements IUserDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/quanlyusers";
    private String jdbcUsername = "root";
    private String jdbcPassword = "12345678";


    private static final String INSERT_USERS_SQL = "insert into quanlyuser(`name`,email,country)\\n\" +\n" +
            "                            \"values(?, ?, ?)";

    private static final String SELECT_USER_BY_ID = "SELECT * FROM quanlyusers.quanlyuser where id = ?;";
    private static final String SELECT_ALL_USERS = "SELECT * FROM quanlyusers.quanlyuser";
    private static final String DELETE_USERS_SQL = "delete from quanlyuser where id = ?;";
    private static final String UPDATE_USERS_SQL = "update quanlyuser set `name` = ?, email = ?,country =? where id = ?;";
    private static final String SEARCH_USERS_SQL = "select * from quanlyuser where country like '%\" + country + \"%'";
    private static final String SORT_BY_NAME = "group by quanlyuser.name\n" + "order by quanlyuser.name;";


    public UserDAO() {
    }

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }

    @Override
    public List<User> findAll() {

        return null;
    }

    @Override
    public User findById(int id) {
        return null;
    }

    @Override
    public boolean save(User user) {
        return false;
    }

    @Override
    public boolean update(int id, User user) {
        return false;
    }

    @Override
    public boolean remove(int id) {
        return false;
    }

    @Override
    public List<User> findByCountry(String country) {
        return null;
    }

    @Override
    public List<User> sortByName() {
        List<User> users = new ArrayList<>();
        try {
            Connection connection = getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SORT_BY_NAME);
            System.out.println(preparedStatement);
            ResultSet resultSet = preparedStatement.executeQuery();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return users;
    }
}
