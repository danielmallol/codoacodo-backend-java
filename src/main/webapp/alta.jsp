<html>
	<head>
		<!--  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous"> -->
		<link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css" />
	</head>

	<body>
		<main>
			<!-- ACA VA EL NAVBAR  -->
			<%@include file="navbar.jsp" %>
			<div class="container">
				<section>
				    <br>
					<h2>Alta</h2>
					<!--  JSP -->
					<form method="post"
						action="<%=request.getContextPath()%>/CreateController">
						<div class="mb-3">
						  <label for="exampleFormControlInput1" class="form-label">Nombre</label>
						  <input name="nombre" type="text" class="form-control" id="exampleFormControlInput1" placeholder="Nombre del producto" maxlength="50">
						</div>
						<div class="mb-3">
						  <label for="exampleFormControlTextarea1" class="form-label">Precio</label>
						  <input name="precio" type="number" step="0.01" class="form-control" id="exampleFormControlTextarea1">
						</div>
						<div class="mb-3">
						  <label for="exampleFormControlTextarea1" class="form-label">C&oacute;digo</label>
						  <input name="codigo" type="text" class="form-control" id="exampleFormControlTextarea1" maxlength="7">
						</div>
						<button class="btn btn-primary">
							Dar de alta
						</button>
					</form>
				</section>
			</div>
		</main>
	</body>	
</html>

