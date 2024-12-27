/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 25 thg 12, 2024
*/ 
package entity;

public class SanPham {
	
	String tenSP;
	int SoLuong;
	double GiaBan;
	double sale = 0;
	public SanPham(String tenSP, int soLuong, double giaBan) {
		super();
		this.tenSP = tenSP;
		SoLuong = soLuong;
		GiaBan = giaBan;
	}
	public SanPham(String tenSP, int soLuong, double giaBan, double sale) {
		super();
		this.tenSP = tenSP;
		SoLuong = soLuong;
		GiaBan = giaBan;
		this.sale = sale;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public int getSoLuong() {
		return SoLuong;
	}
	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}
	public double getGiaBan() {
		return GiaBan;
	}
	public void setGiaBan(int giaBan) {
		GiaBan = giaBan;
	}
	public double getSale() {
		return sale;
	}
	public void setSale(double sale) {
		this.sale = sale;
	}
	
	
}
