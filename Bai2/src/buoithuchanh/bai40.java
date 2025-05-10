package buoithuchanh;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bai40 extends JFrame {
    private int count = 0;  
    private JLabel countLabel;

    public bai40() {
        setTitle("Click Counter");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        
        countLabel = new JLabel("Count: 0");

        
        JButton clickButton = new JButton("Click Me");

        clickButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                count++;  
                countLabel.setText("Count: " + count);  
            }
        });

        setLayout(new FlowLayout());
        add(countLabel);
        add(clickButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai40().setVisible(true);
        });
    }
}
