<form action="${pageContext.request.contextPath}/users" method="post" class="form-horizontal">
  
	<c:if test="${not empty user.id}">
		<input type="hidden" name="user.id" value="${user.id}"/>
		<input type="hidden" name="_method" value="put"/>
	</c:if>
	
	<fieldset>
	
		<div class="control-group">
			<label class="control-label" for="name">Nome:</label>
			<div class="controls">
				<input type="text" name="user.name" value="${user.name}" id="name" class="input-xlarge"/>
			</div>
			<vraptor:hasErrors category="name">
				<div>
					<div class="alert alert-error">
			        	<button type="button" class="close" data-dismiss="alert">x</button>
			        	<vraptor:showErrors category="name" />
			      	</div>
			     </div>
		    </vraptor:hasErrors>
		</div>
		
		<div class="control-group">
			<label class="control-label" for="email">Email:</label>
			<div class="controls">
				<input type="text" name="user.email" value="${user.email}" id="email" class="input-xlarge"/>
			</div>
			<vraptor:hasErrors category="email">
				<div>
					<div class="alert alert-error">
			        	<button type="button" class="close" data-dismiss="alert">x</button>
			        	<vraptor:showErrors category="email" />
			      	</div>
			     </div>
		    </vraptor:hasErrors>
		</div>
		
		<div class="control-group">
			<label class="control-label" for="cpf">CPF:</label>
			<div class="controls">
				<input type="text" name="user.cpf" value="${user.cpf}" id="cpf" class="input-xlarge"/>
			</div>
			<vraptor:hasErrors category="cpf">
				<div>
					<div class="alert alert-error">
			        	<button type="button" class="close" data-dismiss="alert">x</button>
			        	<vraptor:showErrors category="cpf" />
			      	</div>
			     </div>
		    </vraptor:hasErrors>
		</div>
		
		<div class="control-group">
			<label class="control-label" for="password">Senha:</label>
			<div class="controls">
				<input type="password" name="user.password" value="${user.password}" id="password" class="input-xlarge"/>
			</div>
			<vraptor:hasErrors category="password">
				<div>
					<div class="alert alert-error">
			        	<button type="button" class="close" data-dismiss="alert">x</button>
			        	<vraptor:showErrors category="password" />
			      	</div>
			     </div>
		    </vraptor:hasErrors>
		</div>
		
		<div class="form-actions">
			<button type="submit" class="btn btn-success">Enviar</button>
			<a class="btn" data-toggle="modal" href="${pageContext.request.contextPath}/users" >Voltar</a>
			<c:if test="${not empty user.id}">
				<a class="btn" data-toggle="modal" onclick="enroll(${user.id});" >Assinatura</a>
			</c:if>
		</div>
	</fieldset>
</form>

<script>
function enroll(userId) {
	var left = (screen.width/2)-(550/2);
	var top = (screen.height/2)-(600/2);
	window.open ("http://testserver:50200/anonymous_enroll/Enroll.aspx?BioUser_ID=" + userId + "&profileName=01&Type=Dynamic ","sigWindow","left=" + left + ",top=" + top + ",location=no,resizable=no,titlebar=no,width=550,height=600");
}
</script>