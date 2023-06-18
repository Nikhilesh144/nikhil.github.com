<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page isELIgnored="false" %>
   
<!DOCTYPE html>
<html>
<head>
<Style>
.paint-card{
box-shadow:0 0 10px 0 rgba(0,0,0,0.3);
}
</Style>

<%@include file="../components/CSS.jsp" %>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<c:if test="${empty adminObj }" >
<c:redirect url="../ADMIN.jsp"></c:redirect>
</c:if>
<%@include file="adminNavbar.jsp" %>
<!--<li class="nav-item"><a class="nav-link" href="#">Link</a></li>  -->
<!-- <li class="nav-item dropdown">
<a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
Dropdown
</a>
<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
<li><a class="dropdown-item" href="#">Action</a></li>
<li><a class="dropdown-item" href="#">Another action</a></li>
<li><hr class="dropdown-divider"></li>
<li><a class="dropdown-item" href="#">Something else here</a></li>-->
</ul>
</li>
</ul>
</div>
</div>
</nav>
<%@include file="CSS.jsp" %>
<div class="container p-5">
<p class="text-center fs-3">ADMIN DASHBOARD</p>

<c:if test="${not empty success }" >
<p class="text-center text-success text-fs-4">${success}</p>
<c:remove var="success" scope="session"/>
</c:if>
<c:if test="${not empty error }" >
<p class="text-center text-danger text-fs-4">${error}</p>
<c:remove var="error" scope="session"/>
</c:if>
<div class="row">
<div class="col-md-4">
<div class="card paint-card">
<div class="card-body text-center text-success">
<i class="fa-solid fa-user-doctor fa-3x"></i>
<p class="text-center fs-4">DOCTOR<br>10</p>
</div>
</div>
</div>
<div class="col-md-4">
<div class="card paint-card" data-bs-dismiss="modal" data-bs-toggle="modal" data-bs-target="#exampleModal">
<div class="card-body text-center text-success">
<i class="fa-solid fa-stethoscope fa-3x"></i>
<p class="text-center fs-4">SPECIALIST<br>27</p>
</div>
</div>
</div>

<div class="col-md-4">
<div class="card paint-card">
<div class="card-body text-center text-success">
<i class="fa-solid fa-calendar-check fa-3x"></i>
<p class="text-center fs-4 ">APPOINTMENT<br>45</p>
</div>
</div>
</div>

<div class="col-md-4">
<div class="card paint-card">
<div class="card-body text-center text-success">
<i class="fa-solid fa-user fa-3x"></i>
<p class="text-center fs-4">USER<br>100</p>
</div>
</div>
</div>








</div>






 </div>




<!-- Modal -->
<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
      
      <form action="../addSpecailst" method="post">
      <div class="form-group">
      <label>Enter Specialist Name</label>
      <input type="text" name="specName"class="form-control">
      </div>
      <div class="text-center mt-3">
            <button type="submit" class="btn-btn-primary">ADD</button>
      </div>

      
      </form>
        
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
    
      </div>
    </div>
  </div>
</div>
</body>
</html>