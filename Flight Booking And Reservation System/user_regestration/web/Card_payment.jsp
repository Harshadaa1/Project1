<%-- 
    Document   : Card_payment
    Created on : Jan 23, 2025, 10:39:11 AM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    
        <link rel="stylesheet" href="bootstrap.css">
    <style type="text/css">
        .jumbotron {
            width:40%;
            margin: auto auto auto auto;
        
            border-radius: 25px;
           margin-top: 5%;
           
           background-color: transparent;
           border: solid 2px black;
           padding: 20px;
        }
        body
            {
                background-image: url("img/f2.jpg");
                background-size: cover;
                
            }
        h2 {
            text-align: center;
        }
        button {
            margin-left: 130px;
        }
        body {
            
                   }
        #u:hover{
                         transform: scale(1.2); 
                         cursor: pointer;
        }
    </style>
</head>
<body>
    
    <div class="jumbotron">
        <form action="payment" method="POST">
        <h2>PAYMENT</h2>
        <hr>
        <div class="row">
            <div class="col-sm-1"></div>
            <div class="col-sm-10">
                <a href="upi.jsp" class="btn btn-warning"> UPI Payment</a>
                <br><br>
                <a href="user_payment.jsp" class="btn btn-danger"> Credit Card</a>
               
            </div>
        </div>
        
          </form>
    </div>
      
</body>
</html>