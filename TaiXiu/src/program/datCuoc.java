/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 16 thg 12, 2024
*/ 
package program;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.util.Random;
import java.util.Timer;

import java.awt.Font;
import java.util.TimerTask;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class datCuoc extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static JLabel anoucement_tx;
	private static double soTienCuoc = 0;
	private static boolean isTai = false;
	private static boolean isXiu = false;
	static Timer boDem = new Timer();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					datCuoc frame = new datCuoc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private static JLabel ketqua_lb;




	private static JButton tai_btn;
	private static JButton xiu_btn;
	private static JButton xacNhan_tb;
	private static JTextField datCuoc_tb;
	private static JLabel soDu_lb;
	private static JLabel info_lb;
	static void getSoDu()
	{
		soDu_lb.setText((duLieu.getPlayer()).getSoDu() + " VND");
		
	}
	static void choBatDauVanChoi()
	{
		datCuoc_tb.setText(null);
		GUI.setSoDu();
		TimerTask choBatDau = new TimerTask() {
			int count = 5;
			@Override
			public void run() {
				//System.out.println("Dem nguoc");
				if (count > 0)
				{
					
					ketqua_lb.setText(count + "");
					count--;
					
				}
				else
				{
					System.out.println("Bat dau van choi");
					this.cancel();
					//choBatDau.cancel();
					choDatCuoc();
				}
			}
		};
		
		anoucement_tx.setText("Ván chơi bắt đầu sau: " );
		tai_btn.setEnabled(false);
		xiu_btn.setEnabled(false);
		xacNhan_tb.setEnabled(false);
		datCuoc_tb.setEnabled(false);
		tai_btn.setForeground(Color.BLACK);
		xiu_btn.setForeground(Color.BLACK);
		
		boDem.scheduleAtFixedRate(choBatDau, 0, 1000);
		
	}
	static void choDatCuoc()
	{
		info_lb.setText(null);
		TimerTask taskDatCuoc = new TimerTask() {
			int count = 15;
			@Override
			public void run() {
				//System.out.println("Dem nguoc");
				if (count > 0)
				{
					
					ketqua_lb.setText(count + "");
					count--;
					
				}
				else
				{
					System.out.println("Cho dat cuoc xong");
					
					//taskDatCuoc.cancel();
					this.cancel();
					choKetQua();
				}
			}
		};
		anoucement_tx.setText("Thời gian đặt cược: " );
		soTienCuoc = 0;
		tai_btn.setEnabled(false);
		xiu_btn.setEnabled(false);
		xacNhan_tb.setEnabled(true);
		datCuoc_tb.setEnabled(true);
		boDem.scheduleAtFixedRate(taskDatCuoc, 0, 1000);
		
	}

	static void choKetQua()
	{
		//info_lb.setText(null);
		if (isTai)
		{
			info_lb.setText("Bạn đã cược tài với số tiền: " + soTienCuoc + " VND");
		}
		else
		{
			info_lb.setText("Bạn đã cược xỉu với số tiền: " + soTienCuoc + " VND");
		}
		TimerTask taskChoKetQua = new TimerTask() {
			int count = 5;
			@Override
			public void run() {
				//System.out.println("Dem nguoc");
				if (count > 0)
				{
					
					ketqua_lb.setText(count + "");
					count--;
					
				}
				else
				{
					System.out.println("Cho ketquaXong");
					//taskChoKetQua.cancel();
					this.cancel();
					congBoKetQua();
				}
			}
		};
		
		anoucement_tx.setText("Chờ kết quả từ nhà cái: " );
		
		getSoDu();
		tai_btn.setEnabled(false);
		xiu_btn.setEnabled(false);
		xacNhan_tb.setEnabled(false);
		datCuoc_tb.setEnabled(false);
		boDem.scheduleAtFixedRate(taskChoKetQua, 0, 1000);		

	}
	static void congBoKetQua()
	{
		TimerTask taskShowKetQua = new TimerTask() {
			int count = 5;
			@Override
			public void run() {
				//System.out.println("Dem nguoc");
				if (count > 0)
				{
					
					//ketqua_lb.setText(count + "");
					count--;
					
				}
				else
				{
					System.out.println("Cho showketquaXong");
					//taskShowKetQua.cancel();
					this.cancel();
					choBatDauVanChoi();

				}
			}
		};
		anoucement_tx.setText("Kết quả từ nhà cái: " );
		tai_btn.setEnabled(false);
		xiu_btn.setEnabled(false);
		xacNhan_tb.setEnabled(false);
		datCuoc_tb.setEnabled(false);
		Random ran = new Random();
		int result = 0;
		for (int i = 1; i <= 3; i++)
		{
			result += ran.nextInt(6) +1;
		}
		// xet chan le
		if (result % 2 == 0) // tai
		{
			ketqua_lb.setText("Tài");
			
			if (isTai)
			{
				info_lb.setText("Bạn đã thắng được số tiền: " + soTienCuoc + " VND");
				duLieu.getPlayer().napTien(soTienCuoc *2);
			}
			else
			{
				info_lb.setText("Bạn đã thua và mất số tiền: " + soTienCuoc + " VND");
			}
		}
		else
		{
			ketqua_lb.setText("Xỉu");
			if (isXiu)
			{
				info_lb.setText("Bạn đã thắng được số tiền: " + soTienCuoc + " VND");
				duLieu.getPlayer().napTien(soTienCuoc *2);
			}
			else
			{
				info_lb.setText("Bạn đã thua và mất số tiền: " + soTienCuoc + " VND");
			}
		}
		getSoDu();
		boDem.scheduleAtFixedRate(taskShowKetQua, 0, 1000);
	}
	/**
	 * Create the frame.
	 */
	public datCuoc() {
		boDem = new Timer();
		setTitle("Tài xỉu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TÀI XỈU");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 469, 53);
		contentPane.add(lblNewLabel);
		
		anoucement_tx = new JLabel("anoucement_tx");
		anoucement_tx.setHorizontalAlignment(SwingConstants.CENTER);
		anoucement_tx.setFont(new Font("Tahoma", Font.PLAIN, 25));
		anoucement_tx.setBounds(0, 65, 489, 24);
		contentPane.add(anoucement_tx);
		
		ketqua_lb = new JLabel("ketqua_tx");
		ketqua_lb.setForeground(new Color(255, 0, 0));
		ketqua_lb.setHorizontalAlignment(SwingConstants.CENTER);
		ketqua_lb.setFont(new Font("Tahoma", Font.BOLD, 35));
		ketqua_lb.setBounds(10, 100, 469, 71);
		contentPane.add(ketqua_lb);
		
		tai_btn = new JButton("TÀI");
		tai_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isTai = true;
				isXiu =  false;
				tai_btn.setForeground(Color.RED);
				xiu_btn.setForeground(Color.BLACK);
			}
		});
		tai_btn.setEnabled(false);
		tai_btn.setFont(new Font("Tahoma", Font.BOLD, 40));
		tai_btn.setBounds(50, 225, 127, 72);
		contentPane.add(tai_btn);
		
		xiu_btn = new JButton("XỈU");
		xiu_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				isTai = false;
				isXiu =  true;
				xiu_btn.setForeground(Color.RED);
				tai_btn.setForeground(Color.BLACK);
			}
		});
		xiu_btn.setEnabled(false);
		xiu_btn.setFont(new Font("Tahoma", Font.BOLD, 40));
		xiu_btn.setBounds(292, 225, 127, 72);
		contentPane.add(xiu_btn);
		
		JLabel lblNewLabel_1 = new JLabel("Cược:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_1.setBounds(56, 182, 69, 24);
		contentPane.add(lblNewLabel_1);
		
		datCuoc_tb = new JTextField();
		datCuoc_tb.setHorizontalAlignment(SwingConstants.RIGHT);
		datCuoc_tb.setFont(new Font("Tahoma", Font.PLAIN, 19));
		datCuoc_tb.setBounds(122, 182, 145, 24);
		contentPane.add(datCuoc_tb);
		datCuoc_tb.setColumns(10);
		
		xacNhan_tb = new JButton("Xác nhận");
		xacNhan_tb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				soTienCuoc = Double.parseDouble(datCuoc_tb.getText());
				duLieu.getPlayer().rutTien(soTienCuoc);
				getSoDu();
				tai_btn.setEnabled(true);
				xiu_btn.setEnabled(true);
				datCuoc_tb.setEnabled(false);
				xacNhan_tb.setEnabled(false);
			}
		});
		xacNhan_tb.setBounds(277, 182, 89, 23);
		contentPane.add(xacNhan_tb);
		
		JLabel lblNewLabel_3 = new JLabel("Số dư");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNewLabel_3.setBounds(35, 341, 69, 30);
		contentPane.add(lblNewLabel_3);
		
		soDu_lb = new JLabel("0 VND");
		soDu_lb.setForeground(new Color(255, 0, 0));
		soDu_lb.setFont(new Font("Tahoma", Font.PLAIN, 19));
		soDu_lb.setBounds(108, 341, 181, 30);
		contentPane.add(soDu_lb);
		
		JButton btnNewButton = new JButton("Exit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUI.setSoDu();
				boDem.cancel();
				dispose();
			}
		});
		btnNewButton.setBounds(345, 348, 89, 23);
		contentPane.add(btnNewButton);
		
		info_lb = new JLabel("");
		info_lb.setFont(new Font("Tahoma", Font.PLAIN, 13));
		info_lb.setHorizontalAlignment(SwingConstants.CENTER);
		info_lb.setBounds(0, 314, 479, 24);
		contentPane.add(info_lb);
		choBatDauVanChoi();
		getSoDu();
		//Timer choVanMoi = new Timer();
		
		
	}
}
