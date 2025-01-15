/*
	Author: YangKlee - Nguyen Khanh Duong
	Date: 10 thg 1, 2025
*/ 
package model;

import java.util.ArrayList;
import java.util.Date;

public class SinhVien {
	private String maSV;
	private String hoTen;
	private Date ngaySinh;
	private String diaChi;
	private String soDT;
	private String email;
	private ArrayList<Diem> dsDiem = new ArrayList<Diem>();
	public SinhVien(String maSV, String hoTen, Date ngaySinh, String diaChi, String soDT, String email) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
		this.soDT = soDT;
		this.email = email;
	}
	public SinhVien() {};
	public void addDiem(Diem d)
	{
		dsDiem.add(d);
	}
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
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
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
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
	public double tinhDTB()
	{
		double sum = 0;
		for (Diem d: dsDiem)
		{
			sum += d.tinhDiem();
		}
		return sum/(double)dsDiem.size();
	}
	
}
