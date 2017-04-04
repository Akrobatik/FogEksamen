package servlet;

import entity.User;
import exceptions.ToLogException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import mapper.UserMapper;
import mapper.UserMapper2;

/**
 *
 * @author Anders
 */
@WebServlet(name = "UserController", urlPatterns = {"/UserController"})
public class UserController extends HttpServlet {
    //UserMapper um = new UserMapper();
    UserMapper2 um2 = new UserMapper2(); 
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
              try {
        String origin = request.getParameter("origin");
        HttpSession session = request.getSession();
        
        //Object us = request.getSession().getAttribute("username");
        
        //String username = request.getParameter("username");
        //String password = request.getParameter("password");
        
        User user;
        String UserName, UserPassword;
        
        switch(origin) {
            case "Login": 
                session = request.getSession();
                UserName = request.getParameter("username");
                UserPassword = request.getParameter("password");
                user = um2.validateUser(UserName, UserPassword);
                
                if(user == null) {
                    response.sendRedirect("NotLogin.jsp");
                } else {
                    session.setAttribute("username", user);
                    response.sendRedirect("test.jsp");
                }
                break;
        }
        
//        if(us == null) 
//            request.getRequestDispatcher("test.jsp").forward(request, response);
            
        
        
//        if(origin != null && origin.equals("register")){
//            String username = request.getParameter("username");
//            String password = request.getParameter("password");
//            String password2 = request.getParameter("password2");
//            if(password.equals(password2)){
//                um.addUser(username, password);
//                request.getSession().setAttribute("username", username);    
//                
//            }else{
//                request.getRequestDispatcher("login.jsp").forward(request, response);
//            }
//        }
//        if(origin != null && origin.equals("delete")){
//            um.deleteUsers();
//        }
//           List<User> users = um.getUser();
//           request.getSession().setAttribute("userlist", users);
//           request.getRequestDispatcher("users.jsp").forward(request, response);
//        
        
        
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
