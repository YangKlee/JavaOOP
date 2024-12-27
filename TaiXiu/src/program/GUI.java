/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 16 thg 12, 2024
*/ 
package program;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entity.player;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.sql.Time;

public class GUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static JLabel sodu_lb;
	private JButton play_bt;
	private JButton napTien_bt;
	private JButton rutTien_bt;
	static  boolean isNap = false;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				duLieu.newPlayer();
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	static void setSoDu()
	{
		sodu_lb.setText(duLieu.getPlayer().getSoDu() + " VND");
	}
	/**
	 * Create the frame.
	 */
	public GUI() {
		addComponentListener(new ComponentAdapter() {
			@Override
			public void componentShown(ComponentEvent e) {
				setSoDu();
			}
		});
		setTitle("Tài xỉu - Làm giàu không khó");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GAME TÀI XỈU");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(24, 11, 383, 40);
		contentPane.add(lblNewLabel);
		
		play_bt = new JButton("Chơi");
		play_bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				datCuoc choi = new datCuoc();
				choi.show();
			}
		});
		play_bt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		play_bt.setBounds(310, 72, 114, 33);
		contentPane.add(play_bt);
		
		napTien_bt = new JButton("Nạp tiền");
		napTien_bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				napRutTien napTien = new napRutTien();
				isNap = true;
				napTien.show();
				
				System.out.println("esk");
				
			}
		});
		napTien_bt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		napTien_bt.setBounds(310, 132, 114, 33);
		contentPane.add(napTien_bt);
		
		rutTien_bt = new JButton("Rút tiền");
		rutTien_bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				napRutTien rutTien = new napRutTien();
				isNap = false;
				rutTien.show();
			}
		});
		rutTien_bt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		rutTien_bt.setBounds(310, 191, 114, 33);
		contentPane.add(rutTien_bt);
		
		JLabel lblNewLabel_1 = new JLabel("Số dư tài khoản game");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 72, 290, 14);
		contentPane.add(lblNewLabel_1);
		
		sodu_lb = new JLabel("");
		setSoDu();
		sodu_lb.setForeground(new Color(255, 0, 0));
		sodu_lb.setFont(new Font("Tahoma", Font.PLAIN, 30));
		sodu_lb.setHorizontalAlignment(SwingConstants.CENTER);
		sodu_lb.setBounds(10, 91, 290, 40);
		contentPane.add(sodu_lb);
	}
}
