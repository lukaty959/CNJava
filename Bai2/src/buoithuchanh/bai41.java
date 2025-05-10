package buoithuchanh;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bai41 extends JFrame {

    public bai41() {
        setTitle("Dialog Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton openDialogButton = new JButton("Open Dialog");

     
        openDialogButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
     
                JDialog dialog = new JDialog(bai41.this, "Dialog", true);
                dialog.setSize(200, 150);
                dialog.setLocationRelativeTo(bai41.this);

                JLabel label = new JLabel("Dialog Opened", SwingConstants.CENTER);
                dialog.add(label);

                dialog.setVisible(true);
            }
        });

        setLayout(new FlowLayout());
        add(openDialogButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai41().setVisible(true);
        });
    }
}
