<body>
	<h1>Perfil de Assinatura</h1> 
	
	<c:if test="${not empty sucess}">
		<div class="alert alert-success">
	        <button type="button" class="close" data-dismiss="alert">x</button>
	        <c:out value="${sucess}"/>
		</div>
	</c:if>	
	
	<br/>
	
	<form action="${pageContext.request.contextPath}/signatureprofiles/new" method="get">
		<button type="submit" class="btn btn-success"><c:out value="Novo Perfil de Assinatura"/></button>
	</form>
	
	<br/>

	<table class="table table-striped ">
		<tr>
			<th>#</th>
			<th>Nome</th>
			<th>Assinaturas por Página</th>
			<th>Ativo?</th>
		</tr>

		<c:forEach items="${signatureProfileList}" var="signatureProfile">
			<tr>
				<td>${signatureProfile.id}</td>
				<td>${signatureProfile.name}</td>
				<td>${signatureProfile.maxSignaturesPerPage}</td>
				<td>
					<c:choose>
						<c:when test="${signatureProfile.enabled}">
							<img src="${pageContext.request.contextPath}/images/glyphicons-ok.png" />
						</c:when>
						<c:when test="${not signatureProfile.enabled}">
							<img src="${pageContext.request.contextPath}/images/glyphicons-remove.png" />
						</c:when>
					</c:choose>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>