package repository.employee;

import model.employee.EducationDegree;

import java.sql.SQLException;
import java.util.List;

public interface EducationDegreeRepository {
    List<EducationDegree> selectALL() throws SQLException;
    EducationDegree selectEducationDegreeById(int id) throws SQLException;
}
