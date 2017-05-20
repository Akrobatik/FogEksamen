/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import business.UserSuperAdminDomainFacade;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Anders
 */
@WebServlet(name = "SuperAdminController2", urlPatterns = {"/SuperAdminController2"})
public class SuperAdminController2 extends HttpServlet {

    UserSuperAdminDomainFacade usadf = new UserSuperAdminDomainFacade();
    
    String origin;
    HttpSession session;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        origin = request.getParameter("origin");
            
        switch (origin) {
            case "AddAdmin":
                addAdmin(request, response);
                break;
            case "DeleteAdmin":
                deleteOrder(request, response);
                break;
        }
    }
    
    protected void addAdmin(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            session = request.getSession();
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String password2 = request.getParameter("password2");
            String firstname = request.getParameter("firstname");
            String lastname = request.getParameter("lastname");
            if(password.equals(password2)) {
                usadf.addUserAdmin(username, password, firstname, lastname);
                response.sendRedirect("SendNewAdmin.jsp");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    protected void deleteOrder(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            session = request.getSession();
            if(origin != null && origin.equals("DeleteAdmin")) {
                usadf.deleteUserAdmin(Integer.parseInt(request.getParameter("idAdmin")));
                response.sendRedirect("AdminDeleted.jsp");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
