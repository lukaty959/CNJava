package com.example.language;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LanguageFilter implements Filter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {

        String lang = request.getParameter("lang");

        if ("en".equals(lang) || "vi".equals(lang)) {
            chain.doFilter(request, response); // Hợp lệ
        } else {
            ((HttpServletResponse) response).sendRedirect("languageForm.html");
        }
    }
}
