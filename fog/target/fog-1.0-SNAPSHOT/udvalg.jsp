<%-- 
    Document   : udvalg
    Created on : 14-03-2017, 21:15:39
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="fogCascadeStyleSheet.css"> 
        <style>
body {background-color: powderblue;}
h1   {color: blue;}
p    {color: red;}
</style>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>udvlag</title>
    </head>
    <body>
        <h1>vælg din port</h1>
        <from id="order" action="Controller" method="post" >  
  <input type="radio" name="port" value="port1" checked> port1<br>
  <input type="radio" name="port" value="port2"> port2
  <input type="radio" name="port" value="port3"> port3
  <input type="radio" name="port" value="port4"> port4<br>
  <input type="radio" name="port" value="port5"> port5
  <p>PortPrice: <span id="portPrice">0</span>$    </p>
  
   <img src="ProductPage.png" alt="Test Image"  align="right"/>      
   
  
  <br>
            
            <input id="ButtonAddPort" type="button" value="Add port">
            
            <br>    
        
   
    <table>
                <thead>
                    <tr>
                    
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
            
        <input id="ButtonOrderport" type="submit" value="Order" disabled="disabled">
        
        
    </from>
    
      


    <h4> Kontak og åbningstider </h4> 
   
    
    
    
<table border="1">
<tr>
<td>telfon, 42807520</td>
<td>telfon kundservice,24807520</td>
<td>mail, fog@gmail.com</td>
</tr>
<tr>
<td>mandag - onsdag,9:00 -17:00  </td>
<td>torsdag, 9:00 - 16:00</td>
<td>fredag, 9:00 - 15:30</td>
<td>lørdag, 9:00 - 14:00</td>
<td> søndag, lukket</td>
</tr>
</table>


</body>
</html>
