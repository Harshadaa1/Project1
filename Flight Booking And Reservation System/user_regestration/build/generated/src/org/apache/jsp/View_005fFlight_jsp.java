package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class View_005fFlight_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/admin_header.jsp");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"bootstrap.css\"/>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .view\n");
      out.write("            {\n");
      out.write("             \n");
      out.write("              \n");
      out.write("              \n");
      out.write("              \n");
      out.write("                margin: auto auto auto auto;\n");
      out.write("                margin-top: 5%;\n");
      out.write("                border-radius: 25px;\n");
      out.write("                \n");
      out.write("                background-color: transparent;\n");
      out.write("                border: solid 2px white;\n");
      out.write("                padding: 20px;\n");
      out.write("                    \n");
      out.write("            }\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                background-image: url(\"img/f1.jpg\");\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
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
      out.write("      <li class=\"nav-item\">\n");
      out.write("          <a class=\"nav-link\" href=\"Add_Flight.jsp\">Add Flight</a>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("       <li class=\"nav-item\">\n");
      out.write("           <a class=\"nav-link\" href=\"admin_view_customer.jsp\">Customer Details</a>\n");
      out.write("      </li>\n");
      out.write("      \n");
      out.write("         <li class=\"nav-item\">\n");
      out.write("             <a class=\"nav-link\" href=\"admin_view_booking.jsp\">Booking Details</a>\n");
      out.write("      </li> \n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"admin_view_cancel.jsp\">Cancel Booking</a>\n");
      out.write("      </li> \n");
      out.write("      \n");
      out.write("       <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link\" href=\"admin_view_feedback.jsp\">Feedback</a>\n");
      out.write("      </li> \n");
      out.write("      \n");
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
      out.write("  \n");
      out.write("        \n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-1\"></div>\n");
      out.write("            <div class=\"col-sm-10\">\n");
      out.write("                <div class=\"view\">\n");
      out.write("             \n");
      out.write("             <h2 style=\"text-align:center;color: white\">VIEW FLIGHT</h2>\n");
      out.write("             <hr>\n");
      out.write("           \n");
      out.write("                \n");
      out.write(" \n");
      out.write("               <table class=\"table table-bordered\">\n");
      out.write("  <thead>\n");
      out.write("      <tr style=\"color: white;border: solid black\">\n");
      out.write("      \n");
      out.write("      <th scope=\"col\" style=\"border: solid black\">ID</th>\n");
      out.write("      <th scope=\"col\">Date</th>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("      <th scope=\"col\" style=\"border: solid black\">Flight name</th>\n");
      out.write("      <th scope=\"col\" style=\"border: solid black\">Arrival time</th>\n");
      out.write("      <th scope=\"col\" style=\"border: solid black\">Arrival airport</th>\n");
      out.write("      <th scope=\"col\" style=\"border: solid black\">Departure time</th>\n");
      out.write("      <th scope=\"col\" style=\"border: solid black\">Departure airport</th>\n");
      out.write("      <th scope=\"col\" style=\"border: solid black\">Flight airfare</th>\n");
      out.write("      <th scope=\"col\" style=\"border: solid black\"> GST </th>\n");
      out.write("      <th scope=\"col\" style=\"border: solid black\">Total amount</th>\n");
      out.write("\n");
      out.write("\n");
      out.write("      <th scope=\"col\" style=\"border: solid black\">Action</th>\n");
      out.write("    </tr>\n");
      out.write("  </thead>\n");
      out.write("  <tbody>\n");
      out.write("      \n");
      out.write("      ");

         Connection cn=null;
        Statement st=null;
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/flight","root","root");
            st=cn.createStatement();
            String sql="select * from add_flight";
            ResultSet result=st.executeQuery(sql);
            while(result.next())
            {
            
      out.write("\n");
      out.write("            <tr style=\"border: solid black\">\n");
      out.write("               <form action=\"add_flight\" method=\"POST\">\n");
      out.write("                <td style=\"border: solid black\">  <input type=\"text\" name=\"txt_id\" value=\"");
      out.print(result.getString("flight_id"));
      out.write("\"  class=\"form-control\" required /> </td>\n");
      out.write("                <td style=\"border: solid black\"> <input type=\"date\" name=\"txt_date\" value=\"");
      out.print(result.getString("date"));
      out.write("\"  class=\"form-control\" required/></td>\n");
      out.write("                <td style=\"border: solid black\"> <input type=\"text\" name=\"txt_flight_name\" value=\"");
      out.print(result.getString("flight_name"));
      out.write("\" class=\"form-control\" required/></td>\n");
      out.write("                <td style=\"border: solid black\"> <input type=\"time\" name=\"txt_arrival_time\"  value=\"");
      out.print(result.getString("arritime"));
      out.write("\" class=\"form-control\"required /></td>\n");
      out.write("                <td style=\"border: solid black\"> <input type=\"text\" name=\"txt_arrival_airport\"value=\"");
      out.print(result.getString("arrival_airport"));
      out.write("\"  class=\"form-control\" required/></td>\n");
      out.write("                <td style=\"border: solid black\"> <input type=\"time\" name=\"txt_departure_time\" value=\"");
      out.print(result.getString("departime"));
      out.write("\" class=\"form-control\" required></td>\n");
      out.write("                <td style=\"border: solid black\"> <input type=\"text\" name=\"txt_depart\" value=\"");
      out.print(result.getString("departure_airport"));
      out.write("\" class=\"form-control\" required></td>\n");
      out.write("                <td style=\"border: solid black\"> <input type=\"text\" name=\"txt_price\" value=\"");
      out.print(result.getString("airfare"));
      out.write("\" class=\"form-control\" required></td>\n");
      out.write("                <td style=\"border: solid black\"> <input type=\"text\" name=\"txt_gst\" value=\"");
      out.print(result.getString("gst"));
      out.write("\"  class=\"form-control\" required></td>\n");
      out.write("                <td style=\"border: solid black\"> <input type=\"text\" name=\"txt_amt\" value=\"");
      out.print(result.getString("totalamount"));
      out.write("\" class=\"form-control\" required ></td>\n");
      out.write("                <td style=\"border: solid black\"> <input type=\"text\" name=\"txt_action\" value=\"");
      out.print(result.getString("action"));
      out.write("\" class=\"form-control\" required ></td>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                   \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <td>\n");
      out.write("                    <input type=\"submit\" name=\"btn\" value=\"Update\" class=\"btn btn-primary\"/>\n");
      out.write("                    \n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                   \n");
      out.write("                    <input type=\"submit\" name=\"btn\" value=\"Delete\" class=\"btn btn-primary\"/>\n");
      out.write("                </td>\n");
      out.write("                 </form>>   \n");
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
      out.write("      </tbody>\n");
      out.write("</table>\n");
      out.write("                \n");
      out.write("                \n");
      out.write(" </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-1\"></div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("              \n");
      out.write("     \n");
      out.write("          \n");
      out.write("        </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
