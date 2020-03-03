<!DOCTYPE html>
<html lang="en">

<head>
	<title>Bootstrap Example</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-sm-12">
				<h2 class="text-left"> Add Book Details</h2>
				<form class="form-horizontal" action="save">
					<div class="form-group">
						<input type="hidden" class="form-control" name="bookId">
					</div>
					<div class="form-group">
						<label for="bookName">Book Name:</label>
						<input type="text" class="form-control" name="bookName">
					</div>
					<br>
					<div class="form-group">
						<label for="author">Author:</label>
						<input type="text" class="form-control" name="author">
					</div>
					<div class="form-group">
						<label for="description">Description:</label>
						<input type="text" class="form-control" name="description">
					</div>
					<div class="form-group">
						<label for="quantity">Quantity:</label>
						<input type="number" min=0 class="form-control" name="quantity">
					</div>
					<div class="form-group">
						<label for="price">Price:</label>
						<input type="number" step="any" min=0 class="form-control" name="price">
					</div>
					<div class="form-group">
						<button type="submit" class="btn btn-default">Submit</button>
				</div>
				</form>
			</div>
		</div>
	</div>
<script type="text/javascript" >
   function preventBack(){window.history.forward();}
    setTimeout("preventBack()", 0);
    window.onunload=function(){null};
</script>
</body>
</html>