/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import business.OrderDomainFacade;
import exceptions.ToLogException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.entity.Order;
import model.entity.User;

/**
 *
 * @author Anders
 */
@WebServlet(name = "OrderController", urlPatterns = {"/OrderController"})
public class OrderController extends HttpServlet {

    OrderDomainFacade odf = new OrderDomainFacade();
    
    String origin;
    HttpSession session;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            origin = request.getParameter("origin");
        
            switch(origin) {
                case "AddOrder":
                    addOrder(request, response);
                    response.sendRedirect("userOrder.jsp");
                    break;
                case "DeleteOrder":
                    deleteOrder(request, response);
                    response.sendRedirect("userOrder.jsp");
                    break;
            }
    }
    
    protected void addOrder(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        try {
            session = request.getSession();
            String roofType = request.getParameter("roofType");
            double width = Double.parseDouble(request.getParameter("width"));
            double length = Double.parseDouble(request.getParameter("length"));
            double height = Double.parseDouble(request.getParameter("height"));
            odf.addOrder(roofType, width, length, height, ((User)session.getAttribute("user")).getIdUser());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    protected void deleteOrder(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        try {
            origin = request.getParameter("origin");
            if(origin != null && origin.equals("DeleteOrder")) {
            odf.deleteOrder(Integer.parseInt(request.getParameter("orderId")));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public List getOrders() throws ToLogException {
        List<Order> order = odf.getOrders();
        return order;
    }
    
    public List getUserOrder(User user) throws ToLogException {
        List<Order> userorder = odf.getUserOrder(user);
        return userorder;
    }
}
