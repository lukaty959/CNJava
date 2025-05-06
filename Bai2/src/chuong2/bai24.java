package chuong2;

import java.awt.EventQueue;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.Checkbox;

public class bai24 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Color defaultColor;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai24 frame = new bai24();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public bai24() {
		setTitle("Checkbox Background Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// Lưu màu nền mặc định
		defaultColor = contentPane.getBackground();

		// Tạo checkbox
		JCheckBox chckbxEnableBackground = new JCheckBox("Enable Background");
		chckbxEnableBackground.setBounds(80, 70, 150, 25);
		contentPane.add(chckbxEnableBackground);

		// Xử lý sự kiện khi chọn checkbox
		chckbxEnableBackground.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					contentPane.setBackground(Color.GREEN);
				} else {
					contentPane.setBackground(defaultColor);
				}
			}
		});
	}
}
