<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ page import = "java.sql.*"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="http://localhost:8084/Project/javascript/login.js"></script>
        <title>Register Page</title>
        <link rel="shortcut icon" href="http://localhost:8084/Project/Icon/Title.jpg">
        <link rel="stylesheet" href="http://localhost:8084/Project/css/mystyle.css"/>
        <link rel="stylesheet" type="text/css" href="http://localhost:8084/Project/css/loginstyle.css"/>
    </head>
    <body style="background-image: linear-gradient(200deg,#9fbaa8, green);">
        <div class="header" id="head">
        <img src="http://localhost:8084/Project/Icon/logo.jpg" height="90" width="200" id="logo">
        <div class="title">Online Learing System</div>
    </div>
        <div id="mainContent">
            <span id="loginName">${sessionScope.User.userName}</span>
            <br><br><br><br><br>
            <center>
                <form action="registerdata.jsp" method="POST">
                    <h1 style="margin-top:-65px">REGISTER</h1>
                    <table style="outline: 1px solid;">
                        <caption style="border: 2px solid #eeeeee;">User Registration Form</caption>
                        <tr>
                            <td>User_ID</td>
                            <td><input type="text" placeholder="Enter your  User ID" name="loginId" id="loginId" onkeypress="checkUser(this);" onchange="checkUser(this);" required/></td>
                            <td><button onclick="return verifyUser();">Check Availability</button></td>
                            <td><div id="container" style="display: none;"></div></td>
                        </tr>
                        <tr>
                            <td>Password</td>
                            <td><input type="password" placeholder="Enter Password" name="password" id="password" required/></td>
                        </tr>
                        <tr>
                            <td>Re-Password</td>
                            <td><input type="password" placeholder="Enter Password Again" name="rePassword" id="rePassword" required/></td>
                        </tr>
                        <tr>
                            <td>User Type</td>
                            <td><input type="radio" name="userType" value="admin"/>Admin &nbsp;&nbsp;&nbsp;
                                <input type="radio" name="userType" value="customer"/>Customer</td>
                        </tr>
                        <tr>
                            <td>Full Name</td>
                            <td><input type="text" placeholder="Enter Your Full Name" name="userName" required/></td>
                        </tr>
                        <tr>
                            <td>User_Email</td>
                            <td><input type="text" placeholder="Enter Your Email" name="userEmail" required/></td>
                        </tr>
                        <tr>
                            <td>User_Contact</td>
                            <td><input type="text" placeholder="Enter Your Mobile Number" name="userPhone" required/></td>
                        </tr>
                        <tr>
                            <td><input type="submit" value="Register"style="margin-left: 100px;" onclick="return validatePassword();"/></td>
                            <td><input type="reset" style="margin-left: 30px;" value="    Reset    "/></td>
                        </tr>
                    </table>
                </form>
                <br/>
                <a href="http://localhost:8084/Project/view/newlogin.jsp"><button style="width: 21%;
	height: 30px;
	background-color:black;color: white;
	font-size: 20px;">Login</button></a> &nbsp;&nbsp;&nbsp;&nbsp;
                <%--<a href="http://localhost:8084/LoginModule/resetPassword.jsp">Reset Password</a>
                <%
                    Object status = request.getAttribute("status");
                    if(status!=null && status.toString().equals("false")){
                %>
                <h3 style="color:red;">Registration Not Done!! Please write an email to nitesh.singh@niit.com.cn</h3>
                <%
                    }
                %>--%>
                <br><br><br><br><br><br><br><br><br>
            </center>
        </div>
       <div id="div2">
        <ul>
            <center><li><span>RQE（瑞启学院）</span></li></center>
            <center><li><span>Please call us: 13259652820</span></li></center>
        <center><li><span>Email: 954931689@qq.com</span></li></center>
            <center><li ><span>Online Learning System</span></li></center>
            <center><li ><p  id="brand">&copy Copyright 2019</p></li></center>
        </ul>
    </div>
    </body>
</html>
