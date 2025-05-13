package com.example.language;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class ContextListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Ứng dụng đã khởi động.");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Ứng dụng đã dừng.");
    }
}
