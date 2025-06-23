<%-- 
    Document   : Booking_Report
    Created on : Mar 12, 2025, 7:20:45 PM
    Author     : Lenovo
--%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bill Format</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .bill-container {
            max-width: 100%;
            margin: 20px auto;
            padding: 20px;
            border: 2px solid #000;
            border-radius: 10px;
            background: #f8f9fa;
        }
        .bill-header {
            text-align: center;
            font-size: 1.8rem;
            font-weight: bold;
            margin-bottom: 20px;
        }
        .bill-info {
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
    
    <div class="container">
        <div class="jumbotron bill-container">
            <div class="bill-header">Booking Report</div>
             <%
        Connection cn=null;
        Statement st=null;
        
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/flight","root","root");
            st=cn.createStatement();
            String sql="select * from ticket_booking where contact='"+session.getAttribute("contact")+"'";
            ResultSet result=st.executeQuery(sql);
            if(result.next())
            {
                %>
                
                <div class="bill-info">
                <p><strong>Arrival Airport:</strong> <%=result.getString("arrival_airport")%></p>
                <p><strong>Departure Airport:</strong> <%=result.getString("depart_airport")%></p>
                <p><strong>Flight Class:</strong><%=result.getString("flight_class")%> </p>
                <p><strong>Contact:</strong> <%=result.getString("contact")%></p>
            </div> 
                
                
                <%
            
            
            }
         }
        catch(Exception ex)
        {
             out.println(ex.toString());      
         }
    
    
    %>
            
            <table class="table table-bordered">
                <thead class="table-light">
                    <tr>
                        <th>Name</th>
                        <th>DOB</th>
                        <th>Gender</th>
                        <th>Adult</th>
                        <th>Child</th>
                    </tr>
                </thead>
                <tbody>
                    <%
    
        
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/flight","root","root");
            st=cn.createStatement();
            String sql="select * from ticket_booking where contact='"+session.getAttribute("contact")+"'";
            ResultSet result=st.executeQuery(sql);
            while(result.next())
            {
                %>
                
              <tr>
                        <td><%=result.getString("fullname")%></td>
                        <td><%=result.getString("dob")%></td>
                        <td><%=result.getString("gender")%></td>
                        <td><%=result.getString("adult")%></td>
                        <td><%=result.getString("child")%></td>
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
      <a href="#" class="btn btn-primary" onclick="printPage()">Print</a>
        </div>
    </div>
    <script>
function printPage() {
    window.print();
}
</script>
</body>
</html>
