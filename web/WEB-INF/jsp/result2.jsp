<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
    <fmt:bundle basename="guest.localization.messages.msg">
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <core:url var="css" value="/resources/css/myStyle.css"></core:url>
            <link rel="stylesheet" href="${css}" type="text/css" />
        </head>
        <body>
            <core:choose>
                <core:when test="${not empty result}">
                    <table>
                        <thead class="tbl-header">
                        <th>Номер маршрута</th>
                        <th>Расписание</th>
                    </thead>
                    <core:forEach var="s" items="${result}">
                        <tr>
                            <td>${s.routeNumber}</td>
                            <td>${s.schedule}</td>
                        </tr>
                    </core:forEach>
                </table>
            </core:when>
            <core:otherwise>
                <p class="w">
                    <core:out value="Искомые данные отсутствуют. Пожалуйста, вернитесь и повторите попытку" /></p>
                    <core:url var="gif" value="/resources/img/bus.jpg"></core:url>
                    <div style="display: flex; justify-content: center;">
                        <img src="${gif}" style="width:35%; height:35%; border-radius: 12px; " alt="bus">
                </div>
                <br>
            </core:otherwise>
        </core:choose>
        <form action="WelcomeServlet">
            <input type="hidden" name="toCab" value="true"/>
            <input type="submit" class="submit" value="Назад"/>
        </form> 
    </body>
</fmt:bundle>
</html>
