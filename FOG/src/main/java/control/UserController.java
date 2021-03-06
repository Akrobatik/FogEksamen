package control;

import business.UserAdminBusinessFacade;
import business.UserBusinessFacade;
import business.UserSuperAdminBusinessFacade;
import exceptions.ToLogException;
import exceptions.UserFeedbackException;
import model.entity.User;
import model.entity.UserAdmin;
import model.entity.UserSuperAdmin;
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
@WebServlet(name = "UserController", urlPatterns = {"/UserController"})
public class UserController extends HttpServlet {
    
    UserBusinessFacade ubf = new UserBusinessFacade();
    UserAdminBusinessFacade uabf = new UserAdminBusinessFacade();
    UserSuperAdminBusinessFacade usabf = new UserSuperAdminBusinessFacade();
    
    User user;
    UserAdmin userAdmin;
    UserSuperAdmin userSuperAdmin;
    String username, password;
    
    String origin;
    HttpSession session;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            HttpSession session = request.getSession();
            session = request.getSession();
        
                username = request.getParameter("username");
                password = request.getParameter("password");
                
                user = ubf.validateUser(username, password);
                userAdmin = uabf.validateAdmin(username, password);
                userSuperAdmin = usabf.validateSuperAdmin(username, password);
               
                if(user == null && userAdmin == null && userSuperAdmin == null) {
                    request.getSession().setAttribute("ErrorMessage", "Brugernavn og/eller password passer ikke." + "\nPrøv igen");
                    response.sendRedirect("index.jsp");
                } else if (user != null) {
                    session.setAttribute("user", user);
                    response.sendRedirect("userIndex.jsp");
                } else if (userAdmin != null) {
                    session.setAttribute("username", userAdmin);
                    response.sendRedirect("adminIndex.jsp");
                } else if (userSuperAdmin != null) {
                    session.setAttribute("username", userSuperAdmin);
                    response.sendRedirect("superadminIndex.jsp");
                }
        } catch (ToLogException | UserFeedbackException ex) {
            ex.getMessage();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String origin = request.getParameter("origin");
        
        switch(origin) {
            case "Logout": 
                logoutUser(request, response);
                response.sendRedirect("index.jsp");
                break;
            case "Register":
                response.sendRedirect("register.jsp");
                break;
            case "RegisterUser":
                registerUser(request, response);
                break;
            case "DeleteUser":
                deleteUser(request, response);
                response.sendRedirect("index.jsp");
                break;
        }
    }
    
    protected void registerUser(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        try {
            username = request.getParameter("username");
            password = request.getParameter("password");
            String password2 = request.getParameter("password2");
            String firstname = request.getParameter("firstname");
            String lastname = request.getParameter("lastname");
            int tlf = Integer.parseInt(request.getParameter("tlf"));
            String email = request.getParameter("email");
            if(password.equals(password2)){
                ubf.addUser(username, password, firstname, lastname, tlf, email);
                request.getSession().setAttribute("username", username);  
                response.sendRedirect("index.jsp");
            }else{
                response.sendRedirect("userRegisterError.jsp");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    protected void deleteUser(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        try {
            origin = request.getParameter("origin");
            if(origin != null && origin.equals("DeleteUser")) {
                ubf.deleteUser(Integer.parseInt(request.getParameter("userId")));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    protected void logoutUser (HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        try {
            request.getParameter("logout");
            //session = request.getSession();
            session.invalidate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}