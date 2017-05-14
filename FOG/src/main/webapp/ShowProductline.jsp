<%-- 
    Document   : ShowProductline
    Created on : 14-05-2017, 10:57:43
    Author     : Anders
--%>

<%@page import="model.entity.Productline"%>
<%@page import="java.util.List"%>
<%@page import="model.data.ProductlineMapper"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <h1>Vis productline</h1>
        <%
            ProductlineMapper pm = new ProductlineMapper();
        %>
        <div class="container">
            <table class="table">
                <thead>
                    <tr>
                        <th>Produkt ID</th>
                        <th>Beskrivelse</th>
                        <th>Type</th>
                        <th>Navn</th>
                        <th>Pris</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        List<Productline> theproductline = pm.getProductline();
                        for(Productline productline : theproductline) {
                    %>
                    <tr>
                        <td> <%=productline.getIdStorage()%></td>
                        <td> <%=productline.getDescription()%></td>
                        <td> <%=productline.getType()%></td>
                        <td> <%=productline.getName()%></td>
                        <td> <%=productline.getPrice()%></td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
        </div>
        
    </body>
</html>
