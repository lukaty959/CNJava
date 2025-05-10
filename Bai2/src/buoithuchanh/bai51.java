package buoithuchanh;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bai51 extends JFrame {
    private JProgressBar progressBar;
    private JButton startButton;

    public bai51() {
        setTitle("Progress with SwingWorker");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        progressBar = new JProgressBar(0, 100);
        progressBar.setPreferredSize(new Dimension(250, 25));
        progressBar.setStringPainted(true);

        startButton = new JButton("Start");

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startButton.setEnabled(false); // disable nút khi bắt đầu
                SwingWorker<Void, Integer> worker = new SwingWorker<Void, Integer>() {
                    @Override
                    protected Void doInBackground() throws Exception {
                        for (int i = 0; i <= 100; i++) {
                            Thread.sleep(100); // 100ms * 100 = 10 giây
                            publish(i);
                        }
                        return null;
                    }

                    @Override
                    protected void process(java.util.List<Integer> chunks) {
                        int val = chunks.get(chunks.size() - 1);
                        progressBar.setValue(val);
                    }

                    @Override
                    protected void done() {
                        startButton.setEnabled(true); // enable lại sau khi xong
                    }
                };
                worker.execute();
            }
        });

        add(progressBar);
        add(startButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new bai51().setVisible(true);
        });
    }
}
