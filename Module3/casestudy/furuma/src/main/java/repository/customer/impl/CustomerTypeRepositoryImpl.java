package repository.customer.impl;

import model.customer.CustomerType;
import repository.BaseRepository;
import repository.customer.CustomerTypeRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerTypeRepositoryImpl implements CustomerTypeRepository {
    BaseRepository baseRepository = new BaseRepository();
    private static final String SELECT_ALL = "SELECT * FROM furuma.customer_type;";
    @Override
    public List<CustomerType> selectAll() throws SQLException {
        List<CustomerType> customerTypeList = new ArrayList<>();
        PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(SELECT_ALL);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            int id = resultSet.getInt("customer_type_id");
            String name = resultSet.getString("customer_type_name");
            customerTypeList.add(new CustomerType(id,name));
        }
        return customerTypeList;
    }

    @Override
    public CustomerType selectCustomerTypeById(int id) throws SQLException {
        List<CustomerType> customerTypeList = this.selectAll();
        for (CustomerType customerType: customerTypeList){
            if (customerType.getId()==id){
                return customerType;
            }
        }
        return null;
    }
}
