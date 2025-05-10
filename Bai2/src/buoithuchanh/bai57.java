package buoithuchanh;

import javax.swing.*;
import java.awt.*;

public class bai57 extends JFrame {
    private JLabel statusLabel;
    private JButton startButton;
    private JButton stopButton;
    private Thread runningThread;

    public bai57() {
        setTitle("Thread Control");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

       
        statusLabel = new JLabel("Status: Idle");
        startButton = new JButton("Start");
        stopButton = new JButton("Stop");

        startButton.addActionListener(e -> startThread());

      
        stopButton.addActionListener(e -> stopThread());

        add(statusLabel);
        add(startButton);
        add(stopButton);
    }

    private void startThread() {
        // Nếu thread đang chạy thì không làm gì
        if (runningThread != null && runningThread.isAlive()) {
            return;
        }

        // Tạo và bắt đầu thread
        runningThread = new Thread(() -> {
            try {
                while (true) {
                  
                    SwingUtilities.invokeLater(() -> statusLabel.setText("Status: Running"));
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
               
                SwingUtilities.invokeLater(() -> statusLabel.setText("Status: Idle"));
            }
        });

        runningThread.start();
    }

    private void stopThread() {
        if (runningThread != null) {
            runningThread.interrupt();
            SwingUtilities.invokeLater(() -> statusLabel.setText("Status: Idle"));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai57().setVisible(true);
        });
    }
}
