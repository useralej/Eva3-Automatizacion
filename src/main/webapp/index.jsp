<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css">
<title>Index JSP</title>
</head>
<body>
<div class="container col-lg-4">
<form action="MauricioServlet" method="post">
  <div class="form-group">
   <br>
   <center><img src="img/imagen2.png"></center>
   <br>
  <p style="text-align:center"><strong>"MY CONSTRUCCIÓN"</strong></p>
  </div>
  <br>
  <br>
  <div class="mb-4 row">
  <label class="col-sm-2 col-form-label">Usuario:</label>
  <div class="col-sm-7">
  	<input class="form-control" type="text" id="username" name="username">
  </div>
  </div>
  <div class="mb-4 row">
  <label class="col-sm-2 col-form-label">Password:</label>
  <div class="col-sm-7">
  	<input class="form-control" type="password" id="password" name="password">
  </div>
  </div>
  <br>
  <input class="btn btn-primary" type="submit" id="accion"name="accion" value="Validar">
  </br>
  
</form>


</div>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"></script>
</body>
</html>