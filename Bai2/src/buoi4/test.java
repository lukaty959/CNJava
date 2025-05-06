package buoi4;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.CardLayout;

public class test extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test frame = new test();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public test() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPanel cardpanel = new JPanel();
		cardpanel.setLayout(new CardLayout());

		JButton btnSwitch = new JButton("Switch");
		btnSwitch.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSwitch.addActionListener(e -> {
			// Không tạo biến CardLayout, dùng getLayout() rồi ép kiểu
			((CardLayout) cardpanel.getLayout()).next(cardpanel);
		});

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.CENTER)
				.addComponent(cardpanel, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
				.addComponent(btnSwitch, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createSequentialGroup()
				.addGap(30)
				.addComponent(cardpanel, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
				.addGap(20)
				.addComponent(btnSwitch)
		);

		// Card 1
		JPanel card1 = new JPanel();
		card1.add(new JLabel("Page 1"));
		cardpanel.add(card1, "card1");

		// Card 2
		JPanel card2 = new JPanel();
		card2.add(new JButton("Click"));
		cardpanel.add(card2, "card2");

		contentPane.setLayout(gl_contentPane);
	}
}
