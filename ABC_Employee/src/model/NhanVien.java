/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 18 thg 1, 2025
*/ 
package model;

import java.io.Serializable;
import java.util.Date;

public abstract class NhanVien implements ILuong , Serializable {
	protected String maNV;
	protected String hoTen;
	protected Date ngaySinh;
	public NhanVien(String maNV, String hoTen, Date ngaySinh) {
		super();
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
	}
	public NhanVien() {
		super();
	}
	public abstract String loaiNV();
	public abstract String toString();
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	
}
