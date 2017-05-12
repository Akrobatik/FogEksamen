<%-- 
    Document   : SuperAdminShowOrders
    Created on : 10-05-2017, 11:09:58
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
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <h1>Order</h1>
        
        <%
            OrderMapper om = new OrderMapper();
        %>
        <div class="container">
            <table class="table">
                <thead>
                    <tr>
                        <th>Ordre ID</th>
                        <th>Tag type</th>
                        <th>Længde</th>
                        <th>Bredde</th>
                        <th>Højde</th>
                        <th>Bruger ID</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        List<Order> theorder = om.getOrders();
                        for (Order order: theorder) {
                    %>
                    <tr>
                        <td> <%=order.getIdOrder()%></td>
                        <td> <%=order.getRoofType()%></td>
                        <td> <%=order.getWidth()%></td>
                        <td> <%=order.getLength()%></td>
                        <td> <%=order.getHeight()%></td>
                        <td> <%=order.getUser_idUser()%></td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
        </div>
    </body>
</html>
