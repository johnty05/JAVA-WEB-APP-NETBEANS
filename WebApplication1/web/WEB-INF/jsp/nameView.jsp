<%-- 
    Document   : nameView
    Created on : 7 Feb, 2019, 10:20:40 PM
    Author     : Saurav
--%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>NAME</title>
    </head>
    <body style="background-color: blueviolet">
    <center>
        <h1 style="color:white">ENTER YOUR NAME</h1>
        <spring:nestedPath path="name">
    <form action="" method="post" style="color: white">
        Name:
        <spring:bind path="value">
            <input type="text" name="${status.expression}" value="${status.value}">
        </spring:bind>
        <input type="submit" value="OK">
    </form>
</spring:nestedPath>
    </center>
    </body>
</html>
