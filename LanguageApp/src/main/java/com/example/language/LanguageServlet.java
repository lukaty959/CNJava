package com.example.language;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class LanguageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String lang = request.getParameter("lang");
        String greeting = "Hello";

        if ("vi".equals(lang)) {
            greeting = "Xin chào";
        }

        HttpSession session = request.getSession();
        session.setAttribute("greeting", greeting);
        session.setAttribute("lang", lang);

        response.sendRedirect("greeting.jsp");
    }
}
