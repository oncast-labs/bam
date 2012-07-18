<head>
	<title>User [show]</title>
</head>
<body>
	<p>
		<b>Username:</b>
		${user.username}
	</p>
	<p>
		<b>Password:</b>
		${user.password}
	</p>
	<p>
		<b>Enabled:</b>
		${user.enabled}
	</p>

	<a href="${pageContext.request.contextPath}/users/${user.id}/edit">Edit</a>
	<a href="${pageContext.request.contextPath}/users">Back</a>
</body>