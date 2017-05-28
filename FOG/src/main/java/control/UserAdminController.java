/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import business.UserAdminBusinessFacade;
import exceptions.ToLogException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.entity.User;

/**
 *
 * @author Anders
 */
@WebServlet(name = "UserAdminController", urlPatterns = {"/UserAdminController"})
public class UserAdminController extends HttpServlet {
    
    UserAdminBusinessFacade uabf = new UserAdminBusinessFacade();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
    
    public List getUsers() throws ToLogException {
        List<User> users = uabf.getUsers();
        return users;
    }
}
