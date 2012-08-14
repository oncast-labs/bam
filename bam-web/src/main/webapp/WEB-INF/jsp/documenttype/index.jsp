<body>
	<h1>Tipos de documento</h1> 
	
	<c:if test="${not empty sucess}">
		<div class="alert alert-success">
	        <button type="button" class="close" data-dismiss="alert">x</button>
	        <c:out value="${sucess}"/>
		</div>
	</c:if>	
	
	<br/>
	
	<form action="${pageContext.request.contextPath}/documenttypes/new" method="get">
		<button type="submit" class="btn btn-success"><c:out value="Novo Tipo de Documento"/></button>
	</form>
	
	<br/>

	<table class="table table-striped ">
		<tr>
			<th>#</th>
			<th>Descrição</th>
			<th>Abreviatura</th>
		</tr>

		<c:forEach items="${documentTypeList}" var="documentType">
			<tr>
				<td>${documentType.id}</td>
				<td>${documentType.name}</td>
				<td>${documentType.shortName}</td>
			</tr>
		</c:forEach>
	</table>
</body>