package repository.customer;

import model.customer.CustomerType;

import java.sql.SQLException;
import java.util.List;

public interface CustomerTypeRepository {
    List<CustomerType> selectAll()throws SQLException;
    CustomerType selectCustomerTypeById(int id) throws SQLException;
}
