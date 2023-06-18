<%@page import="com.entity.specialist"%>
<%@page import="java.util.List"%>
<%@page import="com.entity.specialistDAO"%>
<%@page import="com.Db.DbConnect" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<%@include file="../components/CSS.jsp"%>
<style type="text/css">
.paint-card{
box-shadow:0 0 10px 0 rgba(0,0,0,0.3);
}
</style>
</head>
<body>
<%@include file="adminNavbar.jsp" %>
<div class="container-fluid p-3">
<div class="row">
<div class="col-md-4">
<div class="card paint-card">
<div class="card-body">
<p class="fs-3 text-center" >Add Doctor</p>
<form action="adddoctor" method="post">
<div class="mb-3">
<label class="form-label">Full Name</label> <input type="text"
required name="full_name" class="form-control">
</div>
<div class="mb-3">
<label class="form-label">DOB</label> <input type="date"
required name="DOB" class="form-control">
</div>
<div class="mb-3">
<label class="form-label">Qualification</label> <input type="text"
required name="Qualification" class="form-control">
</div>
<div class="mb-3">
<label class="form-label">Specialization</label><select name="specialization" class="form-control">
<option>--Select--</option>
<%specialistDAO dao=new specialistDAO(DbConnect.getcon());
     List<specialist> list =dao.getSpecialist();
     for(specialist s:list)
     {%>
     
    	 <option><%=s.getSpecialistName()%></option>
    <%}

%>

</select>
</div>
<div class="mb-3">
<label class="form-label">E-mail</label> <input type="text"
required name="E-mail" class="form-control">
</div>
<div class="mb-3">
<label class="form-label">Phone Number</label> <input type="text"
required name="Phone_Number" class="form-control">
</div>
<div class="mb-3">
<label class="form-label">AGE</label> <input type="text"
required name="Age" class="form-control">
</div>
<div class="mb-3">
<label class="form-label">GENDER</label> <input type="text"
required name="Gender" class="form-control">
</div>
<div class="mb-3">
<label class="form-label">Address</label> <input type="text"
required name="Address" class="form-control">
</div>
<div class="mb-3">
<label class="form-label">Aadhar Number</label> <input type="text"
required name="Aadhar_number" class="form-control">
</div>
<div class="mb-3">
<label class="form-label">Password</label> <input type="text"
required name="Password" class="form-control">
</div>
<button type="Submit"class="btn btn-primary">Submit</button>
</form>
</div>
</div>


</div>
</div>
</div>



</div>
</body>
</html>