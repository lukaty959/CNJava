package buoithuchanh;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class bai46 extends JFrame {

    public bai46() {
        setTitle("JList Double Click Example");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        String[] items = {
            "Item 1", "Item 2", "Item 3", "Item 4", "Item 5",
            "Item 6", "Item 7", "Item 8", "Item 9", "Item 10"
        };
        JList<String> itemList = new JList<>(items);

      
        JScrollPane scrollPane = new JScrollPane(itemList);
        add(scrollPane);

    
        itemList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) { 
                    int index = itemList.locationToIndex(e.getPoint());
                    if (index >= 0) {
                        String selected = itemList.getModel().getElementAt(index);
                        JOptionPane.showMessageDialog(bai46.this, "You clicked: " + selected);
                    }
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai46().setVisible(true);
        });
    }
}
