<%-- 
    Document   : feedback
    Created on : Dec 31, 2024, 10:03:10 AM
    Author     : Lenovo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="bootstrap.css"/>
        <style type="text/css">
                    .container{
                width: 40%;
                margin: auto auto auto auto;
                margin-top: 5%;
                 background-color: transparent;
                 color: black;
                 border-radius: 25px;
                 border: solid 2px black;
                  margin-right: 15%;

            }
            body
            {
                background-image: url("img/f2.jpg");
                background-size: cover;
            }
            
            h2{
                text-align: center;
                color: black;
            }
            label
            {
              margin-left: 5px;
              color: black;
            }
          
                button{
                    margin-left: 50px;
                }
                
                 .star-rating {
            direction: rtl;
            display: inline-block;
            font-size: 30px;
            user-select: none;
        }
        .star-rating input {
            display: none;
        }
        .star-rating label {
            color: lightgray;
            cursor: pointer;
        }
        .star-rating input:checked ~ label {
            color: gold;
        }
        .star-rating input:hover ~ label,
        .star-rating input:checked ~ label:hover {
            color: gold;
        }
                
            </style>
    </head>
    <body>
        <%@include file="user_header.jsp" %>
        <script src="validation.js"></script>
        <div class="container">
            <form action="feedback" method="POSt">
            <h2 style="text-align: center">FEEDBACK</h2><hr>
            <div class="row">
                <div class="col-sm-10">
                      <label>Flight Id</label><br>
                      <input value="<%=session.getAttribute("flight_id")%>" onkeypress="javascript:return isNumber(event)" type="text" name="txt_id" placeholder="Enter Flight id" required class="form-control" /><br>
                    
                </div>
                <div class="col-sm-1">
                  
                </div>

                   
                  
                <div class="col-sm-6">
                    <label>Flight Name</label>
                  <input  type="text" name="txt_name" value="<%=session.getAttribute("flight_name")%>" onkeypress="javascript:return isString(event)" class="form-control" placeholder="Enter Flight Name " required/><br>
                     <div class="star-rating">
        <input type="radio" id="star5" name="rating" value="5" />
        <label for="star5">&#9733;</label>
        <input type="radio" id="star4" name="rating" value="4" />
        <label for="star4">&#9733;</label>
        <input type="radio" id="star3" name="rating" value="3" />
        <label for="star3">&#9733;</label>
        <input type="radio" id="star2" name="rating" value="2" />
        <label for="star2">&#9733;</label>
        <input type="radio" id="star1" name="rating" value="1" />
        <label for="star1">&#9733;</label>
    </div>

                </div>
                <div class="col-sm-6">
                 
                    <label>Date</label><br>
                    <input type="date" name="txt_date" class="form-control" required />
                    <br>
                    
                  
                    <label>Comments</label>
                    <textarea  class="form-control " name="txt_comments" placeholder="Enter Comments"></textarea>
                </div>
                
            </div>
            <br>
            <br>
            <div class="row">
                <div class="col-sm-6">
                   
                </div>
                <div class="col-sm-6">
                     <button type='submit' value="Submit" name='txt_submit' class="btn btn-primary">SUBMIT</button>
                    <button type='submit' name='txt_submit' class="btn btn-primary">CANCEL</button><br>
                </div>
               
            </div>
            <br>
            </form>

        </div>
    </body>
</html>