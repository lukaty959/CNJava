package chuong2;

import java.awt.EventQueue;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.BorderLayout;

public class bai26 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel colorPanel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai26 frame = new bai26();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public bai26() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 200);
		contentPane = new JPanel(new BorderLayout());
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		// Panel đổi màu
		colorPanel = new JPanel();
		contentPane.add(colorPanel, BorderLayout.CENTER);

		// Tạo JSlider từ 0 đến 255
		JSlider slider = new JSlider(0, 255, 128);
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(10);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		contentPane.add(slider, BorderLayout.SOUTH);

		// Lắng nghe sự thay đổi và cập nhật màu nền
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int value = slider.getValue();
				Color newColor = new Color(value, value, value); // Màu xám theo giá trị RGB
				colorPanel.setBackground(newColor);
			}
		});

		// Thiết lập màu nền ban đầu
		colorPanel.setBackground(new Color(128, 128, 128));
	}
}
