<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

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
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==" crossorigin="anonymous" referrerpolicy="no-referrer" />  



	

<title>edit</title>

</head>
<body>
	<div class="container mt-3">
		<div class="row">

			<div class="col-md-12">

				<table class="table" cellpadding="0" cellspacing="0" border="">
					<thead class="table-dark">

						<tr>
							<th scope="col">Id</th>
							<th scope="col">FullName</th>
							<th scope="col">Username</th>
							<th scope="col">Email</th>
							
							<th scope="col">Action</th>
						</tr>
					</thead>
					<tbody>

						<c:forEach items="${ref}" var="y">
							<tr>
								<td scope="row">${y.id}</td>
								<td scope="row">${y.fullName}</td>
								<td scope="row">${y.userName}</td>
								<td scope="row">${y.email}</td>
							
								<td>
								<a href="delete"><i class="fa fa-trash text-danger" aria-hidden="true"></i></a>
								<a href="Welcome.jsp"><i class="fa fa-pen-nib text-primary" aria-hidden="true"></i></a>
								
								</td>								
								



							</tr>

						</c:forEach>

					</tbody>
				</table>
				<a href="edit" class="btn btn-info badge-pill" style="width: 80px;">add</a>



			</div>


		</div>
	</div>









</body>
</html>