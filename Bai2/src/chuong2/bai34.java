package chuong2;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class bai34 extends JFrame {
    public bai34() {
        setTitle("JSpinner Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JSpinner spinner = new JSpinner(new SpinnerNumberModel(1, 1, 100, 1));

        JLabel valueLabel = new JLabel("Current Value: " + spinner.getValue());

        spinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                valueLabel.setText("Current Value: " + spinner.getValue());
            }
        });

        setLayout(new FlowLayout());
        add(spinner);
        add(valueLabel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai34().setVisible(true);
        });
    }
}
