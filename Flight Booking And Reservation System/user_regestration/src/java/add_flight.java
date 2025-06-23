/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lenovo
 */
public class add_flight extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        String fid=req.getParameter("txt_id");
        String flightname =req.getParameter("txt_flight_name");
        String arrivalairport=req.getParameter("txt_arrival_airport");
        String departureairport=req.getParameter("txt_depart");
        String date=req.getParameter("txt_date");
        String arrivaltime=req.getParameter("txt_arrival_time");
        String departuretime=req.getParameter("txt_departure_time");
        String flightairfare=req.getParameter("txt_price");
        String GST=req.getParameter("txt_gst");
        String Totalamount=req.getParameter("txt_amt");
        
        String btnadd=req.getParameter("btn");
        
        
        
        out.println(fid);
        out.println(flightname);
        out.println(arrivalairport);
        out.println(departureairport);
        out.println(date);
        out.println(arrivaltime);
        out.println(departuretime);
        out.println(flightairfare);
        out.println(GST);
        out.println(Totalamount);
        
        Database db=new Database();
        out.println(db.Connectdb());
        
        if(btnadd.equals("ADD"))
        {
            String sql=" insert into add_flight(flight_name,arritime,departime,gst,totalamount,arrival_airport,departure_airport,date,airfare)values('"+flightname+"','"+arrivaltime+"','"+departuretime+"','"+GST+"','"+Totalamount+"','"+arrivalairport+"','"+departureairport+"','"+date+"','"+flightairfare+"')";
            String result=db.Query(sql, "Add Successfully");
            out.println(result);
            
                    resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Record Inserted');");
                    out.println("location='Add_Flight.jsp';");
                    out.println("</script>");
        }
        
                if(btnadd.equals("Delete"))
        {
            String sql="delete from add_flight where flight_id='"+fid+"' ";
            String result=db.Query(sql, "Deleted Successfully");
            out.println(result);
            
                    resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Record Inserted');");
                    out.println("location='Add_Flight.jsp';");
                    out.println("</script>");
        }
                
                 if(btnadd.equals("Update"))
        {
            String sql = "UPDATE add_flight SET flight_name = '" + flightname + "', arritime = '" + arrivaltime + "', departime = '" + departuretime + "', gst = '" + GST + "', totalamount = '" + Totalamount + "', arrival_airport = '" + arrivalairport + "', departure_airport = '" + departureairport + "', date = '" + date + "', airfare = '" + flightairfare + "' WHERE flight_id = '" + fid + "'";

            String result=db.Query(sql, "Updated Successfully");
            out.println(result);
            
                    resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Record Inserted');");
                    out.println("location='Add_Flight.jsp';");
                    out.println("</script>");
        }

    }

}