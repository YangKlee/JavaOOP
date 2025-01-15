/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 11 thg 1, 2025
*/ 
package model;

import java.util.Date;

public abstract class Student {
	protected String HoTen;
	protected Date ngaySinh;
	protected String gioiTinh;
	protected String diaChi;
	protected String queQuan;
	protected String soDT;
	protected String email;
	public Student(String hoTen, Date ngaySinh, String gioiTinh, String diaChi, String queQuan, String soDT,
			String email) {
		super();
		HoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.gioiTinh = gioiTinh;
		this.diaChi = diaChi;
		this.queQuan = queQuan;
		this.soDT = soDT;
		this.email = email;
	}
	public Student() {
		super();
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getQueQuan() {
		return queQuan;
	}
	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}
	public String getSoDT() {
		return soDT;
	}
	public void setSoDT(String soDT) {
		this.soDT = soDT;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [HoTen=" + HoTen + ", ngaySinh=" + ngaySinh + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi
				+ ", queQuan=" + queQuan + ", soDT=" + soDT + ", email=" + email + "]";
	}
	
}
