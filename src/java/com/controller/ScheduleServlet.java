//package com.controller;
//
//import com.model.Schedule;
//import com.model.ScheduleList;
//import java.io.IOException;
//import java.util.ArrayList;
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebServlet(name = "ScheduleServlet", urlPatterns = {"/scheduleServlet"})
//public class ScheduleServlet extends HttpServlet {
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        try {
//            Schedule[] schedules = ScheduleList.getSchedules();
//            ArrayList<Schedule> result = new ArrayList<>();
//            String routeNumber = request.getParameter("routeNumber");
//            for (Schedule schedule : schedules) {
//                if (schedule.getRouteNumber().equals(routeNumber)) {
//                    result.add(schedule);
//                    System.out.println(schedule);
//                }
//            }
//            request.setAttribute("result", result);
//            RequestDispatcher rd = getServletContext()
//                    .getRequestDispatcher("/WEB-INF/jsp/result2.jsp");
//            rd.forward(request, response);
//        } catch (IOException | ServletException e) {
//            request.setAttribute("error", "Ошибка ввода данных");
//            RequestDispatcher rd = getServletContext()
//                    .getRequestDispatcher("/WEB-INF/jsp/error.jsp");
//            rd.forward(request, response);
//        }
//    }
//}
