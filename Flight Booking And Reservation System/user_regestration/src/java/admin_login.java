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
public class admin_login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        PrintWriter out=resp.getWriter();
                
                String email=req.getParameter("txt_email");
                String password=req.getParameter("txt_pass");
                String btnlogin=req.getParameter("txt_login");
                
                out.println(email);
                out.println(password);
                
                Database db=new Database();
        out.println(db.Connectdb());
        
                    resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Record Inserted');");
                    out.println("location='admin_view_booking.jsp';");
                    out.println("</script>");
    }
    
}
