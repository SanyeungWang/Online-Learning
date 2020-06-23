<%-- 
    Document   : registerdata
    Created on : 2020-6-20, 17:52:02
    Author     : Charles
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%@ page import = "java.sql.*"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <sql:setDataSource var = "ds" driver = "org.apache.derby.jdbc.ClientDriver"
                           url = "jdbc:derby://localhost:1527/learning" user = "wcy" password = "wcy"/>

        <sql:update dataSource = "${ds}" var = "count">
            INSERT INTO USERS
            VALUES (${param.loginId},'${param.password}', '${param.userType}', '${param.userName}', '${param.userEmail}', '${param.userPhone}')
        </sql:update>
        <jsp:forward page="newlogin.jsp"/>
    </body>
</html>
