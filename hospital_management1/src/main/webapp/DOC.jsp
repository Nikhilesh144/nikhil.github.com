<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<Style>
.paint-card{
box-shadow:0 0 10px 0 rgba(0,0,0,0.3);
}
</Style>
<meta charset="ISO-8859-1">
<title>DOCTOR LOGIN</title>
<%@include file="components/CSS.jsp" %>
</head>
<body>
<%@include file="components/NAVBAR.jsp" %>
<div class="container p-5">
<div class="row">
<div class="col-md-4 offset-md-4">
<div class=" card paint-card">
<div class="card-body">
<p class="fs-4 text-center" >DOCTOR LOGIN</p>
<form action="#" method="post">
<div class="md-3">
<label class="form-label">E-mail
</label><br><input required
name="email"type="email" class="form-contorl col-md-12">
</div>
<div class="md-3">
<label class="form-label">password 
</label><br><input required
name="password"type="password" class="form-contorl col-md-12">
</div><br>
<button type="submit" class="btn bg-warning text-white col-md-12">Login</button>
</div>



<%@include file="components/FOOTER.jsp"%>
</body>
</html>