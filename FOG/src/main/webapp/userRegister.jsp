<%-- 
    Document   : userRegister
    Created on : 12-05-2017, 23:43:24
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
        <h1>Opret ny bruger</h1>
        <form action="UserController" method="post">
            <input type="hidden" name="origin" value="RegisterUser" >
            <input type="text" name="username" placeholder="Brugernavn" required=""/>
            <input type="password" name="password" placeholder="password" required=""/>
            <input type="password" name="password2" placeholder="Gentag password" required=""/>
            <input type="text" name="firstname" placeholder="Fornavn" required=""/>
            <input type="text" name="lastname" placeholder="Efternavn" required=""/>
            <input type="text" name="tlf" placeholder="Tlf" required=""/>
            <input type="text" name="email" placeholder="Email" required=""/>
            <input type="submit" value="submit">
        </form>
    </body>
</html>
