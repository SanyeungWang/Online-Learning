package niit;
import com.sun.javafx.font.FontConstants;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class CheckLogin extends HttpServlet {
@Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CheckLogin</title>");            
            out.println("</head>");
            out.println("<body>");
            String userid=request.getParameter("username");
            String password=request.getParameter("password");
            if(userid==null || password==null){
                out.println("<h1>Please login frist!!</h1>");
                out.println("<h3>You will be redirected to Login Page in 3 seconds..</h3>");
                response.setHeader("refresh","3:URL=http://localhost:8084/Project/index.html");
            }
            else
            {
               if(userid.equals("aaa")&& password.equals("123")){
                   out.println("<h1>Welcome "+userid+"!!!<h1>");
                   getServletContext().getRequestDispatcher("/view/index.jsp").forward(request, response);
               }
               else{
                   out.println("<h1>Authentication failed!!</h1>");
                   out.println("<h3>Try again in 3 seconds..</h3>");
                   response.setHeader("refresh","3:URL=http://localhost:8084/Project/index.html" );
               }
            }
            out.println("</body>");
            out.println("</html>");
        }
}
}
