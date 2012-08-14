<form action="<c:url value="/documenttypes"/>" method="post" class="form-horizontal">
  
	<c:if test="${not empty documentType.id}">
		<input type="hidden" name="documentType.id" value="${documentType.id}"/>
		<input type="hidden" name="_method" value="put"/>
	</c:if>
	
	<fieldset>
		<div class="control-group">
			<label class="control-label" for="name">Descrição</label>
			<div class="controls">
				<input type="text" name="documentType.name" value="${documentType.name}" id="name" class="input-xlarge"/>
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
		
		<fieldset>
		<div class="control-group">
			<label class="control-label" for="shortName">Abreviatura</label>
			<div class="controls">
				<input type="text" name="documentType.shortName" value="${documentType.shortName}" id="shortName" class="input-xlarge"/>
			</div>
			<vraptor:hasErrors category="shortName">
				<div>
					<div class="alert alert-error">
			        	<button type="button" class="close" data-dismiss="alert">x</button>
			        	<vraptor:showErrors category="shortName" />
			      	</div>
			     </div>
		    </vraptor:hasErrors>
		</div>
		
		<div class="form-actions">
			<button type="submit" class="btn btn-success">Enviar</button>
			<a class="btn" data-toggle="modal" href="<c:url value="/documenttypes"/>" >Voltar</a>
		</div>
	</fieldset>
</form>