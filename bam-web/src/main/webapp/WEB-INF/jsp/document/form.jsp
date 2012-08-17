<form action="${pageContext.request.contextPath}/documents"
	method="post" class="form-horizontal" enctype="multipart/form-data"
	class="form-horizontal">

	<fieldset>
		<div class="control-group">
			<label class="control-label" for="fileInput">Upload de
				Documento</label>
			<div class="controls" id="upload"></div>
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
		<a class="btn" data-toggle="modal"
			href="${pageContext.request.contextPath}/documents">Voltar</a>
	</div>
</form>

<script>
	function createUploader() {
		var uploader = new qq.FileUploader({
			element : document.getElementById('upload'),
			action : '${pageContext.request.contextPath}/documents',
			debug : true,
			allowedExtensions : [ 'pdf' ],
			showMessage: function(message){ 
				alert("O arquivo selecionado não é válido, selecione apenas documentos pdf."); 
			},
			onSubmit : function(id, fileName) {
				uploader.setParams({
					fileName: fileName
				});
			},
		});
	}
	
	window.onload = createUploader;
</script>
