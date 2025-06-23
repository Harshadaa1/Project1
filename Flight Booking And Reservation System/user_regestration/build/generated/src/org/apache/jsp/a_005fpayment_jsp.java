package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class a_005fpayment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.css\" />\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .jumbotron{\n");
      out.write("                width: 60%;\n");
      out.write("                margin: auto auto auto auto;\n");
      out.write("                margin-top: 5%;\n");
      out.write("            }\n");
      out.write("            button{\n");
      out.write("                margin-left: 80px;\n");
      out.write("            }\n");
      out.write("            h2{\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("                          #input\n");
      out.write("            {\n");
      out.write("               \n");
      out.write("               width: 75%;\n");
      out.write("               height: 15px;\n");
      out.write("               padding: 10px;\n");
      out.write("               color: black;\n");
      out.write("               border: none;\n");
      out.write("                 border-bottom: 2px solid black;\n");
      out.write("\n");
      out.write("               background-color: transparent;\n");
      out.write("               outline: none;\n");
      out.write("               color: black ;\n");
      out.write("               border-radius: 25px;\n");
      out.write("               }\n");
      out.write("               label{\n");
      out.write("                   margin-left: 5px;\n");
      out.write("               }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script src=\"validation.js\"></script>\n");
      out.write("        <div class=\"jumbotron\">\n");
      out.write("             <h2>PAYMENT</h2>\n");
      out.write("             <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("               \n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                       <label>Card Holder Name</label><br>\n");
      out.write("                       <input type=\"text\" name=\"text_card holder name\" onkeypress=\"javascript:return isString(event)\" placeholder=\"Enter card holder name\" required/><br><br>\n");
      out.write("                <label>Card Number</label><br>\n");
      out.write("                <input type=\"text\" name=\"txt_name\" onkeypress=\"javascript:return isNumber(event)\" placeholder=\"Enter card number\" required/><br><br>\n");
      out.write("                <label>Expirary Date</label><br>\n");
      out.write("                <input type=\"date\" name=\"txt_expirary date\" placeholder=\"Enter date\" required/><br><br>    \n");
      out.write("              \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                     <label>Total Amount</label><br>\n");
      out.write("                     <input type=\"text\" name=\"txt_total\" onkeypress=\"javascript:return isFloat(event)\" placeholder=\"Total Amount\" required /><br><br>\n");
      out.write("          <label>Discount</label><br>\n");
      out.write("                <input type=\"text\"name=\"txt_discount\" onkeypress=\"javascript:return isAlphanumeric(event)\" placeholder=\"Enter the discount\" required/><br><br>\n");
      out.write("                         <label>Cvv No</label><br>\n");
      out.write("                <input type=\"text\" name=\"txt_cvv no\" onkeypress=\"javascript:return isNumber(event)\" placeholder=\"Enter cvv no\" required/><br><br>\n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("              <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <button class=\"btn btn-primary\">PAY</button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <button class=\"btn btn-primary\">CANCEL</button>\n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
