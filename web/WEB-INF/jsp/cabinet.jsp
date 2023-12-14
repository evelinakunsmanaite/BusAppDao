<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
    <head>
        <title>Кабинет пользователя</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <core:url var="css" value="/resources/css/myStyle.css"></core:url>
        <link rel="stylesheet" href="${css}" type="text/css" />
    </head>
    <body>
        <h1>Добро пожаловать, ${name}!</h1>
        <span class="f"><h2>На данной странице вы можете просмотреть весь перечень автобусов, совершить поиск отдельных транспортных средств по различным критериям, а также посмотреть расписание автобусов</h2></span>
        <div class="form-block" align="center">
            <form action="allServlet" method="get">
                <span class="f">  <h2>Вывод полного списка автобусов</h2></span>
                <button type="submit" class="b">Вывести</button>
            </form>
        </div>
        <br>
        <br>
        <div class="form-block" align="center">
            <form action="routeServlet" method="post">
                <span class="f">   <h2>Поиск авобусов по номеру маршрута</h2></span>
                <span class="f">   <label>Номер маршрута: </label>
                    <input type="text" name="routeNumber" required></span>
                <button type="submit" class="b">Найти</button>
            </form>
        </div>
        <br>
        <br>
        <div class="form-block" align="center">
            <form action="exploreServlet" method="post">
                <span class="f">  <h2>Поиск автобусов по количеству лет эксплуатации</h2></span>
                <span class="f">  <label>Количество лет эксплуатации: </label>
                    <input type="number" name="exp" required autocomplete="off"></span>
                <button type="submit" class="b">Найти</button>
            </form>
        </div>
        <br>
        <br>
        <div class="form-block" align="center">
            <form action="mileageServlet" method="post">
                <span class="f"> <h2>Поиск автобусов по пробегу</h2></span>
                <span class="f">  <label>Пробег: </label>
                    <input type="number" name="mlg" required autocomplete="off"></span>
                <button type="submit" class="b">Найти</button>
            </form>
        </div>
        <br>
        <br>
        <div class="form-block" align="center">
            <form action="scheduleServlet" method="post">
                <span class="f">   <h2>Вывод расписания автобуса по номеру маршрута</h2></span>
                <span class="f"> <label>Номер маршрута: </label>
                    <input type="text" name="routeNumber" required></span>
                <button type="submit" class="b">Вывести</button>
            </form>
        </div>
        <br>
        <br>
        <form action="WelcomeServlet">
            <input type="hidden" name="logout" value="true"/>
            <input type="submit" class="submit" value="Назад"/>
        </form>        
    </body>
</html>
