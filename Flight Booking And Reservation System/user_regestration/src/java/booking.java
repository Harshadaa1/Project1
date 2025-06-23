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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lenovo
 */
public class booking extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out=resp.getWriter();
        
        
        
        String fullname=req.getParameter("txt_name");
        String dob=req.getParameter("txt_dob");
        String contactnumber=req.getParameter("txt_contact");
        String gender=req.getParameter("txt_gender");
        String email=req.getParameter("txt_email");
        String event=req.getParameter("txt_btn");
        String bid=req.getParameter("txt_bid");

       
        out.println(fullname);
        out.println(dob);
        out.println(contactnumber);
        out.println(gender);
        out.println(email);
        


        HttpSession session=req.getSession();
        Database db=new Database();
        out.println(db.Connectdb());
        
        if(event.equals("Submit"))
        {
            String sql=" insert into ticket_booking(depart_airport,depart_date,flight_class,fullname,dob,contactno,gender,email,adult,child,arrival_airport,contact)values('"+session.getAttribute("dept_air")+"','"+session.getAttribute("dept_date")+"','"+session.getAttribute("flight_class")+"','"+fullname+"','"+dob+"','"+contactnumber+"','"+gender+"','"+email+"','"+session.getAttribute("adult")+"','"+session.getAttribute("child")+"','"+session.getAttribute("arr_air")+"','"+session.getAttribute("contact")+"')";
            String result=db.Query(sql, "Add Successfully");
            out.println(result);
            float total_price=Float.parseFloat(session.getAttribute("price").toString())+Float.parseFloat(session.getAttribute("total_price").toString());
            session.setAttribute("total_price", total_price);
            resp.sendRedirect("Ticket_Booking1.jsp");
        }
        
        if(event.equals("Delete"))
        {
            String sql="delete from ticket_booking where bid='"+bid+"'";
            String result=db.Query(sql, "Deleted Successfully");
            out.println(result);
            resp.sendRedirect("Ticket_Booking1.jsp");
        }
        
    }
    
}
