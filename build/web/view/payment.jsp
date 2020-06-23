<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Pay</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style type="text/css">
            #page1{
                margin-left: 150px;
                margin-right: 150px;
            }
            form{
                border: black 2px solid;
            }
        </style>
    </head>
    <body style="  background-image:url(http://localhost:8084/Project/images//8.jpg);background-repeat: no-repeat;background-size: 100% 1000%;">
    <center>
        <div id="page1">
            <h1>&nbsp&nbsp&nbsp&nbsp   Settlement page</h1>
            <hr>
            <h3>Fill in and check orders</h3>   
            <div id="page2" style=" background-image:url(http://localhost:8084/Project/images//paybj.jpg);background-size: 100%;">
                <form action=http://localhost:8084/Project/view/main.jsp" method="post">
                    <h4>Consignee information</h4>
                    <%
                            Object o = session.getAttribute("User");
                            if(o!=null){
                                com.niit.login.beans.Users usr = (com.niit.login.beans.Users)o;
                    %>
                    <input type="text" name="name" value="<%=usr.getUserName()%>">
                    <%
                    }
                    else{
                        getServletContext().getRequestDispatcher("/view/Login.jsp").forward(request, response);
                    }
                %>
                    
                    <br><hr>
                    <h4><b>Payment method</b></h4>
                    <image src="http://localhost:8084/Project/images/pay1.jpg" width="50" height="50">
                    <input type="radio" name="identity"/>WeChat
                    <image src="http://localhost:8084/Project/images/pay2.jpg" width="50" height="50">                  
                    <input type="radio" name="identity"/>Alipay
                    <br><hr>
                    <h4><b>Course name</b></h4>
                    <input type="text" name="name" value="${param.course}">
                    <br><hr>
                    <p><b>Invoice information</b>   <input type="text" value="填写纳税人识别号，以免报销" readonly="readonly"></p>
                    <br><hr>
                    <h4 style="text-align: right"><b>Amount due:${param.price}</b></h4>
                    <center>
                        
                         <a href="http://localhost:8084/Project/view1/java.html"> <input type="button" value="submit"/></a>
                    </center>
                </form> 
            </div>
        </div>
    </center>
    </body>
</html>

