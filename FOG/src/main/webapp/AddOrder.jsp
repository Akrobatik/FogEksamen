<%-- 
    Document   : AddOrder
    Created on : 02-05-2017, 15:24:30
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
        <form action="OrderController" method="POST">
            <input type="hidden" name="origin" value="AddOrder">
            <h3>Tag type</h3>
            <select name="roofType">
                <option value="">Angiv Tagtype</option>
                <option value="Tegl">Tegl</option>
                <option value="Plastmo Ecolite">Plastmo Ecolite</option>
            </select>
            <h3>Bredde</h1>
            <select name="width">
                <option value="">Angiv bredde</option>
                <option value="3.0">3.0m</option>
                <option value="3.3">3.3m</option>
                <option value="3.6">3.6m</option>
            </select>
            <h3>Længde</h2>
            <select name="length">
                <option value="">Angiv længde</option>
                <option value="3.0">3.0m</option>
                <option value="3.3">3.3m</option>
                <option value="3.6">3.6m</option>
            </select>
            <h3>Højde</h3>
            <select name="height">
                <option value="">Angiv højde</option>
                <option value="2.4">2.4m</option>
                <option value="2.7">2.7m</option>
                <option value="3.0">3.0m</option>
            </select><br>
            <input type="submit" value="submit"/>
        </form>
    </body>
</html>
