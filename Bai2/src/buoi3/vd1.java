package buoi3;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class vd1 {
    public static void main(String[] args) {
        // Tạo frame
        JFrame frmNvbang = new JFrame("Thông Tin Sinh Viên");
        frmNvbang.setTitle("Nguyễn Văn Bằng");
        frmNvbang.setSize(504, 449);
        frmNvbang.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tạo label
        JLabel nameLabel = new JLabel("Họ và tên:");
        JLabel idLabel = new JLabel("Mã sinh viên:");
        JLabel dobLabel = new JLabel("Ngày sinh:");

        // Tạo textfield
        JTextField nameField = new JTextField();
        nameField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
                    e.consume(); // Chặn ký tự không phải chữ hoặc khoảng trắng
                }
            }
        });

        JTextField idField = new JTextField();
        idField.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {  // Chỉ cho phép nhập số
                    e.consume(); // Chặn ký tự không phải số
                }
            }
        });

        JTextField dobField = new JTextField();
        dobField.setText("dd/MM/yyyy");
        dobField.setForeground(Color.GRAY);
        dobField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (dobField.getText().equals("dd/MM/yyyy")) {
                    dobField.setText("");
                    dobField.setForeground(Color.BLACK);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (dobField.getText().isEmpty()) {
                    dobField.setForeground(Color.GRAY);
                    dobField.setText("dd/MM/yyyy");
                }
            }
        });

        // Tạo nút
        JButton button = new JButton("Hiển thị thông tin");

        // Tạo text area để hiển thị kết quả
        JTextArea resultArea = new JTextArea();
        resultArea.setEditable(false);

        // Layout
        GroupLayout groupLayout = new GroupLayout(frmNvbang.getContentPane());
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addGroup(groupLayout.createSequentialGroup()
                            .addGap(30)
                            .addComponent(nameLabel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                            .addGap(10)
                            .addComponent(nameField, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                        .addGroup(groupLayout.createSequentialGroup()
                            .addGap(30)
                            .addComponent(idLabel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                            .addGap(10)
                            .addComponent(idField, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                        .addGroup(groupLayout.createSequentialGroup()
                            .addGap(30)
                            .addComponent(dobLabel, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
                            .addGap(10)
                            .addComponent(dobField, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE))
                        .addGroup(groupLayout.createSequentialGroup()
                            .addGap(156)
                            .addComponent(button, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
                        .addGroup(groupLayout.createSequentialGroup()
                            .addGap(30)
                            .addComponent(resultArea, GroupLayout.PREFERRED_SIZE, 439, GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(19, Short.MAX_VALUE))
        );

        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGap(30)
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addComponent(nameLabel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                        .addComponent(nameField, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                    .addGap(15)
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addComponent(idLabel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                        .addComponent(idField, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                    .addGap(15)
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
                        .addComponent(dobLabel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                        .addComponent(dobField, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                    .addGap(25)
                    .addComponent(button, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(ComponentPlacement.UNRELATED)
                    .addComponent(resultArea, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
                    .addGap(67))
        );

        frmNvbang.getContentPane().setLayout(groupLayout);

        // Xử lý sự kiện khi nhấn nút
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText().trim();
                String id = idField.getText().trim();
                String dob = dobField.getText().trim();

                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                sdf.setLenient(false);

                try {
                    sdf.parse(dob);
                    resultArea.setText("Tên: " + name + "\nMã sinh viên: " + id + "\nNgày sinh: " + dob);
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(null, "Ngày sinh không hợp lệ! Hãy nhập theo định dạng dd/MM/yyyy", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Hiển thị frame
        frmNvbang.setVisible(true);
    }
}
