package chuong2;

import javax.swing.*;
import java.awt.*;

public class bai17 extends JFrame {
    public bai17() {
        setTitle("Login Form");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 20));

        JLabel usernameLabel = new JLabel("Username");
        JTextField usernameField = new JTextField(20);

        JLabel passwordLabel = new JLabel("Password");
        JPasswordField passwordField = new JPasswordField(20);

        JButton loginButton = new JButton("Login");

        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai17().setVisible(true);
        });
    }
}
