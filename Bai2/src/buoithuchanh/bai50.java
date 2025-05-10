package buoithuchanh;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class bai50 extends JFrame {
    private int clickCount = 0;
    private JLabel countLabel;
    private JLabel coordLabel;

    public bai50() {
        setTitle("Multi-Event Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JButton button = new JButton("Multi-Event");
        countLabel = new JLabel("Clicked: 0 times");
        coordLabel = new JLabel("Mouse at: (0, 0)");

        button.addActionListener(e -> {
            clickCount++;
            countLabel.setText("Clicked: " + clickCount + " times");
        });

        button.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                coordLabel.setText("Mouse at: (" + e.getX() + ", " + e.getY() + ")");
            }
        });

        add(button);
        add(countLabel);
        add(coordLabel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai50().setVisible(true);
        });
    }
}
