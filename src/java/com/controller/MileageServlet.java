//package com.controller;
//
//import java.util.List;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import com.model.Bus;
//import com.model.BusList;
//import java.io.IOException;
//import java.util.ArrayList;
//import javax.servlet.RequestDispatcher;
//import javax.servlet.annotation.WebServlet;
//
//@WebServlet(name = "MileageServlet", urlPatterns = {"/mileageServlet"})
//public class MileageServlet extends HttpServlet {
//
//    private List<Bus> buses;
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        try {
//            Bus[] buses = BusList.getBuses();
//            ArrayList<Bus> result = new ArrayList<>();
//            int mlg = Integer.parseInt(request.getParameter("mlg"));
//            for (Bus bus : buses) {
//                if (bus.getMileage() >= mlg && mlg != 0) {
//                    result.add(bus);
//                } else if (2023 - bus.getMileage() == mlg && mlg == 0) {
//                    result.add(bus);
//                }
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
