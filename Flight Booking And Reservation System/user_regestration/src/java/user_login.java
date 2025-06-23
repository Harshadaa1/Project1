/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lenovo
 */
public class user_login extends HttpServlet {

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
        
        Connection cn=null;
        Statement st=null;
        HttpSession session=req.getSession();
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/flight","root","root");
            st=cn.createStatement();
            String sql="select * from user_register where email='"+email+"' and pass='"+password+"'";
            ResultSet result=st.executeQuery(sql);
            if(result.next())
            {
                session.setAttribute("contact", result.getString("cnumber"));
            resp.sendRedirect("Flight_search.jsp");
            
            }
         }
        catch(Exception ex)
        {
             out.println(ex.toString());      
         }
    }
    
}
