/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 15 thg 1, 2025
*/ 
package model;

import java.io.Serializable;

public class TDHoCaNhan extends TienDien{
	private final int dinhMuc = 100;
	private final double giaTrongDM = 500;
	private final double giaNgoaiDM = 800;
	public TDHoCaNhan(String tenKH, int soLuong) {
		super(tenKH, soLuong);
	}
	public TDHoCaNhan() {
		super();
	}
	@Override
	public double tinhTien() {
		if (soLuong <= dinhMuc)
			return soLuong * giaTrongDM;
		else
		{
			return (dinhMuc * giaTrongDM) + ((soLuong - dinhMuc)*giaNgoaiDM);
		}
	}

	@Override
	public String loaiTD() {
		return "CN";
	}
	@Override
	public String toString() {
		return "TDHoCaNhan [tenKH=" + tenKH + ", soLuong=" + soLuong + ", dinhMuc=" + dinhMuc + ", giaTrongDM="
				+ giaTrongDM + ", giaNgoaiDM=" + giaNgoaiDM + ", tinhTien()=" + tinhTien() + "]";
	}

	

}
