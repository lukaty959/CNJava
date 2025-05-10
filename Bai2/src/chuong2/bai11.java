package chuong2;

import javax.swing.*;
import java.awt.*;

public class bai11 extends JFrame {
    public bai11() {
        setTitle("System Info");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        String osName = System.getProperty("os.name");
        String javaVersion = System.getProperty("java.version");

        JLabel osLabel = new JLabel("OS: " + osName);
        osLabel.setFont(new Font("Arial", Font.PLAIN, 14));

        JLabel javaLabel = new JLabel("Java Version: " + javaVersion);
        javaLabel.setFont(new Font("Arial", Font.PLAIN, 14));

  
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));
        panel.add(osLabel);
        panel.add(javaLabel);

        getContentPane().add(panel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai11().setVisible(true);
        });
    }
}
