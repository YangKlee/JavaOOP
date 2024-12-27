/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 25 thg 12, 2024
*/ 
package program;
import entity.*;
public class QLSV implements data{
	public static void main(String[] args) {
		dsSV.add(new SinhVien("Nguyễn Yến Nhi"));
		dsSV.add(new SinhVien("Nguyễn Khánh Dương"));
		dsSV.get(0).themDiem("Toán rời rạc", 3, 10, 9, 6);
		dsSV.get(0).themDiem("Toán logic", 2, 6, 9, 6);
		dsSV.get(0).themDiem("Xác chết thống kê", 3, 10,4.4, 5.4);
		
		dsSV.get(1).themDiem("Toán rời rạc", 3, 10, 9, 9);
		dsSV.get(1).themDiem("Toán logic", 2, 9, 9, 9);
		dsSV.get(1).themDiem("Xác chết thống kê", 3, 10,4, 10);
		
		for (SinhVien sv: dsSV)
		{
			System.out.println(sv.getHoTen()+ " "+ sv.tinhDTB());
		}
	}

	
}
