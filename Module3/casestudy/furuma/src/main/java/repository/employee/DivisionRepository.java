package repository.employee;

import model.employee.Division;

import java.sql.SQLException;
import java.util.List;

public interface DivisionRepository {
    List<Division> selectALL()throws SQLException;
    Division selectDivisionById(int id) throws SQLException;
}
