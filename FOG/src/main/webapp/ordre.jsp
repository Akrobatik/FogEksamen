<%-- 
    Document   : ordreList
    Created on : 29-03-2017, 17:37:45
    Author     : Anders
--%>

<%@page import="mapper.OrdreMapper"%>
<%@page import="java.util.List"%>
<%@page import="entity.Ordre"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World 2000!</h1>
        
        <%OrdreMapper om = new OrdreMapper();%>
        
        <form id="ordre" action="OrdreController" method="post">
            <input type="hidden" name="origin" value="orders">
            <div id="ordreList">
                <% List<Ordre> theordre = om.getOrdre();
                    for (Ordre ordre : theordre) {
                        out.println("<div>");
                        out.println("<p> Ordre ID: " + ordre.getOrdreId() + "</p>");
                        out.println("<p> Bredde: " + ordre.getWidth() + "</p>");
                        out.println("<p> Højde: " + ordre.getHeight() + "</p>");
                        out.println("<p> Søm: " + ordre.getNails() + "</p>");
                        out.println("<p> Brader: " + ordre.getPlanks() + "</p>");
                        out.println("<p> Redskabsskur: " + ordre.getShed() + "</p>");
                        out.println("</div>");
                    }
                %>
        </form>
    </body>
</html>
