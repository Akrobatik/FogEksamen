<%-- 
    Document   : index
    Created on : Mar 27, 2017, 6:43:41 PM
    Author     : Rasmussen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"  errorPage="error_page.jsp"%>
<jsp:include page="header.jsp" />
 <div class="row">

     <div class="col-xs-12 col-sm-8 col-md-6 col-sm-offset-2 col-md-offset-3">
   <form id="userform" role="form" method="post" action="UserController" autocomplete="off">
    <h2>Admin Login</h2>
    <hr>

    <input type="hidden" name="origin" value="Login">

    <div class="form-group">
     <input type="text" name="username" id="username" class="form-control input-lg" placeholder="User Name" tabindex="1">
    </div>

    <div class="form-group">
     <input type="password" name="password" id="password" class="form-control input-lg" placeholder="Password" tabindex="3">
    </div>
<div class="row">
     <div id="errormessage" class="col-xs-6 col-md-6"></div>
    </div> 

    <hr>
    <div class="row">
     <div class="col-xs-6 col-md-6"><input type="submit" name="submit" value="Login" class="btn btn-primary btn-block btn-lg" tabindex="5"></div>
    </div>
    <script>
        
        $(document).ready(function() {
            $("#userform").submit(function(){
              $.post(this.action, $(this).serialize())
                .done(function(msg){ 
                    $.get("menu.jsp", function(data, status){
                        console.log("replace menu " + data);
                        $("#menu_container").html(data);
                    });
                    $("#root").html(msg);
                  })
                .fail(function(xhr, status, error){
                 $("#errormessage").html("<h3>ugyldigt brugernavn eller password</h3>");
                });
                return false;
            });
        });
        </script>
        
   </form>
  </div>
 </div>

<jsp:include page="footer.jsp" />