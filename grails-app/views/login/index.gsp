<html>
	<head>
		<title>Welcome to Grails</title>
		<meta name="layout" content="main" />
	</head>
	<body>
		<div id="login">
			<g:if test="${session.user}">	
				Logged in as <b>${session.user}</b>
				 | <g:link action="logout">Logout</g:link>
			</g:if>
			<g:else>	
				<g:form controller="login" action="login">

				  <div class="form-group">
					<label for="Username">Username:</label>
					<input type="Username" class="form-control" name="username"/>
				  </div>
				  <div class="form-group">
					<label for="password">password:</label>
					<input type="password" class="form-control" name="password"/>
				  </div>

				<input type="submit" class="btn btn-default" value="Login"/>


				</g:form>

			</g:else>
		</div>
	</body>
</html>