package bai_tap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "bai_tap.DiscountServlet", urlPatterns = "/Product")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String product = request.getParameter("product_description");
        Double price = Double.parseDouble(request.getParameter("list_price"));
        Double discount_percent = Double.parseDouble(request.getParameter("discount_percent"));

        Double discount_amount = price * discount_percent * 0.01;
        Double discount_price = price - discount_amount;

        request.setAttribute("product", product);
        request.setAttribute("price", price);
        request.setAttribute("discount_percent", discount_percent);
        request.setAttribute("discount_percent", discount_amount);
        request.setAttribute("discount_price", discount_price);
        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
