package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <link rel=\"shortcut icon\" href=\"http://localhost:8084/Project/Icon/Title.jpg\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("            <link rel=\"stylesheet\" type=\"text/css\" href=\"http://localhost:8084/Project/css/loginstyle.css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("   \r\n");
      out.write("    <div class=\"header\" id=\"head\">\r\n");
      out.write("        <img src=\"http://localhost:8084/Project/Icon/logo.jpg\" height=\"90\" width=\"200\" id=\"logo\">\r\n");
      out.write("        <div class=\"title\">Online Learing System</div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"mm\" >\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li class=\"log\"><a id=\"lo2\" href=\"http://localhost:8084/Project/view/register.jsp\" target=\"self\">Register</a></li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("        <form action=\"http://localhost:8084/Project/servlet/Authenticate\" method=\"post\">\r\n");
      out.write("        <div class=\"wrap\" id=\"wrap\">\r\n");
      out.write("        <div class=\"logGet\">\r\n");
      out.write("            <div class=\"logD logDtip\">\r\n");
      out.write("                <center><p class=\"p1\">LOGIN</p></center>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"lgD\">\r\n");
      out.write("                <img src=\"http://localhost:8084/Project/Icon/user.png\" width=\"20\" height=\"20\" alt=\"\"/>\r\n");
      out.write("                <input type=\"text\" name=\"loginId\" placeholder=\"Input UserName\" />\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"lgD\">\r\n");
      out.write("                <img src=\"http://localhost:8084/Project/Icon/psw.png\" width=\"20\" height=\"20\"  alt=\"\"/>\r\n");
      out.write("                <input type=\"password\" name=\"password\" placeholder=\" Input Password\" />\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"logC\">\r\n");
      out.write("                <a href=\"user.jsp\" target=\"self\"><button>Login</button></a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("        </form>\r\n");
      out.write("        <div class=\"logR\">\r\n");
      out.write("                <a href=\"http://localhost:8084/Project/view/register.jsp\" target=\"self\"><button>Register</button></a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"logF\">\r\n");
      out.write("                <a href=\"refindpwd.jsp\" target=\"self\"><button>Forget Password?</button></a>\r\n");
      out.write("            </div>\r\n");
      out.write("        <div id=\"div2\">\r\n");
      out.write("        <ul>\r\n");
      out.write("            <center><li><span>RQE（瑞启学院）</span></li></center>\r\n");
      out.write("            <center><li><span>Please call us: 13259652820</span></li></center>\r\n");
      out.write("        <center><li><span>Email: 954931689@qq.com</span></li></center>\r\n");
      out.write("            <center><li ><span>Online Learning System</span></li></center>\r\n");
      out.write("            <center><li ><p  id=\"brand\">&copy Copyright 2020</p></li></center>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
