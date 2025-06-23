<%-- 
    Document   : user_header
    Created on : Jan 18, 2025, 10:03:07 AM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="bootstrap.css" />
        <style type="text/css">
            
        </style>
    </head>
    <body>
        
        <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Flight Booking And Reservation System</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
          <a class="nav-link" href="Add_Flight.jsp">Add Flight</a>
      </li>
      
       <li class="nav-item">
           <a class="nav-link" href="admin_view_customer.jsp">Customer Details</a>
      </li>
      
         <li class="nav-item">
             <a class="nav-link" href="admin_view_booking.jsp">Booking Details</a>
      </li> 
      <li class="nav-item">
        <a class="nav-link" href="admin_view_cancel.jsp">Cancel Booking</a>
      </li> 
      
       <li class="nav-item">
        <a class="nav-link" href="admin_view_feedback.jsp">Feedback</a>
      </li> 
      
      
    </ul>
    <form class="form-inline my-2 my-lg-0">
        
         <a class="btn btn-danger" href="Homepage.jsp">Logout</a>
     
      
    </form>
  </div>
</nav>
    </body>
</html>
