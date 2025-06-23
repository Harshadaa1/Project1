<%-- 
    Document   : Flight_search
    Created on : Jan 8, 2025, 10:07:33 AM
    Author     : Lenovo
--%>

<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Vector"%>
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
            .flight{
                width: 80%;
                height: 150px;
                margin: auto auto auto auto;
                margin-top: 5%;
                border-radius: 50px;
                font-size: 25px;
                padding: 20px;
                border: 2px solid black;
                
                
            }  
            body
            {
                background-image: url("img/f2.jpg");
                background-size: cover;
                
            }
            button{
                text-align: center;
                
                   
            }
          
            select{
                font-size: 20px;
            }
            label{
                font-size: 18px;
            }
            #date{
                font-size: 20px;
            }
            
            .jumbotron
            {
                width: 80%;
                margin: 50px auto auto auto;
                
                
            }
        </style>
    </head>
    <body>
        <%@include file="user_header.jsp" %>
        
         <form action="Flight_search.jsp" method="POSt">
          <h2 style="text-align:center;">FLIGHT SEARCH</h2><hr>   
        <div class="flight">
            <div class="row">
                <div class="col-sm-3">
                       <label>From</label><br>
                       <select name="txt_from" class="form-control">
                           <option>Select places</option>
                           <%
                               
         Connection cn=null;
        Statement st=null;

         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/flight","root","root");
            st=cn.createStatement();
            String sql="select distinct(arrival_airport) from add_flight";
            ResultSet result=st.executeQuery(sql);
            while(result.next())
            {
            
            
            
            
    
    
    %>
                              
                               <option><%=result.getString("arrival_airport")%></option>
                               
                               <%
                               
                               }
         }
        catch(Exception ex)
        {
             out.println(ex.toString());      
         }
                           %>
                          
                       </select>
                    
                </div>
                <div class="col-sm-3">
                        <label>To</label><br>
                        <select name="txt_to" class="form-control">
                            <option>Select Place</option>
                             <%
                               
         
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/flight","root","root");
            st=cn.createStatement();
            String sql="select distinct(departure_airport) from add_flight";
            ResultSet result=st.executeQuery(sql);
            while(result.next())
            {
            
            
            
            
    
    
    %>
                              
                               <option><%=result.getString("departure_airport")%></option>
                               
                               <%
                               
                               }
         }
        catch(Exception ex)
        {
             out.println(ex.toString());      
         }
                           %>
                        </select>

                </div>
                <div class="col-sm-3">
                    
                      <label>Date</label><br>
                    <input id='date' type='date' class="form-control" name='txt_date' min="" required />
                </div>
                <div class="col-sm-3" style=" text-align: center; margin-top: 30px; font-weight: bold;">
                    <button type="submit" name="txt_btn" class="btn btn-primary">Search Flight</button>
                </div>
                
            </div>
        </div>
         </form>
        <%
         
         try
        {
            
           if(request.getParameter("txt_btn")!=null)
           {
            String sql="select * from add_flight where arrival_airport='"+request.getParameter("txt_from")+"' and departure_airport='"+request.getParameter("txt_to")+"'";
            ResultSet result=st.executeQuery(sql);
            while(result.next())
            {
            %>
            <div class="jumbotron" style="padding: 5px; background-color: sown;" >
                 <form action="Flight_Search" method="POST">
                      <input type="hidden" name="flight_id" value="<%=result.getString("flight_id")%>"/>
                     <input type="hidden" name="price" value="<%=result.getString("totalamount")%>"/>
                     <input type="hidden" name="flight_name" value="<%=result.getString("flight_name")%>"/>
                     <input type="hidden" name="arr_air" value="<%=result.getString("arrival_airport")%>"/>
                     <input type="hidden" name="dept_air" value="<%=result.getString("departure_airport")%>"/>
                     <input type="hidden" name="dept_date" value="<%=request.getParameter("txt_date")%>"/>
          <div class="row"  >
              <div class="col-sm-4">
                  
                  
                  <label><%=result.getString("arritime")%></label><br><br>  
               <h2 style="color: #138496"><%=result.getString("flight_name")%></h2><br><br>
                <h4 ><%=result.getString("departure_airport")%></h4><br><br>
<br>
              
            <br>
              </div>
              <div class="col-sm-4">
                  <label><%=result.getString("arritime")%></label><br><br>
                  
                  <h2 style="color: #138496"><%=request.getParameter("txt_date")%></h2><br><br>
            <h4 ><%=result.getString("arrival_airport")%></h4><br><br>
              
 <input type="submit" name="btn" class="btn btn-primary" value="Book Now"/>
                
              </div>
              <div class="col-sm-4">
              
                  <center>
               <h2 style="text-align: center; color: red; font-size: 35px; display: flex; justify-content: center; align-items: center; margin-top: 100px; ">
 ₹ <%= result.getString("totalamount") %>
</h2>
</center>
              
             
              </div>
          </div>
                 </form>
        </div>
            
            
            
            <%
            
            
            }
}
         }
        catch(Exception ex)
        {
             out.println(ex.toString());      
         }
    
    
    %>
       
      
    </body>
</html>
