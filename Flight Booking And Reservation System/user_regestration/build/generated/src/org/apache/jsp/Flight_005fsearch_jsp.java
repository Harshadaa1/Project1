package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class Flight_005fsearch_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.css\"/>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .flight{\n");
      out.write("                width: 80%;\n");
      out.write("                height: 150px;\n");
      out.write("                margin: auto auto auto auto;\n");
      out.write("                margin-top: 5%;\n");
      out.write("                border-radius: 50px;\n");
      out.write("                font-size: 25px;\n");
      out.write("                padding: 20px;\n");
      out.write("                border: 2px solid black;\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            }  \n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                background-image: url(\"img/f2.jpg\");\n");
      out.write("                background-size: cover;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            button{\n");
      out.write("                text-align: center;\n");
      out.write("                \n");
      out.write("                   \n");
      out.write("            }\n");
      out.write("          \n");
      out.write("            select{\n");
      out.write("                font-size: 20px;\n");
      out.write("            }\n");
      out.write("            label{\n");
      out.write("                font-size: 18px;\n");
      out.write("            }\n");
      out.write("            #date{\n");
      out.write("                font-size: 20px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .jumbotron\n");
      out.write("            {\n");
      out.write("                width: 80%;\n");
      out.write("                margin: 50px auto auto auto;\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            }\n");
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
      out.write("      <button class=\"btn btn-danger\" type=\"submit\">Logout</button>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        \n");
      out.write("         <form action=\"Flight_search.jsp\" method=\"POSt\">\n");
      out.write("          <h2 style=\"text-align:center;\">FLIGHT SEARCH</h2><hr>   \n");
      out.write("        <div class=\"flight\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                       <label>From</label><br>\n");
      out.write("                       <select name=\"txt_from\" class=\"form-control\">\n");
      out.write("                           <option>Select places</option>\n");
      out.write("                           ");

                               
         Connection cn=null;
        Statement st=null;

         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/flight","root","root");
            st=cn.createStatement();
            String sql="select distinct(arrival_airport) from add_flight";
            ResultSet result=st.executeQuery(sql);
            while(result.next())
            {
            
            
            
            
    
    
    
      out.write("\n");
      out.write("                               %>\n");
      out.write("                               <option>");
      out.print(result.getString("arrival_airport"));
      out.write("</option>\n");
      out.write("                               \n");
      out.write("                               ");

                               
                               }
         }
        catch(Exception ex)
        {
             out.println(ex.toString());      
         }
                           
      out.write("\n");
      out.write("                          \n");
      out.write("                       </select>\n");
      out.write("                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                        <label>To</label><br>\n");
      out.write("                        <select name=\"txt_to\" class=\"form-control\">\n");
      out.write("                            <option>Select Place</option>\n");
      out.write("                             ");

                               
         
         try
        {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/flight","root","root");
            st=cn.createStatement();
            String sql="select distinct(departure_airport) from add_flight";
            ResultSet result=st.executeQuery(sql);
            while(result.next())
            {
            
            
            
            
    
    
    
      out.write("\n");
      out.write("                               %>\n");
      out.write("                               <option>");
      out.print(result.getString("departure_airport"));
      out.write("</option>\n");
      out.write("                               \n");
      out.write("                               ");

                               
                               }
         }
        catch(Exception ex)
        {
             out.println(ex.toString());      
         }
                           
      out.write("\n");
      out.write("                        </select>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\">\n");
      out.write("                    \n");
      out.write("                      <label>Date</label><br>\n");
      out.write("                    <input id='date' type='date' class=\"form-control\" name='txt_date' min=\"\" required />\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-3\" style=\" text-align: center; margin-top: 30px; font-weight: bold;\">\n");
      out.write("                    <button type=\"submit\" name=\"txt_btn\" class=\"btn btn-primary\">Search Flight</button>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("         </form>\n");
      out.write("        ");

         
         try
        {
            
           if(request.getParameter("txt_btn")!=null)
           {
            String sql="select * from add_flight where arrival_airport='"+request.getParameter("txt_from")+"' and departure_airport='"+request.getParameter("txt_to")+"'";
            ResultSet result=st.executeQuery(sql);
            while(result.next())
            {
            
      out.write("\n");
      out.write("            <div class=\"jumbotron\" style=\"padding: 5px; background-color: sown;\" >\n");
      out.write("                 <form action=\"Flight_Search\" method=\"POST\">\n");
      out.write("                     <input type=\"hidden\" name=\"price\" value=\"");
      out.print(result.getString("totalamount"));
      out.write("\"/>\n");
      out.write("                     <input type=\"hidden\" name=\"flight_name\" value=\"");
      out.print(result.getString("flight_name"));
      out.write("\"/>\n");
      out.write("                     <input type=\"hidden\" name=\"arr_air\" value=\"");
      out.print(result.getString("arrival_airport"));
      out.write("\"/>\n");
      out.write("                     <input type=\"hidden\" name=\"dept_air\" value=\"");
      out.print(result.getString("departure_airport"));
      out.write("\"/>\n");
      out.write("                     <input type=\"hidden\" name=\"dept_date\" value=\"");
      out.print(request.getParameter("txt_date"));
      out.write("\"/>\n");
      out.write("          <div class=\"row\"  >\n");
      out.write("              <div class=\"col-sm-4\">\n");
      out.write("                  \n");
      out.write("                  \n");
      out.write("                  <label>");
      out.print(result.getString("arritime"));
      out.write("</label><br><br>  \n");
      out.write("               <h2 style=\"color: #138496\">");
      out.print(result.getString("flight_name"));
      out.write("</h2><br><br>\n");
      out.write("                <h4 >");
      out.print(result.getString("departure_airport"));
      out.write("</h4><br><br>\n");
      out.write("<br>\n");
      out.write("              \n");
      out.write("            <br>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-sm-4\">\n");
      out.write("                  <label>");
      out.print(result.getString("arritime"));
      out.write("</label><br><br>\n");
      out.write("                  \n");
      out.write("                  <h2 style=\"color: #138496\">");
      out.print(request.getParameter("txt_date"));
      out.write("</h2><br><br>\n");
      out.write("            <h4 >");
      out.print(result.getString("arrival_airport"));
      out.write("</h4><br><br>\n");
      out.write("              \n");
      out.write(" <input type=\"submit\" name=\"btn\" class=\"btn btn-primary\" value=\"Book Now\"/>\n");
      out.write("                \n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-sm-4\">\n");
      out.write("              \n");
      out.write("                  <center>\n");
      out.write("               <h2 style=\"text-align: center; color: red; font-size: 35px; display: flex; justify-content: center; align-items: center; margin-top: 100px; \">\n");
      out.write(" ₹ ");
      out.print( result.getString("totalamount") );
      out.write("\n");
      out.write("</h2>\n");
      out.write("</center>\n");
      out.write("              \n");
      out.write("             \n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("                 </form>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            ");

            
            
            }
}
         }
        catch(Exception ex)
        {
             out.println(ex.toString());      
         }
    
    
    
      out.write("\n");
      out.write("       \n");
      out.write("      \n");
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
