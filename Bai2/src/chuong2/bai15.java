package chuong2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class bai15 extends JFrame {
    public bai15() {
        setTitle("No Close Button");
        setSize(400, 300);
        setLocationRelativeTo(null);

        
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

       
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                
                int response = JOptionPane.showConfirmDialog(bai15.this, "Are you sure you want to exit?", "Exit Confirmation", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    System.exit(0); 
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai15().setVisible(true);
        });
    }
}
