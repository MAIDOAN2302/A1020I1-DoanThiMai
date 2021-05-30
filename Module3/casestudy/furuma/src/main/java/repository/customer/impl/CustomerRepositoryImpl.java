package repository.customer.impl;

import model.customer.Customer;
import repository.BaseRepository;
import repository.customer.CustomerRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {
    BaseRepository baseRepository = new BaseRepository();
    private static final String SELECT_ALL = "SELECT * FROM furuma.customer;";
    private static final String SELECT_CUSTOMER_BY_ID ="SELECT * FROM furuma.customer where customer_id = ?;";
    private static final String INSERT_CUSTOMER = "insert into customer\n" +
            "values(?,?,?,?,?,?,?,?,?)";
    private static final String DELETE_CUSTOMER = "delete from furuma.customer where customer_id = ?;";
    private static final String UPDATE_CUSTOMER = "update furuma.customer set customer_id = ?,customer_type_id = ?," +
            "customer_name =?,customer_birthday=?,customer_gender=?,customer_id_card=?,customer_phone=?," +
            "customer_email=?,customer_address=?;";

    @Override
    public List<Customer> selectAll() throws SQLException {
        List<Customer> customerList = new ArrayList<>();
        PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(SELECT_ALL);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            int customerId = resultSet.getInt("customer_id");
            int customerTypeId = resultSet.getInt("customer_type_id");
            String name = resultSet.getString("customer_name");
            Date birthday = resultSet.getDate("customer_birthday");
            String gender = resultSet.getString("customer_gender");
            String customerIdCard = resultSet.getString("customer_id_card");
            String customerPhone = resultSet.getString("customer_phone");
            String customerEmail = resultSet.getString("customer_email");
            String customerAddress = resultSet.getString("customer_address");
            customerList.add(new Customer(customerId,customerTypeId,name,birthday,gender,customerIdCard,
                    customerPhone,customerEmail,customerAddress));
        }
        return customerList;
    }

    @Override
    public Customer selectCustomerById(int id) throws SQLException {
        List<Customer> customerList = this.selectAll();
        for (Customer customers :customerList) {
            if (customers.getCustomer_id()== id){
                return customers;
            }
        }
        return null;
    }

    @Override
    public void insertCustomer(Customer customer) throws SQLException {
        List<Customer> customerList = new ArrayList<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String birthday = simpleDateFormat.format(customer.getCustomer_address());
        PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(INSERT_CUSTOMER);
        preparedStatement.setInt(1,customer.getCustomer_id());
        preparedStatement.setInt(2,customer.getCustomer_type_id());
        preparedStatement.setString(3,customer.getCustomer_name());
        preparedStatement.setString(4,birthday);
        preparedStatement.setString(5,customer.getCustomer_gender());
        preparedStatement.setString(6,customer.getCustomer_id_card());
        preparedStatement.setString(7,customer.getCustomer_phone());
        preparedStatement.setString(8,customer.getCustomer_email());
        preparedStatement.setString(9,customer.getCustomer_address());
        preparedStatement.executeUpdate();
    }

    @Override
    public boolean deleteCustomer(int id) throws SQLException {
        PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(DELETE_CUSTOMER);
        preparedStatement.setInt(1,id);
        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public boolean updateCustomer(Customer customer) throws SQLException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String birthday = simpleDateFormat.format(customer.getCustomer_birthday());
        PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(UPDATE_CUSTOMER);
        preparedStatement.setInt(1,customer.getCustomer_id());
        preparedStatement.setInt(2,customer.getCustomer_type_id());
        preparedStatement.setString(3,customer.getCustomer_name());
        preparedStatement.setString(4,birthday);
        preparedStatement.setString(5,customer.getCustomer_gender());
        preparedStatement.setString(6,customer.getCustomer_id_card());
        preparedStatement.setString(7,customer.getCustomer_phone());
        preparedStatement.setString(8,customer.getCustomer_email());
        preparedStatement.setString(9,customer.getCustomer_address());
        preparedStatement.executeUpdate();
        return false;
    }

    @Override
    public List<Customer> selectCustomerByName(String name) throws SQLException {
        List<Customer> customerList = new ArrayList<>();
        for (Customer customer: customerList){
            if (customer.getCustomer_name().contains(name)){
                customerList.add(customer);
            }
        }
        return customerList;
    }
}
