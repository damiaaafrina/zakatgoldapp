package com.zakatapp;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class ZakatTracking extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        double weight = (double) session.getAttribute("weight");
        double price = (double) session.getAttribute("price");
        double zakat = (double) session.getAttribute("zakat");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Session Tracking</title></head><body style='background-color:#e8f5e9;color:#2e7d32;'>");
        out.println("<h2>Session Details</h2>");
        out.println("<p>Gold Weight: " + weight + "g</p>");
        out.println("<p>Price per Gram: RM" + price + "</p>");
        out.println("<p>Zakat Amount: RM" + zakat + "</p>");
        out.println("</body></html>");
    }
}
