<%-- 
    Document   : DeleteAdmin
    Created on : 04-05-2017, 10:51:44
    Author     : Anders
--%>

<%@page import="model.entity.UserSuperAdmin"%>
<%@page import="model.entity.UserAdmin"%>
<%@page import="java.util.List"%>
<%@page import="model.data.UserSuperAdminMapper"%>
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
        <h1>Slet Admin bruger</h1>
        <%
            UserSuperAdminMapper usam = new UserSuperAdminMapper(); 
        %> 
        <div class="container">
  <h2>Basic Table</h2>
  <p>The .table class adds basic styling (light padding and only horizontal dividers) to a table:</p>            
  <table class="table">
    <thead>
      <tr>
        <th>Brugernavn</th>
        <th>Fornavn</th>
        <th>Efternavn</th>
      </tr>
    </thead>
    <tbody>
        <% 
            
        %>
      <tr>
        <td>John</td>
        <td>Doe</td>
        <td>john@example.com</td>
      </tr>
    </tbody>
  </table>
</div>
    </body>
</html>
