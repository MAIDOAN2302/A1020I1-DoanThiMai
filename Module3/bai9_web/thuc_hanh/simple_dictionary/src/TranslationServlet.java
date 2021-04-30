import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "TranslationServlet", urlPatterns = "/translate")
public class TranslationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
//        Map <String, String> dictionary = new HashMap<>();
//        dictionary.put("Xin chào","hello");
//        dictionary.put("Xin lỗi","sorry");
//        dictionary.put("Chúc ngủ ngon","good night");
//        dictionary.put("Chúc ngày mới tốt lành","have a nice day");
//        dictionary.put("quyển vở","book");
//
//        String search = request.getParameter("Vietnamese");
//
//        PrintWriter writer = response.getWriter();
//        writer.println("<html>");
//
//        String result = dictionary.get(search);
//        if (result!= null){
//            writer.println("word: " + search + "<br>");
//            writer.println("result: " + result);
//        }else {
//            writer.println("Not found");
//        }
//        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Map <String, String> dictionary = new HashMap<>();
        dictionary.put("Xin chào","hello");
        dictionary.put("Xin lỗi","sorry");
        dictionary.put("Chúc ngủ ngon","good night");
        dictionary.put("Chúc ngày mới tốt lành","have a nice day");
        dictionary.put("quyển vở","book");

        String search = request.getParameter("Vietnamese");

        PrintWriter writer = response.getWriter();
        writer.println("<html>");

        String result = dictionary.get(search);
        if (result!= null){
            writer.println("word: " + search + "<br>");
            writer.println("result: " + result);
        }else {
            writer.println("Not found");
        }
        writer.println("</html>");

    }
}
