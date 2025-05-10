package chuong2;

import javax.swing.*;
import java.awt.*;

public class bai7 extends JFrame {
    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            bai7 frame = new bai7();
            frame.setVisible(true);
        });
    }

    public bai7() {
        setTitle("Resizable Window");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        
        setMinimumSize(new Dimension(200, 150));
        setMaximumSize(new Dimension(800, 600));

       
        JLabel label = new JLabel("Resizable Window", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 18));
        getContentPane().add(label, BorderLayout.CENTER);
    }
}
