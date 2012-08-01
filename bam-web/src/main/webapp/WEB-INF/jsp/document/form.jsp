<c:if test="${not empty errors}">
	<c:forEach items="${errors}" var="error">
		${error.category} - ${error.message}<br />
	</c:forEach>
</c:if>

<c:if test="${not empty fail}">
	${fail}
</c:if>

<form action="${pageContext.request.contextPath}/documents" method="post" class="form-horizontal" enctype="multipart/form-data">
  
	<fieldset>
	  <div class="control-group">
            <label class="control-label" for="fileInput">Upload de Documento</label>
            <div class="controls">
              <input class="input-file" id="fileInput" type="file" name="uploadedFile">
            </div>
          </div>
	</fieldset>
	
	
	<div class="actions">
		<button type="submit" class="btn btn-success">Enviar</button>
	</div>
</form>

<a href="${pageContext.request.contextPath}/users">Voltar</a>