package chuong2;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class bai28 extends JFrame {
    public bai28() {
        setTitle("Student List");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

      
        String[] columns = {"Tên", "Tuổi", "Điểm"};
        Object[][] data = {
            {"Nguyễn A", 20, 8.5},
            {"Trần B", 21, 7.0},
            {"Lê C", 22, 9.0},
            {"Phạm D", 19, 6.5},
            {"Vũ E", 23, 8.0}
        };

      
        DefaultTableModel model = new DefaultTableModel(data, columns);
   
        JTable table = new JTable(model);

        JScrollPane scrollPane = new JScrollPane(table);

        add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai28().setVisible(true);
        });
    }
}
