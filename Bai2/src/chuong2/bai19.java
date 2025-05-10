package chuong2;

import javax.swing.*;
import java.awt.*;

public class bai19 extends JFrame {
    public bai19() {
        setTitle("BoxLayout Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

        // Tạo 2 JPanel con với BoxLayout ngang
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
        JPanel panel2 = new JPanel();
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));

        JLabel label1_1 = new JLabel("Label 1");
        JLabel label1_2 = new JLabel("Label 2");
        JButton button1 = new JButton("Button 1");
        panel1.add(label1_1);
        panel1.add(label1_2);
        panel1.add(button1);

        JLabel label2_1 = new JLabel("Label 3");
        JLabel label2_2 = new JLabel("Label 4");
        JButton button2 = new JButton("Button 2");
        panel2.add(label2_1);
        panel2.add(label2_2);
        panel2.add(button2);

        mainPanel.add(panel1);
        mainPanel.add(panel2);

        add(mainPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai19().setVisible(true);
        });
    }
}
