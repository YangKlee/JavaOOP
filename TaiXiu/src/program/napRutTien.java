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
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.net.http.WebSocket.Listener;
import java.awt.event.ActionEvent;

public class napRutTien extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField money_tx;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					napRutTien frame = new napRutTien();
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
	public napRutTien() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 499, 153);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số tiền:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 11, 91, 19);
		contentPane.add(lblNewLabel);
		
		money_tx = new JTextField();
		money_tx.setHorizontalAlignment(SwingConstants.RIGHT);
		money_tx.setFont(new Font("Tahoma", Font.PLAIN, 26));
		money_tx.setBounds(20, 41, 354, 52);
		contentPane.add(money_tx);
		money_tx.setColumns(10);
		
		JButton acc_bt = new JButton("Accept");
		acc_bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (GUI.isNap)
				{
					duLieu.getPlayer().napTien(Double.parseDouble(money_tx.getText())); 
					GUI.setSoDu();
				}
				else
				{
					duLieu.getPlayer().rutTien(Double.parseDouble(money_tx.getText())); 
					GUI.setSoDu();
					
				}
				dispose();
			}
		});
		acc_bt.setFont(new Font("Tahoma", Font.PLAIN, 18));
		acc_bt.setBounds(384, 37, 89, 56);
		contentPane.add(acc_bt);
	}

}
