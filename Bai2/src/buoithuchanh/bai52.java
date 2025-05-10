package buoithuchanh;

import javax.swing.*;
import java.awt.*;

public class bai52 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Swing Thread Example");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLocationRelativeTo(null);

            JLabel label = new JLabel("Safe GUI", SwingConstants.CENTER);
            frame.add(label, BorderLayout.CENTER);

            frame.setVisible(true);
        });
    }
}
