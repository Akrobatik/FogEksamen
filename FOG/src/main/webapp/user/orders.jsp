<%@page import="java.util.List"%>
<%@page import="entity.Order"%>
<%@page import="entity.Order"%>
<%@page import="mapper.OrderMapper"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>FOG</title>

<link href="../css/bootstrap.min.css" rel="stylesheet">
<link href="../css/datepicker3.css" rel="stylesheet">
<link href="../css/bootstrap-table.css" rel="stylesheet">
<link href="../css/styles.css" rel="stylesheet">

<!--Icons-->
<script src="../js/lumino.glyphs.js"></script>

<!--[if lt IE 9]>
<script src="js/html5shiv.js"></script>
<script src="js/respond.min.js"></script>
<![endif]-->

</head>

<body>
            <%OrderMapper om = new OrderMapper();%>

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
						<a href="#" class="dropdown-toggle" data-toggle="dropdown"><svg class="glyph stroked male-user"><use xlink:href="#stroked-male-user"></use></svg> User <span class="caret"></span></a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="#"><svg class="glyph stroked male-user"><use xlink:href="#stroked-male-user"></use></svg> Profile</a></li>
							<li><a href="#"><svg class="glyph stroked gear"><use xlink:href="#stroked-gear"></use></svg> Settings</a></li>
							<li><a href="#"><svg class="glyph stroked cancel"><use xlink:href="#stroked-cancel"></use></svg> Logout</a></li>
						</ul>
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
			<li><a href="index.jsp"><svg class="glyph stroked dashboard-dial"><use xlink:href="#stroked-dashboard-dial"></use></svg> Forside</a></li>
                        <li class="active"><a href="orders.html"><svg class="glyph stroked table"><use xlink:href="#stroked-table"></use></svg> Orders</a></li>
			<li role="presentation" class="divider"></li>
		</ul>
		<div class="attribution">By <a href="http://www.Rasmussen-Solutions.dk/">Emil Rasmussen</a></div>
	</div><!--/.sidebar-->
		
	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">			
		<div class="row">
			<ol class="breadcrumb">
				<li><a href="#"><svg class="glyph stroked home"><use xlink:href="#stroked-home"></use></svg></a></li>
				<li class="active">Orders</li>
			</ol>
		</div><!--/.row-->
		
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Orders</h1>
			</div>
		</div><!--/.row-->
				
	<form id="ordre" action="OrderController" method="post">
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-body">
						<table name="origin" value="orders" data-toggle="table"  data-show-refresh="true" data-show-toggle="true" data-show-columns="true" data-search="true" data-select-item-name="toolbar1" data-pagination="true" data-sort-name="name" data-sort-order="desc">
						    <thead>
						    <tr>
                                                        <!--<th data-field="state" data-checkbox="true" >Tag type</th> -->
						        <th data-field="roofType" data-sortable="true" >Tag type</th>
						        <th data-field="width" data-sortable="true">Bredde</th>
						        <th data-field="length"  data-sortable="true">Længde</th>
						        <th data-field="height" data-sortable="true">Højde</th>
                                                        <th data-field="userId" data-sortable="true">UserID</th>
                                                        <th data-field="info" data-sortable="false"> </th>
						    </tr>
						    </thead>
                                                    <tbody>
                                                    <% List<Order> theordre = om.getUserOrder();
                                                        for (Order order : theordre) {%>
                                                    <tr>
                                                        <td> <%= order.getRoofType() %></td>
                                                        <td> <%= order.getWidth() %></td>
                                                        <td> <%= order.getLength() %></td>
                                                        <td> <%= order.getHeight() %></td>
                                                        <td> <%= order.getUser_idUser()%></td>                                                         
                                                        <td> <button type="button" class="btn btn-info" >Info</button> </td>
                                                    </tr>
                                                    <% }
                                                        %>
                                                    </tbody>
                                                </table>
					</div>
				</div>
			</div>
		</div><!--/.row-->
                
        </form>
		
		
		
	</div><!--/.main-->

	<script src="../js/jquery-1.11.1.min.js"></script>
	<script src="../js/bootstrap.min.js"></script>
	<script src="../js/chart.min.js"></script>
	<script src="../js/chart-data.js"></script>
	<script src="../js/easypiechart.js"></script>
	<script src="../js/easypiechart-data.js"></script>
	<script src="../js/bootstrap-datepicker.js"></script>
	<script src="../js/bootstrap-table.js"></script>
		
</body>

</html>
