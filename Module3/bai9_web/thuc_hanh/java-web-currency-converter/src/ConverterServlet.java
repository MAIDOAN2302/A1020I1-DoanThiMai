import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ConverterServlet", urlPatterns = "/converter")
public class ConverterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Double rate = Double.parseDouble(request.getParameter("Rate"));
        Double usd = Double.parseDouble(request.getParameter("USD"));
        Double vnd = rate*usd;

        request.setAttribute("vnd", vnd);
        request.getRequestDispatcher("display.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }
}
