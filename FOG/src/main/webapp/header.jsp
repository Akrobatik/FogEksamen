<%-- 
    Document   : header
    Created on : 08-05-2017, 19:00:04
    Author     : Rikke Nielsen 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="error_page.jsp"%>
<% String ctx = request.getContextPath(); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">   
        <script src="https://code.jquery.com/jquery-3.2.1.min.js" integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=" crossorigin="anonymous"></script>
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet">
        <link href="<%= ctx %>/css/styles.css" rel="stylesheet">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.2.1.min.js" integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=" crossorigin="anonymous"></script>
        <script src="<%= ctx %>/js/lumino.glyphs.js"></script>

        <title>FOG</title>


            
</head>
<body>
        <% if (session.getAttribute("username") != null) { %>
            <jsp:include page="menu.jsp"/>
        <% } else { %>
            <div id="menu_container"></div>
        <% } %>
<div id="root" class="container">
   