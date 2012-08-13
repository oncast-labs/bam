<form action="<c:url value="/companies"/>" method="post" class="form-horizontal">
  
	<c:if test="${not empty company.id}">
		<input type="hidden" name="company.id" value="${company.id}"/>
		<input type="hidden" name="_method" value="put"/>
	</c:if>
	
	<fieldset>
		<div class="control-group">
			<label class="control-label" for="name">Nome</label>
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
		
		<div class="control-group">
			<label class="control-label" for="city">Cidade</label>
			<div class="controls">
				<input type="text" name="company.address.city" value="${company.address.city}" id="city" class="input-xlarge"/>
			</div>
			<vraptor:hasErrors category="address.city">
				<div>
					<div class="alert alert-error">
			        	<button type="button" class="close" data-dismiss="alert">x</button>
			        	<vraptor:showErrors category="address.city" />
			      	</div>
			     </div>
		    </vraptor:hasErrors>
		</div>
		
		<div class="control-group">
			<label class="control-label" for="neighborhood">Bairro</label>
			<div class="controls">
				<input type="text" name="company.address.neighborhood" value="${company.address.neighborhood}" id="neighborhood" class="input-xlarge"/>
			</div>
			<vraptor:hasErrors category="address.neighborhood">
				<div>
					<div class="alert alert-error">
			        	<button type="button" class="close" data-dismiss="alert">x</button>
			        	<vraptor:showErrors category="address.neighborhood" />
			      	</div>
			     </div>
		    </vraptor:hasErrors>
		</div>
		
		<div class="control-group">
			<label class="control-label" for="street">Rua</label>
			<div class="controls">
				<input type="text" name="company.address.street" value="${company.address.street}" id="street" class="input-xlarge"/>
			</div>
			<vraptor:hasErrors category="address.street">
				<div>
					<div class="alert alert-error">
			        	<button type="button" class="close" data-dismiss="alert">x</button>
			        	<vraptor:showErrors category="address.street" />
			      	</div>
			     </div>
		    </vraptor:hasErrors>
		</div>
		
		<div class="control-group">
			<label class="control-label" for="number">Número</label>
			<div class="controls">
				<input type="text" name="company.address.number" value="${company.address.number}" id="number" class="input-xlarge"/>
			</div>
			<vraptor:hasErrors category="address.number">
				<div>
					<div class="alert alert-error">
			        	<button type="button" class="close" data-dismiss="alert">x</button>
			        	<vraptor:showErrors category="address.number" />
			      	</div>
			     </div>
		    </vraptor:hasErrors>
		</div>
		
		<div class="control-group">
			<label class="control-label" for="zipcode">CEP</label>
			<div class="controls">
				<input type="text" name="company.address.zipcode" value="${company.address.zipcode}" id="zipcode" class="input-xlarge"/>
			</div>
			<vraptor:hasErrors category="address.zipcode">
				<div>
					<div class="alert alert-error">
			        	<button type="button" class="close" data-dismiss="alert">x</button>
			        	<vraptor:showErrors category="address.zipcode" />
			      	</div>
			     </div>
		    </vraptor:hasErrors>
		</div>
		
		<div class="control-group">
			<label class="control-label" for="phoneNumber">Telefone</label>
			<div class="controls">
				<input type="text" name="company.contacts[0].phoneNumber" value="${company.contacts[0].phoneNumber}" id="phoneNumber" class="input-xlarge"/>
			</div>
			<vraptor:hasErrors category="contacts[0].phoneNumber">
				<div>
					<div class="alert alert-error">
			        	<button type="button" class="close" data-dismiss="alert">x</button>
			        	<vraptor:showErrors category="contacts[0].phoneNumber" />
			      	</div>
			     </div>
		    </vraptor:hasErrors>
		</div>
		
		<div class="control-group">
			<label class="control-label" for="contactName">Falar Com</label>
			<div class="controls">
				<input type="text" name="company.contacts[0].contactName" value="${company.contacts[0].contactName}" id="contactName" class="input-xlarge"/>
			</div>
			<vraptor:hasErrors category="contacts[0].contactName">
				<div>
					<div class="alert alert-error">
			        	<button type="button" class="close" data-dismiss="alert">x</button>
			        	<vraptor:showErrors category="contacts[0].contactName" />
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