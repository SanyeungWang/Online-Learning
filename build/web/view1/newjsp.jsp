<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="http://localhost:8084/Project/css/headpage.css"/>
    </head>
    <body>
        
        <div class="nav">    
        <ul>
            <li class="home"><a href="newjsp.jsp">Home</a></li>
            <li class="cat"><a href="Category.html">Category</a></li>
            <li class="pay"><a href="Read.courses.html">Payment</a></li>
        </ul>
        <div id="search">
        <input type="text" id="box" placeholder="Search" style="text-indent:5%; height:27px;"  size="40">
        <input type="image"  id="sbt" src="http://localhost:8084/Project/images/g003.jpg" width="20px" height="27px" formaction="http://www.baidu.com">
    </div>
              <br>
       <iframe name="head" src="http://localhost:8084/Project/view/home.jsp" frameborder="0" width="100%" height="1900px" scrolling="no"></iframe> 
    </body>
</html>
