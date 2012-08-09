<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>

<!DOCTYPE html>

<html lang="en">
  <head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title><decorator:title default="Banco de Assinatura Manuscrita"/></title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/stylesheets/application.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/stylesheets/bootstrap-responsive.css"/>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/stylesheets/bootstrap.css"/>
    <decorator:head/>
  </head>
<body data-spy="scroll" data-target=".subnav" data-offset="50" data-twttr-rendered="true">
  	<div class="navbar">
  		<div class="navbar-inner">
  			<div class="container">
  				<button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
		            <span class="icon-bar"></span>
		            <span class="icon-bar"></span>
		            <span class="icon-bar"></span>
	          	</button>
  				<div class="nav-collapse collapse">
	  				<ul class="nav">
					 	<li>
					    	<a href="${pageContext.request.contextPath}/">Home</a>
					  	</li>
					  	<li>
					  		<a href="${pageContext.request.contextPath}/users">Usuários</a>
					  	</li>
					  	<li>
					  		<a href="${pageContext.request.contextPath}/documents">Documentos</a>
					  	</li>
					  	<li>
					  		<a href="${pageContext.request.contextPath}/usergroups">Grupos de Usuário</a>
					  	</li>
					  	<li>
					  		<a href="${pageContext.request.contextPath}/signatureprofiles">Perfis de Assinatura</a>
					  	</li>
					</ul>
				</div>
			</div>
  		</div>
  	</div>
  	<div class="container">
    	<decorator:body/>
    </div>
    <script type="text/javascript" src="${pageContext.request.contextPath}/javascripts/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/javascripts/application.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/javascripts/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/javascripts/bootstrap-modal.js"></script>
  </body>
</html>
