package controller.employee;

import model.customer.Customer;
import model.employee.Employee;
import service.customer.CustomerService;
import service.customer.impl.CustomerServiceImpl;
import service.employee.EmployeeService;
import service.employee.impl.EmployeeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CustomerServlet",urlPatterns = "/employee-list")
public class EmployeeServlet extends HttpServlet {
    EmployeeService employeeService = new EmployeeServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action= request.getParameter("action");

        if (action == null) {
            action= "";
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null) {
            action = "";
        }
        switch (action) {
//            case "delete":
//                try {
//                    deleteCus(request,response);
//                } catch (SQLException throwables) {
//                    throwables.printStackTrace();
//                }
//                break;
//            case "edit":
//                try {
//                    editCus(request,response);
//                } catch (SQLException throwables) {
//                    throwables.printStackTrace();
//                }
//                break;
            default:
                showListEmp(request, response);
                break;
        }
    }

    private void showListEmp(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Employee> employeeList = null;
        try {
            employeeList = employeeService.findAll();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        request.setAttribute("employeeList", employeeList);
        request.getRequestDispatcher("jsp/employee/employeeList.jsp").forward(request, response);
    }

//    private void editCus(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
//        int id = Integer.parseInt(request.getParameter("id"));
//        request.setAttribute("listCus",this.customerService.getById(id));
//        request.getRequestDispatcher("jsp/customer/editCus.jsp").forward(request,response);
//    }

//    private void deleteCus(HttpServletRequest request, HttpServletResponse response) throws SQLException {
//        int id = Integer.parseInt(request.getParameter("id"));
//        request.setAttribute("listCus",this.customerService.remove(id));
//    }


}
