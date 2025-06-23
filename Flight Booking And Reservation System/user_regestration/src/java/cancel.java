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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lenovo
 */
public class cancel extends HttpServlet {

  @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out=resp.getWriter();
     
        String ticket_id=req.getParameter("txt_id");
        String reason=req.getParameter("reason");
        
        out.println(ticket_id);
        out.println(reason);
        
        Date date=new Date();
        
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        String cdate=format.format(date);
        
        Database db=new Database();
        db.Connectdb();
        HttpSession session=req.getSession();
        String sql="insert into cacellation(ticket_id,reason,cdate,contact) values('"+ticket_id+"','"+reason+"','"+cdate+"','"+session.getAttribute("contact")+"')";
        String result=db.Query(sql, "Ticket Cancel Successfully");
        
        db.Query("update ticket_booking set stats='Cancel',reason='"+reason+"' where bid='"+ticket_id+"'", "Booking Cancel");
        
        resp.sendRedirect("user_view_cancelbooking.jsp");
        
                   
    }
}
