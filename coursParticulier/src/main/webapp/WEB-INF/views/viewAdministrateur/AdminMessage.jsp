<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<input type="button" value="liste eleves"
		onclick="self.location.href='http://localhost:8080/security/admin/listeEleve'" />
	<input type="button" value="liste prof"
		onclick="self.location.href='http://localhost:8080/security/admin/listeProf'" />
	<input type="button" value="Matier"
		onclick="self.location.href='http://localhost:8080/security/admin/matier'" />
	<input type="button" value="message"
		onclick="self.location.href='http://localhost:8080/security/admin/message'" />
	<input type="button" value="Déconnecter"
		onclick="self.location.href='http://localhost:8080/security/admin/deconnecter'" />

	<h1>AdminMessage</h1>


</body>
</html>