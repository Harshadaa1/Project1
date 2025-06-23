<%-- 
    Document   : admin_view_customer
    Created on : Jan 27, 2025, 9:48:21 AM
    Author     : Lenovo
--%>

<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
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
      <th scope="col">Full name</th>
      <th scope="col">Email</th>
      <th scope="col">Contact number</th>
      <th scope="col">Address</th>
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
            String sql="select * from user_register";
            ResultSet result=st.executeQuery(sql);
            while(result.next())
            {
            %>
   
      
      
    <tr>
                  <td><%=result.getString("fname")%></td>
                  <td><%=result.getString("email")%></td>
                  <td><%=result.getString("cnumber")%></td>
                  <td><%=result.getString("address")%></td>
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
