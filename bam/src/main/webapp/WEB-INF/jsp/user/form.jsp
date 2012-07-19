<c:if test="${not empty errors}">
	<c:forEach items="${errors}" var="error">
		${error.category} - ${error.message}<br />
	</c:forEach>
</c:if>

<form action="${pageContext.request.contextPath}/users" method="post">
  
	<c:if test="${not empty user.id}">
		<input type="hidden" name="user.id" value="${user.id}"/>
		<input type="hidden" name="_method" value="put"/>
	</c:if>

	<div class="field">
		Username:<br />
		<input type="text" name="user.username" value="${user.username}"/>
	</div>
	<div class="field">
		Password:<br />
		<input type="text" name="user.password" value="${user.password}"/>
	</div>
	<div class="field">
		Enabled:<br />
		<input type="text" name="user.enabled" value="${user.enabled}"/>
	</div>

<div class="actions">
	<button type="submit" class="btn btn-success">send</button>
	</div>
</form>

<a href="${pageContext.request.contextPath}/users">Back</a>
