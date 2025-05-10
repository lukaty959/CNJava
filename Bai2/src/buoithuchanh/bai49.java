package buoithuchanh;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class bai49 extends JFrame {
    private JLabel label;
    private JRadioButton redButton, blueButton, greenButton;

    public bai49() {
        setTitle("RadioButton Color");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        label = new JLabel("Sample");
        label.setFont(new Font("Arial", Font.BOLD, 24));
        add(label);

        redButton = new JRadioButton("Red");
        blueButton = new JRadioButton("Blue");
        greenButton = new JRadioButton("Green");

        ButtonGroup group = new ButtonGroup();
        group.add(redButton);
        group.add(blueButton);
        group.add(greenButton);

        add(redButton);
        add(blueButton);
        add(greenButton);

        ItemListener colorChangeListener = new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (redButton.isSelected()) {
                    label.setForeground(Color.RED);
                } else if (blueButton.isSelected()) {
                    label.setForeground(Color.BLUE);
                } else if (greenButton.isSelected()) {
                    label.setForeground(Color.GREEN);
                }
            }
        };

        redButton.addItemListener(colorChangeListener);
        blueButton.addItemListener(colorChangeListener);
        greenButton.addItemListener(colorChangeListener);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai49().setVisible(true);
        });
    }
}
