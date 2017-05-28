<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>FOG</title>

<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/datepicker3.css" rel="stylesheet">
<link href="css/styles.css" rel="stylesheet">

<!--Icons-->
<script src="js/lumino.glyphs.js"></script>

<!--[if lt IE 9]>
<script src="js/html5shiv.js"></script>
<script src="js/respond.min.js"></script>
<![endif]-->

</head>

<body>
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
		<form role="search">
			<div class="form-group">
				<input type="text" class="form-control" placeholder="Search">
			</div>
		</form>
		<ul class="nav menu">
			<li class="active"><a href="#"><svg class="glyph stroked dashboard-dial"><use xlink:href="#stroked-dashboard-dial"></use></svg> Forside</a></li>
			<li><a href="superadminUser.jsp"><svg class="glyph stroked male-user"><use xlink:href="#stroked-male-user"></use></svg> Admins</a></li>
                        <li><a href="superadminOrder.jsp"><svg class="glyph stroked table"><use xlink:href="#stroked-table"></use></svg> Orders</a></li>

			<li role="presentation" class="divider"></li>
		</ul>
		<div class="attribution">By <a href="http://www.Rasmussen-Solutions.dk/">Emil Rasmussen</a></div>
	</div><!--/.sidebar-->
		
	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">			
		
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Dashboard</h1>
			</div>
		</div><!--/.row-->
		
		<div class="row">
			
			
			<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
                                        <h1 style="padding-left: 1em;">Tilføj ny admin</h1>
                                        <hr>
                                        <form action="SuperAdminController" method="post" >
                                            <input type="hidden" name="origin" value="AddAdmin">
                                            <div class="form-group" style="padding-left: 2em;">
                                                <input type="text" name="username" class="form-control input-lg" placeholder="Username" required="" tabindex="1">
                                            </div>
                                            <div class="form-group" style="padding-left: 2em;">
                                                <input type="password" name="password" class="form-control input-lg" placeholder="Password" required="" tabindex="2">
                                            </div>
                                            <div class="form-group" style="padding-left: 2em;">
                                                <input type="password" name="password2" class="form-control input-lg" placeholder="Gentag password" required="" tabindex="3">
                                            </div>
                                            <div class="form-group" style="padding-left: 2em;">
                                                <input type="text" name="firstname" class="form-control input-lg" placeholder="Fornavn" required="" tabindex="4">
                                            </div>
                                            <div class="form-group" style="padding-left: 2em;">
                                                <input type="text" name="lastname" class="form-control input-lg" placeholder="Efternavn" required="" tabindex="5">
                                            </div>
                                            <div class="form-group" style="padding-left: 2em;">
                                                <input type="text" name="tlf" class="form-control input-lg" placeholder="Tlf" required="" tabindex="6">
                                            </div>
                                            <div class="form-group" style="padding-left: 2em;">
                                                <input type="text" name="email" class="form-control input-lg" placeholder="Email" required="" tabindex="7">
                                            </div>
                                                                <hr/>
                                            <div class="row" style="padding-left: 2em;">
                                                <input type="submit" value="Submit" class="btn btn-primary " tabindex="8">
                                            </div>
                                        </form>
				</div>
			</div>
		</div><!--/.row-->
		</div><!--/.row-->
		
	</div>	<!--/.main-->

	<script src="js/jquery-1.11.1.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/chart.min.js"></script>
	<script src="js/chart-data.js"></script>
	<script src="js/easypiechart.js"></script>
	<script src="js/easypiechart-data.js"></script>
	<script src="js/bootstrap-datepicker.js"></script>
	
</body>

</html>
