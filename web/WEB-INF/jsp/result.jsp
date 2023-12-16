<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
            <table>
                <thead class="tbl-header">
                    <th>ID</th>
                    <th><fmt:message key="label.driverName" /></th>
                    <th><fmt:message key="label.busNumber" /></th>
                    <th><fmt:message key="label.routeNumber" /></th>
                    <th><fmt:message key="label.brand" /></th>
                    <th><fmt:message key="label.yearOfService" /></th>
                    <th><fmt:message key="label.mileage" /></th>
                </thead>
                <core:forEach var="b" items="${result}">
                    <tr>
                        <td>${b.id}</td>
                        <td>${b.driverName}</td>
                        <td>${b.busNumber}</td>
                        <td>${b.routeNumber}</td>
                        <td>${b.brand}</td>
                        <td>${b.yearOfService}</td>
                        <td>${b.mileage}</td>
                    </tr>
                </core:forEach>
            </table>

            <form action="page" method="post">
                <input type="hidden" name="page" value="toUser">
                <input type="submit" value="<fmt:message key="button.toHomepage" />">
            </form>  
        </body>
    </fmt:bundle>
</html>
