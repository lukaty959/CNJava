package buoithuchanh;

import javax.swing.*;
import java.awt.*;

public class bai54 extends JFrame {
    private JProgressBar progressBar;
    private JButton loadButton;
    private JLabel statusLabel;

    public bai54() {
        setTitle("Data Loader");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true);

        loadButton = new JButton("Load");

        statusLabel = new JLabel("Status: Waiting...", SwingConstants.CENTER);

        loadButton.addActionListener(e -> {
            loadButton.setEnabled(false);
            statusLabel.setText("Status: Loading...");
            new DataLoader().execute();
        });

        add(progressBar, BorderLayout.NORTH);
        add(loadButton, BorderLayout.CENTER);
        add(statusLabel, BorderLayout.SOUTH);
    }

    private class DataLoader extends SwingWorker<Void, Integer> {
        @Override
        protected Void doInBackground() throws Exception {
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(50); // mô phỏng xử lý
                publish(i);
                setProgress(i);
            }
            return null;
        }

        @Override
        protected void process(java.util.List<Integer> chunks) {
            int value = chunks.get(chunks.size() - 1);
            progressBar.setValue(value);
        }

        @Override
        protected void done() {
            statusLabel.setText("Status: Done");
            loadButton.setEnabled(true);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai54().setVisible(true);
        });
    }
}
