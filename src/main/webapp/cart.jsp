<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
   <head>
      <title>Bootstrap Example</title>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
      <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>
      <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
   </head>
   <body>
      <div class="container">
         <div class="row">
            <h3>Cart Details</h3>
         </div>
      </div>
      <br>
      <div class="container">
         <div class="table-responsive">
            <table class="table">
               <thead>
                  <tr>
                     <th>Book Name</th>
                     <th>Author</th>
                     <th>Description</th>
                     <th>Quantity</th>
                     <th>Price</th>
                     <th><a href="#" class="btn btn-success" role="button">BuyNow</a></th>
                  </tr>
               </thead>
               <tbody>
                  <tr>
                     <td>Anna</td>
                     <td>Pitt</td>
                     <td>35</td>
                     <td>2</td>
                     <td>100</td>
                     <td><a href="#" class="btn btn-danger" role="button">Delete Item</a></td>
                  </tr>
               </tbody>
            </table>
         </div>
      </div>
   </body>
</html>