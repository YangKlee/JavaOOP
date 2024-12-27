/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 11 thg 12, 2024
*/ 
package program;

import java.awt.EventQueue;

import entity.CanSolveException;
import entity.ptBac2;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PTBAC2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField a_tx;
	private JTextField b_tx;
	private JTextField c_tx;
	ptBac2 pt;
	private JTextField kq_tx;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PTBAC2 frame = new PTBAC2();
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
	public PTBAC2() {
		setTitle("Tính phương trình bậc 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 411, 264);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		a_tx = new JTextField();
		a_tx.setBounds(27, 46, 59, 20);
		contentPane.add(a_tx);
		a_tx.setColumns(10);
		
		b_tx = new JTextField();
		b_tx.setColumns(10);
		b_tx.setBounds(136, 46, 59, 20);
		contentPane.add(b_tx);
		
		c_tx = new JTextField();
		c_tx.setColumns(10);
		c_tx.setBounds(252, 46, 59, 20);
		contentPane.add(c_tx);
		
		JLabel lblNewLabel = new JLabel("X^2 +");
		lblNewLabel.setBounds(96, 49, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("+ x +");
		lblNewLabel_1.setBounds(205, 49, 37, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("= 0");
		lblNewLabel_2.setBounds(321, 49, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Tính");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try
				{
					double a = Double.parseDouble(a_tx.getText());
					double b = Double.parseDouble(b_tx.getText());
					double c = Double.parseDouble(c_tx.getText());
					try {
						pt = (ptBac2)new ptBac2(a, b, c);
					} catch (CanSolveException e1) {
						// TODO Auto-generated catch block
						JOptionPane.showMessageDialog(btnNewButton, e1);
					}
					kq_tx.setText(pt.giaiPT());
				}
				catch (NumberFormatException E)
				{
					JOptionPane.showMessageDialog(btnNewButton, "Lỗi định dạng số");
				}

				
			}
		});
		btnNewButton.setBounds(155, 176, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("kết quả");
		lblNewLabel_3.setBounds(168, 84, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		kq_tx = new JTextField();
		kq_tx.setBounds(10, 106, 375, 49);
		contentPane.add(kq_tx);
		kq_tx.setColumns(10);
	}
}
