package chuong2;

import javax.swing.*;
import java.awt.*;

public class bai6 extends JFrame {
    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            bai6 frame = new bai6();
            frame.setVisible(true);
        });
    }

    public bai6() {
        setTitle("Custom Icon Window");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 

        
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\ADMIN\\Pictures\\logo.jpg"); 
        setIconImage(icon);

        
        JLabel label = new JLabel("Custom Icon Window", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 20));
        getContentPane().add(label, BorderLayout.CENTER);
    }
}
