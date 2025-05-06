package chuong2;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class bai21 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai21 frame = new bai21();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public bai21() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 400);
		contentPane = new JPanel();
		contentPane.setLayout(new BorderLayout(5, 5));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		// Danh sách 10 thành phố
		String[] cities = {
			"Hà Nội", "Hồ Chí Minh", "Đà Nẵng", "Hải Phòng", "Cần Thơ",
			"Nha Trang", "Huế", "Biên Hòa", "Buôn Ma Thuột", "Vũng Tàu"
		};

		// Tạo JList và đưa vào JScrollPane
		JList<String> cityList = new JList<>(cities);
		JScrollPane scrollPane = new JScrollPane(cityList);
		contentPane.add(scrollPane, BorderLayout.CENTER);

		// Tạo JLabel hiển thị số lượng mục
		JLabel lblCount = new JLabel("Số lượng thành phố: " + cities.length);
		contentPane.add(lblCount, BorderLayout.SOUTH);
	}
}
