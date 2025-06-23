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
public class upi extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        PrintWriter out=resp.getWriter();
        
        String upiid=req.getParameter("txt_upi");
        String amount=req.getParameter("txt_Amo");
        String event=req.getParameter("btn_pay");
        
        out.println(upiid);;
        out.println(amount);
        
         Database db=new Database();
        out.println(db.Connectdb());
        
        if(event.equals("ADD"))
        {
            String sql=" insert into upi(amount)values('"+amount+"')";
             String result=db.Query(sql, "Add Successfully");
            out.println(result);
            resp.sendRedirect("user_view_mybooking.jsp");
        }
    
        
    }
    
}
