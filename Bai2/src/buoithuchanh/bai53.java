package buoithuchanh;

import javax.swing.*;
import java.awt.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class bai53 extends JFrame {
    private JLabel timeLabel;
    private DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    public bai53() {
        setTitle("Digital Clock");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Arial", Font.BOLD, 30));
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(timeLabel);

        Thread clockThread = new Thread(() -> {
            while (true) {
                String currentTime = LocalTime.now().format(timeFormatter);
                SwingUtilities.invokeLater(() -> timeLabel.setText(currentTime));

                try {
                    Thread.sleep(1000); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        clockThread.setDaemon(true);
        clockThread.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai53().setVisible(true);
        });
    }
}
