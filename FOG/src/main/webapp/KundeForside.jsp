<%-- 
    Document   : KundeForside
    Created on : 03-05-2017, 21:10:01
    Author     : Anders
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <a href="AddOrder.jsp">Ny ordre</a>
        <a href="ShowOrders.jsp">Vis ordre</a>
        <a href="userIndex.jsp">DIN MOR</a>
        <form action="UserController" method="post">
            <input type="hidden" name="logout" value="<% session.invalidate(); %>">
            <input type="hidden" name="origin" value="Logout">
            <input type="submit" class="btn btn-info" value="Log ud"> 
        </form>
    </body>
</html>