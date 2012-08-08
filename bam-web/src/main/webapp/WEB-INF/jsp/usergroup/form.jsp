<form action="<c:url value="/usergroups"/>" method="post" class="form-horizontal">
  
	<c:if test="${not empty userGroup.id}">
		<input type="hidden" name="userGroup.id" value="${userGroup.id}"/>
		<input type="hidden" name="_method" value="put"/>
	</c:if>
	
	<fieldset>
		<div class="control-group">
			<label class="control-label" for="name">Nome:</label>
			<div class="controls">
				<input type="text" name="userGroup.name" value="${userGroup.name}" id="name" class="input-xlarge"/>
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
		
		<div class="form-actions">
			<button type="submit" class="btn btn-success">Enviar</button>
			<a class="btn" data-toggle="modal" href="<c:url value="/usergroups"/>" >Voltar</a>
		</div>
	</fieldset>
</form>