package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class User_005fregistration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.css\"/>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("               .jumbotron\n");
      out.write("            {\n");
      out.write("                               /* font-family: serif;*/\n");
      out.write("\n");
      out.write("                width: 40%;\n");
      out.write("                margin: auto auto auto auto;\n");
      out.write("                margin-top: 5%;\n");
      out.write("                margin-left: 10%;\n");
      out.write("                color: Black;\n");
      out.write("                border-radius: 25px;\n");
      out.write("               background-color: transparent;\n");
      out.write("               border: 2px solid black;\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("          \n");
      out.write("            body{\n");
      out.write("             background-image: url(\"img/user.jpg\");\n");
      out.write("            background-size: cover;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            button{\n");
      out.write("                margin-left: 40px;\n");
      out.write("            }\n");
      out.write("            label\n");
      out.write("            {\n");
      out.write("                font-size: 15;\n");
      out.write("                margin-left: 10px;\n");
      out.write("            \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script src=\"validation.js\"></script>\n");
      out.write("        <div class=\"jumbotron\">\n");
      out.write("            <form action=\"user_reg\" method=\"POST\">\n");
      out.write("            <h2 style=\"text-align: center;\">  REGISTRATION  </h2><hr>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                  <label>Full-name</label><br>\n");
      out.write("                    <input  type=\"text\" onkeypress=\"javascript:return isString(event)\" name=\"txt_name\" placeholder=\"Enter full name\" required class=\"form-control w-75\" /><br>\n");
      out.write("                    \n");
      out.write("                    <label>Password</label><br>\n");
      out.write("                    <input type=\"password\" name=\"txt_pass\" placeholder=\"Enter password\" required class=\"form-control w-75\" /><br>\n");
      out.write("                      \n");
      out.write("                    <label>Contact-number</label><br>\n");
      out.write("                    <input type=\"number\" onkeypress=\"javascript:return isContact(event)\" maxlength=\"10\" name=\"txt_num\" placeholder=\"Enter contact number\"   required class=\"form-control w-75\" /><br>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6\">                \n");
      out.write("                    \n");
      out.write("                    <label>Email</label><br>\n");
      out.write("                    <input  type=\"email\" name=\"txt_email\"  placeholder=\"Enter email\" required class=\"form-control w-75\" /><br>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <label>Confirm Password</label><br>\n");
      out.write("                    <input type=\"password\"  name=\"txt_pass\" placeholder=\"Enter confirm password\"  required class=\"form-control w-75\" /><br>\n");
      out.write("                    \n");
      out.write("\n");
      out.write("                    <label>Address</label><br>\n");
      out.write(" \n");
      out.write("                    <textarea class=\"form-control w-75\" placeholder=\"Enter Address\" name=\"txt_address\"   ></textarea><br>\n");
      out.write("\n");
      out.write("                   \n");
      out.write("               </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <button type=\"submit\" name=\"txt_submit\" value=\"Submit\" class=\"btn btn-primary\">SUBMIT</button>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <button type=\"cancel\" name=\"txt_submit\" class=\"btn btn-primary\">CANCEL</button>\n");
      out.write("                   \n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            </form>\n");
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
