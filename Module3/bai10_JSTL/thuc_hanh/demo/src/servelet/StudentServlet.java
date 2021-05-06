package servelet;

import bean.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "StudentServlet", urlPatterns = {"/", "/student"})
public class StudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(123, "Nguyen Van A","2000-05-01",1,7.5));
        studentList.add(new Student(456, "Nguyen Van C","2001-05-01",0,3.0));
        studentList.add(new Student(789, "Nguyen Van B","2000-05-31",1,9.0));

        request.setAttribute("studentListServelet", studentList);
        request.getRequestDispatcher("list.jstl.jsp").forward(request,response);
    }
}
