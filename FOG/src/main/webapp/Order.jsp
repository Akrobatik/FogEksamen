<%-- 
    Document   : Order
    Created on : 23-04-2017, 23:52:28
    Author     : Anders
--%>

<%@page import="java.util.List"%>
<%@page import="entity.Order"%>
<%@page import="mapper.OrderMapper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Order</h1>
        
        <%OrderMapper om = new OrderMapper();%>
        
        <form id="ordre" action="OrderController" method="post">
            <input type="hidden" name="origin" value="ShowOrder">
            <div>
                <% 
                        List<Order> theorder = om.getOrders();
                        for (Order order: theorder) {
                            out.println("<p>" + order.getRoofType() + "</p>");
                            out.println("<p>" + order.getWidth() + "</p>");
                            out.println("<p>" + order.getLength() + "</p>");
                            out.println("<p>" + order.getHeigth() + "</p>");
                        }
                    %>
            </div>
        </form>
    </body>
</html>
