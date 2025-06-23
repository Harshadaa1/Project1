package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class Ticket_005fbooking_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.css\"/>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .container\n");
      out.write("            {\n");
      out.write("                width:50%;\n");
      out.write("                margin: auto auto auto auto;\n");
      out.write("                margin-top: 5%;\n");
      out.write("                \n");
      out.write("                border-radius: 25px;\n");
      out.write("                \n");
      out.write("                background-color: transparent;\n");
      out.write("                border: solid 2px black;\n");
      out.write("                padding: 20px;\n");
      out.write("                \n");
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
      out.write("                color:black;\n");
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
      out.write("             <form action=\"Ticket_Booking\" method=\"POST\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("           \n");
      out.write("            <h2 style=\"color: black;\">TICKET BOOKING</h2><hr>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <label>Departure Airport</label><br>\n");
      out.write("                    <input type=\"text\" name=\"txt_dept_airport\" value=\"");
      out.print(session.getAttribute("arr_air"));
      out.write("\" class=\"form-control\"/>\n");
      out.write("                    ");

                    Date date=new Date();
                    SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
                    String dob=format.format(date);
                    
      out.write("\n");
      out.write("                     <label>Departure Date</label><br>\n");
      out.write("                     <input type=\"date\" name=\"txt_date\" max=\"");
      out.print(dob);
      out.write("\" value=\"");
      out.print(session.getAttribute("dept_date"));
      out.write("\" required class=\"form-control\" /><br>\n");
      out.write("                     \n");
      out.write("                     <label>Adult</label><br>\n");
      out.write("                     <input type=\"text\" name=\"txt_adult\" onkeypress=\"javascript:return isNumber(event)\" required class=\"form-control\"/><br>\n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <label>Arrival Airport</label><br>\n");
      out.write("                     <input type=\"text\" name=\"txt_air_airport\" value=\"");
      out.print(session.getAttribute("dept_air"));
      out.write("\" class=\"form-control\"/>\n");
      out.write("                       \n");
      out.write("                       <label>Flight Class</label><br>\n");
      out.write("                       <select class=\"form-control\" required name='txt_flightclass' ><option>Select Class</option><option>Economy</option><option>Bussiness</option></select><br>\n");
      out.write("\n");
      out.write("                    <label>Child</label><br>\n");
      out.write("                    <input type=\"text\" name=\"txt_child\" onkeypress=\"javascript:return isNumber(event)\" required class=\"form-control\"/><br>\n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("            </div>\n");
      out.write("            <input type=\"submit\" name=\"btn_next\" value=\"NEXT\" class=\"btn btn-primary\"/>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("               \n");
      out.write("           \n");
      out.write("            </form>\n");
      out.write("    </body>\n");
      out.write("   \n");
      out.write("</html>");
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
