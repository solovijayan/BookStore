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
         <h1>Order Lists</h1>
      </div>
      </div>
      <div class="container">
         <table class="table">
            <thead>
               <tr>
                  <th>Order Id</th>
                  <th>Order Details</th>
                  <th>price</th>
               </tr>
            </thead>
            <tbody>
               <tr>
                  <td>68</td>
                  <td>book1 -1 <br> book2 - 2</td>
                  <td>200</td>
                  <td><a href="#" class="btn btn-danger" role="button">Cancel order</a></td>
               </tr>
            </tbody>
         </table>
      </div>
   </body>
   </html>