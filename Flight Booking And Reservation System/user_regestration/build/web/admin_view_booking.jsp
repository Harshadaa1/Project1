<%-- 
    Document   : admin_view_booking
    Created on : Jan 27, 2025, 9:49:01 AM
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
           body
            {
                background: rgb(238,174,202);
                background: radial-gradient(circle, rgba(238,174,202,1) 0%, rgba(148,187,233,1) 100%);
            } 
        </style>
    </head>
    <body>
        <%@include file="admin_header.jsp" %>

        <table class="table table-bordered">
  <thead>
    <tr>
      <th scope="col">Departure airport</th>
      <th scope="col">Arrival airport</th>
      <th scope="col">Departure date</th>
      <th scope="col">Flight class</th>
      <th scope="col">Adult</th>
      <th scope="col">Child</th>
      <th scope="col">Full name</th>
      <th scope="col">Date of birth</th>
      <th scope="col">Contact number</th>
      <th scope="col">Gender</th>
      <th scope="col">Email</th>
      
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
            String sql="select * from ticket_booking";
            ResultSet result=st.executeQuery(sql);
            while(result.next())
            {
            %>
            <tr>
                <td><%=result.getString("depart_airport")%></td>
                 <td><%=result.getString("arrival_airport")%></td>
                  <td><%=result.getString("depart_date")%></td>
                   <td><%=result.getString("flight_class")%></td>
                   <td><%=result.getString("adult")%></td>
                   <td><%=result.getString("child")%></td>
                   <td><%=result.getString("fullname")%></td>
                   <td><%=result.getString("dob")%></td>
                   <td><%=result.getString("contactno")%></td>
                   <td><%=result.getString("gender")%></td>
                   <td><%=result.getString("email")%></td>
                   
                
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
    </body>
</html>
