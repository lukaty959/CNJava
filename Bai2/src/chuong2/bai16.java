package chuong2;

import javax.swing.*;
import java.awt.*;

public class bai16 extends JFrame {
    public bai16() {
        setTitle("BorderLayout Example");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        JLabel northLabel = new JLabel("North", SwingConstants.CENTER);
        JLabel southLabel = new JLabel("South", SwingConstants.CENTER);
        JLabel eastLabel = new JLabel("East", SwingConstants.CENTER);
        JLabel westLabel = new JLabel("West", SwingConstants.CENTER);
        JLabel centerLabel = new JLabel("Center", SwingConstants.CENTER);

        northLabel.setBackground(Color.RED);
        northLabel.setOpaque(true);
        southLabel.setBackground(Color.GREEN);
        southLabel.setOpaque(true);
        eastLabel.setBackground(Color.BLUE);
        eastLabel.setOpaque(true);
        westLabel.setBackground(Color.YELLOW);
        westLabel.setOpaque(true);
        centerLabel.setBackground(Color.CYAN);
        centerLabel.setOpaque(true);

        add(northLabel, BorderLayout.NORTH);
        add(southLabel, BorderLayout.SOUTH);
        add(eastLabel, BorderLayout.EAST);
        add(westLabel, BorderLayout.WEST);
        add(centerLabel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai16().setVisible(true);
        });
    }
}
