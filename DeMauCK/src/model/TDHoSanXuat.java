/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 15 thg 1, 2025
*/ 
package model;

public class TDHoSanXuat extends TienDien {
	private final int dinhMuc = 200;
	private final double giaTrongDM = 1000;
	private final double giaNgoaiDM = 1500;
	@Override
	
	public double tinhTien() {
		if (soLuong <= dinhMuc)
			return soLuong * giaTrongDM;
		else
		{
			return (dinhMuc * giaTrongDM) + ((soLuong - dinhMuc)*giaNgoaiDM);
		}
	}

	public TDHoSanXuat(String tenKH, int soLuong) {
		super(tenKH, soLuong);
	}

	@Override
	public String loaiTD() {
		return "HSX";
	
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
