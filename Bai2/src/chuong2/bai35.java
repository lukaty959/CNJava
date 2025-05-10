package chuong2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bai35 extends JFrame {
    public bai35() {
        setTitle("BorderLayout Example");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel centerPanel = new JPanel(new GridLayout(3, 3));

        for (int i = 1; i <= 9; i++) {
            centerPanel.add(new JButton("Button " + i));
        }

        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
                Component[] components = centerPanel.getComponents();
                for (Component component : components) {
                    if (component instanceof JButton) {
                        ((JButton) component).setText("Reset");
                    }
                }
            }
        });

        setLayout(new BorderLayout());

        add(centerPanel, BorderLayout.CENTER);
        add(resetButton, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai35().setVisible(true);
        });
    }
}
