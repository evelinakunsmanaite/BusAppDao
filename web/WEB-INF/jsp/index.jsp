<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <core:url var="css" value="/resources/css/myStyle.css"></core:url>
        <link rel="stylesheet" href="${css}" type="text/css" />
        <title>Форма авторизации</title>
    </head>
    <body>
        <form action="WelcomeServlet" method="post" align="center">
            <h1 align="center">Для начала работы Вам необходимо войти в учетную запись</h1>
            <p align="center" class="f">Пожалуйста, введите свои логин и пароль</p>
            <br>
            <div class="block" align="left">
                <form action="WelcomeServlet" method="post" align="center">
                    <span id ="result"></span>
                    <label >&nbsp;&nbsp;&nbsp;&nbsp;Логин</label>
                    <input type="text" name="login"/>
                    <span id ="result"></span>
                    <label >&nbsp;&nbsp;&nbsp;&nbsp;Пароль</label>
                    <input type="password" name="pass"/>
                    <br>
                    <br>
                    <br>
                    <input type="submit" class="submit" id="inp" value="Ввод">
                </form>
            </div>
    </body>
</html>