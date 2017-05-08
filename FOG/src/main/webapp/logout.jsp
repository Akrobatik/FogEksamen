<%-- 
    Document   : logout
    Created on : 08-05-2017, 22:21:18
    Author     : Rikke Nielsen 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% session.invalidate(); 
response.sendRedirect("index.jsp");
%>

