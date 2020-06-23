package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://localhost:8084/Project/css/headpage.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("        <img src=\"http://localhost:8084/Project/Icon/logo.jpg\" height=\"120\" width=\"200\" id=\"logo\">\n");
      out.write("    </div>\n");
      out.write("        <div id=\"mm\" >\n");
      out.write("        <ul>\n");
      out.write("            ");

                Object o = session.getAttribute("User");
                if(o!=null){
                    login.beans.Users usr = (login.beans.Users)o;
            
      out.write("\n");
      out.write("            <li class=\"log\"><a id=\"lo2\" href=\"http://localhost:8084/Project/servlet/Logout\" target=\"self\">Logout</a></li>\n");
      out.write("            ");

                }
                else{
            
      out.write("\n");
      out.write("            <li class=\"log\"><a id=\"lo2\" href=\"http://localhost:8084/Project/view/newlogin.jsp\" target=\"self\">Login</a></li>\n");
      out.write("            <li class=\"log\"><a id=\"lo1\" href=\"http://localhost:8084/Project/view/register.jsp\"  target=\"self\">Register</a></li>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("        <h1 style=\"font-family:Lucida Calligraphy;\n");
      out.write("            font-size:40px;color:lightseagreen;text-align:center; font-style: italic;margin-top: 40px;\">Online Learning System</h1>  \n");
      out.write("           <div class=\"nav\">    \n");
      out.write("        <ul>\n");
      out.write("            <li class=\"home\"><a target=\"bfm\" href=\"home.jsp\">Home</a></li>\n");
      out.write("            <li class=\"cat\"><a target=\"bfm\" href=\"home.jsp\">Category</a></li>\n");
      out.write("        </ul>\n");
      out.write("        <div id=\"search\">\n");
      out.write("        <input type=\"text\" id=\"box\" placeholder=\"Search\" style=\"text-indent:5%; height:27px;\"  size=\"40\">\n");
      out.write("        <input type=\"image\"  id=\"sbt\" src=\"http://localhost:8084/Project/images/g003.jpg\" width=\"20px\" height=\"27px\" formaction=\"http://www.baidu.com\">\n");
      out.write("    </div>\n");
      out.write("           </div>        \n");
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
