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

<title>login</title>

</head>
<body>

	<%@include file="components/navbar.jsp"%>


	<div class="row mt-5 ">
		<div class="col-md-4 offset-md-4">






			<h3 class="text-center my-3 ">Login here</h3>
			<h1>
				<p style="color: red">${errorUsername}</p>
				<p style="color: red">${errorPassword}</p>
				<p style="color: red">${success}</p>






			</h1>


			<form action="login" method="post">



				<div class="mb-3">

					<label for="userName" class="form-label">userName</label> <input
						type="userName" class="form-control" id="userName"
						aria-describedby="userNameHelp" placeholder="Enter userName"
						name="userName">
				</div>

				<div class="mb-3">

					<label for="password" class="form-label">password</label> <input
						type="password" class="form-control" id="password"
						aria-describedby="passwordHelp" placeholder="Enter password"
						name="password">
				</div>
		</div>

		<div class="container text-center ">
			<a href="login.jsp"></a> <a href="">${forgotPassword}</a>

			<!--  	<h2>  <a href="register.jsp"></a></h2>-->
		</div>



		<div class="container text-center ">
			<button type="submit" class="btn btn-primary custom-bg">submit</button>

		</div>
		</a>
	</div>
	</form>
	</
	</div>
	</div>
	<%@include file="components/base.jsp"%>

</body>
</html>