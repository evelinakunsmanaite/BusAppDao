//package com.controller;
//
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
//@WebServlet(name = "AllServlet", urlPatterns = {"/allServlet"})
//public class AllServlet extends HttpServlet {
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        Bus[] buses = BusList.getBuses();
//        ArrayList<Bus> result = new ArrayList<>();
//        for (Bus bus : buses) {
//            result.add(bus);
//            System.out.println(bus);
//        }
//        request.setAttribute("result", result);
//        RequestDispatcher rd = getServletContext()
//                .getRequestDispatcher("/WEB-INF/jsp/result.jsp");
//        rd.forward(request, response);
//    }
//}
