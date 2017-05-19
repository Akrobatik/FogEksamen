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
                    <form role="form" method="post" action="UserController" autocomplete="off">
                        <h2>Opret Bruger</h2>
                        <hr>
                        <input type="hidden" name="origin" value="RegisterUser">
                        <div class="form-group">
                            <input type="text" name="username" id="username" class="form-control input-lg" placeholder="Username" tabindex="1">
                        </div>
                        <div class="form-group">
                            <input type="password" name="password" id="password" class="form-control input-lg" placeholder="Password" tabindex="2">
                        </div>
                        <div class="form-group">
                            <input type="password" name="password2" id="password2" class="form-control input-lg" placeholder="Gentag password" tabindex="3">
                        </div>
                        <div class="form-group">
                            <input type="text" name="firstname" id="firstname" class="form-control input-lg" placeholder="Fornavn" tabindex="4">
                        </div>
                        <div class="form-group">
                            <input type="text" name="lastname" id="lastname" class="form-control input-lg" placeholder="Efternavn" tabindex="5">
                        </div>
                        <div class="form-group">
                            <input type="text" name="tlf" id="tlf" class="form-control input-lg" placeholder="Tlf" tabindex="6">
                        </div>
                        <div class="form-group">
                            <input type="text" name="email" id="email" class="form-control input-lg" placeholder="Email" tabindex="7">
                        </div>
                        <hr>
                        <div class="row">
                            <div class="col-xs-6 col-md-6"><input type="submit" name="submit" value="Opret" class="btn btn-primary btn-block btn-lg" tabindex="8"></div>
                        </div>
                    </form>
                    
                </div>
            </div>
        </div>
    </body>
</html>
