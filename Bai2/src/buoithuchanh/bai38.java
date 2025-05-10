package buoithuchanh;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class bai38 extends JFrame {
    private JLabel colorLabel;

    public bai38() {
        setTitle("Double Click to Change Background Color");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        colorLabel = new JLabel("RGB Color: (255, 255, 255)");
        
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                  
                    int r = (int) (Math.random() * 256);
                    int g = (int) (Math.random() * 256);
                    int b = (int) (Math.random() * 256);
                   
                    getContentPane().setBackground(new Color(r, g, b));
                    
                   
                    colorLabel.setText("RGB Color: (" + r + ", " + g + ", " + b + ")");
                }
            }
        });

       
        setLayout(new BorderLayout());
        add(colorLabel, BorderLayout.SOUTH);  
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai38().setVisible(true);
        });
    }
}
