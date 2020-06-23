package login.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import login.utils.DBUtils;
import login.beans.Users;

public class RegisterUser extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String loginId = request.getParameter("loginId");
        String password = request.getParameter("password");
        String userType = request.getParameter("userType");
        String userName = request.getParameter("userName");
        String userEmail = request.getParameter("userEmail");
        String userPhone = request.getParameter("userPhone");
        
        Users usr = new Users(loginId, password, userType, userName,userEmail,userPhone);
        boolean ret = DBUtils.registerUsers(usr);
        if(!ret){
            request.setAttribute("status", "false");
            getServletContext().getRequestDispatcher("/view/register.jsp").forward(request, response);
        }
        else
            getServletContext().getRequestDispatcher("/view/newlogin.jsp").forward(request, response);
    }
}
