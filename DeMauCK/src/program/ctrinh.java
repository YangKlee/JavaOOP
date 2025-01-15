/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 15 thg 1, 2025
*/ 
package program;

import model.TDHoCaNhan;
import model.TDHoSanXuat;
import model.TienDien;

public class ctrinh {
	
	public static void main(String[] args) {
		QLDSKH qlds = new QLDSKH();
		if (qlds.docFile("src/file/input.txt"))
		{
			System.out.println("Đọc file thành công!");
		}
		else
		{
			System.out.println("Đọc file thất bại");
		}
		System.out.println("Khách hàng có tiền điện cao nhất: ");
		System.out.println(qlds.timKiemMAX().toString());
		if (qlds.saveFileCN("src/file/output.dat"))
		{
			System.out.println("Lưu dữ liệu khách hàng cá nhân thành công!");
		}
		else
		{
			System.out.println("Lưu dữ liệu khách hàng cá nhân thất bại!");
		}
		TienDien caubosung = new TDHoSanXuat("Nguyễn Văn A", 100);
		qlds.themDTSX((TDHoSanXuat)caubosung);
	}
}
