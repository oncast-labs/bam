<body>
	<h1>Usuarios</h1> 
	
	<c:if test="${not empty sucess}">
		<div class="alert alert-success">
	        <button type="button" class="close" data-dismiss="alert">x</button>
	        ${sucess}
		</div>
	</c:if>	
	
	<br/>
	
	<form action="${pageContext.request.contextPath}/users/new" method="get">
		<button type="submit" class="btn btn-success"><c:out value="Novo Usuario"/></button>
	</form>
	
	<br/>

	<table class="table table-striped ">
		<tr>
			<th>#</th>
			<th>Nome</th>
			<th>CPF</th>
			<th>Email</th>
			<th>Ativo?</th>
			<th></th>
			<th></th>
		</tr>

		<c:forEach items="${userList}" var="user">
			<tr>
				<td>${user.id}</td>
				<td>${user.name}</td>
				<td>${user.cpf}</td>
				<td>${user.email}</td>
				<td>
					<c:choose>
						<c:when test="${user.enabled}">
							<img src="${pageContext.request.contextPath}/images/glyphicons-ok.png" />
						</c:when>
						<c:when test="${not user.enabled}">
							<img src="${pageContext.request.contextPath}/images/glyphicons-remove.png" />
						</c:when>
					</c:choose>
				</td>
				<td><a href="${pageContext.request.contextPath}/users/${user.id}/edit">Editar</a></td>
				<td>
					<form action="${pageContext.request.contextPath}/users/${user.id}" method="post">
						<input type="hidden" name="_method" value="delete"/>
						<button type="submit" onclick="return confirm('Deseja deletar o usuario selecionado?')" class="btn btn-danger">Apagar</button>
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>