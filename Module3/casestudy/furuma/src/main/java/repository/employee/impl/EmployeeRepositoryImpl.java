package repository.employee.impl;

import model.employee.Employee;
import repository.BaseRepository;
import repository.employee.EmployeeRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    private static final String SELECT_ALL_EMPLOYEE = "SELECT * FROM furuma.employee;";
    private static final String SELECT_EMPLOYEE_BY_ID = "SELECT * FROM furuma.employee where employee_id = ?;";
    private static final String INSERT_EMPLOYEE = "insert into employee(employee_name,employee_birthday," +
            "employee_id_card,employee_salary,employee_phone,employee_email,employee_address," +
            "location_id,education_degree_id,division_id values(?,?,?,?,?,?,?,?,?,? )";
    private static final String DETECT_EMPLOYEE = "delete from employee where employee_id = ?;";
    private static final String UPDATE_EMPLOYEE = "update employee\n" +
            "set employee_name=?,employee_birthday=?,employee_id_card=?,employee_salary=?," +
            "employee_phone=?,employee_email=?,employee_address=?,location_id=?,education_degree_id=?," +
            "division_id=?\n" +
            "where employee_id =?;";
    BaseRepository baseRepository = new BaseRepository();
    @Override
    public List<Employee> selectAll() throws SQLException {
        List<Employee> employeeList = new ArrayList<>();
        PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(SELECT_ALL_EMPLOYEE);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            int id = resultSet.getInt("employee_id");
            String name = resultSet.getString("employee_name");
            Date birthday = resultSet.getDate("employee_birthday");
            String idCard = resultSet.getString("employee_id_card");
            double salary = resultSet.getDouble("employee_salary");
            String phone = resultSet.getNString("employee_phone");
            String email = resultSet.getString("employee_email");
            String address = resultSet.getNString("employee_address");
            int locationId = resultSet.getInt("location_id");
            int educationDegreeId = resultSet.getInt("education_degree_id");
            int division = resultSet.getInt("division_id");
            employeeList.add(new Employee(id,name,birthday,idCard,salary,phone,email,address,locationId,educationDegreeId,division));
        }
        return employeeList;
    }

    @Override
    public Employee selectEmployeeById(int id) throws SQLException {
        PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(SELECT_EMPLOYEE_BY_ID);
        preparedStatement.setInt(1,id);
        ResultSet resultSet = preparedStatement.executeQuery();
        if (resultSet.next()){
            String name = resultSet.getString("employee_name");
            Date birthday = resultSet.getDate("employee_birthday");
            String idCard = resultSet.getString("employee_id_card");
            double salary = resultSet.getDouble("employee_salary");
            String phone = resultSet.getNString("employee_phone");
            String email = resultSet.getString("employee_email");
            String address = resultSet.getNString("employee_address");
            int locationId = resultSet.getInt("location_id");
            int educationDegreeId = resultSet.getInt("education_degree_id");
            int division = resultSet.getInt("division_id");
            Employee employee = new Employee(name,birthday,idCard,salary,phone,email,address,locationId,
                    educationDegreeId,division);
            return employee;
        }
        return null;
    }

    @Override
    public void insertEmployee(Employee employee) throws SQLException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String birthday = simpleDateFormat.format(employee.getEmployee_birthday());
        PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(INSERT_EMPLOYEE);
        preparedStatement.setString(1,employee.getEmployee_name());
        preparedStatement.setString(2,birthday);
        preparedStatement.setString(3,employee.getEmployee_id_card());
        preparedStatement.setDouble(4,employee.getEmployee_salary());
        preparedStatement.setString(5,employee.getUsername());
        preparedStatement.setString(6,employee.getEmployee_email());
        preparedStatement.setString(7,employee.getEmployee_address());
        preparedStatement.setInt(8,employee.getLocation_id());
        preparedStatement.setInt(9,employee.getEducation_degree_id());
        preparedStatement.setInt(10,employee.getDivision_id());
        ResultSet resultSet = preparedStatement.executeQuery();
    }

    @Override
    public boolean deleteEmployee(int id) throws SQLException {
        PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(DETECT_EMPLOYEE);
        preparedStatement.setInt(1,id);
        return preparedStatement.executeUpdate()>0;
    }

    @Override
    public boolean updateEmploy(Employee employee) throws SQLException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String birthday = simpleDateFormat.format(employee.getEmployee_birthday());
        PreparedStatement preparedStatement = this.baseRepository.getConnection().prepareStatement(UPDATE_EMPLOYEE);
        preparedStatement.setString(1,employee.getEmployee_name());
        preparedStatement.setString(2,birthday);
        preparedStatement.setString(3,employee.getEmployee_id_card());
        preparedStatement.setDouble(4,employee.getEmployee_salary());
        preparedStatement.setString(5,employee.getUsername());
        preparedStatement.setString(6,employee.getEmployee_email());
        preparedStatement.setString(7,employee.getEmployee_address());
        preparedStatement.setInt(8,employee.getLocation_id());
        preparedStatement.setInt(9,employee.getEducation_degree_id());
        preparedStatement.setInt(10,employee.getDivision_id());
        return preparedStatement.executeUpdate() >0;
    }

    @Override
    public List<Employee> selectEmployeeByName(String name) throws SQLException {
        List<Employee> employeeList = this.selectAll();
        List<Employee> result = new ArrayList<>();
        for (Employee employee:employeeList){
            if (employee.getEmployee_name().equals(name)){
                result.add(employee);
            }
        }
        return result;
    }

    @Override
    public List<Employee> selectEmployeePage(int page, int rowsOfPage, List<Employee> employeeList) {
        List<Employee> employeePage = new ArrayList<>();
        int i = (page -1)*rowsOfPage;
        while (i < page * 10 || i < employeeList.size()){
            employeePage.add(employeePage.get(i));
            i++;
        }
        return employeePage;
    }
}
