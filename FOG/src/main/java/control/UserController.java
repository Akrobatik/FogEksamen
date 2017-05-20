package control;

import business.UserAdminDomainFacade;
import business.UserDomainFacade;
import business.UserSuperAdminDomainFacade;
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
    
    UserDomainFacade udf = new UserDomainFacade();
    UserAdminDomainFacade uadf = new UserAdminDomainFacade();
    UserSuperAdminDomainFacade usadf = new UserSuperAdminDomainFacade();
    
    User user;
    UserAdmin userAdmin;
    UserSuperAdmin userSuperAdmin;
    String username, password;
    
    String origin;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            HttpSession session = request.getSession();
            session = request.getSession();
        
                username = request.getParameter("username");
                password = request.getParameter("password");
                
                user = udf.validateUser(username, password);
                userAdmin = uadf.validateAdmin(username, password);
                userSuperAdmin = usadf.validateSuperAdmin(username, password);
               
                if(user == null && userAdmin == null && userSuperAdmin == null) {
                    response.setStatus(403);
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
            ex.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String origin = request.getParameter("origin");
        
        switch(origin) {
            case "Logout": 
                request.getParameter("logout");
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
                udf.addUser(username, password, firstname, lastname, tlf, email);
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
                udf.deleteUser(Integer.parseInt(request.getParameter("userId")));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}