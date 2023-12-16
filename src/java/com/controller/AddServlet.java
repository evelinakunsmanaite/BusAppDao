/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.controller;

import com.model.Schedule;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
@WebServlet(name = "AddServlet", urlPatterns = {"/AddServlet"})
public class AddServlet extends InitServlet implements Jumpable {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<String> bus = busService.getBus();
        request.setAttribute("bus", bus);
        jump("/WEB-INF/jsp/adminAdd.jsp", request, response);
    }//сработывает при нажатии на ссылку добавить 

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String routeNumber = request.getParameter("routeNumber");
        String schedule = request.getParameter("schedule");

        // Создаем объект абитуриента
        Schedule schedules = new Schedule(routeNumber, schedule);
        boolean isPatientAdd = scheduleService.create(schedules);
        
        
        Locale userLocale = request.getLocale();

        ResourceBundle bundle = ResourceBundle.getBundle("com.localization.messages.msg", userLocale);

        String successMessage = bundle.getString("error.dataAdded");
        String failureMessage = bundle.getString("error.dataNotAdded");

        request.setAttribute("error", isPatientAdd ? successMessage : failureMessage);

        jump("/WEB-INF/jsp/error.jsp", request, response);

    }
}
