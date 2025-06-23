/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Lenovo
 */
public class feedback extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out=resp.getWriter();
        
         String flightid=req.getParameter("txt_id");
         String flightname=req.getParameter("txt_name");
         String rating=req.getParameter("rating");
         
          String comments=req.getParameter("txt_comments");
         String event=req.getParameter("txt_submit");
         
         
           out.println(flightid);
           out.println(flightname);
           out.println(rating);
          
           out.println(comments);
           
           Database db=new Database();
        out.println(db.Connectdb());
        if(event.equals("Submit"))
        {
            Date current_date=new Date();
            SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
            String feedbac_date=format.format(current_date);
            
                    
            String sql=" insert into feedback(fname,rating,comments,date)values('"+flightname+"','"+rating+"','"+comments+"','"+feedbac_date+"')";
            String result=db.Query(sql, "Add Successfully");
            out.println(result);
            
                    resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Record Inserted');");
                    out.println("location='Flight_search.jsp';");
                    out.println("</script>");
           
        }
    }
    
}