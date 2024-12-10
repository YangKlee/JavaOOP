/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 29 thg 11, 2024
*/ 
package program;
import java.util.ArrayList;
import java.util.Date;

import classManager.*;
public class QLSach {

	public static void inTenSach(book Sach)
	{
		System.out.println("Ten sach: " + Sach.getTenSach());
	}
	public static void timSachCungNamXuatBan( ArrayList<book> dsSach, book SachMau)
	{
		System.out.println("Danh sach sach cung nam xuat ban la: ");
		for (int i = 0; i < dsSach.size(); i++)
		{
			if (SachMau.isCungNamXuatBan(dsSach.get(i)) 
					&& SachMau.hashCode() != dsSach.get(i).hashCode())
			{
				inTenSach(dsSach.get(i));
			}
		}
	}
	public static void giamGiaSachX(book X, double x)
	{
		inTenSach(X);
		System.out.println("Gia ban dau: " + X.getGiaBan());
		X.giamGiaSach(x);
		System.out.println("Gia sau khi giam: " + X.getGiaBan());
	}
	public static void main(String[] args) {
		ArrayList<book> dsSach = new ArrayList<book>();
		dsSach.add(new book("Dac Nhan Tam", 87000, 2005, 
				"Danel Cambilenge", new NgaySinh(01,10,1995)));
		dsSach.add(new book("Day lam giau", 50000, 2018, 
				"Huan Hoa Hong", new NgaySinh(01,10,1997)));
		dsSach.add(new book("Huong dan di tu cho nguoi moi bat dau", 150000, 2018, 
				"Kha Banh", new NgaySinh(11,02,1998)));
		System.out.println(dsSach.get(2).toString());
		inTenSach(dsSach.get(2));
		book bookTest = new book("Shikanoko Nokonoko Koshitantan", 190000, 2018);
		timSachCungNamXuatBan(dsSach, bookTest);
		giamGiaSachX(bookTest, 25);
	}
}
