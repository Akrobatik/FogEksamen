package control;

import model.entity.User;
import model.entity.UserAdmin;
import model.entity.UserSuperAdmin;
import exceptions.ToLogException;
import exceptions.UserFeedbackException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.data.UserAdminMapper;
import model.data.UserMapper;
import model.data.UserSuperAdminMapper;

/**
 *
 * @author Anders
 */
@WebServlet(name = "UserController", urlPatterns = {"/UserController"})
public class UserController extends HttpServlet {
    UserMapper um = new UserMapper(); 
    UserAdminMapper uam = new UserAdminMapper();
    UserSuperAdminMapper usam = new UserSuperAdminMapper();
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
        
        User user;
        UserAdmin userAdmin;
        UserSuperAdmin userSuperAdmin;
        String username, password;
        
        switch(origin) {
            case "Login": 
                session = request.getSession();
                username = request.getParameter("username");
                password = request.getParameter("password");
                
                user = um.validateUser(username, password);
                userAdmin = uam.validateAdmin(username, password);
                userSuperAdmin = usam.validateSuperAdmin(username, password);
               
                if(user == null && userAdmin == null && userSuperAdmin == null) {
                    response.setStatus(403);
                } else if (user != null) {
                    session.setAttribute("user", user);
                    //response.sendRedirect("userIndex.jsp");
                    response.sendRedirect("KundeForside.jsp");
                } else if (userAdmin != null) {
                    session.setAttribute("username", userAdmin);
                    response.sendRedirect("adminIndex.jsp");
                } else if (userSuperAdmin != null) {
                    session.setAttribute("username", userSuperAdmin);
                    //response.sendRedirect("superadmin/index.html");
                    response.sendRedirect("SuperAdminForside.jsp");
                }
                break;
            case "Logout": 
                request.getParameter("logout");
                response.sendRedirect("index.jsp");
                break;
                
//            case "Registrer":
//                if(origin != null && origin.equals("register")){
//                    String newusername = request.getParameter("username");
//                    String newpassword = request.getParameter("password");
//                    String firstname = request.getParameter("firstname");
//                    String lastname = request.getParameter("lastname");
//                    int tlf = request.getParameter(tlf);
//                    String password2 = request.getParameter("password2");
//                if(newpassword.equals(password2)){
//                    um.addUser(newusername, newpassword, firstname, lastname);
//                    request.getSession().setAttribute("username", newusername);    
//                }else{
//                    request.getRequestDispatcher("login.jsp").forward(request, response);
//            }
//        }
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
