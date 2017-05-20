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
		
		<ul class="nav menu">
			<li class="active"><a href="#"><svg class="glyph stroked dashboard-dial"><use xlink:href="#stroked-dashboard-dial"></use></svg>Forside</a></li>
                        <li><a href="userOrder.jsp"><svg class="glyph stroked table"><use xlink:href="#stroked-table"></use></svg>Alle ordre</a></li>
                        <li><a href="userDelete.jsp"><svg class="glyph stroked table"><use xlink:href="#stroked-table"></use></svg>Indstillinger</a></li>

			<li role="presentation" class="divider"></li>
		</ul>
		<div class="attribution">By <a href="http://www.Rasmussen-Solutions.dk/">Emil Rasmussen</a></div>
	</div><!--/.sidebar-->
		
	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">			
		
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Design Carport</h1>
			</div>
		</div><!--/.row-->
		
		<div class="row">
                    
                    <div class="row">
			<div class="col-lg-12">
                            <div class="panel panel-default">
                                <h2 style="padding-left: 1em;">Tilføj ny ordre</h2>
                                <hr />
				<form action="OrderController" method="POST" style="padding-left: 2em;">
                                    <input type="hidden" name="origin" value="AddOrder">
                                    <h3>Tag type</h3>
                                    <select class="form-control" name="roofType">
                                        <option value="">Angiv Tagtype</option>
                                        <option value="Tegl">Tegl</option>
                                        <option value="Plastmo Ecolite">Plastmo Ecolite</option>
                                    </select>
                                    <h3>Bredde</h3>
                                    <select class="form-control" name="width">
                                        <option value="">Angiv bredde</option>
                                        <option value="3.0">3.0m</option>
                                        <option value="3.3">3.3m</option>
                                        <option value="3.6">3.6m</option>
                                    </select>
                                    <h3>Længde</h3>
                                    <select class="form-control" name="length">
                                        <option value="">Angiv længde</option>
                                        <option value="3.0">3.0m</option>
                                        <option value="3.3">3.3m</option>
                                        <option value="3.6">3.6m</option>
                                    </select>
                                    <h3>Højde</h3>
                                    <select class="form-control" name="height">
                                        <option value="">Angiv højde</option>
                                        <option value="2.4">2.4m</option>
                                        <option value="2.7">2.7m</option>
                                        <option value="3.0">3.0m</option>
                                    </select><br>
                                    <input class="btn btn-primary" type="submit" value="submit"/>
                                    <hr />
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
