package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class NLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Login Form</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("            <link rel=\"stylesheet\" type=\"text/css\" href=\"http://localhost:8084/Project/css/login.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <div class=\"header\" id=\"head\">\n");
      out.write("        <img src=\"http://localhost:8084/Project/Icon/logo.jpg\" height=\"90\" width=\"200\" id=\"logo\">\n");
      out.write("        <div class=\"title\">Online Learing System</div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"wrap\" id=\"wrap\">\n");
      out.write("        <div class=\"logGet\">\n");
      out.write("            <div class=\"logD logDtip\">\n");
      out.write("                <center><p class=\"p1\">LOGIN</p></center>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"lgD\">\n");
      out.write("                <img src=\"http://localhost:8084/Project/Icon/user.png\" width=\"20\" height=\"20\" alt=\"\"/>\n");
      out.write("                <input type=\"text\" placeholder=\"Input UserName\" />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"lgD\">\n");
      out.write("                <img src=\"http://localhost:8084/Project/Icon/psw.png\" width=\"20\" height=\"20\"  alt=\"\"/>\n");
      out.write("                <input type=\"password\" placeholder=\" Input Password\" />\n");
      out.write("            </div>\n");
      out.write("            <div class=\"logC\">\n");
      out.write("                <a href=\"user.jsp\" target=\"_self\"><button>Login</button></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"logR\">\n");
      out.write("                <a href=\"register.jsp\" target=\"_self\"><button>Register</button></a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"logF\">\n");
      out.write("                <a href=\"refindpwd.jsp\" target=\"_self\"><button>Forget Password?</button></a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"div2\">\n");
      out.write("        <ul>\n");
      out.write("            <center><li><span>Please call us: 13259652820</span></li></center>\n");
      out.write("        <center><li><span>Email: 954931689@qq.com</span></li></center>\n");
      out.write("            <center><li ><span>Online Learning System</span></li></center>\n");
      out.write("            <center><li ><p  id=\"brand\">&copy Copyright 2019</p></li></center>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("  </body>\n");
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
