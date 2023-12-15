/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.controller;

import com.model.Schedule;
import java.io.IOException;
import java.util.HashSet;
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
@WebServlet(name = "UpdateServlet", urlPatterns = {"/UpdateServlet"})
public class UpdateServlet extends InitServlet implements Jumpable {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("id");
        Set<Schedule> schedules = scheduleService.read();// Получение списка абитуриентов из сервиса
        Set<Schedule> schedule = new HashSet<>();
        for (Schedule a : schedules) {
            if (a.getId() == Integer.parseInt(id)) {
                schedule.add(a);
            }
        }

        request.setAttribute("schedule", schedule);
        jump("/WEB-INF/jsp/update.jsp", request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));

        String routeNumber = request.getParameter("routeNumber");
        String schedule = request.getParameter("schedule");

        boolean isScheduleUpdate = scheduleService.update(id,routeNumber,schedule);

        Locale userLocale = request.getLocale();

        ResourceBundle bundle = ResourceBundle.getBundle("com.localization.messages.msg", userLocale);

        String successMessage = bundle.getString("error.dataUpdate");
        String failureMessage = bundle.getString("error.dataNotUpdate");

        request.setAttribute("error", isScheduleUpdate ? successMessage : failureMessage);

        jump("/WEB-INF/jsp/error.jsp", request, response);

    }

}
