package chuong2;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class bai5 extends JFrame {
    private static final long serialVersionUID = 1L;
    private JLabel clockLabel;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            bai5 frame = new bai5();
            frame.setVisible(true);
        });
    }

    public bai5() {
        setTitle("Digital Clock");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // căn giữa màn hình

        // Tạo JLabel và căn giữa
        clockLabel = new JLabel();
        clockLabel.setHorizontalAlignment(SwingConstants.CENTER);
        clockLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(clockLabel, BorderLayout.CENTER);

        // Cập nhật thời gian mỗi giây
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                SwingUtilities.invokeLater(() -> updateClock());
            }
        }, 0, 1000); // cập nhật mỗi 1000ms = 1 giây
    }

    private void updateClock() {
        LocalDateTime now = LocalDateTime.now();
        String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        clockLabel.setText(time);
    }
}
