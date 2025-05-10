package buoithuchanh;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bai42 extends JFrame {

    public bai42() {
        setTitle("Color Picker");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        String[] colors = {"Red", "Blue", "Green", "Yellow", "Black"};
        JComboBox<String> colorComboBox = new JComboBox<>(colors);

        colorComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
           
                String selectedColor = (String) colorComboBox.getSelectedItem();

                Color color = Color.BLACK;
                switch (selectedColor) {
                    case "Red":
                        color = Color.RED;
                        break;
                    case "Blue":
                        color = Color.BLUE;
                        break;
                    case "Green":
                        color = Color.GREEN;
                        break;
                    case "Yellow":
                        color = Color.YELLOW;
                        break;
                    case "Black":
                        color = Color.BLACK;
                        break;
                }

                JOptionPane.showMessageDialog(bai42.this, "You selected: " + selectedColor, "Color Selected", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        setLayout(new FlowLayout());
        add(colorComboBox);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai42().setVisible(true);
        });
    }
}
