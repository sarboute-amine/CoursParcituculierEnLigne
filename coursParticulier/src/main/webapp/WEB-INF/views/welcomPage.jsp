<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Cours Particulier</title>

<!-- Bootstrap -->
<link href="/resources/style/css/bootstrap.min.css" rel="stylesheet">


</head>
<body>

<jsp:include page="Entete.jsp" />

<div class="jumbotron">
	<div class="container">

		<h1>Hello, world!</h1>

		<input type="button" value="Eleve"
			onclick="self.location.href='http://localhost:8080/security/Eleve/index'" />
		<input type="button" value="Professeurr"
			onclick="self.location.href='http://localhost:8080/security/prof/index'" />
		<input type="button" value="Admin"
			onclick="self.location.href='http://localhost:8080/security/admin/index'" />

	

	</div>
	</div>
		<script
			src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>

		<script src="resources/style/js/bootstrap.min.js"></script>
</body>
</html>