package servlet;

import bean.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = {"/customer"})
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Manse","2010-10-23","Ha Noi", "image/manse.jpg"));
        customerList.add(new Customer("Dehan","2010-10-23","Ha Noi", "image/dehan.jpg"));
        customerList.add(new Customer("Mingkook","2010-10-23","Ha Noi", "image/mingkook.jpg"));
        customerList.add(new Customer("Ben","2010-10-23","Ha Noi", "image/benttly.jpg"));
        customerList.add(new Customer("Naeun","2010-10-23","Ha Noi", "image/naeun.jpg"));

        request.setAttribute("customerListSevrlet",customerList);
        request.getRequestDispatcher("customers-jstl.jsp").forward(request,response);
    }
}
