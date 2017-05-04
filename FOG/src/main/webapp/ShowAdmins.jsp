<%-- 
    Document   : DeleteAdmin
    Created on : 04-05-2017, 10:51:44
    Author     : Anders
--%>

<%@page import="model.data.UserSuperAdminMapper"%>
<%@page import="model.entity.UserAdmin"%>
<%@page import="java.util.List"%>
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
        <h1>Vis Admin bruger</h1>
        <%
            UserSuperAdminMapper usam = new UserSuperAdminMapper();
        %> 
        <div class="container">
  <h2>Basic Table</h2>
  <p>The .table class adds basic styling (light padding and only horizontal dividers) to a table:</p>   
  <form action="SuperAdminController" method="post">
  <table class="table">
    <thead>
      <tr>
        <th>Brugernavn</th>
        <th>Password</th>
        <th>Fornavn</th>
        <th>Efternavn</th>
      </tr>
    </thead>
    <tbody>
        <% 
            List<UserAdmin> theadmin = usam.getAdmins();
            for (UserAdmin usera : theadmin) {
        %>
      <tr>
        <td> <%=usera.getUsername() %></td>
        <td> <%=usera.getPassword() %></td>
        <td> <%=usera.getFirstname() %></td>
        <td> <%=usera.getLastname() %></td>
        <td> <button type="button" class="btn btn-info" name="origin" value="delete">Info</button> </td>
      </tr>
        <%
            }
        %>
    </tbody>
  </table>
    </form>
</div>
    </body>
</html>
