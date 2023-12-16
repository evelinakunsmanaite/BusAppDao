<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <fmt:setLocale value='${pageContext.response.locale}' scope="session"/>
        <fmt:bundle basename="com.localization.messages.msg">
            <style>
                <%@include file="/resources/css/myStyle.css"%>
            </style>    </head>
        <body style='background: -webkit-linear-gradient(left, #25c481, #25b7c4); background: linear-gradient(to right, #25c481, #25b7c4); font-family: sans-serif; text-align: center;'>
            <div align="center">
                <h1 style='color:white;'>${error}</h1>
                <img src="<c:url value='/resources/img/bus.jpg' />" style="width: 35%; height: 35%;border-radius: 12px;" alt="bus">

                <form action="page" method="post">
                    <input type="hidden" name="page" value="toLogin">
                    <input type="submit" value="<fmt:message key="toHomepage" />">
                </form>      
            </div>
        </body></fmt:bundle>
</html>