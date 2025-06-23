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
          <a class="nav-link" href="Flight_search.jsp">Flight search</a>
      </li>
      
      <li class="nav-item">
          <a class="nav-link" href="user_view_mybooking.jsp">My booking</a>
      </li>
      
      
      
      
      

     
     <li class="nav-item">
        <a class="nav-link disabled" href="user_feedback.jsp">User Feedback</a>
      </li>
      <li class="nav-item">
        <a class="nav-link disabled" href="user_view_cancelbooking.jsp">Cancel booking</a>
      </li>
      
      <li class="nav-item">
          <a class="nav-link disabled" href="Booking_Report.jsp">Booking Report</a>
      </li>
      
    </ul>
    <form class="form-inline my-2 my-lg-0">
     
        <a class="btn btn-danger" href="Homepage.jsp">Logout</a>
    </form>
  </div>
</nav>
    </body>
</html>
