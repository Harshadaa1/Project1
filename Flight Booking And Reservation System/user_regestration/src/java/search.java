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
public class search extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        PrintWriter out=resp.getWriter();
        String from=req.getParameter("txt_place");
         String to=req.getParameter("txt_select");
          String date=req.getParameter("txt_date");
          
          
          
          out.println(from);
          out.println(to);
          out.println(date);
          
          Database db=new Database();
        out.println(db.Connectdb());
    }
    
}
