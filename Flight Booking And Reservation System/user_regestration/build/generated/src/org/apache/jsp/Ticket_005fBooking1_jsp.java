package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class Ticket_005fBooking1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.css\"/>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .container\n");
      out.write("            {\n");
      out.write("                width:80%;\n");
      out.write("                margin: auto auto auto auto;\n");
      out.write("                margin-top: 5%;\n");
      out.write("                \n");
      out.write("                border-radius: 25px;\n");
      out.write("                \n");
      out.write("                background-color: transparent;\n");
      out.write("                border: solid 2px black;\n");
      out.write("                padding: 20px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                background-image: url(\"img/f2.jpg\");\n");
      out.write("                background-size: cover;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            h2{\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            label{\n");
      out.write("                margin-left:10px; \n");
      out.write("            }\n");
      out.write("             button{\n");
      out.write("                 margin-left: 80px;\n");
      out.write("                 width: 100px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        <script src=\"validation.js\"></script>\n");
      out.write("        \n");
      out.write("             <form action=\"booking\" method=\"POST\">\n");
      out.write("     \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <a href=\"Card_payment.jsp\" style=\"float: right\" class=\"btn btn-warning\">Continue To Payment</a>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                 <div class=\"col-sm-11\">\n");
      out.write("                     \n");
      out.write("                     <label>Ticket id</label><br>\n");
      out.write("                     <input type=\"text\" name=\"txt_id\" placeholder=\"Enter ticket id\" required class=\"form-control \" onkeypress=\"javascript:return isNumber(event)\" /><br>\n");
      out.write(" \n");
      out.write("                     \n");
      out.write("                    <label>Full name</label><br>\n");
      out.write("                    <input type=\"text\" name=\"txt_name\" placeholder=\"Enter Full name\" required class=\"form-control \" onkeypress=\"javascript:return isString(event)\" />\n");
      out.write("                    <br>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-1\">\n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-6\">\n");
      out.write("                    \n");
      out.write("                    ");

                    Date date=new Date();
                    SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
                    String dob=format.format(date);
                    
      out.write("\n");
      out.write("                    <label>Date Of Birth</label><br>\n");
      out.write("                    <input type=\"date\" name=\"txt_dob\" max=\"");
      out.print(dob);
      out.write("\" required class=\"form-control\" /><br>\n");
      out.write("                    \n");
      out.write("                    <label>Gender</label><br>\n");
      out.write("                    <select name='txt_gender' class=\"form-control\"><option>Select Gender</option><option>MALE</option><option>FEMALE</option></select><br>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-6\">\n");
      out.write("                    <label>Contact Number</label><br>\n");
      out.write("                    <input type=\"text\" name=\"txt_contact\" placeholder=\"Enter Contact Number\" required class=\"form-control\" onkeypress=\"javascript:return isContact(event)\" maxlength=\"10\" />\n");
      out.write("                    <br>\n");
      out.write("                    \n");
      out.write("                    <label>Email</label><br>\n");
      out.write("                    <input type=\"email\" name=\"txt_email\" placeholder=\"Enter Email\" required class=\"form-control\" ><br>\n");
      out.write("                    \n");
      out.write("                  \n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <button class=\"btn btn-primary\" value=\"Submit\" name=\"txt_btn\" type=\"submit\" >ADD</button>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("            </form>\n");
      out.write("    </body><br>\n");
      out.write("    <div class=\"jumbotron\" style=\"background: transparent;border: 3px solid black\">\n");
      out.write("        \n");
      out.write("            \n");
      out.write("        <div class=\"row\">\n");
      out.write("            <table class=\"table table-bordered table-primary\">\n");
      out.write("  <thead>\n");
      out.write("    <tr>\n");
      out.write("      \n");
      out.write("      <th scope=\"col\" style=\"border: solid black\">Full name</th>\n");
      out.write("      <th scope=\"col\" style=\"border: solid black\">Date of birth</th>\n");
      out.write("      <th scope=\"col\" style=\"border: solid black\">Contact number</th>\n");
      out.write("      <th scope=\"col\" style=\"border: solid black\">Gender</th>\n");
      out.write("      <th scope=\"col\" style=\"border: solid black\">Email</th>\n");
      out.write("      \n");
      out.write("         <th scope=\"col\" style=\"border: solid black\">Action</th>\n");
      out.write("\n");
      out.write("    </tr>\n");
      out.write("  </thead>\n");
      out.write("  <tbody>\n");
      out.write("     ");

         Connection cn=null;
        Statement st=null;
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/flight","root","root");
            st=cn.createStatement();
            String sql="select * from ticket_booking";
            ResultSet result=st.executeQuery(sql);
            while(result.next())
            {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("  <form action=\"booking\" method=\"POST\">\n");
      out.write("      <input type=\"hidden\" name=\"txt_bid\" value=\"");
      out.print(result.getString("bid"));
      out.write("\"/>\n");
      out.write("                <td style=\"border: solid black\"> ");
      out.print(result.getString("fullname"));
      out.write("</td>\n");
      out.write("                 <td style=\"border: solid black\"> ");
      out.print(result.getString("dob"));
      out.write("</td>\n");
      out.write("                  <td style=\"border: solid black\"> ");
      out.print(result.getString("contactno"));
      out.write("</td>\n");
      out.write("                   <td style=\"border: solid black\"> ");
      out.print(result.getString("gender"));
      out.write("</td>\n");
      out.write("                   <td style=\"border: solid black\"> ");
      out.print(result.getString("email"));
      out.write("</td>\n");
      out.write("                   <td style=\"border: solid black\"> <button type=\"submit\" name=\"txt_btn\" value=\"Delete\">Delete</button></td>\n");
      out.write("  </form>    \n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            ");

            
            
            }
         }
        catch(Exception ex)
        {
             out.println(ex.toString());      
         }
    
    
    
      out.write("\n");
      out.write("      \n");
      out.write("  </tbody>\n");
      out.write("            </table>\n");
      out.write("    \n");
      out.write("        </div>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
