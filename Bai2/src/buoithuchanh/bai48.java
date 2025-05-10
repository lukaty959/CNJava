package buoithuchanh;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import java.awt.*;

public class bai48 extends JFrame {
    private JTextField textField;
    private JLabel label;

    public bai48() {
        setTitle("Only Numbers");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        textField = new JTextField(15);
        label = new JLabel("Number: ");

        add(textField);
        add(label);

        textField.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                handleInput(e);
            }

            public void removeUpdate(DocumentEvent e) {
                handleInput(e);
            }

            public void changedUpdate(DocumentEvent e) {
                handleInput(e);
            }

            private void handleInput(DocumentEvent e) {
                try {
                    String text = e.getDocument().getText(0, e.getDocument().getLength());

                    // Kiểm tra chỉ chứa số
                    if (text.matches("\\d*")) {
                        label.setText("Number: " + text);
                    } else {
                       
                        SwingUtilities.invokeLater(() -> {
                            try {
                                textField.setText(text.replaceAll("[^\\d]", ""));
                            } catch (Exception ex) {
                                ex.printStackTrace();
                            }
                        });
                    }
                } catch (BadLocationException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai48().setVisible(true);
        });
    }
}
