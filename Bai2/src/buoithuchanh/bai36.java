package buoithuchanh;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bai36 extends JFrame {
    public bai36() {
        setTitle("Change Text Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton changeButton = new JButton("Change");

        JLabel label = new JLabel("Original Text");

        changeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Text Changed"); 
            }
        });

        setLayout(new FlowLayout());
        add(changeButton);
        add(label);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai36().setVisible(true);
        });
    }
}
