<%@page import="control.OrderController"%>
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
        OrderController oc = new OrderController();
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
		<form role="search">
			<div class="form-group">
				<input type="text" class="form-control" placeholder="Search">
			</div>
		</form>
		<ul class="nav menu">
                        <li><a href="adminIndex.jsp"><svg class="glyph stroked dashboard-dial"><use xlink:href="#stroked-dashboard-dial"></use></svg> Forside</a></li>
			<li><a href="adminUser.jsp"><svg class="glyph stroked male-user"><use xlink:href="#stroked-male-user"></use></svg>Kunder</a></li>
                        <li class="active"><a href="#"><svg class="glyph stroked table"><use xlink:href="#stroked-table"></use></svg>Ordre</a></li>
                    
			<li role="presentation" class="divider"></li>
		</ul>
		<div class="attribution">By <a href="http://www.Rasmussen-Solutions.dk/">Emil Rasmussen</a></div>
	</div><!--/.sidebar-->
		
	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">			
		<div class="row">
			
		</div><!--/.row-->
		
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Ordre</h1>
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
                                                        <th>Ordre ID</th>
                                                        <th>Tag type</th>
						        <th>Bredde</th>
						        <th>L�ngde</th>
						        <th>H�jde</th>
                                                        <th>Bruger ID</th>
						    </tr>
                                                </thead>
                                                    <tbody>
                                                        <%
                        List<Order> theorder = oc.getOrders();
                        for (Order order : theorder) {
                    %>
                    <tr>
                        <td> <%=order.getIdOrder()%></td>
                        <td> <%=order.getRoofType()%></td>
                        <td> <%=order.getWidth()%></td>
                        <td> <%=order.getLength()%></td>
                        <td> <%=order.getHeight()%></td>
                        <td> <%=order.getUser_idUser()%></td>
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
