<%-- 
    Document   : homepagenav
    Created on : Mar 4, 2025, 5:07:18 PM
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
            #btn{
                width: 150px;
                height: 50px;
                border: none;
                color: white;
                background-color: rgb(225,0,68);
                border-radius: 5px;
                box-shadow: inset 0 0 0 0 #f9e506;
                transition: ease-out 0.3s;
                outline: none;
            }
            #btn:hover{
                box-shadow: inset 300px 0 0 0 #f9e506;
                color: black;
            }
            a{
                padding: 15px;
                margin-left: 10px;
            }
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
      
     
      
      
    </ul>
    <form class="form-inline my-2 my-lg-0">
        <a href="Admin_login.jsp" id="btn" >Admin Login</a>
            
        <a href="User_login.jsp" id="btn" >User Login</a>
    </form>
  </div>
</nav>
    </body>
</html>

