<%-- 
    Document   : admin_view_feedback
    Created on : Jan 27, 2025, 9:49:56 AM
    Author     : Lenovo
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
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
      <th scope="col">Flight ID</th>
      <th scope="col">Flight name</th>
      <th scope="col">Date</th>
      <th scope="col">Rating</th>
      <th scope="col">Comments</th>
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
            String sql="select * from feedback";
            ResultSet result=st.executeQuery(sql);
            while(result.next())
            {
            %>
    
      
      <tr>
          <td><%=result.getString("flight_id")%></td>
                 <td><%=result.getString("fname")%></td>
                  <td><%=result.getString("date")%></td>
                   <td><%=result.getString("rating")%></td>
                   <td><%=result.getString("comments")%></td>
                                   
          
      </tr>
      <%
      }
}catch(Exception ex)
{
out.println(ex.toString());
}
      
      
      %>
      
      
      
      
  </tbody>
</table>
    </body>
</html>
