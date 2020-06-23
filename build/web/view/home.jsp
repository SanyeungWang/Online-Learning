<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <script src="jquery-3.3.1.js"></script>
        <link rel="stylesheet" type="text/css" href="http://localhost:8084/Project/css/style.css"/>
        <link rel="stylesheet" type="text/css" href="http://localhost:8084/Project/css/homestyle.css"/>
    </head>
    <body>
        <%--
            <jsp:include page="header.jsp"/><--%>
        <div class="slider">
            <div class="main">
                <div class="main-i main-i-active">
                    <a href="#"><img src="http://localhost:8084/Project/images/Slider/A.jpg" /></a>
                </div>
                <div class="main-i">
                    <a href="#"><img src="http://localhost:8084/Project/images/Slider/B.jpg"/></a>
                </div>
                <div class="main-i">
                    <a href="#"><img src="http://localhost:8084/Project/images/Slider/C.jpg"/></a>
                </div>
                <div class="main-i">
                    <a href="#"><img src="http://localhost:8084/Project/images/Slider/D.jpeg"/></a>
                </div>
                <div class="main-i">
                    <a href="#"><img src="http://localhost:8084/Project/images/Slider/E.jpg"/></a>
                </div>
            </div>
            <div class="ctrl">
                <a class="ctrl-i ctrl-i-active" href="http://localhost:8084/Project/javascript:;">
                    <img src="http://localhost:8084/Project/images/Slider/A.jpg"/>
                </a>
                <a class="ctrl-i" href="http://localhost:8084/Project/javascript:;">
                    <img src="http://localhost:8084/Project/images/Slider/B.jpg"/>
                </a>
                <a class="ctrl-i" href="http://localhost:8084/Project/javascript:;">
                    <img src="http://localhost:8084/Project/images/Slider/C.jpg"/>
                </a>
                <a class="ctrl-i" href="http://localhost:8084/Project/javascript:;">
                    <img src="http://localhost:8084/Project/images/Slider/D.jpeg"/>
                </a>
                <a class="ctrl-i" href="http://localhost:8084/Project/javascript:;">
                    <img src="http://localhost:8084/Project/images/Slider/E.jpg"/>
                </a>
            </div>
            <script src="http://localhost:8084/Project/javascript/jquery.min.js" type="text/javascript" charset="utf-8"></script>
            <script type="text/javascript">
                var index = 0, timer;
                $(".ctrl-i").click(function () {
                    clearInterval(timer);
                    index = $(this).index();
                    slide(index);
                    timerF();
                })

                $(document).ready(function () {
                    timerF();
                })

                function timerF() {
                    timer = setInterval(function () {
                        index++;
                        if (index >= 5) {
                            index = 0;
                        }
                        slide(index);
                    }, 3000)
                }

                function slide(index) {
                    $(".ctrl .ctrl-i").eq(index).addClass("ctrl-i-active").siblings().removeClass("ctrl-i-active");
                    $(".main .main-i").eq(index).addClass("main-i-active");
                    setTimeout(function () {
                        $(".main .main-i").eq(index).siblings().removeClass("main-i-active");
                    }, 500)
                }

                //鼠标移到图片上禁止滚动，鼠标移开开始滚动
                $(".main-i").hover(function () {
                    clearInterval(timer);
                }, function () {
                    timerF();
                })
            </script>
        </div>
        <nav id="nav1">
            <div id="na1"><a href="project0.html" ><p style="color:white;font-family:'comfortaa';font-size:30px;">Category</p></a></div>
            <div id="search">
                <input type="text" id="box" placeholder="Search" style="text-indent:5%; height:36px;"  size="40">
                <input type="image"  id="sbt" src="http://localhost:8084/Project/images/g003.jpg" width="30px" height="30px" onclick="window.location.href = 'http://localhost:8084/Project/view/search.jsp';">
            </div>
            <ul >
                <li><a href="http://localhost:8084/Project/view1/java1.jsp" style="font-size:20px;color:blue;line-height:44px;">Java Language</a>
                <li><a href="http://localhost:8084/Project/view1/c.jsp" style="font-size:20px;color:blue;line-height:44px;">c Language</a></li>
                <li><a href="http://localhost:8084/Project/view1/python1.jsp" style="font-size:20px;color:blue;line-height:44px;">Phython </li>
                <li><a href="http://localhost:8084/Project/view1/c#.jsp" style="font-size:20px;color:blue;line-height:44px;"> C #</a></li>
                <li><a href="http://localhost:8084/Project/view1/math.jsp" style="font-size:20px;color:blue;line-height:44px;">Math </a></li>
                <li><a href="http://localhost:8084/Project/view1/English.jsp" style="font-size:20px;color:blue;line-height:44px;">English</a></li>
                <li><a href="http://localhost:8084/Project/view1/chinese.jsp" style="font-size:20px;color:blue;line-height:44px;">Chinese</a>
            </ul>
        </nav> 
        <div id="nav2">
            <ul>
                <li><a href="project3"><img src="http://localhost:8084/Project/images/d.jpg" width="230" height="115"></a></li> 
                <li><a href="project4"><img src="http://localhost:8084/Project/images/e.jpg" width="230" height="115"></a></li> 
                <li><a href="project5"><img src="http://localhost:8084/Project/images/f.jpg" width="230" height="500"></li></a> 
            </ul>
        </div> 
        <br>
        <br>
        <div id="background1"></div>
        <div id="fm">
            <a class="dta" href="project0.html"><h2 style="width:35%">Recommended for you</h2></a>
            <hr color="lightblue" size="1px">
            <table class="atable">
                <tr>
                    <td><a href="enter4.html"><img id="z01" src="http://localhost:8084/Project/images/27.jpg"  width="130"height="120" ></a></td>
                    <td><a href="enter5.html"><img id="z01" src="http://localhost:8084/Project/images/30.jpg"  width="130"height="120" ></a></td>
                    <td><a href="enter6.html"><img id="z01" src="http://localhost:8084/Project/images/31.jpg"  width="130"height="120" ></a></td>
                    <td><a href="enter7.html"><img id="z01" src="http://localhost:8084/Project/images/32.jpg"  width="130"height="120" ></a></td>
                    <td><a href="enter8.html"><img id="z01" src="http://localhost:8084/Project/images/33.jpg"  width="130"height="120" ></a></td>
                </tr>
                <tr>
                    <td><a class="bp"  href="enter8.html">金融学</a></td>
                    <td><a class="bp"  href="enter9.html">玩转iphone5</a></td>
                    <td><a class="bp"  href="enter10.html">可编程序控制器</a></td>
                    <td><a class="bp"  href="enter11.html">计算机网络技术</a></td>
                    <td><a class="bp"  href="enter12.html">互联网安全</a></td>
                </tr>
                <tr>
                    <td><p class="money">$22.0</p></td>
                    <td><p class="money">$10.0</p></td>
                    <td><p class="money">$4.0</p></td>
                    <td><p class="money">$7.8</p></td>
                    <td><p class="money">$18.7</p></td>
                </tr>
            </table>
            <a class="dta" href="project0.html"><h2 style="width:35%">Hot Course</h2></a>
            <hr color="black" size="3px">
            <img id="z01" src="http://localhost:8084/Project/images/b.jpg"  width="140"height="140" style="float:left;text-indent:30px;" >
            <div style="text-indent:40px;position:relative;left:30px;line-height:30px;padding-right:20px;padding-bottom:10px;">
                <p style="color:rgb(69, 74, 75);font-size:30px;font-family:'garamond' ;font-size:20px;font-weight:800;">
                    1.Fast and convenient,time-saving and labor-saving,break the restrictions of time and region,can be carried out anytime and anywhere.<br>
                    2.Low cost,high efficiency,borrowing the advantages of the Internet today,and complete to learn.<br>
                    3.One of the advantages of fully respecting the personlity of learning and motivating online learning is that
                    it is not limited by time ,place and space,and  can realize the same interaction as in reality.
                <table class="atable" style="border-right:dotted palevioletred 1.5px;border-top:dotted palevioletred 1.5px;border-bottom:dotted palevioletred 1.5px;border-left:dotted palevioletred 1.5px;padding-top:10px;padding-right:10px;">
                    <tr>
                        <td><a href="enter9.html"><img id="z01" src="http://localhost:8084/Project/images/20.jpg"  width="140"height="120" ></a></td>
                        <td><a href="enter7.html"><img id="z01" src="http://localhost:8084/Project/images/21.jpg"  width="140"height="120" ></a></td>
                        <td><a href="enter10.html"><img id="z01" src="http://localhost:8084/Project/images/22.jpg"  width="140"height="120" ></a></td>
                        <td><a href="enter11html"><img id="z01" src="http://localhost:8084/Project/images/28.jpg"  width="140"height="120" ></a></td>
                    </tr>
                    <tr>
                        <td><a class="bp"  href="enter6.html">Office 2013电脑办公</a></td>
                        <td><a class="bp"  href="enter7.html">Excel 从入门到精通</a></td>
                        <td><a class="bp"  href="enter8.html">Android 基础教程</a></td>
                        <td><a class="bp"  href="enter9.html">经济法</a></td>

                    </tr>
                    <tr>
                        <td><p class="money">$ 14.0</p></td>
                        <td><p class="money">$ 31.0</p></td>
                        <td><p class="money">$ 22.7</p></td>
                        <td><p class="money">$ 34.5</p></td>

                    </tr>
                    <div id="div1">
                        <h1 style="font-family: cursive;color:blue;font-size:30px">Course 1</h1>

                        <p><a href="https://www.lynda.com/PostgreSQL-tutorials/SQL-Exploratory-Data-Analysis-Essential-Training/672259-2.html">
                                <img src="http://localhost:8084/Project/images/24.jpg"  width="180" height="150">
                            </a></p>
                        <h3>Computer Composition and Design</h3>
                        <p id="p1">Wu Haozhi</p>
                        <p >Learn how to use composition to understand the characteristics of data sets destined for data science
                            and machine learning </p>
                        <p id="p2"><b>June 07,2017 </b></p> 
                        <p id="p3">Views 3.678</p>  
                    </div>
                    <div id="div2">
                        <h1 style="font-family: cursive;color:blue;font-size:30px">Course 2</h1>

                        <p ><a href="https://www.lynda.com/R-tutorials/R-Data-Science-Lunchbreak-Lessons/651209-2.html">
                                <img src="http://localhost:8084/Project/images/27.jpg" width="180" height="150">
                            </a></p>
                        <h3>Learn some finance every day</h3>
                        <p id="p1">Fina Cdong Jun</p>
                        <p >Finance id favorable to development and broadening the world,development tools, 
                            and librates that will make you a more productive R programmer </p>
                        <p id="p2"><b>Jun 13,2019 </b></p> 
                        <p id="p3">Views 26.746</p>  
                    </div>
                    <div id="div3">
                        <h1 style="font-family: cursive;color:blue;font-size:30px">Course 3</h1>

                        <p ><a href="https://www.lynda.com/IT-Infrastructure-tutorials/Learning-Cloud-Computing-Cloud-DevOps/721903-2.html">
                                <img src="http://localhost:8084/Project/images/33.jpg" width="180" height="150">
                            </a></p>
                        <h3>40 Wisdom Holes for Internat Security</h3>
                        <p id="p1">with David Linthicum</p>
                        <p >Move Devops to the cloud.Learn how to set up cloud-based Devops prosses and leverage  services
                            offered by Amazon Microsoft,and Googles
                        </p>

                        <p id="p2"><b>June 12,2018 </b></p> 
                        <p id="p3">Views 870</p>  
                    </div>
                    <div id="div4">
                        <h1 style="font-family: cursive;color:blue;font-size:30px">Course 4</h1>

                        <p ><a href="https://www.lynda.com/IT-Infrastructure-tutorials/Learning-System-Center-2016-Data-Protection-Manager/664828-2.html">
                                <img src="http://localhost:8084/Project/images/31.jpg" width="180" height="150">
                            </a></p>
                        <h3>Application Technology of Programmable Controller</h3>
                        <p id="p1">with Daniel Lachance</p>
                        <p >Learn how to implement enterprise-class disater recovery with System Center 2016 Data Protection
                            Manager 
                        </p>
                        <p id="p2"><b>Apr 16,2019 </b></p> 
                        <p id="p3">Views 1,681</p>  
                    </div>
                </table>
                <div class='card-holder'>
                    <div class='card-wrapper'>   
                        <a href='#'>
                            <div class='card bg-01'>
                                <img src="http://localhost:8084/Project/Icon/QQ.png" height="30px" width="30px">
                            </div>
                        </a>
                        <a href='#'>
                            <div class='card bg-01'>
                                <img src="http://localhost:8084/Project/Icon/WeChat.png" height="30px" width="30px">
                            </div>
                        </a>
                        <a href='#'>
                            <div class='card bg-01'>
                                <img src="http://localhost:8084/Project/Icon/Facebook.png" height="30px" width="30px">
                            </div>
                        </a>
                        <a href='#'>
                            <div class='card bg-01'>
                                <img src="http://localhost:8084/Project/Icon/WangYi.png" height="30px" width="30px">
                            </div>
                        </a>
                        <a href='#'>
                            <div class='card bg-01'>
                                <img src="http://localhost:8084/Project/Icon/Twitter.png" height="30px" width="30px">
                            </div>
                        </a> 
                        <a href='#'>
                            <div class='card bg-01'>
                                <img src="http://localhost:8084/Project/Icon/Internet.png" height="30px" width="30px">
                            </div>
                        </a> 
                    </div>
                </div>



                </body>
                </html>
