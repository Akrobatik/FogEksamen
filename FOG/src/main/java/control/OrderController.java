/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.entity.Order;
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
import model.data.OrderMapper;
import model.entity.User;

/**
 *
 * @author Anders
 */
@WebServlet(name = "OrderController", urlPatterns = {"/OrderController"})
public class OrderController extends HttpServlet {

    OrderMapper om = new OrderMapper();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String origin = request.getParameter("origin");
            HttpSession session = request.getSession();
        
            Order order;
        
            switch(origin) {
                case "AddOrder":
                    session = request.getSession();
                    String roofType = request.getParameter("roofType");
                    double width = Double.parseDouble(request.getParameter("width"));
                    double length = Double.parseDouble(request.getParameter("length"));
                    double height = Double.parseDouble(request.getParameter("height"));
                    om.addOrder(roofType, width, length, height, ((User)session.getAttribute("user")).getIdUser());
                    response.sendRedirect("SendOrder.jsp");
                    break;
                case "DeleteOrder":
                    session = request.getSession();
                    if(origin != null && origin.equals("DeleteOrder")) {
                        om.deleteOrder(Integer.parseInt(request.getParameter("orderId")));
                        response.sendRedirect("OrderDeleted.jsp");
                    }
                    break;
                case "EditOrder": //ER IKKE FÆRDIG!!
                    session = request.getSession();
                    if(origin != null && origin.equals("UserEditOrder")) {
                        //om.editOrder(Integer.parseInt(request.getParameter("")));
                        //om.editOrder(roofType, width, length, height); // Skal bruges 
                        response.sendRedirect("UserEditOrder.jsp");
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
