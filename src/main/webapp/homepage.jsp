<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script type="text/javascript">
	$(document).ready(function() {

		$("#addCart").on("click", function() {
			var myTable = document.getElementById('bookTable').tBodies[0];
			// first loop for each row
			for (var r = 0, n = myTable.rows.length; r < n; r++) {
				// this loop is getting each colomn/cells
				for (var c = 0, m = myTable.rows[r].cells.length; c < m; c++) {
					if (myTable.rows[r].cells[c].childNodes[0].value) {
						var qty = myTable.rows[r].cells[c].childNodes[0].value;
						//alert(qty);
						var qty1 = parseInt(qty);
						<c:set value="${qty1}" var="quantity"/>
					/* 	 <fmt:parseNumber var="qnty" integerOnly="true" type="number" value="${qty}" />  */
					}
				}
			}
		});
	});
</script>
</head>
<body>
	<div class="container">
		<div class="row">
			<h3>Book store</h3>
		</div>
	</div>
	<div class="container">
		<div class="row">
			<input class="form-control input-sm" id="inputsm" type="text"
				placeholder="Search"> <br> <a href="#"
				class="btn btn-success" role="button">Search</a> <a href="#"
				class="btn btn-info" role="button">Clear Search</a>
		</div>
	</div>
	<br>
	<div class="container">
		<div class="table-responsive">
			<table class="table" id="bookTable">
				<thead>
					<tr>
						<th>Book Name</th>
						<th>Author</th>
						<th>Description</th>
						<th>Quantity</th>
						<th>Price</th>
						<th><a href="#" class="btn btn-primary" role="button">Click
								to Check out</a></th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="book" items="${inventorylist}">
						<tr>
							<td><c:out value="${book.bookName}"></c:out></td>
							<td><c:out value="${book.author}"></c:out></td>
							<td><c:out value="${book.description}"></c:out></td>
							<td><input class="form-control input-sm" id="inputsm"
								type="text"></td>
							<td><c:out value="${book.price}"></c:out></td>
							<td><a href="saveCart?bookId=${book.bookId}&qty=${quantity}&name=<security:authentication property="principal.username" /> "
								class="btn btn-success" id="addCart" role="button">Add To
									Cart</a></td>
									<%-- saveCart?bookId=${book.bookId}&qty=${quantity} --%>
						</tr>
					</c:forEach>

				</tbody>
			</table>
		</div>
	</div>
</body>

</html>