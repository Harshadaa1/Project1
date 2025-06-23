<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="bootstrap.css" />
        <style type="text/css">
            .container{
                width:35%;
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
            button{
                margin-left: 20px;
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
        <script src="validation.js"></script>
        
        <div class="container">
            <form action='upi' method="POST">
            <h2>UPI</h2><hr>
             <div class="row">
                <div class="col-sm-1"></div>
                <div class="col-sm-10">
            <input type="radio" name="upitype">Google Pay
            <input type="radio" name="upitype">Phone Pay
                </div>
             </div><br>
            <div class="row">
                <div class="col-sm-1"></div>
                <div class="col-sm-10">
                    <label>UPI Id</label><br>
                    <input type="text" name="txt_upi" onkeypress="javascript:return isNumber(event)" placeholder="Enter UPI ID" required class='form-control' /><br>
                    
                    <label>Amount</label><br>
                    <input type="text" name="txt_Amo" value="<%=session.getAttribute("total_price")%>" onkeypress="javascript:return isFloat(event)"placeholder="Amount" required class="form-control" />  
                    <br>
                    <br>
                    
                     <div class="row">
                               <br>
                               <br>
                <div class="col-sm-6">
                    <button type="submit" value="ADD" name="btn_pay" class="btn btn-primary">PAY</button>
                </div>
                <div class="col-sm-6">
                    <button type="submit" name="btn_pay" class="btn btn-primary">CANCEL</button>
                </div>
                </div>

                
            </div>
  
        </div>
        </form>
            </div>
    </body>
        </html>