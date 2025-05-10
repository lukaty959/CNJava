package chuong2;

import javax.swing.*;
import java.awt.*;

public class bai18 extends JFrame {
    public bai18() {
        setTitle("Chess Board");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

       
        setLayout(new GridLayout(8, 8));

        for (int i = 0; i < 64; i++) {
            JPanel panel = new JPanel();

            if ((i + (i / 8)) % 2 == 0) {
                panel.setBackground(Color.WHITE);
            } else {
                panel.setBackground(Color.BLACK);
            }
            add(panel);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai18().setVisible(true);
        });
    }
}
