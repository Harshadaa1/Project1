<%-- 
    Document   : UserLogin
    Created on : 27 Dec, 2024, 9:23:26 AM
    Author     : CODE EXPERT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="bootstrap.css"/>
        <style type="text/css">
            .jumbotron
            {
                width: 35%;
          
                margin: auto auto auto auto;
                
                margin-top: 5%;
                border-radius:25px;
                margin-left: 10%;
                background-color: transparent;
                border: 2px solid black;
              
            }
            button{
                margin-left: 180px;
            }
            body
            {
                background-image: url("img/user.jpg");
            background-size: cover;
            }
            label{
                margin-left: 10px;            
            }
              
            a{
                color: white;
            }
                       
        </style>
    </head>
    <body>
        
        <div class="jumbotron">
            <form action="user_login" method="POST">
            <h2 style="text-align: center;">LOGIN</h2><hr>
                            <label>Email</label><br>
                    <input id="in"  type="email" name="txt_email" placeholder="Enter email"  required class="form-control w-75" /><br>
                    
                    <label>Password</label><br>
                    <input id="in" type="password" name="txt_pass" placeholder="Enter password" required class="form-control w-75" /><br>
                    
                  <div class="row">
                <div class="col-sm-6">
                    <input style=" margin-left: 10px;" type="checkbox" name="sub_value" value="REMEBER ME"<p>     REMEBER ME</p>
                </div>
              <div class="col-sm-6">         
                              
             </div>

            </div>
                    <button type="submit" name="txt_login" class="btn btn-primary">LOGIN</button><br><hr>
            <div>           
                <p>DO YOU HAVE AN ACCOUNT ?<a href="User_registration.jsp">REGISTER</a></p>
</div>
            
                    </form>
        </div>
        
    </body>
</html>
                           
          