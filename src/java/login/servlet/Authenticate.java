package login.servlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import login.utils.DBUtils;
import login.beans.Users;
import static java.lang.System.out;

public class Authenticate extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String loginId = request.getParameter("loginId").trim();
        String password = request.getParameter("password").trim();
        //String userType = request.getParameter("userType");
        System.out.println(loginId + ";" + password);
        boolean ret = DBUtils.authenticate(loginId, password);
        if (ret == true) {
            HttpSession session = request.getSession(true);
            Users usr = DBUtils.getUser(loginId);
            session.setAttribute("User", usr);
            getServletContext().getRequestDispatcher("/view/payment1.jsp").forward(request, response);
        } else {
            request.setAttribute("login", "false");
            request.setAttribute("loginId", loginId);
            getServletContext().getRequestDispatcher("/view/newlogin.jsp").forward(request, response);
        }
    }
}
