<%-- 
    Document   : EditOrder
    Created on : 03-05-2017, 21:20:48
    Author     : Anders
--%>

<%@page import="model.entity.Order"%>
<%@page import="java.util.List"%>
<%@page import="model.data.OrderMapper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Vis ordre</h1>
        
        <% OrderMapper om = new OrderMapper(); %>
        
        <form action="OrderController" method="post">
            
            <% 
                List<Order> theorder = om.getOrders();
                
                for (Order order: theorder) {
                    out.print("<div>");
                    out.print("<p>" + order.getRoofType() + "</p>");
                    out.print("<p>" + order.getWidth() + "</p>");
                    out.print("<p>" + order.getLength() + "</p>");
                    out.print("<p>" + order.getLength() + "</p>");
                    out.print("<p>" + order.getUser_idUser() + "</p>");
                    out.print("</div>");
                }
            %>
        </form>
    </body>
</html>
