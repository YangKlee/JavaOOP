/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 22 thg 10, 2024
*/
package program;
import items.*;
public class ThungThu {
	public static void lietKeBuuPham(BuuPham thungThu[], int SL, String loai)
	{
		for (int i = 0; i < SL; i++)
		{
			if (loai.equals("all"))
				thungThu[i].hienThi();
			else if(loai.equals(thungThu[i].getLoai()))
				thungThu[i].hienThi();
		}
	}
	public static float tinhtienBuuPham(BuuPham thungThu[], int SL, String loai)
	{
		float soTien = 0;
		for (int i = 0; i < SL; i++)
		{
			if (loai.equals("all"))
				soTien += thungThu[i].getGia();
			else if(loai.equals(thungThu[i].getLoai()))
				soTien += thungThu[i].getGia();
		}
		return soTien;
	}
	public static void main(String[] args) {
		final int SLTHU = 5;
		BuuPham thungThu[] = new BuuPham[SLTHU];
		thungThu[0] = new Thu("thuong","Yang", "Nahida", "Quy Nhon, Binh Dinh", "Sumeru");
		thungThu[1] = new Thu("bao dam","Mavuika", "Hutao", "Natlan", "Liyue");
		thungThu[2] = new BuuKien("Hutao", "Mavuika", "Vang sinh duong Liyue", "Natlan");
		thungThu[3] = new Thu("bao dam", "Duong", "Nhi", "Bui Thi Xuan", "Tuy Phuoc");
		thungThu[4] = new BuuKien("Shikanoko", "Paimon", "eheheheeh", "shikanoko nokonoko koshitantan");
		// liet ke buu pham co trong thung thu
		lietKeBuuPham(thungThu, SLTHU, "all");
		// liet ke thu bao dam
		lietKeBuuPham(thungThu, SLTHU, "bao dam");
		// tong so tien buu pham
		System.out.println("Tong so tien buu pham: "+ tinhtienBuuPham(thungThu, SLTHU, "all"));
		// tong so tien tung loai thu
		System.out.println("Tong so tien thu thuong: "+ tinhtienBuuPham(thungThu, SLTHU, "thuong"));
		System.out.println("Tong so tien thu dam bao: "+ tinhtienBuuPham(thungThu, SLTHU, "bao dam"));
		System.out.println("Tong so tien buu kien: "+ tinhtienBuuPham(thungThu, SLTHU, "buu kien"));
		
	}
}
