package chuong2;

import javax.swing.*;
import java.awt.*;

public class bai8 extends JFrame {
    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            bai8 frame = new bai8();
            frame.setVisible(true);
        });
    }

    public bai8() {
        setTitle("Colored Background");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 

        
        JPanel contentPane = new JPanel();
        contentPane.setBackground(Color.GREEN); 
        contentPane.setLayout(new BorderLayout());
        setContentPane(contentPane);

        
        JLabel label = new JLabel("Colored Background", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 20));
        contentPane.add(label, BorderLayout.CENTER);
    }
}
