package chuong2;

import javax.swing.*;
import java.awt.*;

public class bai33 extends JFrame {
    public bai33() {
        setTitle("GridBagLayout Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
 
        gbc.insets = new Insets(10, 10, 10, 10); 

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(15);
        JLabel ageLabel = new JLabel("Age:");
        JSpinner ageSpinner = new JSpinner(new SpinnerNumberModel(18, 1, 100, 1)); // Số tuổi từ 1 đến 100
        JButton submitButton = new JButton("Submit");

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(nameLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        add(nameField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(ageLabel, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(ageSpinner, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 2; 
        gbc.anchor = GridBagConstraints.CENTER;
        add(submitButton, gbc);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai33().setVisible(true);
        });
    }
}
