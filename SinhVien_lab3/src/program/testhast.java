/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 6 thg 1, 2025
*/ 
package program;

import entity.HPDoAn;
import entity.HPLyThuyet;
import entity.HPThucHanh;
import entity.SinhVien;

public class testhast {
	public static void main(String[] args) {
		SinhVien sv2 = new SinhVien("Nguyễn Yến Nhi");
		sv2.themHP(new HPLyThuyet("Toán Logic", 2, 10, 8, 7));
		sv2.themHP(new HPThucHanh("Hệ QT cơ sở dữ liệu", 3, 9.0, 6.0, 8.8,10.0,10.0,10.0,10.0));
		sv2.themHP(new HPDoAn("Ehe", 3, 7.5, 8 , 8, 4, 10));
		System.out.println(sv2.hashCode());
	}
}
