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
public class Flight_Search extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session=req.getSession();
        
        
         session.setAttribute("flight_id", req.getParameter("flight_id"));
        session.setAttribute("price", req.getParameter("price"));
        session.setAttribute("flight_name", req.getParameter("flight_name"));
        session.setAttribute("arr_air", req.getParameter("arr_air"));
        session.setAttribute("dept_air", req.getParameter("dept_air"));
        session.setAttribute("dept_date", req.getParameter("dept_date"));
        resp.sendRedirect("Ticket_booking.jsp");
    }


 }