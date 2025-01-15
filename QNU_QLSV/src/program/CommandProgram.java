/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 9 thg 1, 2025
*/ 
package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import DAO.DAOHocPhan;
import DAO.DAOSinhVien;
import model.HocPhan;
import model.SinhVien;

public class CommandProgram {
	public static void main(String[] args) {
		HocPhan hpInp = new HocPhan();
		SinhVien svInp = null;
		SimpleDateFormat simpleDate = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Thêm SV");
		System.out.println("2. Thêm HP");
		int choose = 0;
		do
		{
			choose = Integer.parseInt(sc.nextLine());
			if (choose == 1)
			{
				svInp = new SinhVien();
				System.out.print("Nhập MSV: ");
				svInp.setMaSV(sc.nextLine());
				System.out.print("Nhập Họ tên: ");
				svInp.setHoTen(sc.nextLine());
				System.out.print("Nhập ngày sinh: ");
				try {
					svInp.setNgaySinh(simpleDate.parse(sc.nextLine()));
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.print("Nhập địa chỉ: ");
				svInp.setDiaChi(sc.nextLine());
				System.out.print("Nhập số dt: ");
				svInp.setSoDT(sc.nextLine());
				System.out.print("Nhập email: ");
				svInp.setEmail(sc.nextLine());
				if(DAOSinhVien.get().addToDB(svInp))
				{
					System.out.println("Thêm thành công!");
				}
				else
				{
					System.out.println("thêm thất bại");
				}
			}
			else if (choose == 2)
			{
				hpInp = new HocPhan();
				System.out.print("Nhập mã HP: ");
				hpInp.setMaHP(sc.nextLine());
				System.out.println("Nhập loại HP: ");
				hpInp.setLoaiHP(sc.nextLine());
				System.out.println("Nhập tên HP: ");
				hpInp.setTenHP(sc.nextLine());
				DAOHocPhan.get().addToDB(hpInp);				
			}
			else if (choose == 3)
			{
				try {
					svInp = new SinhVien("4333", "ee", simpleDate.parse("18/07/2005"),
							"22", "33", "ll");
					DAOSinhVien.get().addToDB(svInp);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		while(choose!= 0);
	}
}
