package buoithuchanh;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.*;

public class bai58 extends JFrame {
    private JLabel label1, label2, label3;
    private ExecutorService executorService;

    public bai58() {
        setTitle("ExecutorService Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

     
        label1 = new JLabel("Sum 1-100: ");
        label2 = new JLabel("Sum 1-200: ");
        label3 = new JLabel("Sum 1-300: ");

        add(label1);
        add(label2);
        add(label3);

        executorService = Executors.newFixedThreadPool(3);
        
        executorService.submit(() -> {
            int sum1 = calculateSum(1, 100);
            SwingUtilities.invokeLater(() -> label1.setText("Sum 1-100: " + sum1));
        });
        
        executorService.submit(() -> {
            int sum2 = calculateSum(1, 200);
            SwingUtilities.invokeLater(() -> label2.setText("Sum 1-200: " + sum2));
        });
        
        executorService.submit(() -> {
            int sum3 = calculateSum(1, 300);
            SwingUtilities.invokeLater(() -> label3.setText("Sum 1-300: " + sum3));
        });
    }

    private int calculateSum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai58().setVisible(true);
        });
    }

    @Override
    public void dispose() {
        super.dispose();
        
        if (executorService != null && !executorService.isShutdown()) {
            executorService.shutdown();
        }
    }
}
