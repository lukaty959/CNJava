package buoithuchanh;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

public class bai62 extends JFrame {
    private JTable table;
    private DefaultTableModel tableModel;
    private int idCounter = 1; 

    public bai62() {
        setTitle("JTable Example");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        String[] columns = {"ID", "Name", "Time"};
        
        tableModel = new DefaultTableModel(columns, 0);
        
        table = new JTable(tableModel);
        
        JScrollPane scrollPane = new JScrollPane(table);
        
        add(scrollPane, BorderLayout.CENTER);
        
        Thread dataThread = new Thread(() -> {
            while (true) {
                try {
                    addRecord();
                    
                  
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        
        dataThread.start(); 
    }

   
    private void addRecord() {
       
        String currentTime = new SimpleDateFormat("HH:mm:ss").format(new Date());

        
        Vector<String> row = new Vector<>();
        row.add(String.valueOf(idCounter++)); 
        row.add("Name " + idCounter); 
        row.add(currentTime); 

        
        tableModel.addRow(row);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai62().setVisible(true);
        });
    }
}
