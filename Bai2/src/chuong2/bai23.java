package chuong2;

import java.awt.EventQueue;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bai23 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	private String currentInput = "";
	private String operator = "";
	private double firstOperand = 0;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai23 frame = new bai23();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public bai23() {
		setTitle("Máy tính đơn giản");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagLayout gbl = new GridBagLayout();
		contentPane.setLayout(gbl);
		setContentPane(contentPane);

		textField = new JTextField();
		textField.setEditable(false);
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 4;
		gbc_textField.insets = new Insets(5, 5, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 0;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);

		String[] buttons = {
			"7", "8", "9", "/",
			"4", "5", "6", "*",
			"1", "2", "3", "-",
			"0", "+", "=", "C"
		};

		int index = 0;
		for (int row = 1; row <= 4; row++) {
			for (int col = 0; col < 4; col++) {
				String label = buttons[index++];
				JButton btn = new JButton(label);
				GridBagConstraints gbc_btn = new GridBagConstraints();
				gbc_btn.gridx = col;
				gbc_btn.gridy = row;
				gbc_btn.insets = new Insets(5, 5, 5, 5);
				gbc_btn.fill = GridBagConstraints.BOTH;
				contentPane.add(btn, gbc_btn);

				btn.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						handleButtonClick(label);
					}
				});
			}
		}
	}

	private void handleButtonClick(String label) {
		if (label.matches("\\d")) {
			currentInput += label;
			textField.setText(currentInput);
		} else if (label.matches("[\\+\\-\\*/]")) {
			if (!currentInput.isEmpty()) {
				firstOperand = Double.parseDouble(currentInput);
				operator = label;
				currentInput = "";
			}
		} else if (label.equals("=")) {
			if (!currentInput.isEmpty() && !operator.isEmpty()) {
				double secondOperand = Double.parseDouble(currentInput);
				double result = 0;
				switch (operator) {
					case "+": result = firstOperand + secondOperand; break;
					case "-": result = firstOperand - secondOperand; break;
					case "*": result = firstOperand * secondOperand; break;
					case "/": result = secondOperand != 0 ? firstOperand / secondOperand : 0; break;
				}
				textField.setText(String.valueOf(result));
				currentInput = "";
				operator = "";
				firstOperand = 0;
			}
		} else if (label.equals("C")) {
			currentInput = "";
			operator = "";
			firstOperand = 0;
			textField.setText("");
		}
	}
}
