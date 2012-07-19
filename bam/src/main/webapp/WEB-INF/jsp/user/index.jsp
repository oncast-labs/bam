<head>
	<title>User [index]</title>
</head>
<body>
	<h1>Listing Users</h1>

	<table class="table table-striped ">
		<tr>
			<th>Username</th>
			<th>Password</th>
			<th>Enabled</th>
			<th></th>
			<th></th>
			<th></th>
		</tr>

		<c:forEach items="${userList}" var="user">
			<tr>
				<td>${user.username}</td>
				<td>${user.password}</td>
				<td>${user.enabled}</td>
				<td><a href="${pageContext.request.contextPath}/users/${user.id}">show</a></td>
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

	<br />
	<form action="${pageContext.request.contextPath}/users/new" method="get">
		<button type="submit" class="btn btn-success"><c:out value="Novo Usuario"/></button>
	</form>
</body>