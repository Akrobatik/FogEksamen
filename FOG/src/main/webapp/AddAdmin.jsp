<%-- 
    Document   : AddAdmin
    Created on : 03-05-2017, 22:15:44
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
        <h1>Tilføj ny admin</h1>
        <form action="SuperAdminController" method="post">
            <input type="hidden" name="origin" value="AddAdmin">
            <input type="text" name="username" placeholder="Brugernavn"/>
            <input type="password" name="password" placeholder="password"/>
            <input type="password" name="password2" placeholder="Gentag password"/>
            <input type="text" name="firstname" placeholder="Fornavn"/>
            <input type="text" name="lastname" placeholder="Efternavn"/>
            <input type="submit" value="submit">
        </form>
    </body>
</html>
