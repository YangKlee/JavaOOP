/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 6 thg 1, 2025
*/ 
package program;

import entity.DiemHP;
import entity.HPDoAn;
import entity.HPLyThuyet;
import entity.HPThucHanh;
import entity.SinhVien;

public class QLSV implements data {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien("Nguyễn Khánh Dương");
		sv1.themHP(new HPLyThuyet("Lập trình cơ bản", 3, 10, 8, 10));
		sv1.themHP(new HPThucHanh("Thực hành máy tính", 1, 9.0, 6.0, 4.8,10.0,10.0,10.0,10.0));
		sv1.themHP(new HPDoAn("Tài xỉu", 3, 7.5, 8 , 8, 4, 6));
		SinhVien sv2 = new SinhVien("Nguyễn Yến Nhi");
		sv2.themHP(new HPLyThuyet("Toán Logic", 2, 10, 8, 7));
		sv2.themHP(new HPThucHanh("Hệ QT cơ sở dữ liệu", 3, 9.0, 6.0, 8.8,10.0,10.0,10.0,10.0));
		sv2.themHP(new HPDoAn("Ehe", 3, 7.5, 8 , 8, 4, 10));
		SinhVien sv3 = new SinhVien("Nguyễn Phương Quỳnh Hương");
		sv3.themHP(new HPLyThuyet("Tiếng Pháp", 3, 10, 10, 7));
		sv3.themHP(new HPLyThuyet("Đọc 3", 3, 10, 10, 7));
		sv3.themHP(new HPLyThuyet("Viết 3", 3, 10, 10, 7));
		sv3.themHP(new HPThucHanh("Tin học cơ sở", 3, 9.0, 6.0, 8.8,7.0,8.0,8.0,6.0));
		sv3.themHP(new HPDoAn("Dẫn luận ngôn ngữ", 3, 9.5, 8 , 8, 7, 10));
		SinhVien sv4 = new SinhVien("Trịnh Trần Phương Tuấn");
		
		dsSV.add(sv1);
		dsSV.add(sv2);
		dsSV.add(sv3);
		dsSV.add(sv4);
		for (SinhVien sv : dsSV)
		{
			System.out.println("Họ tên: " + sv.getHoTen());
			System.out.println("=Điểm=");
			for (DiemHP diem : sv.getHp())
			{
				System.out.print("Tên HP: " + diem.getTenHP()+", Số TC: " + diem.getSoTinChi() + ", Loại HP: ");
				if (diem.getClass() == HPDoAn.class)
				{
					System.out.print("Đồ án");
				}
				else if (diem.getClass() == HPThucHanh.class)
				{
					System.out.print("Thực hành");
				}
				else if (diem.getClass() == HPLyThuyet.class)
				{
					System.out.print("Lý thuyết");
				}
				else
				{
					System.out.print("Null!!");
				}
				System.out.print(", Điểm HP:" + diem.tinhDiem() + "\n");
			}
			System.out.print("Điểm trung bình SV:" + sv.tinhDTB() + "\n");
		}
	}
}
