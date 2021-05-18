package controller;

import model.User;
import service.IUserDAO;
import service.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "UserServlet",urlPatterns = {"/","/managerUsers"})
public class UserServlet extends HttpServlet {

    private UserDAO iUserDAO = new UserDAO();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                this.createUser(request, response);
                break;
            case "edit":
//                this.editUser(request, response);
                break;
            case "delete":
//                this.deleteUser(request, response);
                break;
            case "search":
//                this.displaySearch(request, response);
                break;
       }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null){
            action = "";
        }
        switch (action){
            case "create":
                this.displayCreate(request, response);
                break;
            case "view":
//                this.displayUser(request, response);
                break;
            case "edit":
//                this.displayEdit(request, response);
                break;
            case "delete":
//                this.displayDelete(request, response);
                break;
            case "search":
//                this.displaySearch(request, response);
                break;
            case "sort":
//                this.sortName(request, response);
                break;
            default:
                this.listUsers(request, response);
        }
    }


    private void listUsers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("listUsers",iUserDAO.findAll());
        request.getRequestDispatcher("list.jsp").forward(request,response);
    }

    private void displayCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("create1.jsp").forward(request,response);
    }

    private void createUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User user = new User(id,name,email,country);
        if (iUserDAO.save(user)){
            request.setAttribute("message","succeeded");
        }else {
            request.setAttribute("message","failed");
        }
        request.getRequestDispatcher("create1.jsp").forward(request,response);
    }

//    private void displayUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        int id = Integer.parseInt(request.getParameter("id"));
//        request.setAttribute("users", iUserDAO.findById(id));
//        request.getRequestDispatcher("view.jsp").forward(request,response);
//    }
//
//    private void displayEdit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        int id = Integer.parseInt(request.getParameter("id"));
//        request.setAttribute("users", iUserDAO.findById(id));
//        request.getRequestDispatcher("edit.jsp").forward(request,response);
//    }
//
//    private void editUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        int id = Integer.parseInt(request.getParameter("id"));
//        String name = request.getParameter("name");
//        String email = request.getParameter("email");
//        String country = request.getParameter("country");
//        User user = new User(id,name,email,country);
//        if (this.iUserDAO.update(user)){
//            request.setAttribute("message","updated");
//        }else {
//            request.setAttribute("message","failed");
//        }
//        request.getRequestDispatcher("edit.jsp").forward(request,response);
//    }
//
//    private void displayDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        int id = Integer.parseInt(request.getParameter("id"));
//        request.setAttribute("user", iUserDAO.findById(id));
//        request.getRequestDispatcher("delete.jsp").forward(request,response);
//    }
//
//    private void deleteUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        int id = Integer.parseInt(request.getParameter("id"));
//        this.iUserDAO.remove(id);
//        this.displayUser(request,response);
//    }
//
//    private void displaySearch(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String country = request.getParameter("country");
//        if (country!= null){
//            request.setAttribute("result",true);
//            List<User> users = iUserDAO.findByCountry(country);
//            if (users.isEmpty()){
//                request.setAttribute("result",false);
//                request.setAttribute("return", country);
//            }else {
//                request.setAttribute("result", true);
//                request.setAttribute("listUser", users);
//            }
//        }else {
//            request.setAttribute("result", false);
//        }
//        request.getRequestDispatcher("search.jsp").forward(request,response);
//    }
//
//    private void sortName(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        List<User> users = iUserDAO.sortByName();
//        request.setAttribute("listUser", users);
//        request.getRequestDispatcher("list.jsp").forward(request,response);
//    }
//
//
//
//
//

}
