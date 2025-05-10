package buoithuchanh;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class bai47 extends JFrame {
    private JLabel label;

    public bai47() {
        setTitle("Mouse Follower");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); 
        setLocationRelativeTo(null);

      
        label = new JLabel("Follow Me");
        label.setBounds(10, 10, 100, 30);
        add(label);

        
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                label.setLocation(e.getX(), e.getY());
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai47().setVisible(true);
        });
    }
}
