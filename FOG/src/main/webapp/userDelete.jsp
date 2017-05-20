<%@page import="business.UserDomainFacade"%>
<%@page import="business.OrderDomainFacade"%>
<%@page import="model.entity.Productline"%>
<%@page import="model.data.ProductlineMapper"%>
<%@page import="model.entity.User"%>
<%@page import="model.entity.Order"%>
<%@page import="model.data.OrderMapper"%>
<%@page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>FOG</title>

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/datepicker3.css" rel="stylesheet">
<link href="css/bootstrap-table.css" rel="stylesheet">
<link href="css/styles.css" rel="stylesheet">

<!--Icons-->
<script src="js/lumino.glyphs.js"></script>

<!--[if lt IE 9]>
<script src="js/html5shiv.js"></script>
<script src="js/respond.min.js"></script>
<![endif]-->



</head>

<body>
            
    <%
        UserDomainFacade udf = new UserDomainFacade();
    %>
    
    <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#sidebar-collapse">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#"><span>FOG</span></a>
				<ul class="user-menu">
					<li class="dropdown pull-right">
                                                <form action="UserController" method="post">
                                                <input type="hidden" name="logout" value="<% //session.invalidate(); %>">
                                                <input type="hidden" name="origin" value="Logout">
                                                <input type="submit" class="btn btn-info" value="Log ud"> 
                                            </form>					
                                        </li>
				</ul>   
			</div>
							
		</div><!-- /.container-fluid -->
	</nav>
		
	<div id="sidebar-collapse" class="col-sm-3 col-lg-2 sidebar">
		
		<ul class="nav menu">
			<li><a href="userIndex.jsp"><svg class="glyph stroked dashboard-dial"><use xlink:href="#stroked-dashboard-dial"></use></svg> Forside</a></li>
                        <li><a href="userOrder.jsp"><svg class="glyph stroked table"><use xlink:href="#stroked-table"></use></svg>Alle ordre</a></li>
                        <li class="active"><a href="#"><svg class="glyph stroked table"><use xlink:href="#stroked-table"></use></svg>Indstillinger</a></li>
			<li role="presentation" class="divider"></li>
		</ul>
		<div class="attribution">By <a href="http://www.Rasmussen-Solutions.dk/">Emil Rasmussen</a></div>
	</div><!--/.sidebar-->
		
	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">			
		<div class="row">
			<ol class="breadcrumb">
				<li><a href="#"><svg class="glyph stroked home"><use xlink:href="#stroked-home"></use></svg></a></li>
				<li class="active">Indstillinger</li>
			</ol>
		</div><!--/.row-->
		
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Indstillinger</h1>
			</div>
		</div><!--/.row-->
				
<!-- order -->
                <div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-body">
                                            <table class="table">
                                                <thead>
						    <tr>
                                                        <!--<th data-field="state" data-checkbox="true" >Tag type</th> -->
                                                        <th>Brugernavn</th>
                                                        <th>Fornavn</th>
                                                        <th>Efternavn</th>
                                                        <th>Tlf</th>
                                                        <th>Email</th>
						    </tr>
                                                </thead>
                                                    <tbody>
                                                    <%
                                                        User u = (User) (session.getAttribute("user"));
                                                        List<User> theuser = udf.getUser(u);
                                                        for (User user : theuser) {
                                                    %>
                                                    <tr>
                                                        <td> <%=user.getIdUser()%></td>
                                                        <td> 
                                                            <form action="UserController" method="post">
                                                                <input type="hidden" name="userId" value="<% out.print(user.getIdUser());%>">
                                                                <input type="hidden" name="origin" value="DeleteUser">
                                                                <input type="submit" class="btn btn-info" value="Slet Ordre"/>
                                                            </form>
                                                        </td>
                                                    </tr>
                                                    <%
                                                        }
                                                    %>
                                                    </tbody>
                                                </table>
					</div>
				</div>
			</div>
		</div><!--/.row-->
	</div><!--/.main-->

	<script src="js/jquery-1.11.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/chart.min.js"></script>
	<script src="js/chart-data.js"></script>
	<script src="js/easypiechart.js"></script>
	<script src="js/easypiechart-data.js"></script>
	<script src="js/bootstrap-datepicker.js"></script>
	<script src="js/bootstrap-table.js"></script>
		
</body>

</html>
