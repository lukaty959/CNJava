package buoithuchanh;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class bai43 extends JFrame {

    public bai43() {
        setTitle("Close Confirmation");
        setSize(400, 300);
        setLocationRelativeTo(null); 
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
             
                int response = JOptionPane.showConfirmDialog(bai43.this, "Are you sure?", "Confirm Close", JOptionPane.YES_NO_OPTION);

                if (response == JOptionPane.YES_OPTION) {
                    System.exit(0);  
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai43().setVisible(true);
        });
    }
}
