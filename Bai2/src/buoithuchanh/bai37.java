package buoithuchanh;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class bai37 extends JFrame {
    private JLabel label;

    public bai37() {
        setTitle("Mouse Listener Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

      
        label = new JLabel("Mouse at: (0, 0)");

        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                label.setText("Mouse at: (" + x + ", " + y + ")");
            }
        });

        setLayout(new FlowLayout());
        add(label);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai37().setVisible(true);
        });
    }
}
