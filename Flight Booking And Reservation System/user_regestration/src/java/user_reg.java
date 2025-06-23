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
public class user_reg extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out=resp.getWriter();
        
        String fullname=req.getParameter("txt_name");
        String password=req.getParameter("txt_pass");
        String Contact_number=req.getParameter("txt_num");
        String email=req.getParameter("txt_email");
        String confirm_password=req.getParameter("txt_pass");
        String address=req.getParameter("txt_address");
        String event=req.getParameter("txt_submit");

        
        out.println(fullname);
        out.println(Contact_number);
        out.println(email);
        out.println(password);

        out.println(confirm_password);
        out.println(address);
        
        Database db=new Database();
        out.println(db.Connectdb());

        if(event.equals("Submit"))
        {
            String sql=" insert into user_register(fname,email,pass,cpass,cnumber,address)values('"+fullname+"','"+email+"','"+password+"','"+confirm_password+"','"+Contact_number+"','"+address+"')";
            String result=db.Query(sql, "Add Successfully");
            out.println(result);
            
            resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Record Inserted');");
                    out.println("location='User_login.jsp';");
                    out.println("</script>");
        }
    }

    
}
