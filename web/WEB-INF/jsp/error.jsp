<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ошибка</title>
    </head>
    <body style='background: -webkit-linear-gradient(left, #25c481, #25b7c4); background: linear-gradient(to right, #25c481, #25b7c4); font-family: sans-serif; text-align: center;'>
        <div align="center">
            <h1 style='color:white;'>${error}</h1>
            <form action="WelcomeServlet">
                <input type="submit" style='background-color: transparent; color: white; display: inline-block; margin: 10px 20px; padding: 10px 30px; border-color: white;' value="Назад"/>
            </form>        
        </div>
    </body>
</html>