<%-- 
    Document   : Registration
    Created on : Dec 27, 2024, 12:36:47 PM
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
        <link rel="stylesheet" href="bootstrap.css"/>
        <style type="text/css">
            .container
            {
                /*background-color: black;*/
                
                margin: auto auto auto auto;
                margin-top: 5%;
                border-radius: 25px;
                margin-right: 12px;
                background-color: transparent;
                border: solid 2px white;
                padding: 20px;
                
                
                /*color: white;*/
            }
            body
            {
                background-image: url("img/f1.jpg");
                background-size: cover;
                
            }
           
   
            h2{
                text-align: center;
                color: white;
            }
            label{
                margin-left: 5px;
                color: white;
            }
            button{
                margin-left: 70px;
            }
        </style>
        <script>
            function cal()
            {
                
                var a=document.getElementById("gst").value;
                var b=document.getElementById("price").value;
                var c=b*a/100;
                document.getElementById("amount").value=parseInt(b)+parseInt(c);
            }
        </script>
    </head>
    <body>
        <%@include file="admin_header.jsp" %>
        <script src="validation.js"></script>
        
        
        <div class="row">
            <div class="col-sm-5">
                
            </div>
            <div class="col-sm-6">
                <div class="container"  >
            <form action="add_flight" method="POSt">
                <h2 style="color: white;">ADD FLIGHT</h2><hr>
            
            
            
            
            <div class="row">
                <div class="col-sm-6">
                    
                    
                    <label>Flight id</label><br>
                    <input type="text" name="txt_id" onkeypress="javascript:return isNumber(event)" placeholder="Enter id" class="form-control" required /><br>
                    
                    
                    <label>Flight Name</label>
                    <input id="input" type="text" name="txt_flight_name" onkeypress="javascript:return isString(event)" class="form-control" placeholder="Enter flight name" required /><br>
                    
                    
                    <label>Arrival Airport</label>
                    <input id="input" type="text" name="txt_arrival_airport" onkeypress="javascript:return isString(event)" class="form-control" placeholder="Enter airport name" required/><br>
                    
                    
                    <label>Departure Airport</label>
                    <input id="input" type="text" name="txt_depart" onkeypress="javascript:return isString(event)" placeholder="Enter airport name" class="form-control" required/><br>
                    
                    <label>GST</label>
                    <input  type="text" onkeyup="cal()" id="gst" name="txt_gst" onkeypress="javascript:return isFloat(event)" placeholder="Enter GST" class="form-control" required/><br>
                    
                    
                   
                    <br>
                    
                </div>
                <div class="col-sm-6">
                  
                     <%
                    Date date=new Date();
                    SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
                    String dob=format.format(date);
                    %>
                    <label>Date</label><br>
                    <input type="date" name="txt_date" min="<%=dob%>" placeholder="Enter date" class="form-control" required/><br>
                    
                    
                    <label>Arrival Time</label><br>
                    <input type="time" name="txt_arrival_time" placeholder="Enter time" class="form-control" required/><br>
                    
                    
                    <label>Departure Time</label><br>
                    <input type="time" name="txt_departure_time" placeholder="Time " class="form-control" required/><br>
                   
                    
                    <label>Flight Airfare</label><br>
                    <input type="text" name="txt_price"  onkeyup="cal()"  id="price" onkeypress="javascript:return isFloat(event)"placeholder="Price" class="form-control" required/><br>
                    
                    <label>Total Amount</label><br>
                    <input  type="text"  onkeyup="cal()"  name="txt_amt" id="amount"  placeholder="Enter total amount" onkeypress="javascript:return isFloat(event)" class="form-control" required/><br>
                    
                    
                   
                                    
                </div>

            </div>
                    <div class="row">
                        <div class="col-sm-12">
                            <center><button type="submit" name="btn"  value="ADD" class="btn btn-primary">ADD</button>
                        <button  type="submit" name="btn" class="btn btn-primary">CANCEL</button></center>
                        </div>
                    </div>
            </form>

        </div>
            </div>
            <div class="col-sm-1">
                
            </div>
        </div>
        
    </body>
</html>
