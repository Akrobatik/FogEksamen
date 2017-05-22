<%-- 
    Document   : errorPage
    Created on : 22-05-2017, 14:26:50
    Author     : Anders
--%>

<%@page import="control.UserController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            UserController uc = new UserController();
            
        %>
        
        <form action="UserController" method="get">
            <%
                out.println(session.getAttribute("ErrorMessage"));
//                request.getSession().getAttribute("ErrorMessage");
            %>
        </form>
        
    </body>
</html>
