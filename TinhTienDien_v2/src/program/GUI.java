/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 18 thg 12, 2024
*/ 
package program;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AsyncBoxView.ChildLocator;

import entity.dsNguoiDungDien;
import entity.dvHanhChinh;
import entity.dvSanXuat;
import entity.khanhHang;
import entity.nguoiDungDien;
import service.ReadWriteFile;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.security.MessageDigest;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;

public class GUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table_data;
	private JRadioButton canhan_rb;
	private JRadioButton dvHanhChinh_rb;
	private JRadioButton dvSanXuat_rb;
	private int doiTuongChecked = -1; // 1 ca nhan, 2 don vi san xuat, 3 don vi hanh chinh
	private JTextField chiSoCu_tb;
	private JTextField chiSoMoi_tb;
	private JTextField dinhMuc_tb;
	static DefaultTableModel model_table = new DefaultTableModel();
	private static int STT = 0;
	private JCheckBox editMode_cb;
	private JButton add_btn;
	private JButton readFile_btn;
	private JButton edit_btn;
	private JButton del_btn;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static void showDialog(String title, String descrip, int type)
	{
		JOptionPane.showMessageDialog(null, descrip, title, type);
	}
	/**
	 * Create the frame.
	 */
	public static void updateTable()
	{
		model_table.setRowCount(0); 
		for (int i = 0; i < dsNguoiDungDien.size(); i++)
		{
			Object[] dataUser = {model_table.getRowCount() +1, dsNguoiDungDien.get(i).getTypeName(), 
					dsNguoiDungDien.get(i).getChiSoCu(), dsNguoiDungDien.get(i).getChiSoMoi(),
					dsNguoiDungDien.get(i).getDinhMuc(), dsNguoiDungDien.get(i).tinhTienDien()};
			model_table.addRow(dataUser);
		}
	}
	public void resetInput()
	{
		chiSoCu_tb.setText(null);
		chiSoMoi_tb.setText(null);
		dinhMuc_tb.setText(null);
	}
	public GUI() {
		setTitle("Chương trình tính tiền điện");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 766, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Chọn đối tượng:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(29, 26, 114, 14);
		contentPane.add(lblNewLabel);
		
		canhan_rb = new JRadioButton("Cá nhân");
		canhan_rb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (canhan_rb.isSelected())
				{
					doiTuongChecked = 1;
					dvHanhChinh_rb.setSelected(false);
					dvSanXuat_rb.setSelected(false);
				}
			}
		});
		canhan_rb.setFont(new Font("Tahoma", Font.PLAIN, 13));
		canhan_rb.setBounds(53, 51, 109, 23);
		contentPane.add(canhan_rb);
		
		dvHanhChinh_rb = new JRadioButton("dv Hành chính");
		dvHanhChinh_rb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (dvHanhChinh_rb.isSelected())
				{
					doiTuongChecked = 3;
					canhan_rb.setSelected(false);
					dvSanXuat_rb.setSelected(false);
				}
			}
		});
		dvHanhChinh_rb.setFont(new Font("Tahoma", Font.PLAIN, 13));
		dvHanhChinh_rb.setBounds(53, 84, 109, 23);
		contentPane.add(dvHanhChinh_rb);
		
		dvSanXuat_rb = new JRadioButton("dv Sản xuất");
		dvSanXuat_rb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (dvSanXuat_rb.isSelected())
				{
					doiTuongChecked = 2;
					canhan_rb.setSelected(false);
					dvHanhChinh_rb.setSelected(false);
				}
			}
		});
		dvSanXuat_rb.setFont(new Font("Tahoma", Font.PLAIN, 13));
		dvSanXuat_rb.setBounds(53, 115, 109, 23);
		contentPane.add(dvSanXuat_rb);
		
		JLabel lblNewLabel_1 = new JLabel("Chỉ số cũ:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(33, 167, 64, 14);
		contentPane.add(lblNewLabel_1);
		
		chiSoCu_tb = new JTextField();
		chiSoCu_tb.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chiSoCu_tb.setBounds(115, 164, 98, 20);
		contentPane.add(chiSoCu_tb);
		chiSoCu_tb.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Chỉ số mới:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(29, 207, 68, 14);
		contentPane.add(lblNewLabel_1_1);
		
		chiSoMoi_tb = new JTextField();
		chiSoMoi_tb.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chiSoMoi_tb.setColumns(10);
		chiSoMoi_tb.setBounds(115, 204, 98, 20);
		contentPane.add(chiSoMoi_tb);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Định mức:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1_1_1.setBounds(29, 248, 68, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		dinhMuc_tb = new JTextField();
		dinhMuc_tb.setFont(new Font("Tahoma", Font.PLAIN, 13));
		dinhMuc_tb.setColumns(10);
		dinhMuc_tb.setBounds(115, 245, 98, 20);
		contentPane.add(dinhMuc_tb);
		
		add_btn = new JButton("Thêm");
		add_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chiSoCu_tb.getText() == null ||
						chiSoMoi_tb.getText() == null || 
						dinhMuc_tb.getText() == null )
				{
					showDialog("Lỗi nhập liệu", "Nhập dữ liệu không đủ tính đéo gì?",  JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					double csCu ;
					double csMoi;
					double dinhMuc;
					try
					{
						csCu = Double.parseDouble(chiSoCu_tb.getText());
						csMoi = Double.parseDouble(chiSoMoi_tb.getText());
						dinhMuc = Double.parseDouble(dinhMuc_tb.getText());
						if (dvSanXuat_rb.isSelected())
							dsNguoiDungDien.add( new dvSanXuat(csCu, csMoi, dinhMuc));
						else if (dvHanhChinh_rb.isSelected())
							dsNguoiDungDien.add( new dvHanhChinh(csCu, csMoi, dinhMuc));
						else if (canhan_rb.isSelected())
							dsNguoiDungDien.add(new khanhHang(csCu, csMoi, dinhMuc));
						else
						{
							showDialog("Lỗi!!","Chưa nhập đối tượng hả má", ABORT);
						}
					}
					catch (Exception Ehe)
					{
						showDialog("Lỗi", "Dữ liệu không đúng định dạng",
								JOptionPane.ERROR_MESSAGE);
						Ehe.printStackTrace();
					}
					
					//nguoiDungDien userTest = new nguoiDungDien(csCu, csMoi, dinhMuc) ;
					updateTable();
				}
				
				resetInput();
			}
		});
		add_btn.setBounds(10, 286, 89, 23);
		contentPane.add(add_btn);
		
		JScrollPane scrollPane = new JScrollPane();

		scrollPane.setBounds(248, 21, 492, 350);
		contentPane.add(scrollPane);
		
		table_data = new JTable(model_table);
		scrollPane.setViewportView(table_data);
		
		
		Object [] col_table = {"STT", "Loại ĐT", "GT cũ", "GT mới", "Định mức", "Thành tiền"};
		model_table.addColumn("STT");
		model_table.addColumn("Loại ĐT");
		model_table.addColumn("GT cũ");
		model_table.addColumn("GT mới");
		model_table.addColumn( "Định mức");
		model_table.addColumn("Thành tiền");
		table_data.getColumnModel().getColumn(5).setPreferredWidth(120);
		table_data.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int i = table_data.getSelectedRow();
				if (i != -1)
				{
					// get info
					String doiTuong = dsNguoiDungDien.get(i).getTypeName();
					double csCu = dsNguoiDungDien.get(i).getChiSoCu();
					double csMoi = dsNguoiDungDien.get(i).getChiSoMoi();
					double dm = dsNguoiDungDien.get(i).getDinhMuc();
					if (doiTuong.equals("KH Cá nhân"))
					{
						dvSanXuat_rb.setSelected(false);
						dvHanhChinh_rb.setSelected(false);
						canhan_rb.setSelected(true);
					}
					else if (doiTuong.equals("DV Sản xuất"))
					{
						dvHanhChinh_rb.setSelected(false);
						canhan_rb.setSelected(false);
						dvSanXuat_rb.setSelected(true);
					}
					else if (doiTuong.equals("DV Hành Chính"))
					{
						canhan_rb.setSelected(false);
						dvSanXuat_rb.setSelected(false);
						dvHanhChinh_rb.setSelected(true);
					}
					chiSoCu_tb.setText(csCu + "");
					chiSoMoi_tb.setText(csMoi + "");
					dinhMuc_tb.setText(dm + "");
				}
			}
		});

		//table_data.setModel(model_table);
		table_data.setRowSelectionAllowed(false);
		table_data.setCellSelectionEnabled(false);
		edit_btn = new JButton("Sửa");
		edit_btn.setEnabled(false);
		edit_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index_edit = table_data.getSelectedRow();
				System.out.println(index_edit);
				if (index_edit != -1)
				{
					nguoiDungDien userEdit = dsNguoiDungDien.get(index_edit);
					double csCu ;
					double csMoi;
					double dinhMuc;
					try
					{
						csCu = Double.parseDouble(chiSoCu_tb.getText());
						csMoi = Double.parseDouble(chiSoMoi_tb.getText());
						dinhMuc = Double.parseDouble(dinhMuc_tb.getText());
						if (dvSanXuat_rb.isSelected())
							dsNguoiDungDien.set(index_edit, new dvSanXuat(csCu, csMoi, dinhMuc));
						else if (dvHanhChinh_rb.isSelected())
							dsNguoiDungDien.set(index_edit, new dvHanhChinh(csCu, csMoi, dinhMuc));
						else if (canhan_rb.isSelected())
							dsNguoiDungDien.set(index_edit,new khanhHang(csCu, csMoi, dinhMuc));
						else
						{
							showDialog("Lỗi!!","Chưa nhập đối tượng hả má", ABORT);
						}
					}
					catch (Exception Ehe)
					{
						showDialog("Lỗi", "Dữ liệu không đúng định dạng",
								JOptionPane.ERROR_MESSAGE);
						Ehe.printStackTrace();
					}
					updateTable();

				}
				else
				{
					showDialog("Mày ngu à ?","Chọn chưa mà đòi sửa? ", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		edit_btn.setBounds(10, 324, 89, 23);
		contentPane.add(edit_btn);
		
		del_btn = new JButton("Xóa");
		del_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index_edit = table_data.getSelectedRow();
				System.out.println(index_edit);
				if (index_edit != -1)
				{
					dsNguoiDungDien.delete(index_edit);
					updateTable();
				}
				else
				{
					showDialog("Mày ngu à ?","Chọn chưa mà đòi xóa? ", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		del_btn.setEnabled(false);
		del_btn.setBounds(10, 358, 89, 23);
		contentPane.add(del_btn);
		
		readFile_btn = new JButton("Đọc file");
		readFile_btn.setBounds(115, 286, 89, 23);
		contentPane.add(readFile_btn);
		
		JButton saveFile_btn = new JButton("Lưu file");
		saveFile_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileDialog = new JFileChooser();
				int respone = fileDialog.showSaveDialog(null);
				if (respone == fileDialog.APPROVE_OPTION)
				{
					String url = fileDialog.getSelectedFile().getAbsolutePath();
					
						ReadWriteFile write = new ReadWriteFile();
						try
						{
							write.writeFile(url);
						}
						catch (FileNotFoundException filee)
						{
							showDialog("Error", "Write file error", JOptionPane.ERROR_MESSAGE);
						}

				}
			}
		});
		saveFile_btn.setBounds(115, 324, 89, 23);
		contentPane.add(saveFile_btn);
		
		editMode_cb = new JCheckBox("Chế độ sửa");
		editMode_cb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetInput();
				if (editMode_cb.isSelected())
				{
					edit_btn.setEnabled(true);
					del_btn.setEnabled(true);
					add_btn.setEnabled(false);
					readFile_btn.setEnabled(false);
					saveFile_btn.setEnabled(false);
					table_data.setRowSelectionAllowed(true);
				}
				else
				{
					edit_btn.setEnabled(false);
					del_btn.setEnabled(false);
					readFile_btn.setEnabled(true);
					saveFile_btn.setEnabled(true);
					add_btn.setEnabled(true);
					table_data.setRowSelectionAllowed(false);
				}
			}
		});
		editMode_cb.setBounds(116, 358, 97, 23);
		contentPane.add(editMode_cb);
		

	}
}
