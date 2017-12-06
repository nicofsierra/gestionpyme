<%@include file='../../includes/head.jsp'%>
<body>
	<header class='page-header'>
		<div class="container-fluid bg-1">
			<img src="img/logo.png" class="img-responsive"
				style="display: inline;" alt="Logo" width="80" height="80">
			<h1 class="margin" style="display: inline;">Gestion PyME</h1>
		</div>
		<br>
		<nav>
			<div class="navbar navbar-default navbar-custom">
				<div class="container-fluid">
					<div class="navbar-header">
						<a class="navbar-brand" href="#">GestionPyME</a>
					</div>
					<ul class="nav navbar-nav">
						<li><a href="principal">Inicio</a></li>
						<li class="dropdown"><a class="dropdown-toggle"
							data-toggle="dropdown" href="clientes">Clientes<span
								class="caret"></span></a></li>
						<ul class="dropdown-menu">
							<li class="active"><a href="#">Alta Clientes</a></li>
							<li><a href="#">Modificar Clientes</a></li>
							<li><a href="#">Baja Clientes</a></li>
						</ul>
						<li><a href="#">Facturas</a></li>
						<li><a href="logout">Salir</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</header>
	<div class="panel-group">
		<div class="panel panel-default">
			<div class="panel-heading">Clientes</div>
			<div class="panel-body">
				<form:form class="form-horizontal" action="guardar-clientes" method="POST" modelAttribute="cliente">
					<div class="form-group">
						<label class="control-label col-sm-2" for="nombre">Nombre:</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" id="nombre"
								placeholder="Ingrese Nombre . . ." name="nombre" path="nombre">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="cuit">CUIT:</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" id="cuit"
								placeholder="Cuit" name="cuit" path="cuit">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="pwd">CUIT:</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" id="cuit"
								placeholder="Cuit" name="cuit" path="cuit">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="pwd">CUIT:</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" id="cuit"
								placeholder="Cuit" name="cuit" path="cuit">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="pwd">CUIT:</label>
						<div class="col-sm-4">
							<input type="text" class="form-control" id="cuit"
								placeholder="Cuit" name="cuit" path="cuit">
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-default">Guardar</button>
						</div>
					</div>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>