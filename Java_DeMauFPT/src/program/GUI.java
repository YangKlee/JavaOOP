/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 9 thg 1, 2025
*/ 
package program;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import services.DataServices;
import services.FileServices;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.TabableView;

import model.dataError;
import references.data;

import java.awt.Color;
import javax.swing.JScrollPane;

public class GUI extends JFrame implements data {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable errorTable;
	DefaultTableModel model;
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
	public void showMessage(String title, String content, int type)
	{
		JOptionPane.showMessageDialog(null, content,title , type);
	}
	public String getStringErr(boolean e)
	{
		if (!e)
			return "Yes";
		else
			return "";
	}
	public void showError()
	{
		for (dataError err : listError)
		{
			Object[] fuck = {err.getLine(), getStringErr(err.isTrueBirthday()), 
					getStringErr(err.isTruePhone()),getStringErr(err.isTrueEmail())
					, getStringErr(err.isTrueYearExperences()), getStringErr(err.isDuDuLieu())};
			model.addRow(fuck);
			
		}
	}
	public void reset()
	{
		listError.clear();
		listCandidate.clear();
		model.setRowCount(0);
	}
	/**
	 * Create the frame.
	 */
	public GUI() {
		setTitle("Employee Import");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 384);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(157, 206, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("DANH SÁCH CÁC DÒNG LỖI");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(0, 11, 583, 36);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Import from File");
		btnNewButton.setBackground(new Color(223, 239, 255));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
				JFileChooser fileDialog = new JFileChooser();
				
				if (fileDialog.showOpenDialog(null) == fileDialog.APPROVE_OPTION)
				{
					FileServices fsv = new FileServices();
					String url = fileDialog.getSelectedFile().getAbsolutePath();
					fsv.readFile(url);
					showError();		
					showMessage("Thông báo", "Đọc file thành công", JOptionPane.INFORMATION_MESSAGE);
					
				}
				else
				{
					showMessage("Thông báo", "Chưa chọn file", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnNewButton.setBounds(20, 280, 114, 36);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Import to DB");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DataServices dataserves = new DataServices();
				dataserves.exportToDB();
				showMessage("Thông báo", "Đã nhập dữ liệu vào DB", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnNewButton_1.setBackground(new Color(223, 239, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_1.setBounds(167, 280, 106, 36);
		contentPane.add(btnNewButton_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 46, 563, 223);
		contentPane.add(scrollPane);
		
		errorTable = new JTable();
		errorTable.setBackground(new Color(223, 239, 255));
		scrollPane.setViewportView(errorTable);
		model = new DefaultTableModel();
		Object[] column = {"Dòng", "Sai ngày sinh", "Sai số DT", "Sai email", "Sai năm KN", "Thừa dữ liệu"};
		Object[] rows = new Object[0];
		model.setColumnIdentifiers(column);
		errorTable.setModel(model);
		
	}
}
