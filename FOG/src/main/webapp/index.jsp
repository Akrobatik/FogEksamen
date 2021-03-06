<%--
    Document   : index
    Created on : Mar 27, 2017, 6:43:41 PM
    Author     : Rasmussen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet">
        <link rel="stylesheet" href="style/main.css">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
                    <form role="form" method="get" action="UserController" autocomplete="off">
                        <h2>Velkommen - Login</h2>
                        <hr>
                        <input type="hidden" name="origin" value="">
                        <div class="form-group">
                            <input type="text" name="username" id="username" class="form-control input-lg" placeholder="Brugernavn" required="" tabindex="1">
                        </div>

                        <div class="form-group">
                            <input type="password" name="password" id="password" class="form-control input-lg" placeholder="Password" required="" tabindex="3">
                        </div>
                        <hr>
                        <div class="row">
                            <div class="col-xs-6 col-md-6"><input type="submit" name="submit" value="Login" class="btn btn-primary btn-block btn-lg" tabindex="5"></div>
                        </div>
                    </form>
                    <form role="form" method="post" action="UserController" autocomplete="off" style="padding-bottom: 1em;">
                        <hr>
                        <input type="hidden" name="origin" value="Register">
                        <div class="row">
                            <div class="col-xs-6 col-md-6"><input type="submit" name="submit" value="Ny bruger" class="btn btn-primary btn-block btn-lg" tabindex="5"></div>
                        </div>
                    </form>
                    
                    <form action="UserController" method="get">
                       
                         <%
                            session.getAttribute("ErrorMessage");
                            if(session.getAttribute("ErrorMessage")!=null){
                        %>
                        <div class="alert bg-danger">   <%out.println(session.getAttribute("ErrorMessage")); %> </div>
                        <%
                             }
                        %>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
