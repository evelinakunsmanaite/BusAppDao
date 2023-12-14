//package com.controller;
//
//import com.model.Bus;
//import com.model.BusList;
//import java.io.IOException;
//import java.util.ArrayList;
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebServlet(name = "RouteServlet", urlPatterns = {"/routeServlet"})
//public class RouteServlet extends HttpServlet {
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        try {
//            Bus[] buses = BusList.getBuses();
//            ArrayList<Bus> result = new ArrayList<>();
//            String routeNumber = request.getParameter("routeNumber");
//            for (Bus bus : buses) {
//                if (bus.getRouteNumber().equals(routeNumber)) {
//                    result.add(bus);
//                    System.out.println(bus);
//                }
//
//            }
//            request.setAttribute("result", result);
//            RequestDispatcher rd = getServletContext()
//                    .getRequestDispatcher("/WEB-INF/jsp/result.jsp");
//            rd.forward(request, response);
//        } catch (Exception e) {
//            request.setAttribute("error", "Ошибка ввода данных");
//            RequestDispatcher rd = getServletContext()
//                    .getRequestDispatcher("/WEB-INF/jsp/error.jsp");
//            rd.forward(request, response);
//        }
//    }
//}
