<body>
	<h1>Documentos</h1>
	
	<c:if test="${not empty sucess}">
		<div class="alert alert-success">
	        <button type="button" class="close" data-dismiss="alert">x</button>
	        ${sucess}
		</div>
	</c:if>	
	
	<form action="${pageContext.request.contextPath}/documents/new" method="get">
		<button type="submit" class="btn btn-success"><c:out value="Novo Documento"/></button>
	</form>
	
	<br/>
	
	<table class="table table-striped ">
		<tr>
			<th>#</th>
			<th>Nome</th>
		</tr>

		<c:forEach items="${documentList}" var="document">
			<tr>
				<td>${document.id}
				<td>${document.name}</td>
			</tr>
		</c:forEach>
	</table>
</body>