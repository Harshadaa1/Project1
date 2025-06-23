<%-- 
    Document   : Cancellation
    Created on : Dec 31, 2024, 9:14:33 AM
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
                width: 50%;
                margin: auto auto auto auto;
                margin-top:5%;
                
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
               margin-left: 90px;
            }
            h2
            {
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
        <div class="container">
            <form action="cancel" method="POST">
            <h2 >CANCELLATION</h2>
            <hr>
            <div class="row">
                <div class="col-sm-6">
                    <label>Ticket ID</label><br>
                    <input type="text" name="txt_id" value="<%=request.getParameter("booking_id")%>" placeholder="Ticket Id" required class="form-control" /><br>
                    
                   
                    
                    
                </div>
                <br>
                <div class="col-sm-6">
                   
                    <label>Reason</label><br>
                    <textarea name="reason" class="form-control"></textarea>
                    
                </div>

            </div>
            <hr>
                                 <div class="row">
                        <div class="col-sm-6">
                            <button type="submit" name="btn" class="btn btn-primary">CANCEL FLIGHT</button>
                        </div>
                        <div class="col-sm-6">
                      <button type="submit" class="btn btn-primary">BACK</button>

                        </div>
                                 </div>
            </form>
                    </div>
            
               
                 
    </body>
</html>
<!--                <button class="btn btn-primary">CANCEL FLIGHT</button>

        </div>
