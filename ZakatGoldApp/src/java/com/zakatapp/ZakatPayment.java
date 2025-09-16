package com.zakatapp;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class ZakatPayment extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double weight = Double.parseDouble(request.getParameter("weight"));
        String type = request.getParameter("type");
        double price = Double.parseDouble(request.getParameter("price"));

        GoldDetails gold = new GoldDetails(weight, type, price);

        double totalValue = weight * price;
        double threshold = type.equals("keep") ? 85 : 200;
        double zakatPayableWeight = weight > threshold ? (weight - threshold) : 0;
        double zakatPayableValue = zakatPayableWeight * price;
        double zakatAmount = 0.025 * zakatPayableValue;

        HttpSession session = request.getSession();
        session.setAttribute("weight", weight);
        session.setAttribute("price", price);
        session.setAttribute("zakat", zakatAmount);
        session.setAttribute("goldDetails", gold);
        session.setAttribute("totalValue", totalValue);
        session.setAttribute("zakatValue", zakatPayableValue);

        response.sendRedirect("result.jsp");
    }
}
