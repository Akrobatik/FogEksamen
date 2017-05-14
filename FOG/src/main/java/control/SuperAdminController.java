/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.data.UserSuperAdminMapper;

/**
 *
 * @author Anders
 */
@WebServlet(name = "SuperAdminController", urlPatterns = {"/SuperAdminController"})
public class SuperAdminController extends HttpServlet {

    UserSuperAdminMapper usam = new UserSuperAdminMapper();
    //IDataFacade idf = new DataFacade();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String origin = request.getParameter("origin");
            HttpSession session = request.getSession();
            
            switch (origin) {
                case "AddAdmin":
                    session = request.getSession();
                    String username = request.getParameter("username");
                    String password = request.getParameter("password");
                    String password2 = request.getParameter("password2");
                    String firstname = request.getParameter("firstname");
                    String lastname = request.getParameter("lastname");
                    if(password.equals(password2)) {
                        usam.addUserAdmin(username, password, firstname, lastname);
                        response.sendRedirect("SendNewAdmin.jsp");
                    }
                    break;
                case "DeleteAdmin":
                    session = request.getSession();
                    if(origin != null && origin.equals("DeleteAdmin")) {
                        usam.deleteUserAdmin(Integer.parseInt(request.getParameter("idAdmin")));
                        response.sendRedirect("AdminDeleted.jsp");
                    }
                    break;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
