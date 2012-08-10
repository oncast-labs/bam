<body>
	<h1>Empresas</h1> 
	
	<c:if test="${not empty sucess}">
		<div class="alert alert-success">
	        <button type="button" class="close" data-dismiss="alert">x</button>
	        <c:out value="${sucess}"/>
		</div>
	</c:if>	
	
	<br/>
	
	<form action="${pageContext.request.contextPath}/companies/new" method="get">
		<button type="submit" class="btn btn-success"><c:out value="Nova Empresa"/></button>
	</form>
	
	<br/>

	<table class="table table-striped ">
		<tr>
			<th>#</th>
			<th>Nome</th>
			<th>CNPJ</th>
		</tr>

		<c:forEach items="${companyList}" var="company">
			<tr>
				<td>${company.id}</td>
				<td>${company.name}</td>
				<td>${company.cnpj}</td>
			</tr>
		</c:forEach>
	</table>
</body>