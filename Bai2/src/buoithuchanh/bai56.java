package buoithuchanh;

import javax.swing.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class bai56 extends JFrame {
    private JLabel timeLabel;
    private JButton startButton;

    public bai56() {
        setTitle("Countdown Timer");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        timeLabel = new JLabel("Time: 10");
        startButton = new JButton("Start");

        startButton.addActionListener(e -> {
           
            CountdownWorker worker = new CountdownWorker();
            worker.execute();
        });

        add(timeLabel);
        add(startButton);
    }

    private class CountdownWorker extends SwingWorker<Void, Integer> {
        @Override
        protected Void doInBackground() throws Exception {
            for (int i = 10; i >= 0; i--) {
                Thread.sleep(1000); 
                publish(i); 
            }
            return null;
        }

        @Override
        protected void process(java.util.List<Integer> chunks) {
            
            int count = chunks.get(chunks.size() - 1);
            timeLabel.setText("Time: " + count);
        }

        @Override
        protected void done() {
           
            timeLabel.setText("Finished");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai56().setVisible(true);
        });
    }
}
