<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous"
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==" crossorigin="anonymous" referrerpolicy="no-referrer" />>

<title>otp</title>

</head>
<body>
	<%@include file="components/navbar.jsp"%>
	<h2 class="text-success" style="text-align: center;">${verifyOTP}</h2>
	<form action="otpvalidate">



		<h2 class="alert alert-red" role="alert" style="text-align: center;">${invalidOTP}</h2>
	</form>
	<br>
	<table class="table table-striped table-hover table-bordered">
		<thead class="table-dark">
			<tr>
				<th scope="col">userId</th>
				<th scope="col">fullName</th>
				<th scope="col">userName</th>
				<th scope="col">email</th>
				<th scope="col">password</th>
				<th scope="col">otp</th>
				<th scope="col">loginCount</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="Value" items="${ListOfAllData}">
				<tr>
					<td>${Value.userId}</td>
					<td>${Value.fullName}</td>
					<td>${Value.userName}</td>
					<td>${Value.email}</td>
					<td>${Value.password}</td>
					<td>${Value.otp}</td>
					<td>${Value.loginCount}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	

				<div class="container text-center ">
	 	<a href="otpvalidate.jsp"class="btn btn-info badge-pill"style="width:80px;">+Add</a>

						</div>
	<%@include file="components/base.jsp"%>	

</body>
</html>