package buoithuchanh;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class bai39 extends JFrame {
    private JLabel label;
    private JTextField textField;

    public bai39() {
        setTitle("KeyListener Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        label = new JLabel("You typed: ");

        textField = new JTextField(20);

        textField.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
              
                char keyChar = e.getKeyChar();
                label.setText("You typed: " + keyChar);
            }
        });
        setLayout(new FlowLayout());
        add(label);
        add(textField);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai39().setVisible(true);
        });
    }
}
