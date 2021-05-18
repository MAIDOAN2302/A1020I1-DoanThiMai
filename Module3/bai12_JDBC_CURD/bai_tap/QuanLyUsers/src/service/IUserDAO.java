package service;
import model.User;
import java.util.List;
public interface IUserDAO {
    List<User> findAll();
    User findById(int id);
    boolean save (User user);
    boolean update(int id,User user);
    boolean remove (int id);
    List<User> findByCountry(String country);
    List<User> sortByName();
}