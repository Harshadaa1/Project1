package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class user_005ffeedback_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.css\"/>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("                    .container{\n");
      out.write("                width: 40%;\n");
      out.write("                margin: auto auto auto auto;\n");
      out.write("                margin-top: 5%;\n");
      out.write("                 background-color: transparent;\n");
      out.write("                 color: black;\n");
      out.write("                 border-radius: 25px;\n");
      out.write("                 border: solid 2px black;\n");
      out.write("                  margin-right: 15%;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                background-image: url(\"img/f2.jpg\");\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            h2{\n");
      out.write("                text-align: center;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("            label\n");
      out.write("            {\n");
      out.write("              margin-left: 5px;\n");
      out.write("              color: black;\n");
      out.write("            }\n");
      out.write("          \n");
      out.write("                button{\n");
      out.write("                    margin-left: 50px;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                 .star-rating {\n");
      out.write("            direction: rtl;\n");
      out.write("            display: inline-block;\n");
      out.write("            font-size: 30px;\n");
      out.write("            user-select: none;\n");
      out.write("        }\n");
      out.write("        .star-rating input {\n");
      out.write("            display: none;\n");
      out.write("        }\n");
      out.write("        .star-rating label {\n");
      out.write("            color: lightgray;\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        .star-rating input:checked ~ label {\n");
      out.write("            color: gold;\n");
      out.write("        }\n");
      out.write("        .star-rating input:hover ~ label,\n");
      out.write("        .star-rating input:checked ~ label:hover {\n");
      out.write("            color: gold;\n");
      out.write("        }\n");
      out.write("                \n");
      out.write("            </style>\n");
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
      out.write("        <a class=\"btn btn-danger\" href=\"Homepage.jsp\">Logout</a>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <script src=\"validation.js\"></script>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <form action=\"feedback\" method=\"POSt\">\n");
      out.write("            <h2 style=\"text-align: center\">FEEDBACK</h2><hr>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-10\">\n");
      out.write("                      <label>Flight Id</label><br>\n");
      out.write("                      <input value=\"");
      out.print(session.getAttribute("flight_id"));
      out.write("\" onkeypress=\"javascript:return isNumber(event)\" type=\"text\" name=\"txt_id\" placeholder=\"Enter Flight id\" required class=\"form-control\" /><br>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-1\">\n");
      out.write("                  \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                   \n");
      out.write("                  \n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <label>Flight Name</label>\n");
      out.write("                  <input  type=\"text\" name=\"txt_name\" value=\"");
      out.print(session.getAttribute("flight_name"));
      out.write("\" onkeypress=\"javascript:return isString(event)\" class=\"form-control\" placeholder=\"Enter Flight Name \" required/><br>\n");
      out.write("                     <div class=\"star-rating\">\n");
      out.write("        <input type=\"radio\" id=\"star5\" name=\"rating\" value=\"5\" />\n");
      out.write("        <label for=\"star5\">&#9733;</label>\n");
      out.write("        <input type=\"radio\" id=\"star4\" name=\"rating\" value=\"4\" />\n");
      out.write("        <label for=\"star4\">&#9733;</label>\n");
      out.write("        <input type=\"radio\" id=\"star3\" name=\"rating\" value=\"3\" />\n");
      out.write("        <label for=\"star3\">&#9733;</label>\n");
      out.write("        <input type=\"radio\" id=\"star2\" name=\"rating\" value=\"2\" />\n");
      out.write("        <label for=\"star2\">&#9733;</label>\n");
      out.write("        <input type=\"radio\" id=\"star1\" name=\"rating\" value=\"1\" />\n");
      out.write("        <label for=\"star1\">&#9733;</label>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                 \n");
      out.write("                    <label>Date</label><br>\n");
      out.write("                    <input type=\"date\" name=\"txt_date\" class=\"form-control\" required />\n");
      out.write("                    <br>\n");
      out.write("                    \n");
      out.write("                  \n");
      out.write("                    <label>Comments</label>\n");
      out.write("                    <textarea  class=\"form-control \" name=\"txt_comments\" placeholder=\"Enter Comments\"></textarea>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                     <button type='submit' value=\"Submit\" name='txt_submit' class=\"btn btn-primary\">SUBMIT</button>\n");
      out.write("                    <button type='submit' name='txt_submit' class=\"btn btn-primary\">CANCEL</button><br>\n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            </form>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
