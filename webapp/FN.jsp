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
				<form action="" method="post">



					<h3 class="text-center my-3 " style="color: red">Edit-page</h3>



					<div class="mb-3">

						<label for="userName" class="form-label">userName</label> <input
							type="userName" class="form-control" id="userName"
							aria-describedby="userNameHelp" placeholder="Enter userName"
							name="userName">
					</div>



					<div class="mb-3">
						<label for="fullName" class="form-label">fullName</label> <input
							type="name" class="form-control" id="fullName"
							aria-describedby="fullNameHelp" placeholder="Enter Name"
							name="fullName">
					</div>
					<div class="container text-center ">
						<button type="submit" class="btn btn-primary custom-bg">submit</button>

					</div>

				</form>


				<h2>
					<a href="editNew.jsp"></a>
				</h2>

			</div>
		</div>
	</div>
</body>
</html>