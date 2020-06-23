/*Written By Nitesh*/
package login.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import login.utils.DBUtils;

public class CheckLogin extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String loginId = request.getParameter("loginId");
        String password = request.getParameter("password");
        boolean ret = DBUtils.verifyUser(loginId);
        if(ret){
            request.setAttribute("loginID", loginId);
            request.setAttribute("password", password);
        }
        else{
            request.setAttribute("status", "Login ID does not exist !!");
        }
        getServletContext().getRequestDispatcher("/resetPassword.jsp").forward(request, response);
    }
}
