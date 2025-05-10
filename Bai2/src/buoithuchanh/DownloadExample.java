package buoithuchanh;
// bai 60

import javax.swing.*;
import java.awt.*;

public class DownloadExample extends JFrame {
    private JProgressBar progressBar;
    private JButton downloadButton;
    private JLabel statusLabel;

    public DownloadExample() {
        setTitle("Download Example");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true); // Hiển thị giá trị trên progress bar
        downloadButton = new JButton("Download");
        statusLabel = new JLabel("Status: Waiting for download");

        // Thiết lập layout
        setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(progressBar);
        panel.add(statusLabel);
        add(panel, BorderLayout.CENTER);
        add(downloadButton, BorderLayout.SOUTH);

        // Thêm ActionListener cho JButton "Download"
        downloadButton.addActionListener(e -> startDownload());
    }

    private void startDownload() {
        // Khởi tạo và bắt đầu SwingWorker để xử lý tiến trình tải
        SwingWorker<Void, Integer> downloadTask = new SwingWorker<>() {
            @Override
            protected Void doInBackground() throws Exception {
                // Tăng dần giá trị từ 0 đến 100 để mô phỏng quá trình tải
                for (int i = 0; i <= 100; i++) {
                    publish(i); // Cập nhật tiến trình
                    Thread.sleep(50); // Giả lập thời gian tải
                }
                return null;
            }

            @Override
            protected void process(java.util.List<Integer> chunks) {
                // Cập nhật JProgressBar khi có giá trị mới
                int value = chunks.get(chunks.size() - 1);
                progressBar.setValue(value);
            }

            @Override
            protected void done() {
                // Khi hoàn tất, hiển thị "Download Complete" trên JLabel
                statusLabel.setText("Status: Download Complete");
            }
        };

        // Bắt đầu tác vụ tải
        downloadTask.execute();
        statusLabel.setText("Status: Downloading...");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new DownloadExample().setVisible(true);
        });
    }
}
