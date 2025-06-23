package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class Booking_005fReport_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Bill Format</title>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <style>\n");
      out.write("        .bill-container {\n");
      out.write("            max-width: 100%;\n");
      out.write("            margin: 20px auto;\n");
      out.write("            padding: 20px;\n");
      out.write("            border: 2px solid #000;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            background: #f8f9fa;\n");
      out.write("        }\n");
      out.write("        .bill-header {\n");
      out.write("            text-align: center;\n");
      out.write("            font-size: 1.8rem;\n");
      out.write("            font-weight: bold;\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("        .bill-info {\n");
      out.write("            margin-bottom: 20px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"jumbotron bill-container\">\n");
      out.write("            <div class=\"bill-header\">Booking Report</div>\n");
      out.write("             ");

        Connection cn=null;
        Statement st=null;
        
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/flight","root","root");
            st=cn.createStatement();
            String sql="select * from ticket_booking where contact='"+session.getAttribute("contact")+"'";
            ResultSet result=st.executeQuery(sql);
            if(result.next())
            {
                
      out.write("\n");
      out.write("                \n");
      out.write("                <div class=\"bill-info\">\n");
      out.write("                <p><strong>Arrival Airport:</strong> ");
      out.print(result.getString("arrival_airport"));
      out.write("</p>\n");
      out.write("                <p><strong>Departure Airport:</strong> ");
      out.print(result.getString("depart_airport"));
      out.write("</p>\n");
      out.write("                <p><strong>Flight Class:</strong>");
      out.print(result.getString("flight_class"));
      out.write(" </p>\n");
      out.write("                <p><strong>Contact:</strong> ");
      out.print(result.getString("contact"));
      out.write("</p>\n");
      out.write("            </div> \n");
      out.write("                \n");
      out.write("                \n");
      out.write("                ");

            
            
            }
         }
        catch(Exception ex)
        {
             out.println(ex.toString());      
         }
    
    
    
      out.write("\n");
      out.write("            \n");
      out.write("            <table class=\"table table-bordered\">\n");
      out.write("                <thead class=\"table-light\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Name</th>\n");
      out.write("                        <th>DOB</th>\n");
      out.write("                        <th>Gender</th>\n");
      out.write("                        <th>Adult</th>\n");
      out.write("                        <th>Child</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                <tbody>\n");
      out.write("                    ");

    
        
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/flight","root","root");
            st=cn.createStatement();
            String sql="select * from ticket_booking where contact='"+session.getAttribute("contact")+"'";
            ResultSet result=st.executeQuery(sql);
            while(result.next())
            {
                
      out.write("\n");
      out.write("                \n");
      out.write("              <tr>\n");
      out.write("                        <td>");
      out.print(result.getString("fullname"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(result.getString("dob"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(result.getString("gender"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(result.getString("adult"));
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(result.getString("child"));
      out.write("</td>\n");
      out.write("                    </tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                ");

            
            
            }
         }
        catch(Exception ex)
        {
             out.println(ex.toString());      
         }
    
    
    
      out.write("\n");
      out.write("                   \n");
      out.write("                   \n");
      out.write("                </tbody>\n");
      out.write("             \n");
      out.write("            </table>\n");
      out.write("      <a href=\"#\" class=\"btn btn-primary\" onclick=\"printPage()\">Print</a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script>\n");
      out.write("function printPage() {\n");
      out.write("    window.print();\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</body>\n");
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
