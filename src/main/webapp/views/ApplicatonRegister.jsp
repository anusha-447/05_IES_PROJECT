<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri = "http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<meta charset="ISO-8859-1">
<title>User page</title>
<script>
$(document).ready(function() {
	$("#ssnNum").blur(function() {
		alert(1)
		$("#errMsg").text("");
		 $.ajax({
				
				type : "GET",
				url : "ssnVerify/verify?ssn="+$("#ssnNum").val(),
				success : function(data) {
					
						if(data=="NOT EXISTED"){
							alert("NOT EXISTED")
							$("#errMsg").text("NOT VALID USER");
							 $("#submitBtn").prop("disabled", true);
						}
						 else {
							 alert("EXISTED")
							$("#submitBtn").prop("disabled", false);
						} 
				}
				});
			
	});
});
</script>
</head>
<body>
<div class="container">
<div class="row">
<div class="col-sm-2">
</div>
<div class="col-sm-6">


<div class="card" style="width: 39rem;">
  <div class="card-header text-center">
  <b class="text-colr">Application Registration</b>
  </div>
  <div class="card-body">
  <br><br>
  <div align="center">
<font color='green' >${success}</font>
<font color='red'>${fail}</font>v

</div>
  <div class="row">
  <div class="col-sm-1">
</div>
<div class="col-sm-10">
<form:form action="register" method="POST"  modelAttribute="citz">

<span>First Name:</span> <form:input class="input-field" type="text" path="firstName"></form:input>
<br>
<br>
<span>Last Name:</span> <form:input class="input-field" type="text" path="lastName"></form:input>
<br>
<br>
<span>SSN:</span> <form:input class="input-field" type="text" id="ssnNum" path="ssnNumber"></form:input>
 <font color='red'><span  id="errMsg"></span></font> 
<br>
<br>
<span>Mobile No:</span> <form:input class="input-field" type="text" path="phone"></form:input>
<br><br>
<span>Gender   :</span>      Male <form:radiobutton path="Gender" value="Male"/>   Female <form:radiobutton path="Gender" value="Female"/>  
   <br><br>   
    <span>DOB:</span> <form:input class="input-field" type="text" path="DOB"></form:input>
    <br><br>
  <span >Email:</span> <form:input id="userEmail" class="input-field" type="text" path="email"></form:input> <font color='red'><span  id="errMsg"></span></font> 
<br>

<br>
 
        <br><br>       

<input class="align-center"  id="submitBtn" type="submit" value="Register">
</form:form>

</div>

<div class="col-sm-2">
</div>
  </div>
    
  </div>
</div>
</div>
<div class="col-sm-4">
</div>
</div>

</div>
</body>
</html>