<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en"> 
    <head>
        
        <title>Shop - Login</title>
        
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        
    </head>
    <body>

        <h1>Shop - Login</h1>
        
        <jsp:include page='menu.html'></jsp:include>
        
        <form action="Controller" method="post">
            
            <input type="hidden" name="origin" value="login">
            
            <input type="text" name="name" value="" placeholder="">
            <input type="password" name="password" value="" placeholder="">
            
            <input type="submit" name="Login" value="Log in">
            
        </form>

    </body>
</html>