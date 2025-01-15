/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 15 thg 1, 2025
*/ 
package model;

import java.io.Serializable;
import java.util.Arrays;

public class TDToChuc extends TienDien {
	private int mucDo;
	private final double giaTrongDM = 400;
	private final double giaNgoaiDM = 1000;
	private final double[] dinhMuc = {1000, 2000, 5000};
	public TDToChuc(String tenKH, int soLuong, int mucDo) {
		super(tenKH, soLuong);
		this.mucDo = mucDo;
	}
	public TDToChuc() {
		super();
	}
	
	public int getMucDo() {
		return mucDo;
	}
	public void setMucDo(int mucDo) {
		this.mucDo = mucDo;
	}
	@Override
	public double tinhTien() {
		if (soLuong <= dinhMuc[mucDo -1])
			return soLuong * giaTrongDM;
		else
		{
			return (dinhMuc[mucDo -1] * giaTrongDM) + ((soLuong - dinhMuc[mucDo -1])*giaNgoaiDM);
		}
	}

	@Override
	public String loaiTD() {
		return "TC";
	}
	@Override
	public String toString() {
		return "TDToChuc [tenKH=" + tenKH + ", soLuong=" + soLuong + ", mucDo=" + mucDo + ", giaTrongDM=" + giaTrongDM
				+ ", giaNgoaiDM=" + giaNgoaiDM + ", dinhMuc=" + Arrays.toString(dinhMuc) + ", tinhTien()=" + tinhTien()
				+ "]";
	}

	

}
