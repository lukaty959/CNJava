package buoithuchanh;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class bai45 extends JFrame {

    private JCheckBox checkBox;
    private JLabel imageLabel;

    public bai45() {
        setTitle("Show/Hide Image");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 

        checkBox = new JCheckBox("Show Image");

        
        ImageIcon icon = new ImageIcon("C:\\Users\\ADMIN\\Pictures\\cafe.jpg");
        imageLabel = new JLabel(icon);
        imageLabel.setVisible(false); 

        
        checkBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                imageLabel.setVisible(checkBox.isSelected());
            }
        });

        // Layout
        setLayout(new BorderLayout());
        add(checkBox, BorderLayout.NORTH);
        add(imageLabel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai45().setVisible(true);
        });
    }
}
