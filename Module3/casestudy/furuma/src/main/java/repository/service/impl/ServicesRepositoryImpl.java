package repository.service.impl;

import model.service.SerVices;
import repository.BaseRepository;
import repository.service.ServiceRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServicesRepositoryImpl implements ServiceRepository {
    BaseRepository baseRepository = new BaseRepository();
    private static final String SELECT_ALL = "SELECT * FROM furuma.service;";
    @Override
    public List<SerVices> selectAll() throws SQLException {
        List<SerVices> serVicesList = new ArrayList<>();
        PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(SELECT_ALL);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            int id = resultSet.getInt("service_id");
            String name = resultSet.getString("service_name");
            int area = resultSet.getInt("service_area");
            double cost = resultSet.getDouble("service_cost");
            int maxPeople = resultSet.getInt("service_max_people");
            int rentTypeId = resultSet.getInt("rent_type_id");
            int servicesTypeId = resultSet.getInt("service_type_id");
            String standardRoom = resultSet.getString("standard_room");
            String descriptionOtherConvenience = resultSet.getString("description_other_convenience");
            double poolArea = resultSet.getDouble("pool_area");
            int numberOfFloors = resultSet.getInt("number_of_floors");
        }
        return null;
    }

    @Override
    public SerVices selectServicesById(int id) throws SQLException {
        return null;
    }

    @Override
    public void insertServices(SerVices serVices) throws SQLException {

    }

    @Override
    public boolean deleteServices(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean updateSerVices(SerVices serVices) throws SQLException {
        return false;
    }

    @Override
    public List<SerVices> selectServicesByName(String name) throws SQLException {
        return null;
    }
}
