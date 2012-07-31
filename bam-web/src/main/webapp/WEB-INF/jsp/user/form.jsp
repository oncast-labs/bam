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
		Nome:<br />
		<input type="text" name="user.name" value="${user.name}"/>
	</div>

	<div class="field">
		email:<br />
		<input type="text" name="user.email" value="${user.email}"/>
	</div>
	
	<div class="field">
		CPF:<br />
		<input type="text" name="user.cpf" value="${user.cpf}"/>
	</div>
	
	<div class="field">
		Senha:<br />
		<input type="password" name="user.password" value="${user.password}"/>
	</div>
	
	<div class="actions">
		<button type="submit" class="btn btn-success">Send</button> &nbsp;&nbsp;
		<c:if test="${not empty user.id}">
			<a class="btn" data-toggle="modal" href="javascript:openWindow()" >Assinatura</a>
		</c:if>
	</div>
</form>

<a href="${pageContext.request.contextPath}/users">Back</a>

<script>
function openWindow() {
	var left = (screen.width/2)-(550/2);
	var top = (screen.height/2)-(600/2);
	window.open ("http://testserver:50200/anonymous_enroll/Enroll.aspx?BioUser_ID=1010&profileName=01&Type=Dynamic ","sigWindow","left=" + left + ",top=" + top + ",location=no,resizable=no,titlebar=no,width=550,height=600");
}
</script>