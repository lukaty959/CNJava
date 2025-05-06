package buoi7;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;

public class tesstttt extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                tesstttt frame = new tesstttt();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public tesstttt() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 200);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setContentPane(contentPane);

        String[] colors = {"Red", "Blue", "Green", "Yellow", "Orange"};
        JComboBox<String> colorComboBox = new JComboBox<>(colors);
        colorComboBox.setBounds(90, 60, 120, 25);
        contentPane.add(colorComboBox);

        // Dùng lambda expression cho ActionListener
        colorComboBox.addActionListener(e -> {
            String selectedColor = (String) colorComboBox.getSelectedItem();

            switch (selectedColor) {
                case "Red":
                    JOptionPane.showMessageDialog(null, "You selected Red");
                    contentPane.setBackground(Color.RED);
                    break;
                case "Blue":
                    JOptionPane.showMessageDialog(null, "You selected Blue");
                    contentPane.setBackground(Color.BLUE);
                    break;
                case "Green":
                    JOptionPane.showMessageDialog(null, "You selected Green");
                    contentPane.setBackground(Color.GREEN);
                    break;
                case "Yellow":
                    JOptionPane.showMessageDialog(null, "You selected Yellow");
                    contentPane.setBackground(Color.YELLOW);
                    break;
                case "Orange":
                    JOptionPane.showMessageDialog(null, "You selected Orange");
                    contentPane.setBackground(Color.ORANGE);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Unknown color");
                    contentPane.setBackground(null);
                    break;
            }
        });
    }
}
