/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import business.UserSuperAdminBusinessFacade;
import exceptions.ToLogException;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.entity.UserAdmin;

/**
 *
 * @author Anders
 */
@WebServlet(name = "SuperAdminController", urlPatterns = {"/SuperAdminController"})
public class SuperAdminController extends HttpServlet {

    UserSuperAdminBusinessFacade usabf = new UserSuperAdminBusinessFacade();
    
    String origin;
    HttpSession session;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
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
                response.sendRedirect("superadminUser.jsp");
                break;
            case "DeleteAdmin":
                deleteOrder(request, response);
                response.sendRedirect("superadminUser.jsp");
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
                usabf.addUserAdmin(username, password, firstname, lastname);
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
                usabf.deleteUserAdmin(Integer.parseInt(request.getParameter("idAdmin")));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public List getAdmins() throws ToLogException{
        List<UserAdmin> useradmin = usabf.getAdmins();
        return useradmin;
    }
}
