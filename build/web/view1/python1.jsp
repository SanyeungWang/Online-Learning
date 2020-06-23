<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">

        <title>Document</title>
        
        <script type="text/javascript">
            function  checkLogin() {
                var isLogin = window.localStorage.getItem("isLogin");
                if (isLogin ==="1") {
                    document.getElementById("loginlogout").innerHTML = "Logout";
                }
            }
            function logout() {
                var isLogin = window.localStorage.getItem("isLogin");
                if (isLogin === "1") {
                    var ans = confirm("Do you want to log out?");
                    if (ans === true) {
                        window.localStorage.setItem("isLogin", "0");
                        document.getElementById("loginlogout").innerHTML = "Login";
                        return false;
                    } else
                        return false;
                }
            }
        </script>	
        <link rel="stylesheet" type="text/css" href="http://localhost:8084/Project/css/course.css" />

    </head>
    <body onload="checkLogin()" style="  background-image:url(http://localhost:8084/Project/Icon/1.jpg);background-size: 100%;">
        <article>
            <div id="div1">
                <a href="#iddiv1" style="text-decoration: none; color:white; display: block;">Courses</a>

            </div>
            <div id="div2">
                <a href="#iddiv2" style="text-decoration: none; color:white; display: block;">Teachers</a>
            </div>
            <div id="div3"><a href="#iddiv3" style="text-decoration: none; color:white; display: block;"> Recommended Courses</a></div>

            <div id="iddiv1">
                <h2 style="font-size: 40px ;color: rgb(96, 189, 21);margin-left:250px">python </h2>
            </div>
            <h1 style="margin-left:250px">English courses</h1>
            <div id="pro1">
                <a  href="http://localhost:8084/Project/view/java.html"> <img src="http://localhost:8084/Project/images/java1.jpeg" id="img24" style="margin:10px;width:290px;height:100px;"  id="s1"></a>            
                <figcaption style="margin-top:-20px;margin-left:60px"><h4>Java Core Technology</h4></figcaption>
                <p style="margin:10px">  Java is not only a programming language, but also a huge ecosystem....... </p>
                <a href="http://localhost:8084/Project/view/payment_page.jsp"> <input type="button" value="$65"/></a>

            </div>
            <div id="pro2">
                <img src="http://localhost:8084/Project/images/java2.png" id="img24" style="margin:10px;width:290px;height:100px;"  id="s2">
                <figcaption style="margin-top:-20px;margin-left:60px"><h4>Java programming</h4></figcaption>
                <p style="margin:10px">Java is welcomed for its excellent simplicity, versatility, and security...</p>
                <a href="http://localhost:8084/new_proj/view/payment_page.jsp"><input type="button" value="$30"/></a>
            </div>
            <div id="pro3">
                <img src="http://localhost:8084/Project/images/java3.jpg" id="img24" style="margin:10px;width:290px;height:100px;"  id="s3">
                <figcaption style="margin-top:-20px;margin-left:60px"><h4>Java Application Development Foundation</h4></figcaption>
                <p style="margin:10px">The goal is Java development capabilities.....</p>
                <a href="http://localhost:8084/Project/view/payment_page.jsp"><input type="button" value="$45"/></a>
            </div>


            <h2 style="margin-left:250px;margin-top:325px">Chinese Courses</h2>
            <div id="pro4">
                <img src="http://localhost:8084/Project/images/java4.jpg" id="img24"  style="margin:10px;width:290px;height:100px;"  >
                <figcaption style="margin-top:-35px;margin-left:120px"><h4>java程序设计</h4></figcaption>
                <p style="margin-left:10px;margin-top:-10px">java以卓越的简洁性，卓越行，可移植性和安全性受到欢迎....
                </p>
                <a href="http://localhost:8084/Project/view/payment.jsp"><input type="button" value="$55"/></a>
            </div>
            <div id="pro5">
                <img src="http://localhost:8084/Project/images/java5.png" id="img24"  style="margin:10px;width:290px;height:100px;" id="s5">
                <figcaption style="margin-top:-35px;margin-left:90px"><h4>Java面向对象的程序设计</h4></figcaption>
                <p style="margin-left:10px;margin-top:-10px">讲授Java编程知识同时，培养计算和创新思维，学习和实践并行....</p>
                <a href="http://localhost:8084/Project/view/payment.jsp"><input type="button" value="$52"/></a>
            </div>
            <div id="pro6">
                <img src="http://localhost:8084/Project/images/java6.jpg"  id="img24" style="margin:10px;width:290px;height:100px;" id="s6">
                <figcaption style="margin-top:-35px;margin-left:120px"><h4>Java核心技术</h4></figcaption>
                <p style="margin-left:10px;margin-top:-5px">Java被广泛应用到企业级系统，手机，桌面系统等技术，是市场最急需的技术... </p>
                <a href="http://localhost:8084/Project/view/payment.jsp"> <input type="button" value="$50"/></a>
            </div>
            <div id="iddiv2">
                <h2 style="font-size: 40px;margin-left:250px;margin-top:300px;color: rgb(96, 189, 21);">Teachers Introduction</h2>
            </div>
            <div style="border: 2px solid black;width:980px;margin-left:250px;height:280px;border-radius: 5px;background-color:aliceblue" >
                <div id="exp1" >
                    <h4>Mr. Gordon Moore</h4>
                    <p>This is a truly excellent collection of resources and highly recommended. They are succinct,to the point and 
                        well presented. Students will find them accessible, relevant and easily digestible. Keep up the good work!
                    </p>
                </div>
                <div id="exp2">
                    <h4>Dr. Jahangir Alam</h4>
                    <p>It's amazing to have a website like tutorialspoint at zero price and providing the best self learning content. 
                        I always recommend my students to refer to tutorialspoint for their assignments.
                    </p>
                </div>
                <div id="exp3">
                    <h4>Velma Latson</h4>
                    <p>It's amazing to have a website like tutorialspoint at zero price and providing the best self learning content. 
                        I always recommend my students to refer to tutorialspoint for their assignments.
                    </p>
                </div>
            </div>
            <div id="exp4" style="border: 2px solid black;width:980px;margin-left:250px;height:120px;background-color:lightgray">
                <h4>Mayun</h4>
                <p>Alibaba was founded in 1999, and as the CEO of Ali Group, Chairman of the Board of Directors, May 10, 2013, 
                    resigned as Alibaba Group CEO, continue to be the Chairman of the group of Ali. June 30, 2015, Ma Yun was 
                    elected the Global Internet Governance Alliance Council co-Chairmen. 
                </p>
            </div>
            <div id="exp5" style="border: 2px solid black;width:980px;margin-left:250px;height:160px;background-color:aliceblue">
                <h4>Ma_Huateng</h4>
                <p>MA, majoring in computer and applications at Shenzhen University, obtained a Bachelor of Science degree in 1993.
                    Ma has been in charge of China Telecom service and product supplier Shenzhen Run Xun Communications Development Co., 
                    Ltd. is responsible for the Internet paging system research and development work, in the telecommunications and Internet 
                    industry has more than 10 years of experience. 1998, MA and friend Zhang Zhidong registered to set up "Shenzhen Tencent 
                    Computer System Co., Ltd.". 2009, Tencent was selected as "Fortune", "the world's most respected 50 companies".
                </p>
            </div>
            <div id="exp6"style="border: 2px solid black;width:980px;margin-left:250px;height:155px;background-color:lightgray;">
                <h4>Li_Yanhong</h4>
                <p>Senior Engineer for a senior consultant, the Wall Street Journal's online real-time financial information system, and an 
                    internationally renowned internet company--infoseek. Li's "Hyper-chain analysis" technology patent, is to lay the whole modern 
                    search engine development trend and direction of one of the basic inventions. In January 2000, Lee founded Baidu. Today, Baidu 
                    has developed into the world's second-largest independent search engine and the largest Chinese search engine.
                </p>
            </div>
            <div id="iddiv3">
                <h2 style="font-size: 40px;margin-left:250px;margin-top:550px;color: rgb(96, 189, 21);">Recommended Courses</h2>
            </div>
            <p style="margin-left:300px;font-size:30px;font-family:'Courier New';color:rgb(35, 70, 175);"><b>C Langerge</b></p>
            <a href="http://localhost:8084/Project/view/math.jsp" target="_Blank"> <img id="img24" src="http://localhost:8084/Project/images/Java/1.jpg" style="height:260px;width:300px;margin-left:560px;margin-top:-30px;position:absolute;border-radius:30px;"></a>
            <p style="margin-left:670px;margin-top:-70px;color:rgb(35, 70, 175);font-size:30px;font-family:'Courier New';position:absolute;"><b>Java</b></p>
            <p style="margin-left:800px">expert</p>
            <a href="http://localhost:8084/Project/view/English.jsp" target="_Blank">
                <img id="img24"src="http://localhost:8084/Project/images/C/A.jpg"  style="height:260px;width:300px;margin-left:240px;margin-top:-65px;position:absolute;border-radius:30px;"></a>
            <p style="margin-left:970px;font-size:30px;font-family:'Courier New';margin-top:-15px;margin-top:-100px;color:rgb(35, 70, 175);"><b>Python</b></p>
            <a href="http://localhost:8084/Project/view/Chemistry.jsp" target="_Blank"><img id="img24"src="http://localhost:8084/Project/images/Python/A.jpg"  style="height:260px;width:300px;margin-left:880px;margin-top:-25px;position:absolute;border-radius:30px;"></a> </article>
    </body>
</html>