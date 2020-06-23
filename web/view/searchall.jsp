<%-- 
    Document   : search
    Created on : 2020-6-22, 19:55:32
    Author     : Charles
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import = "java.sql.*"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AdminPanel</title>
        <style>
            body{
                background-image: url("http://localhost:8084/Project/images/beijin.jpg");
                background-repeat: no-repeat;
                background-size: cover;
            }

        </style>
    </head>
    <body>
        <sql:setDataSource var = "ds" driver = "org.apache.derby.jdbc.ClientDriver"
                           url = "jdbc:derby://localhost:1527/learning" user = "wcy" password = "wcy"/>
        <sql:query dataSource="${ds}" var="result">
            Select * From COURSES
        </sql:query>
    <center>
        <h1>View Data</h1>
    </center>
    <center>
        <table border = "1" width = "800px">
            <tr>
                <th>Course_ID</th>
                <th>Course_name</th>
                <th>Category</th>
                <th>Table_Of_Content</th>
                <th>Course_Fees</th>
            </tr>
            <c:forEach var = "row" items = "${result.rows}">
                <tr>
                    <td><input value='<c:out value = "${row.COURSE_ID}"/>' name='courseid' ></td>
                    <td><input value='<c:out value = "${row.COURSE_NAME}"/>' name='coursename' ></td>
                    <td><input value='<c:out value = "${row.CATEGORY}"/>' name='coursetype' onclick="window.location.href = 'http://localhost:8084/Project/view1/java1.jsp';"></td>  
                    <td><input value='<c:out value = "${row.TABLE_OF_CONTENT}"/>' name='courseco' ></td>
                    <td><input value='<c:out value = "${row.COURSE_FEES}"/>' name='coursefee' ></td>
                </tr>
            </c:forEach> 
        </table>
        <br>
        <br>

        <div style="width: 800px;height: 500px;">
            <center>



            </center>
        </div>
    </center>
</body>
</html>
