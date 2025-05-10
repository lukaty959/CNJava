package chuong2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bai13 extends JFrame {
    public bai13() {
        setTitle("Main Window");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton btnOpenChildWindow = new JButton("Open Child Window");
        btnOpenChildWindow.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JFrame childWindow = new JFrame("Child Window");
                childWindow.setSize(200, 200);
                childWindow.setLocationRelativeTo(bai13.this);

                JLabel label = new JLabel("Child Window", SwingConstants.CENTER);
                childWindow.add(label);

                childWindow.setVisible(true);
            }
        });

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(btnOpenChildWindow, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai13().setVisible(true);
        });
    }
}
