<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page import="com.Db.*" %>
	<%@page import="java.sql.Connection" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index page</title>
<style type="text/css">
.paint-card{
box-shadow:0 0 10px 0 rgba(0,0,0,0.3);
}
</style>

<%@include file="components/CSS.jsp" %>


</head>
<body>
<%@include file="components/NAVBAR.jsp" %>
<div id="carouselExampleCaptions" class="carousel slide"
data-bs-ride="carousel">
<div class="carousel-indicators">
<button type="button" data-bs-target="#carouselExampleCaptions"
data-bs-slide-to="0" class="active" aria-current="true"
aria-label="Slide 1"></button>
<button type="button" data-bs-target="#carouselExampleCaptions"
data-bs-slide-to="1" aria-label="Slide 2"></button>
<button type="button" data-bs-target="#carouselExampleCaptions"
data-bs-slide-to="2" aria-label="Slide 3"></button>
</div>
<div class="carousel-inner">
<div class="carousel-item active">
<img src="img/hos1.png" class="d-block w-100" alt="..." height=600px>
<div class="carousel-caption d-none d-md-block">
<h4>24/7 EMERGRNCY</h4>
<p>We have Doctors Available 24/7 in Emergency Ward.</p>
</div>
</div>
<div class="carousel-item">
<img src="img/hos2.jpg" class="d-block w-100" alt="..." height=600px>
<div class="carousel-caption d-none d-md-block">
<h4>ADVANCED TECHNOLOGY</h4>
<p>We have Advanced technology for Complicated Surgeries.</p>
</div>
</div>
<div class="carousel-item">
<img src="img/hos3.webp" class="d-block w-100" alt="..."
height=600px>
<div class="carousel-caption d-none d-md-block">
<h4>PERSONAL CARE</h4>
<p>Our Patients are our Family.</p>
</div>
</div>
</div>
<button class="carousel-control-prev" type="button"
data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
<span class="carousel-control-prev-icon" aria-hidden="true"></span> <span
class="visually-hidden">Previous</span>
</button>
<button class="carousel-control-next" type="button"
data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
<span class="carousel-control-next-icon" aria-hidden="true"></span> <span
class="visually-hidden">Next</span>
</button>
</div>
<div class="container p-3">
<p class="text-center fs-2">KEY FEATURES</p>
<div class="row">
<div class="col-md-8 p-5">
<div class="row">
<div class="col-md-6">
<div class="card paint-card">
<div class="card-body">
<p class="fs-5">Quality Healthcare Services</p>
<p>The experience a patient has while they visit the
hospital should be hassle-free and also personalised care
should be provided .</p>
</div>
</div>
</div>
<div class="col-md-6">
<div class="card paint-card">
<div class="card-body">
<p class="fs-5">Ultra modern technologies</p>
<p>State of the art equipment combined with modern
technologies should be the key essentials of a hospital.</p>
</div>
</div>
</div>
<div class="col-md-6 mt-2">
<div class="card paint-card">
<div class="card-body">
<p class="fs-5">Personalized and specialized Care for
patients</p>
<p>he experience a patient has while they visit the hospital
should be hassle-free.</p>
</div>
</div>
</div>
<div class="col-md-6 mt-2">
<div class="card paint-card">
<div class="card-body">
<p class="fs-5">Long-term-care facilities</p>
<p>Historically, long-term-care facilities were homes for
the elderly, the infirm, and those with chronic irreversible
and disabling disorders.</p>
</div>
</div>
</div>
</div>
</div>
<div class="col-md-4">
<img src="img/doc2.jpg" height=400px width=300px>
</div>
</div>
</div>
<hr>
<div class="container p-2">
<p class="text-center f-2 fw-bold">OUR TEAM</p>
<div class="row">
<div class="col-md-3">
<div class="card paint-card">
<div class="card-body text-center">
<img src="img/doc3.jpg" width=230Px height=300px>
<p class="fw-bold fs-5">DR.MOLLY HOPER</p>
<p class="fs-7">(CEO&CHAIRMAN)</p>
</div>
</div>
</div>
<div class="col-md-3">
<div class="card paint-card">
<div class="card-body text-center">
<img src="img/doc6.jpg" width=230Px height=300px>
<p class="fw-bold fs-5">DR.SOPHIE</p>
<p class="fs-7">(CHEIF DOCTOR)</p>
</div>
</div>
</div>
<div class="col-md-3">
<div class="card paint-card">
<div class="card-body text-center">
<img src="img/images.jpg" width=230Px height=300px>
<p class="fw-bold fs-5">DR.SMITH</p>
<p class="fs-7">(CHEIF DOCTOR)</p>
</div>
</div>
</div>
<div class="col-md-3">
<div class="card paint-card">
<div class="card-body text-center">
<img src="img/doc4.jpg" width=230Px height=300px>
<p class="fw-bold fs-5">DR.CHARLOTTE</p>
<p class="fs-7">(CHEIF DOCTOR)</p>
</div>
</div>
</div>
</div>
</div>

<%@include file="components/FOOTER.jsp"%>


</body>
</html>