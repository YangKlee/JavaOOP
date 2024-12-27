/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 16 thg 12, 2024
*/ 
package GUI;
import entity.*;
import service.*;
public class program {
	public static double tinhTienDien(int loaiKH, String giaTriCu, String giaTriMoi) throws valueException
	{
		double oldValue, newValue, result = 0;
		try
		{
			oldValue = Double.parseDouble(giaTriCu);
			newValue = Double.parseDouble(giaTriMoi);
		}
		catch(Exception e)
		{
			throw new valueException("Dữ liệu vào không hợp lệ");
		}
		khachHangDien kh =  null;
		if (loaiKH == 1) // don vi hanh chinh
		{
			kh = new donviHanhChinh(oldValue, newValue);
		}
		else if (loaiKH == 2)
		{
			kh = new donViSanSuat(oldValue, newValue);
		}
		else if (loaiKH == 3)
		{
			kh = new khachHangCaNhan(oldValue, newValue);
		}
		else 
		{
			// ???
		}
		result = kh.tinhTienDien();
		return result;
	}
}
