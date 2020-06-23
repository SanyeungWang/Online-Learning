package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script type=\"text/javascript\" src=\"http://localhost:8084/Project/javascript/login.js\"></script>\n");
      out.write("        <title>Register Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"http://localhost:8084/Project/css/mystyle.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"http://localhost:8084/Project/css/loginstyle.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: linear-gradient(200deg,#9fbaa8, green);\">\n");
      out.write("        <div class=\"header\" id=\"head\">\n");
      out.write("        <img src=\"http://localhost:8084/Project/Icon/logo.jpg\" height=\"90\" width=\"200\" id=\"logo\">\n");
      out.write("        <div class=\"title\">Online Learing System</div>\n");
      out.write("    </div>\n");
      out.write("        <div id=\"mainContent\">\n");
      out.write("            <span id=\"loginName\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.User.userName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\n");
      out.write("            <br><br><br><br><br>\n");
      out.write("            <center>\n");
      out.write("                <form action=\"registerdata.jsp\" method=\"POST\">\n");
      out.write("                    <h1 style=\"margin-top:-65px\">REGISTER</h1>\n");
      out.write("                    <table style=\"outline: 1px solid;\">\n");
      out.write("                        <caption style=\"border: 2px solid #eeeeee;\">User Registration Form</caption>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>User_ID</td>\n");
      out.write("                            <td><input type=\"text\" placeholder=\"Enter your  User ID\" name=\"loginId\" id=\"loginId\" onkeypress=\"checkUser(this);\" onchange=\"checkUser(this);\" required/></td>\n");
      out.write("                            <td><button onclick=\"return verifyUser();\">Check Availability</button></td>\n");
      out.write("                            <td><div id=\"container\" style=\"display: none;\"></div></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Password</td>\n");
      out.write("                            <td><input type=\"password\" placeholder=\"Enter Password\" name=\"password\" id=\"password\" required/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Re-Password</td>\n");
      out.write("                            <td><input type=\"password\" placeholder=\"Enter Password Again\" name=\"rePassword\" id=\"rePassword\" required/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>User Type</td>\n");
      out.write("                            <td><input type=\"radio\" name=\"userType\" value=\"admin\"/>Admin &nbsp;&nbsp;&nbsp;\n");
      out.write("                                <input type=\"radio\" name=\"userType\" value=\"customer\"/>Customer</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Full Name</td>\n");
      out.write("                            <td><input type=\"text\" placeholder=\"Enter Your Full Name\" name=\"userName\" required/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>User_Email</td>\n");
      out.write("                            <td><input type=\"text\" placeholder=\"Enter Your Email\" name=\"userEmail\" required/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>User_Contact</td>\n");
      out.write("                            <td><input type=\"text\" placeholder=\"Enter Your Mobile Number\" name=\"userPhone\" required/></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><input type=\"submit\" value=\"Register\" onclick=\"return validatePassword();\"/></td>\n");
      out.write("                            <td><input type=\"reset\" value=\"    Reset    \"/></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </form>\n");
      out.write("                <br/>\n");
      out.write("                <a href=\"http://localhost:8084/Project/view/newlogin.jsp\">Login</a> &nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                ");
      out.write("\n");
      out.write("                <br><br><br><br><br>\n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("       <div id=\"div2\">\n");
      out.write("        <ul>\n");
      out.write("            <center><li><span>RQE（瑞启学院）</span></li></center>\n");
      out.write("            <center><li><span>Please call us: 13259652820</span></li></center>\n");
      out.write("        <center><li><span>Email: 954931689@qq.com</span></li></center>\n");
      out.write("            <center><li ><span>Online Learning System</span></li></center>\n");
      out.write("            <center><li ><p  id=\"brand\">&copy Copyright 2019</p></li></center>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
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
