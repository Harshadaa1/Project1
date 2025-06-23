<%-- 
    Document   : View_Flight
    Created on : Jan 22, 2025, 11:19:27 AM
    Author     : Lenovo
--%>

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
            .view
            {
             
              
              
              
                margin: auto auto auto auto;
                margin-top: 5%;
                border-radius: 25px;
                
                background-color: transparent;
                border: solid 2px white;
                padding: 20px;
                    
            }
            body
            {
                background-image: url("img/f1.jpg");
                background-size: cover;
            }
            
            
            
        </style>
    </head>
    <body>
        <%@include file="admin_header.jsp" %>  
        
        <div class="row">
            <div class="col-sm-1"></div>
            <div class="col-sm-10">
                <div class="view">
             
             <h2 style="text-align:center;color: white">VIEW FLIGHT</h2>
             <hr>
           
                
 
               <table class="table table-bordered">
  <thead>
      <tr style="color: white;border: solid black">
      
      <th scope="col" style="border: solid black">ID</th>
      <th scope="col">Date</th>
      
      
      <th scope="col" style="border: solid black">Flight name</th>
      <th scope="col" style="border: solid black">Arrival time</th>
      <th scope="col" style="border: solid black">Arrival airport</th>
      <th scope="col" style="border: solid black">Departure time</th>
      <th scope="col" style="border: solid black">Departure airport</th>
      <th scope="col" style="border: solid black">Flight airfare</th>
      <th scope="col" style="border: solid black"> GST </th>
      <th scope="col" style="border: solid black">Total amount</th>


      <th scope="col" style="border: solid black">Action</th>
    </tr>
  </thead>
  <tbody>
      
      <%
         Connection cn=null;
        Statement st=null;
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/flight","root","root");
            st=cn.createStatement();
            String sql="select * from add_flight";
            ResultSet result=st.executeQuery(sql);
            while(result.next())
            {
            %>
            <tr style="border: solid black">
               <form action="add_flight" method="POST">
                <td style="border: solid black">  <input type="text" name="txt_id" value="<%=result.getString("flight_id")%>"  class="form-control" required /> </td>
                <td style="border: solid black"> <input type="date" name="txt_date" value="<%=result.getString("date")%>"  class="form-control" required/></td>
                <td style="border: solid black"> <input type="text" name="txt_flight_name" value="<%=result.getString("flight_name")%>" class="form-control" required/></td>
                <td style="border: solid black"> <input type="time" name="txt_arrival_time"  value="<%=result.getString("arritime")%>" class="form-control"required /></td>
                <td style="border: solid black"> <input type="text" name="txt_arrival_airport"value="<%=result.getString("arrival_airport")%>"  class="form-control" required/></td>
                <td style="border: solid black"> <input type="time" name="txt_departure_time" value="<%=result.getString("departime")%>" class="form-control" required></td>
                <td style="border: solid black"> <input type="text" name="txt_depart" value="<%=result.getString("departure_airport")%>" class="form-control" required></td>
                <td style="border: solid black"> <input type="text" name="txt_price" value="<%=result.getString("airfare")%>" class="form-control" required></td>
                <td style="border: solid black"> <input type="text" name="txt_gst" value="<%=result.getString("gst")%>"  class="form-control" required></td>
                <td style="border: solid black"> <input type="text" name="txt_amt" value="<%=result.getString("totalamount")%>" class="form-control" required ></td>
                 
                
                   
                
                
                <td>
                    <input type="submit" name="btn" value="Update" class="btn btn-primary"/>
                    
                </td>
                <td>
                   
                    <input type="submit" name="btn" value="Delete" class="btn btn-primary"/>
                </td>
                 </form>>   
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
            </div>
            <div class="col-sm-1"></div>
        </div>
        
        
        
        
              
     
          
        </body>
</html>

