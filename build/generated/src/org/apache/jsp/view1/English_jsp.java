package org.apache.jsp.view1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class English_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("\n");
      out.write("        <title>Document</title>\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function  checkLogin() {\n");
      out.write("                var isLogin = window.localStorage.getItem(\"isLogin\");\n");
      out.write("                if (isLogin ===\"1\") {\n");
      out.write("                    document.getElementById(\"loginlogout\").innerHTML = \"Logout\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            function logout() {\n");
      out.write("                var isLogin = window.localStorage.getItem(\"isLogin\");\n");
      out.write("                if (isLogin === \"1\") {\n");
      out.write("                    var ans = confirm(\"Do you want to log out?\");\n");
      out.write("                    if (ans === true) {\n");
      out.write("                        window.localStorage.setItem(\"isLogin\", \"0\");\n");
      out.write("                        document.getElementById(\"loginlogout\").innerHTML = \"Login\";\n");
      out.write("                        return false;\n");
      out.write("                    } else\n");
      out.write("                        return false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\t\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"http://localhost:8084/Project/css/course.css\" />\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"checkLogin()\" style=\"  background-image:url(http://localhost:8084/Project/Icon/1.jpg);background-size: 100%;\">\n");
      out.write("        <article>\n");
      out.write("            <div id=\"div1\">\n");
      out.write("                <a href=\"#iddiv1\" style=\"text-decoration: none; color:white; display: block;\">Courses</a>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"div2\">\n");
      out.write("                <a href=\"#iddiv2\" style=\"text-decoration: none; color:white; display: block;\">Teachers</a>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"div3\"><a href=\"#iddiv3\" style=\"text-decoration: none; color:white; display: block;\"> Recommended Courses</a></div>\n");
      out.write("\n");
      out.write("            <div id=\"iddiv1\">\n");
      out.write("                <h2 style=\"font-size: 40px ;color: rgb(96, 189, 21);margin-left:250px\">English</h2>\n");
      out.write("            </div>\n");
      out.write("            <h1 style=\"margin-left:250px\">English courses</h1>\n");
      out.write("            <div id=\"pro1\">\n");
      out.write("                <a  href=\"http://localhost:8084/Project/view/java.html\"> <img src=\"http://localhost:8084/Project/images/English/A.jpg\" id=\"img24\" style=\"margin:10px;width:290px;height:100px;\"  id=\"s1\"></a>            \n");
      out.write("                <figcaption style=\"margin-top:-20px;margin-left:60px\"><h4>English Core Technology</h4></figcaption>\n");
      out.write("                <p style=\"margin:10px\">  English is not only a programming language, but also a huge ecosystem....... </p>\n");
      out.write("                <a href=\"http://localhost:8084/Project/view/payment.jsp\"> <input type=\"button\" value=\"$65\"/></a>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div id=\"pro2\">\n");
      out.write("                <img src=\"http://localhost:8084/Project/images/English/D.jpg\" id=\"img24\" style=\"margin:10px;width:290px;height:100px;\"  id=\"s2\">\n");
      out.write("                <figcaption style=\"margin-top:-20px;margin-left:60px\"><h4>English programming</h4></figcaption>\n");
      out.write("                <p style=\"margin:10px\">English is welcomed for its excellent simplicity, versatility, and security...</p>\n");
      out.write("                <a href=\"http://localhost:8084/Project/view/payment.jsp\"><input type=\"button\" value=\"$30\"/></a>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"pro3\">\n");
      out.write("                <img src=\"http://localhost:8084/Project/images/English/E.jpg\" id=\"img24\" style=\"margin:10px;width:290px;height:100px;\"  id=\"s3\">\n");
      out.write("                <figcaption style=\"margin-top:-20px;margin-left:60px\"><h4>English Application Development Foundation</h4></figcaption>\n");
      out.write("                <p style=\"margin:10px\">The goal is English development capabilities.....</p>\n");
      out.write("                <a href=\"http://localhost:8084/Project/view/payment.jsp\"><input type=\"button\" value=\"$45\"/></a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <h2 style=\"margin-left:250px;margin-top:325px\">Chinese Courses</h2>\n");
      out.write("            <div id=\"pro4\">\n");
      out.write("                <img src=\"http://localhost:8084/Project/images/English/B.jpg\" id=\"img24\"  style=\"margin:10px;width:290px;height:100px;\"  >\n");
      out.write("                <figcaption style=\"margin-top:-35px;margin-left:120px\"><h4>英语程序设计</h4></figcaption>\n");
      out.write("                <p style=\"margin-left:10px;margin-top:-10px\">英语以卓越的简洁性，卓越行，可移植性和安全性受到欢迎....\n");
      out.write("                </p>\n");
      out.write("                <a href=\"http://localhost:8084/Project/view/payment.jsp\"><input type=\"button\" value=\"$55\"/></a>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"pro5\">\n");
      out.write("                <img src=\"http://localhost:8084/Project/images/English/C.jpg\" id=\"img24\"  style=\"margin:10px;width:290px;height:100px;\" id=\"s5\">\n");
      out.write("                <figcaption style=\"margin-top:-35px;margin-left:90px\"><h4>英语面向对象的程序设计</h4></figcaption>\n");
      out.write("                <p style=\"margin-left:10px;margin-top:-10px\">讲授英语编程知识同时，培养计算和创新思维，学习和实践并行....</p>\n");
      out.write("                <a href=\"http://localhost:8084/Project/view/payment.jsp\"><input type=\"button\" value=\"$52\"/></a>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"pro6\">\n");
      out.write("                <img src=\"http://localhost:8084/Project/images/English/F.jpg\"  id=\"img24\" style=\"margin:10px;width:290px;height:100px;\" id=\"s6\">\n");
      out.write("                <figcaption style=\"margin-top:-35px;margin-left:120px\"><h4>英语核心技术</h4></figcaption>\n");
      out.write("                <p style=\"margin-left:10px;margin-top:-5px\">英语被广泛应用到企业级系统，手机，桌面系统等技术，是市场最急需的技术... </p>\n");
      out.write("                <a href=\"http://localhost:8084/Project/view/payment.jsp\"> <input type=\"button\" value=\"$50\"/></a>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"iddiv2\">\n");
      out.write("                <h2 style=\"font-size: 40px;margin-left:250px;margin-top:300px;color: rgb(96, 189, 21);\">Teachers Introduction</h2>\n");
      out.write("            </div>\n");
      out.write("            <div style=\"border: 2px solid black;width:980px;margin-left:250px;height:280px;border-radius: 5px;background-color:aliceblue\" >\n");
      out.write("                <div id=\"exp1\" >\n");
      out.write("                    <h4>Mr. Gordon Moore</h4>\n");
      out.write("                    <p>This is a truly excellent collection of resources and highly recommended. They are succinct,to the point and \n");
      out.write("                        well presented. Students will find them accessible, relevant and easily digestible. Keep up the good work!\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"exp2\">\n");
      out.write("                    <h4>Dr. Jahangir Alam</h4>\n");
      out.write("                    <p>It's amazing to have a website like tutorialspoint at zero price and providing the best self learning content. \n");
      out.write("                        I always recommend my students to refer to tutorialspoint for their assignments.\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"exp3\">\n");
      out.write("                    <h4>Velma Latson</h4>\n");
      out.write("                    <p>It's amazing to have a website like tutorialspoint at zero price and providing the best self learning content. \n");
      out.write("                        I always recommend my students to refer to tutorialspoint for their assignments.\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"exp4\" style=\"border: 2px solid black;width:980px;margin-left:250px;height:120px;background-color:lightgray\">\n");
      out.write("                <h4>Mayun</h4>\n");
      out.write("                <p>Alibaba was founded in 1999, and as the CEO of Ali Group, Chairman of the Board of Directors, May 10, 2013, \n");
      out.write("                    resigned as Alibaba Group CEO, continue to be the Chairman of the group of Ali. June 30, 2015, Ma Yun was \n");
      out.write("                    elected the Global Internet Governance Alliance Council co-Chairmen. \n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"exp5\" style=\"border: 2px solid black;width:980px;margin-left:250px;height:160px;background-color:aliceblue\">\n");
      out.write("                <h4>Ma_Huateng</h4>\n");
      out.write("                <p>MA, majoring in computer and applications at Shenzhen University, obtained a Bachelor of Science degree in 1993.\n");
      out.write("                    Ma has been in charge of China Telecom service and product supplier Shenzhen Run Xun Communications Development Co., \n");
      out.write("                    Ltd. is responsible for the Internet paging system research and development work, in the telecommunications and Internet \n");
      out.write("                    industry has more than 10 years of experience. 1998, MA and friend Zhang Zhidong registered to set up \"Shenzhen Tencent \n");
      out.write("                    Computer System Co., Ltd.\". 2009, Tencent was selected as \"Fortune\", \"the world's most respected 50 companies\".\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"exp6\"style=\"border: 2px solid black;width:980px;margin-left:250px;height:155px;background-color:lightgray;\">\n");
      out.write("                <h4>Li_Yanhong</h4>\n");
      out.write("                <p>Senior Engineer for a senior consultant, the Wall Street Journal's online real-time financial information system, and an \n");
      out.write("                    internationally renowned internet company--infoseek. Li's \"Hyper-chain analysis\" technology patent, is to lay the whole modern \n");
      out.write("                    search engine development trend and direction of one of the basic inventions. In January 2000, Lee founded Baidu. Today, Baidu \n");
      out.write("                    has developed into the world's second-largest independent search engine and the largest Chinese search engine.\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"iddiv3\">\n");
      out.write("                <h2 style=\"font-size: 40px;margin-left:250px;margin-top:550px;color: rgb(96, 189, 21);\">Recommended Courses</h2>\n");
      out.write("            </div>\n");
      out.write("            <p style=\"margin-left:250px;font-size:30px;font-family:'Courier New';color:rgb(35, 70, 175);\"><b>C Langerge</b></p>\n");
      out.write("            <a href=\"http://localhost:8084/Project/view/math.jsp\" target=\"_Blank\"> <img id=\"img24\" src=\"http://localhost:8084/Project/images/C/A.jpg\" style=\"height:260px;width:300px;margin-left:560px;margin-top:-30px;position:absolute;border-radius:30px;\"></a>\n");
      out.write("            <p style=\"margin-left:515px;margin-top:-70px;color:rgb(35, 70, 175);font-size:30px;font-family:'Courier New';position:absolute;\"><b>Java</b></p>\n");
      out.write("            <p style=\"margin-left:800px\">expert</p>\n");
      out.write("            <a href=\"http://localhost:8084/Project/view/English.jsp\" target=\"_Blank\">\n");
      out.write("                <img id=\"img24\"src=\"http://localhost:8084/Project/images/Java/A.jpg\"  style=\"height:260px;width:300px;margin-left:240px;margin-top:-65px;position:absolute;border-radius:30px;\"></a>\n");
      out.write("            <p style=\"margin-left:880px;font-size:30px;font-family:'Courier New';margin-top:-15px;margin-top:-100px;color:rgb(35, 70, 175);\"><b>Python</b></p>\n");
      out.write("            <a href=\"http://localhost:8084/Project/view/Chemistry.jsp\" target=\"_Blank\"><img id=\"img24\"src=\"http://localhost:8084/Project/images/Python/A.jpg\"  style=\"height:260px;width:300px;margin-left:880px;margin-top:-25px;position:absolute;border-radius:30px;\"></a>\n");
      out.write("        </article>\n");
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
