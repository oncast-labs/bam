<form action="${pageContext.request.contextPath}/documents" method="post" class="form-horizontal" 
	  enctype="multipart/form-data" class="form-horizontal">
  
	<fieldset>
		<div class="control-group">
            <label class="control-label" for="fileInput">Upload de Documento</label>
            <div class="controls">
              <input class="input-file" id="fileInput" type="file" name="uploadedFile">
            </div>
			<c:if test="${not empty fail}">
				<div>
					<div class="alert alert-error">
			        	<button type="button" class="close" data-dismiss="alert">x</button>
			        	${fail}
			      	</div>
			     </div>
			</c:if>
		</div>
	</fieldset>
	
	
	<div class="form-actions">
		<button type="submit" class="btn btn-success">Enviar</button>
		<a class="btn" data-toggle="modal" href="${pageContext.request.contextPath}/documents" >Voltar</a>
	</div>
</form>