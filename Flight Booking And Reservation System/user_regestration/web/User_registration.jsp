<%-- 
    Document   : new_reg
    Created on : Dec 28, 2024, 12:14:25 PM
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
               .jumbotron
            {
                               /* font-family: serif;*/

                width: 40%;
                margin: auto auto auto auto;
                margin-top: 5%;
                margin-left: 10%;
                color: Black;
                border-radius: 25px;
               background-color: transparent;
               border: 2px solid black;
                
                
            }
          
            body{
             background-image: url("img/user.jpg");
            background-size: cover;
                
            }
            button{
                margin-left: 40px;
            }
            label
            {
                font-size: 15;
                margin-left: 10px;
            
            }
            
        </style>
    </head>
    <body>
        <script src="validation.js"></script>
        <div class="jumbotron">
            <form action="user_reg" method="POST">
            <h2 style="text-align: center;">  REGISTRATION  </h2><hr>
            <div class="row">
                <div class="col-sm-6">
                  <label>Full-name</label><br>
                    <input  type="text" onkeypress="javascript:return isString(event)" name="txt_name" placeholder="Enter full name" required class="form-control w-75" /><br>
                    
                    <label>Password</label><br>
                    <input type="password" name="txt_pass" placeholder="Enter password" required class="form-control w-75" /><br>
                      
                    <label>Contact-number</label><br>
                    <input type="text" onkeypress="javascript:return isNumber(event)" maxlength="10" minlength="10" name="txt_num" placeholder="Enter contact number"   required class="form-control w-75" /><br>

                </div>
                <div class="col-sm-6">                
                    
                    <label>Email</label><br>
                    <input  type="email" name="txt_email"  placeholder="Enter email" required class="form-control w-75" /><br>
                    
                    
                    <label>Confirm Password</label><br>
                    <input type="password"  name="txt_pass" placeholder="Enter confirm password"  required class="form-control w-75" /><br>
                    

                    <label>Address</label><br>
 
                    <textarea class="form-control w-75" placeholder="Enter Address" name="txt_address"   ></textarea><br>

                   
               </div>

            </div>
            <div class="row">
                <div class="col-sm-6">
                    <button type="submit" name="txt_submit" value="Submit" class="btn btn-primary">SUBMIT</button>
                    
                </div>
                <div class="col-sm-6">
                    <button type="cancel" name="txt_submit" class="btn btn-primary">CANCEL</button>
                   
                </div>
                
            </div>
            </form>
        </div>
    </body>
</html>