<body>
	<h1>Grupo de usuários</h1> 
	
	<c:if test="${not empty sucess}">
		<div class="alert alert-success">
	        <button type="button" class="close" data-dismiss="alert">x</button>
	        <c:out value="${sucess}"/>
		</div>
	</c:if>	
	
	<br/>
	
	<form action="${pageContext.request.contextPath}/usergroups/new" method="get">
		<button type="submit" class="btn btn-success"><c:out value="Novo Grupo de Usuario"/></button>
	</form>
	
	<br/>

	<table class="table table-striped ">
		<tr>
			<th>#</th>
			<th>Nome</th>
			<th>Administrador</th>
			<th>Ativo?</th>
		</tr>

		<c:forEach items="${userGroupList}" var="userGroup">
			<tr>
				<td>${userGroup.id}</td>
				<td>${userGroup.name}</td>
				<td>${userGroup.administrator.name}</td>
				<td>
					<c:choose>
						<c:when test="${userGroup.enabled}">
							<img src="${pageContext.request.contextPath}/images/glyphicons-ok.png" />
						</c:when>
						<c:when test="${not userGroup.enabled}">
							<img src="${pageContext.request.contextPath}/images/glyphicons-remove.png" />
						</c:when>
					</c:choose>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>