package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class user_005fview_005fcancelbooking_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/user_header.jsp");
  }

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.css\"/>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                background: rgb(238,174,202);\n");
      out.write("                background: radial-gradient(circle, rgba(238,174,202,1) 0%, rgba(148,187,233,1) 100%);\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.css\" />\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("  <a class=\"navbar-brand\" href=\"#\">Flight Booking And Reservation System</a>\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("      <li class=\"nav-item active\">\n");
      out.write("        <a class=\"nav-link\" href=\"#\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"Flight_search.jsp\">Flight search</a>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"user_view_mybooking.jsp\">My booking</a>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("\n");
      out.write("     \n");
      out.write("     <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link disabled\" href=\"user_feedback.jsp\">User Feedback</a>\n");
      out.write("      </li>\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link disabled\" href=\"user_view_cancelbooking.jsp\">Cancel booking</a>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("    </ul>\n");
      out.write("    <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("     \n");
      out.write("      <button class=\"btn btn-danger\" type=\"submit\">Logout</button>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("         <table class=\"table table-bordered\">\n");
      out.write("  <thead>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"col\">Departure airport</th>\n");
      out.write("      <th scope=\"col\">Arrival airport</th>\n");
      out.write("      <th scope=\"col\">Departure date</th>\n");
      out.write("      <th scope=\"col\">Flight class</th>\n");
      out.write("      <th scope=\"col\">Adult</th>\n");
      out.write("      <th scope=\"col\">Child</th>\n");
      out.write("      <th>Reason</th>\n");
      out.write("    \n");
      out.write("    </tr>\n");
      out.write("  </thead>\n");
      out.write("  <tbody>\n");
      out.write("    ");

         Connection cn=null;
        Statement st=null;
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/flight","root","root");
            st=cn.createStatement();
            String sql="select * from ticket_booking where contact='"+session.getAttribute("contact")+"' and stats='Cancel'";
            ResultSet result=st.executeQuery(sql);
            while(result.next())
            {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("  <form action=\"Cancellation.jsp\" method=\"POST\">\n");
      out.write("                <td>");
      out.print(result.getString("depart_airport"));
      out.write("</td>\n");
      out.write("                 <td>");
      out.print(result.getString("arrival_airport"));
      out.write("</td>\n");
      out.write("                  <td>");
      out.print(result.getString("depart_date"));
      out.write("</td>\n");
      out.write("                   <td>");
      out.print(result.getString("flight_class"));
      out.write("</td>\n");
      out.write("                   <td>");
      out.print(result.getString("adult"));
      out.write("</td>\n");
      out.write("                   <td>");
      out.print(result.getString("child"));
      out.write("</td>\n");
      out.write("                   <td>");
      out.print(result.getString("reason"));
      out.write("</td>\n");
      out.write("                   \n");
      out.write("                  \n");
      out.write("  </form>\n");
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
      out.write("  </tbody>\n");
      out.write("</table>\n");
      out.write("    </body>\n");
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
