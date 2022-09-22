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

<title>delete</title>

</head>
<body>
	<%@include file="components/navbar.jsp"%>


	<div class="row mt-5 text-center bg-secondary">
		<div class="col-md-4 offset-md-4">


			<div class="card text-center bg-primary">
				<div class="card-body px-5">


					<h3 class="text-center my-3 ">Delete-page</h3>

					<h1 style="color: green;">${DeleteSuccess}</h1>
					<h3 style="color: red;">${DeleteMsg}</h3>
					<h3 style="color: red;">${ErrorMsg}</h3>
				




					<form action="delete" method="post">



						<div class="mb-3">

							<label for="userName" class="form-label">userName</label> <input
								type="userName" class="form-control" id="userName"
								aria-describedby="userNameHelp" placeholder="Enter userName"
								name="userName">
						</div>
						
						<div class="container text-center ">
							<button type="submit" class="btn btn-primary custom-bg">delete</button>

						</div>
					</form>
<h2>  <a href="editNew.jsp"></a></h2>


				</div>
			</div>
</body>
</html>