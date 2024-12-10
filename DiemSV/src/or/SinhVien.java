/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 20 thg 11, 2024
*/ 
package or;

import java.util.ArrayList;

public class SinhVien {
	String hoTen;
	ArrayList<Diem> dsDiem = new ArrayList<Diem>();
	Diem dm;
	public SinhVien(String hoTen, String tenHP, int soTC, float chuyenCan, float giuaKy, float cuoiKy) {
		dm = new Diem(tenHP, soTC, chuyenCan, giuaKy, cuoiKy);
		dsDiem.add(dm);
	}
	double tinhDTB()
	{
		float sum = 0;
		int tongTC = 0;
		for (int i = 0; i < dsDiem.size(); i++)
		{
			sum += dsDiem.get(i).tinhDiem() * (float)dsDiem.get(i).getSoTinChi();
			tongTC += dsDiem.get(i).getSoTinChi();
		}
		return sum / (float)tongTC;
	}

}
