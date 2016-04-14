
<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<html>
<head>
<link href="resources/style/css/bootstrap.min.css" rel="stylesheet">
<title>Inscription eleve</title>
</head>
<body>
<jsp:include page="Entete.jsp" />

<div class="container">


            <div class="row">
                <div class="col-lg-12">     
                    <div class="tableaudebord">
                        <div class="contact_container">
                            <div class="row">
                                <div class="col-lg-15 col-md-20">
                                    <h2>Inscription</h2>
                                
                                </div>
                            </div> 
                        </div>

	<div id="formEleve">
		
			<f:form modelAttribute="Eleve" class="form-horizontal" role="form" action="inscrirEleve" method="post">
				  <div class='row'>
				  
				  <div class="col-lg-6">
				  
				  <div class="form-group">
				    <label class="col-sm-4 control-label">nom :</label>	
					 <div class="col-sm-8">
					<f:input class="form-control" path="nom" />
					<f:errors class="form-control" path="nom"></f:errors>
					</div>
					</div>
					<div class="form-group">
					<label class="col-sm-4 control-label">prenom :</label>
					 <div class="col-sm-8">
					<f:input class="form-control" path="prenom" />
					<f:errors class="form-control" path="prenom"></f:errors>
					</div>
				  </div>
				  <div class="form-group">
					<label class="col-sm-4 control-label">date de naissance :</label>
					 <div class="col-sm-8">
					<f:input class="form-control" path="dateNaissance" />
					<f:errors class="form-control" path="dateNaissance"></f:errors>
			        </div>
			        </div>
			        <div class="form-group">
					<label class="col-sm-4 control-label">E mail :</label>
					 <div class="col-sm-8">
					<f:input class="form-control" path="email" />
				<f:errors class="form-control" path="email"></f:errors>
				</div>
				 </div>
				  <div class="form-group">
					<label class="col-sm-4 control-label">mot de passe:</label>
					 <div class="col-sm-8">
					<f:input class="form-control" path="motDePasse" />
					<f:errors class="form-control" path="motDePasse"></f:errors>
			       </div>
			       </div>
			       <div class="form-group">
					<label class="col-sm-4 control-label">niveau:</label>
					 <div class="col-sm-8">
					<f:select class="form-control" path="niveau">
							<f:option value="SIXem"></f:option>
							<f:option value="CINQem"></f:option>
							<f:option value="QUATREem"></f:option>
							<f:option value="TROISem"></f:option>
							<f:option value="SECOND"></f:option>
							<f:option value="PREMIERE"></f:option>
							<f:option value="TERMINAL"></f:option>
							<f:option value="BAC1"></f:option>
							<f:option value="BAC2"></f:option>
							<f:option value="BAC3"></f:option>
							<f:option value="BAC4"></f:option>
							<f:option value="BAC5"></f:option>
						</f:select>
					<f:errors class="form-control" path="niveau"></f:errors>
				</div>
				</div>
				<div class="form-group">
					<label class="col-sm-4 control-label">telephone:</label>
					 <div class="col-sm-8">
					<f:input class="form-control" path="telephone" />
					<f:errors  class="form-control" path="telephone"></f:errors>
				</div>
				</div>
					<div class="form-group">
					<div class="col-lg-10 col-lg-offset-10 col-md-3 col-md-offset-12 col-xs-12">
					<input class="btn btn-success" type="submit" value="Enregistrer" />
					</div>
					</div>
			</div>
			  </div>
			</f:form>


	</div>     

                      

                                               
                                            
                                

                                      
                                              
	</div>
	</div>
	</div>
	</div>
	<script src="resources/style/js/bootstrap.min.js"></script>
</body>
</html>