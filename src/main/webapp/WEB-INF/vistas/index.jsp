<%@include file='../../includes/head.jsp'%>
<body>
	<header class='page-header'>
		<div class="container-fluid bg-1">
			<img src="img/logo.png" class="img-responsive"
				style="display: inline;" alt="Logo" width="150" height="150">
			<h1 class="margin" style="display: inline;">Gestion PyME</h1>
		</div>
	</header>
	<div class="panel-group">
		<div class="panel panel-default">
			<div class="panel-heading">Ingreso de Usuario</div>
			<div class="panel-body">
				<form class="form-horizontal" action="login" method="POST">
					<div class="form-group">
						<label class="control-label col-sm-2" for="email">Email:</label>
						<div class="col-sm-4">
							<input type="email" class="form-control" id="email"
								placeholder="Enter email" name="email">
						</div>
					</div>
					<div class="form-group">
						<label class="control-label col-sm-2" for="pwd">Password:</label>
						<div class="col-sm-4">
							<input type="password" class="form-control" id="pwd"
								placeholder="Enter password" name="pwd">
						</div>
					</div>
					<div class="form-group">
						<div class="col-sm-offset-2 col-sm-10">
							<button type="submit" class="btn btn-default">Enviar</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>