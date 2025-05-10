package chuong2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bai9 extends JFrame {
    public bai9() {
        setTitle("Main Window");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton btnOpenDialog = new JButton("Open Dialog");
        btnOpenDialog.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = new JDialog(bai9.this, "Dialog", true);
                dialog.setSize(200, 150);
                dialog.setLocationRelativeTo(bai9.this);

                JLabel label = new JLabel("This is a dialog", SwingConstants.CENTER);
                dialog.add(label);

                dialog.setVisible(true);
            }
        });

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(btnOpenDialog, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai9().setVisible(true);
        });
    }
}
