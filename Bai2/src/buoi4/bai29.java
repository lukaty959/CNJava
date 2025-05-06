package buoi4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import org.eclipse.wb.swing.FocusTraversalOnArray;

public class bai29 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private CardLayout cardLayout;
	private JPanel cardPanel;
	private boolean isFirstCard = true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai29 frame = new bai29();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public bai29() {
		setTitle("CardLayout Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		contentPane.setLayout(new BorderLayout(10, 10));
		setContentPane(contentPane);

		// Khởi tạo CardLayout và panel chứa các card
		cardLayout = new CardLayout();
		cardPanel = new JPanel(cardLayout);

		// Card 1: JLabel
		JPanel card1 = new JPanel();
		JLabel label = new JLabel("Page 1");
		card1.add(label);

		// Card 2: JButton
		JPanel card2 = new JPanel();
		card2.add(new JButton("Click"));

		// Thêm 2 card vào panel
		cardPanel.add(card1, "card1");
		card1.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{label}));
		cardPanel.add(card2, "card2");

		// Nút switch để chuyển đổi giữa 2 card
		JButton btnSwitch = new JButton("Switch");
		btnSwitch.addActionListener(e -> {
			
				cardLayout.next(cardPanel); // chuyển sang card kế tiếp
			
		});

		// Thêm vào contentPane
		contentPane.add(cardPanel, BorderLayout.CENTER);
		contentPane.add(btnSwitch, BorderLayout.SOUTH);
	}
}