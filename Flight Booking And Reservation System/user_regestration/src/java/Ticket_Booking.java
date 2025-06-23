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
public class Ticket_Booking extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
         HttpSession session=req.getSession();
        session.setAttribute("flight_class", req.getParameter("txt_flightclass"));
        session.setAttribute("adult", req.getParameter("txt_adult"));
        session.setAttribute("child", req.getParameter("txt_child"));
        session.setAttribute("total_price", "0");
        resp.sendRedirect("Ticket_Booking1.jsp");
        
        
        
        
    }

    
}