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



		
  <div class="col-sm-2 band-danger ">
    <div class="sidebar-nav">
      <div class="navbar navbar-default" role="navigation">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <span class="visible-xs navbar-brand">Sidebar menu</span>
        </div>
        <div class="navbar-collapse collapse sidebar-navbar-collapse" style="background-color: #0ff;">
          <ul class="nav navbar-nav">
            
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown" >Messagerie (0) <b class="caret"></b></a>
              <ul class="dropdown-menu">
                <li><a href="http://localhost:8080/security/admin/message">Envoyer nouveau</a></li>
                <li><a href="http://localhost:8080/security/admin/message">Boite de reception</a></li>               
              </ul>
            </li>
            <li class="dropdown">
              <a href="1" class="dropdown-toggle" data-toggle="dropdown"> professeurs <b class="caret"></b></a>
              <ul class="dropdown-menu">
              <li><a href="http://localhost:8080/security/admin/listeProf">Liste prof</a></li>
                <li><a href="http://localhost:8080/security/admin/AjouterProf">Ajouter un prof</a></li>
                <li><a href="http://localhost:8080/security/admin/listeProf">mod /supp</a></li>
               
              </ul>
            </li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Mes Eleves <b class="caret"></b></a>
              <ul class="dropdown-menu">
              <li><a href="http://localhost:8080/security/admin/listeEleve">Liste Eleves</a></li>
                <li><a href="http://localhost:8080/security/admin/listeEleve">mod /supp</a></li>
               
              </ul>
            </li>
            
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">Matières <b class="caret"></b></a>
              <ul class="dropdown-menu">
                <li><a href="http://localhost:8080/security/admin/matier">crée une matière</a></li>
                <li><a href="http://localhost:8080/security/admin/matier">Liste matières</a></li>
               
              </ul>
            </li>
           
          </ul>
        </div><!--/.nav-collapse -->
      </div>
    </div>
  </div>
</body>
</html>