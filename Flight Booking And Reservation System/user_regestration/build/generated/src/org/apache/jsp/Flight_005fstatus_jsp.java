package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Flight_005fstatus_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"bootstrap.css\"/>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .jumbotron\n");
      out.write("            {\n");
      out.write("              width: 60%;\n");
      out.write("              margin: auto auto auto auto;\n");
      out.write("              margin-top: 5%;\n");
      out.write("                    \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"jumbotron\">\n");
      out.write("             \n");
      out.write("            <h2 style=\"text-align:center;\">FLIGHT STATUS</h2><hr>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                \n");
      out.write("           \n");
      out.write("            \n");
      out.write("               <table class=\"table table-bordered\">\n");
      out.write("  <thead>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"col\">Flight no</th>\n");
      out.write("      <th scope=\"col\">Type</th>\n");
      out.write("      \n");
      out.write("      <th scope=\"col\">Source</th>\n");
      out.write("      <th scope=\"col\">Destination</th>\n");
      out.write("      <th scope=\"col\">Departure time</th>\n");
      out.write("      <th scope=\"col\">Arrival time</th>\n");
      out.write("     \n");
      out.write("  </tr>\n");
      out.write("  </thead>\n");
      out.write("  <body>\n");
      out.write("      </tbody>\n");
      out.write("</table>\n");
      out.write("                \n");
      out.write("                 </div>\n");
      out.write(" </div>\n");
      out.write("\n");
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
