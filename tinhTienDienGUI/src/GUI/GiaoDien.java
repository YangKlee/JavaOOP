/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 16 thg 12, 2024
*/ 
package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entity.khachHangCaNhan;
import entity.khachHangDien;
import service.valueException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JButton;

public class GiaoDien extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JRadioButton dvHanhChinh_bt;
	private JRadioButton dvSanXuat_bt;
	private JRadioButton caNhan_bt;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JButton btnTinhTien;
	private int loaiKH = -1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GiaoDien frame = new GiaoDien();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private static void showDialog(String title, String s, int type )
	{
		JOptionPane.showMessageDialog(null, s, title, type);

	}
	/**
	 * Create the frame.
	 */
	public GiaoDien() {
		setTitle("Chương trình tính tiền điện");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHƯƠNG TRÌNH TÍNH TIỀN ĐIỆN");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(10, 11, 414, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Chọn đối tượng tính");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 65, 147, 19);
		contentPane.add(lblNewLabel_1);
		
		dvHanhChinh_bt = new JRadioButton("Đv hành chính");
		dvHanhChinh_bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (dvHanhChinh_bt.isSelected())
				{
					loaiKH = 1;
					dvSanXuat_bt.setSelected(false);
					caNhan_bt.setSelected(false);					
					
				}
			}
		});
		dvHanhChinh_bt.setBounds(20, 91, 109, 23);
		contentPane.add(dvHanhChinh_bt);
		
		dvSanXuat_bt = new JRadioButton("Đv sản xuất");
		dvSanXuat_bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (dvSanXuat_bt.isSelected())
				{
					loaiKH = 2;
					dvHanhChinh_bt.setSelected(false);
					caNhan_bt.setSelected(false);					
					
				}
			}
		});
		dvSanXuat_bt.setBounds(20, 124, 109, 23);
		contentPane.add(dvSanXuat_bt);
		
		caNhan_bt = new JRadioButton("Khách hàng cá nhân");
		caNhan_bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (caNhan_bt.isSelected())
				{
					loaiKH = 3;
					dvHanhChinh_bt.setSelected(false);
					dvSanXuat_bt.setSelected(false);					
					
				}
			}
		});
		caNhan_bt.setBounds(20, 157, 137, 23);
		contentPane.add(caNhan_bt);
		
		lblNewLabel_2 = new JLabel("Nhập dữ liệu");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(208, 67, 137, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Giá trị cũ:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(208, 95, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Giá trị mới:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4.setBounds(208, 128, 56, 14);
		contentPane.add(lblNewLabel_4);
		
		JTextField gtCu_txb = new JTextField();
		gtCu_txb.setBounds(276, 92, 114, 20);
		contentPane.add(gtCu_txb);
		gtCu_txb.setColumns(10);
		
		JTextField giaTriMoi_tb = new JTextField();
		giaTriMoi_tb.setBounds(274, 125, 114, 20);
		contentPane.add(giaTriMoi_tb);
		giaTriMoi_tb.setColumns(10);
		
		btnTinhTien = new JButton("Tính tiền");
		btnTinhTien.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (dvHanhChinh_bt.isSelected() || dvSanXuat_bt.isSelected() || caNhan_bt.isSelected())
				{
					try
					{
						double res = 0;
						
						res = program.tinhTienDien(loaiKH, gtCu_txb.getText(), giaTriMoi_tb.getText());
						showDialog("Kết quả", "Giá trị: " + res, JOptionPane.INFORMATION_MESSAGE);
					}
					catch(valueException ee)
					{
						showDialog("Lỗi", "Định dạng dữ liệu đầu vào sai", JOptionPane.ERROR_MESSAGE);
					}
				}
				else
					showDialog("Lỗi", "Vui lòng chọn đối tượng tính tiền", JOptionPane.ERROR_MESSAGE);
			}
		});
		btnTinhTien.setBounds(165, 215, 89, 23);
		contentPane.add(btnTinhTien);
	}
}
