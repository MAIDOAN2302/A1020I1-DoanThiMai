package bai_tap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "bai_tap.DiscountServlet", urlPatterns = "/Product")
public class DiscountServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String product = request.getParameter("product_description");
        Double price = Double.parseDouble(request.getParameter("list_price"));
        Double discountPercent = Double.parseDouble(request.getParameter("discount_percent"));

        Double discountAmount = price * discountPercent * 0.01;
        Double discountPrice = price - discountAmount;

        request.setAttribute("product", product);
        request.setAttribute("price", price);
        request.setAttribute("discount_percent", discountPercent);
        request.setAttribute("discount_percent", discountAmount);
        request.setAttribute("discount_price", discountPrice);
        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
