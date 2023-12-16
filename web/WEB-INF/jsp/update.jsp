<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <fmt:setLocale value='${pageContext.response.locale}' scope="session"/>
    <fmt:bundle basename="com.localization.messages.msg">
<style>
        <%@include file="/resources/css/myStyle.css"%>
    </style>
</head>
<body>
    <h2><fmt:message key="edit" /></h2>
    
    <form action="UpdateServlet" method="post">
        <c:forEach var="schedule" items="${schedule}">
        <label for="routeNumber"><fmt:message key="label.routeNumber" /></label>
        
            <input type="text" name="routeNumber" value="${schedule.routeNumber}" required><br>
            
             <label for="schedule"><fmt:message key="label.schedule" /></label>
            <input type="text" name="schedule" value="${schedule.schedule}" required><br>
        
        <input type="hidden" name="id" value="${schedule.id}">
        
        <input type="submit" value="<fmt:message key="button.submit" />">
        </c:forEach>
    </form>
    
     <form action="page" method="post">
            <input type="hidden" name="page" value="toAdmin">
            <input type="submit" value="<fmt:message key="toHomepage" />">
        </form>  
</body>
</fmt:bundle>
</html>
