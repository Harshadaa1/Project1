package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class Add_005fFlight_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.css\"/>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .container\n");
      out.write("            {\n");
      out.write("                /*background-color: black;*/\n");
      out.write("                \n");
      out.write("                margin: auto auto auto auto;\n");
      out.write("                margin-top: 5%;\n");
      out.write("                border-radius: 25px;\n");
      out.write("                margin-right: 12px;\n");
      out.write("                background-color: transparent;\n");
      out.write("                border: solid 2px white;\n");
      out.write("                padding: 20px;\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                /*color: white;*/\n");
      out.write("            }\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                background-image: url(\"img/f1.jpg\");\n");
      out.write("                background-size: cover;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("           \n");
      out.write("   \n");
      out.write("            h2{\n");
      out.write("                text-align: center;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            label{\n");
      out.write("                margin-left: 5px;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            button{\n");
      out.write("                margin-left: 70px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("            function cal()\n");
      out.write("            {\n");
      out.write("                \n");
      out.write("                var a=document.getElementById(\"gst\").value;\n");
      out.write("                var b=document.getElementById(\"price\").value;\n");
      out.write("                var c=b*a/100;\n");
      out.write("                document.getElementById(\"amount\").value=parseInt(b)+parseInt(c);\n");
      out.write("            }\n");
      out.write("        </script>\n");
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
      out.write("\n");
      out.write("        <script src=\"validation.js\"></script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-5\">\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-6\">\n");
      out.write("                <div class=\"container\"  >\n");
      out.write("            <form action=\"add_flight\" method=\"POSt\">\n");
      out.write("                <h2 style=\"color: white;\">ADD FLIGHT</h2><hr>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <label>Flight id</label><br>\n");
      out.write("                    <input type=\"text\" name=\"txt_id\" onkeypress=\"javascript:return isNumber(event)\" placeholder=\"Enter id\" class=\"form-control\" required /><br>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <label>Flight Name</label>\n");
      out.write("                    <input id=\"input\" type=\"text\" name=\"txt_flight_name\" onkeypress=\"javascript:return isString(event)\" class=\"form-control\" placeholder=\"Enter flight name\" required /><br>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <label>Arrival Airport</label>\n");
      out.write("                    <input id=\"input\" type=\"text\" name=\"txt_arrival_airport\" onkeypress=\"javascript:return isString(event)\" class=\"form-control\" placeholder=\"Enter airport name\" required/><br>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <label>Departure Airport</label>\n");
      out.write("                    <input id=\"input\" type=\"text\" name=\"txt_depart\" onkeypress=\"javascript:return isString(event)\" placeholder=\"Enter airport name\" class=\"form-control\" required/><br>\n");
      out.write("                    \n");
      out.write("                    <label>GST</label>\n");
      out.write("                    <input  type=\"text\" onkeyup=\"cal()\" id=\"gst\" name=\"txt_gst\" onkeypress=\"javascript:return isFloat(event)\" placeholder=\"Enter GST\" class=\"form-control\" required/><br>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                   \n");
      out.write("                    <br>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                  \n");
      out.write("                     ");

                    Date date=new Date();
                    SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
                    String dob=format.format(date);
                    
      out.write("\n");
      out.write("                    <label>Date</label><br>\n");
      out.write("                    <input type=\"date\" name=\"txt_date\" min=\"");
      out.print(dob);
      out.write("\" placeholder=\"Enter date\" class=\"form-control\" required/><br>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <label>Arrival Time</label><br>\n");
      out.write("                    <input type=\"time\" name=\"txt_arrival_time\" placeholder=\"Enter time\" class=\"form-control\" required/><br>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <label>Departure Time</label><br>\n");
      out.write("                    <input type=\"time\" name=\"txt_departure_time\" placeholder=\"Time \" class=\"form-control\" required/><br>\n");
      out.write("                   \n");
      out.write("                    \n");
      out.write("                    <label>Flight Airfare</label><br>\n");
      out.write("                    <input type=\"text\" name=\"txt_price\"  onkeyup=\"cal()\"  id=\"price\" onkeypress=\"javascript:return isFloat(event)\"placeholder=\"Price\" class=\"form-control\" required/><br>\n");
      out.write("                    \n");
      out.write("                    <label>Total Amount</label><br>\n");
      out.write("                    <input  type=\"text\"  onkeyup=\"cal()\"  name=\"txt_amt\" id=\"amount\"  placeholder=\"Enter total amount\" onkeypress=\"javascript:return isFloat(event)\" class=\"form-control\" required/><br>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                   \n");
      out.write("                                    \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-12\">\n");
      out.write("                            <center><button type=\"submit\" name=\"btn\"  value=\"ADD\" class=\"btn btn-primary\">ADD</button>\n");
      out.write("                        <button  type=\"submit\" name=\"btn\" class=\"btn btn-primary\">CANCEL</button></center>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-1\">\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
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
