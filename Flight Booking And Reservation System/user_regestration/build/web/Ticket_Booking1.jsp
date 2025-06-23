<%-- 
    Document   : Ticket_Booking1
    Created on : Feb 3, 2025, 2:17:46 PM
    Author     : Lenovo
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
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
                width:80%;
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
       
        <script src="validation.js"></script>
        
             <form action="booking" method="POST">
     
        <div class="container">
            <a href="Card_payment.jsp" style="float: right" class="btn btn-warning">Continue To Payment</a>
            <div class="row">
                 <div class="col-sm-11">
                     
                     <label>Ticket id</label><br>
                     <%
         Connection cn=null;
        Statement st=null;
        int id=1;
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/flight","root","root");
            st=cn.createStatement();
            String sql="select * from ticket_booking";
            ResultSet result=st.executeQuery(sql);
            while(result.next())
            {
            id=Integer.parseInt(result.getString("bid"))+1;
            
            
            }
         }
        catch(Exception ex)
        {
             out.println(ex.toString());      
         }
    
    
    %>
    <input type="text" name="txt_id" value="<%=id%>" placeholder="Enter ticket id" required class="form-control " onkeypress="javascript:return isNumber(event)" /><br>
 
                     
                    <label>Full name</label><br>
                    <input type="text" name="txt_name" placeholder="Enter Full name" required class="form-control " onkeypress="javascript:return isString(event)" />
                    <br>
                </div>
                <div class="col-sm-1">
                  
                </div>
                <div class="col-6">
                    
                    <%
                    Date date=new Date();
                    SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
                    String dob=format.format(date);
                    %>
                    <label>Date Of Birth</label><br>
                    <input type="date" name="txt_dob" max="<%=dob%>" required class="form-control" /><br>
                    
                    <label>Gender</label><br>
                    <select name='txt_gender' class="form-control"><option>Select Gender</option><option>MALE</option><option>FEMALE</option></select><br>
                </div>
                <div class="col-6">
                    <label>Contact Number</label><br>
                    <input type="text" name="txt_contact" placeholder="Enter Contact Number" required class="form-control" onkeypress="javascript:return isContact(event)" maxlength="10" />
                    <br>
                    
                    <label>Email</label><br>
                    <input type="email" name="txt_email" placeholder="Enter Email" required class="form-control" ><br>
                    
                  
                    
                </div>
                <button class="btn btn-primary" value="Submit" name="txt_btn" type="submit" >ADD</button>
            </div>
            
        </div>
               
            </div>
            </form>
    </body><br>
    <div class="jumbotron" style="background: transparent;border: 3px solid black">
        
            
        <div class="row">
            <table class="table table-bordered table-primary">
  <thead>
    <tr>
      
      <th scope="col" style="border: solid black">Full name</th>
      <th scope="col" style="border: solid black">Date of birth</th>
      <th scope="col" style="border: solid black">Contact number</th>
      <th scope="col" style="border: solid black">Gender</th>
      <th scope="col" style="border: solid black">Email</th>
      
         <th scope="col" style="border: solid black">Action</th>

    </tr>
  </thead>
  <tbody>
     <%
       
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/flight","root","root");
            st=cn.createStatement();
            String sql="select * from ticket_booking";
            ResultSet result=st.executeQuery(sql);
            while(result.next())
            {
            %>
            <tr>
  <form action="booking" method="POST">
      <input type="hidden" name="txt_bid" value="<%=result.getString("bid")%>"/>
                <td style="border: solid black"> <%=result.getString("fullname")%></td>
                 <td style="border: solid black"> <%=result.getString("dob")%></td>
                  <td style="border: solid black"> <%=result.getString("contactno")%></td>
                   <td style="border: solid black"> <%=result.getString("gender")%></td>
                   <td style="border: solid black"> <%=result.getString("email")%></td>
                   <td style="border: solid black"> <button type="submit" name="txt_btn" value="Delete">Delete</button></td>
  </form>    
                
            </tr>
            
            
            
            <%
            
            
            }
         }
        catch(Exception ex)
        {
             out.println(ex.toString());      
         }
    
    
    %>
      
  </tbody>
            </table>
    
        </div>
</html>
