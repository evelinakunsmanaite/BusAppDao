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
    <h1><fmt:message key="welcome" />, <%= session.getAttribute("name")%>!</h1>
    <span class="f"><h2><fmt:message key="page.description" /></h2></span>
    
    <div class="form-block" align="center">
        <form action="allServlet" method="get">
            <span class="f"><h2><fmt:message key="page.fullBusList" /></h2></span>
            <input type="submit" value="<fmt:message key="button.submit" />">
        </form>
    </div>
    
    <br><br>
    
    <div class="form-block" align="center">
        <form action="routeServlet" method="post">
            <span class="f"><h2><fmt:message key="page.searchByRouteNumber" /></h2></span>
            <span class="f"><label><fmt:message key="label.routeNumber" />: </label>
                <input type="text" name="routeNumber" required></span>
            <input type="submit" value="<fmt:message key="button.submit" />">
        </form>
    </div>
    
    <br><br>
    
    <div class="form-block" align="center">
        <form action="exploreServlet" method="post">
            <span class="f"><h2><fmt:message key="page.searchByExp" /></h2></span>
            <span class="f"><label><fmt:message key="label.exp" />: </label>
                <input type="number" name="exp" required autocomplete="off"></span>
            <input type="submit" value="<fmt:message key="button.submit" />">
        </form>
    </div>
    
    <br><br>
    
    <div class="form-block" align="center">
        <form action="mileageServlet" method="post">
            <span class="f"><h2><fmt:message key="page.searchByMileage" /></h2></span>
            <span class="f"><label><fmt:message key="label.mileage" />: </label>
                <input type="number" name="mlg" required autocomplete="off"></span>
            <input type="submit" value="<fmt:message key="button.submit" />">
        </form>
    </div>
    
    <br><br>
    
    <div class="form-block" align="center">
        <form action="scheduleServlet" method="post">
            <span class="f"><h2><fmt:message key="page.viewSchedule" /></h2></span>
            <span class="f"><label><fmt:message key="label.routeNumber" />: </label>
                <input type="text" name="routeNumber" required></span>
            <input type="submit" value="<fmt:message key="button.submit" />">
        </form>
    </div>
    
    <br><br>
    
    <form action="page" method="post">
        <input type="hidden" name="page" value="toLogin">
        <input type="submit" value="<fmt:message key="toHomepage" />">
    </form>         
</body></fmt:bundle>
</html>
