package servlet;

import entity.Customer;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import mapper.CustomerMapper;

@WebServlet(name = "Controller", urlPatterns =
{
    "/Controller"
})
public class Controller extends HttpServlet
{
    CustomerMapper cm = new CustomerMapper();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String origin = request.getParameter("origin");
        HttpSession session = request.getSession();

        Customer customer;
        String name, password;
        
        switch (origin)
        {
            case "login":

                session = request.getSession();
                name = request.getParameter("name");
                password = request.getParameter("password");
                customer = cm.validateCustomer(name, password);

                if (customer == null)
                {
                    response.sendRedirect("login.jsp");

                }
                else
                {
                    session.setAttribute("customer", customer);
                    response.sendRedirect("info.jsp");
                }

                break;
                
            case "logout":

                if (session.getAttribute("customer") != null)
                {
                    session.setAttribute("customer", null);
                    response.sendRedirect("/Shop");
                }

                break;
                
            case "order":

                String[] topids = request.getParameterValues("cakestopid");
                String[] bottomids = request.getParameterValues("cakesbottomid");
                String[] quantities = request.getParameterValues("cakesquantity");
                
                for(int i = 0; i < topids.length; i++)
                {
                    System.out.println(topids[i] + bottomids[i] + quantities[i]);
                }

                break;
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        processRequest(request, response);
    }
}