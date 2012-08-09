<form action="<c:url value="/signatureprofiles"/>" method="post" class="form-horizontal">
  
	<c:if test="${not empty signatureProfile.id}">
		<input type="hidden" name="signatureProfile.id" value="${signatureProfile.id}"/>
		<input type="hidden" name="_method" value="put"/>
	</c:if>
	
	<fieldset>
		<div class="control-group">
			<label class="control-label" for="name">Nome:</label>
			<div class="controls">
				<input type="text" name="signatureProfile.name" value="${signatureProfile.name}" id="name" class="input-xlarge"/>
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
			<label class="control-label" for="maxSignaturesPerPage">Número máximo de assinaturas por página:</label>
			<div class="controls">
				<input type="text" name="signatureProfile.maxSignaturesPerPage" value="${signatureProfile.maxSignaturesPerPage}" id="maxSignaturesPerPage" class="input-xlarge"/>
			</div>
			<vraptor:hasErrors category="maxSignaturesPerPage">
				<div>
					<div class="alert alert-error">
			        	<button type="button" class="close" data-dismiss="alert">x</button>
			        	<vraptor:showErrors category="maxSignaturesPerPage" />
			      	</div>
			     </div>
		    </vraptor:hasErrors>
		</div>
		
		<div class="control-group">
			<label class="control-label" for="countersignAttached">Anexa rubrica?</label>
			<div class="controls">
				<select name="signatureProfile.countersignAttached" id="countersignAttached">
					<option value="true" selected="${signatureProfile.countersignAttached}">Sim</option>
					<option value="false" selected="${not signatureProfile.countersignAttached}">N�o</option>
				</select>
			</div>
		</div>
		
		<div class="control-group">
			<label class="control-label" for="signatureAttached">Anexa assinatura manuscrita?</label>
			<div class="controls">
				<select name="signatureProfile.signatureAttached" id="signatureAttached">
					<option value="true" selected="${signatureProfile.signatureAttached}">Sim</option>
					<option value="false" selected="${not signatureProfile.signatureAttached}">N�o</option>
				</select>
			</div>
		</div>
		
		<div class="control-group">
			<label class="control-label" for="timeStampAttached">Anexa carimbo de tempo?</label>
			<div class="controls">
				<select name="signatureProfile.timeStampAttached" id="timeStampAttached">
					<option value="true" selected="${signatureProfile.timeStampAttached}">Sim</option>
					<option value="false" selected="${not signatureProfile.timeStampAttached}">N�o</option>
				</select>
			</div>
		</div>
		
		<div class="control-group">
			<label class="control-label" for="certificateAttached">Anexa certificado digital?</label>
			<div class="controls">
				<select name="signatureProfile.certificateAttached" id="certificateAttached">
					<option value="true" selected="${signatureProfile.certificateAttached}">Sim</option>
					<option value="false" selected="${not signatureProfile.certificateAttached}">N�o</option>
				</select>
			</div>
		</div>
		
		<div class="control-group">
			<label class="control-label" for="stampAttached">Anexa selo?</label>
			<div class="controls">
				<select name="signatureProfile.stampAttached" id="stampAttached">
					<option value="true" selected="${signatureProfile.stampAttached}">Sim</option>
					<option value="false" selected="${not signatureProfile.stampAttached}">N�o</option>
				</select>
			</div>
		</div>
		
		<div class="form-actions">
			<button type="submit" class="btn btn-success">Enviar</button>
			<a class="btn" data-toggle="modal" href="<c:url value="/signatureprofiles"/>" >Voltar</a>
		</div>
	</fieldset>
</form>