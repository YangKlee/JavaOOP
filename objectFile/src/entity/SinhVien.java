/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 10 thg 12, 2024
*/ 
package entity;

import java.io.Serializable;

public class SinhVien implements Serializable {
	String hoTen;
	Date ngaySinh;
	double chieuCao;
	double canNang;
	public SinhVien(String hoTen, Date ngaySinh, double chieuCao, double canNang) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.chieuCao = chieuCao;
		this.canNang = canNang;
	}
	public SinhVien(SinhVien sv) {
		this.hoTen = sv.hoTen;
		this.ngaySinh = sv.ngaySinh;
		this.chieuCao = sv.chieuCao;
		this.canNang = sv.canNang;
	}
	@Override
	public String toString() {
		return "SinhVien [hoTen=" + hoTen + ", ngaySinh=" + ngaySinh.toString() + ", chieuCao=" + chieuCao + ", canNang=" + canNang
				+ "]";
	}
	
}
