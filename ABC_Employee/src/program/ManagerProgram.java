/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 18 thg 1, 2025
*/ 
package program;

import Manager.QLNhanVien;

public class ManagerProgram {
	public static void main(String[] args) {
		QLNhanVien qlnv = new QLNhanVien();
		qlnv.docFile("src/file/input.txt");
		qlnv.sapXep();
		qlnv.ghiFile("src/file/output.dat");
	}
}
