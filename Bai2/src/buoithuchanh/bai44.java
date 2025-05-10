package buoithuchanh;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class bai44 extends JFrame {

    private JLabel label;
    private JSlider slider;

    public bai44() {
        setTitle("Font Size Adjuster");
        setSize(400, 200);
        setLocationRelativeTo(null); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        label = new JLabel("Sample Text");
        label.setFont(new Font("Arial", Font.PLAIN, 20)); 

        
        slider = new JSlider(10, 50);
        slider.setValue(20); 
        slider.setMajorTickSpacing(10); 
        slider.setMinorTickSpacing(1); 
        slider.setPaintTicks(true); 
        slider.setPaintLabels(true); 

        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
              
                int fontSize = slider.getValue();
                label.setFont(new Font("Arial", Font.PLAIN, fontSize));
            }
        });

        setLayout(new FlowLayout());
        add(slider);
        add(label);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai44().setVisible(true);
        });
    }
}
