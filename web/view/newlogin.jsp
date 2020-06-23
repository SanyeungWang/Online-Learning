<%-- 
    Document   : newlogin
    Created on : 2020-6-18, 9:23:27
    Author     : Kein
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
   <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <meta charset="UTF-8">
        <link rel="shortcut icon" href="http://localhost:8084/Project/Icon/Title.jpg">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <link rel="stylesheet" type="text/css" href="http://localhost:8084/Project/css/loginstyle.css"/>
    </head>
<body>
    <form action="http://localhost:8084/Project/servlet/Authenticate" method="post">
    <div class="header" id="head">
        <img src="http://localhost:8084/Project/Icon/logo.jpg" height="90" width="200" id="logo">
        <div class="title">Online Learing System</div>
    </div>
    <div class="wrap" id="wrap">
        <div class="logGet">
            <div class="logD logDtip">
                <center><p class="p1">LOGIN</p></center>
            </div>
            <div class="lgD">
                <img src="http://localhost:8084/Project/Icon/user.png" width="20" height="20" alt=""/>
                <input type="text" name="loginId" placeholder="Input UserName" />
            </div>
            <div class="lgD">
                <img src="http://localhost:8084/Project/Icon/psw.png" width="20" height="20"  alt=""/>
                <input type="password" name="password" placeholder=" Input Password" />
            </div>
            <center>
            <div class="logC">
                <button style="font-size: 25px; background-color: lightblue;"><a href="http://localhost:8084/Project/view/main.jsp" target="self" style="text-decoration: none;">Login</a></button>
            </div>
            <div class="logR">
                <button style="font-size: 25px; background-color: lightblue;"><a href="http://localhost:8084/Project/view/register.jsp" target="self"  style="text-decoration: none;">Register</a></button>
            </div>
            </center>    
        </div>
    </div>
    <div id="div2">
        <ul>
            <center><li><span>RQE（瑞启学院）</span></li></center>
            <center><li><span>Please call us: 13259652820</span></li></center>
        <center><li><span>Email: 954931689@qq.com</span></li></center>
            <center><li ><span>Online Learning System</span></li></center>
            <center><li ><p  id="brand">&copy Copyright 2020</p></li></center>
        </ul>
    </div>
        </form>
  </body>
</html>
