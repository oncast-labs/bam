<body>
	<h1>Usuarios</h1> 
	
	<c:if test="${not empty sucess}">
		<br/> ${sucess} <br/>
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
			<th>Email
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
				<td>${user.enabled}</td>
				<td><a href="${pageContext.request.contextPath}/users/${user.id}/edit">edit</a></td>
				<td>
					<form action="${pageContext.request.contextPath}/users/${user.id}" method="post">
						<input type="hidden" name="_method" value="delete"/>
						<button type="submit" onclick="return confirm('Are you sure?')" class="btn btn-danger">destroy</button>
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>