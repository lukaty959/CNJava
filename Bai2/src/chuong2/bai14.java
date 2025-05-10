package chuong2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bai14 extends JFrame {
    private JLabel label;

    public bai14() {
        setTitle("Show Message");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Tạo JLabel để hiển thị phản hồi
        label = new JLabel("Response will be shown here", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.PLAIN, 14));

        // Tạo JButton
        JButton btnShowMessage = new JButton("Show Message");
        btnShowMessage.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Hiển thị JOptionPane với 3 tùy chọn Yes/No/Cancel
                int response = JOptionPane.showConfirmDialog(bai14.this,
                        "Do you want to proceed?", "Confirm", JOptionPane.YES_NO_CANCEL_OPTION);

                // Xử lý phản hồi và cập nhật JLabel
                switch (response) {
                    case JOptionPane.YES_OPTION:
                        label.setText("You selected Yes");
                        break;
                    case JOptionPane.NO_OPTION:
                        label.setText("You selected No");
                        break;
                    case JOptionPane.CANCEL_OPTION:
                        label.setText("You selected Cancel");
                        break;
                    default:
                        label.setText("No selection made");
                        break;
                }
            }
        });

        // Thiết lập layout
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(label, BorderLayout.CENTER);
        getContentPane().add(btnShowMessage, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai14().setVisible(true);
        });
    }
}
