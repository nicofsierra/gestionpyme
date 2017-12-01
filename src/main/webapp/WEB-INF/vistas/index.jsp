<%@include file='../../includes/head.jsp'%>
<body>
	<div class="text-center">
		<div class="well">
			<form:form action="login" method="POST">
				<label>E-Mail</label>
				<input type="email" name="email" path="email">
				<label>Contraseña</label>
				<input type="password" name="password" path="password">
				<button type="submit">Enviar</button>
			</form:form> 
			
		</div>
	</div>
</body>
</html>