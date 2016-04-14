<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="resources/style/css/bootstrap.min.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="EnteteAdmin.jsp" />

<jsp:include page="EnteteAdminMenu.jsp" />

  <div class="col-sm-9">
   
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
  </div>
  

</body>
</html>