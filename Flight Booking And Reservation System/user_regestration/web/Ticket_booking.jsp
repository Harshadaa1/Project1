<%-- 
    Document   : Ticket_booking
    Created on : Jan 9, 2025, 4:46:15 PM
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
                width:50%;
                margin: auto auto auto auto;
                margin-top: 5%;
                
                border-radius: 25px;
                
                background-color: transparent;
                border: solid 2px black;
                padding: 20px;
                
            }
            body
            {
                background-image: url("img/f2.jpg");
                background-size: cover;
                
            }
            
            h2{
                text-align: center;
                color:black;
            }
            label{
                margin-left:10px; 
            }
             button{
                 margin-left: 80px;
                 width: 100px;
            }
        </style>
    </head>
    <body>
        <%@include file="user_header.jsp" %>
        <script src="validation.js"></script>
        
             <form action="Ticket_Booking" method="POST">
        <div class="container">
           
            <h2 style="color: black;">TICKET BOOKING</h2><hr>
            <div class="row">
                <div class="col-sm-6">
                    <label>Departure Airport</label><br>
                    <input type="text" name="txt_dept_airport" value="<%=session.getAttribute("arr_air")%>" class="form-control"/>
                    <%
                    Date date=new Date();
                    SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
                    String dob=format.format(date);
                    %>
                     <label>Departure Date</label><br>
                     <input type="date" name="txt_date" max="<%=dob%>" value="<%=session.getAttribute("dept_date")%>" required class="form-control" /><br>
                     
                     <label>Adult</label><br>
                     <input type="text" name="txt_adult" onkeypress="javascript:return isNumber(event)" required class="form-control"/><br>
                  
                </div>
                <div class="col-sm-6">
                    <label>Arrival Airport</label><br>
                     <input type="text" name="txt_air_airport" value="<%=session.getAttribute("dept_air")%>" class="form-control"/>
                       
                       <label>Flight Class</label><br>
                       <select class="form-control" required name='txt_flightclass' ><option>Select Class</option><option>Economy</option><option>Bussiness</option></select><br>

                    <label>Child</label><br>
                    <input type="text" name="txt_child" onkeypress="javascript:return isNumber(event)" required class="form-control"/><br>
                  
                </div>
            
            </div>
            <input type="submit" name="btn_next" value="NEXT" class="btn btn-primary"/>
        </div>
        
               
           
            </form>
    </body>
   
</html>