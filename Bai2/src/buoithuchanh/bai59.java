package buoithuchanh;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class bai59 extends JFrame {
    private JList<String> numberList;
    private DefaultListModel<String> listModel;
    private JButton generateButton;
    private Thread numberGeneratorThread;

    public bai59() {
        setTitle("Random Number Generator");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        
        listModel = new DefaultListModel<>();

        numberList = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(numberList);

       
        generateButton = new JButton("Generate");

        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);
        add(generateButton, BorderLayout.SOUTH);

        generateButton.addActionListener(e -> startNumberGeneration());

    }

    private void startNumberGeneration() {
        
        if (numberGeneratorThread != null && numberGeneratorThread.isAlive()) {
            return;
        }

        numberGeneratorThread = new Thread(() -> {
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
               
                int randomNumber = random.nextInt(100) + 1;

                SwingUtilities.invokeLater(() -> listModel.addElement("Number: " + randomNumber));

                try {
                    
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Bắt đầu thread
        numberGeneratorThread.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai59().setVisible(true);
        });
    }
}
