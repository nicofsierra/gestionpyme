<%@include file='../../includes/head.jsp'%>
<body>
	<header class="page-header">
		<nav class="navbar navbar-inverse bg-primary">
			<div class='container-fluid'>
				<div class='navbar-header'>
					<a class='navbar-brand' href='#'>Gestion</a>
				</div>
				<ul class='nav navbar-nav'>
					<li class='active'><a href='#'>Home</a></li>
					<li><a href='sucursales'>Sucursales</a></li>
					<li><a href='listado-vehiculos'>Vehiculos</a></li>
					<li><a href='listado-accesorios'>Accesorios</a></li>
					<li class='disabled'><a href='#'>Servicios</a></li>
				</ul>
				<ul class='nav navbar-nav navbar-right'>
					<c:set var="usuario" value="${usuario}" scope="session" />
					<c:if test="${empty usuario.nombre}">
						<li><a href='registro-usuario'><span class='glyphicon glyphicon-user'></span>&nbsp;Registrarse</a></li>
						<li><a href='login'><span class='glyphicon glyphicon-log-in'></span>&nbsp;Login</a></li>
					</c:if>
					<c:if test="${not empty usuario.nombre}">
						<li style="color: #9d9d9d; padding-top: 1em;">
								Bienvenido, ${usuario.nombre}.
						</li>
						<li><a href='logout'><span class='glyphicon glyphicon-log-out'></span>&nbsp;Logout</a></li>
					</c:if>
				</ul>
		</nav>	
	</header>
	<main>
	</main>
</body>
</html>