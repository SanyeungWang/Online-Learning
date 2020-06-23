<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="http://localhost:8084/Project/css/headpage.css"/>
    </head>
    <body>
        <div id="mm" >
        <ul>
            <%
                Object o = session.getAttribute("User");
                if(o!=null){
                    login.beans.Users usr = (login.beans.Users)o;
            %>
            <li class="log"><a id="lo2" href="http://localhost:8084/Project/servlet/Logout" target="self">Logout</a></li>
            <%
                }
                else{
            %>
            <li class="log"><a id="lo2" href="http://localhost:8084/Project/view/newlogin.jsp" target="self">Login</a></li>
            <li class="log"><a id="lo1" href="http://localhost:8084/Project/view/register.jsp"  target="self">Register</a></li>
            <%
                }
            %>
        </ul>
    </div>
        <h1 style="font-family:Lucida Calligraphy;
            font-size:40px;color:white;text-align:center; font-style: italic;margin-top: 40px;">Online Learning System</h1>  
           <div class="nav">    
        <ul>
            <li class="home"><a target="bfm" href="home.jsp">Home</a></li>
            <li class="cat"><a target="bfm" href="home.jsp">Category</a></li>
        </ul>

           </div>        
    </body>
</html>
