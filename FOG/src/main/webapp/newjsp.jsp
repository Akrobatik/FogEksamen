<%-- 
    Document   : newjsp
    Created on : 18-05-2017, 22:26:33
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
    </head>
    <body>
        <h1>Vis ordre</h1>
        <%
            ProductlineMapper pm = new ProductlineMapper();
            
        %>
        <div class="container">
            <table class="table">
                <thead>
                    <tr>
                        <th>Ordre ID</th>
                        <th>Tag type</th>
                        <th>Bredde</th>
                        <th>Længde</th>
                        <th>Højde</th>
                        <th>Bruger ID</th>
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
                        <td></td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
        </div>
    </body>
</html>
