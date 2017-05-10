<%-- 
    Document   : EditOrder
    Created on : 03-05-2017, 21:20:48
    Author     : Anders
--%>

<%@page import="model.entity.User"%>
<%@page import="model.entity.Order"%>
<%@page import="java.util.List"%>
<%@page import="model.data.OrderMapper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <h1>Vis ordre</h1>
        <%
            OrderMapper om = new OrderMapper();
        %>
        <div class="container">
            <h2>Basic Table</h2>
            <p>The .table class adds basic styling (light padding and only horizontal dividers) to a table:</p>   
            <table class="table">
                <thead>
                    <tr>
                        <th>Tag type</th>
                        <th>Længde</th>
                        <th>Bredde</th>
                        <th>Højde</th>
                        <th>Bruger ID</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        User u = (User) (session.getAttribute("user"));
                        List<Order> theorder = om.getUserOrder(u);
                        for (Order order : theorder) {
                    %>
                    <tr>
                        <td> <%=order.getRoofType()%></td>
                        <td> <%=order.getWidth()%></td>
                        <td> <%=order.getLength()%></td>
                        <td> <%=order.getHeight()%></td>
                        <td> <%=order.getUser_idUser()%></td>
                        <td>
                            <form action="OrderController" method="get">
                                <input type="hidden" name="origin" value="UserEditOrder">
                                <input type="submit" class="btn btn-info" value="Rediger ordre">
                            </form>
                        </td>
                        <td> 
                            <form action="OrderController" method="get">
                                <input type="hidden" name="orderId" value="<% out.print(order.getIdOrder());%>">
                                <input type="hidden" name="origin" value="DeleteOrder">
                                <input type="submit" class="btn btn-info" value="Slet Ordre"/>
                                <!--<input type="hidden" name="orderNumber" value="DeleteOrder">-->
                            </form>
                        </td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
        </div>
    </body>
</html>
