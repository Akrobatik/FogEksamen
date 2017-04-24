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
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Roof Type</th>
                        <th>Width</th>
                        <th>Length</th>
                        <th>Height</th>
                    </tr>
                </thead>
                <tbody>
                    <% List<Order> theorder = om.getOrders();
                    for (Order order: theorder) {%>
                    <tr>
                        <td><% order.getRoofType(); %></td>
                        <td><% order.getWidth(); %></td>
                        <td><% order.getLength(); %></td>
                        <td><% order.getHeigth(); %></td>
                        <td> <button type="button" class="btn btn-info">Info</button></td>
                    </tr>
                    <% }
                    %>
                </tbody>
            </table>
        </form>
    </body>
</html>
