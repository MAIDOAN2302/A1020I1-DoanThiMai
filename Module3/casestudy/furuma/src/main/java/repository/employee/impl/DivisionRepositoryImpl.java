package repository.employee.impl;

import model.employee.Division;
import repository.BaseRepository;
import repository.employee.DivisionRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DivisionRepositoryImpl implements DivisionRepository {
    BaseRepository baseRepository = new BaseRepository();
    private static final String SELECT_ALL ="SELECT * FROM furuma.division;";
    private static final String SELECT_DIVISION_BY_ID ="SELECT * FROM furuma.division where division_id=?;";
    @Override
    public List<Division> selectALL() throws SQLException {
        List<Division> divisionList = new ArrayList<>();
        PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(SELECT_ALL);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            int id = resultSet.getInt("division_id");
            String name =resultSet.getString("division_name");
            divisionList.add(new Division(id,name));
        }
        return divisionList;
    }

    @Override
    public Division selectDivisionById(int id) throws SQLException {
        PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(SELECT_DIVISION_BY_ID);
        preparedStatement.setInt(1,id);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()){
            String name = resultSet.getString("division_name");
            return new Division(id,name);
        }
        return null;
    }
}
