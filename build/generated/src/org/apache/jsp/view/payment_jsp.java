package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class payment_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Pay</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            #page1{\n");
      out.write("                margin-left: 150px;\n");
      out.write("                margin-right: 150px;\n");
      out.write("            }\n");
      out.write("            form{\n");
      out.write("                border: black 2px solid;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"  background-image:url(http://localhost:8084/Project/images//8.jpg);background-repeat: no-repeat;background-size: 100% 1000%;\">\n");
      out.write("    <center>\n");
      out.write("        <div id=\"page1\">\n");
      out.write("            <h1>&nbsp&nbsp&nbsp&nbsp   Settlement page</h1>\n");
      out.write("            <hr>\n");
      out.write("            <h3>Fill in and check orders</h3>   \n");
      out.write("            <div id=\"page2\" style=\" background-image:url(http://localhost:8084/Project/images//paybj.jpg);background-size: 100%;\">\n");
      out.write("                <form action=http://localhost:8084/Project/view/main.jsp\" method=\"post\">\n");
      out.write("                    <h4>Consignee information</h4>\n");
      out.write("                    ");

                            Object o = session.getAttribute("User");
                            if(o!=null){
                                com.niit.login.beans.Users usr = (com.niit.login.beans.Users)o;
                    
      out.write("\n");
      out.write("                    <input type=\"text\" name=\"name\" value=\"");
      out.print(usr.getUserName());
      out.write("\">\n");
      out.write("                    ");

                    }
                    else{
                        getServletContext().getRequestDispatcher("/view/Login.jsp").forward(request, response);
                    }
                
      out.write("\n");
      out.write("                    \n");
      out.write("                    <br><hr>\n");
      out.write("                    <h4><b>Payment method</b></h4>\n");
      out.write("                    <image src=\"http://localhost:8084/Project/images/pay1.jpg\" width=\"50\" height=\"50\">\n");
      out.write("                    <input type=\"radio\" name=\"identity\"/>WeChat\n");
      out.write("                    <image src=\"http://localhost:8084/Project/images/pay2.jpg\" width=\"50\" height=\"50\">                  \n");
      out.write("                    <input type=\"radio\" name=\"identity\"/>Alipay\n");
      out.write("                    <br><hr>\n");
      out.write("                    <h4><b>Course name</b></h4>\n");
      out.write("                    <input type=\"text\" name=\"name\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.course}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                    <br><hr>\n");
      out.write("                    <p><b>Invoice information</b>   <input type=\"text\" value=\"填写纳税人识别号，以免报销\" readonly=\"readonly\"></p>\n");
      out.write("                    <br><hr>\n");
      out.write("                    <h4 style=\"text-align: right\"><b>Amount due:");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</b></h4>\n");
      out.write("                    <center>\n");
      out.write("                        \n");
      out.write("                         <a href=\"http://localhost:8084/Project/view1/java.html\"> <input type=\"button\" value=\"submit\"/></a>\n");
      out.write("                    </center>\n");
      out.write("                </form> \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </center>\n");
      out.write("    </body>\n");
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
