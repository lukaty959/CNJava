package chuong2;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.EventQueue;

public class bai4 extends JFrame {
    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    bai4 frame = new bai4();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public bai4() {
        setTitle("Image Viewer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\ADMIN\\Pictures\\cafe.jpg"); 

        JLabel imageLabel = new JLabel(imageIcon);
        add(imageLabel);

        // Căn giữa màn hình
        setLocationRelativeTo(null);

        // Tự động điều chỉnh kích thước JFrame theo ảnh
        pack();
    }
}
