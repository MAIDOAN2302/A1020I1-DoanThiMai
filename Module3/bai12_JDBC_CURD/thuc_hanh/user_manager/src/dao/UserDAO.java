package dao;

import model.BaseRepository;
import model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements IUserDAO {
    private String jdbcURL = "jdbc:mysql://localhost:3306/user_manager";
    private String jdbcUsername = "root";
    private String jdbcPassword = "12345678";

    private static final String INSERT_USERS_SQL = "INSERT INTO users" + "  (name, email, country) VALUES " +
            " (?, ?, ?);";

    private static final String SELECT_USER_BY_ID = "select id,name,email,country from users where id =?";
    private static final String SELECT_ALL_USERS = "select * from user_manager";
    private static final String DELETE_USERS_SQL = "delete from users where id = ?;";
    private static final String UPDATE_USERS_SQL = "update users set name = ?,email= ?, country =? where id = ?;";

    private BaseRepository baseRepository = new BaseRepository();
    public UserDAO() {
    }

    @Override
    public void insertUser(User user) throws SQLException {
        List<User> userList = new ArrayList<>();
        try {
            Statement statement = this.baseRepository.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(INSERT_USERS_SQL);

            User user1 = null;
            while (resultSet.next()) {
                user1.setId((resultSet.getInt("id")));
                user1.setName(resultSet.getString("name"));
                user1.setEmail(resultSet.getString("email"));
                user1.setCountry(resultSet.getString("country"));

                userList.add(user1);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public User selectUser(int id) {
        return null;
        }

        @Override
    public List<User> selectAllUsers() {
        List<User> userList = new ArrayList<>();
        try{
            Statement statement = this.baseRepository.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT_ALL_USERS);

            User user = null;
            while (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setEmail(resultSet.getString("email"));
                user.setCountry(resultSet.getString("country"));

                userList.add(user);
            }
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
        return userList;
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        return false;
    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public void insertUserStore(User user) throws SQLException {

    }
}
