package com.controller;

import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.model.Bus;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.servlet.annotation.WebServlet;

@WebServlet(name = "MileageServlet", urlPatterns = {"/mileageServlet"})
public class MileageServlet extends InitServlet implements Jumpable {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int mlg = Integer.parseInt(request.getParameter("mlg"));

        List<Bus> result = busService.mileage(mlg);

        if (!result.isEmpty()) {
            request.setAttribute("result", result);
            jump("/WEB-INF/jsp/result.jsp", request, response);
        } else {

            Locale userLocale = request.getLocale();

            ResourceBundle bundle = ResourceBundle.getBundle("com.localization.messages.msg", userLocale);

            String failureMessage = bundle.getString("error.dataNotExist");

            request.setAttribute("error", failureMessage);
            jump("/WEB-INF/jsp/error.jsp", request, response);
        }
    }
}
