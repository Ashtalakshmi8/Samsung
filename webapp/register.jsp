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

<title>register</title>

</head>
<body>





	<!--
	<div style="color: orange">${save}</div>
	<div style="color: orange">${sav}</div> -->
	<div class="container text-center ">

		<h1>
			<div class="text-center my-  bg-success ">${sav1}</div>
		</h1>
		<h1>
			<div class="text-center my-3  bg-secondary ">${valid}</div>
		</h1>

	</div>


	<div class="row mt-5 text-center bg-secondary">
		<div class="col-md-4 offset-md-4">


			<div class="card text-center ">
				<div class="card-body px-5">


					<h3 class="text-center my-3 ">Register</h3>
					<h1>
						<div style="color: red">${msg}</div>
					</h1>



					<form action="register" method="post">

						<div class="mb-3">
							<label for="fullName" class="form-label">fullName</label> <input
								type="name" class="form-control" id="fullName"
								aria-describedby="fullNameHelp" placeholder="Enter Name"
								name="fullName">
						</div>

						<div class="mb-3">

							<label for="userName" class="form-label">userName</label> <input
								type="userName" class="form-control" id="userName"
								aria-describedby="userNameHelp" placeholder="Enter userName"
								name="userName">
						</div>
						<div class="mb-3">

							<label for="email" class="form-label">email</label> <input
								type="email" class="form-control" id="email"
								aria-describedby="emailHelp" placeholder="Enter email"
								name="email">

						</div>
						<div class="mb-3">

							<label for="password" class="form-label">password</label> <input
								type="password" class="form-control" id="password"
								aria-describedby="passwordHelp" placeholder="Enter password"
								name="password">
						</div>
						<div class="mb-3">

							<label for="cpassword" class="form-label">cpassword</label> <input
								type="cpassword" class="form-control" id="cpassword"
								aria-describedby="cpasswordHelp" placeholder="Enter cpassword"
								name="cnfrm_password">
						</div>
						<div class="form-check d-flex justify-content-center mb-5">
							<input class="form-check-input me-2" type="checkbox" value=""
								id="form2Example3cg" /> <label class="form-check-label"
								for="form2Example3g"> I agree all statements in <a
								href="#!" class="text-body"><u>Terms of service</u></a>
							</label>
						</div>


						<div class="container text-center ">
							<button type="submit" class="btn btn-success custom-bg">Register</button>

						</div>


						<p class="text-center text-muted mt-5 mb-0">
							Have already an account? <a href="login.jsp"
								class="fw-bold text-body"><u>Login here</u></a>
						</p>

					</form>


					<a href="register.jsp"></a>



				</div>
			</div>
			<%@include file="components/base.jsp"%>
</body>
</html>