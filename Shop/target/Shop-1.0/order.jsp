<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.List, entity.Customer, entity.Bottom, entity.Top, mapper.CakeMapper"%>

<!DOCTYPE html>
<html lang="en"> 
    <head>
        
        <title>Shop - Order</title>
        
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        
        <link type="text/css" rel="stylesheet" href="stylesheet.css">
        
        <script src="order.js"></script>
        
    </head>
    <body>

        <h1>Shop - Order</h1>
        
        <jsp:include page='menu.html'></jsp:include>
        
        <jsp:include page='status.jsp'></jsp:include>
                
        <% CakeMapper cm = new CakeMapper(); %>
        
        <form id="order" action="Controller" method="post">
            
            <input type="hidden" name="origin" value="order">
            
            <h2>Tops</h2>
            <div id="tops">
                <%
                    List<Top> thetops = cm.getTops();

                    for (Top top : thetops)
                    {
                        out.print("<div>");
                        out.print("<img width=\"100\" src=\"images/" + top.getName() + ".png\">");
                        out.print("<p>" + top.getName() + "</p>");
                        out.print("<p>" + top.getPrice() + "</p>");
                        out.print("<input name=\"Top\" class=\"cakepart\" type=\"radio\">");
                        out.print("<input type=\"hidden\" value=\"" + top.getId() + "\">");
                        out.print("</div>");
                    }
                %>
            </div>
            
            <h2>Bottoms</h2>        
            <div id="bottoms">
                <%
                    List<Bottom> thebottoms = cm.getBottoms();

                    for (Bottom bottom : thebottoms)
                    {
                        out.print("<div>");
                        out.print("<img width=\"100\" src=\"images/" + bottom.getName() + ".png\">");
                        out.print("<p>" + bottom.getName() + "</p>");
                        out.print("<p>" + bottom.getPrice() + "</p>");
                        out.print("<input name=\"Bottom\" class=\"cakepart\" type=\"radio\">");
                        out.print("<input type=\"hidden\" value=\"" + bottom.getId() + "\">");
                        out.print("</div>");
                    }
                %>
            </div>
            
            <p>CakePrice: <span id="CakePrice">0</span>$    </p>
            <label>Quantity</label><input type="text" id="quantity">
            
            <br>
            
            <input id="ButtonAddCakes" type="button" value="Add cakes">
            
            <br>
            
            <table>
                <thead>
                    <tr>
                        <th>Top</th>
                        <th>Bottom</th>
                        <th>Price</th>
                        <th>Quantity</th>
                        <th>SubTotal</th>
                    </tr>
                </thead>
                <tbody id="orderlines">                    
                </tbody>
            </table>            
            
            <div id="cakes">
            </div>
            
            <p>Total: <span id="total"></span></p>
            
            <input id="ButtonOrderCakes" type="submit" value="Order" disabled="disabled">
      
        </form>

    </body>
</html>