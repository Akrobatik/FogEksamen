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
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">


        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ordre</h1>
        
        <%OrdreMapper om = new OrdreMapper();%>
        
<<<<<<< HEAD
        <form id="ordre" action="OrdreController" method="post"> 
            <table class="table table-striped">
                <input type="hidden" name="origin" value="orders">
                    <thead>
                            <tr>
                                <th>ID</th>
                                <th>Width</th>
                                <th>Height</th>
                                <th>Nails</th>
                                <th>Planks</th>
                                <th>Shed</th>
                                <th>Get details</th>
                            </tr>
                    </thead>
                    <tbody>
                        <% List<Ordre> theordre = om.getOrdre();
                    for (Ordre ordre : theordre) {%>
                        <tr>
                            <td> <%= ordre.getOrdreId() %> </td>
                            <td> <%= ordre.getWidth() %></td>
                            <td> <%= ordre.getHeight() %></td>
                            <td> <%= ordre.getNails() %></td>
                            <td> <%= ordre.getPlanks() %></td>
                            <td> <%= ordre.getShed() %></td>
                            <td> <button type="button"class="btn btn-info" >Info</button> </td>
                        </tr>
                        <% }
                            %>
                    
                    </tbody>
      
                
            </table>
=======
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
            </div>
>>>>>>> AndersKunde
        </form>
           
    </body>
</html>