<form action="<c:url value="/companies"/>" method="post" class="form-horizontal">
  
	<c:if test="${not empty company.id}">
		<input type="hidden" name="company.id" value="${company.id}"/>
		<input type="hidden" name="_method" value="put"/>
	</c:if>
	
	<fieldset>
		<div class="control-group">
			<label class="control-label" for="name">Nome:</label>
			<div class="controls">
				<input type="text" name="company.name" value="${company.name}" id="name" class="input-xlarge"/>
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
			<label class="control-label" for="cnpj">CNPJ</label>
			<div class="controls">
				<input type="text" name="company.cnpj" value="${company.cnpj}" id="cnpj" class="input-xlarge"/>
			</div>
			<vraptor:hasErrors category="cnpj">
				<div>
					<div class="alert alert-error">
			        	<button type="button" class="close" data-dismiss="alert">x</button>
			        	<vraptor:showErrors category="cnpj" />
			      	</div>
			     </div>
		    </vraptor:hasErrors>
		</div>
		
		<div class="form-actions">
			<button type="submit" class="btn btn-success">Enviar</button>
			<a class="btn" data-toggle="modal" href="<c:url value="/companies"/>" >Voltar</a>
		</div>
	</fieldset>
</form>