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

<title>otpreg</title>

</head>
<body>





<!--
	<div style="color: orange">${save}</div>
	<div style="color: orange">${sav}</div> -->
	<div class="container text-center ">
	
	<h1>	<div class="text-center my-  bg-success ">${sav1}</div></h1>
		<h1>	<div class="text-center my-3  bg-secondary ">${valid}</div></h1>
	
</div>


	<div class="row mt-5 text-center bg-secondary">
		<div class="col-md-4 offset-md-4">


			<div class="card text-center ">
				<div class="card-body px-5">


					



					<form action="" method="post">

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

							<label for="cpassword" class="form-label">otp</label> <input
								type="cpassword" class="form-control" id="cpassword"
								aria-describedby="cpasswordHelp" placeholder="Enter cpassword"
								name="cnfrm_password">
						</div>
						

						
							<div class="container text-center ">
						<button type="submit" class="btn btn-success custom-bg">submit</button>

					

					</form>

								<!-- 	<a href="otpregister.jsp"></a>
					
					<a href="otpvalidate.jsp"></a>-->
										
					</div>

				</div>
			</div>
				  <%@include file="components/base.jsp"%>
			
</body>
</html>