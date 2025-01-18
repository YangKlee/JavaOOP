/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 18 thg 1, 2025
*/ 
package model;

import java.util.Date;

public class NhanVienHDDH extends NhanVien{
	private double luongThang;
	
	public NhanVienHDDH(String maNV, String hoTen, Date ngaySinh, double luongThang) {
		super(maNV, hoTen, ngaySinh);
		this.luongThang = luongThang;
	}
	
	public NhanVienHDDH() {
		super();
	}

	@Override
	public double tinhLuong() {
		// tra luong co dinh hang thang;
		return luongThang;
	}

	@Override
	public String loaiNV() {
		return "DH";
	}

	@Override
	public String toString() {
		return "Nhan vien hop dong: \n" + "Ma NV: " + this.maNV + 
				" Ho ten: " + this.hoTen + " Ngay sinh: "+ this.ngaySinh + " Luong thang: " +
				this.luongThang+ " Tien luong: "+ this.tinhLuong();
	}

	public double getLuongThang() {
		return luongThang;
	}

	public void setLuongThang(double luongThang) {
		this.luongThang = luongThang;
	}
	

}
