<%-- 
    Document   : Homepage
    Created on : Mar 4, 2025, 5:14:04 PM
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
                  width: 60%;
                  /*margin: auto;*/
                  /*margin-top: 5%;*/
                  margin-top: 5%;
                 background: transparent;
                  }

                    body{
                   background-image: url("img/user.jpg");
                              background-size: cover;
                              height: 100%;
                          }
                          label{
                              font-size: 120px;
                              margin-left: 80px;
                          }
                          
                          .footer {
                  position: fixed;
                  bottom: 0;
                  width: 100%;
                  background: rgba(0, 0, 0, 0.8); /* Slight transparency */
                  color: white;
                  text-align: center;
                  padding: 10px 0;
              }
              .footer a {
                  color: #f8d210; /* Gold color for links */
                  text-decoration: none;
                  margin: 0 5px;
              }
              .footer a:hover {
                  text-decoration: underline;
              }

        </style>
    </head>
    <body>
        <%@include file="homepagenav.jsp" %>
         <div class="jumbotron" style="background: transparent">
             <h1 style="margin-left: 130px;font-size: 100px">Let your</h1>
             <label>DREAMS</label>
             <h4 style="margin-left: 130px;font-size: 100px">Take Flight</h4>
             
         </div>
         
         <footer class="footer">
    <div class="container text-center">
        <p>&copy; 2025 Travel as much as you can & Make memories.</p>
        <p>Follow us: 
            <a href="#">Facebook</a> | 
            <a href="">Instagram</a> | 
            <a href="#">Twitter</a>
        </p>
    </div>
</footer>

       
    </body>
</html>