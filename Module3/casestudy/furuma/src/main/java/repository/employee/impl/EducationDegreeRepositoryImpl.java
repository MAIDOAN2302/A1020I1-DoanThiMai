package repository.employee.impl;

import model.employee.EducationDegree;
import repository.BaseRepository;
import repository.employee.EducationDegreeRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EducationDegreeRepositoryImpl implements EducationDegreeRepository {
    BaseRepository baseRepository = new BaseRepository();
    private static  final String SELECT_ALL = "SELECT * FROM furuma.education_degree;";
    private static final  String SELECT_EDUCATION_DEGREE_BY_ID = "SELECT * FROM furuma.education_degree " +
            "where education_degree_id = ?;";
    @Override
    public List<EducationDegree> selectALL() throws SQLException {
        List<EducationDegree> educationDegreeList = new ArrayList<>();
        PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(SELECT_ALL);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            int id = resultSet.getInt("education_degree_id");
            String name = resultSet.getString("education_degree_name");
            educationDegreeList.add(new EducationDegree(id,name));
        }
        return educationDegreeList;
    }

    @Override
    public EducationDegree selectEducationDegreeById(int id) throws SQLException {
        PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(SELECT_EDUCATION_DEGREE_BY_ID);
        preparedStatement.setInt(1,id);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()){
            String name = resultSet.getString("education_degree_name");
            return  new EducationDegree(id,name);
        }
        return null;
    }
}
