package buoi4;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;

public class kiemtra extends JFrame {
    private JTextField txtHoTen, txtNgaySinh, txtQueQuan;
    private JButton btnHienThi;
    private JTable table;
    private DefaultTableModel tableModel;

    public kiemtra() {
        setTitle("Nhập Thông Tin");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lblHoTen = new JLabel("Họ và tên:");
        JLabel lblNgaySinh = new JLabel("Ngày sinh:");
        JLabel lblQueQuan = new JLabel("Quê quán:");

        txtHoTen = new JTextField();
        txtNgaySinh = new JTextField();
        txtQueQuan = new JTextField();
        btnHienThi = new JButton("Hiển thị");

        lblHoTen.setBounds(30, 30, 80, 25);
        txtHoTen.setBounds(120, 30, 200, 25);
        lblNgaySinh.setBounds(30, 70, 80, 25);
        txtNgaySinh.setBounds(120, 70, 200, 25);
        lblQueQuan.setBounds(30, 110, 80, 25);
        txtQueQuan.setBounds(120, 110, 200, 25);
        btnHienThi.setBounds(150, 150, 100, 30);

        add(lblHoTen);
        add(txtHoTen);
        add(lblNgaySinh);
        add(txtNgaySinh);
        add(lblQueQuan);
        add(txtQueQuan);
        add(btnHienThi);

        tableModel = new DefaultTableModel();
        tableModel.addColumn("Họ và tên");
        tableModel.addColumn("Ngày sinh");
        tableModel.addColumn("Quê quán");

        table = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(30, 200, 420, 120);
        add(scrollPane);

       
        btnHienThi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String hoTen = txtHoTen.getText();
                String ngaySinh = txtNgaySinh.getText();
                String queQuan = txtQueQuan.getText();

                tableModel.addRow(new Object[]{hoTen, ngaySinh, queQuan});

            
                txtHoTen.setText("");
                txtNgaySinh.setText("");
                txtQueQuan.setText("");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new kiemtra().setVisible(true);
        });
    }
}