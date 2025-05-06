package chuong2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class bai22 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai22 frame = new bai22();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public bai22() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(5, 5));
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);

		// Tạo mảng loại trái cây
		String[] fruits = {"Táo", "Cam", "Chuối", "Xoài", "Dưa hấu"};

		// Tạo JComboBox
		JComboBox<String> comboBox = new JComboBox<>(fruits);
		contentPane.add(comboBox, BorderLayout.NORTH);

		// Tạo JLabel để hiển thị lựa chọn
		JLabel lblSelection = new JLabel("Bạn chưa chọn loại trái cây nào.");
		contentPane.add(lblSelection, BorderLayout.CENTER);

		// Bắt sự kiện chọn trái cây
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedFruit = (String) comboBox.getSelectedItem();
				lblSelection.setText("Bạn đã chọn: " + selectedFruit);
			}
		});
	}
}
