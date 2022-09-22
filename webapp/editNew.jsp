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
	crossorigin="anonymous" https://cdn.jsdelivr.net/npm/bootstrap
	@5.2.1/dist/js/bootstrap.bundle.min.js>

<title>editNew</title>

</head>
<body>
	<div class="container mt-3">
		<div class="row">
<div class="register">
			<div class="col-md-12">
<form action="editNew"method="post">

				
				<div class="container">
				
				<header class="bg-primary p-4
				text-white text-center">
				<h3>Welcome To Edit-page</h3>
				
				</header>
		<table class="table table-striped  table-hover table-bordered ">
		<thead>
		<tr>
		<th>Names</th>
		<th class="text-end">Actions</th>
	</tr>
	</thead>
	<tbody>
	<tr>
	<td>FullName</td>
	<td class="text-end">   
	<a href="editNew.jsp"></a>
	<a href="login.jsp"></a>
	 	<a href="FN.jsp"class="btn btn-info badge-pill"style="width:80px;">edit</a>
	 	<a href="update.jsp"class="btn btn-info badge-pill"style="width:80px;">update</a>
	 	<a href="delete.jsp"class="btn btn-danger badge-pill"style="width:80px;">delete</a>

	</td>
	
	</tr>
		
		<tr>
	<td>Email</td>
	<td class="text-end">   
	<a href="editNew.jsp"></a>
	 	<a href="mail.jsp"class="btn btn-info badge-pill"style="width:80px;">edit</a>
		 <a href="update.jsp"class="btn btn-primary badge-pill"style="width:80px;">update</a>
	 	<a href="delete.jsp"class="btn btn-danger badge-pill"style="width:80px;">delete</a>

		
	</td>
	
	</tr>
	<tr>
	<td>Password</td>
	<td class="text-end">   
	<a href="login.jsp"></a>
<a href="editNew.jsp"></a>
	 	<a href="Pass.jsp"class="btn btn-info badge-pill"style="width:80px;">edit</a>
		 <a href="update.jsp"class="btn btn-info badge-pill"style="width:80px;">update</a>
	 	<a href="delete.jsp"class="btn btn-danger badge-pill"style="width:80px;">delete</a>

	
	</td>
	
	</tr>
  
  
  
  
  
  
  
  
</table>
</div>
<div class="container text-center ">
	 	<a href="Add.jsp"class="btn btn-info badge-pill"style="width:80px;">Add</a>
	
					</div>
</form>

			</div>
</div>
		</div>



	</div>





</body>
</html>