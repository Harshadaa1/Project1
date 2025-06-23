<%-- 
    Document   : a_payment
    Created on : Dec 30, 2024, 8:19:00 PM
    Author     : Lenovo
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="bootstrap.css" />
        <style type="text/css">
            .container{
                width: 30%;
                margin: auto auto auto auto;
                margin-top: 5%;
                
                border-radius: 25px;
                background-color: transparent;
                border:solid 2px black;
                padding: 20px;  
            }
            body
            {
                background-image: url("img/f2.jpg");
                background-size: cover;

            }
            button{
                margin-left: 80px;
            }
            h2{
                text-align: center;
                color: black;
            }
     
               label{
                   margin-left: 5px;
                   color: black;
               }
        </style>
    </head>
    <body>
           <%@include file="user_header.jsp" %>
           
           <div class="row">
            <div class="col-sm-3"></div>
            <div class="col-sm-6">
        <script src="validation.js"></script>
        <div class="container">
            <form action="payment" method="POST">
             <h2>PAYMENT</h2><hr>
             <br>
             <label>Card Holder Name</label><br>
                       <input type="text" name="txt_cname" onkeypress="javascript:return isString(event)" class="form-control" placeholder="Enter card holder name" required/><br>

            <div class="row">
               
                <div class="col-sm-6">
                    <label>Card Number</label><br>
                
                <input type="text" name="txt_number" onkeypress="javascript:return isNumber(event)" maxlength="16" class="form-control" placeholder="Enter card number" required/><br>
                    
                    <label>Cvv No</label><br>
                         <input type="password" name="txt_cvv" onkeypress="javascript:return isNumber(event)" maxlength="4" placeholder="Enter cvv no" class="form-control" required/><br>
      
                                             
                     
                                       
               
                </div>
                <div class="col-sm-6">
                    <%
                    Date date=new Date();
                    SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
                    String dob=format.format(date);
                    %>
                         <label>Expirary Date</label><br>
                <input type="date" name="txt_exp" min="<%=dob%>" placeholder="Enter date" required class="form-control"/><br>    
              <label>Total Amount</label><br>
              <input type="text" name="txt_total"  value="<%=session.getAttribute("total_price")%>" onkeypress="javascript:return isFloat(event)" class="form-control" placeholder="Total Amount" required /><br>
              
                        
                </div>

            </div>
              <div class="row">
                <div class="col-sm-8">
               
                    
                 </div>
                <div class="col-sm-4">
                    <button type='submit' value="ADD" name='txt_pay' class="btn btn-primary">PAY</button>
                    <button type='submit' name='txt_pay' class="btn btn-primary">CANCEL</button>
                </div>
               
            </div>
                       </form>
        </div>
            </div>
           </div>
    </body>
</html>
