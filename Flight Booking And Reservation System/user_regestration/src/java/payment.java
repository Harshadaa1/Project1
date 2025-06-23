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
public class payment extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        PrintWriter out=resp.getWriter();
        
        String cardholdername=req.getParameter("txt_cname");
        String cardnumber=req.getParameter("txt_number");
        String Expirarydate=req.getParameter("txt_exp");
        String cvvno=req.getParameter("txt_cvv");
        String totalamount=req.getParameter("txt_total");
        
        String event=req.getParameter("txt_pay");
        
          out.println(cardholdername);
          out.println(cardnumber);
          out.println(Expirarydate);
          out.println(cvvno);
          out.println(totalamount);
        
        
       
        Database db=new Database();
         out.println(db.Connectdb());
         
         
         if(event.equals("ADD"))
        {
            String sql=" insert into payment(choldername,cnumber,cvvnumber,totalamount,expdate)values('"+cardholdername+"','"+cardnumber+"','"+cvvno+"','"+totalamount+"','"+Expirarydate+"')";
             String result=db.Query(sql, "Add Successfully");
            out.println(result);
          //  resp.sendRedirect("user_view_mybooking.jsp");
          
          
          resp.setContentType("text/html;charset=UTF-8");
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('Record Inserted');");
                    out.println("location='user_view_mybooking.jsp';");
                    out.println("</script>");
        }
    
        
         
         
        
    }
    
}
