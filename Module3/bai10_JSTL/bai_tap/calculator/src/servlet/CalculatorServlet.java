package servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "servlet.CalculatorServlet", urlPatterns = "/calculate")
public class CalculatorServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Double numberOne = Double.parseDouble(request.getParameter("numberOne"));
        Double numberTwo = Double.parseDouble(request.getParameter("numberTwo"));
        String operator = request.getParameter("operator");
        Double result;
        switch (operator) {
            case "+":
                result = numberOne + numberTwo;
                break;
            case "-":
                if (numberOne >= numberTwo) {
                    result = numberOne - numberTwo;
                } else {
                    result = numberTwo - numberOne;
                }
                break;
            case "*":
                result = numberOne * numberTwo;
                break;
            case "/":
                if (numberTwo != 0) {
                    result = numberOne / numberTwo;
                } else {
                    throw new RuntimeException("Loi chia cho 0");
                }
                break;
            default:
                throw new RuntimeException("Loi dau vao khong hop le!");
        }

        request.setAttribute("result",result);
        request.getRequestDispatcher("index.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
