<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="err" tagdir="/WEB-INF/tags" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <core:url var="css" value="/resources/css/myStyle.css"></core:url>
    <link rel="stylesheet" href="${css}" type="text/css" />
            <fmt:setLocale value='${pageContext.response.locale}' scope="session"/>
            <fmt:bundle basename="com.localization.messages.msg">
    <style>
        <%@include file="/resources/css/myStyle.css"%>
    </style>
</head>
<body>
    <h1 align="center"><fmt:message key="title.login" /></h1>
    <p align="center" class="f"><fmt:message key="login.enterCredentials" /></p>
    <br>
    <div class="block" align="left">
         <err:error />
        <form action="LoginServlet" method="post" align="center">
            <span id="result"></span>
            <label>&nbsp;&nbsp;&nbsp;&nbsp;<fmt:message key="label.login" /></label>
            <input type="text" name="login"/>
            <span id="result"></span>
            <label>&nbsp;&nbsp;&nbsp;&nbsp;<fmt:message key="label.password" /></label>
            <input type="password" name="pass"/>
            <br><br><br>
            <input type="submit" class="submit" id="inp" value="<fmt:message key="button.submit" />">
        </form>

        <form action="LocalServlet"> 
            <div class="form-group form-button">
                <input type="hidden" name="locale" value="en"/>
                <input class="form-submit" type="submit" value='<fmt:message key="locale.button.en" />'/>
            </div>
        </form> 

        <form action="LocalServlet"> 
            <div class="form-group form-button">
                <input type="hidden" name="locale" value="ru"/>
                <input class="form-submit"  type="submit" name="locale" value='<fmt:message key="locale.button.ru" />'/>
            </div>
        </form>
    </div>
</body></fmt:bundle>
</html>
