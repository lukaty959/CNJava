package chuong2;

import javax.swing.*;
import java.awt.*;

public class bai31 extends JFrame {
    public bai31() {
        setTitle("JSplitPane Example");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        String[] listData = {"Item 1", "Item 2", "Item 3", "Item 4", "Item 5"};
        JList<String> list = new JList<>(listData);

        JTextArea textArea = new JTextArea();
        textArea.setText("VIprrooeee.");

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new JScrollPane(list), new JScrollPane(textArea));

        splitPane.setDividerLocation(200);

        add(splitPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai31().setVisible(true);
        });
    }
}
