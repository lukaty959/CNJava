package chuong2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bai27 extends JFrame {
    private JProgressBar progressBar;
    private JButton startButton;

    public bai27() {
        setTitle("Progress Bar Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Tạo JProgressBar từ 0 đến 100
        progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true);

        startButton = new JButton("Start");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                Thread progressThread = new Thread(() -> {
                    for (int i = 0; i <= 100; i++) {
                        try {
                            Thread.sleep(50); 
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                        progressBar.setValue(i);
                    }
                });
                progressThread.start();
            }
        });

        setLayout(new FlowLayout());
        add(progressBar);
        add(startButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai27().setVisible(true);
        });
    }
}
