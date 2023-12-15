package com.controller;

import com.model.Schedule;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ScheduleServlet", urlPatterns = {"/scheduleServlet"})
public class ScheduleServlet extends InitServlet implements Jumpable {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            String routeNumber = request.getParameter("routeNumber");
            
            List<Schedule> result = scheduleService.route(routeNumber);

        if (!result.isEmpty()) {
            request.setAttribute("result", result);
            jump("/WEB-INF/jsp/result2.jsp", request, response);
        } else {

            Locale userLocale = request.getLocale();

            ResourceBundle bundle = ResourceBundle.getBundle("com.localization.messages.msg", userLocale);

            String failureMessage = bundle.getString("error.dataNotExist");

            request.setAttribute("error", failureMessage);
            jump("/WEB-INF/jsp/error.jsp", request, response);
        }
    }
}
