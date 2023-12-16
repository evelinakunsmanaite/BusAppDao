<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
        </style>
    </head>
    <body>
        <h2><fmt:message key="label.addSchedule" /></h2>

        <form action="AddServlet" method="post">
            <label for="routeNumber"><fmt:message key="label.routeNumber" /></label>
            <select name="routeNumber">
                <c:forEach var="route" items="${bus}">
                    <option value="${route}">${route}</option>
                </c:forEach>
            </select><br>

            <label for="schedule"><fmt:message key="label.schedule" /></label>
            <input type="text" name="schedule" required><br>

            <button class="b" type="submit"><fmt:message key="button.addSchedule" /></button>
        </form>

        <form action="page" method="post">
            <input type="hidden" name="page" value="toAdmin">
            <input type="submit" value="<fmt:message key="button.toHomepage" />">
        </form>
    </body></fmt:bundle>
</html>
