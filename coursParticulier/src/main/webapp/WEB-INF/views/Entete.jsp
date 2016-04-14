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
<link href="resources/style/css/bootstrap.min.css" rel="stylesheet">


</head>
<body>

<nav class="navbar navbar-inverse ">

      <div class="container">
        <div class="navbar-header">
         <table ><tr><td>
        
         <a class="navbar-brand" href="http://localhost:8080/security/">Cours Particulier (projet10)</a>  
         </td><td>      
          <a  href="#" >   Actualité   </a>  &nbsp;    
          <a  href="#" >  nos offres   </a> &nbsp;       
          <a  href="#" >   Qui somme nous ?  </a>  
          </td>
           </tr> </table>
        </div>
        
        <div id="navbar" class="navbar-collapse collapse">
          <form class="navbar-form navbar-right"  method="POST" action="j_spring_security_check">
            <div class="form-group">
              <input type="text" placeholder="Email" name="j_username" class="form-control">
            </div>
            <div class="form-group">
              <input type="password" name="j_password" placeholder="Password" class="form-control">
            </div>
            <button type="submit" class="btn btn-success">Sign in</button>
            <a href="http://localhost:8080/security/Eleve/inscrire" class="btn btn-success">s'inscrire</a>
          </form>
        </div><!--/.navbar-collapse -->
      </div>
    
    </nav>
    


		<script
			src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>

		<script src="resources/style/js/bootstrap.min.js"></script>
</body>
</html>