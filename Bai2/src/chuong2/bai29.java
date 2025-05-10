package chuong2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bai29 extends JFrame {
    private CardLayout cardLayout;
    private JPanel cardPanel;

    public bai29() {
        setTitle("CardLayout Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        JPanel card1 = new JPanel();
        card1.add(new JLabel("Page 1"));

        JPanel card2 = new JPanel();
        JButton button = new JButton("Click");
        card2.add(button);

        cardPanel.add(card1, "Card 1");
        cardPanel.add(card2, "Card 2");

        JButton switchButton = new JButton("Switch");
        switchButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.next(cardPanel); 
            }
        });

        setLayout(new BorderLayout());
        add(cardPanel, BorderLayout.CENTER);
        add(switchButton, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai29().setVisible(true);
        });
    }
}
