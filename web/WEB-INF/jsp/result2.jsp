<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <core:url var="css" value="/resources/css/myStyle.css"></core:url>
            <link rel="stylesheet" href="${css}" type="text/css" />
                    <fmt:bundle basename="com.localization.messages.msg">
                   <fmt:setLocale value='${pageContext.response.locale}' scope="session"/>

            <style>
                <%@include file="/resources/css/myStyle.css"%>
            </style>
        </head>
        <body>
            <table>
                <thead class="tbl-header">
                    <th><fmt:message key="label.routeNumber" /></th>
                    <th><fmt:message key="label.schedule" /></th>
                </thead>
                <core:forEach var="s" items="${result}">
                    <tr>
                        <td>${s.routeNumber}</td>
                        <td>${s.schedule}</td>
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
