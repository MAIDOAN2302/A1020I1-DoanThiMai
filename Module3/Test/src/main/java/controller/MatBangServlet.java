package controller;

import model.MatBang;
import service.MatBangService;
import service.impl.MatBangServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

@WebServlet(name = "MatBangServlet",urlPatterns = {"/","/list"})
public class MatBangServlet extends HttpServlet {
    MatBangService matBangService = new MatBangServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null) {
            action = "";
        }
        switch (action){
            case "create":
                try {
                    createMB(request,response);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createForm(request,response);
                break;
            case "edit":
                break;
            default:
                try {
                    showList(request, response);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                break;
        }
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        List<MatBang> matBangList = matBangService.selectAllMatBang();
        request.setAttribute("list",matBangList);
        request.getRequestDispatcher("jsp/list.jsp").forward(request,response);
    }

    private void createForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jsp/create.jsp").forward(request,response);
    }

    private void createMB(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        String maMB = request.getParameter("maMb");
        double dienTich = Double.parseDouble(request.getParameter("dienTich"));
        String trangThai = request.getParameter("trangThai");
        int tang = Integer.parseInt(request.getParameter("tang"));
        int loaiVP = Integer.parseInt(request.getParameter("loaiVP"));
        String moTa = request.getParameter("moTa");
        double gia = Double.parseDouble(request.getParameter("gia"));
        String ngayBD = request.getParameter("ngayBD");
        String ngayKT = request.getParameter("ngayKT");
        MatBang matBang = new MatBang(maMB,dienTich,trangThai,tang,loaiVP,moTa,gia,ngayBD,ngayKT);

        String msg = null;
        if (matBangService.createMatBang(matBang)) {
            msg = "OK";
            showList(request, response);
        } else {
            msg = "Invalid data";
            request.setAttribute("msg", msg);
            request.getRequestDispatcher("jsp/create.jsp").forward(request, response);
        }
//        request.setAttribute("msg","Insert OK");
//        request.getRequestDispatcher("jsp/create.jsp").forward(request,response);
//        showList(request,response);
    }

}
