 <c:if test="${param.error eq 'true'}">
	<div>
		<div class="alert alert-error">
        	<button type="button" class="close" data-dismiss="alert">x</button>
        	<c:out value="Usuário e/ou senha inválido(s)"/>
      	</div>
     </div>
 </c:if>
<form name="f" action="<c:url value="/j_spring_security_check"/>" method="POST" class="form-horizontal">
	<fieldset>
		<div class="control-group">
			<label class="control-label" for="username">Nome</label>
			<div class="controls">
				<input type="text" name="j_username" id="username" class="input-xlarge"/>
			</div>
		</div>
		
		<div class="control-group">
			<label class="control-label" for="password">Senha</label>
			<div class="controls">
				<input type="password" name="j_password" id="password" class="input-xlarge"/>
			</div>
		</div>
	</fieldset>
	
	
	<div class="form-actions">
		<button type="submit" name="submit" class="btn btn-success">Login</button>
	</div>
</form>