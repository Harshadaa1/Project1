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
public class admin_register extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out=resp.getWriter();
        
        String fullname=req.getParameter("txt_name");
        String password=req.getParameter("txt_pass");
        String Contact_number=req.getParameter("txt_num");
        String email=req.getParameter("txt_email");
        String confirm_password=req.getParameter("txt_pass");
        String address=req.getParameter("txt_address");
        String btnsumbit=req.getParameter("txt_submit");
        

        
        out.println(fullname);
        out.println(password);
        out.println(Contact_number);
        out.println(email);
        out.println(confirm_password);
        out.println(address);
        

       Database db=new Database();
        out.println(db.Connectdb());
        
         if(btnsumbit.equals("SUBMIT"))
        {
            String sql=" insert into admin_reg(fname,address,email,pass,confirm_pass,contact_number)values('"+fullname+"','"+address+"','"+email+"','"+password+"','"+confirm_password+"','"+Contact_number+"')";
            String result=db.Query(sql, "Add Successfully");
            out.println(result);
            
                    resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Record Inserted');");
                    out.println("location='Admin_login.jsp';");
                    out.println("</script>");
        }


            }

    
}
