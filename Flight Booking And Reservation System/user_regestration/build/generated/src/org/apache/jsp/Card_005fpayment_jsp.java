package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Card_005fpayment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.css\">\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("        .jumbotron {\n");
      out.write("            width:40%;\n");
      out.write("            margin: auto auto auto auto;\n");
      out.write("        \n");
      out.write("            border-radius: 25px;\n");
      out.write("           margin-top: 5%;\n");
      out.write("           \n");
      out.write("           background-color: transparent;\n");
      out.write("           border: solid 2px black;\n");
      out.write("           padding: 20px;\n");
      out.write("        }\n");
      out.write("        body\n");
      out.write("            {\n");
      out.write("                background-image: url(\"img/f2.jpg\");\n");
      out.write("                background-size: cover;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("        h2 {\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        button {\n");
      out.write("            margin-left: 130px;\n");
      out.write("        }\n");
      out.write("        body {\n");
      out.write("            \n");
      out.write("                   }\n");
      out.write("        #u:hover{\n");
      out.write("                         transform: scale(1.2); \n");
      out.write("                         cursor: pointer;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    <div class=\"jumbotron\">\n");
      out.write("        <form action=\"payment\" method=\"POST\">\n");
      out.write("        <h2>PAYMENT</h2>\n");
      out.write("        <hr>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-1\"></div>\n");
      out.write("            <div class=\"col-sm-10\">\n");
      out.write("                <a href=\"upi.jsp\" class=\"btn btn-warning\"> UPI Payment</a>\n");
      out.write("                <br><br>\n");
      out.write("                <a href=\"user_payment.jsp\" class=\"btn btn-danger\"> Credit Card</a>\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("          </form>\n");
      out.write("    </div>\n");
      out.write("      \n");
      out.write("</body>\n");
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
