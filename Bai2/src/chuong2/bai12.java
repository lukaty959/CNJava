package chuong2;

import javax.swing.*;
import java.awt.*;

public class bai12 extends JFrame {
    public bai12() {
        try {
            
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        setTitle("Custom Look and Feel");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Custom Look and Feel", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 20));
        getContentPane().add(label, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai12().setVisible(true);
        });
    }
}
