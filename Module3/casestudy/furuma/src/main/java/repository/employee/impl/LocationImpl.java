package repository.employee.impl;

import model.employee.Location;
import repository.BaseRepository;
import repository.employee.LocationRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class LocationImpl implements LocationRepository {
    BaseRepository baseRepository = new BaseRepository();
    private static final String SELECT_ALL = "SELECT * FROM furuma.location;";
    private static final String SELECT_BY_ID = "SELECT * FROM furuma.location where location_id = ?;";

    @Override
    public List<Location> selectALL() throws SQLException {
        List<model.employee.Location> locationList = new ArrayList<>();
        PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(SELECT_ALL);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("location_id");
            String name = resultSet.getString("location_name");
            locationList.add(new Location(id,name));
        }
        return locationList;
    }

    @Override
    public Location selectLocationById(int id) throws SQLException {
        PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(SELECT_BY_ID);
        preparedStatement.setInt(1,id);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()){
            String name = resultSet.getString("location_name");
            return new Location(id,name);
        }
        return null;
    }
}
