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
	crossorigin="anonymous">
<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>

<title>welcome</title>


</head>

<body>
	<%@include file="components/navbar.jsp"%>




	<div class="row mt-5 ">
		<div class="col-md-4 offset-md-4">
			<div class="register">
				<form action="login" method="post">
					<div class="container text-center ">
						<h1>
							<p style="color: red">WELCOME</p>
						</h1>
						<h3>
							<p style="color: green">${success}</p>
						</h3>


					</div>
					<table class="table" cellpadding="0" cellspacing="0" border="">
						<thead class="table-dark">

							<tr>

								<th scope="col">FullName</th>
								<th scope="col">Username</th>
								<th scope="col">Email</th>

								<th scope="col">Action</th>
							</tr>
						</thead>
						<tbody>

							<tr>

								<td scope="row">${displayName}</td>
								<td scope="row">${username}</td>
								<td scope="row">${email}</td>

								<td><a href="editNew.jsp" class="btn btn-info badge-pill"
									style="width: 80px;">edit</a></td>


							</tr>



						</tbody>
					</table>
</body>
</html>