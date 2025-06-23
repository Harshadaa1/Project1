package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/homepagenav.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.css\">\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("                    .jumbotron {\n");
      out.write("                  width: 60%;\n");
      out.write("                  /*margin: auto;*/\n");
      out.write("                  /*margin-top: 5%;*/\n");
      out.write("                  margin-top: 5%;\n");
      out.write("                 background: transparent;\n");
      out.write("                  }\n");
      out.write("\n");
      out.write("                    body{\n");
      out.write("                   background-image: url(\"img/user.jpg\");\n");
      out.write("                              background-size: cover;\n");
      out.write("                              height: 100%;\n");
      out.write("                          }\n");
      out.write("                          label{\n");
      out.write("                              font-size: 120px;\n");
      out.write("                              margin-left: 80px;\n");
      out.write("                          }\n");
      out.write("                          \n");
      out.write("                          .footer {\n");
      out.write("                  position: fixed;\n");
      out.write("                  bottom: 0;\n");
      out.write("                  width: 100%;\n");
      out.write("                  background: rgba(0, 0, 0, 0.8); /* Slight transparency */\n");
      out.write("                  color: white;\n");
      out.write("                  text-align: center;\n");
      out.write("                  padding: 10px 0;\n");
      out.write("              }\n");
      out.write("              .footer a {\n");
      out.write("                  color: #f8d210; /* Gold color for links */\n");
      out.write("                  text-decoration: none;\n");
      out.write("                  margin: 0 5px;\n");
      out.write("              }\n");
      out.write("              .footer a:hover {\n");
      out.write("                  text-decoration: underline;\n");
      out.write("              }\n");
      out.write("\n");
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
      out.write("            #btn{\n");
      out.write("                width: 150px;\n");
      out.write("                height: 50px;\n");
      out.write("                border: none;\n");
      out.write("                color: white;\n");
      out.write("                background-color: rgb(225,0,68);\n");
      out.write("                border-radius: 5px;\n");
      out.write("                box-shadow: inset 0 0 0 0 #f9e506;\n");
      out.write("                transition: ease-out 0.3s;\n");
      out.write("                outline: none;\n");
      out.write("            }\n");
      out.write("            #btn:hover{\n");
      out.write("                box-shadow: inset 300px 0 0 0 #f9e506;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("            a{\n");
      out.write("                padding: 15px;\n");
      out.write("                margin-left: 10px;\n");
      out.write("            }\n");
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
      out.write("      \n");
      out.write("     \n");
      out.write("      \n");
      out.write("      \n");
      out.write("    </ul>\n");
      out.write("    <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("        <a href=\"User_registration.jsp\" id=\"btn\" >REGISTER</a>\n");
      out.write("            \n");
      out.write("        <a href=\"User_login.jsp\" id=\"btn\" >SIGNUP</a>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("         <div class=\"jumbotron\" style=\"background: transparent\">\n");
      out.write("             <h1 style=\"margin-left: 130px;font-size: 100px\">Let your</h1>\n");
      out.write("             <label>DREAMS</label>\n");
      out.write("             <h4 style=\"margin-left: 130px;font-size: 100px\">Take Flight</h4>\n");
      out.write("             \n");
      out.write("         </div>\n");
      out.write("         \n");
      out.write("         <footer class=\"footer\">\n");
      out.write("    <div class=\"container text-center\">\n");
      out.write("        <p>&copy; 2025 Travel as much as you can & Make memories.</p>\n");
      out.write("        <p>Follow us: \n");
      out.write("            <a href=\"#\">Facebook</a> | \n");
      out.write("            <a href=\"\">Instagram</a> | \n");
      out.write("            <a href=\"#\">Twitter</a>\n");
      out.write("        </p>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("       \n");
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
