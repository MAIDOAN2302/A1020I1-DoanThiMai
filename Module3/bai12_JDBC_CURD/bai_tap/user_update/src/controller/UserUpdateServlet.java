package controller;
import service.UserService;
import service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UserServlet", urlPatterns = {"/", "/users"})
public class UserUpdateServlet extends javax.servlet.http.HttpServlet {
    private UserService userService = new UserServiceImpl();

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                createNewUser(request,response);
                break;
            case "edit":
                editUser(request,response);
                break;
            case "delete":
                deleteUser(request,response);
                break;
            case "search":
                break;
            default:
                break;
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                showPageCreate(request,response);
                break;
            case "view":
                showViewUser(request,response);
                break;
            case "edit":
                showPageEdit(request,response);
                break;
            case "delete":
                showPageDelete(request,response);
                break;
            case "search":
                showPageSearch(request,response);
                break;
            case "sort":
                break;
            default:
                listUsers(request,response);
                break;
        }
    }


    private void listUsers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("listUsers",this.userService.findALL());
        request.getRequestDispatcher("user/list.jsp").forward(request,response);
    }

    private void showPageCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("user/create.jsp").forward(request,response);
    }

    private void createNewUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        this.userService.save(name,email,country);
        request.setAttribute("message","Created new User Succeed");
        request.getRequestDispatcher("user/create.jsp").forward(request,response);
    }


    private void showViewUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("user",this.userService.findId(id));
        request.getRequestDispatcher("user/view.jsp").forward(request,response);
    }

    private void showPageEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("user",this.userService.findId(id));
        request.getRequestDispatcher("user/edit.jsp").forward(request,response);
    }

    private void editUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        this.userService.update(id,name,email,country);
        request.setAttribute("message", "Updated User Succeed!");
        request.getRequestDispatcher("user/edit.jsp").forward(request,response);
    }

    private void showPageDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        request.setAttribute("user",this.userService.findId(id));
        request.getRequestDispatcher("user/delete.jsp").forward(request,response);
    }

    private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        this.userService.remove(id);
        this.listUsers(request,response);
    }

    private void showPageSearch(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String country = request.getParameter("country");
        request.setAttribute("message","true");
        request.getRequestDispatcher("user/search.jsp").forward(request,response);
    }
}
