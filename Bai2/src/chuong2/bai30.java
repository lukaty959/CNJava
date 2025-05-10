package chuong2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bai30 extends JFrame {
    public bai30() {
        setTitle("JToolBar Example");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JToolBar toolBar = new JToolBar();

        JButton newButton = new JButton("New");
        JButton saveButton = new JButton("Save");
        JButton openButton = new JButton("Open");

        newButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(bai30.this, "New button clicked", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(bai30.this, "Save button clicked", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        openButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(bai30.this, "Open button clicked", "Info", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        toolBar.add(newButton);
        toolBar.add(saveButton);
        toolBar.add(openButton);

        add(toolBar, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai30().setVisible(true);
        });
    }
}
