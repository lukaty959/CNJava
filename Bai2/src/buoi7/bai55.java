package buoi7;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

public class bai55 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private Timer timer;
    private Random random;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    bai55 frame = new bai55();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public bai55() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 400); // Kích thước 400x400
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null); // Sử dụng layout tự do

        setContentPane(contentPane);

        random = new Random();

        // Tạo Timer để đổi màu nền mỗi 1 giây
        timer = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Color randomColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
                contentPane.setBackground(randomColor);
            }
        });
        timer.start(); // Bắt đầu Timer ngay khi chạy chương trình

        // Tạo nút "Stop"
        JButton btnStop = new JButton("Stop");
        btnStop.setBounds(150, 170, 100, 30); // Vị trí và kích thước nút
        contentPane.add(btnStop);

        // Bắt sự kiện khi nhấn nút "Stop"
        btnStop.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                timer.stop(); // Dừng Timer
            }
        });
    }
}
