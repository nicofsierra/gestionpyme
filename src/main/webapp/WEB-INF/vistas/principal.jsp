<%@include file='../../includes/head.jsp'%>
<body>
	<c:set var="usuario" value="${usuario}" scope="session" />
	<c:if test="${empty usuario}">
		<c:redirect url="index" />
	</c:if>
	<c:if test="${empty empleado.nombre}">
		<c:redirect url="index" />
	</c:if>
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
						<li class="active"><a href="#">Inicio</a></li>
						<li class="dropdown"><a class="dropdown-toggle"
							data-toggle="dropdown" href="clientes">Clientes<span
								class="caret"></span></a>
							<ul class="dropdown-menu">
								<li><a href="alta-clientes">Alta Clientes</a></li>
								<li><a href="#">Modificar Clientes</a></li>
								<li><a href="#">Baja Clientes</a></li>
							</ul></li>
						<li><a href="#">Facturas</a></li>
						<li><a href="logout">Salir</a></li>
					</ul>
				</div>
			</div>
		</nav>
	</header>
	<div class="panel-group">
		<div class="panel panel-default">
			<div class="panel-heading">
				Bienvenido,
				<c:if test="${not empty usuario.nombre}"> ${usuario.nombre}.</c:if>
			</div>
			<div class="panel-body">
				<c:if test="${not empty mensaje}">
					<div class="alert alert-info">
						<strong>${mensaje}</strong>
					</div>
				</c:if>
			</div>
		</div>
	</div>
</body>
</html>