<nav class="navbar navbar-expand-lg navbar-dark bg-warning">
	<div class="container-fluid"></div><
		<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
		<%@page isELIgnored="false"%>
		<a class="navbar-brand" href="INDEX.jsp"> <i
			class="fa-solid fa-hospital"></i> NIKKY'S HOSPITAL
		</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav ms-auto mb-2 mb-lg-0">
				<c:if test="${empty userObj }">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="ADMIN.jsp"><i
							class="fa-solid fa-right-to-bracket"></i>ADMIN</a></li>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="DOC.jsp">DOCTOR</a></li>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#">APPOINTMENT</a></li>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="USER.jsp">USER</a></li>



				</c:if>

				<c:if test="${not empty userObj }">
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#">APPOINTMENT</a></li>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="#"> VIEW APPOINTMENT</a></li>
					<div class="dropdown ">
						<button class="btn btn-Warning dropdown-toggle " type="button"
							id="dropdownMenuButton1" data-bs-toggle="dropdown"
							aria-expanded="false">
							<i class="fa-solid fa-user"></i> ${userObj.name}
						</button>
						<ul class="dropdown-menu" aria-labelledby="dropdownMenuButton1">
							<li><a class="dropdown-item" href="#">Change Password</a></li>
							<li><a class="dropdown-item" href="userLogout"> logout</a></li>
						</ul>
					</div>





				</c:if>
				</ul>
				</div>
				</nav>