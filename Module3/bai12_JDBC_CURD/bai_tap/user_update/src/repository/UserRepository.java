package repository;
import model.User;
import java.util.List;
public interface UserRepository {
    List<User> findAll();
    User finId (int id);
    boolean save (User user);
    boolean update (int id, User user);
    boolean remove (int id);
    List<User> findByCountry(String country);
}
